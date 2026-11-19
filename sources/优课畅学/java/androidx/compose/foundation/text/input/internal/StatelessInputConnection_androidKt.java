package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.ClipMetadata;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.PlatformSpanStyle;
import androidx.compose.p013ui.text.SpanStyle;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* loaded from: classes.dex */
public final class StatelessInputConnection_androidKt {
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    private static final String EXTRA_INPUT_CONTENT_INFO = "EXTRA_INPUT_CONTENT_INFO";
    public static final boolean SIC_DEBUG = false;
    private static final String STATELESS_TAG = "StatelessIC";

    @VisibleForTesting
    public static /* synthetic */ void getSIC_DEBUG$annotations() {
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

    private static final AnnotatedString.Annotation toAnnotation(Object obj) {
        if (obj instanceof BackgroundColorSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (AbstractC9126n) null);
        }
        if (obj instanceof ForegroundColorSpan) {
            return new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC9126n) null);
        }
        if (obj instanceof StrikethroughSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9126n) null);
        }
        if (obj instanceof StyleSpan) {
            return toSpanStyle((StyleSpan) obj);
        }
        if (obj instanceof TypefaceSpan) {
            return toSpanStyle((TypefaceSpan) obj);
        }
        if (obj instanceof UnderlineSpan) {
            return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC9126n) null);
        }
        return null;
    }

    @VisibleForTesting
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> toAnnotationList(Spanned spanned) {
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            AnnotatedString.Annotation annotation = toAnnotation(obj);
            if (annotation != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new AnnotatedString.Range<>(annotation, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m26362getMinimpl(textFieldCharSequence.m21345getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m26361getMaximpl(textFieldCharSequence.m21345getSelectiond9O1mEE());
        extractedText.flags = !AbstractC8661c0.m13971R(textFieldCharSequence, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
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

    public static final TransferableContent toTransferableContent(InputContentInfoCompat inputContentInfoCompat, Bundle bundle) {
        ClipEntry clipEntry = AndroidClipboardManager_androidKt.toClipEntry(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())));
        int iM20456getKeyboardkB6V9T0 = TransferableContent.Source.Companion.m20456getKeyboardkB6V9T0();
        ClipMetadata clipMetadata = AndroidClipboardManager_androidKt.toClipMetadata(inputContentInfoCompat.getDescription());
        Uri linkUri = inputContentInfoCompat.getLinkUri();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntry, clipMetadata, iM20456getKeyboardkB6V9T0, new PlatformTransferableContent(linkUri, bundle), null);
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
