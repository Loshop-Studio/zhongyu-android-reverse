package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1418b {
    /* renamed from: a */
    public static void m637a(LayoutCoordinates layoutCoordinates, LayoutCoordinates sourceCoordinates, float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: c */
    public static /* synthetic */ Rect m639c(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z3);
    }
}
