package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10474h;
import p280od.InterfaceC10475i;
import p280od.InterfaceC10478l;
import p280od.InterfaceC10479m;

/* loaded from: classes6.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements InterfaceC10475i {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b computeReflected() {
        return AbstractC9983y.m20317d(this);
    }

    @Override // p280od.InterfaceC10479m
    public Object getDelegate() {
        return ((InterfaceC10475i) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC10478l.a getGetter() {
        mo34160getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC10474h getSetter() {
        mo34161getSetter();
        return null;
    }

    @Override // p181hd.InterfaceC9529a
    public Object invoke() {
        return get();
    }

    @Override // p280od.InterfaceC10479m
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC10479m.a mo34160getGetter() {
        ((InterfaceC10475i) getReflected()).mo34160getGetter();
        return null;
    }

    @Override // p280od.InterfaceC10475i
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC10475i.a mo34161getSetter() {
        ((InterfaceC10475i) getReflected()).mo34161getSetter();
        return null;
    }
}
