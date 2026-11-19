package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m33040boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m33041constructorimpl(String str) {
        if (!(str.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33042equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && AbstractC9979u.m20289b(str, ((DeviceFontFamilyName) obj).m33046unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33043equalsimpl0(String str, String str2) {
        return AbstractC9979u.m20289b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33044hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33045toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m33042equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m33044hashCodeimpl(this.name);
    }

    public String toString() {
        return m33045toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m33046unboximpl() {
        return this.name;
    }
}
