package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6787k;
import p207y6.InterfaceC6790n;
import p207y6.InterfaceC6791o;

/* loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC6791o {
    public PropertyReference1() {
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
        return ((InterfaceC6791o) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ InterfaceC6787k getGetter() {
        getGetter();
        return null;
    }

    @Override // p152r6.InterfaceC6471c
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public InterfaceC6790n getGetter() {
        ((InterfaceC6791o) getReflected()).getGetter();
        return null;
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
