package androidx.compose.p014ui.text;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.ShadowKt;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.drawscope.Fill;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.font.FontWeightKt;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.BaselineShiftKt;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextDrawStyleKt;
import androidx.compose.p014ui.text.style.TextForegroundStyle;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextGeometricTransformKt;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m30913getTransparent0d7_KjU();
        long jM30904getBlack0d7_KjU = companion.m30904getBlack0d7_KjU();
        DefaultColor = jM30904getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m33406from8_81llA(jM30904getBlack0d7_KjU);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r11
      0x003a: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:41:0x00ab, B:53:0x00dd, B:50:0x00d1, B:47:0x00c5, B:44:0x00b9, B:39:0x009d, B:34:0x008e, B:28:0x0076, B:25:0x006e, B:22:0x0062, B:19:0x0056, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p014ui.text.SpanStyle m32912fastMergedSHsh3o(androidx.compose.p014ui.text.SpanStyle r23, long r24, androidx.compose.p014ui.graphics.Brush r26, float r27, long r28, androidx.compose.p014ui.text.font.FontWeight r30, androidx.compose.p014ui.text.font.FontStyle r31, androidx.compose.p014ui.text.font.FontSynthesis r32, androidx.compose.p014ui.text.font.FontFamily r33, java.lang.String r34, long r35, androidx.compose.p014ui.text.style.BaselineShift r37, androidx.compose.p014ui.text.style.TextGeometricTransform r38, androidx.compose.p014ui.text.intl.LocaleList r39, long r40, androidx.compose.p014ui.text.style.TextDecoration r42, androidx.compose.p014ui.graphics.Shadow r43, androidx.compose.p014ui.text.PlatformSpanStyle r44, androidx.compose.p014ui.graphics.drawscope.DrawStyle r45) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.SpanStyleKt.m32912fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f10) {
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f10);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f10);
        long jM32913lerpTextUnitInheritableC3pnCVY = m32913lerpTextUnitInheritableC3pnCVY(spanStyle.m32908getFontSizeXSAIIZE(), spanStyle2.m32908getFontSizeXSAIIZE(), f10);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f10);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m32909getFontStyle4Lr2A7w(), spanStyle2.m32909getFontStyle4Lr2A7w(), f10);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m32910getFontSynthesisZQGJjVo(), spanStyle2.m32910getFontSynthesisZQGJjVo(), f10);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f10);
        long jM32913lerpTextUnitInheritableC3pnCVY2 = m32913lerpTextUnitInheritableC3pnCVY(spanStyle.m32911getLetterSpacingXSAIIZE(), spanStyle2.m32911getLetterSpacingXSAIIZE(), f10);
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = spanStyle.m32906getBaselineShift5SSeXJ0();
        float fM33263unboximpl = baselineShiftM32906getBaselineShift5SSeXJ0 != null ? baselineShiftM32906getBaselineShift5SSeXJ0.m33263unboximpl() : BaselineShift.m33258constructorimpl(0.0f);
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ02 = spanStyle2.m32906getBaselineShift5SSeXJ0();
        float fM33270lerpjWV1Mfo = BaselineShiftKt.m33270lerpjWV1Mfo(fM33263unboximpl, baselineShiftM32906getBaselineShift5SSeXJ02 != null ? baselineShiftM32906getBaselineShift5SSeXJ02.m33263unboximpl() : BaselineShift.m33258constructorimpl(0.0f), f10);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f10);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f10);
        long jM30929lerpjxsXWHM = ColorKt.m30929lerpjxsXWHM(spanStyle.m32905getBackground0d7_KjU(), spanStyle2.m32905getBackground0d7_KjU(), f10);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f10);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM32913lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM32913lerpTextUnitInheritableC3pnCVY2, BaselineShift.m33257boximpl(fM33270lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM30929lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f10), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f10), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f10), (AbstractC9972n) null);
    }

    public static final <T> T lerpDiscrete(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f10) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f10);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m32913lerpTextUnitInheritableC3pnCVY(long j10, long j11, float f10) {
        return (TextUnit.m33693getRawTypeimpl(j10) == 0 || TextUnit.m33693getRawTypeimpl(j11) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m33685boximpl(j10), TextUnit.m33685boximpl(j11), f10)).m33704unboximpl() : TextUnitKt.m33715lerpC3pnCVY(j10, j11, f10);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        return spanStyle.getPlatformStyle() == null ? platformSpanStyle : platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle textForegroundStyleTakeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(new InterfaceC9529a() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            @Override // p181hd.InterfaceC9529a
            public final TextForegroundStyle invoke() {
                return SpanStyleKt.DefaultColorForegroundStyle;
            }
        });
        long jM32908getFontSizeXSAIIZE = TextUnit.m33693getRawTypeimpl(spanStyle.m32908getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m32908getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = spanStyle.m32909getFontStyle4Lr2A7w();
        FontStyle fontStyleM33074boximpl = FontStyle.m33074boximpl(fontStyleM32909getFontStyle4Lr2A7w != null ? fontStyleM32909getFontStyle4Lr2A7w.m33080unboximpl() : FontStyle.Companion.m33084getNormal_LCdwA());
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = spanStyle.m32910getFontSynthesisZQGJjVo();
        FontSynthesis fontSynthesisM33085boximpl = FontSynthesis.m33085boximpl(fontSynthesisM32910getFontSynthesisZQGJjVo != null ? fontSynthesisM32910getFontSynthesisZQGJjVo.m33093unboximpl() : FontSynthesis.Companion.m33094getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long jM32911getLetterSpacingXSAIIZE = TextUnit.m33693getRawTypeimpl(spanStyle.m32911getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m32911getLetterSpacingXSAIIZE();
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = spanStyle.m32906getBaselineShift5SSeXJ0();
        BaselineShift baselineShiftM33257boximpl = BaselineShift.m33257boximpl(baselineShiftM32906getBaselineShift5SSeXJ0 != null ? baselineShiftM32906getBaselineShift5SSeXJ0.m33263unboximpl() : BaselineShift.Companion.m33267getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long jM32905getBackground0d7_KjU = spanStyle.m32905getBackground0d7_KjU();
        if (jM32905getBackground0d7_KjU == 16) {
            jM32905getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j10 = jM32905getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, jM32908getFontSizeXSAIIZE, fontWeight2, fontStyleM33074boximpl, fontSynthesisM33085boximpl, fontFamily2, str, jM32911getLetterSpacingXSAIIZE, baselineShiftM33257boximpl, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformStyle, drawStyle, (AbstractC9972n) null);
    }
}
