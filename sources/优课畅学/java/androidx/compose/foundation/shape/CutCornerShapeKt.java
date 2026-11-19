package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.unit.C3156Dp;

/* loaded from: classes.dex */
public final class CutCornerShapeKt {
    public static final CutCornerShape CutCornerShape(CornerSize cornerSize) {
        return new CutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return CutCornerShape(f10, f11, f12, f13);
    }

    /* renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final CutCornerShape m21146CutCornerShape0680j_4(float f10) {
        return CutCornerShape(CornerSizeKt.m21145CornerSize0680j_4(f10));
    }

    /* renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final CutCornerShape m21147CutCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(CornerSizeKt.m21145CornerSize0680j_4(f10), CornerSizeKt.m21145CornerSize0680j_4(f11), CornerSizeKt.m21145CornerSize0680j_4(f12), CornerSizeKt.m21145CornerSize0680j_4(f13));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ CutCornerShape m21148CutCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3156Dp.m26899constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.m26899constructorimpl(0);
        }
        return m21147CutCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    public static final CutCornerShape CutCornerShape(float f10) {
        return CutCornerShape(CornerSizeKt.CornerSize(f10));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
        return CutCornerShape(i10, i11, i12, i13);
    }

    public static final CutCornerShape CutCornerShape(int i10) {
        return CutCornerShape(CornerSizeKt.CornerSize(i10));
    }

    public static final CutCornerShape CutCornerShape(float f10, float f11, float f12, float f13) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13));
    }

    public static final CutCornerShape CutCornerShape(@IntRange(from = 0, m244to = 100) int i10, @IntRange(from = 0, m244to = 100) int i11, @IntRange(from = 0, m244to = 100) int i12, @IntRange(from = 0, m244to = 100) int i13) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
