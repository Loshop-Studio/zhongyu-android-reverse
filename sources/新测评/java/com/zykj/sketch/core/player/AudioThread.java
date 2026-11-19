package com.zykj.sketch.core.player;

import android.media.MediaPlayer;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.PlayActionListener;
import com.zykj.sketch.utils.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010 \u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m13558d2 = {"Lcom/zykj/sketch/core/player/AudioThread;", "Lcom/zykj/sketch/core/player/PlayThread;", "()V", "audioTaskList", "", "Lcom/zykj/sketch/core/data/AudioTask;", "currentMediaPlayer", "Landroid/media/MediaPlayer;", "iterator", "", "mediaPlayerList", "playActionListener", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "playTime", "", "getTotalDuration", "initMediaPlayer", "", "list", "initSeekTo", "notifyProgress", "progress", "pausePlay", "reset", "resetMediaPlay", "it", "resumePlay", "run", "seekTo", RequestParameters.POSITION, "", "setData", "setProgressListener", "shutdown", "startPlay", "stopAllAudio", "waitPlay", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class AudioThread extends PlayThread {
    public static final long PERIOD = 40;
    private MediaPlayer currentMediaPlayer;
    private ListIterator<AudioTask> iterator;
    private List<PlayActionListener> playActionListener;
    private long playTime;
    private final List<MediaPlayer> mediaPlayerList = new ArrayList();
    private List<AudioTask> audioTaskList = new ArrayList();

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
                    return AudioThread.m24262initMediaPlayer$lambda18$lambda13(this.f10747a, mediaPlayer2, i10, i11);
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
                    AudioThread.m24264initMediaPlayer$lambda18$lambda17(this.f10748a, mediaPlayer2);
                }
            });
            mediaPlayer.prepare();
            this.mediaPlayerList.add(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-13, reason: not valid java name */
    public static final boolean m24262initMediaPlayer$lambda18$lambda13(AudioThread this$0, MediaPlayer mp, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(mp, "mp");
        this$0.resetMediaPlay(mp);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-17, reason: not valid java name */
    public static final void m24264initMediaPlayer$lambda18$lambda17(AudioThread this$0, MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(mp, "mp");
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

    private final void notifyProgress(long progress) {
        long totalDuration = getPlayStatus() == PlayStatus.RECORD_END ? getTotalDuration() : progress;
        if (getTotalDuration() < progress) {
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

    private final synchronized void resetMediaPlay(MediaPlayer it) {
        try {
            int iIndexOf = this.mediaPlayerList.indexOf(it);
            if (it.isPlaying()) {
                it.stop();
            }
            if (iIndexOf > -1) {
                AudioTask audioTask = this.audioTaskList.get(iIndexOf);
                it.reset();
                it.setDataSource(audioTask.getPath());
                try {
                    it.prepare();
                } catch (IllegalStateException unused) {
                    it.reset();
                    it.setDataSource(audioTask.getPath());
                    it.prepare();
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
                    CollectionsKt.throwIndexOverflow();
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
        LogUtils.INSTANCE.m10647e("");
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

    public final void seekTo(int position) {
        this.playTime = position;
    }

    public final void setData(List<AudioTask> list) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(list, "list");
        this.audioTaskList.clear();
        this.mediaPlayerList.clear();
        this.audioTaskList.addAll(list);
        initMediaPlayer(list);
    }

    public final void setProgressListener(List<PlayActionListener> playActionListener) {
        Intrinsics.checkNotNullParameter(playActionListener, "playActionListener");
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
