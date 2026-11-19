package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.NonNullValueClassSaver;
import androidx.compose.p013ui.text.SaversKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            return AbstractC8809v.m14764g(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m26352boximpl(textFieldValue.m26612getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
        }
    }, new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // p300x7.InterfaceC10570l
        public final TextFieldValue invoke(Object obj) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = ((!AbstractC9133u.m16128b(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            AbstractC9133u.m16130d(annotatedStringRestore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if ((!AbstractC9133u.m16128b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textRangeRestore = saver.restore(obj3);
            }
            AbstractC9133u.m16130d(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.m26368unboximpl(), (TextRange) null, 4, (AbstractC9126n) null);
        }
    });
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, AbstractC9126n abstractC9126n) {
        this(annotatedString, j10, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m26607copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m26609copy3r_uNRQ(annotatedString, j10, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m26609copy3r_uNRQ(AnnotatedString annotatedString, long j10, TextRange textRange) {
        return new TextFieldValue(annotatedString, j10, textRange, (AbstractC9126n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m26357equalsimpl0(this.selection, textFieldValue.selection) && AbstractC9133u.m16128b(this.composition, textFieldValue.composition) && AbstractC9133u.m16128b(this.annotatedString, textFieldValue.annotatedString);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m26611getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m26612getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m26365hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return iHashCode + (textRange != null ? TextRange.m26365hashCodeimpl(textRange.m26368unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m26367toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, AbstractC9126n abstractC9126n) {
        this(str, j10, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m26610copy3r_uNRQ(String str, long j10, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, textRange, (AbstractC9126n) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m26370coerceIn8ffj60Q(j10, 0, getText().length());
        this.composition = textRange != null ? TextRange.m26352boximpl(TextRangeKt.m26370coerceIn8ffj60Q(textRange.m26368unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m26608copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m26610copy3r_uNRQ(str, j10, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, int i10, AbstractC9126n abstractC9126n) {
        this(annotatedString, (i10 & 2) != 0 ? TextRange.Companion.m26369getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (AbstractC9126n) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? TextRange.Companion.m26369getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (AbstractC9126n) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j10, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, textRange, (AbstractC9126n) null);
    }
}
