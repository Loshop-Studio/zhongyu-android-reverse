package p226r9;

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
import kotlin.Unit;
import okio.Buffer;
import p011a9.AbstractC0063z;

/* renamed from: r9.h0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9067h0 {

    /* renamed from: a */
    public static final Type[] f15607a = new Type[0];

    /* renamed from: b */
    public static boolean f15608b = true;

    /* renamed from: r9.h0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f15609a;

        public a(Type type) {
            this.f15609a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC9067h0.m15282d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f15609a;
        }

        public int hashCode() {
            return this.f15609a.hashCode();
        }

        public String toString() {
            return AbstractC9067h0.m15299u(this.f15609a) + "[]";
        }
    }

    /* renamed from: r9.h0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f15610a;

        /* renamed from: b */
        public final Type f15611b;

        /* renamed from: c */
        public final Type[] f15612c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC9067h0.m15280b(type3);
            }
            this.f15610a = type;
            this.f15611b = type2;
            this.f15612c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC9067h0.m15282d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f15612c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f15610a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f15611b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f15612c) ^ this.f15611b.hashCode();
            Type type = this.f15610a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f15612c;
            if (typeArr.length == 0) {
                return AbstractC9067h0.m15299u(this.f15611b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(AbstractC9067h0.m15299u(this.f15611b));
            sb.append("<");
            sb.append(AbstractC9067h0.m15299u(this.f15612c[0]));
            for (int i10 = 1; i10 < this.f15612c.length; i10++) {
                sb.append(", ");
                sb.append(AbstractC9067h0.m15299u(this.f15612c[i10]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: r9.h0$c */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f15613a;

        /* renamed from: b */
        public final Type f15614b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC9067h0.m15280b(typeArr[0]);
                this.f15614b = null;
                this.f15613a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            AbstractC9067h0.m15280b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f15614b = typeArr2[0];
            this.f15613a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC9067h0.m15282d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f15614b;
            return type != null ? new Type[]{type} : AbstractC9067h0.f15607a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f15613a};
        }

        public int hashCode() {
            Type type = this.f15614b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f15613a.hashCode() + 31);
        }

        public String toString() {
            if (this.f15614b != null) {
                return "? super " + AbstractC9067h0.m15299u(this.f15614b);
            }
            if (this.f15613a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC9067h0.m15299u(this.f15613a);
        }
    }

    /* renamed from: a */
    public static AbstractC0063z m15279a(AbstractC0063z abstractC0063z) throws IOException {
        Buffer buffer = new Buffer();
        abstractC0063z.source().readAll(buffer);
        return AbstractC0063z.create(abstractC0063z.contentType(), abstractC0063z.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m15280b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m15281c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m15282d(Type type, Type type2) {
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
                return m15282d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m15283e(Type type, Class cls, Class cls2) {
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
                    return m15283e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m15283e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m15284f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m15285g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m15286h(Type type) {
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
            return Array.newInstance((Class<?>) m15286h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m15286h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m15287i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m15296r(type, cls, m15283e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m15288j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m15288j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m15288j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m15289k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m15290l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m15291m(Type type) {
        return f15608b && type == Unit.class;
    }

    /* renamed from: n */
    public static RuntimeException m15292n(Method method, String str, Object... objArr) {
        return m15293o(method, null, str, objArr);
    }

    /* renamed from: o */
    public static RuntimeException m15293o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: p */
    public static RuntimeException m15294p(Method method, int i10, String str, Object... objArr) {
        return m15292n(method, str + " (" + AbstractC9082w.f15708b.mo15332a(method, i10) + ")", objArr);
    }

    /* renamed from: q */
    public static RuntimeException m15295q(Method method, Throwable th, int i10, String str, Object... objArr) {
        return m15293o(method, th, str + " (" + AbstractC9082w.f15708b.mo15332a(method, i10) + ")", objArr);
    }

    /* renamed from: r */
    public static Type m15296r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM15297s = m15297s(type, cls, typeVariable);
            if (typeM15297s == typeVariable) {
                return typeM15297s;
            }
            type3 = typeM15297s;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM15296r = m15296r(type, cls, componentType);
                return componentType == typeM15296r ? cls2 : new a(typeM15296r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM15296r2 = m15296r(type, cls, genericComponentType);
            return genericComponentType == typeM15296r2 ? genericArrayType : new a(typeM15296r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM15296r3 = m15296r(type, cls, ownerType);
            boolean z9 = typeM15296r3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeM15296r4 = m15296r(type, cls, actualTypeArguments[i10]);
                if (typeM15296r4 != actualTypeArguments[i10]) {
                    if (!z9) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z9 = true;
                    }
                    actualTypeArguments[i10] = typeM15296r4;
                }
            }
            return z9 ? new b(typeM15296r3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z10 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z10) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM15296r5 = m15296r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM15296r5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM15296r5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM15296r6 = m15296r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM15296r6 != upperBounds[0]) {
                        return new c(new Type[]{typeM15296r6}, f15607a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: s */
    public static Type m15297s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM15281c = m15281c(typeVariable);
        if (clsM15281c != null) {
            Type typeM15283e = m15283e(type, cls, clsM15281c);
            if (typeM15283e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM15283e).getActualTypeArguments()[m15289k(clsM15281c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* renamed from: t */
    public static void m15298t(Throwable th) {
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
    public static String m15299u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
