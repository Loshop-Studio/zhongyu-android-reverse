package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m32841copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m33378boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m33392boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m32850copyElsmlbk(textAlign, textDirection, j10, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m32842copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m33378boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m33392boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i10 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i10 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i10 & 64) != 0) {
            lineBreak = LineBreak.m33286boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m33276boximpl(paragraphStyle.hyphens);
        }
        if ((i10 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j11 = j10;
        return paragraphStyle.m32851copyNH1kkwU(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m32843copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m33378boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m33392boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i10 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i10 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i10 & 64) != 0) {
            lineBreak = LineBreak.m33286boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m33276boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j11 = j10;
        return paragraphStyle.m32852copyciSxzs0(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m32844copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m33378boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m33392boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i10 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i10 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j11 = j10;
        return paragraphStyle.m32853copyxPh5V4g(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m32845copyykzQM6k$default(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = paragraphStyle.textAlign;
        }
        if ((i14 & 2) != 0) {
            i11 = paragraphStyle.textDirection;
        }
        if ((i14 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i14 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i14 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i14 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i14 & 64) != 0) {
            i12 = paragraphStyle.lineBreak;
        }
        if ((i14 & 128) != 0) {
            i13 = paragraphStyle.hyphens;
        }
        if ((i14 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        int i15 = i13;
        TextMotion textMotion2 = textMotion;
        long j11 = j10;
        return paragraphStyle.m32854copyykzQM6k(i10, i11, j11, textIndent, platformParagraphStyle, lineHeightStyle, i12, i15, textMotion2);
    }

    @InterfaceC10770a
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m32846getHyphensEaSxIns$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m32847getLineBreakLgCVezo$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m32848getTextAlignbuA522U$annotations() {
    }

    @InterfaceC10770a
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m32849getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @InterfaceC10770a
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m32850copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m32851copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m32852copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), this.textMotion, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m32853copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC9972n) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m32854copyykzQM6k(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        return new ParagraphStyle(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, textMotion, (AbstractC9972n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m33381equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m33395equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m33692equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && AbstractC9979u.m20289b(this.textIndent, paragraphStyle.textIndent) && AbstractC9979u.m20289b(this.platformStyle, paragraphStyle.platformStyle) && AbstractC9979u.m20289b(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m33292equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m33279equalsimpl0(this.hyphens, paragraphStyle.hyphens) && AbstractC9979u.m20289b(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m32855getHyphensEaSxIns() {
        return Hyphens.m33276boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m32856getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m32857getLineBreakLgCVezo() {
        return LineBreak.m33286boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m32858getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m32859getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m32860getTextAlignbuA522U() {
        return TextAlign.m33378boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m32861getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m32862getTextDirectionmmuk1to() {
        return TextDirection.m33392boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m32863getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int iM33382hashCodeimpl = ((((TextAlign.m33382hashCodeimpl(this.textAlign) * 31) + TextDirection.m33396hashCodeimpl(this.textDirection)) * 31) + TextUnit.m33696hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM33382hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.m33296hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m33280hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        return iHashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m32864fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m33383toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m33397toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m33702toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m33297toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m33281toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @InterfaceC10770a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC9972n abstractC9972n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @InterfaceC10770a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC9972n abstractC9972n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @InterfaceC10770a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, AbstractC9972n abstractC9972n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @InterfaceC10770a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, AbstractC9972n abstractC9972n) {
        this(textAlign, textDirection, j10, textIndent);
    }

    private ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        this.textAlign = i10;
        this.textDirection = i11;
        this.lineHeight = j10;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i12;
        this.hyphens = i13;
        this.textMotion = textMotion;
        if (TextUnit.m33692equalsimpl0(j10, TextUnit.Companion.m33706getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m33695getValueimpl(j10) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m33695getValueimpl(j10) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, AbstractC9972n abstractC9972n) {
        int iM33391getUnspecifiede0LSkKk = (i14 & 1) != 0 ? TextAlign.Companion.m33391getUnspecifiede0LSkKk() : i10;
        int iM33404getUnspecifieds_7Xco = (i14 & 2) != 0 ? TextDirection.Companion.m33404getUnspecifieds_7Xco() : i11;
        long jM33706getUnspecifiedXSAIIZE = (i14 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10;
        TextIndent textIndent2 = (i14 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i14 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 32) != 0 ? null : lineHeightStyle;
        int iM33306getUnspecifiedrAG3T2k = (i14 & 64) != 0 ? LineBreak.Companion.m33306getUnspecifiedrAG3T2k() : i12;
        int iM33285getUnspecifiedvmbZdU8 = (i14 & 128) != 0 ? Hyphens.Companion.m33285getUnspecifiedvmbZdU8() : i13;
        this(iM33391getUnspecifiede0LSkKk, iM33404getUnspecifieds_7Xco, jM33706getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, iM33306getUnspecifiedrAG3T2k, iM33285getUnspecifiedvmbZdU8, (i14 & 256) == 0 ? textMotion : null, (AbstractC9972n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) != 0 ? null : hyphens, (i10 & 256) == 0 ? textMotion : null, (AbstractC9972n) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), textMotion, (AbstractC9972n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9972n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9972n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m33706getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) == 0 ? hyphens : null, (AbstractC9972n) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m33384unboximpl() : TextAlign.Companion.m33391getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m33398unboximpl() : TextDirection.Companion.m33404getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m33298unboximpl() : LineBreak.Companion.m33306getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m33282unboximpl() : Hyphens.Companion.m33285getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9972n) null);
    }
}
