package retrofit2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.q0 */
/* loaded from: classes4.dex */
public final class C6515q0 implements GenericArrayType {

    /* renamed from: a */
    public final Type f10778a;

    public C6515q0(Type type) {
        this.f10778a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC6522v.m6163e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f10778a;
    }

    public final int hashCode() {
        return this.f10778a.hashCode();
    }

    public final String toString() {
        return AbstractC6522v.m6177s(this.f10778a) + "[]";
    }
}
