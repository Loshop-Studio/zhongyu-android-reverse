package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10474h;
import p280od.InterfaceC10476j;
import p280od.InterfaceC10478l;
import p280od.InterfaceC10480n;

/* loaded from: classes6.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC10476j {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b computeReflected() {
        return AbstractC9983y.m20318e(this);
    }

    @Override // p280od.InterfaceC10480n
    public Object getDelegate(Object obj) {
        return ((InterfaceC10476j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC10478l.a getGetter() {
        mo34162getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC10474h getSetter() {
        mo34163getSetter();
        return null;
    }

    @Override // p181hd.InterfaceC9540l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p280od.InterfaceC10480n
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC10480n.a mo34162getGetter() {
        ((InterfaceC10476j) getReflected()).mo34162getGetter();
        return null;
    }

    @Override // p280od.InterfaceC10476j
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC10476j.a mo34163getSetter() {
        ((InterfaceC10476j) getReflected()).mo34163getSetter();
        return null;
    }
}
