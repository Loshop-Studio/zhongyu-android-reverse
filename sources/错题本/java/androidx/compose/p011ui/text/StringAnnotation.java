package androidx.compose.p011ui.text;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {

    @NotNull
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m12718boximpl(String str) {
        return new StringAnnotation(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m12719constructorimpl(@NotNull String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12720equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && AbstractC5830k.m5325b(str, ((StringAnnotation) obj).m12724unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12721equalsimpl0(String str, String str2) {
        return AbstractC5830k.m5325b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12722hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12723toStringimpl(String str) {
        return AbstractC1923c.m1047k(')', "StringAnnotation(value=", str);
    }

    public boolean equals(Object obj) {
        return m12720equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m12722hashCodeimpl(this.value);
    }

    public String toString() {
        return m12723toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m12724unboximpl() {
        return this.value;
    }
}
