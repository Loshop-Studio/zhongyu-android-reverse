package androidx.compose.p012ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m13413d2 = {"IS_IN_EXPANDED_BOUNDS", "", "IS_IN_LAYER", "DistanceAndFlags", "Landroidx/compose/ui/node/DistanceAndFlags;", "distance", "", "isInLayer", "", "isInExpandedBounds", "(FZZ)J", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HitTestResultKt {
    private static final long IS_IN_EXPANDED_BOUNDS = 2;
    private static final long IS_IN_LAYER = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f10, boolean z9, boolean z10) {
        return DistanceAndFlags.m22896constructorimpl((((z9 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static /* synthetic */ long DistanceAndFlags$default(float f10, boolean z9, boolean z10, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z10 = false;
        }
        return DistanceAndFlags(f10, z9, z10);
    }
}
