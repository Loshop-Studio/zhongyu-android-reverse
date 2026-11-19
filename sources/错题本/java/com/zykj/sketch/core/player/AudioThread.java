package com.zykj.sketch.core.player;

import android.media.MediaPlayer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.core.play.C4330a;
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
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010*\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001f\u0010\u0011J\u001b\u0010\"\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0003R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m5110d2 = {"Lcom/zykj/sketch/core/player/AudioThread;", "Lcom/zykj/sketch/core/player/PlayThread;", "<init>", "()V", "", "getTotalDuration", "()J", "Landroid/media/MediaPlayer;", "it", "Ld6/s;", "resetMediaPlay", "(Landroid/media/MediaPlayer;)V", "stopAllAudio", "", "Lcom/zykj/sketch/core/data/AudioTask;", "list", "initMediaPlayer", "(Ljava/util/List;)V", "progress", "notifyProgress", "(J)V", "run", "startPlay", "waitPlay", "initSeekTo", "resumePlay", "pausePlay", "", RequestParameters.POSITION, "seekTo", "(I)V", "setData", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "playActionListener", "setProgressListener", "reset", "shutdown", "mediaPlayerList", "Ljava/util/List;", "audioTaskList", "", "iterator", "Ljava/util/ListIterator;", "playTime", "J", "currentMediaPlayer", "Landroid/media/MediaPlayer;", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AudioThread extends PlayThread {
    public static final long PERIOD = 40;

    @Nullable
    private MediaPlayer currentMediaPlayer;

    @Nullable
    private ListIterator<AudioTask> iterator;

    @Nullable
    private List<PlayActionListener> playActionListener;
    private long playTime;

    @NotNull
    private final List<MediaPlayer> mediaPlayerList = new ArrayList();

    @NotNull
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
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i8) {
                    return AudioThread.m13855initMediaPlayer$lambda18$lambda13(this.f8156a, mediaPlayer2, i, i8);
                }
            });
            mediaPlayer.setOnSeekCompleteListener(new C4330a(1));
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zykj.sketch.core.player.b
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    AudioThread.m13857initMediaPlayer$lambda18$lambda17(this.f8157a, mediaPlayer2);
                }
            });
            mediaPlayer.prepare();
            this.mediaPlayerList.add(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-13, reason: not valid java name */
    public static final boolean m13855initMediaPlayer$lambda18$lambda13(AudioThread this$0, MediaPlayer mp, int i, int i8) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5329f(mp, "mp");
        this$0.resetMediaPlay(mp);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initMediaPlayer$lambda-18$lambda-17, reason: not valid java name */
    public static final void m13857initMediaPlayer$lambda18$lambda17(AudioThread this$0, MediaPlayer mp) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5329f(mp, "mp");
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
            int i = 0;
            for (Object obj : this.audioTaskList) {
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                AudioTask audioTask = (AudioTask) obj;
                MediaPlayer mediaPlayer = this.mediaPlayerList.get(i);
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(audioTask.getPath());
                    mediaPlayer.prepareAsync();
                }
                i = i8;
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
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
        LogUtils.INSTANCE.m4521e("");
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
                    } catch (Exception e) {
                        e.printStackTrace();
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

    public final void setData(@NotNull List<AudioTask> list) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC5830k.m5330g(list, "list");
        this.audioTaskList.clear();
        this.mediaPlayerList.clear();
        this.audioTaskList.addAll(list);
        initMediaPlayer(list);
    }

    public final void setProgressListener(@NotNull List<PlayActionListener> playActionListener) {
        AbstractC5830k.m5330g(playActionListener, "playActionListener");
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
