package com.umeng.commonsdk.config;

/* renamed from: com.umeng.commonsdk.config.a */
/* loaded from: classes2.dex */
public class C3434a {
    /* renamed from: a */
    public static boolean m3411a(int i4, int i5) {
        return i5 >= 0 && i5 <= 31 && (i4 & (1 << i5)) != 0;
    }

    /* renamed from: b */
    public static int m3413b(int i4, int i5) {
        return i4 | (1 << i5);
    }

    /* renamed from: c */
    public static int m3415c(int i4, int i5) {
        return i4 & (~(1 << i5));
    }

    /* renamed from: a */
    public static boolean m3412a(long j4, int i4) {
        return i4 >= 0 && i4 <= 63 && (j4 & (1 << i4)) != 0;
    }

    /* renamed from: b */
    public static long m3414b(long j4, int i4) {
        return (i4 < 0 || i4 > 63) ? j4 : j4 | (1 << i4);
    }

    /* renamed from: c */
    public static long m3416c(long j4, int i4) {
        return (i4 < 0 || i4 > 63) ? j4 : j4 & (~(1 << i4));
    }
}
