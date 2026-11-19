package kotlin.jvm.internal;

import p019c3.InterfaceC1086c;
import p019c3.InterfaceC1087d;

/* renamed from: kotlin.jvm.internal.s */
/* loaded from: classes.dex */
public class C2776s extends AbstractC2775r {
    public C2776s(InterfaceC1087d interfaceC1087d, String str, String str2) {
        super(AbstractC2760c.NO_RECEIVER, ((InterfaceC2761d) interfaceC1087d).mo9231a(), str, str2, !(interfaceC1087d instanceof InterfaceC1086c) ? 1 : 0);
    }

    @Override // p019c3.InterfaceC1093j
    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
