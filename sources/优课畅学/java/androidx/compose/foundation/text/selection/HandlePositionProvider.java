package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m24051getZeroF1C5BW0();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo20465calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        long jMo21170provideF1C5BW0 = this.positionProvider.mo21170provideF1C5BW0();
        if ((9223372034707292159L & jMo21170provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jMo21170provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = jMo21170provideF1C5BW0;
        return IntOffset.m27031plusqkQi6aY(IntOffset.m27031plusqkQi6aY(intRect.m27056getTopLeftnOccac(), IntOffsetKt.m27044roundk4lQ0M(jMo21170provideF1C5BW0)), this.handleReferencePoint.mo23844alignKFBX0sM(j11, IntSize.Companion.m27075getZeroYbymL2g(), layoutDirection));
    }
}
