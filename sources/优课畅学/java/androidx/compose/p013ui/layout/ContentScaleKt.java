package androidx.compose.p013ui.layout;

/* loaded from: classes2.dex */
public final class ContentScaleKt {
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    private static final float m25623computeFillHeightiLBOSCw(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m25624computeFillMaxDimensioniLBOSCw(long j10, long j11) {
        return Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m25625computeFillMinDimensioniLBOSCw(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    private static final float m25626computeFillWidthiLBOSCw(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
    }
}
