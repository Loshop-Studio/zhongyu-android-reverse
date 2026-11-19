package androidx.compose.p006ui.unit;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* renamed from: androidx.compose.ui.unit.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1702a {
    /* renamed from: a */
    public static int m906a(Density density, long j4) {
        return MathKt__MathJVMKt.roundToInt(density.mo7205toPxR2X_6o(j4));
    }

    /* renamed from: b */
    public static int m907b(Density density, float f4) {
        float fMo7206toPx0680j_4 = density.mo7206toPx0680j_4(f4);
        if (Float.isInfinite(fMo7206toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt__MathJVMKt.roundToInt(fMo7206toPx0680j_4);
    }

    /* renamed from: c */
    public static float m908c(Density density, long j4) {
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j4), TextUnitType.INSTANCE.m11739getSpUIouoOA())) {
            return C1700Dp.m11525constructorimpl(TextUnit.m11706getValueimpl(j4) * density.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: d */
    public static float m909d(Density density, float f4) {
        return C1700Dp.m11525constructorimpl(f4 / density.getDensity());
    }

    /* renamed from: e */
    public static float m910e(Density density, int i4) {
        return C1700Dp.m11525constructorimpl(i4 / density.getDensity());
    }

    /* renamed from: f */
    public static long m911f(Density density, long j4) {
        return (j4 > Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 1 : (j4 == Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m11547DpSizeYgX7TsA(density.mo7202toDpu2uoSUM(Size.m9014getWidthimpl(j4)), density.mo7202toDpu2uoSUM(Size.m9011getHeightimpl(j4))) : DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ();
    }

    /* renamed from: g */
    public static float m912g(Density density, long j4) {
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j4), TextUnitType.INSTANCE.m11739getSpUIouoOA())) {
            return TextUnit.m11706getValueimpl(j4) * density.getFontScale() * density.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: h */
    public static float m913h(Density density, float f4) {
        return f4 * density.getDensity();
    }

    /* renamed from: i */
    public static Rect m914i(Density density, DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return new Rect(density.mo7206toPx0680j_4(dpRect.m11608getLeftD9Ej5fM()), density.mo7206toPx0680j_4(dpRect.m11610getTopD9Ej5fM()), density.mo7206toPx0680j_4(dpRect.m11609getRightD9Ej5fM()), density.mo7206toPx0680j_4(dpRect.m11607getBottomD9Ej5fM()));
    }

    /* renamed from: j */
    public static long m915j(Density density, long j4) {
        return (j4 > DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 1 : (j4 == DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(density.mo7206toPx0680j_4(DpSize.m11623getWidthD9Ej5fM(j4)), density.mo7206toPx0680j_4(DpSize.m11621getHeightD9Ej5fM(j4))) : Size.INSTANCE.m9022getUnspecifiedNHjbRc();
    }

    /* renamed from: k */
    public static long m916k(Density density, float f4) {
        return TextUnitKt.getSp(f4 / density.getFontScale());
    }

    /* renamed from: l */
    public static long m917l(Density density, float f4) {
        return TextUnitKt.getSp(f4 / (density.getFontScale() * density.getDensity()));
    }

    /* renamed from: m */
    public static long m918m(Density density, int i4) {
        return TextUnitKt.getSp(i4 / (density.getFontScale() * density.getDensity()));
    }
}
