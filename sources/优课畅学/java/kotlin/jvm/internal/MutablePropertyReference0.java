package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8380h;
import p089e8.InterfaceC8381i;
import p089e8.InterfaceC8383k;
import p089e8.InterfaceC8384l;

/* loaded from: classes5.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements InterfaceC8381i {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16156d(this);
    }

    @Override // p089e8.InterfaceC8384l
    public Object getDelegate() {
        return ((InterfaceC8381i) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC8383k.a getGetter() {
        mo27615getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC8380h getSetter() {
        mo27616getSetter();
        return null;
    }

    @Override // p300x7.InterfaceC10559a
    public Object invoke() {
        return get();
    }

    @Override // p089e8.InterfaceC8384l
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC8384l.a mo27615getGetter() {
        ((InterfaceC8381i) getReflected()).mo27615getGetter();
        return null;
    }

    @Override // p089e8.InterfaceC8381i
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC8381i.a mo27616getSetter() {
        ((InterfaceC8381i) getReflected()).mo27616getSetter();
        return null;
    }
}
