package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8383k;
import p089e8.InterfaceC8384l;

/* loaded from: classes5.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC8384l {
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16158f(this);
    }

    @Override // p089e8.InterfaceC8384l
    public Object getDelegate() {
        return ((InterfaceC8384l) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC8383k.a getGetter() {
        mo27615getGetter();
        return null;
    }

    @Override // p300x7.InterfaceC10559a
    public Object invoke() {
        return get();
    }

    @Override // p089e8.InterfaceC8384l
    /* renamed from: getGetter */
    public InterfaceC8384l.a mo27615getGetter() {
        ((InterfaceC8384l) getReflected()).mo27615getGetter();
        return null;
    }
}
