package com.stormdzh.lame4android;

/* loaded from: classes5.dex */
public class Lame {
    static {
        try {
            System.loadLibrary("mp3lame");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i10, byte[] bArr);

    public static native void encodeFile(String str, String str2);

    public static native int flush(byte[] bArr);

    public static native String getLameVersion();

    public static native void init(int i10, int i11, int i12, int i13, int i14);

    public static native void setRawBigEndian(boolean z10);
}
