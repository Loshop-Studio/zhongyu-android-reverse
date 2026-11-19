package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: anet.channel.strategy.m */
/* loaded from: classes3.dex */
class C5071m {

    /* renamed from: a */
    private static File f2721a = null;

    /* renamed from: b */
    private static volatile boolean f2722b = false;

    /* renamed from: c */
    private static Comparator<File> f2723c = new C5072n();

    /* renamed from: a */
    public static void m2508a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f2721a = file;
                if (!m2510a(file)) {
                    ALog.m2529e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f2721a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f2721a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f2721a = file2;
                    if (!m2510a(file2)) {
                        ALog.m2529e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f2721a.getAbsolutePath());
                    }
                }
                ALog.m2530i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f2721a.getAbsolutePath());
                if (!f2722b) {
                    m2512c();
                } else {
                    m2507a();
                    f2722b = false;
                }
            } catch (Throwable th) {
                ALog.m2528e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static synchronized File[] m2511b() {
        File file = f2721a;
        if (file == null) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, f2723c);
        }
        return fileArrListFiles;
    }

    /* renamed from: c */
    public static synchronized void m2512c() {
        try {
            File[] fileArrM2511b = m2511b();
            if (fileArrM2511b == null) {
                return;
            }
            int i10 = 0;
            for (File file : fileArrM2511b) {
                if (!file.isDirectory()) {
                    if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                        file.delete();
                    } else if (file.getName().startsWith("WIFI")) {
                        int i11 = i10 + 1;
                        if (i10 > 10) {
                            file.delete();
                        }
                        i10 = i11;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m2510a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* renamed from: a */
    public static File m2505a(String str) {
        m2510a(f2721a);
        return new File(f2721a, str);
    }

    /* renamed from: a */
    public static synchronized void m2507a() {
        ALog.m2530i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
        File file = f2721a;
        if (file == null) {
            ALog.m2532w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
            f2722b = true;
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                file2.delete();
            }
        }
        ALog.m2530i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
    }

    /* renamed from: a */
    public static synchronized void m2509a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        SerializeHelper.persist(serializable, m2505a(str), strategyStatObject);
    }

    /* renamed from: a */
    public static synchronized <T> T m2506a(String str, StrategyStatObject strategyStatObject) {
        return (T) SerializeHelper.restore(m2505a(str), strategyStatObject);
    }
}
