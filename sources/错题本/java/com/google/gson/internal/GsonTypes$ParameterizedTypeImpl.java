package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
final class GsonTypes$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public GsonTypes$ParameterizedTypeImpl(Type type, Class<?> cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.ownerType = type == null ? null : AbstractC3848e.m2800a(type);
        this.rawType = AbstractC3848e.m2800a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.typeArguments = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.typeArguments[i]);
            AbstractC3848e.m2802c(this.typeArguments[i]);
            Type[] typeArr3 = this.typeArguments;
            typeArr3[i] = AbstractC3848e.m2800a(typeArr3[i]);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC3848e.m2804e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.typeArguments.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
        Type type = this.ownerType;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public String toString() {
        int length = this.typeArguments.length;
        if (length == 0) {
            return AbstractC3848e.m2810k(this.rawType);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(AbstractC3848e.m2810k(this.rawType));
        sb.append("<");
        sb.append(AbstractC3848e.m2810k(this.typeArguments[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(AbstractC3848e.m2810k(this.typeArguments[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
