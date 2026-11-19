package io.microshow.rxffmpeg.player;

import android.text.TextUtils;
import android.view.Surface;
import io.microshow.rxffmpeg.player.IMediaPlayer;
import java.util.concurrent.TimeUnit;
import p112g7.AbstractC8655a;
import p244s6.AbstractC10045b;
import p266u6.AbstractC10198a;
import p277v6.C10249a;
import p277v6.InterfaceC10250b;
import p299x6.InterfaceC10555c;

/* loaded from: classes5.dex */
public abstract class RxFFmpegPlayer extends BaseMediaPlayer {
    protected boolean looping;
    private InterfaceC10250b mTimeDisposable;
    protected String path;
    protected int mDuration = 0;
    private C10249a mCompositeDisposable = new C10249a();

    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-player");
    }

    private void cancelTimeDisposable() {
        InterfaceC10250b interfaceC10250b = this.mTimeDisposable;
        if (interfaceC10250b == null || interfaceC10250b.isDisposed()) {
            return;
        }
        this.mTimeDisposable.dispose();
    }

    private native int nativeGetMuteSolo();

    private native int nativeGetVolume();

    private native boolean nativeIsPlaying();

    private native void nativePause();

    private native void nativePrepare(String str);

    private native void nativeRelease();

    private native void nativeResume();

    private native void nativeSeekTo(int i10);

    private native void nativeSetMuteSolo(int i10);

    private native void nativeSetSurface(Surface surface);

    private native void nativeSetVolume(int i10);

    private native void nativeStart();

    private native void nativeStop();

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getDuration() {
        return this.mDuration;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getMuteSolo() {
        return nativeGetMuteSolo();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public int getVolume() {
        return nativeGetVolume();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public boolean isLooping() {
        return this.looping;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public boolean isPlaying() {
        return nativeIsPlaying();
    }

    public void onCompletionNative() {
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this);
        }
        if (isLooping()) {
            InterfaceC10250b interfaceC10250bM18748h = AbstractC10045b.m18744n(500L, TimeUnit.MILLISECONDS).m18751l(AbstractC8655a.m13934b()).m18746f(AbstractC10198a.m19069a()).m18748h(new InterfaceC10555c() { // from class: io.microshow.rxffmpeg.player.RxFFmpegPlayer.1
                @Override // p299x6.InterfaceC10555c
                public void accept(Long l10) {
                    RxFFmpegPlayer rxFFmpegPlayer = RxFFmpegPlayer.this;
                    rxFFmpegPlayer.play(rxFFmpegPlayer.path, rxFFmpegPlayer.looping);
                }
            });
            this.mTimeDisposable = interfaceC10250bM18748h;
            this.mCompositeDisposable.mo19201b(interfaceC10250bM18748h);
        }
    }

    public void onErrorNative(int i10, String str) {
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        if (onErrorListener != null) {
            onErrorListener.onError(this, i10, str);
        }
    }

    public void onLoadingNative(boolean z10) {
        IMediaPlayer.OnLoadingListener onLoadingListener = this.mOnLoadingListener;
        if (onLoadingListener != null) {
            onLoadingListener.onLoading(this, z10);
        }
    }

    public void onPreparedNative() {
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this);
        }
    }

    public void onTimeUpdateNative(int i10, int i11) {
        IMediaPlayer.OnTimeUpdateListener onTimeUpdateListener = this.mOnTimeUpdateListener;
        if (onTimeUpdateListener != null) {
            this.mDuration = i11;
            onTimeUpdateListener.onTimeUpdate(this, i10, i11);
        }
    }

    public void onVideoSizeChangedNative(int i10, int i11, float f10) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this, i10, i11, f10);
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void pause() {
        nativePause();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void prepare() {
        if (TextUtils.isEmpty(this.path)) {
            return;
        }
        nativePrepare(this.path);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void release() {
        setOnPreparedListener(null);
        setOnVideoSizeChangedListener(null);
        setOnLoadingListener(null);
        setOnTimeUpdateListener(null);
        setOnErrorListener(null);
        setOnCompleteListener(null);
        C10249a c10249a = this.mCompositeDisposable;
        if (c10249a != null) {
            c10249a.m19203d();
            this.mCompositeDisposable = null;
        }
        nativeRelease();
    }

    @Override // io.microshow.rxffmpeg.player.BaseMediaPlayer
    public void repeatPlay() {
        play(this.path, this.looping);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void resume() {
        nativeResume();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void seekTo(int i10) {
        nativeSeekTo(i10);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setDataSource(String str) {
        this.path = str;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setLooping(boolean z10) {
        this.looping = z10;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setMuteSolo(int i10) {
        nativeSetMuteSolo(i10);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setSurface(Surface surface) {
        if (surface != null) {
            nativeSetSurface(surface);
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setVolume(int i10) {
        nativeSetVolume(i10);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void start() {
        if (TextUtils.isEmpty(this.path)) {
            return;
        }
        nativeStart();
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void stop() {
        cancelTimeDisposable();
        nativeStop();
    }
}
