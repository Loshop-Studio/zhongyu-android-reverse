package kotlin.jvm.internal;

import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8378f;
import p089e8.InterfaceC8379g;
import p089e8.InterfaceC8381i;
import p089e8.InterfaceC8382j;
import p089e8.InterfaceC8384l;
import p089e8.InterfaceC8385m;
import p089e8.InterfaceC8386n;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes5.dex */
public class C9138z {
    /* renamed from: b */
    public InterfaceC8375c m16164b(Class cls) {
        return new C9124l(cls);
    }

    /* renamed from: c */
    public InterfaceC8378f m16165c(Class cls, String str) {
        return new C9136x(cls, str);
    }

    /* renamed from: i */
    public String m16171i(InterfaceC9130r interfaceC9130r) {
        String string = interfaceC9130r.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: j */
    public String m16172j(Lambda lambda) {
        return m16171i(lambda);
    }

    /* renamed from: a */
    public InterfaceC8379g m16163a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: d */
    public InterfaceC8381i m16166d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: e */
    public InterfaceC8382j m16167e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: f */
    public InterfaceC8384l m16168f(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: g */
    public InterfaceC8385m m16169g(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: h */
    public InterfaceC8386n m16170h(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
