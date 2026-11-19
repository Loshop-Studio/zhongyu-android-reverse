package retrofit2;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: retrofit2.s0 */
/* loaded from: classes4.dex */
public final class C6519s0 implements WildcardType {

    /* renamed from: a */
    public final Type f10789a;

    /* renamed from: b */
    public final Type f10790b;

    public C6519s0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC6522v.m6162d(typeArr[0]);
            this.f10790b = null;
            this.f10789a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC6522v.m6162d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f10790b = typeArr2[0];
        this.f10789a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC6522v.m6163e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f10790b;
        return type != null ? new Type[]{type} : AbstractC6522v.f10795a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f10789a};
    }

    public final int hashCode() {
        Type type = this.f10790b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10789a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f10790b;
        if (type != null) {
            return "? super " + AbstractC6522v.m6177s(type);
        }
        Type type2 = this.f10789a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC6522v.m6177s(type2);
    }
}
