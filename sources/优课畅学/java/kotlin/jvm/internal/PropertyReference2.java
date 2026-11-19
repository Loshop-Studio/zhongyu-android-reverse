package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8386n;

/* loaded from: classes5.dex */
public abstract class PropertyReference2 extends PropertyReference implements InterfaceC8386n {
    public PropertyReference2(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16160h(this);
    }

    @Override // p089e8.InterfaceC8386n
    public InterfaceC8386n.a getGetter() {
        ((InterfaceC8386n) getReflected()).getGetter();
        return null;
    }

    @Override // p300x7.InterfaceC10574p
    public Object invoke(Object obj, Object obj2) {
        return mo13674j(obj, obj2);
    }
}
