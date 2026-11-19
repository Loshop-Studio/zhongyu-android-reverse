package androidx.compose.foundation.shape;

import androidx.compose.p006ui.unit.C1700Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m5175d2 = {"CutCornerShape", "Landroidx/compose/foundation/shape/CutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "CutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/CutCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "CutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/CutCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,198:1\n154#2:199\n154#2:200\n154#2:201\n154#2:202\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n145#1:199\n146#1:200\n147#1:201\n148#1:202\n*E\n"})
/* loaded from: classes.dex */
public final class CutCornerShapeKt {
    public static final CutCornerShape CutCornerShape(CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new CutCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        if ((i4 & 8) != 0) {
            f7 = 0.0f;
        }
        return CutCornerShape(f4, f5, f6, f7);
    }

    /* renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final CutCornerShape m7581CutCornerShape0680j_4(float f4) {
        return CutCornerShape(CornerSizeKt.m7580CornerSize0680j_4(f4));
    }

    /* renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final CutCornerShape m7582CutCornerShapea9UjIt4(float f4, float f5, float f6, float f7) {
        return new CutCornerShape(CornerSizeKt.m7580CornerSize0680j_4(f4), CornerSizeKt.m7580CornerSize0680j_4(f5), CornerSizeKt.m7580CornerSize0680j_4(f6), CornerSizeKt.m7580CornerSize0680j_4(f7));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ CutCornerShape m7583CutCornerShapea9UjIt4$default(float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 2) != 0) {
            f5 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 4) != 0) {
            f6 = C1700Dp.m11525constructorimpl(0);
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.m11525constructorimpl(0);
        }
        return m7582CutCornerShapea9UjIt4(f4, f5, f6, f7);
    }

    public static final CutCornerShape CutCornerShape(float f4) {
        return CutCornerShape(CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        return CutCornerShape(i4, i5, i6, i7);
    }

    public static final CutCornerShape CutCornerShape(int i4) {
        return CutCornerShape(CornerSizeKt.CornerSize(i4));
    }

    public static final CutCornerShape CutCornerShape(float f4, float f5, float f6, float f7) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5), CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f7));
    }

    public static final CutCornerShape CutCornerShape(int i4, int i5, int i6, int i7) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5), CornerSizeKt.CornerSize(i6), CornerSizeKt.CornerSize(i7));
    }
}
