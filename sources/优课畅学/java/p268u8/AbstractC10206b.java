package p268u8;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p290w8.C10422m2;

/* renamed from: u8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10206b {
    /* renamed from: a */
    public static final InterfaceC8375c m19083a(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        if (interfaceC10210f instanceof C10207c) {
            return ((C10207c) interfaceC10210f).f20359b;
        }
        if (interfaceC10210f instanceof C10422m2) {
            return m19083a(((C10422m2) interfaceC10210f).m19470h());
        }
        return null;
    }

    /* renamed from: b */
    public static final InterfaceC10210f m19084b(InterfaceC10210f interfaceC10210f, InterfaceC8375c context) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        AbstractC9133u.m16133g(context, "context");
        return new C10207c(interfaceC10210f, context);
    }
}
