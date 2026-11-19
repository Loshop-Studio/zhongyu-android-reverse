package androidx.compose.p014ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.PlatformSpanStyle;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.platform.AndroidTextPaint;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9546r;

/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC9546r interfaceC9546r, Density density, boolean z10) {
        long jM33694getTypeUIouoOA = TextUnit.m33694getTypeUIouoOA(spanStyle.m32908getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33728getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo27098toPxR2X_6o(spanStyle.m32908getFontSizeXSAIIZE()));
        } else if (TextUnitType.m33723equalsimpl0(jM33694getTypeUIouoOA, companion.m33727getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m33695getValueimpl(spanStyle.m32908getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM32909getFontStyle4Lr2A7w = spanStyle.m32909getFontStyle4Lr2A7w();
            FontStyle fontStyleM33074boximpl = FontStyle.m33074boximpl(fontStyleM32909getFontStyle4Lr2A7w != null ? fontStyleM32909getFontStyle4Lr2A7w.m33080unboximpl() : FontStyle.Companion.m33084getNormal_LCdwA());
            FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = spanStyle.m32910getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface((Typeface) interfaceC9546r.invoke(fontFamily, fontWeight, fontStyleM33074boximpl, FontSynthesis.m33085boximpl(fontSynthesisM32910getFontSynthesisZQGJjVo != null ? fontSynthesisM32910getFontSynthesisZQGJjVo.m33093unboximpl() : FontSynthesis.Companion.m33094getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC9979u.m20289b(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC9979u.m20289b(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC9979u.m20289b(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m33234setColor8_81llA(spanStyle.m32907getColor0d7_KjU());
        androidTextPaint.m33232setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m30714getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(spanStyle.m32911getLetterSpacingXSAIIZE()), companion.m33728getSpUIouoOA()) && TextUnit.m33695getValueimpl(spanStyle.m32911getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo27098toPxR2X_6o = density.mo27098toPxR2X_6o(spanStyle.m32911getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo27098toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(spanStyle.m32911getLetterSpacingXSAIIZE()), companion.m33727getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m33695getValueimpl(spanStyle.m32911getLetterSpacingXSAIIZE()));
        }
        return m33249generateFallbackSpanStyle62GTOB8(spanStyle.m32911getLetterSpacingXSAIIZE(), z10, spanStyle.m32905getBackground0d7_KjU(), spanStyle.m32906getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC9546r interfaceC9546r, Density density, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, interfaceC9546r, density, z10);
    }

    public static final float correctBlurRadius(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m33249generateFallbackSpanStyle62GTOB8(long j10, boolean z10, long j11, BaselineShift baselineShift) {
        long jM30914getUnspecified0d7_KjU = j11;
        boolean z11 = false;
        boolean z12 = z10 && TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnitType.Companion.m33728getSpUIouoOA()) && TextUnit.m33695getValueimpl(j10) != 0.0f;
        Color.Companion companion = Color.Companion;
        boolean z13 = (Color.m30879equalsimpl0(jM30914getUnspecified0d7_KjU, companion.m30914getUnspecified0d7_KjU()) || Color.m30879equalsimpl0(jM30914getUnspecified0d7_KjU, companion.m30913getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m33260equalsimpl0(baselineShift.m33263unboximpl(), BaselineShift.Companion.m33267getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jM33706getUnspecifiedXSAIIZE = z12 ? j10 : TextUnit.Companion.m33706getUnspecifiedXSAIIZE();
        if (!z13) {
            jM30914getUnspecified0d7_KjU = companion.m30914getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM33706getUnspecifiedXSAIIZE, z11 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM30914getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC9972n) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m32909getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text_release() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM33413getLinearity4e0Vf04$ui_text_release = textMotion.m33413getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m33417equalsimpl0(iM33413getLinearity4e0Vf04$ui_text_release, companion.m33422getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m33417equalsimpl0(iM33413getLinearity4e0Vf04$ui_text_release, companion.m33421getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m33417equalsimpl0(iM33413getLinearity4e0Vf04$ui_text_release, companion.m33423getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
