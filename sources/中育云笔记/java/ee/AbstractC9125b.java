package ee;

import ge.C9355m2;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* renamed from: ee.b */
/* loaded from: classes6.dex */
public abstract class AbstractC9125b {
    /* renamed from: a */
    public static final InterfaceC10469c m17955a(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        if (interfaceC9129f instanceof C9126c) {
            return ((C9126c) interfaceC9129f).f21298b;
        }
        if (interfaceC9129f instanceof C9355m2) {
            return m17955a(((C9355m2) interfaceC9129f).m18496h());
        }
        return null;
    }

    /* renamed from: b */
    public static final InterfaceC9129f m17956b(InterfaceC9129f interfaceC9129f, InterfaceC10469c context) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        AbstractC9979u.m20294g(context, "context");
        return new C9126c(interfaceC9129f, context);
    }
}
