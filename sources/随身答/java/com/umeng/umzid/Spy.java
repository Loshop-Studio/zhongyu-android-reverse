package com.umeng.umzid;

/* loaded from: classes4.dex */
public class Spy {

    /* renamed from: a */
    public static boolean f6977a = false;

    static {
        try {
            System.loadLibrary("umeng-spy");
            f6977a = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static native String getNativeID();

    public static native String getNativeLibraryVersion();
}
