package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.NonNullValueClassSaver;
import androidx.compose.p014ui.text.SaversKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10978w;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            return AbstractC10978w.m24129g(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m32954boximpl(textFieldValue.m33214getSelectiond9O1mEE()), SaversKt.getSaver(TextRange.Companion), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final TextFieldValue invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = ((!AbstractC9979u.m20289b(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            AbstractC9979u.m20291d(annotatedStringRestore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.Companion);
            if ((!AbstractC9979u.m20289b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textRangeRestore = saver.restore(obj3);
            }
            AbstractC9979u.m20291d(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.m32970unboximpl(), (TextRange) null, 4, (AbstractC9972n) null);
        }
    });
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, AbstractC9972n abstractC9972n) {
        this(annotatedString, j10, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m33209copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m33211copy3r_uNRQ(annotatedString, j10, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m33211copy3r_uNRQ(AnnotatedString annotatedString, long j10, TextRange textRange) {
        return new TextFieldValue(annotatedString, j10, textRange, (AbstractC9972n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m32959equalsimpl0(this.selection, textFieldValue.selection) && AbstractC9979u.m20289b(this.composition, textFieldValue.composition) && AbstractC9979u.m20289b(this.annotatedString, textFieldValue.annotatedString);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m33213getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m33214getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m32967hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return iHashCode + (textRange != null ? TextRange.m32967hashCodeimpl(textRange.m32970unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m32969toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, AbstractC9972n abstractC9972n) {
        this(str, j10, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m33212copy3r_uNRQ(String str, long j10, TextRange textRange) {
        return new TextFieldValue(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, textRange, (AbstractC9972n) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m32972coerceIn8ffj60Q(j10, 0, getText().length());
        this.composition = textRange != null ? TextRange.m32954boximpl(TextRangeKt.m32972coerceIn8ffj60Q(textRange.m32970unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m33210copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m33212copy3r_uNRQ(str, j10, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, int i10, AbstractC9972n abstractC9972n) {
        this(annotatedString, (i10 & 2) != 0 ? TextRange.Companion.m32971getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (AbstractC9972n) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? TextRange.Companion.m32971getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (AbstractC9972n) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j10, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, textRange, (AbstractC9972n) null);
    }
}
