package com.umeng.commonsdk.config;

/* renamed from: com.umeng.commonsdk.config.a */
/* loaded from: classes.dex */
public class C1950a {
    /* renamed from: a */
    public static boolean m7334a(int i4, int i5) {
        return i5 >= 0 && i5 <= 31 && (i4 & (1 << i5)) != 0;
    }

    /* renamed from: a */
    public static boolean m7335a(long j4, int i4) {
        return i4 >= 0 && i4 <= 63 && (j4 & (1 << i4)) != 0;
    }

    /* renamed from: b */
    public static int m7336b(int i4, int i5) {
        return i4 | (1 << i5);
    }

    /* renamed from: b */
    public static long m7337b(long j4, int i4) {
        return (i4 < 0 || i4 > 63) ? j4 : j4 | (1 << i4);
    }

    /* renamed from: c */
    public static int m7338c(int i4, int i5) {
        return i4 & (~(1 << i5));
    }

    /* renamed from: c */
    public static long m7339c(long j4, int i4) {
        return (i4 < 0 || i4 > 63) ? j4 : j4 & (~(1 << i4));
    }
}
