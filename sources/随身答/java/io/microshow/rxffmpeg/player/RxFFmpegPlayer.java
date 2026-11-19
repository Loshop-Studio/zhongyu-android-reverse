package io.microshow.rxffmpeg.player;

import android.text.TextUtils;
import android.view.Surface;
import io.microshow.rxffmpeg.player.IMediaPlayer;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class RxFFmpegPlayer extends BaseMediaPlayer {
    protected boolean looping;
    private Disposable mTimeDisposable;
    protected String path;
    protected int mDuration = 0;
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-player");
    }

    private void cancelTimeDisposable() {
        Disposable disposable = this.mTimeDisposable;
        if (disposable == null || disposable.isDisposed()) {
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

    private native void nativeSeekTo(int i9);

    private native void nativeSetMuteSolo(int i9);

    private native void nativeSetSurface(Surface surface);

    private native void nativeSetVolume(int i9);

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
            Disposable disposableSubscribe = Flowable.timer(500L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.m13203io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: io.microshow.rxffmpeg.player.RxFFmpegPlayer.1
                @Override // io.reactivex.functions.Consumer
                public void accept(Long l9) throws Exception {
                    RxFFmpegPlayer rxFFmpegPlayer = RxFFmpegPlayer.this;
                    rxFFmpegPlayer.play(rxFFmpegPlayer.path, rxFFmpegPlayer.looping);
                }
            });
            this.mTimeDisposable = disposableSubscribe;
            this.mCompositeDisposable.add(disposableSubscribe);
        }
    }

    public void onErrorNative(int i9, String str) {
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        if (onErrorListener != null) {
            onErrorListener.onError(this, i9, str);
        }
    }

    public void onLoadingNative(boolean z9) {
        IMediaPlayer.OnLoadingListener onLoadingListener = this.mOnLoadingListener;
        if (onLoadingListener != null) {
            onLoadingListener.onLoading(this, z9);
        }
    }

    public void onPreparedNative() {
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this);
        }
    }

    public void onTimeUpdateNative(int i9, int i10) {
        IMediaPlayer.OnTimeUpdateListener onTimeUpdateListener = this.mOnTimeUpdateListener;
        if (onTimeUpdateListener != null) {
            this.mDuration = i10;
            onTimeUpdateListener.onTimeUpdate(this, i9, i10);
        }
    }

    public void onVideoSizeChangedNative(int i9, int i10, float f10) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this, i9, i10, f10);
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
        CompositeDisposable compositeDisposable = this.mCompositeDisposable;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
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
    public void seekTo(int i9) {
        nativeSeekTo(i9);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setDataSource(String str) {
        this.path = str;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setLooping(boolean z9) {
        this.looping = z9;
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setMuteSolo(int i9) {
        nativeSetMuteSolo(i9);
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setSurface(Surface surface) {
        if (surface != null) {
            nativeSetSurface(surface);
        }
    }

    @Override // io.microshow.rxffmpeg.player.IMediaPlayer
    public void setVolume(int i9) {
        nativeSetVolume(i9);
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
