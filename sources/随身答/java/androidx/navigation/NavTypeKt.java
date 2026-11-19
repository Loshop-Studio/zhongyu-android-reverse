package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001aC\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u0002H\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0000¨\u0006\u0011"}, m13413d2 = {"navTypeParseAndPut", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavType;", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "", "value", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "navTypeFromArgType", "type", "navTypeInferFromValue", "", "navTypeInferFromValueType", "navigation-common_release"}, m13414k = 2, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,874:1\n90#2:875\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n*L\n316#1:875\n*E\n"})
/* loaded from: classes3.dex */
public final class NavTypeKt {
    public static final NavType<?> navTypeFromArgType(String str) {
        NavType<Integer> navType = NavType.IntType;
        if (Intrinsics.areEqual(navType.getName(), str)) {
            return navType;
        }
        NavType navType2 = NavType.IntArrayType;
        if (Intrinsics.areEqual(navType2.getName(), str)) {
            return navType2;
        }
        NavType<List<Integer>> navType3 = NavType.IntListType;
        if (Intrinsics.areEqual(navType3.getName(), str)) {
            return navType3;
        }
        NavType<Long> navType4 = NavType.LongType;
        if (Intrinsics.areEqual(navType4.getName(), str)) {
            return navType4;
        }
        NavType navType5 = NavType.LongArrayType;
        if (Intrinsics.areEqual(navType5.getName(), str)) {
            return navType5;
        }
        NavType<List<Long>> navType6 = NavType.LongListType;
        if (Intrinsics.areEqual(navType6.getName(), str)) {
            return navType6;
        }
        NavType<Boolean> navType7 = NavType.BoolType;
        if (Intrinsics.areEqual(navType7.getName(), str)) {
            return navType7;
        }
        NavType navType8 = NavType.BoolArrayType;
        if (Intrinsics.areEqual(navType8.getName(), str)) {
            return navType8;
        }
        NavType<List<Boolean>> navType9 = NavType.BoolListType;
        if (Intrinsics.areEqual(navType9.getName(), str)) {
            return navType9;
        }
        NavType<String> navType10 = NavType.StringType;
        if (Intrinsics.areEqual(navType10.getName(), str)) {
            return navType10;
        }
        NavType navType11 = NavType.StringArrayType;
        if (Intrinsics.areEqual(navType11.getName(), str)) {
            return navType11;
        }
        NavType<List<String>> navType12 = NavType.StringListType;
        if (Intrinsics.areEqual(navType12.getName(), str)) {
            return navType12;
        }
        NavType<Float> navType13 = NavType.FloatType;
        if (Intrinsics.areEqual(navType13.getName(), str)) {
            return navType13;
        }
        NavType navType14 = NavType.FloatArrayType;
        if (Intrinsics.areEqual(navType14.getName(), str)) {
            return navType14;
        }
        NavType<List<Float>> navType15 = NavType.FloatListType;
        if (Intrinsics.areEqual(navType15.getName(), str)) {
            return navType15;
        }
        return null;
    }

    public static final NavType<Object> navTypeInferFromValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            try {
                try {
                    try {
                        NavType<Integer> navType = NavType.IntType;
                        navType.parseValue(value);
                        Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType<Boolean> navType2 = NavType.BoolType;
                        navType2.parseValue(value);
                        Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<Long> navType3 = NavType.LongType;
                    navType3.parseValue(value);
                    Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType<String> navType4 = NavType.StringType;
                Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType<Float> navType5 = NavType.FloatType;
            navType5.parseValue(value);
            Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
    }

    public static final NavType<Object> navTypeInferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType;
        }
        if (obj instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType2;
        }
        if (obj instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType3;
        }
        if (obj instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType4;
        }
        if (obj instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
        if (obj instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            Intrinsics.checkNotNull(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType6;
        }
        if (obj instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            Intrinsics.checkNotNull(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            Intrinsics.checkNotNull(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        Intrinsics.checkNotNull(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(navType, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        T value2 = navType.parseValue(value);
        navType.put(bundle, key, value2);
        return value2;
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String key, String str, T t9) {
        Intrinsics.checkNotNullParameter(navType, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!SavedStateReader.m24520containsimpl(SavedStateReader.m24519constructorimpl(bundle), key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str == null) {
            return t9;
        }
        T value = navType.parseValue(str, t9);
        navType.put(bundle, key, value);
        return value;
    }
}
