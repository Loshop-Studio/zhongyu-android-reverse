package p280od;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: od.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10470d {
    /* renamed from: a */
    public static final Object m21852a(InterfaceC10469c interfaceC10469c, Object obj) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        if (interfaceC10469c.mo20275d(obj)) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC10469c.mo20276e());
    }
}
