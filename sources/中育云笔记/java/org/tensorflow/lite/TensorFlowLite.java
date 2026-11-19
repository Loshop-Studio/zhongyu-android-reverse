package org.tensorflow.lite;

/* loaded from: classes6.dex */
public final class TensorFlowLite {

    /* renamed from: a */
    public static final Throwable f25548a;

    /* renamed from: b */
    public static volatile boolean f25549b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
        }
        f25548a = e;
    }

    /* renamed from: a */
    public static void m22400a() {
        if (f25549b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            f25549b = true;
        } catch (UnsatisfiedLinkError e10) {
            e = e10;
            Object obj = f25548a;
            if (obj != null) {
                e = obj;
            }
            throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + e);
        }
    }

    /* renamed from: b */
    public static String m22401b() {
        m22400a();
        return nativeRuntimeVersion();
    }

    public static native String nativeRuntimeVersion();

    public static native String nativeSchemaVersion();
}
