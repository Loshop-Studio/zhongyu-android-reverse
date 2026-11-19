package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextIndentKt;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m33706getUnspecifiedXSAIIZE();

    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m32864fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        long j11;
        long j12;
        int iM32861getTextAligne0LSkKk = i10;
        TextIndent textIndent2 = textIndent;
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m33381equalsimpl0(iM32861getTextAligne0LSkKk, companion.m33391getUnspecifiede0LSkKk()) || TextAlign.m33381equalsimpl0(iM32861getTextAligne0LSkKk, paragraphStyle.m32861getTextAligne0LSkKk())) {
            if (TextUnit.m33693getRawTypeimpl(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (TextUnit.m33692equalsimpl0(j12, paragraphStyle.m32859getLineHeightXSAIIZE())) {
                }
            }
            if ((textIndent2 == null || AbstractC9979u.m20289b(textIndent2, paragraphStyle.getTextIndent())) && ((TextDirection.m33395equalsimpl0(i11, TextDirection.Companion.m33404getUnspecifieds_7Xco()) || TextDirection.m33395equalsimpl0(i11, paragraphStyle.m32863getTextDirections_7Xco())) && ((platformParagraphStyle == null || AbstractC9979u.m20289b(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || AbstractC9979u.m20289b(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((LineBreak.m33292equalsimpl0(i12, LineBreak.Companion.m33306getUnspecifiedrAG3T2k()) || LineBreak.m33292equalsimpl0(i12, paragraphStyle.m32858getLineBreakrAG3T2k())) && ((Hyphens.m33279equalsimpl0(i13, Hyphens.Companion.m33285getUnspecifiedvmbZdU8()) || Hyphens.m33279equalsimpl0(i13, paragraphStyle.m32856getHyphensvmbZdU8())) && (textMotion == null || AbstractC9979u.m20289b(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long jM32859getLineHeightXSAIIZE = TextUnit.m33693getRawTypeimpl(j12) == j11 ? paragraphStyle.m32859getLineHeightXSAIIZE() : j12;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m33381equalsimpl0(iM32861getTextAligne0LSkKk, companion.m33391getUnspecifiede0LSkKk())) {
            iM32861getTextAligne0LSkKk = paragraphStyle.m32861getTextAligne0LSkKk();
        }
        return new ParagraphStyle(iM32861getTextAligne0LSkKk, !TextDirection.m33395equalsimpl0(i11, TextDirection.Companion.m33404getUnspecifieds_7Xco()) ? i11 : paragraphStyle.m32863getTextDirections_7Xco(), jM32859getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !LineBreak.m33292equalsimpl0(i12, LineBreak.Companion.m33306getUnspecifiedrAG3T2k()) ? i12 : paragraphStyle.m32858getLineBreakrAG3T2k(), !Hyphens.m33279equalsimpl0(i13, Hyphens.Companion.m33285getUnspecifiedvmbZdU8()) ? i13 : paragraphStyle.m32856getHyphensvmbZdU8(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (AbstractC9972n) null);
    }

    @Stable
    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f10) {
        int iM33384unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m33378boximpl(paragraphStyle.m32861getTextAligne0LSkKk()), TextAlign.m33378boximpl(paragraphStyle2.m32861getTextAligne0LSkKk()), f10)).m33384unboximpl();
        int iM33398unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m33392boximpl(paragraphStyle.m32863getTextDirections_7Xco()), TextDirection.m33392boximpl(paragraphStyle2.m32863getTextDirections_7Xco()), f10)).m33398unboximpl();
        long jM32913lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m32913lerpTextUnitInheritableC3pnCVY(paragraphStyle.m32859getLineHeightXSAIIZE(), paragraphStyle2.m32859getLineHeightXSAIIZE(), f10);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(iM33384unboximpl, iM33398unboximpl, jM32913lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f10), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f10), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f10), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m33286boximpl(paragraphStyle.m32858getLineBreakrAG3T2k()), LineBreak.m33286boximpl(paragraphStyle2.m32858getLineBreakrAG3T2k()), f10)).m33298unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m33276boximpl(paragraphStyle.m32856getHyphensvmbZdU8()), Hyphens.m33276boximpl(paragraphStyle2.m32856getHyphensvmbZdU8()), f10)).m33282unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f10), (AbstractC9972n) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f10) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f10);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        return paragraphStyle.getPlatformStyle() == null ? platformParagraphStyle : platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int iM32861getTextAligne0LSkKk = paragraphStyle.m32861getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int iM33390getStarte0LSkKk = TextAlign.m33381equalsimpl0(iM32861getTextAligne0LSkKk, companion.m33391getUnspecifiede0LSkKk()) ? companion.m33390getStarte0LSkKk() : paragraphStyle.m32861getTextAligne0LSkKk();
        int iM33012resolveTextDirectionIhaHGbI = TextStyleKt.m33012resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m32863getTextDirections_7Xco());
        long jM32859getLineHeightXSAIIZE = TextUnit.m33693getRawTypeimpl(paragraphStyle.m32859getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m32859getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int iM32858getLineBreakrAG3T2k = paragraphStyle.m32858getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int iM33305getSimplerAG3T2k = LineBreak.m33292equalsimpl0(iM32858getLineBreakrAG3T2k, companion2.m33306getUnspecifiedrAG3T2k()) ? companion2.m33305getSimplerAG3T2k() : paragraphStyle.m32858getLineBreakrAG3T2k();
        int iM32856getHyphensvmbZdU8 = paragraphStyle.m32856getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int iM33284getNonevmbZdU8 = Hyphens.m33279equalsimpl0(iM32856getHyphensvmbZdU8, companion3.m33285getUnspecifiedvmbZdU8()) ? companion3.m33284getNonevmbZdU8() : paragraphStyle.m32856getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(iM33390getStarte0LSkKk, iM33012resolveTextDirectionIhaHGbI, jM32859getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, iM33305getSimplerAG3T2k, iM33284getNonevmbZdU8, textMotion, (AbstractC9972n) null);
    }
}
