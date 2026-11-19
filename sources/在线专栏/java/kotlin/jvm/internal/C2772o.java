package kotlin.jvm.internal;

import p019c3.InterfaceC1086c;
import p019c3.InterfaceC1087d;

/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes.dex */
public class C2772o extends AbstractC2771n {
    public C2772o(InterfaceC1087d interfaceC1087d, String str, String str2) {
        super(AbstractC2760c.NO_RECEIVER, ((InterfaceC2761d) interfaceC1087d).mo9231a(), str, str2, !(interfaceC1087d instanceof InterfaceC1086c) ? 1 : 0);
    }

    @Override // p019c3.InterfaceC1092i
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public C2772o(Class cls, String str, String str2, int i4) {
        super(AbstractC2760c.NO_RECEIVER, cls, str, str2, i4);
    }

    public C2772o(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
