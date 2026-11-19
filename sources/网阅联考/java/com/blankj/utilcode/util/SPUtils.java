package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes2.dex */
public final class SPUtils {
    private static final Map<String, SPUtils> SP_UTILS_MAP = new HashMap();

    /* renamed from: sp */
    private SharedPreferences f537sp;

    private SPUtils(String str) {
        this.f537sp = Utils.getApp().getSharedPreferences(str, 0);
    }

    public static SPUtils getInstance() {
        return getInstance("", 0);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.f537sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.f537sp.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, -1L);
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, Collections.emptySet());
    }

    public void put(@NonNull String str, String str2) {
        put(str, str2, false);
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public static SPUtils getInstance(int i4) {
        return getInstance("", i4);
    }

    public void clear(boolean z3) {
        if (z3) {
            this.f537sp.edit().clear().commit();
        } else {
            this.f537sp.edit().clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z3) {
        return this.f537sp.getBoolean(str, z3);
    }

    public float getFloat(@NonNull String str, float f4) {
        return this.f537sp.getFloat(str, f4);
    }

    public int getInt(@NonNull String str, int i4) {
        return this.f537sp.getInt(str, i4);
    }

    public long getLong(@NonNull String str, long j4) {
        return this.f537sp.getLong(str, j4);
    }

    public String getString(@NonNull String str, String str2) {
        return this.f537sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return this.f537sp.getStringSet(str, set);
    }

    public void put(@NonNull String str, String str2, boolean z3) {
        if (z3) {
            this.f537sp.edit().putString(str, str2).commit();
        } else {
            this.f537sp.edit().putString(str, str2).apply();
        }
    }

    public void remove(@NonNull String str, boolean z3) {
        if (z3) {
            this.f537sp.edit().remove(str).commit();
        } else {
            this.f537sp.edit().remove(str).apply();
        }
    }

    private SPUtils(String str, int i4) {
        this.f537sp = Utils.getApp().getSharedPreferences(str, i4);
    }

    public static SPUtils getInstance(String str) {
        return getInstance(str, 0);
    }

    public static SPUtils getInstance(String str, int i4) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        Map<String, SPUtils> map = SP_UTILS_MAP;
        SPUtils sPUtils = map.get(str);
        if (sPUtils == null) {
            synchronized (SPUtils.class) {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(str, i4);
                    map.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    public void put(@NonNull String str, int i4) {
        put(str, i4, false);
    }

    public void put(@NonNull String str, int i4, boolean z3) {
        if (z3) {
            this.f537sp.edit().putInt(str, i4).commit();
        } else {
            this.f537sp.edit().putInt(str, i4).apply();
        }
    }

    public void put(@NonNull String str, long j4) {
        put(str, j4, false);
    }

    public void put(@NonNull String str, long j4, boolean z3) {
        if (z3) {
            this.f537sp.edit().putLong(str, j4).commit();
        } else {
            this.f537sp.edit().putLong(str, j4).apply();
        }
    }

    public void put(@NonNull String str, float f4) {
        put(str, f4, false);
    }

    public void put(@NonNull String str, float f4, boolean z3) {
        if (z3) {
            this.f537sp.edit().putFloat(str, f4).commit();
        } else {
            this.f537sp.edit().putFloat(str, f4).apply();
        }
    }

    public void put(@NonNull String str, boolean z3) {
        put(str, z3, false);
    }

    public void put(@NonNull String str, boolean z3, boolean z4) {
        if (z4) {
            this.f537sp.edit().putBoolean(str, z3).commit();
        } else {
            this.f537sp.edit().putBoolean(str, z3).apply();
        }
    }

    public void put(@NonNull String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, Set<String> set, boolean z3) {
        if (z3) {
            this.f537sp.edit().putStringSet(str, set).commit();
        } else {
            this.f537sp.edit().putStringSet(str, set).apply();
        }
    }
}
