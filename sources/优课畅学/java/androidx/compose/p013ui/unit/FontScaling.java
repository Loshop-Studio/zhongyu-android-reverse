package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p013ui.unit.fontscaling.FontScaleConverterFactory;
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
        public static float m27010toDpGaN1DYA(FontScaling fontScaling, long j10) {
            return FontScaling.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m27011toSp0xMU5do(FontScaling fontScaling, float f10) {
            return FontScaling.super.mo20499toSp0xMU5do(f10);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA */
    default float mo20492toDpGaN1DYA(long j10) {
        if (!TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return C3156Dp.m26899constructorimpl(TextUnit.m27093getValueimpl(j10) * getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        float fM27093getValueimpl = TextUnit.m27093getValueimpl(j10);
        return fontScaleConverterForScale == null ? C3156Dp.m26899constructorimpl(fM27093getValueimpl * getFontScale()) : C3156Dp.m26899constructorimpl(fontScaleConverterForScale.convertSpToDp(fM27093getValueimpl));
    }

    @Stable
    /* renamed from: toSp-0xMU5do */
    default long mo20499toSp0xMU5do(float f10) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (!fontScaleConverterFactory.isNonLinearFontScalingActive(getFontScale())) {
            return TextUnitKt.getSp(f10 / getFontScale());
        }
        FontScaleConverter fontScaleConverterForScale = fontScaleConverterFactory.forScale(getFontScale());
        return TextUnitKt.getSp(fontScaleConverterForScale != null ? fontScaleConverterForScale.convertDpToSp(f10) : f10 / getFontScale());
    }
}
