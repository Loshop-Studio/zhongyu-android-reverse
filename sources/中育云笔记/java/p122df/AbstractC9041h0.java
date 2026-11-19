package p122df;

import com.alibaba.android.arouter.utils.Consts;
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
import je.AbstractC9746z;
import okio.Buffer;
import p309qc.C10786q;

/* renamed from: df.h0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9041h0 {

    /* renamed from: a */
    public static final Type[] f21110a = new Type[0];

    /* renamed from: b */
    public static boolean f21111b = true;

    /* renamed from: df.h0$a */
    public static final class a implements GenericArrayType {

        /* renamed from: c */
        public final Type f21112c;

        public a(Type type) {
            this.f21112c = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC9041h0.m17742d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f21112c;
        }

        public int hashCode() {
            return this.f21112c.hashCode();
        }

        public String toString() {
            return AbstractC9041h0.m17759u(this.f21112c) + "[]";
        }
    }

    /* renamed from: df.h0$b */
    public static final class b implements ParameterizedType {

        /* renamed from: c */
        public final Type f21113c;

        /* renamed from: d */
        public final Type f21114d;

        /* renamed from: e */
        public final Type[] f21115e;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                AbstractC9041h0.m17740b(type3);
            }
            this.f21113c = type;
            this.f21114d = type2;
            this.f21115e = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC9041h0.m17742d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f21115e.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f21113c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f21114d;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f21115e) ^ this.f21114d.hashCode();
            Type type = this.f21113c;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f21115e;
            if (typeArr.length == 0) {
                return AbstractC9041h0.m17759u(this.f21114d);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(AbstractC9041h0.m17759u(this.f21114d));
            sb2.append("<");
            sb2.append(AbstractC9041h0.m17759u(this.f21115e[0]));
            for (int i10 = 1; i10 < this.f21115e.length; i10++) {
                sb2.append(", ");
                sb2.append(AbstractC9041h0.m17759u(this.f21115e[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: df.h0$c */
    public static final class c implements WildcardType {

        /* renamed from: c */
        public final Type f21116c;

        /* renamed from: d */
        public final Type f21117d;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC9041h0.m17740b(typeArr[0]);
                this.f21117d = null;
                this.f21116c = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            AbstractC9041h0.m17740b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f21117d = typeArr2[0];
            this.f21116c = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC9041h0.m17742d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f21117d;
            return type != null ? new Type[]{type} : AbstractC9041h0.f21110a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f21116c};
        }

        public int hashCode() {
            Type type = this.f21117d;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f21116c.hashCode() + 31);
        }

        public String toString() {
            if (this.f21117d != null) {
                return "? super " + AbstractC9041h0.m17759u(this.f21117d);
            }
            if (this.f21116c == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC9041h0.m17759u(this.f21116c);
        }
    }

    /* renamed from: a */
    public static AbstractC9746z m17739a(AbstractC9746z abstractC9746z) {
        Buffer buffer = new Buffer();
        abstractC9746z.source().readAll(buffer);
        return AbstractC9746z.create(abstractC9746z.contentType(), abstractC9746z.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m17740b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m17741c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m17742d(Type type, Type type2) {
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
                return m17742d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m17743e(Type type, Class cls, Class cls2) {
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
                    return m17743e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m17743e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m17744f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* renamed from: g */
    public static Type m17745g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m17746h(Type type) {
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
            return Array.newInstance((Class<?>) m17746h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m17746h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m17747i(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m17756r(type, cls, m17743e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m17748j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m17748j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m17748j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m17749k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m17750l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m17751m(Type type) {
        return f21111b && type == C10786q.class;
    }

    /* renamed from: n */
    public static RuntimeException m17752n(Method method, String str, Object... objArr) {
        return m17753o(method, null, str, objArr);
    }

    /* renamed from: o */
    public static RuntimeException m17753o(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + Consts.DOT + method.getName(), th);
    }

    /* renamed from: p */
    public static RuntimeException m17754p(Method method, int i10, String str, Object... objArr) {
        return m17752n(method, str + " (" + AbstractC9056w.f21211b.mo17792a(method, i10) + ")", objArr);
    }

    /* renamed from: q */
    public static RuntimeException m17755q(Method method, Throwable th, int i10, String str, Object... objArr) {
        return m17753o(method, th, str + " (" + AbstractC9056w.f21211b.mo17792a(method, i10) + ")", objArr);
    }

    /* renamed from: r */
    public static Type m17756r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeM17757s = m17757s(type, cls, typeVariable);
            if (typeM17757s == typeVariable) {
                return typeM17757s;
            }
            type3 = typeM17757s;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM17756r = m17756r(type, cls, componentType);
                return componentType == typeM17756r ? cls2 : new a(typeM17756r);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM17756r2 = m17756r(type, cls, genericComponentType);
            return genericComponentType == typeM17756r2 ? genericArrayType : new a(typeM17756r2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM17756r3 = m17756r(type, cls, ownerType);
            boolean z10 = typeM17756r3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeM17756r4 = m17756r(type, cls, actualTypeArguments[i10]);
                if (typeM17756r4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeM17756r4;
                }
            }
            return z10 ? new b(typeM17756r3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM17756r5 = m17756r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeM17756r5 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{typeM17756r5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM17756r6 = m17756r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeM17756r6 != upperBounds[0]) {
                        return new c(new Type[]{typeM17756r6}, f21110a);
                    }
                }
            }
        }
        return type4;
    }

    /* renamed from: s */
    public static Type m17757s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM17741c = m17741c(typeVariable);
        if (clsM17741c != null) {
            Type typeM17743e = m17743e(type, cls, clsM17741c);
            if (typeM17743e instanceof ParameterizedType) {
                return ((ParameterizedType) typeM17743e).getActualTypeArguments()[m17749k(clsM17741c.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* renamed from: t */
    public static void m17758t(Throwable th) {
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
    public static String m17759u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
