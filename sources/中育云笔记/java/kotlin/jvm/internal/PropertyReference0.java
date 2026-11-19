package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10478l;
import p280od.InterfaceC10479m;

/* loaded from: classes6.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC10479m {
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b computeReflected() {
        return AbstractC9983y.m20319f(this);
    }

    @Override // p280od.InterfaceC10479m
    public Object getDelegate() {
        return ((InterfaceC10479m) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC10478l.a getGetter() {
        mo34160getGetter();
        return null;
    }

    @Override // p181hd.InterfaceC9529a
    public Object invoke() {
        return get();
    }

    @Override // p280od.InterfaceC10479m
    /* renamed from: getGetter */
    public InterfaceC10479m.a mo34160getGetter() {
        ((InterfaceC10479m) getReflected()).mo34160getGetter();
        return null;
    }
}
