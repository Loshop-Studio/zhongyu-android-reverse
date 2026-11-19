package androidx.compose.foundation.lazy.layout;

import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.DpKt;
import androidx.compose.p006ui.unit.DpSize;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.compose.p006ui.unit.TextUnitType;

/* renamed from: androidx.compose.foundation.lazy.layout.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0746c {
    /* renamed from: a */
    public static float m249a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j4) {
        if (TextUnitType.m11734equalsimpl0(TextUnit.m11705getTypeUIouoOA(j4), TextUnitType.INSTANCE.m11739getSpUIouoOA())) {
            return C1700Dp.m11525constructorimpl(TextUnit.m11706getValueimpl(j4) * lazyLayoutMeasureScope.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: b */
    public static float m250b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f4) {
        return C1700Dp.m11525constructorimpl(f4 / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: c */
    public static float m251c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i4) {
        return C1700Dp.m11525constructorimpl(i4 / lazyLayoutMeasureScope.getDensity());
    }

    /* renamed from: d */
    public static long m252d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j4) {
        return (j4 > Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 1 : (j4 == Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m11547DpSizeYgX7TsA(lazyLayoutMeasureScope.mo7202toDpu2uoSUM(Size.m9014getWidthimpl(j4)), lazyLayoutMeasureScope.mo7202toDpu2uoSUM(Size.m9011getHeightimpl(j4))) : DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ();
    }

    /* renamed from: e */
    public static long m253e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j4) {
        return (j4 > DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 1 : (j4 == DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(lazyLayoutMeasureScope.mo7206toPx0680j_4(DpSize.m11623getWidthD9Ej5fM(j4)), lazyLayoutMeasureScope.mo7206toPx0680j_4(DpSize.m11621getHeightD9Ej5fM(j4))) : Size.INSTANCE.m9022getUnspecifiedNHjbRc();
    }

    /* renamed from: f */
    public static long m254f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f4) {
        return TextUnitKt.getSp(f4 / lazyLayoutMeasureScope.getFontScale());
    }

    /* renamed from: g */
    public static long m255g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f4) {
        return TextUnitKt.getSp(f4 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }

    /* renamed from: h */
    public static long m256h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i4) {
        return TextUnitKt.getSp(i4 / (lazyLayoutMeasureScope.getFontScale() * lazyLayoutMeasureScope.getDensity()));
    }
}
