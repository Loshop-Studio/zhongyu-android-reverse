package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import p148s.C3368f;

/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0332a {

    /* renamed from: a */
    private static final Object f2670a = new Object();

    /* renamed from: b */
    private static final Object f2671b = new Object();

    /* renamed from: androidx.core.content.a$a */
    static class a {
        /* renamed from: a */
        static void m1812a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m1813b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    static class b {
        /* renamed from: a */
        static File[] m1814a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m1815b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m1816c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    static class c {
        /* renamed from: a */
        static File m1817a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m1818b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        /* renamed from: c */
        static File m1819c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    static class d {
        /* renamed from: a */
        static int m1820a(Context context, int i4) {
            return context.getColor(i4);
        }

        /* renamed from: b */
        static ColorStateList m1821b(Context context, int i4) {
            return context.getColorStateList(i4);
        }

        /* renamed from: c */
        static <T> T m1822c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m1823d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    static class e {
        /* renamed from: a */
        static ComponentName m1824a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m1803a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static int m1804b(Context context, int i4) {
        return Build.VERSION.SDK_INT >= 23 ? d.m1820a(context, i4) : context.getResources().getColor(i4);
    }

    /* renamed from: c */
    public static ColorStateList m1805c(Context context, int i4) {
        return C3368f.m10232c(context.getResources(), i4, context.getTheme());
    }

    /* renamed from: d */
    public static Drawable m1806d(Context context, int i4) {
        return c.m1818b(context, i4);
    }

    /* renamed from: e */
    public static File[] m1807e(Context context) {
        return b.m1814a(context);
    }

    /* renamed from: f */
    public static File[] m1808f(Context context, String str) {
        return b.m1815b(context, str);
    }

    /* renamed from: g */
    public static boolean m1809g(Context context, Intent[] intentArr, Bundle bundle) {
        a.m1812a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: h */
    public static void m1810h(Context context, Intent intent, Bundle bundle) {
        a.m1813b(context, intent, bundle);
    }

    /* renamed from: i */
    public static void m1811i(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            e.m1824a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
