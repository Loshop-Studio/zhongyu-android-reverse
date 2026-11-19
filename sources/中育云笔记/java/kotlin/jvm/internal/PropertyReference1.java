package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10478l;
import p280od.InterfaceC10480n;

/* loaded from: classes6.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC10480n {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b computeReflected() {
        return AbstractC9983y.m20320g(this);
    }

    @Override // p280od.InterfaceC10480n
    public Object getDelegate(Object obj) {
        return ((InterfaceC10480n) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC10478l.a getGetter() {
        mo34162getGetter();
        return null;
    }

    @Override // p181hd.InterfaceC9540l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p280od.InterfaceC10480n
    /* renamed from: getGetter */
    public InterfaceC10480n.a mo34162getGetter() {
        ((InterfaceC10480n) getReflected()).mo34162getGetter();
        return null;
    }
}
