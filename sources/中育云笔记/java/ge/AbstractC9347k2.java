package ge;

import ee.AbstractC9128e;
import ee.InterfaceC9129f;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.InterfaceC5432b;
import p280od.InterfaceC10469c;
import p310qd.AbstractC10812s;

/* renamed from: ge.k2 */
/* loaded from: classes6.dex */
public abstract class AbstractC9347k2 {

    /* renamed from: a */
    public static final Map f21756a = AbstractC9394w1.m18579i();

    /* renamed from: a */
    public static final InterfaceC9129f m18481a(String serialName, AbstractC9128e kind) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(kind, "kind");
        m18483c(serialName);
        return new C9342j2(serialName, kind);
    }

    /* renamed from: b */
    public static final InterfaceC5432b m18482b(InterfaceC10469c interfaceC10469c) {
        AbstractC9979u.m20294g(interfaceC10469c, "<this>");
        return (InterfaceC5432b) f21756a.get(interfaceC10469c);
    }

    /* renamed from: c */
    public static final void m18483c(String str) {
        for (InterfaceC5432b interfaceC5432b : f21756a.values()) {
            if (AbstractC9979u.m20289b(str, interfaceC5432b.getDescriptor().mo17961f())) {
                throw new IllegalArgumentException(AbstractC10812s.m23221n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + AbstractC9983y.m20315b(interfaceC5432b.getClass()).mo20277f() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
