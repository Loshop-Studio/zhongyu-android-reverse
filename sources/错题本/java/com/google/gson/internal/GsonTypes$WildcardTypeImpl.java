package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes2.dex */
final class GsonTypes$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type lowerBound;
    private final Type upperBound;

    public GsonTypes$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        AbstractC3848e.m2801b(typeArr2.length <= 1);
        AbstractC3848e.m2801b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC3848e.m2802c(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = AbstractC3848e.m2800a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC3848e.m2802c(typeArr2[0]);
        AbstractC3848e.m2801b(typeArr[0] == Object.class);
        this.lowerBound = AbstractC3848e.m2800a(typeArr2[0]);
        this.upperBound = Object.class;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC3848e.m2804e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type != null ? new Type[]{type} : AbstractC3848e.f3030a;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        return new Type[]{this.upperBound};
    }

    public int hashCode() {
        Type type = this.lowerBound;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
    }

    public String toString() {
        if (this.lowerBound != null) {
            return "? super " + AbstractC3848e.m2810k(this.lowerBound);
        }
        if (this.upperBound == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC3848e.m2810k(this.upperBound);
    }
}
