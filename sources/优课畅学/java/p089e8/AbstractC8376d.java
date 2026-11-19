package p089e8;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC8376d {
    /* renamed from: a */
    public static final Object m13673a(InterfaceC8375c interfaceC8375c, Object obj) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        if (interfaceC8375c.mo13670c(obj)) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC8375c.mo13671e());
    }
}
