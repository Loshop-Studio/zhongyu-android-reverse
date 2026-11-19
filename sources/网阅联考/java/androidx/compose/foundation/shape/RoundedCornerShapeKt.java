package androidx.compose.foundation.shape;

import androidx.compose.p006ui.unit.C1700Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0011\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0011\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m5175d2 = {"CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n154#2:201\n154#2:202\n154#2:203\n154#2:204\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n147#1:201\n148#1:202\n149#1:203\n150#1:204\n*E\n"})
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape RoundedCornerShape(CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new RoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f4, float f5, float f6, float f7, int i4, Object obj) {
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
        return RoundedCornerShape(f4, f5, f6, f7);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m7588RoundedCornerShape0680j_4(float f4) {
        return RoundedCornerShape(CornerSizeKt.m7580CornerSize0680j_4(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m7589RoundedCornerShapea9UjIt4(float f4, float f5, float f6, float f7) {
        return new RoundedCornerShape(CornerSizeKt.m7580CornerSize0680j_4(f4), CornerSizeKt.m7580CornerSize0680j_4(f5), CornerSizeKt.m7580CornerSize0680j_4(f6), CornerSizeKt.m7580CornerSize0680j_4(f7));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m7590RoundedCornerShapea9UjIt4$default(float f4, float f5, float f6, float f7, int i4, Object obj) {
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
        return m7589RoundedCornerShapea9UjIt4(f4, f5, f6, f7);
    }

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(float f4) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i4, int i5, int i6, int i7, int i8, Object obj) {
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
        return RoundedCornerShape(i4, i5, i6, i7);
    }

    public static final RoundedCornerShape RoundedCornerShape(int i4) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i4));
    }

    public static final RoundedCornerShape RoundedCornerShape(float f4, float f5, float f6, float f7) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5), CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f7));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i4, int i5, int i6, int i7) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5), CornerSizeKt.CornerSize(i6), CornerSizeKt.CornerSize(i7));
    }
}
