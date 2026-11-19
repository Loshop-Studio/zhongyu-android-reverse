package p000a.p031h.p033c;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* renamed from: a.h.c.a */
/* loaded from: classes.dex */
public class C0192a {

    /* renamed from: a */
    public static final Object f1425a = new Object();

    /* renamed from: a.h.c.a$a */
    public static class a {
        /* renamed from: a */
        public static void m733a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        public static void m734b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: a.h.c.a$b */
    public static class b {
        /* renamed from: a */
        public static File[] m735a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        public static File[] m736b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        public static File[] m737c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: a.h.c.a$c */
    public static class c {
        /* renamed from: a */
        public static File m738a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        public static Drawable m739b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        public static File m740c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: a.h.c.a$d */
    public static class d {
        /* renamed from: a */
        public static int m741a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        public static ColorStateList m742b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        public static <T> T m743c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: d */
        public static String m744d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: a */
    public static int m732a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
