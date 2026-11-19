package androidx.compose.p013ui.window;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j10, AbstractC9126n abstractC9126n) {
        this(alignment, j10);
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo20465calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        return IntOffset.m27031plusqkQi6aY(IntOffset.m27031plusqkQi6aY(IntOffset.m27031plusqkQi6aY(intRect.m27056getTopLeftnOccac(), alignment.mo23844alignKFBX0sM(companion.m27075getZeroYbymL2g(), intRect.m27054getSizeYbymL2g(), layoutDirection)), IntOffset.m27035unaryMinusnOccac(this.alignment.mo23844alignKFBX0sM(companion.m27075getZeroYbymL2g(), j11, layoutDirection))), IntOffset.m27021constructorimpl(((IntOffset.m27027getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (IntOffset.m27028getYimpl(this.offset) & 4294967295L)));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m27158getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j10) {
        this.alignment = alignment;
        this.offset = j10;
    }
}
