package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.unit.IntSize;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i10, int i11) {
        m25689setMeasuredSizeozmzZPI(IntSize.m27065constructorimpl((i11 & 4294967295L) | (i10 << 32)));
    }

    @Override // androidx.compose.p013ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p013ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo25628placeAtf8xVGno(long j10, float f10, InterfaceC10570l interfaceC10570l) {
    }
}
