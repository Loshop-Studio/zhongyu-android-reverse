package p070b.p074b.p105b.p106a0;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.C0562a;

/* renamed from: b.b.b.a0.a */
/* loaded from: classes.dex */
public final class C0708a {

    /* renamed from: a */
    public static final Type[] f4201a = new Type[0];

    /* renamed from: b.b.b.a0.a$a */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: b */
        public final Type f4202b;

        public a(Type type) {
            this.f4202b = C0708a.m2355a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0708a.m2357c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4202b;
        }

        public int hashCode() {
            return this.f4202b.hashCode();
        }

        public String toString() {
            return C0708a.m2363i(this.f4202b) + "[]";
        }
    }

    /* renamed from: b.b.b.a0.a$b */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: b */
        public final Type f4203b;

        /* renamed from: c */
        public final Type f4204c;

        /* renamed from: d */
        public final Type[] f4205d;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C0562a.m2080a(z);
            }
            this.f4203b = type == null ? null : C0708a.m2355a(type);
            this.f4204c = C0708a.m2355a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f4205d = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f4205d[i]);
                C0708a.m2356b(this.f4205d[i]);
                Type[] typeArr3 = this.f4205d;
                typeArr3[i] = C0708a.m2355a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0708a.m2357c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4205d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f4203b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f4204c;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f4205d) ^ this.f4204c.hashCode();
            Type type = this.f4203b;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f4205d.length;
            if (length == 0) {
                return C0708a.m2363i(this.f4204c);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C0708a.m2363i(this.f4204c));
            sb.append("<");
            sb.append(C0708a.m2363i(this.f4205d[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C0708a.m2363i(this.f4205d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: b.b.b.a0.a$c */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: b */
        public final Type f4206b;

        /* renamed from: c */
        public final Type f4207c;

        public c(Type[] typeArr, Type[] typeArr2) {
            C0562a.m2080a(typeArr2.length <= 1);
            C0562a.m2080a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C0708a.m2356b(typeArr[0]);
                this.f4207c = null;
                this.f4206b = C0708a.m2355a(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            C0708a.m2356b(typeArr2[0]);
            C0562a.m2080a(typeArr[0] == Object.class);
            this.f4207c = C0708a.m2355a(typeArr2[0]);
            this.f4206b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0708a.m2357c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f4207c;
            return type != null ? new Type[]{type} : C0708a.f4201a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f4206b};
        }

        public int hashCode() {
            Type type = this.f4207c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4206b.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sbM2079g;
            Type type;
            if (this.f4207c != null) {
                sbM2079g = C0561a.m2079g("? super ");
                type = this.f4207c;
            } else {
                if (this.f4206b == Object.class) {
                    return "?";
                }
                sbM2079g = C0561a.m2079g("? extends ");
                type = this.f4206b;
            }
            sbM2079g.append(C0708a.m2363i(type));
            return sbM2079g.toString();
        }
    }

    /* renamed from: a */
    public static Type m2355a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m2355a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: b */
    public static void m2356b(Type type) {
        C0562a.m2080a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: c */
    public static boolean m2357c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m2357c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: d */
    public static Type m2358d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m2358d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m2358d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Class<?> m2359e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C0562a.m2080a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m2359e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m2359e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: f */
    public static Type m2360f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C0562a.m2080a(cls2.isAssignableFrom(cls));
        return m2361g(type, cls, m2358d(type, cls, cls2));
    }

    /* renamed from: g */
    public static Type m2361g(Type type, Class<?> cls, Type type2) {
        return m2362h(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type m2362h(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p106a0.C0708a.m2362h(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: i */
    public static String m2363i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
