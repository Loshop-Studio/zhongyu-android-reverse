package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.p014ui.unit.C3186Dp;

/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return AbsoluteRoundedCornerShape(f10, f11, f12, f13);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m27743AbsoluteRoundedCornerShape0680j_4(float f10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m27747CornerSize0680j_4(f10));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m27744AbsoluteRoundedCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m27747CornerSize0680j_4(f10), CornerSizeKt.m27747CornerSize0680j_4(f11), CornerSizeKt.m27747CornerSize0680j_4(f12), CornerSizeKt.m27747CornerSize0680j_4(f13));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m27745AbsoluteRoundedCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return m27744AbsoluteRoundedCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f10));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
        return AbsoluteRoundedCornerShape(i10, i11, i12, i13);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i10));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f10, float f11, float f12, float f13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@IntRange(from = 0, m338to = 100) int i10, @IntRange(from = 0, m338to = 100) int i11, @IntRange(from = 0, m338to = 100) int i12, @IntRange(from = 0, m338to = 100) int i13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
