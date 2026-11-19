package androidx.compose.p006ui.text;

import androidx.compose.p006ui.text.style.Hyphens;
import androidx.compose.p006ui.text.style.LineBreak;
import androidx.compose.p006ui.text.style.LineHeightStyle;
import androidx.compose.p006ui.text.style.TextAlign;
import androidx.compose.p006ui.text.style.TextDirection;
import androidx.compose.p006ui.text.style.TextIndent;
import androidx.compose.p006ui.text.style.TextMotion;
import androidx.compose.p006ui.unit.TextUnit;
import androidx.compose.p006ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(m5174d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B8\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nBP\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fBh\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014Bt\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017JC\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J[\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109Jq\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u007f\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010A\u001a\u00020BH\u0016J\u0014\u0010C\u001a\u00020\u00002\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0000H\u0007J\u0014\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010@\u001a\u0004\u0018\u00010\fH\u0002J\u0011\u0010E\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0000H\u0087\u0002J\b\u0010F\u001a\u00020GH\u0016R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\u00020\u0013X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\u00020\u0011X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010+\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, m5175d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "hyphensOrDefault", "getHyphensOrDefault-vmbZdU8$ui_text_release", "()I", "I", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "lineBreakOrDefault", "getLineBreakOrDefault-rAG3T2k$ui_text_release", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "textAlignOrDefault", "getTextAlignOrDefault-e0LSkKk$ui_text_release", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion$annotations", "()V", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "mergePlatformStyle", "plus", "toString", "", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final Hyphens hyphens;
    private final int hyphensOrDefault;
    private final LineBreak lineBreak;
    private final int lineBreakOrDefault;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final TextAlign textAlign;
    private final int textAlignOrDefault;
    private final TextDirection textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    @ExperimentalTextApi
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10981copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i4 & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i4 & 4) != 0) {
            j4 = paragraphStyle.lineHeight;
        }
        long j5 = j4;
        if ((i4 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m10985copyElsmlbk(textAlign, textDirection2, j5, textIndent);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m10984copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textAlign = paragraphStyle.textAlign;
        }
        if ((i4 & 2) != 0) {
            textDirection = paragraphStyle.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        if ((i4 & 4) != 0) {
            j4 = paragraphStyle.lineHeight;
        }
        long j5 = j4;
        if ((i4 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i4 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i4 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m10988copyxPh5V4g(textAlign, textDirection2, j5, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getTextMotion$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    private final PlatformParagraphStyle mergePlatformStyle(PlatformParagraphStyle other) {
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        return platformParagraphStyle == null ? other : other == null ? platformParagraphStyle : platformParagraphStyle.merge(other);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10985copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final ParagraphStyle m10986copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final ParagraphStyle m10987copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m10988copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return Intrinsics.areEqual(this.textAlign, paragraphStyle.textAlign) && Intrinsics.areEqual(this.textDirection, paragraphStyle.textDirection) && TextUnit.m11703equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && Intrinsics.areEqual(this.lineBreak, paragraphStyle.lineBreak) && Intrinsics.areEqual(this.hyphens, paragraphStyle.hyphens) && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name and from getter */
    public final Hyphens getHyphens() {
        return this.hyphens;
    }

    /* renamed from: getHyphensOrDefault-vmbZdU8$ui_text_release, reason: not valid java name and from getter */
    public final int getHyphensOrDefault() {
        return this.hyphensOrDefault;
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name and from getter */
    public final LineBreak getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: getLineBreakOrDefault-rAG3T2k$ui_text_release, reason: not valid java name and from getter */
    public final int getLineBreakOrDefault() {
        return this.lineBreakOrDefault;
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name and from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name and from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: getTextAlignOrDefault-e0LSkKk$ui_text_release, reason: not valid java name and from getter */
    public final int getTextAlignOrDefault() {
        return this.textAlignOrDefault;
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name and from getter */
    public final TextDirection getTextDirection() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @ExperimentalTextApi
    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        TextAlign textAlign = this.textAlign;
        int iM11428hashCodeimpl = (textAlign != null ? TextAlign.m11428hashCodeimpl(textAlign.getValue()) : 0) * 31;
        TextDirection textDirection = this.textDirection;
        int iM11441hashCodeimpl = (((iM11428hashCodeimpl + (textDirection != null ? TextDirection.m11441hashCodeimpl(textDirection.getValue()) : 0)) * 31) + TextUnit.m11707hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM11441hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31;
        LineBreak lineBreak = this.lineBreak;
        int iM11358hashCodeimpl = (iHashCode3 + (lineBreak != null ? LineBreak.m11358hashCodeimpl(lineBreak.getMask()) : 0)) * 31;
        Hyphens hyphens = this.hyphens;
        int iM11343hashCodeimpl = (iM11358hashCodeimpl + (hyphens != null ? Hyphens.m11343hashCodeimpl(hyphens.getValue()) : 0)) * 31;
        TextMotion textMotion = this.textMotion;
        return iM11343hashCodeimpl + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle other) {
        if (other == null) {
            return this;
        }
        long j4 = TextUnitKt.m11724isUnspecifiedR2X_6o(other.lineHeight) ? this.lineHeight : other.lineHeight;
        TextIndent textIndent = other.textIndent;
        if (textIndent == null) {
            textIndent = this.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        TextAlign textAlign = other.textAlign;
        if (textAlign == null) {
            textAlign = this.textAlign;
        }
        TextAlign textAlign2 = textAlign;
        TextDirection textDirection = other.textDirection;
        if (textDirection == null) {
            textDirection = this.textDirection;
        }
        TextDirection textDirection2 = textDirection;
        PlatformParagraphStyle platformParagraphStyleMergePlatformStyle = mergePlatformStyle(other.platformStyle);
        LineHeightStyle lineHeightStyle = other.lineHeightStyle;
        if (lineHeightStyle == null) {
            lineHeightStyle = this.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        LineBreak lineBreak = other.lineBreak;
        if (lineBreak == null) {
            lineBreak = this.lineBreak;
        }
        LineBreak lineBreak2 = lineBreak;
        Hyphens hyphens = other.hyphens;
        if (hyphens == null) {
            hyphens = this.hyphens;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion = other.textMotion;
        if (textMotion == null) {
            textMotion = this.textMotion;
        }
        return new ParagraphStyle(textAlign2, textDirection2, j4, textIndent2, platformParagraphStyleMergePlatformStyle, lineHeightStyle2, lineBreak2, hyphens2, textMotion, (DefaultConstructorMarker) null);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + ((Object) TextUnit.m11713toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + this.lineBreak + ", hyphens=" + this.hyphens + ", textMotion=" + this.textMotion + ')';
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j4, textIndent);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j4;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = lineBreak;
        this.hyphens = hyphens;
        this.textMotion = textMotion;
        this.textAlignOrDefault = textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m11436getStarte0LSkKk();
        this.lineBreakOrDefault = lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m11363getSimplerAG3T2k();
        this.hyphensOrDefault = hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m11347getNonevmbZdU8();
        if (TextUnit.m11703equalsimpl0(j4, TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m11706getValueimpl(j4) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m11706getValueimpl(j4) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : textAlign, (i4 & 2) != 0 ? null : textDirection, (i4 & 4) != 0 ? TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE() : j4, (i4 & 8) != 0 ? null : textIndent, (i4 & 16) != 0 ? null : platformParagraphStyle, (i4 & 32) != 0 ? null : lineHeightStyle, (i4 & 64) != 0 ? null : lineBreak, (i4 & 128) != 0 ? null : hyphens, (i4 & 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : textAlign, (i4 & 2) != 0 ? null : textDirection, (i4 & 4) != 0 ? TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE() : j4, (i4 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent) {
        this(textAlign, textDirection, j4, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : textAlign, (i4 & 2) != 0 ? null : textDirection, (i4 & 4) != 0 ? TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE() : j4, (i4 & 8) != 0 ? null : textIndent, (i4 & 16) != 0 ? null : platformParagraphStyle, (i4 & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : textAlign, (i4 & 2) != 0 ? null : textDirection, (i4 & 4) != 0 ? TextUnit.INSTANCE.m11717getUnspecifiedXSAIIZE() : j4, (i4 & 8) != 0 ? null : textIndent, (i4 & 16) != 0 ? null : platformParagraphStyle, (i4 & 32) != 0 ? null : lineHeightStyle, (i4 & 64) != 0 ? null : lineBreak, (i4 & 128) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign, textDirection, j4, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
