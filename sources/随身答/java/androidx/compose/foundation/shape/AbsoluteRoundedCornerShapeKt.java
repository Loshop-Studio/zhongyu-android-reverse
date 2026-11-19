package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00102\b\b\u0003\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m13413d2 = {"AbsoluteRoundedCornerShape", "Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "AbsoluteRoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteRoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "", "percent", "", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,197:1\n113#2:198\n113#2:199\n113#2:200\n113#2:201\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n147#1:198\n148#1:199\n149#1:200\n150#1:201\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i9 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i9 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i9 & 8) != 0) {
            f13 = 0.0f;
        }
        return AbsoluteRoundedCornerShape(f10, f11, f12, f13);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m18395AbsoluteRoundedCornerShape0680j_4(float f10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m18399CornerSize0680j_4(f10));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m18396AbsoluteRoundedCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m18399CornerSize0680j_4(f10), CornerSizeKt.m18399CornerSize0680j_4(f11), CornerSizeKt.m18399CornerSize0680j_4(f12), CornerSizeKt.m18399CornerSize0680j_4(f13));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m18397AbsoluteRoundedCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 4) != 0) {
            f12 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 8) != 0) {
            f13 = C3115Dp.m23994constructorimpl(0);
        }
        return m18396AbsoluteRoundedCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f10));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = 0;
        }
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return AbsoluteRoundedCornerShape(i9, i10, i11, i12);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i9) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i9));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f10, float f11, float f12, float f13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@IntRange(from = 0, m266to = 100) int i9, @IntRange(from = 0, m266to = 100) int i10, @IntRange(from = 0, m266to = 100) int i11, @IntRange(from = 0, m266to = 100) int i12) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i9), CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12));
    }
}
