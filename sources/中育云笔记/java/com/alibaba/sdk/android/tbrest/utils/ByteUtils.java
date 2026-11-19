package com.alibaba.sdk.android.tbrest.utils;

import anet.channel.request.Request;
import com.tendcloud.tenddata.C7863av;

/* loaded from: classes3.dex */
public class ByteUtils {
    public static String bytes2UTF8String(byte[] bArr) {
        try {
            return new String(bArr, Request.DEFAULT_CHARSET);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String bytes2UTF8string(byte[] bArr, int i10, int i11) {
        if (bArr == null || i10 < 0 || i11 < 0 || bArr.length < i10 + i11) {
            return "";
        }
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = bArr[i10];
            i10++;
        }
        return bytes2UTF8String(bArr2);
    }

    public static int bytesToInt(byte[] bArr, int i10, int i11) {
        if (bArr == null || i10 < 0 || i11 < 0 || bArr.length < i10 + i11) {
            return 0;
        }
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = bArr[i10];
            i10++;
        }
        return bytesToInt(bArr2);
    }

    public static byte[] intToBytes(int i10, int i11) {
        if (i11 > 4 || i11 < 1) {
            return null;
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((i10 >> (((i11 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] intToBytes1(int i10) {
        return new byte[]{(byte) (i10 & 255)};
    }

    public static byte[] intToBytes2(int i10) {
        return new byte[]{(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static byte[] intToBytes3(int i10) {
        return new byte[]{(byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static byte[] intToBytes4(int i10) {
        return new byte[]{(byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static byte[] subBytes(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null || i10 < 0 || i11 < 0 || bArr.length < (i12 = i10 + i11)) {
            return null;
        }
        byte[] bArr2 = new byte[i11];
        for (int i13 = i10; i13 < i12; i13++) {
            bArr2[i13 - i10] = bArr[i13];
        }
        return bArr2;
    }

    public static int bytesToInt(byte[] bArr) {
        if (bArr == null || bArr.length > 4) {
            return 0;
        }
        int length = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            length |= (bArr[i10] & C7863av.f14384i) << (((bArr.length - i10) - 1) * 8);
        }
        return length;
    }
}
