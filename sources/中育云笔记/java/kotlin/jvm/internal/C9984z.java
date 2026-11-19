package kotlin.jvm.internal;

import p280od.InterfaceC10469c;
import p280od.InterfaceC10472f;
import p280od.InterfaceC10473g;
import p280od.InterfaceC10475i;
import p280od.InterfaceC10476j;
import p280od.InterfaceC10479m;
import p280od.InterfaceC10480n;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes6.dex */
public class C9984z {
    /* renamed from: b */
    public InterfaceC10469c m20324b(Class cls) {
        return new C9970l(cls);
    }

    /* renamed from: c */
    public InterfaceC10472f m20325c(Class cls, String str) {
        return new C9982x(cls, str);
    }

    /* renamed from: h */
    public String m20330h(InterfaceC9976r interfaceC9976r) {
        String string = interfaceC9976r.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: i */
    public String m20331i(Lambda lambda) {
        return m20330h(lambda);
    }

    /* renamed from: a */
    public InterfaceC10473g m20323a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: d */
    public InterfaceC10475i m20326d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: e */
    public InterfaceC10476j m20327e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: f */
    public InterfaceC10479m m20328f(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: g */
    public InterfaceC10480n m20329g(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }
}
