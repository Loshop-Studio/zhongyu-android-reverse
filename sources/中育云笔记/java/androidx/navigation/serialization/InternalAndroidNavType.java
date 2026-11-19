package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes.dex */
public final class InternalAndroidNavType {
    public static final InternalAndroidNavType INSTANCE = new InternalAndroidNavType();

    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
            this.enumNavType = new NavType.EnumType<>(type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EnumListType) {
                return AbstractC9979u.m20289b(this.enumNavType, ((EnumListType) obj).enumNavType);
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
            return AbstractC10978w.m24136n();
        }

        @Override // androidx.navigation.NavType
        public List<D> get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<? extends D> list) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(List<? extends D> list) {
            if (list == null) {
                return AbstractC10978w.m24136n();
            }
            List<? extends D> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<? extends D> list, List<? extends D> list2) {
            return AbstractC9979u.m20289b(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return AbstractC10976v.m24126e(this.enumNavType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<D> parseValue(String value, List<? extends D> list) {
            List<D> listM23906H0;
            AbstractC9979u.m20294g(value, "value");
            return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
        }
    }

    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class<D> type) {
            super(true);
            AbstractC9979u.m20294g(type, "type");
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
                return AbstractC9979u.m20289b(this.type, ((SerializableNullableType) obj).type);
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
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, D d10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
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
            AbstractC9979u.m20294g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public String getName() {
            String name = this.type.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        public D parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            D d10 = null;
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC9979u.m20291d(enumConstants);
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                D d11 = enumConstants[i10];
                D d12 = d11;
                AbstractC9979u.m20291d(d12);
                if (AbstractC10819z.m23230C(d12.name(), value, true)) {
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
