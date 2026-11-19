package p290w8;

import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p113g8.AbstractC8680s;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10209e;
import p268u8.InterfaceC10210f;

/* renamed from: w8.k2 */
/* loaded from: classes5.dex */
public abstract class AbstractC10414k2 {

    /* renamed from: a */
    public static final Map f20729a = AbstractC10461w1.m19551i();

    /* renamed from: a */
    public static final InterfaceC10210f m19455a(String serialName, AbstractC10209e kind) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(kind, "kind");
        m19457c(serialName);
        return new C10409j2(serialName, kind);
    }

    /* renamed from: b */
    public static final InterfaceC10052b m19456b(InterfaceC8375c interfaceC8375c) {
        AbstractC9133u.m16133g(interfaceC8375c, "<this>");
        return (InterfaceC10052b) f20729a.get(interfaceC8375c);
    }

    /* renamed from: c */
    public static final void m19457c(String str) {
        for (InterfaceC10052b interfaceC10052b : f20729a.values()) {
            if (AbstractC9133u.m16128b(str, interfaceC10052b.getDescriptor().mo19089f())) {
                throw new IllegalArgumentException(AbstractC8680s.m14086n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + AbstractC9137y.m16154b(interfaceC10052b.getClass()).mo13672g() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
