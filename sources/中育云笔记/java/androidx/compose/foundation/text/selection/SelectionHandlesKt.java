package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.semantics.SemanticsPropertyKey;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.p014ui.unit.C3186Dp;

/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f10 = 25;
        HandleWidth = C3186Dp.m33501constructorimpl(f10);
        HandleHeight = C3186Dp.m33501constructorimpl(f10);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m28227getAdjustedCoordinatesk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z10) {
        if (resolvedTextDirection != ResolvedTextDirection.Ltr || z10) {
            return resolvedTextDirection == ResolvedTextDirection.Rtl && z10;
        }
        return true;
    }

    public static final boolean isLeftSelectionHandle(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return z10 ? isHandleLtrDirection(resolvedTextDirection, z11) : !isHandleLtrDirection(resolvedTextDirection, z11);
    }
}
