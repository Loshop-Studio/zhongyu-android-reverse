package kotlin.jvm.internal;

import p280od.InterfaceC10468b;
import p280od.InterfaceC10478l;

/* loaded from: classes6.dex */
public abstract class PropertyReference extends CallableReference implements InterfaceC10478l {
    private final boolean syntheticJavaProperty;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10468b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && AbstractC9979u.m20289b(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof InterfaceC10478l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p280od.InterfaceC10478l
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p280od.InterfaceC10478l
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC10468b interfaceC10468bCompute = compute();
        if (interfaceC10468bCompute != this) {
            return interfaceC10468bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC10478l getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC10478l) super.getReflected();
    }
}
