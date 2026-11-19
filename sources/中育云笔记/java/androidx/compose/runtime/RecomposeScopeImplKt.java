package androidx.compose.runtime;

/* loaded from: classes2.dex */
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int ForceReusing = 128;
    private static final int ForcedRecomposeFlag = 64;
    private static final int Paused = 256;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int Resuming = 512;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final Object callbackLock = new Object();
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i10) {
        int i11 = changedLowBitMask & i10;
        int i12 = changedHighBitMask & i10;
        return (i10 & changedMask) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
