package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: retrofit2.r0 */
/* loaded from: classes4.dex */
public final class C6517r0 implements ParameterizedType {

    /* renamed from: a */
    public final Type f10782a;

    /* renamed from: b */
    public final Type f10783b;

    /* renamed from: c */
    public final Type[] f10784c;

    public C6517r0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC6522v.m6162d(type3);
        }
        this.f10782a = type;
        this.f10783b = type2;
        this.f10784c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC6522v.m6163e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f10784c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f10782a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f10783b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f10784c) ^ this.f10783b.hashCode();
        Type type = this.f10782a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f10784c;
        int length = typeArr.length;
        Type type = this.f10783b;
        if (length == 0) {
            return AbstractC6522v.m6177s(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC6522v.m6177s(type));
        sb.append("<");
        sb.append(AbstractC6522v.m6177s(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC6522v.m6177s(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
