package androidx.navigation;

import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.annotation.RestrictTo;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001aC\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u0002H\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0000\u001a9\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\u0012"}, m5110d2 = {"navTypeParseAndPut", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavType;", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "", "value", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Landroidx/navigation/NavType;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "navTypeFromArgType", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "navTypeInferFromValue", "", "navTypeInferFromValueType", "parseAndPutFromUri", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,883:1\n90#2:884\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavTypeKt\n*L\n316#1:884\n*E\n"})
/* loaded from: classes2.dex */
public final class NavTypeKt {
    @Nullable
    public static final NavType<?> navTypeFromArgType(@Nullable String str) {
        NavType<Integer> navType = NavType.IntType;
        if (AbstractC5830k.m5325b(navType.getName(), str)) {
            return navType;
        }
        NavType navType2 = NavType.IntArrayType;
        if (AbstractC5830k.m5325b(navType2.getName(), str)) {
            return navType2;
        }
        NavType<List<Integer>> navType3 = NavType.IntListType;
        if (AbstractC5830k.m5325b(navType3.getName(), str)) {
            return navType3;
        }
        NavType<Long> navType4 = NavType.LongType;
        if (AbstractC5830k.m5325b(navType4.getName(), str)) {
            return navType4;
        }
        NavType navType5 = NavType.LongArrayType;
        if (AbstractC5830k.m5325b(navType5.getName(), str)) {
            return navType5;
        }
        NavType<List<Long>> navType6 = NavType.LongListType;
        if (AbstractC5830k.m5325b(navType6.getName(), str)) {
            return navType6;
        }
        NavType<Boolean> navType7 = NavType.BoolType;
        if (AbstractC5830k.m5325b(navType7.getName(), str)) {
            return navType7;
        }
        NavType navType8 = NavType.BoolArrayType;
        if (AbstractC5830k.m5325b(navType8.getName(), str)) {
            return navType8;
        }
        NavType<List<Boolean>> navType9 = NavType.BoolListType;
        if (AbstractC5830k.m5325b(navType9.getName(), str)) {
            return navType9;
        }
        NavType<String> navType10 = NavType.StringType;
        if (AbstractC5830k.m5325b(navType10.getName(), str)) {
            return navType10;
        }
        NavType navType11 = NavType.StringArrayType;
        if (AbstractC5830k.m5325b(navType11.getName(), str)) {
            return navType11;
        }
        NavType<List<String>> navType12 = NavType.StringListType;
        if (AbstractC5830k.m5325b(navType12.getName(), str)) {
            return navType12;
        }
        NavType<Float> navType13 = NavType.FloatType;
        if (AbstractC5830k.m5325b(navType13.getName(), str)) {
            return navType13;
        }
        NavType navType14 = NavType.FloatArrayType;
        if (AbstractC5830k.m5325b(navType14.getName(), str)) {
            return navType14;
        }
        NavType<List<Float>> navType15 = NavType.FloatListType;
        if (AbstractC5830k.m5325b(navType15.getName(), str)) {
            return navType15;
        }
        return null;
    }

    @NotNull
    public static final NavType<Object> navTypeInferFromValue(@NotNull String value) {
        AbstractC5830k.m5330g(value, "value");
        try {
            try {
                try {
                    try {
                        NavType<Integer> navType = NavType.IntType;
                        navType.parseValue(value);
                        AbstractC5830k.m5328e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType<Boolean> navType2 = NavType.BoolType;
                        navType2.parseValue(value);
                        AbstractC5830k.m5328e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<Long> navType3 = NavType.LongType;
                    navType3.parseValue(value);
                    AbstractC5830k.m5328e(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType<Float> navType4 = NavType.FloatType;
                navType4.parseValue(value);
                AbstractC5830k.m5328e(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType<String> navType5 = NavType.StringType;
            AbstractC5830k.m5328e(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
    }

    @Nullable
    public static final NavType<Object> navTypeInferFromValueType(@Nullable Object obj) {
        if (obj instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            AbstractC5830k.m5328e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType;
        }
        if (obj instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            AbstractC5830k.m5328e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType2;
        }
        if (obj instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            AbstractC5830k.m5328e(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType3;
        }
        if (obj instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            AbstractC5830k.m5328e(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType4;
        }
        if (obj instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            AbstractC5830k.m5328e(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
        if (obj instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            AbstractC5830k.m5328e(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType6;
        }
        if (obj instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            AbstractC5830k.m5328e(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            AbstractC5830k.m5328e(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        AbstractC5830k.m5328e(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(@NotNull NavType<T> navType, @NotNull Bundle bundle, @NotNull String str, @Nullable String str2, T t8) {
        AbstractC5830k.m5330g(navType, "<this>");
        if (!SavedStateReader.m13598containsimpl(AbstractC1923c.m1062z(bundle, "bundle", str, "key", bundle), str)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str2 == null) {
            return t8;
        }
        T value = navType.parseValue(str2, t8);
        navType.put(bundle, str, value);
        return value;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T parseAndPutFromUri(@NotNull NavType<T> navType, @NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        AbstractC5830k.m5330g(navType, "<this>");
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        return navType.parseAndPut(bundle, key, NavUriUtils.INSTANCE.decode(value));
    }

    public static final <T> T navTypeParseAndPut(@NotNull NavType<T> navType, @NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        AbstractC5830k.m5330g(navType, "<this>");
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        T value2 = navType.parseValue(value);
        navType.put(bundle, key, value2);
        return value2;
    }
}
