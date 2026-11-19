package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavTypeKt {
    public static final NavType<?> navTypeFromArgType(String str) {
        NavType<Integer> navType = NavType.IntType;
        if (AbstractC9133u.m16128b(navType.getName(), str)) {
            return navType;
        }
        NavType navType2 = NavType.IntArrayType;
        if (AbstractC9133u.m16128b(navType2.getName(), str)) {
            return navType2;
        }
        NavType<List<Integer>> navType3 = NavType.IntListType;
        if (AbstractC9133u.m16128b(navType3.getName(), str)) {
            return navType3;
        }
        NavType<Long> navType4 = NavType.LongType;
        if (AbstractC9133u.m16128b(navType4.getName(), str)) {
            return navType4;
        }
        NavType navType5 = NavType.LongArrayType;
        if (AbstractC9133u.m16128b(navType5.getName(), str)) {
            return navType5;
        }
        NavType<List<Long>> navType6 = NavType.LongListType;
        if (AbstractC9133u.m16128b(navType6.getName(), str)) {
            return navType6;
        }
        NavType<Boolean> navType7 = NavType.BoolType;
        if (AbstractC9133u.m16128b(navType7.getName(), str)) {
            return navType7;
        }
        NavType navType8 = NavType.BoolArrayType;
        if (AbstractC9133u.m16128b(navType8.getName(), str)) {
            return navType8;
        }
        NavType<List<Boolean>> navType9 = NavType.BoolListType;
        if (AbstractC9133u.m16128b(navType9.getName(), str)) {
            return navType9;
        }
        NavType<String> navType10 = NavType.StringType;
        if (AbstractC9133u.m16128b(navType10.getName(), str)) {
            return navType10;
        }
        NavType navType11 = NavType.StringArrayType;
        if (AbstractC9133u.m16128b(navType11.getName(), str)) {
            return navType11;
        }
        NavType<List<String>> navType12 = NavType.StringListType;
        if (AbstractC9133u.m16128b(navType12.getName(), str)) {
            return navType12;
        }
        NavType<Float> navType13 = NavType.FloatType;
        if (AbstractC9133u.m16128b(navType13.getName(), str)) {
            return navType13;
        }
        NavType navType14 = NavType.FloatArrayType;
        if (AbstractC9133u.m16128b(navType14.getName(), str)) {
            return navType14;
        }
        NavType<List<Float>> navType15 = NavType.FloatListType;
        if (AbstractC9133u.m16128b(navType15.getName(), str)) {
            return navType15;
        }
        return null;
    }

    public static final NavType<Object> navTypeInferFromValue(String value) {
        AbstractC9133u.m16133g(value, "value");
        try {
            try {
                try {
                    try {
                        NavType<Integer> navType = NavType.IntType;
                        navType.parseValue(value);
                        AbstractC9133u.m16131e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType<Boolean> navType2 = NavType.BoolType;
                        navType2.parseValue(value);
                        AbstractC9133u.m16131e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<Long> navType3 = NavType.LongType;
                    navType3.parseValue(value);
                    AbstractC9133u.m16131e(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType<String> navType4 = NavType.StringType;
                AbstractC9133u.m16131e(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType<Float> navType5 = NavType.FloatType;
            navType5.parseValue(value);
            AbstractC9133u.m16131e(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
    }

    public static final NavType<Object> navTypeInferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            AbstractC9133u.m16131e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType;
        }
        if (obj instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            AbstractC9133u.m16131e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType2;
        }
        if (obj instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            AbstractC9133u.m16131e(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType3;
        }
        if (obj instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            AbstractC9133u.m16131e(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType4;
        }
        if (obj instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            AbstractC9133u.m16131e(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
        if (obj instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            AbstractC9133u.m16131e(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType6;
        }
        if (obj instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            AbstractC9133u.m16131e(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            AbstractC9133u.m16131e(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        AbstractC9133u.m16131e(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String key, String value) {
        AbstractC9133u.m16133g(navType, "<this>");
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        T value2 = navType.parseValue(value);
        navType.put(bundle, key, value2);
        return value2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T parseAndPutFromUri(NavType<T> navType, Bundle bundle, String key, String value) {
        AbstractC9133u.m16133g(navType, "<this>");
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        return navType.parseAndPut(bundle, key, NavUriUtils.INSTANCE.decode(value));
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String key, String str, T t10) {
        AbstractC9133u.m16133g(navType, "<this>");
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(key, "key");
        if (!SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str == null) {
            return t10;
        }
        T value = navType.parseValue(str, t10);
        navType.put(bundle, key, value);
        return value;
    }
}
