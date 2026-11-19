package androidx.compose.p014ui;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.p014ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo30446alignKFBX0sM(long j10, long j11, LayoutDirection layoutDirection) {
        return IntOffset.m33623constructorimpl((this.horizontal.align((int) (j10 >> 32), (int) (j11 >> 32), layoutDirection) << 32) | (this.vertical.align((int) (j10 & 4294967295L), (int) (j11 & 4294967295L)) & 4294967295L));
    }
}
