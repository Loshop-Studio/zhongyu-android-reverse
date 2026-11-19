package androidx.compose.p014ui.geometry;

/* loaded from: classes2.dex */
public final class MutableRectKt {
    /* renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final MutableRect m30623MutableRect0a9Yr6o(long j10, long j11) {
        return new MutableRect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final MutableRect m30624MutableRect3MmeM6k(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i10) - f10, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    /* renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final MutableRect m30625MutableRecttz77jQw(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new MutableRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final Rect toRect(MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
