package androidx.compose.p013ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.platform.AndroidTextPaint;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10576r;

/* loaded from: classes2.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC10576r interfaceC10576r, Density density, boolean z10) {
        long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(spanStyle.m26306getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo20496toPxR2X_6o(spanStyle.m26306getFontSizeXSAIIZE()));
        } else if (TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m27093getValueimpl(spanStyle.m26306getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM26307getFontStyle4Lr2A7w = spanStyle.m26307getFontStyle4Lr2A7w();
            FontStyle fontStyleM26472boximpl = FontStyle.m26472boximpl(fontStyleM26307getFontStyle4Lr2A7w != null ? fontStyleM26307getFontStyle4Lr2A7w.m26478unboximpl() : FontStyle.Companion.m26482getNormal_LCdwA());
            FontSynthesis fontSynthesisM26308getFontSynthesisZQGJjVo = spanStyle.m26308getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface((Typeface) interfaceC10576r.invoke(fontFamily, fontWeight, fontStyleM26472boximpl, FontSynthesis.m26483boximpl(fontSynthesisM26308getFontSynthesisZQGJjVo != null ? fontSynthesisM26308getFontSynthesisZQGJjVo.m26491unboximpl() : FontSynthesis.Companion.m26492getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC9133u.m16128b(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC9133u.m16128b(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC9133u.m16128b(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m26632setColor8_81llA(spanStyle.m26305getColor0d7_KjU());
        androidTextPaint.m26630setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m24112getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(spanStyle.m26309getLetterSpacingXSAIIZE()), companion.m27126getSpUIouoOA()) && TextUnit.m27093getValueimpl(spanStyle.m26309getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float fMo20496toPxR2X_6o = density.mo20496toPxR2X_6o(spanStyle.m26309getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo20496toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(spanStyle.m26309getLetterSpacingXSAIIZE()), companion.m27125getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m27093getValueimpl(spanStyle.m26309getLetterSpacingXSAIIZE()));
        }
        return m26647generateFallbackSpanStyle62GTOB8(spanStyle.m26309getLetterSpacingXSAIIZE(), z10, spanStyle.m26303getBackground0d7_KjU(), spanStyle.m26304getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC10576r interfaceC10576r, Density density, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, interfaceC10576r, density, z10);
    }

    public static final float correctBlurRadius(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m26647generateFallbackSpanStyle62GTOB8(long j10, boolean z10, long j11, BaselineShift baselineShift) {
        long jM24312getUnspecified0d7_KjU = j11;
        boolean z11 = false;
        boolean z12 = z10 && TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA()) && TextUnit.m27093getValueimpl(j10) != 0.0f;
        Color.Companion companion = Color.Companion;
        boolean z13 = (Color.m24277equalsimpl0(jM24312getUnspecified0d7_KjU, companion.m24312getUnspecified0d7_KjU()) || Color.m24277equalsimpl0(jM24312getUnspecified0d7_KjU, companion.m24311getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            if (!BaselineShift.m26658equalsimpl0(baselineShift.m26661unboximpl(), BaselineShift.Companion.m26665getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jM27104getUnspecifiedXSAIIZE = z12 ? j10 : TextUnit.Companion.m27104getUnspecifiedXSAIIZE();
        if (!z13) {
            jM24312getUnspecified0d7_KjU = companion.m24312getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM27104getUnspecifiedXSAIIZE, z11 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM24312getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC9126n) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m26307getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text_release() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM26811getLinearity4e0Vf04$ui_text_release = textMotion.m26811getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m26815equalsimpl0(iM26811getLinearity4e0Vf04$ui_text_release, companion.m26820getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m26815equalsimpl0(iM26811getLinearity4e0Vf04$ui_text_release, companion.m26819getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m26815equalsimpl0(iM26811getLinearity4e0Vf04$ui_text_release, companion.m26821getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
