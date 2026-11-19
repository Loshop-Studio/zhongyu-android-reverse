package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6787k;
import p207y6.InterfaceC6788l;
import p207y6.InterfaceC6789m;

/* loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC6789m {
    public PropertyReference0() {
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
        return ((InterfaceC6789m) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public /* bridge */ /* synthetic */ InterfaceC6787k getGetter() {
        getGetter();
        return null;
    }

    @Override // p152r6.InterfaceC6469a
    public Object invoke() {
        return get();
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public InterfaceC6788l getGetter() {
        ((InterfaceC6789m) getReflected()).getGetter();
        return null;
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
