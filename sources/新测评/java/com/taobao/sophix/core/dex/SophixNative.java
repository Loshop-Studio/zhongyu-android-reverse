package com.taobao.sophix.core.dex;

/* loaded from: classes4.dex */
public class SophixNative {
    static {
        System.loadLibrary("sophix");
    }

    public static native void clearPreVerified(Object obj);

    public static native boolean clearResolvedCache(String str, Object obj);

    public static native boolean initHotNative();

    public static native boolean markKeptMethods(String str, String[] strArr);

    public static native boolean removeClassesInBase(String str, String str2, String[] strArr);

    public static native void replaceMethod(Object obj, Object obj2);
}
