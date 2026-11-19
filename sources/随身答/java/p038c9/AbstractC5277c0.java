package p038c9;

import java.io.IOException;
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
import p172l8.AbstractC8927z;

/* renamed from: c9.c0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5277c0 {

    /* renamed from: a */
    public static final Type[] f2524a = new Type[0];

    /* renamed from: c9.c0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f2525a;

        public a(Type type) {
            this.f2525a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC5277c0.m2428d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f2525a;
        }

        public int hashCode() {
            return this.f2525a.hashCode();
        }

        public String toString() {
            return AbstractC5277c0.m2444t(this.f2525a) + "[]";
        }
    }

    /* renamed from: c9.c0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f2526a;

        /* renamed from: b */
        public final Type f2527b;

        /* renamed from: c */
        public final Type[] f2528c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC5277c0.m2426b(type3);
            }
            this.f2526a = type;
            this.f2527b = type2;
            this.f2528c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC5277c0.m2428d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f2528c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f2526a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f2527b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f2528c) ^ this.f2527b.hashCode();
            Type type = this.f2526a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f2528c;
            if (typeArr.length == 0) {
                return AbstractC5277c0.m2444t(this.f2527b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(AbstractC5277c0.m2444t(this.f2527b));
            sb.append("<");
            sb.append(AbstractC5277c0.m2444t(this.f2528c[0]));
            for (int i9 = 1; i9 < this.f2528c.length; i9++) {
                sb.append(", ");
                sb.append(AbstractC5277c0.m2444t(this.f2528c[i9]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: c9.c0$c */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f2529a;

        /* renamed from: b */
        public final Type f2530b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC5277c0.m2426b(typeArr[0]);
                this.f2530b = null;
                this.f2529a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            AbstractC5277c0.m2426b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f2530b = typeArr2[0];
            this.f2529a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC5277c0.m2428d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f2530b;
            return type != null ? new Type[]{type} : AbstractC5277c0.f2524a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f2529a};
        }

        public int hashCode() {
            Type type = this.f2530b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2529a.hashCode() + 31);
        }

        public String toString() {
            if (this.f2530b != null) {
                return "? super " + AbstractC5277c0.m2444t(this.f2530b);
            }
            if (this.f2529a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC5277c0.m2444t(this.f2529a);
        }
    }

    /* renamed from: a */
    public static AbstractC8927z m2425a(AbstractC8927z abstractC8927z) throws IOException {
        Buffer buffer = new Buffer();
        abstractC8927z.source().readAll(buffer);
        return AbstractC8927z.create(abstractC8927z.contentType(), abstractC8927z.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m2426b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m2427c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m2428d(Type type, Type type2) {
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
                return m2428d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m2429e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i9 = 0; i9 < length; i9++) {
                Class<?> cls3 = interfaces[i9];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i9];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m2429e(cls.getGenericInterfaces()[i9], interfaces[i9], cls2);
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
                    return m2429e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m2430f(int i9, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i9];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m2431g(int i9, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i9 >= 0 && i9 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i9];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i9 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m2432h(Type type) {
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
            return Array.newInstance((Class<?>) m2432h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m2432h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m2433i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m2441q(type, cls, m2429e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m2434j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m2434j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m2434j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m2435k(Object[] objArr, Object obj) {
        for (int i9 = 0; i9 < objArr.length; i9++) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m2436l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m2437m(Method method, String str, Object... objArr) {
        return m2438n(method, null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m2438n(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m2439o(Method method, int i9, String str, Object... objArr) {
        return m2437m(method, str + " (parameter #" + (i9 + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m2440p(Method method, Throwable th, int i9, String str, Object... objArr) {
        return m2438n(method, th, str + " (parameter #" + (i9 + 1) + ")", objArr);
    }

    /* renamed from: q */
    public static Type m2441q(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM2442r = m2442r(type, cls, typeVariable);
            if (typeM2442r == typeVariable) {
                return typeM2442r;
            }
            type3 = typeM2442r;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM2441q = m2441q(type, cls, componentType);
                return componentType == typeM2441q ? cls2 : new a(typeM2441q);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM2441q2 = m2441q(type, cls, genericComponentType);
            return genericComponentType == typeM2441q2 ? genericArrayType : new a(typeM2441q2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM2441q3 = m2441q(type, cls, ownerType);
            boolean z9 = typeM2441q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i9 = 0; i9 < length; i9++) {
                Type typeM2441q4 = m2441q(type, cls, actualTypeArguments[i9]);
                if (typeM2441q4 != actualTypeArguments[i9]) {
                    if (!z9) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z9 = true;
                    }
                    actualTypeArguments[i9] = typeM2441q4;
                }
            }
            return z9 ? new b(typeM2441q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z10 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z10) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM2441q5 = m2441q(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM2441q5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM2441q5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM2441q6 = m2441q(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM2441q6 != upperBounds[0]) {
                        return new c(new Type[]{typeM2441q6}, f2524a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: r */
    public static Type m2442r(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM2427c = m2427c(typeVariable);
        if (clsM2427c != null) {
            Type typeM2429e = m2429e(type, cls, clsM2427c);
            if (typeM2429e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM2429e).getActualTypeArguments()[m2435k(clsM2427c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static void m2443s(Throwable th) {
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

    /* renamed from: t */
    public static String m2444t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
