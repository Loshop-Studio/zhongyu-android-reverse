package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private final TextRange composition;
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;
    private final CharSequence text;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j10, TextRange textRange, Pair pair, List list, AbstractC9126n abstractC9126n) {
        this(charSequence, j10, textRange, pair, list);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return AbstractC8687z.m14108w(this.text, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m26357equalsimpl0(this.selection, textFieldCharSequence.selection) && AbstractC9133u.m16128b(this.composition, textFieldCharSequence.composition) && AbstractC9133u.m16128b(this.highlight, textFieldCharSequence.highlight) && AbstractC9133u.m16128b(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text);
    }

    public char get(int i10) {
        return this.text.charAt(i10);
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m21344getCompositionMzsxiRA() {
        return this.composition;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m21345getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + TextRange.m26365hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        int iM26365hashCodeimpl = (iHashCode + (textRange != null ? TextRange.m26365hashCodeimpl(textRange.m26368unboximpl()) : 0)) * 31;
        Pair<TextHighlightType, TextRange> pair = this.highlight;
        int iHashCode2 = (iM26365hashCodeimpl + (pair != null ? pair.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.text.subSequence(i10, i11);
    }

    public final void toCharArray(char[] cArr, int i10, int i11, int i12) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    private TextFieldCharSequence(CharSequence charSequence, long j10, TextRange textRange, Pair<TextHighlightType, TextRange> pair, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        this.composingAnnotations = list;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m26370coerceIn8ffj60Q(j10, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m26352boximpl(TextRangeKt.m26370coerceIn8ffj60Q(textRange.m26368unboximpl(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.m15902d(pair, null, TextRange.m26352boximpl(TextRangeKt.m26370coerceIn8ffj60Q(((TextRange) pair.m15907g()).m26368unboximpl(), 0, charSequence.length())), 1, null) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j10, TextRange textRange, Pair pair, List list, int i10, AbstractC9126n abstractC9126n) {
        CharSequence charSequence2 = (i10 & 1) != 0 ? "" : charSequence;
        long jM26369getZerod9O1mEE = (i10 & 2) != 0 ? TextRange.Companion.m26369getZerod9O1mEE() : j10;
        TextRange textRange2 = (i10 & 4) != 0 ? null : textRange;
        this(charSequence2, jM26369getZerod9O1mEE, textRange2, (i10 & 8) != 0 ? null : pair, (i10 & 16) == 0 ? list : null, null);
    }
}
