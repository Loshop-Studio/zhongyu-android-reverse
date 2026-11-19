package p200z5;

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
import p058f5.AbstractC6364e0;

/* renamed from: z5.h0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7967h0 {

    /* renamed from: a */
    public static final Type[] f10762a = new Type[0];

    /* renamed from: b */
    public static boolean f10763b = true;

    /* renamed from: z5.h0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a */
        public final Type f10764a;

        public a(Type type) {
            this.f10764a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC7967h0.m9824d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f10764a;
        }

        public int hashCode() {
            return this.f10764a.hashCode();
        }

        public String toString() {
            return AbstractC7967h0.m9841u(this.f10764a) + "[]";
        }
    }

    /* renamed from: z5.h0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a */
        public final Type f10765a;

        /* renamed from: b */
        public final Type f10766b;

        /* renamed from: c */
        public final Type[] f10767c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC7967h0.m9822b(type3);
            }
            this.f10765a = type;
            this.f10766b = type2;
            this.f10767c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC7967h0.m9824d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f10767c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f10765a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f10766b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f10767c) ^ this.f10766b.hashCode();
            Type type = this.f10765a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f10767c;
            if (typeArr.length == 0) {
                return AbstractC7967h0.m9841u(this.f10766b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(AbstractC7967h0.m9841u(this.f10766b));
            sb.append("<");
            sb.append(AbstractC7967h0.m9841u(this.f10767c[0]));
            for (int i6 = 1; i6 < this.f10767c.length; i6++) {
                sb.append(", ");
                sb.append(AbstractC7967h0.m9841u(this.f10767c[i6]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: z5.h0$c */
    public static final class c implements WildcardType {

        /* renamed from: a */
        public final Type f10768a;

        /* renamed from: b */
        public final Type f10769b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC7967h0.m9822b(typeArr[0]);
                this.f10769b = null;
                this.f10768a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            AbstractC7967h0.m9822b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f10769b = typeArr2[0];
            this.f10768a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC7967h0.m9824d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f10769b;
            return type != null ? new Type[]{type} : AbstractC7967h0.f10762a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f10768a};
        }

        public int hashCode() {
            Type type = this.f10769b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10768a.hashCode() + 31);
        }

        public String toString() {
            if (this.f10769b != null) {
                return "? super " + AbstractC7967h0.m9841u(this.f10769b);
            }
            if (this.f10768a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC7967h0.m9841u(this.f10768a);
        }
    }

    /* renamed from: a */
    public static AbstractC6364e0 m9821a(AbstractC6364e0 abstractC6364e0) {
        Buffer buffer = new Buffer();
        abstractC6364e0.source().readAll(buffer);
        return AbstractC6364e0.create(abstractC6364e0.contentType(), abstractC6364e0.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m9822b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m9823c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m9824d(Type type, Type type2) {
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
                return m9824d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m9825e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i6 = 0; i6 < length; i6++) {
                Class<?> cls3 = interfaces[i6];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i6];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m9825e(cls.getGenericInterfaces()[i6], interfaces[i6], cls2);
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
                    return m9825e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m9826f(int i6, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i6];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m9827g(int i6, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i6 >= 0 && i6 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i6];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i6 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m9828h(Type type) {
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
            return Array.newInstance((Class<?>) m9828h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m9828h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m9829i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m9838r(type, cls, m9825e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m9830j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m9830j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m9830j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m9831k(Object[] objArr, Object obj) {
        for (int i6 = 0; i6 < objArr.length; i6++) {
            if (obj.equals(objArr[i6])) {
                return i6;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m9832l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m9833m(Type type) {
        return f10763b && type == Unit.class;
    }

    /* renamed from: n */
    public static RuntimeException m9834n(Method method, String str, Object... objArr) {
        return m9835o(method, null, str, objArr);
    }

    /* renamed from: o */
    public static RuntimeException m9835o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: p */
    public static RuntimeException m9836p(Method method, int i6, String str, Object... objArr) {
        return m9834n(method, str + " (" + AbstractC7982w.f10863b.mo9874a(method, i6) + ")", objArr);
    }

    /* renamed from: q */
    public static RuntimeException m9837q(Method method, Throwable th, int i6, String str, Object... objArr) {
        return m9835o(method, th, str + " (" + AbstractC7982w.f10863b.mo9874a(method, i6) + ")", objArr);
    }

    /* renamed from: r */
    public static Type m9838r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM9839s = m9839s(type, cls, typeVariable);
            if (typeM9839s == typeVariable) {
                return typeM9839s;
            }
            type3 = typeM9839s;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM9838r = m9838r(type, cls, componentType);
                return componentType == typeM9838r ? cls2 : new a(typeM9838r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM9838r2 = m9838r(type, cls, genericComponentType);
            return genericComponentType == typeM9838r2 ? genericArrayType : new a(typeM9838r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM9838r3 = m9838r(type, cls, ownerType);
            boolean z6 = typeM9838r3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i6 = 0; i6 < length; i6++) {
                Type typeM9838r4 = m9838r(type, cls, actualTypeArguments[i6]);
                if (typeM9838r4 != actualTypeArguments[i6]) {
                    if (!z6) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z6 = true;
                    }
                    actualTypeArguments[i6] = typeM9838r4;
                }
            }
            return z6 ? new b(typeM9838r3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z7 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z7) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM9838r5 = m9838r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM9838r5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM9838r5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM9838r6 = m9838r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM9838r6 != upperBounds[0]) {
                        return new c(new Type[]{typeM9838r6}, f10762a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: s */
    public static Type m9839s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM9823c = m9823c(typeVariable);
        if (clsM9823c != null) {
            Type typeM9825e = m9825e(type, cls, clsM9823c);
            if (typeM9825e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM9825e).getActualTypeArguments()[m9831k(clsM9823c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* renamed from: t */
    public static void m9840t(Throwable th) {
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
    public static String m9841u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
