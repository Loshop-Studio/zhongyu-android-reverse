package androidx.compose.p013ui.node;

/* loaded from: classes2.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f10, boolean z10, boolean z11) {
        return DistanceAndFlags.m25771constructorimpl((((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static /* synthetic */ long DistanceAndFlags$default(float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return DistanceAndFlags(f10, z10, z11);
    }
}
