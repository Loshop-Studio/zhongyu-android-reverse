package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p014ui.unit.fontscaling.FontScaleConverterFactory;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
/* loaded from: classes2.dex */
public interface FontScaling {

    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m33612toDpGaN1DYA(FontScaling fontScaling, long j10) {
            return FontScaling.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m33613toSp0xMU5do(FontScaling fontScaling, float f10) {
            return FontScaling.super.mo27101toSp0xMU5do(f10);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo27094toDpGaN1DYA(long j10) {
        if (!TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnitType.Companion.m33728getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return C3186Dp.m33501constructorimpl(TextUnit.m33695getValueimpl(j10) * getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        float fM33695getValueimpl = TextUnit.m33695getValueimpl(j10);
        return fontScaleConverterForScale == null ? C3186Dp.m33501constructorimpl(fM33695getValueimpl * getFontScale()) : C3186Dp.m33501constructorimpl(fontScaleConverterForScale.convertSpToDp(fM33695getValueimpl));
    }

    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo27101toSp0xMU5do(float f10) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return TextUnitKt.getSp(f10 / getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f10) : f10 / getFontScale());
    }
}
