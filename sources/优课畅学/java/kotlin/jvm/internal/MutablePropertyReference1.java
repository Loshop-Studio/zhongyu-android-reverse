package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8380h;
import p089e8.InterfaceC8382j;
import p089e8.InterfaceC8383k;
import p089e8.InterfaceC8385m;

/* loaded from: classes5.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC8382j {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16157e(this);
    }

    @Override // p089e8.InterfaceC8385m
    public Object getDelegate(Object obj) {
        return ((InterfaceC8382j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC8383k.a getGetter() {
        mo27617getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC8380h getSetter() {
        mo27618getSetter();
        return null;
    }

    @Override // p300x7.InterfaceC10570l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p089e8.InterfaceC8385m
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC8385m.a mo27617getGetter() {
        ((InterfaceC8382j) getReflected()).mo27617getGetter();
        return null;
    }

    @Override // p089e8.InterfaceC8382j
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC8382j.a mo27618getSetter() {
        ((InterfaceC8382j) getReflected()).mo27618getSetter();
        return null;
    }
}
