package kotlin.jvm.internal;

import androidx.collection.AbstractC0584a;
import java.io.Serializable;
import kotlin.SinceKotlin;
import p207y6.InterfaceC6780d;

@SinceKotlin(version = "1.4")
/* loaded from: classes2.dex */
public class AdaptedFunctionReference implements InterfaceC5827h, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i, Class cls, String str, String str2, int i8) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && AbstractC5830k.m5325b(this.receiver, adaptedFunctionReference.receiver) && AbstractC5830k.m5325b(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC5827h
    public int getArity() {
        return this.arity;
    }

    public InterfaceC6780d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return AbstractC5832m.m5340a(cls);
        }
        AbstractC5832m.f9223a.getClass();
        return new C5831l(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((AbstractC0584a.m903d(AbstractC0584a.m903d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        AbstractC5832m.f9223a.getClass();
        return C5833n.m5342a(this);
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i8 & 1) == 1;
        this.arity = i;
        this.flags = i8 >> 1;
    }
}
