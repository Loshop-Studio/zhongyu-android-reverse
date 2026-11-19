package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
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

    public static void clear(boolean z10) {
        clear(z10, getDefaultSPUtils());
    }

    public static boolean contains(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.contains(str);
    }

    public static Map<String, ?> getAll(@NonNull SPUtils sPUtils) {
        return sPUtils.getAll();
    }

    public static boolean getBoolean(@NonNull String str, boolean z10) {
        return getBoolean(str, z10, getDefaultSPUtils());
    }

    public static float getFloat(@NonNull String str, float f10) {
        return getFloat(str, f10, getDefaultSPUtils());
    }

    public static int getInt(@NonNull String str, int i10) {
        return getInt(str, i10, getDefaultSPUtils());
    }

    public static long getLong(@NonNull String str, long j10) {
        return getLong(str, j10, getDefaultSPUtils());
    }

    public static String getString(@NonNull String str, String str2) {
        return getString(str, str2, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return getStringSet(str, set, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, boolean z10) {
        put(str, str2, z10, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, boolean z10) {
        remove(str, z10, getDefaultSPUtils());
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

    public static void put(@NonNull String str, int i10) {
        put(str, i10, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str);
    }

    public static void clear(boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.clear(z10);
    }

    public static boolean getBoolean(@NonNull String str, boolean z10, @NonNull SPUtils sPUtils) {
        return sPUtils.getBoolean(str, z10);
    }

    public static float getFloat(@NonNull String str, float f10, @NonNull SPUtils sPUtils) {
        return sPUtils.getFloat(str, f10);
    }

    public static int getInt(@NonNull String str, int i10, @NonNull SPUtils sPUtils) {
        return sPUtils.getInt(str, i10);
    }

    public static long getLong(@NonNull String str, long j10, @NonNull SPUtils sPUtils) {
        return sPUtils.getLong(str, j10);
    }

    public static String getString(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        return sPUtils.getString(str, str2);
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        return sPUtils.getStringSet(str, set);
    }

    public static void put(@NonNull String str, int i10, boolean z10) {
        put(str, i10, z10, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str, z10);
    }

    public static void put(@NonNull String str, long j10) {
        put(str, j10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, long j10, boolean z10) {
        put(str, j10, z10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f10) {
        put(str, f10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f10, boolean z10) {
        put(str, f10, z10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z10) {
        put(str, z10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z10, boolean z11) {
        put(str, z10, z11, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set) {
        put(str, set, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set, boolean z10) {
        put(str, set, z10, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2);
    }

    public static void put(@NonNull String str, String str2, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2, z10);
    }

    public static void put(@NonNull String str, int i10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i10);
    }

    public static void put(@NonNull String str, int i10, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i10, z10);
    }

    public static void put(@NonNull String str, long j10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j10);
    }

    public static void put(@NonNull String str, long j10, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j10, z10);
    }

    public static void put(@NonNull String str, float f10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f10);
    }

    public static void put(@NonNull String str, float f10, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f10, z10);
    }

    public static void put(@NonNull String str, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z10);
    }

    public static void put(@NonNull String str, boolean z10, boolean z11, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z10, z11);
    }

    public static void put(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set);
    }

    public static void put(@NonNull String str, Set<String> set, boolean z10, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set, z10);
    }
}
