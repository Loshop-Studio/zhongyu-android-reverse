package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment handleReferencePoint;
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m30653getZeroF1C5BW0();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.handleReferencePoint = alignment;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.p014ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        long jMo27772provideF1C5BW0 = this.positionProvider.mo27772provideF1C5BW0();
        if ((9223372034707292159L & jMo27772provideF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            jMo27772provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = jMo27772provideF1C5BW0;
        return IntOffset.m33633plusqkQi6aY(IntOffset.m33633plusqkQi6aY(intRect.m33658getTopLeftnOccac(), IntOffsetKt.m33646roundk4lQ0M(jMo27772provideF1C5BW0)), this.handleReferencePoint.mo30446alignKFBX0sM(j11, IntSize.Companion.m33677getZeroYbymL2g(), layoutDirection));
    }
}
