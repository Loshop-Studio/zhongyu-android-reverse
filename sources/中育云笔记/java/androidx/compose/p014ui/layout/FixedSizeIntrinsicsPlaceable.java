package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i10, int i11) {
        m32291setMeasuredSizeozmzZPI(IntSize.m33667constructorimpl((i11 & 4294967295L) | (i10 << 32)));
    }

    @Override // androidx.compose.p014ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
    }
}
