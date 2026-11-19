package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SPStaticUtils {
    private static SPUtils sDefaultSPUtils;

    public static void clear() {
        clear(getDefaultSPUtils());
    }

    public static boolean contains(@NonNull String str) {
        return contains(str, getDefaultSPUtils());
    }

    public static Map<String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    public static boolean getBoolean(@NonNull String str) {
        return getBoolean(str, getDefaultSPUtils());
    }

    private static SPUtils getDefaultSPUtils() {
        SPUtils sPUtils = sDefaultSPUtils;
        return sPUtils != null ? sPUtils : SPUtils.getInstance();
    }

    public static float getFloat(@NonNull String str) {
        return getFloat(str, getDefaultSPUtils());
    }

    public static int getInt(@NonNull String str) {
        return getInt(str, getDefaultSPUtils());
    }

    public static long getLong(@NonNull String str) {
        return getLong(str, getDefaultSPUtils());
    }

    public static String getString(@NonNull String str) {
        return getString(str, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2) {
        put(str, str2, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str) {
        remove(str, getDefaultSPUtils());
    }

    public static void setDefaultSPUtils(SPUtils sPUtils) {
        sDefaultSPUtils = sPUtils;
    }

    public static void clear(boolean z3) {
        clear(z3, getDefaultSPUtils());
    }

    public static boolean contains(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.contains(str);
    }

    public static Map<String, ?> getAll(@NonNull SPUtils sPUtils) {
        return sPUtils.getAll();
    }

    public static boolean getBoolean(@NonNull String str, boolean z3) {
        return getBoolean(str, z3, getDefaultSPUtils());
    }

    public static float getFloat(@NonNull String str, float f4) {
        return getFloat(str, f4, getDefaultSPUtils());
    }

    public static int getInt(@NonNull String str, int i4) {
        return getInt(str, i4, getDefaultSPUtils());
    }

    public static long getLong(@NonNull String str, long j4) {
        return getLong(str, j4, getDefaultSPUtils());
    }

    public static String getString(@NonNull String str, String str2) {
        return getString(str, str2, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return getStringSet(str, set, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, boolean z3) {
        put(str, str2, z3, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, boolean z3) {
        remove(str, z3, getDefaultSPUtils());
    }

    public static void clear(@NonNull SPUtils sPUtils) {
        sPUtils.clear();
    }

    public static boolean getBoolean(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getBoolean(str);
    }

    public static float getFloat(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getFloat(str);
    }

    public static int getInt(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getInt(str);
    }

    public static long getLong(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getLong(str);
    }

    public static String getString(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getString(str);
    }

    public static Set<String> getStringSet(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getStringSet(str);
    }

    public static void put(@NonNull String str, int i4) {
        put(str, i4, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str);
    }

    public static void clear(boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.clear(z3);
    }

    public static boolean getBoolean(@NonNull String str, boolean z3, @NonNull SPUtils sPUtils) {
        return sPUtils.getBoolean(str, z3);
    }

    public static float getFloat(@NonNull String str, float f4, @NonNull SPUtils sPUtils) {
        return sPUtils.getFloat(str, f4);
    }

    public static int getInt(@NonNull String str, int i4, @NonNull SPUtils sPUtils) {
        return sPUtils.getInt(str, i4);
    }

    public static long getLong(@NonNull String str, long j4, @NonNull SPUtils sPUtils) {
        return sPUtils.getLong(str, j4);
    }

    public static String getString(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        return sPUtils.getString(str, str2);
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        return sPUtils.getStringSet(str, set);
    }

    public static void put(@NonNull String str, int i4, boolean z3) {
        put(str, i4, z3, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str, z3);
    }

    public static void put(@NonNull String str, long j4) {
        put(str, j4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, long j4, boolean z3) {
        put(str, j4, z3, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f4) {
        put(str, f4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f4, boolean z3) {
        put(str, f4, z3, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z3) {
        put(str, z3, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z3, boolean z4) {
        put(str, z3, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set) {
        put(str, set, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set, boolean z3) {
        put(str, set, z3, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2);
    }

    public static void put(@NonNull String str, String str2, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2, z3);
    }

    public static void put(@NonNull String str, int i4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i4);
    }

    public static void put(@NonNull String str, int i4, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i4, z3);
    }

    public static void put(@NonNull String str, long j4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j4);
    }

    public static void put(@NonNull String str, long j4, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j4, z3);
    }

    public static void put(@NonNull String str, float f4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f4);
    }

    public static void put(@NonNull String str, float f4, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f4, z3);
    }

    public static void put(@NonNull String str, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z3);
    }

    public static void put(@NonNull String str, boolean z3, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z3, z4);
    }

    public static void put(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set);
    }

    public static void put(@NonNull String str, Set<String> set, boolean z3, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set, z3);
    }
}
