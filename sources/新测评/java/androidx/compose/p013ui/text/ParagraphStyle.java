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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B5\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015BM\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016Be\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0017Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018Jr\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b<\u0010=J@\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJp\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ|\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0014\u0010L\u001a\u00020\u00002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010M\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0087\u0002J\b\u0010N\u001a\u00020OH\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b5\u0010+R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b6\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m13558d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getHyphens-vmbZdU8", "()I", "I", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,531:1\n77#2,8:532\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyle\n*L\n208#1:532,8\n*E\n"})
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

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m22902copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m23438boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m23452boximpl(paragraphStyle.textDirection);
        }
        if ((i10 & 4) != 0) {
            j10 = paragraphStyle.lineHeight;
        }
        if ((i10 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        return paragraphStyle.m22911copyElsmlbk(textAlign, textDirection, j10, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m22903copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m23438boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m23452boximpl(paragraphStyle.textDirection);
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
            lineBreak = LineBreak.m23346boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m23336boximpl(paragraphStyle.hyphens);
        }
        if ((i10 & 256) != 0) {
            textMotion = paragraphStyle.textMotion;
        }
        Hyphens hyphens2 = hyphens;
        TextMotion textMotion2 = textMotion;
        long j11 = j10;
        return paragraphStyle.m22912copyNH1kkwU(textAlign, textDirection, j11, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m22904copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m23438boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m23452boximpl(paragraphStyle.textDirection);
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
            lineBreak = LineBreak.m23346boximpl(paragraphStyle.lineBreak);
        }
        if ((i10 & 128) != 0) {
            hyphens = Hyphens.m23336boximpl(paragraphStyle.hyphens);
        }
        Hyphens hyphens2 = hyphens;
        LineHeightStyle lineHeightStyle2 = lineHeightStyle;
        TextIndent textIndent2 = textIndent;
        long j11 = j10;
        return paragraphStyle.m22913copyciSxzs0(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m22905copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textAlign = TextAlign.m23438boximpl(paragraphStyle.textAlign);
        }
        if ((i10 & 2) != 0) {
            textDirection = TextDirection.m23452boximpl(paragraphStyle.textDirection);
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
        return paragraphStyle.m22914copyxPh5V4g(textAlign, textDirection, j11, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    /* renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m22906copyykzQM6k$default(ParagraphStyle paragraphStyle, int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, Object obj) {
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
        return paragraphStyle.m22915copyykzQM6k(i10, i11, j11, textIndent, platformParagraphStyle, lineHeightStyle, i12, i15, textMotion2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m22907getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m22908getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m22909getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m22910getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m22911copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m22912copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m22913copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), this.textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m22914copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m22915copyykzQM6k(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return TextAlign.m23441equalsimpl0(this.textAlign, paragraphStyle.textAlign) && TextDirection.m23455equalsimpl0(this.textDirection, paragraphStyle.textDirection) && TextUnit.m23752equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) && Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) && Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && LineBreak.m23352equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) && Hyphens.m23339equalsimpl0(this.hyphens, paragraphStyle.hyphens) && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    @JvmName(name = "getHyphens-EaSxIns")
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m22916getHyphensEaSxIns() {
        return Hyphens.m23336boximpl(this.hyphens);
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name and from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    @JvmName(name = "getLineBreak-LgCVezo")
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m22918getLineBreakLgCVezo() {
        return LineBreak.m23346boximpl(this.lineBreak);
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name and from getter */
    public final int getLineBreak() {
        return this.lineBreak;
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

    @JvmName(name = "getTextAlign-buA522U")
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m22921getTextAlignbuA522U() {
        return TextAlign.m23438boximpl(this.textAlign);
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    @JvmName(name = "getTextDirection-mmuk1to")
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m22923getTextDirectionmmuk1to() {
        return TextDirection.m23452boximpl(this.textDirection);
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name and from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int iM23442hashCodeimpl = ((((TextAlign.m23442hashCodeimpl(this.textAlign) * 31) + TextDirection.m23456hashCodeimpl(this.textDirection)) * 31) + TextUnit.m23756hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iM23442hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + LineBreak.m23356hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m23340hashCodeimpl(this.hyphens)) * 31;
        TextMotion textMotion = this.textMotion;
        return iHashCode3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle other) {
        return other == null ? this : ParagraphStyleKt.m22925fastMergej5T8yCg(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle other) {
        return merge(other);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m23443toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m23457toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m23762toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m23357toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m23341toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j10, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
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
        if (TextUnit.m23752equalsimpl0(j10, TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m23755getValueimpl(j10) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m23755getValueimpl(j10) + ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, TextMotion textMotion, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int iM23451getUnspecifiede0LSkKk = (i14 & 1) != 0 ? TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk() : i10;
        int iM23464getUnspecifieds_7Xco = (i14 & 2) != 0 ? TextDirection.INSTANCE.m23464getUnspecifieds_7Xco() : i11;
        long jM23766getUnspecifiedXSAIIZE = (i14 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10;
        TextIndent textIndent2 = (i14 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i14 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 32) != 0 ? null : lineHeightStyle;
        int iM23366getUnspecifiedrAG3T2k = (i14 & 64) != 0 ? LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k() : i12;
        int iM23345getUnspecifiedvmbZdU8 = (i14 & 128) != 0 ? Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8() : i13;
        this(iM23451getUnspecifiede0LSkKk, iM23464getUnspecifieds_7Xco, jM23766getUnspecifiedXSAIIZE, textIndent2, platformParagraphStyle2, lineHeightStyle2, iM23366getUnspecifiedrAG3T2k, iM23345getUnspecifiedvmbZdU8, (i14 & 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) != 0 ? null : hyphens, (i10 & 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j10, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : textAlign, (i10 & 2) != 0 ? null : textDirection, (i10 & 4) != 0 ? TextUnit.INSTANCE.m23766getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : textIndent, (i10 & 16) != 0 ? null : platformParagraphStyle, (i10 & 32) != 0 ? null : lineHeightStyle, (i10 & 64) != 0 ? null : lineBreak, (i10 & 128) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m23451getUnspecifiede0LSkKk(), textDirection != null ? textDirection.getValue() : TextDirection.INSTANCE.m23464getUnspecifieds_7Xco(), j10, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : LineBreak.INSTANCE.m23366getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.getValue() : Hyphens.INSTANCE.m23345getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
