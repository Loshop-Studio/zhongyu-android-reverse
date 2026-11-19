package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import com.alibaba.android.arouter.utils.Consts;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10788a;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10962o;

/* loaded from: classes.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final Companion Companion = new Companion(null);
    public static final NavType<Integer> IntType = new IntNavType();
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_REFERENCE;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return Integer.valueOf(SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(bundle), key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) throws NumberFormatException {
            int i10;
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC10819z.m23242O(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, AbstractC10788a.m23073a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void put(Bundle bundle, String key, @AnyRes int i10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(bundle), key, i10);
        }
    };
    public static final NavType<int[]> IntArrayType = new IntArrayNavType();
    public static final NavType<List<Integer>> IntListType = new IntListNavType();
    public static final NavType<Long> LongType = new LongNavType();
    public static final NavType<long[]> LongArrayType = new LongArrayNavType();
    public static final NavType<List<Long>> LongListType = new LongListNavType();
    public static final NavType<Float> FloatType = new FloatNavType();
    public static final NavType<float[]> FloatArrayType = new FloatArrayNavType();
    public static final NavType<List<Float>> FloatListType = new FloatListNavType();
    public static final NavType<Boolean> BoolType = new BoolNavType();
    public static final NavType<boolean[]> BoolArrayType = new BoolArrayNavType();
    public static final NavType<List<Boolean>> BoolListType = new BoolListNavType();
    public static final NavType<String> StringType = new StringNavType();
    public static final NavType<String[]> StringArrayType = new StringArrayNavType();
    public static final NavType<List<String>> StringListType = new StringListNavType();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public NavType<?> fromArgType(String str, String str2) throws ClassNotFoundException {
            String strSubstring;
            NavType<?> navTypeNavTypeFromArgType = NavTypeKt.navTypeFromArgType(str);
            if (navTypeNavTypeFromArgType != null) {
                return navTypeNavTypeFromArgType;
            }
            NavType<Integer> navType = NavType.ReferenceType;
            if (AbstractC9979u.m20289b(navType.getName(), str)) {
                return navType;
            }
            if (str == null || str.length() == 0) {
                return NavType.StringType;
            }
            try {
                if (!AbstractC10819z.m23242O(str, Consts.DOT, false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zM23229B = AbstractC10819z.m23229B(str, "[]", false, 2, null);
                if (zM23229B) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    AbstractC9979u.m20293f(strSubstring, "substring(...)");
                }
                Class<?> cls = Class.forName(strSubstring);
                AbstractC9979u.m20291d(cls);
                NavType<?> serializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(cls, zM23229B);
                if (serializableOrParcelableType$navigation_common_release != null) {
                    return serializableOrParcelableType$navigation_common_release;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return NavTypeKt.navTypeInferFromValue(value);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavType<Object> inferFromValueType(Object obj) {
            NavType<Object> navTypeNavTypeInferFromValueType = NavTypeKt.navTypeInferFromValueType(obj);
            if (navTypeNavTypeInferFromValueType != null) {
                return navTypeNavTypeInferFromValueType;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                NavType<String[]> navType = NavType.StringArrayType;
                AbstractC9979u.m20292e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            AbstractC9979u.m20291d(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC9979u.m20291d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    AbstractC9979u.m20292e(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                AbstractC9979u.m20291d(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    AbstractC9979u.m20292e(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new ParcelableType(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new EnumType(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new SerializableType(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        public final NavType<?> parseSerializableOrParcelableType$navigation_common_release(Class<?> clazz, boolean z10) {
            AbstractC9979u.m20294g(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return z10 ? new ParcelableArrayType(clazz) : new ParcelableType(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !z10) {
                return new EnumType(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return z10 ? new SerializableArrayType(clazz) : new SerializableType(clazz);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC9979u.m20289b(ParcelableArrayType.class, obj.getClass())) {
                return false;
            }
            return AbstractC9979u.m20289b(this.arrayType, ((ParcelableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(D[] dArr, D[] dArr2) {
            return AbstractC10962o.m23983d(dArr, dArr2);
        }
    }

    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC9979u.m20289b(ParcelableType.class, obj.getClass())) {
                return false;
            }
            return AbstractC9979u.m20289b(this.type, ((ParcelableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D d10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            this.type.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }
    }

    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC9979u.m20289b(SerializableArrayType.class, obj.getClass())) {
                return false;
            }
            return AbstractC9979u.m20289b(this.arrayType, ((SerializableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.arrayType.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D[] get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        public D[] parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D[] dArr) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(key, dArr);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(D[] dArr, D[] dArr2) {
            return AbstractC10962o.m23983d(dArr, dArr2);
        }
    }

    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableType) {
                return AbstractC9979u.m20289b(this.type, ((SerializableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D value) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z10, Class<D> type) {
            super(z10);
            AbstractC9979u.m20294g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z10) {
        this.isNullableAllowed = z10;
    }

    public static NavType<?> fromArgType(String str, String str2) {
        return Companion.fromArgType(str, str2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValue(String str) {
        return Companion.inferFromValue(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final NavType<Object> inferFromValueType(Object obj) {
        return Companion.inferFromValueType(obj);
    }

    public abstract T get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String value) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, key, value);
    }

    public abstract T parseValue(String str);

    public T parseValue(String value, T t10) {
        AbstractC9979u.m20294g(value, "value");
        return parseValue(value);
    }

    public abstract void put(Bundle bundle, String str, T t10);

    public String serializeAsValue(T t10) {
        return String.valueOf(t10);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(T t10, T t11) {
        return AbstractC9979u.m20289b(t10, t11);
    }

    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> type) {
            super(false, type);
            AbstractC9979u.m20294g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public D parseValue(String value) {
            D d10;
            AbstractC9979u.m20294g(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC9979u.m20293f(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (AbstractC10819z.m23230C(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(Bundle bundle, String key, String str, T t10) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(key, "key");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, key, str, t10);
    }
}
