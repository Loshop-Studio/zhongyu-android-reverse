package com.tencent.liteav.beauty;

import android.util.Log;
import com.tencent.liteav.basic.util.C6592e;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class NativeLoad {
    private static final String TAG = "NativeLoad";

    /* renamed from: com.tencent.liteav.beauty.NativeLoad$a */
    public static class C6596a {

        /* renamed from: a */
        public static final NativeLoad f5538a;

        static {
            C6592e.m5058f();
            f5538a = new NativeLoad();
        }
    }

    public static native void OnLoadBeauty();

    public static NativeLoad getInstance() {
        return C6596a.f5538a;
    }

    public static native void nativeClearQueue();

    public static native void nativeDeleteYuv2Yuv();

    public static native void nativeGlMapBufferToQueue(int i10, int i11, ByteBuffer byteBuffer);

    public static native void nativeGlReadPixs(int i10, int i11, byte[] bArr);

    public static native boolean nativeGlReadPixsFromQueue(int i10, int i11, byte[] bArr);

    public static native void nativeGlReadPixsToQueue(int i10, int i11);

    public static native int nativeLoadGLProgram(int i10);

    public static native void nativeglTexImage2D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr, int i18);

    private NativeLoad() {
        OnLoadBeauty();
        Log.e(TAG, "NativeLoad: load jni");
    }
}
