package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00102\b\b\u0003\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7880d2 = {"AbsoluteCutCornerShape", "Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "AbsoluteCutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteCutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "", "percent", "", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAbsoluteCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,202:1\n113#2:203\n113#2:204\n113#2:205\n113#2:206\n*S KotlinDebug\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n*L\n152#1:203\n153#1:204\n154#1:205\n155#1:206\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShapeKt {
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(CornerSize cornerSize) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f6, float f7, float f8, float f9, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f8 = 0.0f;
        }
        if ((i6 & 8) != 0) {
            f9 = 0.0f;
        }
        return AbsoluteCutCornerShape(f6, f7, f8, f9);
    }

    /* renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m10881AbsoluteCutCornerShape0680j_4(float f6) {
        return AbsoluteCutCornerShape(CornerSizeKt.m10889CornerSize0680j_4(f6));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m10882AbsoluteCutCornerShapea9UjIt4(float f6, float f7, float f8, float f9) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m10889CornerSize0680j_4(f6), CornerSizeKt.m10889CornerSize0680j_4(f7), CornerSizeKt.m10889CornerSize0680j_4(f8), CornerSizeKt.m10889CornerSize0680j_4(f9));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m10883AbsoluteCutCornerShapea9UjIt4$default(float f6, float f7, float f8, float f9, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 2) != 0) {
            f7 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 4) != 0) {
            f8 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 8) != 0) {
            f9 = C2452Dp.m16484constructorimpl(0);
        }
        return m10882AbsoluteCutCornerShapea9UjIt4(f6, f7, f8, f9);
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f6) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f6));
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return AbsoluteCutCornerShape(i6, i7, i8, i9);
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i6) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i6));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f6, float f7, float f8, float f9) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f7), CornerSizeKt.CornerSize(f8), CornerSizeKt.CornerSize(f9));
    }

    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(@IntRange(from = 0, m59to = 100) int i6, @IntRange(from = 0, m59to = 100) int i7, @IntRange(from = 0, m59to = 100) int i8, @IntRange(from = 0, m59to = 100) int i9) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i6), CornerSizeKt.CornerSize(i7), CornerSizeKt.CornerSize(i8), CornerSizeKt.CornerSize(i9));
    }
}
