package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6782f;
import p207y6.InterfaceC6783g;
import p207y6.InterfaceC6784h;
import p207y6.InterfaceC6787k;
import p207y6.InterfaceC6788l;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements InterfaceC6784h {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC6778b computeReflected() {
        AbstractC5832m.f9223a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get();

    @Override // p207y6.InterfaceC6789m
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((InterfaceC6784h) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ InterfaceC6787k getGetter() {
        getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public /* bridge */ /* synthetic */ InterfaceC6782f getSetter() {
        getSetter();
        return null;
    }

    @Override // p152r6.InterfaceC6469a
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public InterfaceC6788l getGetter() {
        ((InterfaceC6784h) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public InterfaceC6783g getSetter() {
        ((InterfaceC6784h) getReflected()).getSetter();
        return null;
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
