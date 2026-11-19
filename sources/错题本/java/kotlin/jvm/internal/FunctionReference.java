package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6781e;

/* loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements InterfaceC5827h, InterfaceC6781e {
    private final int arity;

    @SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public InterfaceC6778b computeReflected() {
        AbstractC5832m.f9223a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && AbstractC5830k.m5325b(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC5830k.m5325b(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC6781e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC5827h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p207y6.InterfaceC6781e
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p207y6.InterfaceC6781e
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p207y6.InterfaceC6781e
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p207y6.InterfaceC6781e
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, p207y6.InterfaceC6778b
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC6778b interfaceC6778bCompute = compute();
        if (interfaceC6778bCompute != this) {
            return interfaceC6778bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public InterfaceC6781e getReflected() {
        return (InterfaceC6781e) super.getReflected();
    }

    @SinceKotlin(version = "1.4")
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i;
        this.flags = i8 >> 1;
    }
}
