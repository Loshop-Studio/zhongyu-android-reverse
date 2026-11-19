package p095k1;

import com.google.gson.internal.AbstractC3848e;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: k1.a */
/* loaded from: classes2.dex */
public class C5752a<T> {

    /* renamed from: a */
    public final Class f9103a;

    /* renamed from: b */
    public final Type f9104b;

    /* renamed from: c */
    public final int f9105c;

    public C5752a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C5752a.class) {
                Type typeM2800a = AbstractC3848e.m2800a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    m5094a(typeM2800a);
                }
                this.f9104b = typeM2800a;
                this.f9103a = AbstractC3848e.m2807h(typeM2800a);
                this.f9105c = typeM2800a.hashCode();
                return;
            }
        } else if (genericSuperclass == C5752a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* renamed from: a */
    public static void m5094a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m5094a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m5094a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                m5094a(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m5094a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            m5094a(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5752a) {
            return AbstractC3848e.m2804e(this.f9104b, ((C5752a) obj).f9104b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9105c;
    }

    public final String toString() {
        return AbstractC3848e.m2810k(this.f9104b);
    }

    public C5752a(Type type) {
        Objects.requireNonNull(type);
        Type typeM2800a = AbstractC3848e.m2800a(type);
        this.f9104b = typeM2800a;
        this.f9103a = AbstractC3848e.m2807h(typeM2800a);
        this.f9105c = typeM2800a.hashCode();
    }
}
