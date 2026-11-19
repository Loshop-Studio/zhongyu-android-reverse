package androidx.compose.p014ui.layout;

/* loaded from: classes2.dex */
public final class ContentScaleKt {
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    private static final float m32225computeFillHeightiLBOSCw(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m32226computeFillMaxDimensioniLBOSCw(long j10, long j11) {
        return Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m32227computeFillMinDimensioniLBOSCw(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    private static final float m32228computeFillWidthiLBOSCw(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
    }
}
