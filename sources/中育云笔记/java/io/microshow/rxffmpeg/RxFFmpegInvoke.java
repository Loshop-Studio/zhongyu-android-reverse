package io.microshow.rxffmpeg;

/* loaded from: classes6.dex */
public class RxFFmpegInvoke {
    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-invoke");
    }

    public native void exit();

    public native String getMediaInfo(String str);

    public native int runFFmpegCmd(String[] strArr);

    public native void setDebug(boolean z10);
}
