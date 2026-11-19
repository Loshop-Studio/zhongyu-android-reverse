package p080j3;

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
import p117r2.AbstractC4498b0;

/* renamed from: j3.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3822i0 {

    /* renamed from: a */
    public static final Type[] f4641a = new Type[0];

    /* renamed from: j3.i0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f4642a;

        public a(Type type) {
            this.f4642a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC3822i0.m5056d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4642a;
        }

        public int hashCode() {
            return this.f4642a.hashCode();
        }

        public String toString() {
            return AbstractC3822i0.m5072t(this.f4642a) + "[]";
        }
    }

    /* renamed from: j3.i0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f4643a;

        /* renamed from: b */
        public final Type f4644b;

        /* renamed from: c */
        public final Type[] f4645c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC3822i0.m5054b(type3);
            }
            this.f4643a = type;
            this.f4644b = type2;
            this.f4645c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC3822i0.m5056d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4645c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f4643a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f4644b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f4645c) ^ this.f4644b.hashCode();
            Type type = this.f4643a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f4645c;
            if (typeArr.length == 0) {
                return AbstractC3822i0.m5072t(this.f4644b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(AbstractC3822i0.m5072t(this.f4644b));
            sb.append("<");
            sb.append(AbstractC3822i0.m5072t(this.f4645c[0]));
            for (int i4 = 1; i4 < this.f4645c.length; i4++) {
                sb.append(", ");
                sb.append(AbstractC3822i0.m5072t(this.f4645c[i4]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: j3.i0$c */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f4646a;

        /* renamed from: b */
        public final Type f4647b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                AbstractC3822i0.m5054b(type);
                this.f4647b = null;
                this.f4646a = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            AbstractC3822i0.m5054b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f4647b = typeArr2[0];
            this.f4646a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC3822i0.m5056d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f4647b;
            return type != null ? new Type[]{type} : AbstractC3822i0.f4641a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f4646a};
        }

        public int hashCode() {
            Type type = this.f4647b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4646a.hashCode() + 31);
        }

        public String toString() {
            if (this.f4647b != null) {
                return "? super " + AbstractC3822i0.m5072t(this.f4647b);
            }
            if (this.f4646a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC3822i0.m5072t(this.f4646a);
        }
    }

    /* renamed from: a */
    public static AbstractC4498b0 m5053a(AbstractC4498b0 abstractC4498b0) throws IOException {
        Buffer buffer = new Buffer();
        abstractC4498b0.mo5092f().readAll(buffer);
        return AbstractC4498b0.m5838e(abstractC4498b0.mo5091d(), abstractC4498b0.mo5090c(), buffer);
    }

    /* renamed from: b */
    public static void m5054b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m5055c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m5056d(Type type, Type type2) {
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
                return m5056d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m5057e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i4 = 0; i4 < length; i4++) {
                Class<?> cls3 = interfaces[i4];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i4];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m5057e(cls.getGenericInterfaces()[i4], interfaces[i4], cls2);
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
                    return m5057e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m5058f(int i4, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i4];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m5059g(int i4, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i4 >= 0 && i4 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i4];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i4 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m5060h(Type type) {
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
            return Array.newInstance((Class<?>) m5060h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5060h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m5061i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m5069q(type, cls, m5057e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m5062j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m5062j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m5062j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m5063k(Object[] objArr, Object obj) {
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (obj.equals(objArr[i4])) {
                return i4;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m5064l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m5065m(Method method, String str, Object... objArr) {
        return m5066n(method, null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m5066n(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m5067o(Method method, int i4, String str, Object... objArr) {
        return m5065m(method, str + " (parameter #" + (i4 + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m5068p(Method method, Throwable th, int i4, String str, Object... objArr) {
        return m5066n(method, th, str + " (parameter #" + (i4 + 1) + ")", objArr);
    }

    /* renamed from: q */
    public static Type m5069q(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM5070r = m5070r(type, cls, typeVariable);
            if (typeM5070r == typeVariable) {
                return typeM5070r;
            }
            type3 = typeM5070r;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM5069q = m5069q(type, cls, componentType);
                return componentType == typeM5069q ? cls2 : new a(typeM5069q);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM5069q2 = m5069q(type, cls, genericComponentType);
            return genericComponentType == typeM5069q2 ? genericArrayType : new a(typeM5069q2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM5069q3 = m5069q(type, cls, ownerType);
            boolean z3 = typeM5069q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i4 = 0; i4 < length; i4++) {
                Type typeM5069q4 = m5069q(type, cls, actualTypeArguments[i4]);
                if (typeM5069q4 != actualTypeArguments[i4]) {
                    if (!z3) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z3 = true;
                    }
                    actualTypeArguments[i4] = typeM5069q4;
                }
            }
            return z3 ? new b(typeM5069q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z4 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z4) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM5069q5 = m5069q(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM5069q5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM5069q5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM5069q6 = m5069q(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM5069q6 != upperBounds[0]) {
                        return new c(new Type[]{typeM5069q6}, f4641a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: r */
    public static Type m5070r(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM5055c = m5055c(typeVariable);
        if (clsM5055c == null) {
            return typeVariable;
        }
        Type typeM5057e = m5057e(type, cls, clsM5055c);
        if (!(typeM5057e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM5057e).getActualTypeArguments()[m5063k(clsM5055c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static void m5071s(Throwable th) {
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
    public static String m5072t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
