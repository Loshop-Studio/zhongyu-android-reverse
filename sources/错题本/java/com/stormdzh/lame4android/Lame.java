package com.stormdzh.lame4android;

/* loaded from: classes3.dex */
public abstract class Lame {
    static {
        try {
            System.loadLibrary("mp3lame");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native void init(int i, int i8, int i9, int i10, int i11);
}
