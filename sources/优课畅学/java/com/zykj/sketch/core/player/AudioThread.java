package com.zykj.sketch.core.player;

import android.media.MediaPlayer;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.utils.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class AudioThread extends PlayThread {
    public static final Companion Companion = new Companion(null);
    public static final long PERIOD = 40;
    private MediaPlayer currentMediaPlayer;
    private ListIterator<AudioTask> iterator;
    private List<PlayActionListener> playActionListener;
    private long playTime;
    private final List<MediaPlayer> mediaPlayerList = new ArrayList();
    private List<AudioTask> audioTaskList = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    private final long getTotalDuration() {
        long duration = 0;
        while (this.audioTaskList.iterator().hasNext()) {
            duration += ((AudioTask) r0.next()).getDuration();
        }
        return duration;
    }

    private final void initMediaPlayer(List<AudioTask> list) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.mediaPlayerList.clear();
        for (AudioTask audioTask : list) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(audioTask.getPath());
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.zykj.sketch.core.player.a
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                    return AudioThread.m27514initMediaPlayer$lambda18$lambda13(this.f10620a, mediaPlayer2, i10, i11);
                }
            });
            mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.zykj.sketch.core.player.b
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer2) throws IllegalStateException {
                    mediaPlayer2.start();
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zykj.sketch.core.player.c
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    AudioThread.m27516initMediaPlayer$lambda18$lambda17(this.f10621a, mediaPlayer2);
                }
            });
            mediaPlayer.prepare();
            this.mediaPlayerList.add(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-13, reason: not valid java name */
    public static final boolean m27514initMediaPlayer$lambda18$lambda13(AudioThread this$0, MediaPlayer mp, int i10, int i11) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16132f(mp, "mp");
        this$0.resetMediaPlay(mp);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-17, reason: not valid java name */
    public static final void m27516initMediaPlayer$lambda18$lambda17(AudioThread this$0, MediaPlayer mp) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16132f(mp, "mp");
        this$0.resetMediaPlay(mp);
        ListIterator<AudioTask> listIterator = this$0.iterator;
        if (listIterator == null || listIterator.hasNext()) {
            return;
        }
        MediaPlayer mediaPlayer = this$0.currentMediaPlayer;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            this$0.stopPlay();
            this$0.notifyProgress(this$0.getTotalDuration());
            List<PlayActionListener> list = this$0.playActionListener;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((PlayActionListener) it.next()).onPlayEnd();
                }
            }
        }
    }

    private final void notifyProgress(long j10) {
        long totalDuration = getPlayStatus() == PlayStatus.RECORD_END ? getTotalDuration() : j10;
        if (getTotalDuration() < j10) {
            totalDuration = getTotalDuration();
        }
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayActionListener) it.next()).onProgress(totalDuration);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private final synchronized void resetMediaPlay(MediaPlayer mediaPlayer) {
        try {
            int iIndexOf = this.mediaPlayerList.indexOf(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            if (iIndexOf > -1) {
                AudioTask audioTask = this.audioTaskList.get(iIndexOf);
                mediaPlayer.reset();
                mediaPlayer.setDataSource(audioTask.getPath());
                try {
                    mediaPlayer.prepare();
                } catch (IllegalStateException unused) {
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(audioTask.getPath());
                    mediaPlayer.prepare();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void stopAllAudio() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        try {
            int i10 = 0;
            for (Object obj : this.audioTaskList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
                }
                AudioTask audioTask = (AudioTask) obj;
                MediaPlayer mediaPlayer = this.mediaPlayerList.get(i10);
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(audioTask.getPath());
                    mediaPlayer.prepareAsync();
                }
                i10 = i11;
            }
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
    }

    public final void initSeekTo() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.iterator = this.audioTaskList.listIterator();
        MediaPlayer mediaPlayer = this.currentMediaPlayer;
        if (mediaPlayer != null) {
            resetMediaPlay(mediaPlayer);
        }
        stopAllAudio();
        ListIterator<AudioTask> listIterator = this.iterator;
        if (listIterator != null) {
            while (listIterator.hasNext()) {
                AudioTask next = listIterator.next();
                if (this.playTime < next.getStartTime()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    if (listIterator.hasPrevious()) {
                        next = listIterator.previous();
                    }
                    MediaPlayer mediaPlayer2 = this.mediaPlayerList.get(this.audioTaskList.indexOf(next));
                    this.currentMediaPlayer = mediaPlayer2;
                    resetMediaPlay(mediaPlayer2);
                    mediaPlayer2.seekTo((int) (this.playTime - next.getStartTime()));
                    if (listIterator.hasNext()) {
                        listIterator.next();
                        return;
                    }
                    return;
                }
            }
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void pausePlay() {
        super.pausePlay();
        MediaPlayer mediaPlayer = this.currentMediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying() && (getPlayStatus() == PlayStatus.RECORD_PAUSE || getPlayStatus() == PlayStatus.RECORD_WAIT)) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayPause();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public synchronized void reset() {
        pausePlay();
        try {
            for (MediaPlayer mediaPlayer : this.mediaPlayerList) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.iterator = this.audioTaskList.listIterator();
        initMediaPlayer(this.audioTaskList);
        this.currentMediaPlayer = null;
        super.reset();
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void resumePlay() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        LogUtils.Companion.m9791e("");
        initSeekTo();
        super.resumePlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayStart();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IllegalStateException {
        if (getPlayStatus() == PlayStatus.RECORD_PAUSE || getPlayStatus() == PlayStatus.RECORD_WAIT) {
            return;
        }
        if (getPlayStatus() == PlayStatus.RECORD_END) {
            this.playTime = 0L;
            return;
        }
        ListIterator<AudioTask> listIterator = this.iterator;
        if (listIterator != null) {
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                if (getPlayStatus() == PlayStatus.RECORD_PAUSE || getPlayStatus() == PlayStatus.RECORD_WAIT || getPlayStatus() == PlayStatus.RECORD_END) {
                    return;
                }
                AudioTask next = listIterator.next();
                if (next.getStartTime() <= this.playTime) {
                    try {
                        MediaPlayer mediaPlayer = this.mediaPlayerList.get(listIterator.nextIndex() - 1);
                        this.currentMediaPlayer = mediaPlayer;
                        if (mediaPlayer != null) {
                            resetMediaPlay(mediaPlayer);
                        }
                        MediaPlayer mediaPlayer2 = this.currentMediaPlayer;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.seekTo((int) (this.playTime - next.getStartTime()));
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
            }
        }
        notifyProgress(this.playTime);
        this.playTime += 40;
    }

    public final void seekTo(int i10) {
        this.playTime = i10;
    }

    public final void setData(List<AudioTask> list) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(list, "list");
        this.audioTaskList.clear();
        this.mediaPlayerList.clear();
        this.audioTaskList.addAll(list);
        initMediaPlayer(list);
    }

    public final void setProgressListener(List<PlayActionListener> playActionListener) {
        AbstractC9133u.m16133g(playActionListener, "playActionListener");
        this.playActionListener = playActionListener;
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public synchronized void shutdown() {
        super.shutdown();
        pausePlay();
        try {
            this.audioTaskList.clear();
            for (MediaPlayer mediaPlayer : this.mediaPlayerList) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            this.mediaPlayerList.clear();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.currentMediaPlayer = null;
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void startPlay() {
        super.startPlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayStart();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void waitPlay() {
        super.waitPlay();
        MediaPlayer mediaPlayer = this.currentMediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying() && (getPlayStatus() == PlayStatus.RECORD_PAUSE || getPlayStatus() == PlayStatus.RECORD_WAIT)) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onWaitPlay();
            }
        }
    }
}
