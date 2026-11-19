package androidx.compose.p014ui.text;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.text.style.TextForegroundStyle;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (AbstractC9972n) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, i10, i11, j14, textIndent, platformTextStyle, lineHeightStyle, i12, i13, textMotion);
    }

    /* renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32974copyCXVQc50$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        Hyphens hyphensM33276boximpl;
        LineBreak lineBreak2;
        long jM32907getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m32907getColor0d7_KjU() : j10;
        long jM32908getFontSizeXSAIIZE = (i10 & 2) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i10 & 8) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i10 & 16) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i10 & 128) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j12;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i10 & 256) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM32907getColor0d7_KjU;
        long jM32905getBackground0d7_KjU = (i10 & 2048) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM33378boximpl = (i10 & 16384) != 0 ? TextAlign.m33378boximpl(textStyle.paragraphStyle.m32861getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM33392boximpl = (i10 & 32768) != 0 ? TextDirection.m33392boximpl(textStyle.paragraphStyle.m32863getTextDirections_7Xco()) : textDirection;
        long jM32859getLineHeightXSAIIZE = (i10 & 65536) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM33286boximpl = (i10 & 1048576) != 0 ? LineBreak.m33286boximpl(textStyle.paragraphStyle.m32858getLineBreakrAG3T2k()) : lineBreak;
        if ((i10 & 2097152) != 0) {
            lineBreak2 = lineBreakM33286boximpl;
            hyphensM33276boximpl = Hyphens.m33276boximpl(textStyle.paragraphStyle.m32856getHyphensvmbZdU8());
        } else {
            hyphensM33276boximpl = hyphens;
            lineBreak2 = lineBreakM33286boximpl;
        }
        return textStyle.m32987copyCXVQc50(j15, jM32908getFontSizeXSAIIZE, fontWeight2, fontStyleM32909getFontStyle4Lr2A7w, fontSynthesisM32910getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM32911getLetterSpacingXSAIIZE, baselineShiftM32906getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM32905getBackground0d7_KjU, textDecoration3, shadow2, textAlignM33378boximpl, textDirectionM33392boximpl, jM32859getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphensM33276boximpl);
    }

    /* renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32975copyHL5avdY$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, Object obj) {
        long jM32907getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m32907getColor0d7_KjU() : j10;
        return textStyle.m32988copyHL5avdY(jM32907getColor0d7_KjU, (i10 & 2) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j11, (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i10 & 8) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle, (i10 & 16) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis, (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i10 & 128) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j12, (i10 & 256) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift, (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i10 & 2048) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j13, (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i10 & 16384) != 0 ? TextAlign.m33378boximpl(textStyle.paragraphStyle.m32861getTextAligne0LSkKk()) : textAlign, (i10 & 32768) != 0 ? TextDirection.m33392boximpl(textStyle.paragraphStyle.m32863getTextDirections_7Xco()) : textDirection, (i10 & 65536) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j14, (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32976copyNOaFTUo$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long jM32907getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m32907getColor0d7_KjU() : j10;
        long jM32908getFontSizeXSAIIZE = (i10 & 2) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i10 & 8) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i10 & 16) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i10 & 128) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j12;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i10 & 256) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM32907getColor0d7_KjU;
        long jM32905getBackground0d7_KjU = (i10 & 2048) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlignM33378boximpl = (i10 & 16384) != 0 ? TextAlign.m33378boximpl(textStyle.paragraphStyle.m32861getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM33392boximpl = (i10 & 32768) != 0 ? TextDirection.m33392boximpl(textStyle.paragraphStyle.m32863getTextDirections_7Xco()) : textDirection;
        long jM32859getLineHeightXSAIIZE = (i10 & 65536) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i10 & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m32989copyNOaFTUo(j15, jM32908getFontSizeXSAIIZE, fontWeight2, fontStyleM32909getFontStyle4Lr2A7w, fontSynthesisM32910getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM32911getLetterSpacingXSAIIZE, baselineShiftM32906getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM32905getBackground0d7_KjU, textDecoration3, shadow2, textAlignM33378boximpl, textDirectionM33392boximpl, jM32859getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32977copyNs73l9s$default(TextStyle textStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
        TextMotion textMotion2;
        int i15;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i16;
        int i17;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j14;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j16;
        long j17;
        Brush brush2;
        float f11;
        int i18;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i14 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f10;
        long jM32908getFontSizeXSAIIZE = (i14 & 4) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j10;
        FontWeight fontWeight3 = (i14 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i14 & 16) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i14 & 32) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i14 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i14 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i14 & 256) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j11;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i14 & 512) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i14 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i14 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long jM32905getBackground0d7_KjU = (i14 & 4096) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j12;
        float f12 = alpha;
        TextDecoration textDecoration3 = (i14 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i14 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i14 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM32861getTextAligne0LSkKk = (i14 & 65536) != 0 ? textStyle.paragraphStyle.m32861getTextAligne0LSkKk() : i10;
        int iM32863getTextDirections_7Xco = (i14 & 131072) != 0 ? textStyle.paragraphStyle.m32863getTextDirections_7Xco() : i11;
        long jM32859getLineHeightXSAIIZE = (i14 & 262144) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j13;
        TextIndent textIndent3 = (i14 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i14 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i14 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM32858getLineBreakrAG3T2k = (i14 & 4194304) != 0 ? textStyle.paragraphStyle.m32858getLineBreakrAG3T2k() : i12;
        int iM32856getHyphensvmbZdU8 = (i14 & 8388608) != 0 ? textStyle.paragraphStyle.m32856getHyphensvmbZdU8() : i13;
        if ((i14 & 16777216) != 0) {
            i15 = iM32856getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i16 = iM32861getTextAligne0LSkKk;
            i17 = iM32863getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            i18 = iM32858getLineBreakrAG3T2k;
            shadow2 = shadow3;
            j14 = jM32908getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM32909getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM32910getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j15 = jM32911getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM32906getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = jM32905getBackground0d7_KjU;
            j17 = jM32859getLineHeightXSAIIZE;
            brush2 = brush;
            f11 = f12;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            i15 = iM32856getHyphensvmbZdU8;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            i16 = iM32861getTextAligne0LSkKk;
            i17 = iM32863getTextDirections_7Xco;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j14 = jM32908getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM32909getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM32910getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j15 = jM32911getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM32906getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = jM32905getBackground0d7_KjU;
            j17 = jM32859getLineHeightXSAIIZE;
            brush2 = brush;
            f11 = f12;
            i18 = iM32858getLineBreakrAG3T2k;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m32990copyNs73l9s(brush2, f11, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j16, textDecoration2, shadow2, drawStyle2, i16, i17, j17, textIndent2, platformTextStyle2, lineHeightStyle2, i18, i15, textMotion2);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32978copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j14;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j16;
        long j17;
        Brush brush2;
        float f11;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i10 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f10;
        long jM32908getFontSizeXSAIIZE = (i10 & 4) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j10;
        FontWeight fontWeight3 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i10 & 16) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i10 & 32) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily3 = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i10 & 256) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j11;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i10 & 512) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i10 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i10 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long jM32905getBackground0d7_KjU = (i10 & 4096) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j12;
        float f12 = alpha;
        TextDecoration textDecoration3 = (i10 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i10 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i10 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM33378boximpl = (i10 & 65536) != 0 ? TextAlign.m33378boximpl(textStyle.paragraphStyle.m32861getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM33392boximpl = (i10 & 131072) != 0 ? TextDirection.m33392boximpl(textStyle.paragraphStyle.m32863getTextDirections_7Xco()) : textDirection;
        long jM32859getLineHeightXSAIIZE = (i10 & 262144) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j13;
        TextIndent textIndent3 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i10 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM33286boximpl = (i10 & 4194304) != 0 ? LineBreak.m33286boximpl(textStyle.paragraphStyle.m32858getLineBreakrAG3T2k()) : lineBreak;
        Hyphens hyphensM33276boximpl = (i10 & 8388608) != 0 ? Hyphens.m33276boximpl(textStyle.paragraphStyle.m32856getHyphensvmbZdU8()) : hyphens;
        if ((i10 & 16777216) != 0) {
            hyphens2 = hyphensM33276boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM33378boximpl;
            textDirection2 = textDirectionM33392boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = lineBreakM33286boximpl;
            shadow2 = shadow3;
            j14 = jM32908getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM32909getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM32910getFontSynthesisZQGJjVo;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j15 = jM32911getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM32906getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = jM32905getBackground0d7_KjU;
            j17 = jM32859getLineHeightXSAIIZE;
            brush2 = brush;
            f11 = f12;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM33276boximpl;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlignM33378boximpl;
            textDirection2 = textDirectionM33392boximpl;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j14 = jM32908getFontSizeXSAIIZE;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyleM32909getFontStyle4Lr2A7w;
            fontSynthesis2 = fontSynthesisM32910getFontSynthesisZQGJjVo;
            str2 = fontFeatureSettings;
            j15 = jM32911getLetterSpacingXSAIIZE;
            baselineShift2 = baselineShiftM32906getBaselineShift5SSeXJ0;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = jM32905getBackground0d7_KjU;
            j17 = jM32859getLineHeightXSAIIZE;
            brush2 = brush;
            f11 = f12;
            lineBreak2 = lineBreakM33286boximpl;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m32991copyaIRg9q4(brush2, f11, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j16, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j17, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32979copyp1EtxEg$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
        TextMotion textMotion2;
        int i15;
        long jM32907getColor0d7_KjU = (i14 & 1) != 0 ? textStyle.spanStyle.m32907getColor0d7_KjU() : j10;
        long jM32908getFontSizeXSAIIZE = (i14 & 2) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight2 = (i14 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i14 & 8) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i14 & 16) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i14 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i14 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i14 & 128) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j12;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i14 & 256) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i14 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i14 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM32907getColor0d7_KjU;
        long jM32905getBackground0d7_KjU = (i14 & 2048) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i14 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i14 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i14 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        int iM32861getTextAligne0LSkKk = (i14 & 32768) != 0 ? textStyle.paragraphStyle.m32861getTextAligne0LSkKk() : i10;
        int iM32863getTextDirections_7Xco = (i14 & 65536) != 0 ? textStyle.paragraphStyle.m32863getTextDirections_7Xco() : i11;
        long jM32859getLineHeightXSAIIZE = (i14 & 131072) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j14;
        TextIndent textIndent2 = (i14 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iM32858getLineBreakrAG3T2k = (i14 & 2097152) != 0 ? textStyle.paragraphStyle.m32858getLineBreakrAG3T2k() : i12;
        int iM32856getHyphensvmbZdU8 = (i14 & 4194304) != 0 ? textStyle.paragraphStyle.m32856getHyphensvmbZdU8() : i13;
        if ((i14 & 8388608) != 0) {
            i15 = iM32856getHyphensvmbZdU8;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            i15 = iM32856getHyphensvmbZdU8;
        }
        return textStyle.m32992copyp1EtxEg(j15, jM32908getFontSizeXSAIIZE, fontWeight2, fontStyleM32909getFontStyle4Lr2A7w, fontSynthesisM32910getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM32911getLetterSpacingXSAIIZE, baselineShiftM32906getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM32905getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, iM32861getTextAligne0LSkKk, iM32863getTextDirections_7Xco, jM32859getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, iM32858getLineBreakrAG3T2k, i15, textMotion2);
    }

    /* renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m32980copyv2rsoow$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long jM32907getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m32907getColor0d7_KjU() : j10;
        long jM32908getFontSizeXSAIIZE = (i10 & 2) != 0 ? textStyle.spanStyle.m32908getFontSizeXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyleM32909getFontStyle4Lr2A7w = (i10 & 8) != 0 ? textStyle.spanStyle.m32909getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis fontSynthesisM32910getFontSynthesisZQGJjVo = (i10 & 16) != 0 ? textStyle.spanStyle.m32910getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jM32911getLetterSpacingXSAIIZE = (i10 & 128) != 0 ? textStyle.spanStyle.m32911getLetterSpacingXSAIIZE() : j12;
        BaselineShift baselineShiftM32906getBaselineShift5SSeXJ0 = (i10 & 256) != 0 ? textStyle.spanStyle.m32906getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM32907getColor0d7_KjU;
        long jM32905getBackground0d7_KjU = (i10 & 2048) != 0 ? textStyle.spanStyle.m32905getBackground0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlignM33378boximpl = (i10 & 32768) != 0 ? TextAlign.m33378boximpl(textStyle.paragraphStyle.m32861getTextAligne0LSkKk()) : textAlign;
        TextDirection textDirectionM33392boximpl = (i10 & 65536) != 0 ? TextDirection.m33392boximpl(textStyle.paragraphStyle.m32863getTextDirections_7Xco()) : textDirection;
        long jM32859getLineHeightXSAIIZE = (i10 & 131072) != 0 ? textStyle.paragraphStyle.m32859getLineHeightXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreakM33286boximpl = (i10 & 2097152) != 0 ? LineBreak.m33286boximpl(textStyle.paragraphStyle.m32858getLineBreakrAG3T2k()) : lineBreak;
        Hyphens hyphensM33276boximpl = (i10 & 4194304) != 0 ? Hyphens.m33276boximpl(textStyle.paragraphStyle.m32856getHyphensvmbZdU8()) : hyphens;
        if ((i10 & 8388608) != 0) {
            hyphens2 = hyphensM33276boximpl;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphensM33276boximpl;
        }
        return textStyle.m32993copyv2rsoow(j15, jM32908getFontSizeXSAIIZE, fontWeight2, fontStyleM32909getFontStyle4Lr2A7w, fontSynthesisM32910getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM32911getLetterSpacingXSAIIZE, baselineShiftM32906getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM32905getBackground0d7_KjU, textDecoration3, shadow2, drawStyle2, textAlignM33378boximpl, textDirectionM33392boximpl, jM32859getLineHeightXSAIIZE, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreakM33286boximpl, hyphens2, textMotion2);
    }

    @InterfaceC10770a
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m32981getHyphensEaSxIns$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m32982getLineBreakLgCVezo$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m32983getTextAlignbuA522U$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m32984getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @InterfaceC10770a
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m32987copyCXVQc50(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m30879equalsimpl0(j10, this.spanStyle.m32907getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m33406from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), getTextMotion(), (AbstractC9972n) null), platformTextStyle);
    }

    @InterfaceC10770a
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m32988copyHL5avdY(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m30879equalsimpl0(j10, this.spanStyle.m32907getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m33406from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m33004getLineBreakrAG3T2k(), m33001getHyphensvmbZdU8(), getTextMotion(), (AbstractC9972n) null), this.platformStyle);
    }

    @InterfaceC10770a
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m32989copyNOaFTUo(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m30879equalsimpl0(j10, this.spanStyle.m32907getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m33406from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m33004getLineBreakrAG3T2k(), m33001getHyphensvmbZdU8(), getTextMotion(), (AbstractC9972n) null), platformTextStyle);
    }

    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m32990copyNs73l9s(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(i10, i11, j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i12, i13, textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    @InterfaceC10770a
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m32991copyaIRg9q4(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m32992copyp1EtxEg(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m30879equalsimpl0(j10, this.spanStyle.m32907getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m33406from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i12, i13, textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    @InterfaceC10770a
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m32993copyv2rsoow(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m30879equalsimpl0(j10, this.spanStyle.m32907getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle$ui_text_release() : TextForegroundStyle.Companion.m33406from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return AbstractC9979u.m20289b(this.spanStyle, textStyle.spanStyle) && AbstractC9979u.m20289b(this.paragraphStyle, textStyle.paragraphStyle) && AbstractC9979u.m20289b(this.platformStyle, textStyle.platformStyle);
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m32994getBackground0d7_KjU() {
        return this.spanStyle.m32905getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m32995getBaselineShift5SSeXJ0() {
        return this.spanStyle.m32906getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m32996getColor0d7_KjU() {
        return this.spanStyle.m32907getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m32997getFontSizeXSAIIZE() {
        return this.spanStyle.m32908getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m32998getFontStyle4Lr2A7w() {
        return this.spanStyle.m32909getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m32999getFontSynthesisZQGJjVo() {
        return this.spanStyle.m32910getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m33000getHyphensEaSxIns() {
        return Hyphens.m33276boximpl(m33001getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m33001getHyphensvmbZdU8() {
        return this.paragraphStyle.m32856getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m33002getLetterSpacingXSAIIZE() {
        return this.spanStyle.m32911getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m33003getLineBreakLgCVezo() {
        return LineBreak.m33286boximpl(m33004getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m33004getLineBreakrAG3T2k() {
        return this.paragraphStyle.m32858getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m33005getLineHeightXSAIIZE() {
        return this.paragraphStyle.m32859getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m33006getTextAlignbuA522U() {
        return TextAlign.m33378boximpl(m33007getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m33007getTextAligne0LSkKk() {
        return this.paragraphStyle.m32861getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m33008getTextDirectionmmuk1to() {
        return TextDirection.m33392boximpl(m33009getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m33009getTextDirections_7Xco() {
        return this.paragraphStyle.m32863getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle) {
            return AbstractC9979u.m20289b(this.paragraphStyle, textStyle.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCodeLayoutAffectingAttributes$ui_text_release + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @Stable
    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || AbstractC9979u.m20289b(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    @InterfaceC10770a
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m33010mergeZ1GrekI(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM32912fastMergedSHsh3o = SpanStyleKt.m32912fastMergedSHsh3o(this.spanStyle, j10, null, Float.NaN, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM32864fastMergej5T8yCg = ParagraphStyleKt.m32864fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM32912fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM32864fastMergej5T8yCg) ? this : new TextStyle(spanStyleM32912fastMergedSHsh3o, paragraphStyleM32864fastMergej5T8yCg);
    }

    @Stable
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m33011mergedA7vx0o(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i12, int i13, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM32912fastMergedSHsh3o = SpanStyleKt.m32912fastMergedSHsh3o(this.spanStyle, j10, null, Float.NaN, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM32864fastMergej5T8yCg = ParagraphStyleKt.m32864fastMergej5T8yCg(this.paragraphStyle, i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i12, i13, textMotion);
        return (this.spanStyle == spanStyleM32912fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM32864fastMergej5T8yCg) ? this : new TextStyle(spanStyleM32912fastMergedSHsh3o, paragraphStyleM32864fastMergej5T8yCg);
    }

    @Stable
    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    @Stable
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m30886toStringimpl(m32996getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m33702toStringimpl(m32997getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m32998getFontStyle4Lr2A7w() + ", fontSynthesis=" + m32999getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m33702toStringimpl(m33002getLetterSpacingXSAIIZE())) + ", baselineShift=" + m32995getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m30886toStringimpl(m32994getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m33383toStringimpl(m33007getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m33397toStringimpl(m33009getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m33702toStringimpl(m33005getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m33297toStringimpl(m33004getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m33281toStringimpl(m33001getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @InterfaceC10770a
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    @InterfaceC10770a
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC9972n abstractC9972n) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @InterfaceC10770a
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, AbstractC9972n abstractC9972n) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle);
    }

    @InterfaceC10770a
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, AbstractC9972n abstractC9972n) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, drawStyle, i10, i11, j13, textIndent, platformTextStyle, lineHeightStyle, i12, i13, textMotion);
    }

    @Stable
    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    @InterfaceC10770a
    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, drawStyle, textAlign, textDirection, j13, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i10, AbstractC9972n abstractC9972n) {
        this(spanStyle, paragraphStyle, (i10 & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, AbstractC9972n abstractC9972n) {
        long jM30914getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM33706getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM33706getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM30914getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM30914getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM33706getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j14;
        long j16 = jM33706getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM33706getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM30914getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM33706getUnspecifiedXSAIIZE3, (i10 & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent) {
        SpanStyle spanStyle = new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (AbstractC9972n) null);
        this(spanStyle, new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9972n) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, AbstractC9972n abstractC9972n) {
        long jM30914getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM33706getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM33706getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM30914getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM30914getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM33706getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        long j16 = jM33706getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM33706getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM30914getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM33706getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, (i10 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9972n) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, AbstractC9972n abstractC9972n) {
        long jM30914getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM33706getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM33706getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM30914getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM30914getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM33706getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 1048576) != 0 ? null : lineBreak;
        long j16 = jM33706getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM33706getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM30914getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM33706getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, (i10 & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        SpanStyle spanStyle = new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (AbstractC9972n) null);
        int iM33384unboximpl = textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk();
        int iM33398unboximpl = textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco();
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        this(spanStyle, new ParagraphStyle(iM33384unboximpl, iM33398unboximpl, j14, textIndent, paragraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (AbstractC9972n) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, AbstractC9972n abstractC9972n) {
        long jM30914getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM33706getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM33706getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM30914getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j15 = jM30914getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i10 & 32768) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 65536) != 0 ? null : textDirection;
        long jM33706getUnspecifiedXSAIIZE3 = (i10 & 131072) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i10 & 4194304) != 0 ? null : hyphens;
        long j16 = jM33706getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM33706getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM30914getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, jM33706getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i10 & 8388608) != 0 ? null : textMotion, (AbstractC9972n) null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, AbstractC9972n abstractC9972n) {
        long jM30914getUnspecified0d7_KjU = (i14 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM33706getUnspecifiedXSAIIZE = (i14 & 2) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i14 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i14 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i14 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i14 & 32) != 0 ? null : fontFamily;
        String str2 = (i14 & 64) != 0 ? null : str;
        long jM33706getUnspecifiedXSAIIZE2 = (i14 & 128) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i14 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i14 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i14 & 1024) != 0 ? null : localeList;
        long jM30914getUnspecified0d7_KjU2 = (i14 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i14 & 4096) != 0 ? null : textDecoration;
        long j15 = jM30914getUnspecified0d7_KjU;
        Shadow shadow2 = (i14 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i14 & 16384) != 0 ? null : drawStyle;
        int iM33391getUnspecifiede0LSkKk = (i14 & 32768) != 0 ? TextAlign.Companion.m33391getUnspecifiede0LSkKk() : i10;
        int iM33404getUnspecifieds_7Xco = (i14 & 65536) != 0 ? TextDirection.Companion.m33404getUnspecifieds_7Xco() : i11;
        long jM33706getUnspecifiedXSAIIZE3 = (i14 & 131072) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i14 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 1048576) != 0 ? null : lineHeightStyle;
        int iM33306getUnspecifiedrAG3T2k = (i14 & 2097152) != 0 ? LineBreak.Companion.m33306getUnspecifiedrAG3T2k() : i12;
        int iM33285getUnspecifiedvmbZdU8 = (i14 & 4194304) != 0 ? Hyphens.Companion.m33285getUnspecifiedvmbZdU8() : i13;
        long j16 = jM33706getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM33706getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM30914getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, drawStyle2, iM33391getUnspecifiede0LSkKk, iM33404getUnspecifieds_7Xco, jM33706getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, iM33306getUnspecifiedrAG3T2k, iM33285getUnspecifiedvmbZdU8, (i14 & 8388608) != 0 ? null : textMotion, (AbstractC9972n) null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i12, i13, textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, AbstractC9972n abstractC9972n) {
        this(brush, (i14 & 2) != 0 ? Float.NaN : f10, (i14 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i14 & 8) != 0 ? null : fontWeight, (i14 & 16) != 0 ? null : fontStyle, (i14 & 32) != 0 ? null : fontSynthesis, (i14 & 64) != 0 ? null : fontFamily, (i14 & 128) != 0 ? null : str, (i14 & 256) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11, (i14 & 512) != 0 ? null : baselineShift, (i14 & 1024) != 0 ? null : textGeometricTransform, (i14 & 2048) != 0 ? null : localeList, (i14 & 4096) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12, (i14 & 8192) != 0 ? null : textDecoration, (i14 & 16384) != 0 ? null : shadow, (32768 & i14) != 0 ? null : drawStyle, (65536 & i14) != 0 ? TextAlign.Companion.m33391getUnspecifiede0LSkKk() : i10, (131072 & i14) != 0 ? TextDirection.Companion.m33404getUnspecifieds_7Xco() : i11, (262144 & i14) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j13, (524288 & i14) != 0 ? null : textIndent, (1048576 & i14) != 0 ? null : platformTextStyle, (2097152 & i14) != 0 ? null : lineHeightStyle, (4194304 & i14) != 0 ? LineBreak.Companion.m33306getUnspecifiedrAG3T2k() : i12, (8388608 & i14) != 0 ? Hyphens.Companion.m33285getUnspecifiedvmbZdU8() : i13, (i14 & 16777216) != 0 ? null : textMotion, (AbstractC9972n) null);
    }

    private TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i10, int i11, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        this(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(i10, i11, j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i12, i13, textMotion, (AbstractC9972n) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, AbstractC9972n abstractC9972n) {
        this(brush, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : fontStyle, (i10 & 32) != 0 ? null : fontSynthesis, (i10 & 64) != 0 ? null : fontFamily, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j11, (i10 & 512) != 0 ? null : baselineShift, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : localeList, (i10 & 4096) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12, (i10 & 8192) != 0 ? null : textDecoration, (i10 & 16384) != 0 ? null : shadow, (32768 & i10) != 0 ? null : drawStyle, (65536 & i10) != 0 ? null : textAlign, (131072 & i10) != 0 ? null : textDirection, (262144 & i10) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j13, (524288 & i10) != 0 ? null : textIndent, (1048576 & i10) != 0 ? null : platformTextStyle, (2097152 & i10) != 0 ? null : lineHeightStyle, (4194304 & i10) != 0 ? null : lineBreak, (8388608 & i10) != 0 ? null : hyphens, (i10 & 16777216) != 0 ? null : textMotion, (AbstractC9972n) null);
    }

    private TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC9972n) null), new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null), platformTextStyle);
    }
}
