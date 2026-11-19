package androidx.compose.p013ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.LinkAnnotation;
import androidx.compose.p013ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Utf8;
import org.xml.sax.XMLReader;

/* loaded from: classes2.dex */
public final class Html_androidKt {
    private static final String AnnotationTag = "annotation";
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";

    /* renamed from: Li */
    private static final String f1352Li = "li";
    private static final Html_androidKt$TagHandler$1 TagHandler = new Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z10 || !AbstractC9133u.m16128b(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
        }
    };

    /* renamed from: Ul */
    private static final String f1353Ul = "ul";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void addSpan(AnnotatedString.Builder builder, Object obj, int i10, int i11, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            builder.addStyle(toParagraphStyle((AlignmentSpan) obj), i10, i11);
            return;
        }
        if (obj instanceof AnnotationSpan) {
            AnnotationSpan annotationSpan = (AnnotationSpan) obj;
            builder.addStringAnnotation(annotationSpan.getKey(), annotationSpan.getValue(), i10, i11);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof BulletSpanWithLevel) {
            long defaultBulletIndentation = BulletKt.getDefaultBulletIndentation();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
            TextUnitKt.m27106checkArithmeticR2X_6o(defaultBulletIndentation);
            builder.m26195addBulletr9BaKPg$ui_text_release(bulletSpanWithLevel.getBullet(), TextUnitKt.pack(TextUnit.m27091getRawTypeimpl(defaultBulletIndentation), TextUnit.m27093getValueimpl(defaultBulletIndentation) * indentationLevel), i10, i11);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, Utf8.REPLACEMENT_CODE_POINT, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof StyleSpan) {
            SpanStyle spanStyle = toSpanStyle((StyleSpan) obj);
            if (spanStyle != null) {
                builder.addStyle(spanStyle, i10, i11);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m26655boximpl(BaselineShift.Companion.m26666getSubscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m26655boximpl(BaselineShift.Companion.m26667getSuperscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (AbstractC9126n) null), i10, i11);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            builder.addStyle(toSpanStyle((TypefaceSpan) obj), i10, i11);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9126n) null), i10, i11);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i10, i11);
        }
    }

    private static final void addSpans(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.getLength(), Object.class)) {
            long jTextRange = TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(builder, obj, TextRange.m26364getStartimpl(jTextRange), TextRange.m26359getEndimpl(jTextRange), textLinkStyles, linkInteractionListener);
        }
    }

    public static final AnnotatedString fromHtml(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(HtmlCompat.fromHtml("<ContentHandlerReplacementTag />" + str, 63, null, TagHandler), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i10 & 4) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    private static final FontFamily optionalFontFamilyFromName(String str) {
        if (str != null && str.length() != 0) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typeface = Typeface.DEFAULT;
            if (AbstractC9133u.m16128b(typefaceCreate, typeface) || AbstractC9133u.m16128b(typefaceCreate, Typeface.create(typeface, 0))) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null) {
                return AndroidTypeface_androidKt.FontFamily(typefaceCreate);
            }
        }
        return null;
    }

    @VisibleForTesting
    public static final AnnotatedString toAnnotatedString(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder builderAppend = new AnnotatedString.Builder(spanned.length()).append((CharSequence) spanned);
        addSpans(builderAppend, spanned, textLinkStyles, linkInteractionListener);
        return builderAppend.toAnnotatedString();
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLinkStyles = null;
        }
        if ((i10 & 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan alignmentSpan) {
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i10 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        return new ParagraphStyle(i10 != 1 ? i10 != 2 ? i10 != 3 ? TextAlign.Companion.m26789getUnspecifiede0LSkKk() : TextAlign.Companion.m26784getEnde0LSkKk() : TextAlign.Companion.m26783getCentere0LSkKk() : TextAlign.Companion.m26788getStarte0LSkKk(), 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 510, (AbstractC9126n) null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (AbstractC9126n) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m26472boximpl(FontStyle.Companion.m26481getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (AbstractC9126n) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m26472boximpl(FontStyle.Companion.m26481getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (AbstractC9126n) null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        FontFamily serif;
        String family = typefaceSpan.getFamily();
        FontFamily.Companion companion = FontFamily.Companion;
        if (AbstractC9133u.m16128b(family, companion.getCursive().getName())) {
            serif = companion.getCursive();
        } else if (AbstractC9133u.m16128b(family, companion.getMonospace().getName())) {
            serif = companion.getMonospace();
        } else if (AbstractC9133u.m16128b(family, companion.getSansSerif().getName())) {
            serif = companion.getSansSerif();
        } else {
            serif = AbstractC9133u.m16128b(family, companion.getSerif().getName()) ? companion.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (AbstractC9126n) null);
    }
}
