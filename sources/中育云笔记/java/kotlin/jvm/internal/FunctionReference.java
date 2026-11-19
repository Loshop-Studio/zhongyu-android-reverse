package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10473g;

/* loaded from: classes6.dex */
public abstract class FunctionReference extends CallableReference implements InterfaceC9976r, InterfaceC10473g {
    private final int arity;
    private final int flags;

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b computeReflected() {
        return AbstractC9983y.m20314a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && AbstractC9979u.m20289b(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC9979u.m20289b(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC10473g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9976r
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p280od.InterfaceC10473g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p280od.InterfaceC10473g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p280od.InterfaceC10473g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p280od.InterfaceC10473g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, p280od.InterfaceC10468b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC10468b interfaceC10468bCompute = compute();
        if (interfaceC10468bCompute != this) {
            return interfaceC10468bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10473g getReflected() {
        return (InterfaceC10473g) super.getReflected();
    }
}
