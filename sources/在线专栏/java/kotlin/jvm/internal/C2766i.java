package kotlin.jvm.internal;

import p019c3.InterfaceC1085b;
import p019c3.InterfaceC1088e;

/* renamed from: kotlin.jvm.internal.i */
/* loaded from: classes.dex */
public class C2766i extends AbstractC2760c implements InterfaceC2765h, InterfaceC1088e {

    /* renamed from: a */
    private final int f10730a;

    /* renamed from: b */
    private final int f10731b;

    public C2766i(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f10730a = i4;
        this.f10731b = i5 >> 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC2760c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC1088e getReflected() {
        return (InterfaceC1088e) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC2760c
    protected InterfaceC1085b computeReflected() {
        return C2782y.m9257a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2766i) {
            C2766i c2766i = (C2766i) obj;
            return C2769l.m9237a(getOwner(), c2766i.getOwner()) && getName().equals(c2766i.getName()) && getSignature().equals(c2766i.getSignature()) && this.f10731b == c2766i.f10731b && this.f10730a == c2766i.f10730a && C2769l.m9237a(getBoundReceiver(), c2766i.getBoundReceiver());
        }
        if (obj instanceof InterfaceC1088e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2765h
    public int getArity() {
        return this.f10730a;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC2760c, p019c3.InterfaceC1085b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1085b interfaceC1085bCompute = compute();
        if (interfaceC1085bCompute != this) {
            return interfaceC1085bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
