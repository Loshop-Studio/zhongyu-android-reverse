package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.style.Hyphens;
import androidx.compose.p013ui.text.style.LineBreak;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDirection;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

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

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, AbstractC9126n abstractC9126n) {
        this(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m26239copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m26776boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m26790boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m26248copyElsmlbk(textAlign, textDirection, j10, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m26240copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m26776boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m26790boximpl(paragraphStyle.textDirection);
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
            lineBreak = LineBreak.m26684boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m26674boximpl(paragraphStyle.hyphens);
        }
        if ((i10 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j11 = j10;
        return paragraphStyle.m26249copyNH1kkwU(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m26241copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m26776boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m26790boximpl(paragraphStyle.textDirection);
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
            lineBreak = LineBreak.m26684boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m26674boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j11 = j10;
        return paragraphStyle.m26250copyciSxzs0(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m26242copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m26776boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m26790boximpl(paragraphStyle.textDirection);
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
        return paragraphStyle.m26251copyxPh5V4g(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m26243copyykzQM6k$default(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
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
        return paragraphStyle.m26252copyykzQM6k(i10, i11, j11, textIndent, platformParagraphStyle, lineHeightStyle, i12, i15, textMotion2);
    }

    @InterfaceC8721a
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m26244getHyphensEaSxIns$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m26245getLineBreakLgCVezo$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m26246getTextAlignbuA522U$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m26247getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @InterfaceC8721a
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m26248copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC9126n) null);
    }

    @InterfaceC8721a
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m26249copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m26696unboximpl() : LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m26680unboximpl() : Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), textMotion, (AbstractC9126n) null);
    }

    @InterfaceC8721a
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m26250copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m26696unboximpl() : LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m26680unboximpl() : Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), this.textMotion, (AbstractC9126n) null);
    }

    @InterfaceC8721a
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m26251copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (AbstractC9126n) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m26252copyykzQM6k(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion) {
        return new ParagraphStyle(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, textMotion, (AbstractC9126n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        return TextAlign.m26779equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m26793equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m27090equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && AbstractC9133u.m16128b(this.textIndent, paragraphStyle.textIndent) && AbstractC9133u.m16128b(this.platformStyle, paragraphStyle.platformStyle) && AbstractC9133u.m16128b(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m26690equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m26677equalsimpl0(this.hyphens, paragraphStyle.hyphens) && AbstractC9133u.m16128b(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m26253getHyphensEaSxIns() {
        return Hyphens.m26674boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m26254getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m26255getLineBreakLgCVezo() {
        return LineBreak.m26684boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m26256getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m26257getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m26258getTextAlignbuA522U() {
        return TextAlign.m26776boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m26259getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m26260getTextDirectionmmuk1to() {
        return TextDirection.m26790boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m26261getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int iM26780hashCodeimpl = ((((TextAlign.m26780hashCodeimpl(this.textAlign) * 31) + TextDirection.m26794hashCodeimpl(this.textDirection)) * 31) + TextUnit.m27094hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM26780hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.m26694hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m26678hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        return iHashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m26262fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m26781toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m26795toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m27100toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m26695toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m26679toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @InterfaceC8721a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC9126n abstractC9126n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @InterfaceC8721a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC9126n abstractC9126n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @InterfaceC8721a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, AbstractC9126n abstractC9126n) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @InterfaceC8721a
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, AbstractC9126n abstractC9126n) {
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
        if (TextUnit.m27090equalsimpl0(j10, TextUnit.Companion.m27104getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m27093getValueimpl(j10) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m27093getValueimpl(j10) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, AbstractC9126n abstractC9126n) {
        int iM26789getUnspecifiede0LSkKk = (i14 & 1) != 0 ? TextAlign.Companion.m26789getUnspecifiede0LSkKk() : i10;
        int iM26802getUnspecifieds_7Xco = (i14 & 2) != 0 ? TextDirection.Companion.m26802getUnspecifieds_7Xco() : i11;
        long jM27104getUnspecifiedXSAIIZE = (i14 & 4) != 0 ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : j10;
        TextIndent textIndent2 = (i14 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i14 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 32) != 0 ? null : lineHeightStyle;
        int iM26704getUnspecifiedrAG3T2k = (i14 & 64) != 0 ? LineBreak.Companion.m26704getUnspecifiedrAG3T2k() : i12;
        int iM26683getUnspecifiedvmbZdU8 = (i14 & 128) != 0 ? Hyphens.Companion.m26683getUnspecifiedvmbZdU8() : i13;
        this(iM26789getUnspecifiede0LSkKk, iM26802getUnspecifieds_7Xco, jM27104getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, iM26704getUnspecifiedrAG3T2k, iM26683getUnspecifiedvmbZdU8, (i14 & 256) == 0 ? textMotion : null, (AbstractC9126n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) != 0 ? null : hyphens, (i10 & 256) == 0 ? textMotion : null, (AbstractC9126n) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m26696unboximpl() : LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m26680unboximpl() : Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), textMotion, (AbstractC9126n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9126n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9126n) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.Companion.m27104getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) == 0 ? hyphens : null, (AbstractC9126n) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m26782unboximpl() : TextAlign.Companion.m26789getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m26796unboximpl() : TextDirection.Companion.m26802getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m26696unboximpl() : LineBreak.Companion.m26704getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m26680unboximpl() : Hyphens.Companion.m26683getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC9126n) null);
    }
}
