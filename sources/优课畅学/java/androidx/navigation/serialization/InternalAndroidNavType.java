package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes3.dex */
public final class InternalAndroidNavType {
    public static final InternalAndroidNavType INSTANCE = new InternalAndroidNavType();

    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(Class<D> type) {
            super(true);
            AbstractC9133u.m16133g(type, "type");
            this.enumNavType = new NavType.EnumType<>(type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EnumListType) {
                return AbstractC9133u.m16128b(this.enumNavType, ((EnumListType) obj).enumNavType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<" + this.enumNavType.getName() + "}>";
        }

        public int hashCode() {
            return this.enumNavType.hashCode();
        }

        @Override // androidx.navigation.CollectionNavType
        public List<D> emptyCollection() {
            return AbstractC8809v.m14771n();
        }

        @Override // androidx.navigation.NavType
        public List<D> get(Bundle bundle, String key) {
            AbstractC9133u.m16133g(bundle, "bundle");
            AbstractC9133u.m16133g(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<? extends D> list) {
            AbstractC9133u.m16133g(bundle, "bundle");
            AbstractC9133u.m16133g(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(List<? extends D> list) {
            if (list == null) {
                return AbstractC8809v.m14771n();
            }
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<? extends D> list, List<? extends D> list2) {
            return AbstractC9133u.m16128b(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String value) {
            AbstractC9133u.m16133g(value, "value");
            return AbstractC8807u.m14755e(this.enumNavType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String value, List<? extends D> list) {
            List<D> listM14529F0;
            AbstractC9133u.m16133g(value, "value");
            return (list == null || (listM14529F0 = AbstractC8778f0.m14529F0(list, parseValue(value))) == null) ? parseValue(value) : listM14529F0;
        }
    }

    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class<D> type) {
            super(true);
            AbstractC9133u.m16133g(type, "type");
            this.type = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SerializableNullableType) {
                return AbstractC9133u.m16128b(this.type, ((SerializableNullableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9133u.m16132f(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D get(Bundle bundle, String key) {
            AbstractC9133u.m16133g(bundle, "bundle");
            AbstractC9133u.m16133g(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9133u.m16133g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D d10) {
            AbstractC9133u.m16133g(bundle, "bundle");
            AbstractC9133u.m16133g(key, "key");
            bundle.putSerializable(key, this.type.cast(d10));
        }
    }

    private InternalAndroidNavType() {
    }

    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(Class<D> type) {
            super(type);
            AbstractC9133u.m16133g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9133u.m16132f(name, "getName(...)");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9133u.m16133g(value, "value");
            D d10 = null;
            if (AbstractC9133u.m16128b(value, "null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC9133u.m16130d(enumConstants);
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                D d11 = enumConstants[i10];
                D d12 = d11;
                AbstractC9133u.m16130d(d12);
                if (AbstractC8687z.m14093A(d12.name(), value, true)) {
                    d10 = d11;
                    break;
                }
                i10++;
            }
            D d13 = d10;
            if (d13 != null) {
                return d13;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }
}
