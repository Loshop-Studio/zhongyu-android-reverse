package com.zykj.paint.render;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zykj.paint.Actions;
import com.zykj.paint.C7018R;
import com.zykj.paint.player.PlayActionListener;
import com.zykj.paint.player.PlayStatusListener;
import com.zykj.paint.util.TimeUtils;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public class SketchPlayer extends FrameLayout {
    private static final int SPEAKER_OFF = 1;
    private static final int SPEAKER_ON = 0;
    private static final String TAG = "SketchPlayer";
    private ImageView conrtolImageView;
    private RelativeLayout controlBarLayout;
    private HeadsetPlugReceiver headsetPlugReceiver;
    private boolean isPause;
    private boolean isPauseBeforeSeekAction;
    private List<Actions.EzyAction> mActionList;
    private MediaPlayer mediaPlayer;
    private String path;
    private PlayActionListener playActionListener;
    private SeekBar seekBar;
    private SketchViewer sketchViewer;
    private String sourceUrl;
    private TextView tvEndTime;
    private TextView tvLessonRecord;
    private TextView tvStartTime;

    public class HeadsetPlugReceiver extends BroadcastReceiver {
        private AudioManager audioManager;

        public HeadsetPlugReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.audioManager = (AudioManager) context.getSystemService("audio");
            if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra == 0) {
                    this.audioManager.setSpeakerphoneOn(true);
                } else if (intExtra == 1) {
                    this.audioManager.setSpeakerphoneOn(false);
                }
            }
        }
    }

    public SketchPlayer(@NonNull Context context) {
        super(context);
        init(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTotalTime(List<Actions.EzyAction> list) {
        Actions.EzyAction ezyAction = list.get(list.size() - 1);
        return ezyAction.getStartAt() + ezyAction.getDuration();
    }

    private void init(@NonNull Context context) {
        Log.e(TAG, "init...");
        View viewInflate = LayoutInflater.from(context).inflate(C7018R.layout.view_sketch_player, this);
        this.controlBarLayout = (RelativeLayout) findViewById(C7018R.id.control_bar);
        this.tvStartTime = (TextView) viewInflate.findViewById(C7018R.id.tv_start_time);
        this.tvEndTime = (TextView) viewInflate.findViewById(C7018R.id.tv_end_time);
        TextView textView = (TextView) viewInflate.findViewById(C7018R.id.tv_lesson_record);
        this.tvLessonRecord = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zykj.paint.render.SketchPlayer.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SketchPlayer.this.playActionListener.onRerecord();
            }
        });
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(C7018R.id.seek_bar_music);
        this.seekBar = seekBar;
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.zykj.paint.render.SketchPlayer.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i10, boolean z9) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) throws IllegalStateException {
                SketchPlayer sketchPlayer = SketchPlayer.this;
                sketchPlayer.isPauseBeforeSeekAction = sketchPlayer.isPause;
                if (SketchPlayer.this.isPause) {
                    return;
                }
                SketchPlayer.this.pausePlayer();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
                int iSeekToCurrentIndex = (int) SketchPlayer.this.sketchViewer.seekToCurrentIndex(seekBar2.getProgress());
                SketchPlayer.this.tvStartTime.setText(TimeUtils.formatTime(iSeekToCurrentIndex));
                if (SketchPlayer.this.mediaPlayer != null) {
                    SketchPlayer.this.mediaPlayer.seekTo(iSeekToCurrentIndex);
                }
                if (SketchPlayer.this.isPauseBeforeSeekAction || SketchPlayer.this.sketchViewer.isEnded(seekBar2.getProgress())) {
                    return;
                }
                SketchPlayer.this.resumePlayer();
            }
        });
        SketchViewer sketchViewer = (SketchViewer) viewInflate.findViewById(C7018R.id.mapViewer);
        this.sketchViewer = sketchViewer;
        sketchViewer.setPlayStatusListener(new PlayStatusListener() { // from class: com.zykj.paint.render.SketchPlayer.3
            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayEnd() throws IllegalStateException {
                SketchPlayer.this.pausePlayer();
                SketchPlayer.this.sketchViewer.reset();
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayPause() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onPlayStart() {
            }

            @Override // com.zykj.paint.player.PlayStatusListener
            public void onUpdate(long j10) {
                int i10 = (int) j10;
                SketchPlayer.this.seekBar.setProgress(i10);
                SketchPlayer.this.tvStartTime.setText(TimeUtils.formatTime(i10));
            }
        });
        ImageView imageView = (ImageView) viewInflate.findViewById(C7018R.id.img_music_control);
        this.conrtolImageView = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zykj.paint.render.SketchPlayer.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws IllegalStateException {
                SketchPlayer sketchPlayer = SketchPlayer.this;
                int totalTime = sketchPlayer.getTotalTime(sketchPlayer.mActionList);
                Log.i(SketchPlayer.TAG, "totalTime--->>>" + totalTime);
                if (totalTime <= 0 || SketchPlayer.this.playActionListener == null) {
                    return;
                }
                if (SketchPlayer.this.isPause) {
                    SketchPlayer.this.resumePlayer();
                } else {
                    SketchPlayer.this.pausePlayer();
                }
            }
        });
    }

    private void playMusic() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (this.mediaPlayer == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.mediaPlayer = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
        }
        this.mediaPlayer.stop();
        try {
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(this.path);
            this.mediaPlayer.prepareAsync();
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.zykj.paint.render.SketchPlayer.5
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer2) throws IllegalStateException {
                    SketchPlayer.this.mediaPlayer.start();
                    SketchPlayer.this.mediaPlayer.setVolume(1.0f, 1.0f);
                }
            });
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private void playWithLocalSource() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.isPause = false;
        this.conrtolImageView.setImageResource(C7018R.drawable.selector_btn_music_pause);
        int totalTime = getTotalTime(this.mActionList);
        Log.i(TAG, "totalTime--->>>" + totalTime);
        this.seekBar.setMax(totalTime);
        this.tvEndTime.setText(TimeUtils.formatTime(totalTime));
        this.sketchViewer.setDataSource(this.mActionList, this.sourceUrl);
    }

    public void destroyPlayer() throws IllegalStateException {
        this.isPause = true;
        SketchViewer sketchViewer = this.sketchViewer;
        if (sketchViewer != null) {
            sketchViewer.release();
            this.sketchViewer = null;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public Bitmap getSnapshot() {
        return this.sketchViewer.getCapture();
    }

    public void hideSeekBar() {
        this.conrtolImageView.setVisibility(4);
        this.tvStartTime.setVisibility(4);
        this.tvEndTime.setVisibility(4);
        this.seekBar.setVisibility(4);
    }

    public void pausePlayer() throws IllegalStateException {
        this.isPause = true;
        this.conrtolImageView.setImageResource(C7018R.drawable.selector_btn_music_play);
        SketchViewer sketchViewer = this.sketchViewer;
        if (sketchViewer != null) {
            sketchViewer.pause();
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        this.playActionListener.onPause();
    }

    public void play(List<Actions.EzyAction> list, String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.sourceUrl = str;
        this.mActionList = list;
        playWithLocalSource();
    }

    public void registerHeadsetPlugReceiver(Context context) {
        this.headsetPlugReceiver = new HeadsetPlugReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        context.registerReceiver(this.headsetPlugReceiver, intentFilter);
    }

    public void releaseCacheBitmap() {
        this.sketchViewer.destroyDrawingCache();
    }

    public void resumePlayer() throws IllegalStateException {
        this.isPause = false;
        this.conrtolImageView.setImageResource(C7018R.drawable.selector_btn_music_pause);
        SketchViewer sketchViewer = this.sketchViewer;
        if (sketchViewer != null) {
            sketchViewer.resume();
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
        this.playActionListener.onResume();
    }

    public void setPlayActionListener(PlayActionListener playActionListener) {
        this.playActionListener = playActionListener;
    }

    public void showSeekBar() {
        this.conrtolImageView.setVisibility(0);
        this.tvStartTime.setVisibility(0);
        this.tvEndTime.setVisibility(0);
        this.seekBar.setVisibility(0);
    }

    public void startMusic(String str) {
        this.path = str;
    }

    public void unRegisterHeadsetReceiver(Context context) {
        HeadsetPlugReceiver headsetPlugReceiver = this.headsetPlugReceiver;
        if (headsetPlugReceiver != null) {
            context.unregisterReceiver(headsetPlugReceiver);
        }
    }

    public SketchPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SketchPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
