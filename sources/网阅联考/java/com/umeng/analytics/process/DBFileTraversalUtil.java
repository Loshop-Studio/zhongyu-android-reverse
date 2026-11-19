package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class DBFileTraversalUtil {

    /* renamed from: a */
    private static ExecutorService f2349a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private static FileLockUtil f2350b = new FileLockUtil();

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    public interface InterfaceC3411a {
        /* renamed from: a */
        void mo3364a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final InterfaceC3411a interfaceC3411a) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f2349a.execute(new Runnable() { // from class: com.umeng.analytics.process.DBFileTraversalUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        for (File file2 : file.listFiles()) {
                            if (file2.getName().endsWith(InterfaceC3415a.f2372d)) {
                                DBFileTraversalUtil.f2350b.doFileOperateion(file2, fileLockCallback);
                                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> file: " + file2.getName());
                            }
                        }
                        InterfaceC3411a interfaceC3411a2 = interfaceC3411a;
                        if (interfaceC3411a2 != null) {
                            interfaceC3411a2.mo3364a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> end *** ");
                }
            });
        }
    }
}
