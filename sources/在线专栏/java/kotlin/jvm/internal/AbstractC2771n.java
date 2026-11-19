package kotlin.jvm.internal;

import p019c3.InterfaceC1085b;
import p019c3.InterfaceC1090g;
import p019c3.InterfaceC1092i;

/* renamed from: kotlin.jvm.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractC2771n extends AbstractC2773p implements InterfaceC1090g {
    public AbstractC2771n() {
    }

    @Override // kotlin.jvm.internal.AbstractC2760c
    protected InterfaceC1085b computeReflected() {
        return C2782y.m9260d(this);
    }

    @Override // p019c3.InterfaceC1092i
    public Object getDelegate() {
        return ((InterfaceC1090g) getReflected()).getDelegate();
    }

    @Override // p171x2.InterfaceC3459a
    public Object invoke() {
        return get();
    }

    public AbstractC2771n(Object obj) {
        super(obj);
    }

    @Override // p019c3.InterfaceC1092i
    public InterfaceC1092i.a getGetter() {
        return ((InterfaceC1090g) getReflected()).getGetter();
    }

    @Override // p019c3.InterfaceC1090g
    public InterfaceC1090g.a getSetter() {
        return ((InterfaceC1090g) getReflected()).getSetter();
    }

    public AbstractC2771n(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
