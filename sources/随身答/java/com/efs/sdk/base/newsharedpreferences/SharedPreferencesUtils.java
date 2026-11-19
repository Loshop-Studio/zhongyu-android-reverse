package com.efs.sdk.base.newsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class SharedPreferencesUtils {
    private static final HashMap<String, SharedPreferencesWrapper> sSpCache = new HashMap<>();

    public static class SharedPreferencesWrapper {
        private volatile SharedPreferences mSharedPreferences;

        private SharedPreferencesWrapper() {
        }
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z9) {
        return getNewSharedPreferences(context, str, z9, false);
    }

    public static File getNewSharedPrefsFile(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir, "shared_prefs" + File.separatorChar + str + ".sp");
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
        return getSharedPreferences(context, str, false);
    }

    private static synchronized void handleReplace(Context context, String str, boolean z9) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences newSharedPreferences = getNewSharedPreferences(context, "sp_replace_flag", z9, true);
            if (!newSharedPreferences.contains(str)) {
                SharedPreferences newSharedPreferences2 = getNewSharedPreferences(context, str, z9, true);
                SharedPreferences.Editor editorEdit = newSharedPreferences2.edit();
                if (((SharedPreferencesNewImpl) newSharedPreferences2).getModifyID() <= 1) {
                    Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
                    Log.e("caisq", "replace " + str + "   " + all.size() + "   " + newSharedPreferences2.hashCode());
                    if (all.size() > 0) {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && key.trim().length() > 0 && value != null) {
                                if (value instanceof String) {
                                    editorEdit.putString(key, (String) value);
                                } else if (value instanceof Long) {
                                    editorEdit.putLong(key, ((Long) value).longValue());
                                } else if (value instanceof Integer) {
                                    editorEdit.putInt(key, ((Integer) value).intValue());
                                } else if (value instanceof Float) {
                                    editorEdit.putFloat(key, ((Float) value).floatValue());
                                } else if (value instanceof Boolean) {
                                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                                }
                            }
                        }
                        editorEdit.apply();
                    }
                }
                newSharedPreferences.edit().putBoolean(str, true).apply();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static Object invokeObjectMethod(Object obj, String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void onDestroy() {
        HashMap<String, SharedPreferencesWrapper> map = sSpCache;
        synchronized (map) {
            try {
                if (map.size() > 0) {
                    Iterator<SharedPreferencesWrapper> it = map.values().iterator();
                    while (it.hasNext()) {
                        SharedPreferences sharedPreferences = it.next().mSharedPreferences;
                        if (sharedPreferences != null) {
                            ((SharedPreferencesNewImpl) sharedPreferences).onDestroy();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static SharedPreferences getNewSharedPreferences(Context context, String str, boolean z9, boolean z10) {
        SharedPreferencesWrapper sharedPreferencesWrapper;
        HashMap<String, SharedPreferencesWrapper> map = sSpCache;
        synchronized (map) {
            try {
                sharedPreferencesWrapper = map.get(str);
                if (sharedPreferencesWrapper == null) {
                    sharedPreferencesWrapper = new SharedPreferencesWrapper();
                    map.put(str, sharedPreferencesWrapper);
                }
            } finally {
            }
        }
        if (sharedPreferencesWrapper.mSharedPreferences == null) {
            synchronized (sharedPreferencesWrapper) {
                try {
                    if (sharedPreferencesWrapper.mSharedPreferences == null) {
                        if (!z10) {
                            handleReplace(context, str, z9);
                        }
                        if (sharedPreferencesWrapper.mSharedPreferences == null) {
                            sharedPreferencesWrapper.mSharedPreferences = new SharedPreferencesNewImpl(getNewSharedPrefsFile(context, str), z9);
                        }
                    }
                } finally {
                }
            }
        }
        return sharedPreferencesWrapper.mSharedPreferences;
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, boolean z9) {
        return getNewSharedPreferences(context, str, z9);
    }
}
