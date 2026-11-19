package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
class C0108i {

    /* renamed from: a */
    private static Field f348a;

    /* renamed from: b */
    private static boolean f349b;

    /* renamed from: c */
    private static Class<?> f350c;

    /* renamed from: d */
    private static boolean f351d;

    /* renamed from: e */
    private static Field f352e;

    /* renamed from: f */
    private static boolean f353f;

    /* renamed from: g */
    private static Field f354g;

    /* renamed from: h */
    private static boolean f355h;

    /* renamed from: a */
    static void m286a(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return;
        }
        if (i4 >= 24) {
            m289d(resources);
        } else if (i4 >= 23) {
            m288c(resources);
        } else {
            m287b(resources);
        }
    }

    /* renamed from: b */
    private static void m287b(Resources resources) throws NoSuchFieldException {
        if (!f349b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f348a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e4);
            }
            f349b = true;
        }
        Field field = f348a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e5);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m288c(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f349b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f348a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e4);
            }
            f349b = true;
        }
        Object obj = null;
        Field field = f348a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e5);
            }
        }
        if (obj == null) {
            return;
        }
        m290e(obj);
    }

    /* renamed from: d */
    private static void m289d(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        if (!f355h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f354g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            f355h = true;
        }
        Field field = f354g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f349b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f348a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            f349b = true;
        }
        Field field2 = f348a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
            }
        }
        if (obj2 != null) {
            m290e(obj2);
        }
    }

    /* renamed from: e */
    private static void m290e(Object obj) throws NoSuchFieldException {
        if (!f351d) {
            try {
                f350c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e4);
            }
            f351d = true;
        }
        Class<?> cls = f350c;
        if (cls == null) {
            return;
        }
        if (!f353f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f352e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f353f = true;
        }
        Field field = f352e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
