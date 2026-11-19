package com.blankj.utilcode.util;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: com.blankj.utilcode.util.g */
/* loaded from: classes3.dex */
public abstract class AbstractC4646g {

    /* renamed from: a */
    public static final char[] f2079a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f2080b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m2181a(long j6) {
        return m2182b(j6, 3);
    }

    /* renamed from: b */
    public static String m2182b(long j6, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("precision shouldn't be less than zero!");
        }
        if (j6 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j6 < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return String.format("%." + i6 + "fB", Double.valueOf(j6));
        }
        if (j6 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format("%." + i6 + "fKB", Double.valueOf(j6 / 1024.0d));
        }
        if (j6 < 1073741824) {
            return String.format("%." + i6 + "fMB", Double.valueOf(j6 / 1048576.0d));
        }
        return String.format("%." + i6 + "fGB", Double.valueOf(j6 / 1.073741824E9d));
    }

    /* renamed from: c */
    public static String m2183c(byte[] bArr) {
        return m2184d(bArr, true);
    }

    /* renamed from: d */
    public static String m2184d(byte[] bArr, boolean z6) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z6 ? f2079a : f2080b;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i6 = 0;
        for (byte b7 : bArr) {
            int i7 = i6 + 1;
            cArr2[i6] = cArr[(b7 >> 4) & 15];
            i6 += 2;
            cArr2[i7] = cArr[b7 & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: e */
    public static int m2185e(float f6) {
        return AbstractC4663o0.m2322g(f6);
    }
}
