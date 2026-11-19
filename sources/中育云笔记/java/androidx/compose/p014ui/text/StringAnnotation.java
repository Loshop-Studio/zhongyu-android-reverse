package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m32914boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m32915constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32916equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && AbstractC9979u.m20289b(str, ((StringAnnotation) obj).m32920unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32917equalsimpl0(String str, String str2) {
        return AbstractC9979u.m20289b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32918hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32919toStringimpl(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m32916equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m32918hashCodeimpl(this.value);
    }

    public String toString() {
        return m32919toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m32920unboximpl() {
        return this.value;
    }
}
