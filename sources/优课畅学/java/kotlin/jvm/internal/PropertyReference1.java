package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8383k;
import p089e8.InterfaceC8385m;

/* loaded from: classes5.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC8385m {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16159g(this);
    }

    @Override // p089e8.InterfaceC8385m
    public Object getDelegate(Object obj) {
        return ((InterfaceC8385m) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC8383k.a getGetter() {
        mo27617getGetter();
        return null;
    }

    @Override // p300x7.InterfaceC10570l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p089e8.InterfaceC8385m
    /* renamed from: getGetter */
    public InterfaceC8385m.a mo27617getGetter() {
        ((InterfaceC8385m) getReflected()).mo27617getGetter();
        return null;
    }
}
