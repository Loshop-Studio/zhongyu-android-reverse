package androidx.compose.p014ui.text.android;

/* loaded from: classes2.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final int unpackInt1(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int unpackInt2(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
