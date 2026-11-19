package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import p207y6.InterfaceC6778b;
import p207y6.InterfaceC6787k;
import p207y6.InterfaceC6792p;

/* loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements InterfaceC6792p {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC6778b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && AbstractC5830k.m5325b(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof InterfaceC6792p) {
            return obj.equals(compute());
        }
        return false;
    }

    @NotNull
    public abstract /* synthetic */ InterfaceC6787k getGetter();

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // p207y6.InterfaceC6792p
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p207y6.InterfaceC6792p
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC6778b interfaceC6778bCompute = compute();
        if (interfaceC6778bCompute != this) {
            return interfaceC6778bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public InterfaceC6792p getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC6792p) super.getReflected();
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
