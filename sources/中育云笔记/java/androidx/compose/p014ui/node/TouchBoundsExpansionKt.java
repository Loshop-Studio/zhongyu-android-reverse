package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.C3186Dp;

/* loaded from: classes2.dex */
public final class TouchBoundsExpansionKt {
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m32606DpTouchBoundsExpansiona9UjIt4(float f10, float f11, float f12, float f13) {
        return new DpTouchBoundsExpansion(f10, f11, f12, f13, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m32607DpTouchBoundsExpansiona9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3186Dp.m33501constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3186Dp.m33501constructorimpl(0);
        }
        return m32606DpTouchBoundsExpansiona9UjIt4(f10, f11, f12, f13);
    }

    public static final long TouchBoundsExpansion(int i10, int i11, int i12, int i13) {
        if (!(i10 >= 0 && i10 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m32592constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(i10, i11, i12, i13, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return TouchBoundsExpansion(i10, i11, i12, i13);
    }
}
