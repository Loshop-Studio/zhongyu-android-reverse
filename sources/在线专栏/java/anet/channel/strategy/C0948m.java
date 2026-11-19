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
/* loaded from: classes.dex */
class C0948m {

    /* renamed from: a */
    private static File f5443a = null;

    /* renamed from: b */
    private static volatile boolean f5444b = false;

    /* renamed from: c */
    private static Comparator<File> f5445c = new C0949n();

    C0948m() {
    }

    /* renamed from: a */
    public static void m4617a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f5443a = file;
                if (!m4619a(file)) {
                    ALog.m4638e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f5443a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f5443a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f5443a = file2;
                    if (!m4619a(file2)) {
                        ALog.m4638e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f5443a.getAbsolutePath());
                    }
                }
                ALog.m4639i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f5443a.getAbsolutePath());
                if (!f5444b) {
                    m4621c();
                } else {
                    m4616a();
                    f5444b = false;
                }
            } catch (Throwable th) {
                ALog.m4637e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    static synchronized File[] m4620b() {
        File file = f5443a;
        if (file == null) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, f5445c);
        }
        return fileArrListFiles;
    }

    /* renamed from: c */
    static synchronized void m4621c() {
        File[] fileArrM4620b = m4620b();
        if (fileArrM4620b == null) {
            return;
        }
        int i4 = 0;
        for (File file : fileArrM4620b) {
            if (!file.isDirectory()) {
                if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                    file.delete();
                } else if (file.getName().startsWith("WIFI")) {
                    int i5 = i4 + 1;
                    if (i4 > 10) {
                        file.delete();
                    }
                    i4 = i5;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m4619a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* renamed from: a */
    public static File m4614a(String str) {
        m4619a(f5443a);
        return new File(f5443a, str);
    }

    /* renamed from: a */
    static synchronized void m4616a() {
        ALog.m4639i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
        File file = f5443a;
        if (file == null) {
            ALog.m4641w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
            f5444b = true;
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
        ALog.m4639i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
    }

    /* renamed from: a */
    static synchronized void m4618a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        SerializeHelper.persist(serializable, m4614a(str), strategyStatObject);
    }

    /* renamed from: a */
    static synchronized <T> T m4615a(String str, StrategyStatObject strategyStatObject) {
        return (T) SerializeHelper.restore(m4614a(str), strategyStatObject);
    }
}
