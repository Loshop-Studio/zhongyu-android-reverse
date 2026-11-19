package io.microshow.rxffmpeg.player;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.Surface;
import io.microshow.rxffmpeg.player.IMediaPlayer;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p112g7.AbstractC8655a;
import p244s6.AbstractC10045b;
import p266u6.AbstractC10198a;
import p277v6.C10249a;
import p277v6.InterfaceC10250b;
import p299x6.InterfaceC10555c;

/* loaded from: classes5.dex */
public abstract class SystemMediaPlayer extends BaseMediaPlayer {
    private InterfaceC10250b mTimeUpdateDisposable;
    protected String path;
    public int volumePercent = -1;
    public MediaPlayer mMediaPlayer = new MediaPlayer();
    private C10249a mCompositeDisposable = new C10249a();

    private void cancelTimeUpdateDisposable() {
        InterfaceC10250b interfaceC10250b = this.mTimeUpdateDisposable;
        if (interfaceC10250b == null || interfaceC10250b.isDisposed()) {
            return;
        }
        this.mTimeUpdateDisposable.dispose();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getMuteSolo() {
        return 0;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getVolume() {
        return this.volumePercent;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public boolean isLooping() {
        return this.mMediaPlayer.isLooping();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        this.mMediaPlayer.pause();
        cancelTimeUpdateDisposable();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void prepare() {
        this.mMediaPlayer.prepareAsync();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void release() {
        setOnPreparedListener(null);
        setOnVideoSizeChangedListener(null);
        setOnLoadingListener(null);
        setOnTimeUpdateListener(null);
        setOnErrorListener(null);
        setOnCompleteListener(null);
        cancelTimeUpdateDisposable();
        C10249a c10249a = this.mCompositeDisposable;
        if (c10249a != null) {
            c10249a.m19203d();
            this.mCompositeDisposable = null;
        }
        this.mMediaPlayer.release();
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void repeatPlay() {
        play(this.path, this.mMediaPlayer.isLooping());
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void resume() {
        start();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void seekTo(int i10) throws IllegalStateException {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mMediaPlayer.seekTo(i10, 3);
        } else {
            this.mMediaPlayer.seekTo(i10);
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setDataSource(String str) {
        try {
            this.path = str;
            this.mMediaPlayer.setDataSource(str);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setLooping(boolean z10) {
        this.mMediaPlayer.setLooping(z10);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setMuteSolo(int i10) {
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnCompleteListener(final IMediaPlayer.OnCompletionListener onCompletionListener) {
        super.setOnCompleteListener(onCompletionListener);
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                IMediaPlayer.OnCompletionListener onCompletionListener2 = onCompletionListener;
                if (onCompletionListener2 != null) {
                    onCompletionListener2.onCompletion(SystemMediaPlayer.this);
                }
            }
        });
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnErrorListener(final IMediaPlayer.OnErrorListener onErrorListener) {
        super.setOnErrorListener(onErrorListener);
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                IMediaPlayer.OnErrorListener onErrorListener2 = onErrorListener;
                if (onErrorListener2 == null || i10 == -38) {
                    return true;
                }
                onErrorListener2.onError(SystemMediaPlayer.this, i10, i11 + "");
                return true;
            }
        });
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnLoadingListener(IMediaPlayer.OnLoadingListener onLoadingListener) {
        super.setOnLoadingListener(onLoadingListener);
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnPreparedListener(final IMediaPlayer.OnPreparedListener onPreparedListener) {
        super.setOnPreparedListener(onPreparedListener);
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                IMediaPlayer.OnPreparedListener onPreparedListener2 = onPreparedListener;
                if (onPreparedListener2 != null) {
                    onPreparedListener2.onPrepared(SystemMediaPlayer.this);
                }
            }
        });
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnTimeUpdateListener(IMediaPlayer.OnTimeUpdateListener onTimeUpdateListener) {
        super.setOnTimeUpdateListener(onTimeUpdateListener);
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.5
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
                if (i10 == 3 || i10 == 700) {
                    SystemMediaPlayer systemMediaPlayer = SystemMediaPlayer.this;
                    IMediaPlayer.OnLoadingListener onLoadingListener = systemMediaPlayer.mOnLoadingListener;
                    if (onLoadingListener != null) {
                        onLoadingListener.onLoading(systemMediaPlayer, false);
                    }
                    return true;
                }
                if (i10 != 701) {
                    return false;
                }
                SystemMediaPlayer systemMediaPlayer2 = SystemMediaPlayer.this;
                IMediaPlayer.OnLoadingListener onLoadingListener2 = systemMediaPlayer2.mOnLoadingListener;
                if (onLoadingListener2 != null) {
                    onLoadingListener2.onLoading(systemMediaPlayer2, true);
                }
                return true;
            }
        });
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void setOnVideoSizeChangedListener(final IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        super.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        this.mMediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.2
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener2 = onVideoSizeChangedListener;
                if (onVideoSizeChangedListener2 != null) {
                    onVideoSizeChangedListener2.onVideoSizeChanged(SystemMediaPlayer.this, i10, i11, i10 / i11);
                }
            }
        });
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setSurface(Surface surface) {
        if (surface != null) {
            this.mMediaPlayer.setSurface(surface);
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setVolume(int i10) {
        this.volumePercent = i10;
        float f10 = i10 / 100.0f;
        this.mMediaPlayer.setVolume(f10, f10);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void start() {
        this.mMediaPlayer.start();
        startTimeUpdateDisposable();
    }

    public void startTimeUpdateDisposable() {
        cancelTimeUpdateDisposable();
        InterfaceC10250b interfaceC10250bM18748h = AbstractC10045b.m18743e(200L, TimeUnit.MILLISECONDS).m18751l(AbstractC8655a.m13934b()).m18746f(AbstractC10198a.m19069a()).m18748h(new InterfaceC10555c() { // from class: io.microshow.rxffmpeg.player.SystemMediaPlayer.6
            @Override // p299x6.InterfaceC10555c
            public void accept(Long l10) {
                SystemMediaPlayer systemMediaPlayer = SystemMediaPlayer.this;
                IMediaPlayer.OnTimeUpdateListener onTimeUpdateListener = systemMediaPlayer.mOnTimeUpdateListener;
                if (onTimeUpdateListener != null) {
                    onTimeUpdateListener.onTimeUpdate(systemMediaPlayer, systemMediaPlayer.mMediaPlayer.getCurrentPosition() / 1000, SystemMediaPlayer.this.getDuration() / 1000);
                }
            }
        });
        this.mTimeUpdateDisposable = interfaceC10250bM18748h;
        this.mCompositeDisposable.mo19201b(interfaceC10250bM18748h);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        this.mMediaPlayer.stop();
    }
}
