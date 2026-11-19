package io.microshow.rxffmpeg;

import com.zykj.blackboard.utils.AudioUtils$audioCut$i$1;

/* loaded from: classes3.dex */
public class RxFFmpegInvoke {

    /* renamed from: b */
    public static volatile RxFFmpegInvoke f8870b;

    /* renamed from: a */
    public AudioUtils$audioCut$i$1 f8871a;

    static {
        System.loadLibrary("rxffmpeg-core");
        System.loadLibrary("rxffmpeg-invoke");
    }

    public native int runFFmpegCmd(String[] strArr);
}
