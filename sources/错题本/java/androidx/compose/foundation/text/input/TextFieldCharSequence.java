package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.R)\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m5110d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlight", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composingAnnotations", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;Lkotlin/jvm/internal/e;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "", "destination", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "Ld6/s;", "toCharArray", "([CIII)V", "shouldShowSelection", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/util/List;", "getComposingAnnotations", "()Ljava/util/List;", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "J", "getSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "Lkotlin/Pair;", "getHighlight", "()Lkotlin/Pair;", "getLength", "length", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;

    @Nullable
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;

    @Nullable
    private final TextRange composition;

    @Nullable
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;

    @NotNull
    private final CharSequence text;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j7, TextRange textRange, Pair pair, List list, AbstractC5824e abstractC5824e) {
        this(charSequence, j7, textRange, pair, list);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(@NotNull CharSequence other) {
        return AbstractC5862w.m5413t(this.text, other);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TextFieldCharSequence.class != other.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) other;
        return TextRange.m12763equalsimpl0(this.selection, textFieldCharSequence.selection) && AbstractC5830k.m5325b(this.composition, textFieldCharSequence.composition) && AbstractC5830k.m5325b(this.highlight, textFieldCharSequence.highlight) && AbstractC5830k.m5325b(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text);
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Nullable
    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    @Nullable
    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int iM12771hashCodeimpl = (TextRange.m12771hashCodeimpl(this.selection) + (this.text.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        int iM12771hashCodeimpl2 = (iM12771hashCodeimpl + (textRange != null ? TextRange.m12771hashCodeimpl(textRange.getPackedValue()) : 0)) * 31;
        Pair<TextHighlightType, TextRange> pair = this.highlight;
        int iHashCode = (iM12771hashCodeimpl2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int startIndex, int endIndex) {
        return this.text.subSequence(startIndex, endIndex);
    }

    public final void toCharArray(@NotNull char[] destination, int destinationOffset, int sourceStartIndex, int sourceEndIndex) {
        ToCharArray_androidKt.toCharArray(this.text, destination, destinationOffset, sourceStartIndex, sourceEndIndex);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.text.toString();
    }

    private TextFieldCharSequence(CharSequence charSequence, long j7, TextRange textRange, Pair<TextHighlightType, TextRange> pair, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        this.composingAnnotations = list;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m12776coerceIn8ffj60Q(j7, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m12758boximpl(TextRangeKt.m12776coerceIn8ffj60Q(textRange.getPackedValue(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.copy$default(pair, null, TextRange.m12758boximpl(TextRangeKt.m12776coerceIn8ffj60Q(pair.getSecond().getPackedValue(), 0, charSequence.length())), 1, null) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j7, TextRange textRange, Pair pair, List list, int i, AbstractC5824e abstractC5824e) {
        CharSequence charSequence2 = (i & 1) != 0 ? "" : charSequence;
        long jM12775getZerod9O1mEE = (i & 2) != 0 ? TextRange.INSTANCE.m12775getZerod9O1mEE() : j7;
        TextRange textRange2 = (i & 4) != 0 ? null : textRange;
        this(charSequence2, jM12775getZerod9O1mEE, textRange2, (i & 8) != 0 ? null : pair, (i & 16) == 0 ? list : null, null);
    }
}
