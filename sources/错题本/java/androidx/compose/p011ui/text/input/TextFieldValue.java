package androidx.compose.p011ui.text.input;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.NonNullValueClassSaver;
import androidx.compose.p011ui.text.SaversKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Immutable
@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m5110d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/e;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/e;)V", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getText", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            return AbstractC5806u.m5267f(SaversKt.save(textFieldValue.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m12758boximpl(textFieldValue.getSelection()), SaversKt.getSaver(TextRange.INSTANCE), saverScope));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        @Override // p152r6.InterfaceC6471c
        public final TextFieldValue invoke(Object obj) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = ((!AbstractC5830k.m5325b(obj2, bool) || (annotatedStringSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            AbstractC5830k.m5327d(annotatedStringRestore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.INSTANCE);
            if ((!AbstractC5830k.m5325b(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textRangeRestore = saver.restore(obj3);
            }
            AbstractC5830k.m5327d(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.getPackedValue(), (TextRange) null, 4, (AbstractC5824e) null);
        }
    });

    @NotNull
    private final AnnotatedString annotatedString;

    @Nullable
    private final TextRange composition;
    private final long selection;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j7, TextRange textRange, AbstractC5824e abstractC5824e) {
        this(annotatedString, j7, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m13013copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j7, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j7 = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m13015copy3r_uNRQ(annotatedString, j7, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m13015copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long selection, @Nullable TextRange composition) {
        return new TextFieldValue(annotatedString, selection, composition, (AbstractC5824e) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return TextRange.m12763equalsimpl0(this.selection, textFieldValue.selection) && AbstractC5830k.m5325b(this.composition, textFieldValue.composition) && AbstractC5830k.m5325b(this.annotatedString, textFieldValue.annotatedString);
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iM12771hashCodeimpl = (TextRange.m12771hashCodeimpl(this.selection) + (this.annotatedString.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        return iM12771hashCodeimpl + (textRange != null ? TextRange.m12771hashCodeimpl(textRange.getPackedValue()) : 0);
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m12773toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j7, TextRange textRange, AbstractC5824e abstractC5824e) {
        this(str, j7, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m13016copy3r_uNRQ(@NotNull String text, long selection, @Nullable TextRange composition) {
        return new TextFieldValue(new AnnotatedString(text, null, 2, null), selection, composition, (AbstractC5824e) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j7, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m12776coerceIn8ffj60Q(j7, 0, getText().length());
        this.composition = textRange != null ? TextRange.m12758boximpl(TextRangeKt.m12776coerceIn8ffj60Q(textRange.getPackedValue(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m13014copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j7, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m13016copy3r_uNRQ(str, j7, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j7, TextRange textRange, int i, AbstractC5824e abstractC5824e) {
        this(annotatedString, (i & 2) != 0 ? TextRange.INSTANCE.m12775getZerod9O1mEE() : j7, (i & 4) != 0 ? null : textRange, (AbstractC5824e) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j7, TextRange textRange, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.INSTANCE.m12775getZerod9O1mEE() : j7, (i & 4) != 0 ? null : textRange, (AbstractC5824e) null);
    }

    private TextFieldValue(String str, long j7, TextRange textRange) {
        this(new AnnotatedString(str, null, 2, null), j7, textRange, (AbstractC5824e) null);
    }
}
