package androidx.compose.p014ui.window;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j10, AbstractC9972n abstractC9972n) {
        this(alignment, j10);
    }

    @Override // androidx.compose.p014ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        return IntOffset.m33633plusqkQi6aY(IntOffset.m33633plusqkQi6aY(IntOffset.m33633plusqkQi6aY(intRect.m33658getTopLeftnOccac(), alignment.mo30446alignKFBX0sM(companion.m33677getZeroYbymL2g(), intRect.m33656getSizeYbymL2g(), layoutDirection)), IntOffset.m33637unaryMinusnOccac(this.alignment.mo30446alignKFBX0sM(companion.m33677getZeroYbymL2g(), j11, layoutDirection))), IntOffset.m33623constructorimpl(((IntOffset.m33629getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32) | (IntOffset.m33630getYimpl(this.offset) & 4294967295L)));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m33760getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j10) {
        this.alignment = alignment;
        this.offset = j10;
    }
}
