package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes2.dex */
public final class C5833n {
    /* renamed from: a */
    public static String m5342a(InterfaceC5827h interfaceC5827h) {
        String string = interfaceC5827h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
