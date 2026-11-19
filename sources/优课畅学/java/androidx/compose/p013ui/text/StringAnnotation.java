package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m26312boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m26313constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26314equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && AbstractC9133u.m16128b(str, ((StringAnnotation) obj).m26318unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26315equalsimpl0(String str, String str2) {
        return AbstractC9133u.m16128b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26316hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26317toStringimpl(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m26314equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m26316hashCodeimpl(this.value);
    }

    public String toString() {
        return m26317toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m26318unboximpl() {
        return this.value;
    }
}
