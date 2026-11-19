package kotlin.jvm.internal;

import p089e8.InterfaceC8374b;
import p089e8.InterfaceC8379g;

/* loaded from: classes5.dex */
public abstract class FunctionReference extends CallableReference implements InterfaceC9130r, InterfaceC8379g {
    private final int arity;
    private final int flags;

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8374b computeReflected() {
        return AbstractC9137y.m16153a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && AbstractC9133u.m16128b(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC9133u.m16128b(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC8379g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9130r
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p089e8.InterfaceC8379g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p089e8.InterfaceC8379g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p089e8.InterfaceC8379g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p089e8.InterfaceC8379g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, p089e8.InterfaceC8374b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC8374b interfaceC8374bCompute = compute();
        if (interfaceC8374bCompute != this) {
            return interfaceC8374bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC8379g getReflected() {
        return (InterfaceC8379g) super.getReflected();
    }
}
