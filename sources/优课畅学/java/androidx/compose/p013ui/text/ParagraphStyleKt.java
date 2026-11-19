package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.style.Hyphens;
import androidx.compose.p013ui.text.style.LineBreak;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDirection;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextIndentKt;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m27104getUnspecifiedXSAIIZE();

    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m26262fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        long j11;
        long j12;
        int iM26259getTextAligne0LSkKk = i10;
        TextIndent textIndent2 = textIndent;
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m26779equalsimpl0(iM26259getTextAligne0LSkKk, companion.m26789getUnspecifiede0LSkKk()) || TextAlign.m26779equalsimpl0(iM26259getTextAligne0LSkKk, paragraphStyle.m26259getTextAligne0LSkKk())) {
            if (TextUnit.m27091getRawTypeimpl(j10) == 0) {
                j11 = 0;
                j12 = j10;
            } else {
                j11 = 0;
                j12 = j10;
                if (TextUnit.m27090equalsimpl0(j12, paragraphStyle.m26257getLineHeightXSAIIZE())) {
                }
            }
            if ((textIndent2 == null || AbstractC9133u.m16128b(textIndent2, paragraphStyle.getTextIndent())) && ((TextDirection.m26793equalsimpl0(i11, TextDirection.Companion.m26802getUnspecifieds_7Xco()) || TextDirection.m26793equalsimpl0(i11, paragraphStyle.m26261getTextDirections_7Xco())) && ((platformParagraphStyle == null || AbstractC9133u.m16128b(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || AbstractC9133u.m16128b(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((LineBreak.m26690equalsimpl0(i12, LineBreak.Companion.m26704getUnspecifiedrAG3T2k()) || LineBreak.m26690equalsimpl0(i12, paragraphStyle.m26256getLineBreakrAG3T2k())) && ((Hyphens.m26677equalsimpl0(i13, Hyphens.Companion.m26683getUnspecifiedvmbZdU8()) || Hyphens.m26677equalsimpl0(i13, paragraphStyle.m26254getHyphensvmbZdU8())) && (textMotion == null || AbstractC9133u.m16128b(textMotion, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j11 = 0;
            j12 = j10;
        }
        long jM26257getLineHeightXSAIIZE = TextUnit.m27091getRawTypeimpl(j12) == j11 ? paragraphStyle.m26257getLineHeightXSAIIZE() : j12;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m26779equalsimpl0(iM26259getTextAligne0LSkKk, companion.m26789getUnspecifiede0LSkKk())) {
            iM26259getTextAligne0LSkKk = paragraphStyle.m26259getTextAligne0LSkKk();
        }
        return new ParagraphStyle(iM26259getTextAligne0LSkKk, !TextDirection.m26793equalsimpl0(i11, TextDirection.Companion.m26802getUnspecifieds_7Xco()) ? i11 : paragraphStyle.m26261getTextDirections_7Xco(), jM26257getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !LineBreak.m26690equalsimpl0(i12, LineBreak.Companion.m26704getUnspecifiedrAG3T2k()) ? i12 : paragraphStyle.m26256getLineBreakrAG3T2k(), !Hyphens.m26677equalsimpl0(i13, Hyphens.Companion.m26683getUnspecifiedvmbZdU8()) ? i13 : paragraphStyle.m26254getHyphensvmbZdU8(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (AbstractC9126n) null);
    }

    @Stable
    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f10) {
        int iM26782unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m26776boximpl(paragraphStyle.m26259getTextAligne0LSkKk()), TextAlign.m26776boximpl(paragraphStyle2.m26259getTextAligne0LSkKk()), f10)).m26782unboximpl();
        int iM26796unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m26790boximpl(paragraphStyle.m26261getTextDirections_7Xco()), TextDirection.m26790boximpl(paragraphStyle2.m26261getTextDirections_7Xco()), f10)).m26796unboximpl();
        long jM26311lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m26311lerpTextUnitInheritableC3pnCVY(paragraphStyle.m26257getLineHeightXSAIIZE(), paragraphStyle2.m26257getLineHeightXSAIIZE(), f10);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(iM26782unboximpl, iM26796unboximpl, jM26311lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f10), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f10), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f10), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m26684boximpl(paragraphStyle.m26256getLineBreakrAG3T2k()), LineBreak.m26684boximpl(paragraphStyle2.m26256getLineBreakrAG3T2k()), f10)).m26696unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m26674boximpl(paragraphStyle.m26254getHyphensvmbZdU8()), Hyphens.m26674boximpl(paragraphStyle2.m26254getHyphensvmbZdU8()), f10)).m26680unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f10), (AbstractC9126n) null);
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
        int iM26259getTextAligne0LSkKk = paragraphStyle.m26259getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int iM26788getStarte0LSkKk = TextAlign.m26779equalsimpl0(iM26259getTextAligne0LSkKk, companion.m26789getUnspecifiede0LSkKk()) ? companion.m26788getStarte0LSkKk() : paragraphStyle.m26259getTextAligne0LSkKk();
        int iM26410resolveTextDirectionIhaHGbI = TextStyleKt.m26410resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m26261getTextDirections_7Xco());
        long jM26257getLineHeightXSAIIZE = TextUnit.m27091getRawTypeimpl(paragraphStyle.m26257getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m26257getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int iM26256getLineBreakrAG3T2k = paragraphStyle.m26256getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int iM26703getSimplerAG3T2k = LineBreak.m26690equalsimpl0(iM26256getLineBreakrAG3T2k, companion2.m26704getUnspecifiedrAG3T2k()) ? companion2.m26703getSimplerAG3T2k() : paragraphStyle.m26256getLineBreakrAG3T2k();
        int iM26254getHyphensvmbZdU8 = paragraphStyle.m26254getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int iM26682getNonevmbZdU8 = Hyphens.m26677equalsimpl0(iM26254getHyphensvmbZdU8, companion3.m26683getUnspecifiedvmbZdU8()) ? companion3.m26682getNonevmbZdU8() : paragraphStyle.m26254getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(iM26788getStarte0LSkKk, iM26410resolveTextDirectionIhaHGbI, jM26257getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, iM26703getSimplerAG3T2k, iM26682getNonevmbZdU8, textMotion, (AbstractC9126n) null);
    }
}
