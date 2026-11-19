package androidx.navigation.serialization;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.NavUriUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR!\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR!\u0010\u001d\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u001f\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\b¨\u0006%"}, m5110d2 = {"Landroidx/navigation/serialization/InternalNavType;", "", "<init>", "()V", "IntNullableType", "Landroidx/navigation/NavType;", "", "getIntNullableType", "()Landroidx/navigation/NavType;", "BoolNullableType", "", "getBoolNullableType", "DoubleType", "", "getDoubleType", "DoubleNullableType", "getDoubleNullableType", "FloatNullableType", "", "getFloatNullableType", "LongNullableType", "", "getLongNullableType", "StringNonNullableType", "", "getStringNonNullableType", "StringNullableArrayType", "", "getStringNullableArrayType", "StringNullableListType", "", "getStringNullableListType", "DoubleArrayType", "", "getDoubleArrayType", "DoubleListType", "getDoubleListType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class InternalNavType {

    @NotNull
    public static final InternalNavType INSTANCE = new InternalNavType();

    @NotNull
    private static final NavType<Integer> IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return Integer.valueOf(SavedStateReader.m13628getIntimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            if (value.equals("null")) {
                return null;
            }
            return NavType.IntType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Integer value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
            } else {
                NavType.IntType.put(bundle, key, value);
            }
        }
    };

    @NotNull
    private static final NavType<Boolean> BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return Boolean.valueOf(SavedStateReader.m13606getBooleanimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Boolean parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            if (value.equals("null")) {
                return null;
            }
            return NavType.BoolType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Boolean value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
            } else {
                NavType.BoolType.put(bundle, key, value);
            }
        }
    };

    @NotNull
    private static final NavType<Double> DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            return Double.valueOf(SavedStateReader.m13620getDoubleimpl(AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle), key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double";
        }

        public void put(Bundle bundle, String key, double value) {
            SavedStateWriter.m13696putDoubleimpl(AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle), key, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d9) {
            put(bundle, str, d9.doubleValue());
        }
    };

    @NotNull
    private static final NavType<Double> DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return Double.valueOf(SavedStateReader.m13620getDoubleimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Double parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            if (value.equals("null")) {
                return null;
            }
            return InternalNavType.INSTANCE.getDoubleType().parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Double value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
            } else {
                InternalNavType.INSTANCE.getDoubleType().put(bundle, key, value);
            }
        }
    };

    @NotNull
    private static final NavType<Float> FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return Float.valueOf(SavedStateReader.m13624getFloatimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Float parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            if (value.equals("null")) {
                return null;
            }
            return NavType.FloatType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Float value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
            } else {
                NavType.FloatType.put(bundle, key, value);
            }
        }
    };

    @NotNull
    private static final NavType<Long> LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return Long.valueOf(SavedStateReader.m13638getLongimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Long parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            if (value.equals("null")) {
                return null;
            }
            return NavType.LongType.parseValue(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, Long value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(SavedStateWriter.m13683constructorimpl(bundle), key);
            } else {
                NavType.LongType.put(bundle, key, value);
            }
        }
    };

    @NotNull
    private static final NavType<String> StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.navigation.NavType
        public String get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            return (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) ? "null" : SavedStateReader.m13668getStringimpl(bundleM1062z, key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.NavType
        public String parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return value;
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            AbstractC5830k.m5330g(value, "value");
            SavedStateWriter.m13716putStringimpl(SavedStateWriter.m13683constructorimpl(bundle), key, value);
        }

        @Override // androidx.navigation.NavType
        public String serializeAsValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return NavUriUtils.encode$default(NavUriUtils.INSTANCE, value, null, 2, null);
        }
    };

    @NotNull
    private static final NavType<String[]> StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public String[] emptyCollection() {
            return new String[0];
        }

        @Override // androidx.navigation.NavType
        public String[] get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            String[] strArrM13669getStringArrayimpl = SavedStateReader.m13669getStringArrayimpl(bundleM1062z, key);
            ArrayList arrayList = new ArrayList(strArrM13669getStringArrayimpl.length);
            for (String str : strArrM13669getStringArrayimpl) {
                arrayList.add(NavType.StringType.parseValue(str));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, String[] value) {
            Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
                return;
            }
            ArrayList arrayList = new ArrayList(value.length);
            for (String str : value) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m13717putStringArrayimpl(bundleM1041e, key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(String[] value) {
            String strEncode$default;
            if (value == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(value.length);
            for (String str : value) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(String[] value, String[] other) {
            return AbstractC5802q.m5210w(value, other);
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return new String[]{NavType.StringType.parseValue(value)};
        }

        @Override // androidx.navigation.NavType
        public String[] parseValue(String value, String[] previousValue) {
            AbstractC5830k.m5330g(value, "value");
            String[] elements = parseValue(value);
            if (previousValue == null) {
                return elements;
            }
            AbstractC5830k.m5330g(elements, "elements");
            int length = previousValue.length;
            int length2 = elements.length;
            Object[] objArrCopyOf = Arrays.copyOf(previousValue, length + length2);
            System.arraycopy(elements, 0, objArrCopyOf, length, length2);
            AbstractC5830k.m5327d(objArrCopyOf);
            return (String[]) objArrCopyOf;
        }
    };

    @NotNull
    private static final NavType<List<String>> StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.navigation.CollectionNavType
        public List<? extends String> emptyCollection() {
            return EmptyList.INSTANCE;
        }

        @Override // androidx.navigation.NavType
        public List<String> get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            List listM5204e0 = AbstractC5802q.m5204e0(SavedStateReader.m13669getStringArrayimpl(bundleM1062z, key));
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5204e0, 10));
            Iterator it = listM5204e0.iterator();
            while (it.hasNext()) {
                arrayList.add(NavType.StringType.parseValue((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<String?>";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<String> value) {
            Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
                return;
            }
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(value, 10));
            for (String str : value) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m13717putStringArrayimpl(bundleM1041e, key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
            return serializeAsValues2((List<String>) list);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<String> value) {
            String strEncode$default;
            if (value == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(value, 10));
            for (String str : value) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<String> value, List<String> other) {
            return AbstractC5802q.m5210w(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return AbstractC5806u.m5286y(NavType.StringType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<String> parseValue(String value, List<String> previousValue) {
            AbstractC5830k.m5330g(value, "value");
            List<String> value2 = parseValue(value);
            return previousValue != null ? AbstractC5805t.m5240t0(previousValue, value2) : value2;
        }
    };

    @NotNull
    private static final NavType<double[]> DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.navigation.CollectionNavType
        public double[] emptyCollection() {
            return new double[0];
        }

        @Override // androidx.navigation.NavType
        public double[] get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return SavedStateReader.m13621getDoubleArrayimpl(bundleM1062z, key);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "double[]";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, double[] value) {
            Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
            } else {
                SavedStateWriter.m13697putDoubleArrayimpl(bundleM1041e, key, value);
            }
        }

        @Override // androidx.navigation.CollectionNavType
        public List<String> serializeAsValues(double[] value) {
            List listM5201b0;
            if (value == null || (listM5201b0 = AbstractC5802q.m5201b0(value)) == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5201b0, 10));
            Iterator it = listM5201b0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(double[] value, double[] other) {
            Double[] dArr;
            Double[] dArr2 = null;
            if (value != null) {
                dArr = new Double[value.length];
                int length = value.length;
                for (int i = 0; i < length; i++) {
                    dArr[i] = Double.valueOf(value[i]);
                }
            } else {
                dArr = null;
            }
            if (other != null) {
                dArr2 = new Double[other.length];
                int length2 = other.length;
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr2[i8] = Double.valueOf(other[i8]);
                }
            }
            return AbstractC5802q.m5210w(dArr, dArr2);
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(value).doubleValue()};
        }

        @Override // androidx.navigation.NavType
        public double[] parseValue(String value, double[] previousValue) {
            AbstractC5830k.m5330g(value, "value");
            double[] elements = parseValue(value);
            if (previousValue == null) {
                return elements;
            }
            AbstractC5830k.m5330g(elements, "elements");
            int length = previousValue.length;
            int length2 = elements.length;
            double[] dArrCopyOf = Arrays.copyOf(previousValue, length + length2);
            System.arraycopy(elements, 0, dArrCopyOf, length, length2);
            AbstractC5830k.m5327d(dArrCopyOf);
            return dArrCopyOf;
        }
    };

    @NotNull
    private static final NavType<List<Double>> DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.navigation.CollectionNavType
        public List<? extends Double> emptyCollection() {
            return EmptyList.INSTANCE;
        }

        @Override // androidx.navigation.NavType
        public List<Double> get(Bundle bundle, String key) {
            Bundle bundleM1062z = AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle);
            if (!SavedStateReader.m13598containsimpl(bundleM1062z, key) || SavedStateReader.m13676isNullimpl(bundleM1062z, key)) {
                return null;
            }
            return AbstractC5802q.m5201b0(SavedStateReader.m13621getDoubleArrayimpl(bundleM1062z, key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return "List<Double>";
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, List<Double> value) {
            Bundle bundleM1041e = AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle);
            if (value == null) {
                SavedStateWriter.m13706putNullimpl(bundleM1041e, key);
                return;
            }
            double[] dArr = new double[value.size()];
            Iterator<Double> it = value.iterator();
            int i = 0;
            while (it.hasNext()) {
                dArr[i] = it.next().doubleValue();
                i++;
            }
            SavedStateWriter.m13697putDoubleArrayimpl(bundleM1041e, key, dArr);
        }

        @Override // androidx.navigation.CollectionNavType
        public /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Double> list) {
            return serializeAsValues2((List<Double>) list);
        }

        /* renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public List<String> serializeAsValues2(List<Double> value) {
            if (value == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(List<Double> value, List<Double> other) {
            return AbstractC5802q.m5210w(value != null ? (Double[]) value.toArray(new Double[0]) : null, other != null ? (Double[]) other.toArray(new Double[0]) : null);
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value) {
            AbstractC5830k.m5330g(value, "value");
            return AbstractC5806u.m5286y(InternalNavType.INSTANCE.getDoubleType().parseValue(value));
        }

        @Override // androidx.navigation.NavType
        public List<Double> parseValue(String value, List<Double> previousValue) {
            AbstractC5830k.m5330g(value, "value");
            List<Double> value2 = parseValue(value);
            return previousValue != null ? AbstractC5805t.m5240t0(previousValue, value2) : value2;
        }
    };

    private InternalNavType() {
    }

    @NotNull
    public final NavType<Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    @NotNull
    public final NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    @NotNull
    public final NavType<List<Double>> getDoubleListType() {
        return DoubleListType;
    }

    @NotNull
    public final NavType<Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    @NotNull
    public final NavType<Double> getDoubleType() {
        return DoubleType;
    }

    @NotNull
    public final NavType<Float> getFloatNullableType() {
        return FloatNullableType;
    }

    @NotNull
    public final NavType<Integer> getIntNullableType() {
        return IntNullableType;
    }

    @NotNull
    public final NavType<Long> getLongNullableType() {
        return LongNullableType;
    }

    @NotNull
    public final NavType<String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    @NotNull
    public final NavType<String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    @NotNull
    public final NavType<List<String>> getStringNullableListType() {
        return StringNullableListType;
    }
}
