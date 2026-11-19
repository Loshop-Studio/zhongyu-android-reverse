package io.microshow.rxffmpeg.player;

import android.view.Surface;

/* loaded from: classes6.dex */
public abstract class RxFFmpegPlayer extends AbstractC9644a {

    /* renamed from: e */
    public String f22176e;

    /* renamed from: f */
    public int f22177f;

    /* renamed from: g */
    public boolean f22178g;

    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-player");
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

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    /* renamed from: a */
    public int mo18898a() {
        return nativeGetMuteSolo();
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    /* renamed from: b */
    public int mo18899b() {
        return nativeGetVolume();
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    /* renamed from: c */
    public void mo18900c(int i10) {
        nativeSetVolume(i10);
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    /* renamed from: d */
    public void mo18901d(int i10) {
        nativeSetMuteSolo(i10);
    }

    @Override // io.microshow.rxffmpeg.player.AbstractC9644a
    /* renamed from: f */
    public void mo18902f() {
        m18928e(this.f22176e, this.f22178g);
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    public int getDuration() {
        return this.f22177f;
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    public boolean isPlaying() {
        return nativeIsPlaying();
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    public void pause() {
        nativePause();
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    public void resume() {
        nativeResume();
    }

    @Override // io.microshow.rxffmpeg.player.InterfaceC9645b
    public void seekTo(int i10) {
        nativeSeekTo(i10);
    }
}
