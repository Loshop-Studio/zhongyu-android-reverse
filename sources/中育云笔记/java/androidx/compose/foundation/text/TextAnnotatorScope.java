package androidx.compose.foundation.text;

import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.LinkAnnotation;
import androidx.compose.p014ui.text.PlatformSpanStyle;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class TextAnnotatorScope {
    private final AnnotatedString initialText;
    private AnnotatedString styledText;

    public TextAnnotatorScope(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.styledText = annotatedString;
    }

    public final AnnotatedString getStyledText() {
        return this.styledText;
    }

    public final void replaceStyle(final AnnotatedString.Range<LinkAnnotation> range, final SpanStyle spanStyle) {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        this.styledText = this.initialText.mapAnnotations(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextAnnotatorScope.replaceStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final AnnotatedString.Range<? extends AnnotatedString.Annotation> invoke(AnnotatedString.Range<? extends AnnotatedString.Annotation> range2) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range3;
                if (ref$BooleanRef.f23398c && (range2.getItem() instanceof SpanStyle) && range2.getStart() == range.getStart() && range2.getEnd() == range.getEnd()) {
                    SpanStyle spanStyle2 = spanStyle;
                    if (spanStyle2 == null) {
                        spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (AbstractC9972n) null);
                    }
                    range3 = new AnnotatedString.Range<>(spanStyle2, range2.getStart(), range2.getEnd());
                } else {
                    range3 = range2;
                }
                ref$BooleanRef.f23398c = AbstractC9979u.m20289b(range, range2);
                return range3;
            }
        });
    }

    public final void setStyledText(AnnotatedString annotatedString) {
        this.styledText = annotatedString;
    }
}
