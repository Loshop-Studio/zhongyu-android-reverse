package com.xuexiang.xui.widget.imageview.preview.p072ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class VideoPlayerActivity extends AppCompatActivity {
    public static final String KEY_URL = "com.xuexiang.xui.widget.preview.KEY_URL";
    private VideoView mVideoView;

    /* JADX INFO: Access modifiers changed from: private */
    public void recycle() {
        VideoView videoView = this.mVideoView;
        if (videoView != null) {
            videoView.stopPlayback();
        }
    }

    public static void start(Fragment fragment, String str) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) VideoPlayerActivity.class);
        intent.putExtra(KEY_URL, str);
        fragment.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2042R.layout.preview_activity_video_player);
        this.mVideoView = (VideoView) findViewById(C2042R.id.video);
        String stringExtra = getIntent().getStringExtra(KEY_URL);
        if (TextUtils.isEmpty(stringExtra)) {
            Toast.makeText(this, C2042R.string.xui_preview_video_path_error, 0).show();
            finish();
        } else {
            this.mVideoView.setVideoPath(stringExtra);
            this.mVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity.1
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
                    Toast.makeText(VideoPlayerActivity.this, C2042R.string.xui_preview_play_failed, 0).show();
                    return false;
                }
            });
            this.mVideoView.start();
            findViewById(C2042R.id.rl_root).setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    VideoPlayerActivity.this.finish();
                    VideoPlayerActivity.this.recycle();
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        VideoView videoView = this.mVideoView;
        if (videoView != null) {
            videoView.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        VideoView videoView = this.mVideoView;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        this.mVideoView.start();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        if (isFinishing()) {
            recycle();
        }
        super.onStop();
    }
}
