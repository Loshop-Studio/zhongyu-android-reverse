package io.microshow.rxffmpeg.player;

import android.view.Surface;

/* loaded from: classes5.dex */
public interface IMediaPlayer {

    public interface OnCompletionListener {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    public interface OnErrorListener {
        void onError(IMediaPlayer iMediaPlayer, int i10, String str);
    }

    public interface OnLoadingListener {
        void onLoading(IMediaPlayer iMediaPlayer, boolean z9);
    }

    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    public interface OnTimeUpdateListener {
        void onTimeUpdate(IMediaPlayer iMediaPlayer, int i10, int i11);
    }

    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, float f10);
    }

    int getDuration();

    int getMuteSolo();

    int getVolume();

    boolean isLooping();

    boolean isPlaying();

    void pause();

    void prepare();

    void release();

    void resume();

    void seekTo(int i10);

    void setDataSource(String str);

    void setLooping(boolean z9);

    void setMuteSolo(int i10);

    void setSurface(Surface surface);

    void setVolume(int i10);

    void start();

    void stop();
}
