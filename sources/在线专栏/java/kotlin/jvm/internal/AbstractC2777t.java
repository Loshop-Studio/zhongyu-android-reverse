package kotlin.jvm.internal;

import p019c3.InterfaceC1085b;
import p019c3.InterfaceC1091h;

/* renamed from: kotlin.jvm.internal.t */
/* loaded from: classes.dex */
public abstract class AbstractC2777t extends AbstractC2760c implements InterfaceC1091h {
    public AbstractC2777t() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2777t) {
            AbstractC2777t abstractC2777t = (AbstractC2777t) obj;
            return getOwner().equals(abstractC2777t.getOwner()) && getName().equals(abstractC2777t.getName()) && getSignature().equals(abstractC2777t.getSignature()) && C2769l.m9237a(getBoundReceiver(), abstractC2777t.getBoundReceiver());
        }
        if (obj instanceof InterfaceC1091h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p019c3.InterfaceC1091h
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p019c3.InterfaceC1091h
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC1085b interfaceC1085bCompute = compute();
        if (interfaceC1085bCompute != this) {
            return interfaceC1085bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC2777t(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC2760c
    public InterfaceC1091h getReflected() {
        return (InterfaceC1091h) super.getReflected();
    }

    public AbstractC2777t(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
    }
}
