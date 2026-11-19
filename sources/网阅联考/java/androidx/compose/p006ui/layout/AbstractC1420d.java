package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Offset;

/* renamed from: androidx.compose.ui.layout.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1420d {
    /* renamed from: a */
    public static /* synthetic */ long m653a(LookaheadLayoutCoordinates lookaheadLayoutCoordinates, LookaheadLayoutCoordinates lookaheadLayoutCoordinates2, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-R5De75A");
        }
        if ((i4 & 2) != 0) {
            j4 = Offset.INSTANCE.m8961getZeroF1C5BW0();
        }
        return lookaheadLayoutCoordinates.mo10598localLookaheadPositionOfR5De75A(lookaheadLayoutCoordinates2, j4);
    }
}
