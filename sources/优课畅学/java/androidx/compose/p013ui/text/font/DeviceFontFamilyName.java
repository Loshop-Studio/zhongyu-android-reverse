package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m26438boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m26439constructorimpl(String str) {
        if (!(str.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26440equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && AbstractC9133u.m16128b(str, ((DeviceFontFamilyName) obj).m26444unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26441equalsimpl0(String str, String str2) {
        return AbstractC9133u.m16128b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26442hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26443toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m26440equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m26442hashCodeimpl(this.name);
    }

    public String toString() {
        return m26443toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m26444unboximpl() {
        return this.name;
    }
}
