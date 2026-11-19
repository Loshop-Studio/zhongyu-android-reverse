package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes3.dex */
public final class SPUtils {
    private static final Map<String, SPUtils> SP_UTILS_MAP = new HashMap();

    /* renamed from: sp */
    private SharedPreferences f4557sp;

    private SPUtils(String str) {
        this.f4557sp = Utils.getApp().getSharedPreferences(str, 0);
    }

    public static SPUtils getInstance() {
        return getInstance("", 0);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.f4557sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.f4557sp.getAll();
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
        return getStringSet(str, Collections.EMPTY_SET);
    }

    public void put(@NonNull String str, String str2) {
        put(str, str2, false);
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public static SPUtils getInstance(int i10) {
        return getInstance("", i10);
    }

    public void clear(boolean z10) {
        if (z10) {
            this.f4557sp.edit().clear().commit();
        } else {
            this.f4557sp.edit().clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z10) {
        return this.f4557sp.getBoolean(str, z10);
    }

    public float getFloat(@NonNull String str, float f10) {
        return this.f4557sp.getFloat(str, f10);
    }

    public int getInt(@NonNull String str, int i10) {
        return this.f4557sp.getInt(str, i10);
    }

    public long getLong(@NonNull String str, long j10) {
        return this.f4557sp.getLong(str, j10);
    }

    public String getString(@NonNull String str, String str2) {
        return this.f4557sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return this.f4557sp.getStringSet(str, set);
    }

    public void put(@NonNull String str, String str2, boolean z10) {
        if (z10) {
            this.f4557sp.edit().putString(str, str2).commit();
        } else {
            this.f4557sp.edit().putString(str, str2).apply();
        }
    }

    public void remove(@NonNull String str, boolean z10) {
        if (z10) {
            this.f4557sp.edit().remove(str).commit();
        } else {
            this.f4557sp.edit().remove(str).apply();
        }
    }

    private SPUtils(String str, int i10) {
        this.f4557sp = Utils.getApp().getSharedPreferences(str, i10);
    }

    public static SPUtils getInstance(String str) {
        return getInstance(str, 0);
    }

    public static SPUtils getInstance(String str, int i10) {
        SPUtils sPUtils;
        if (isSpace(str)) {
            str = "spUtils";
        }
        Map<String, SPUtils> map = SP_UTILS_MAP;
        SPUtils sPUtils2 = map.get(str);
        if (sPUtils2 != null) {
            return sPUtils2;
        }
        synchronized (SPUtils.class) {
            try {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(str, i10);
                    map.put(str, sPUtils);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sPUtils;
    }

    public void put(@NonNull String str, int i10) {
        put(str, i10, false);
    }

    public void put(@NonNull String str, int i10, boolean z10) {
        if (z10) {
            this.f4557sp.edit().putInt(str, i10).commit();
        } else {
            this.f4557sp.edit().putInt(str, i10).apply();
        }
    }

    public void put(@NonNull String str, long j10) {
        put(str, j10, false);
    }

    public void put(@NonNull String str, long j10, boolean z10) {
        if (z10) {
            this.f4557sp.edit().putLong(str, j10).commit();
        } else {
            this.f4557sp.edit().putLong(str, j10).apply();
        }
    }

    public void put(@NonNull String str, float f10) {
        put(str, f10, false);
    }

    public void put(@NonNull String str, float f10, boolean z10) {
        if (z10) {
            this.f4557sp.edit().putFloat(str, f10).commit();
        } else {
            this.f4557sp.edit().putFloat(str, f10).apply();
        }
    }

    public void put(@NonNull String str, boolean z10) {
        put(str, z10, false);
    }

    public void put(@NonNull String str, boolean z10, boolean z11) {
        if (z11) {
            this.f4557sp.edit().putBoolean(str, z10).commit();
        } else {
            this.f4557sp.edit().putBoolean(str, z10).apply();
        }
    }

    public void put(@NonNull String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, Set<String> set, boolean z10) {
        if (z10) {
            this.f4557sp.edit().putStringSet(str, set).commit();
        } else {
            this.f4557sp.edit().putStringSet(str, set).apply();
        }
    }
}
