package ca;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okio.Buffer;
import p123h7.C8736p;
import p136i9.AbstractC8905e0;

/* renamed from: ca.h0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5291h0 {

    /* renamed from: a */
    public static final Type[] f2501a = new Type[0];

    /* renamed from: b */
    public static boolean f2502b = true;

    /* renamed from: ca.h0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f2503a;

        public a(Type type) {
            this.f2503a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC5291h0.m2284d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f2503a;
        }

        public int hashCode() {
            return this.f2503a.hashCode();
        }

        public String toString() {
            return AbstractC5291h0.m2301u(this.f2503a) + "[]";
        }
    }

    /* renamed from: ca.h0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f2504a;

        /* renamed from: b */
        public final Type f2505b;

        /* renamed from: c */
        public final Type[] f2506c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC5291h0.m2282b(type3);
            }
            this.f2504a = type;
            this.f2505b = type2;
            this.f2506c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC5291h0.m2284d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f2506c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f2504a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f2505b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f2506c) ^ this.f2505b.hashCode();
            Type type = this.f2504a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f2506c;
            if (typeArr.length == 0) {
                return AbstractC5291h0.m2301u(this.f2505b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(AbstractC5291h0.m2301u(this.f2505b));
            sb.append("<");
            sb.append(AbstractC5291h0.m2301u(this.f2506c[0]));
            for (int i10 = 1; i10 < this.f2506c.length; i10++) {
                sb.append(", ");
                sb.append(AbstractC5291h0.m2301u(this.f2506c[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: ca.h0$c */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f2507a;

        /* renamed from: b */
        public final Type f2508b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC5291h0.m2282b(typeArr[0]);
                this.f2508b = null;
                this.f2507a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            AbstractC5291h0.m2282b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f2508b = typeArr2[0];
            this.f2507a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC5291h0.m2284d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f2508b;
            return type != null ? new Type[]{type} : AbstractC5291h0.f2501a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f2507a};
        }

        public int hashCode() {
            Type type = this.f2508b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2507a.hashCode() + 31);
        }

        public String toString() {
            if (this.f2508b != null) {
                return "? super " + AbstractC5291h0.m2301u(this.f2508b);
            }
            if (this.f2507a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC5291h0.m2301u(this.f2507a);
        }
    }

    /* renamed from: a */
    public static AbstractC8905e0 m2281a(AbstractC8905e0 abstractC8905e0) {
        Buffer buffer = new Buffer();
        abstractC8905e0.source().readAll(buffer);
        return AbstractC8905e0.create(abstractC8905e0.contentType(), abstractC8905e0.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m2282b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m2283c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m2284d(Type type, Type type2) {
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
                return m2284d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: e */
    public static Type m2285e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m2285e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m2285e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m2286f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m2287g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m2288h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m2288h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m2288h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m2289i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m2298r(type, cls, m2285e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m2290j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m2290j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m2290j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m2291k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m2292l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m2293m(Type type) {
        return f2502b && type == C8736p.class;
    }

    /* renamed from: n */
    public static RuntimeException m2294n(Method method, String str, Object... objArr) {
        return m2295o(method, null, str, objArr);
    }

    /* renamed from: o */
    public static RuntimeException m2295o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: p */
    public static RuntimeException m2296p(Method method, int i10, String str, Object... objArr) {
        return m2294n(method, str + " (" + AbstractC5306w.f2602b.mo2336a(method, i10) + ")", objArr);
    }

    /* renamed from: q */
    public static RuntimeException m2297q(Method method, Throwable th, int i10, String str, Object... objArr) {
        return m2295o(method, th, str + " (" + AbstractC5306w.f2602b.mo2336a(method, i10) + ")", objArr);
    }

    /* renamed from: r */
    public static Type m2298r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM2299s = m2299s(type, cls, typeVariable);
            if (typeM2299s == typeVariable) {
                return typeM2299s;
            }
            type3 = typeM2299s;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM2298r = m2298r(type, cls, componentType);
                return componentType == typeM2298r ? cls2 : new a(typeM2298r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM2298r2 = m2298r(type, cls, genericComponentType);
            return genericComponentType == typeM2298r2 ? genericArrayType : new a(typeM2298r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM2298r3 = m2298r(type, cls, ownerType);
            boolean z10 = typeM2298r3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeM2298r4 = m2298r(type, cls, actualTypeArguments[i10]);
                if (typeM2298r4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeM2298r4;
                }
            }
            return z10 ? new b(typeM2298r3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM2298r5 = m2298r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM2298r5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM2298r5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM2298r6 = m2298r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM2298r6 != upperBounds[0]) {
                        return new c(new Type[]{typeM2298r6}, f2501a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: s */
    public static Type m2299s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM2283c = m2283c(typeVariable);
        if (clsM2283c != null) {
            Type typeM2285e = m2285e(type, cls, clsM2283c);
            if (typeM2285e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM2285e).getActualTypeArguments()[m2291k(clsM2283c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* renamed from: t */
    public static void m2300t(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: u */
    public static String m2301u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
