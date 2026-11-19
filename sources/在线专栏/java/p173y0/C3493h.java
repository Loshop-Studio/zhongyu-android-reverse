package p173y0;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p169x0.AbstractC3445n;

/* renamed from: y0.h */
/* loaded from: classes.dex */
public class C3493h {

    /* renamed from: a */
    private static final String f12189a = AbstractC3445n.m10503f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f12190b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m10590a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m10591b(context) : m10592c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m10591b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m10592c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m10593d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m10594e(Context context) {
        File fileM10591b = m10591b(context);
        if (Build.VERSION.SDK_INT < 23 || !fileM10591b.exists()) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f12189a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> mapM10595f = m10595f(context);
        for (File file : mapM10595f.keySet()) {
            File file2 = mapM10595f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    AbstractC3445n.m10501c().mo10508h(f12189a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                AbstractC3445n.m10501c().mo10504a(f12189a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m10595f(Context context) {
        HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File fileM10591b = m10591b(context);
            File fileM10590a = m10590a(context);
            map.put(fileM10591b, fileM10590a);
            for (String str : f12190b) {
                map.put(new File(fileM10591b.getPath() + str), new File(fileM10590a.getPath() + str));
            }
        }
        return map;
    }
}
