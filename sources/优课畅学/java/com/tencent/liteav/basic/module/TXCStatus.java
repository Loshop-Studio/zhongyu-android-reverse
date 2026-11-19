package com.tencent.liteav.basic.module;

/* loaded from: classes4.dex */
public class TXCStatus {
    /* renamed from: a */
    public static void m5006a(String str) {
        nativeStatusStartRecord(str);
    }

    /* renamed from: b */
    public static void m5011b(String str) {
        nativeStatusStopRecord(str);
    }

    /* renamed from: c */
    public static int m5012c(String str, int i10) {
        return m5013c(str, i10, 0);
    }

    /* renamed from: d */
    public static double m5014d(String str, int i10) {
        return m5015d(str, i10, 0);
    }

    private static native double nativeStatusGetDoubleValue(String str, int i10, int i11);

    private static native long nativeStatusGetIntValue(String str, int i10, int i11);

    private static native String nativeStatusGetStrValue(String str, int i10, int i11);

    private static native boolean nativeStatusSetDoubleValue(String str, int i10, int i11, double d10);

    private static native boolean nativeStatusSetIntValue(String str, int i10, int i11, long j10);

    private static native boolean nativeStatusSetStrValue(String str, int i10, int i11, String str2);

    private static native void nativeStatusStartRecord(String str);

    private static native void nativeStatusStopRecord(String str);

    /* renamed from: a */
    public static boolean m5008a(String str, int i10, Object obj) {
        return m5007a(str, i10, 0, obj);
    }

    /* renamed from: b */
    public static String m5009b(String str, int i10) {
        return m5010b(str, i10, 0);
    }

    /* renamed from: c */
    public static int m5013c(String str, int i10, int i11) {
        return (int) nativeStatusGetIntValue(str, i10, i11);
    }

    /* renamed from: d */
    public static double m5015d(String str, int i10, int i11) {
        return nativeStatusGetDoubleValue(str, i10, i11);
    }

    /* renamed from: a */
    public static boolean m5007a(String str, int i10, int i11, Object obj) {
        if (str == null || str.length() == 0 || obj == null) {
            return false;
        }
        if (obj instanceof Double) {
            return nativeStatusSetDoubleValue(str, i10, i11, ((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return nativeStatusSetStrValue(str, i10, i11, (String) obj);
        }
        if (obj instanceof Long) {
            return nativeStatusSetIntValue(str, i10, i11, ((Long) obj).longValue());
        }
        return nativeStatusSetIntValue(str, i10, i11, ((Integer) obj).intValue());
    }

    /* renamed from: b */
    public static String m5010b(String str, int i10, int i11) {
        return nativeStatusGetStrValue(str, i10, i11);
    }

    /* renamed from: a */
    public static long m5004a(String str, int i10) {
        return m5005a(str, i10, 0);
    }

    /* renamed from: a */
    public static long m5005a(String str, int i10, int i11) {
        return nativeStatusGetIntValue(str, i10, i11);
    }
}
