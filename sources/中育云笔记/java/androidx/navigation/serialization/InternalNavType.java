package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10962o;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes.dex */
public final class InternalNavType {
    public static final InternalNavType INSTANCE = new InternalNavType();
    private static final NavType<Integer> IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return Integer.valueOf(SavedStateReader.m33855getIntimpl(bundleM33824constructorimpl, key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            return NavType.IntType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Integer num) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            if (num == null) {
                SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
            } else {
                NavType.IntType.put(bundle, key, num);
            }
        }
    };
    private static final NavType<Boolean> BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return Boolean.valueOf(SavedStateReader.m33833getBooleanimpl(bundleM33824constructorimpl, key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            return NavType.BoolType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Boolean bool) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            if (bool == null) {
                SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
            } else {
                NavType.BoolType.put(bundle, key, bool);
            }
        }
    };
    private static final NavType<Double> DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "double";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d10) {
            put(bundle, str, d10.doubleValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            return Double.valueOf(SavedStateReader.m33847getDoubleimpl(SavedStateReader.m33824constructorimpl(bundle), key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        public void put(Bundle bundle, String key, double d10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            SavedStateWriter.m33923putDoubleimpl(SavedStateWriter.m33910constructorimpl(bundle), key, d10);
        }
    };
    private static final NavType<Double> DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return Double.valueOf(SavedStateReader.m33847getDoubleimpl(bundleM33824constructorimpl, key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            return InternalNavType.INSTANCE.getDoubleType().parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Double d10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            if (d10 == null) {
                SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
            } else {
                InternalNavType.INSTANCE.getDoubleType().put(bundle, key, d10);
            }
        }
    };
    private static final NavType<Float> FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return Float.valueOf(SavedStateReader.m33851getFloatimpl(bundleM33824constructorimpl, key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            return NavType.FloatType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Float f10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            if (f10 == null) {
                SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
            } else {
                NavType.FloatType.put(bundle, key, f10);
            }
        }
    };
    private static final NavType<Long> LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return Long.valueOf(SavedStateReader.m33865getLongimpl(bundleM33824constructorimpl, key));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            if (AbstractC9979u.m20289b(value, "null")) {
                return null;
            }
            return NavType.LongType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Long l10) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            if (l10 == null) {
                SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
            } else {
                NavType.LongType.put(bundle, key, l10);
            }
        }
    };
    private static final NavType<String> StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return value;
        }

        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            return (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) ? "null" : SavedStateReader.m33895getStringimpl(bundleM33824constructorimpl, key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String value) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            SavedStateWriter.m33943putStringimpl(SavedStateWriter.m33910constructorimpl(bundle), key, value);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return NavUriUtils.encode$default(NavUriUtils.INSTANCE, value, null, 2, null);
        }
    };
    private static final NavType<String[]> StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public String[] emptyCollection() {
            return new String[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            String[] strArrM33896getStringArrayimpl = SavedStateReader.m33896getStringArrayimpl(bundleM33824constructorimpl, key);
            ArrayList arrayList = new ArrayList(strArrM33896getStringArrayimpl.length);
            for (String str : strArrM33896getStringArrayimpl) {
                arrayList.add(NavType.StringType.parseValue(str));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] strArr) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
            if (strArr == null) {
                SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m33944putStringArrayimpl(bundleM33910constructorimpl, key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(String[] strArr) {
            String strEncode$default;
            if (strArr == null) {
                return AbstractC10978w.m24136n();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(String[] strArr, String[] strArr2) {
            return AbstractC10962o.m23983d(strArr, strArr2);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return new String[]{NavType.StringType.parseValue(value)};
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value, String[] strArr) {
            String[] strArr2;
            AbstractC9979u.m20294g(value, "value");
            return (strArr == null || (strArr2 = (String[]) AbstractC10964p.m23999N(strArr, parseValue(value))) == null) ? parseValue(value) : strArr2;
        }
    };
    private static final NavType<List<String>> StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<String?>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
            return serializeAsValues2((List<String>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends String> emptyCollection() {
            return AbstractC10978w.m24136n();
        }

        @Override // androidx.navigation.NavType
        public List<String> get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            List listM24097p1 = AbstractC10968r.m24097p1(SavedStateReader.m33896getStringArrayimpl(bundleM33824constructorimpl, key));
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM24097p1, 10));
            Iterator it = listM24097p1.iterator();
            while (it.hasNext()) {
                arrayList.add(NavType.StringType.parseValue((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<String> list) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
            if (list == null) {
                SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
                return;
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            for (String str : list2) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m33944putStringArrayimpl(bundleM33910constructorimpl, key, (String[]) arrayList.toArray(new String[0]));
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<String> list) {
            String strEncode$default;
            if (list == null) {
                return AbstractC10978w.m24136n();
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            for (String str : list2) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<String> list, List<String> list2) {
            return AbstractC10962o.m23983d(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return AbstractC10976v.m24126e(NavType.StringType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value, List<String> list) {
            List<String> listM23906H0;
            AbstractC9979u.m20294g(value, "value");
            return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
        }
    };
    private static final NavType<double[]> DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public double[] emptyCollection() {
            return new double[0];
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double[]";
        }

        @Override // androidx.navigation.NavType
        public double[] get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return SavedStateReader.m33848getDoubleArrayimpl(bundleM33824constructorimpl, key);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, double[] dArr) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
            if (dArr == null) {
                SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
            } else {
                SavedStateWriter.m33924putDoubleArrayimpl(bundleM33910constructorimpl, key, dArr);
            }
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(double[] dArr) {
            List listM24089l1;
            if (dArr == null || (listM24089l1 = AbstractC10968r.m24089l1(dArr)) == null) {
                return AbstractC10978w.m24136n();
            }
            List list = listM24089l1;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(double[] dArr, double[] dArr2) {
            return AbstractC10962o.m23983d(dArr != null ? AbstractC10964p.m24010Y(dArr) : null, dArr2 != null ? AbstractC10964p.m24010Y(dArr2) : null);
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(value).doubleValue()};
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value, double[] dArr) {
            double[] dArrM23993H;
            AbstractC9979u.m20294g(value, "value");
            return (dArr == null || (dArrM23993H = AbstractC10964p.m23993H(dArr, parseValue(value))) == null) ? parseValue(value) : dArrM23993H;
        }
    };
    private static final NavType<List<Double>> DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Double>";
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Double> list) {
            return serializeAsValues2((List<Double>) list);
        }

        @Override // androidx.navigation.CollectionNavType
        public List<? extends Double> emptyCollection() {
            return AbstractC10978w.m24136n();
        }

        @Override // androidx.navigation.NavType
        public List<Double> get(Bundle bundle, String key) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (!SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) || SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, key)) {
                return null;
            }
            return AbstractC10968r.m24089l1(SavedStateReader.m33848getDoubleArrayimpl(bundleM33824constructorimpl, key));
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Double> list) {
            AbstractC9979u.m20294g(bundle, "bundle");
            AbstractC9979u.m20294g(key, "key");
            Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundle);
            if (list == null) {
                SavedStateWriter.m33933putNullimpl(bundleM33910constructorimpl, key);
            } else {
                SavedStateWriter.m33924putDoubleArrayimpl(bundleM33910constructorimpl, key, AbstractC10947g0.m23918T0(list));
            }
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Double> list) {
            if (list == null) {
                return AbstractC10978w.m24136n();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Double> list, List<Double> list2) {
            return AbstractC10962o.m23983d(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value) {
            AbstractC9979u.m20294g(value, "value");
            return AbstractC10976v.m24126e(InternalNavType.INSTANCE.getDoubleType().parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value, List<Double> list) {
            List<Double> listM23906H0;
            AbstractC9979u.m20294g(value, "value");
            return (list == null || (listM23906H0 = AbstractC10947g0.m23906H0(list, parseValue(value))) == null) ? parseValue(value) : listM23906H0;
        }
    };

    private InternalNavType() {
    }

    public final NavType<Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    public final NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    public final NavType<List<Double>> getDoubleListType() {
        return DoubleListType;
    }

    public final NavType<Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    public final NavType<Double> getDoubleType() {
        return DoubleType;
    }

    public final NavType<Float> getFloatNullableType() {
        return FloatNullableType;
    }

    public final NavType<Integer> getIntNullableType() {
        return IntNullableType;
    }

    public final NavType<Long> getLongNullableType() {
        return LongNullableType;
    }

    public final NavType<String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    public final NavType<String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    public final NavType<List<String>> getStringNullableListType() {
        return StringNullableListType;
    }
}
