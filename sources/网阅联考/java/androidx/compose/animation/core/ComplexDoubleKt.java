package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n¨\u0006\r"}, m5175d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", C3335ai.f1705at, "", "b", C3335ai.f1663aD, "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n72#2,3:116\n66#2,3:120\n35#2,2:124\n72#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n86#1:113\n87#1:119\n87#1:123\n107#1:134\n86#1:114,2\n86#1:116,3\n87#1:120,3\n87#1:124,2\n87#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComplexDoubleKt {
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d4, double d5, double d6) {
        double d7 = -d5;
        double d8 = (d5 * d5) - ((4.0d * d4) * d6);
        ComplexDouble complexDoubleComplexSqrt = complexSqrt(d8);
        complexDoubleComplexSqrt._real += d7;
        double d9 = d4 * 2.0d;
        complexDoubleComplexSqrt._real /= d9;
        complexDoubleComplexSqrt._imaginary /= d9;
        ComplexDouble complexDoubleComplexSqrt2 = complexSqrt(d8);
        double d10 = -1;
        complexDoubleComplexSqrt2._real *= d10;
        complexDoubleComplexSqrt2._imaginary *= d10;
        complexDoubleComplexSqrt2._real += d7;
        complexDoubleComplexSqrt2._real /= d9;
        complexDoubleComplexSqrt2._imaginary /= d9;
        return TuplesKt.m5182to(complexDoubleComplexSqrt, complexDoubleComplexSqrt2);
    }

    public static final ComplexDouble complexSqrt(double d4) {
        return d4 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d4))) : new ComplexDouble(Math.sqrt(d4), 0.0d);
    }

    public static final ComplexDouble minus(double d4, ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d5 = -1;
        other._real *= d5;
        other._imaginary *= d5;
        other._real += d4;
        return other;
    }

    public static final ComplexDouble plus(double d4, ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real += d4;
        return other;
    }

    public static final ComplexDouble times(double d4, ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real *= d4;
        other._imaginary *= d4;
        return other;
    }
}
