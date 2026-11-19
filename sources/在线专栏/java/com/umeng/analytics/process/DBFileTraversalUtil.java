package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class DBFileTraversalUtil {

    /* renamed from: a */
    private static ExecutorService f8941a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private static FileLockUtil f8942b = new FileLockUtil();

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    public interface InterfaceC1927a {
        /* renamed from: a */
        void mo7287a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final InterfaceC1927a interfaceC1927a) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f8941a.execute(new Runnable() { // from class: com.umeng.analytics.process.DBFileTraversalUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        for (File file2 : file.listFiles()) {
                            if (file2.getName().endsWith(InterfaceC1931a.f8964d)) {
                                DBFileTraversalUtil.f8942b.doFileOperateion(file2, fileLockCallback);
                                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> file: " + file2.getName());
                            }
                        }
                        InterfaceC1927a interfaceC1927a2 = interfaceC1927a;
                        if (interfaceC1927a2 != null) {
                            interfaceC1927a2.mo7287a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> end *** ");
                }
            });
        }
    }
}
