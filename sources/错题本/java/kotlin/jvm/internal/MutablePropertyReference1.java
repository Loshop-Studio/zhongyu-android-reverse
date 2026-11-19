package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6782f;
import p207y6.InterfaceC6785i;
import p207y6.InterfaceC6786j;
import p207y6.InterfaceC6787k;
import p207y6.InterfaceC6790n;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC6786j {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC6778b computeReflected() {
        AbstractC5832m.f9223a.getClass();
        return this;
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // p207y6.InterfaceC6791o
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((InterfaceC6786j) getReflected()).getDelegate(obj);
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

    @Override // p152r6.InterfaceC6471c
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public InterfaceC6790n getGetter() {
        ((InterfaceC6786j) getReflected()).getGetter();
        return null;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public InterfaceC6785i getSetter() {
        ((InterfaceC6786j) getReflected()).getSetter();
        return null;
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
