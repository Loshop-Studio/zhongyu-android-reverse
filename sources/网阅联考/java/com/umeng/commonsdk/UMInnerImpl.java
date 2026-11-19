package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.C3453d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3454a;
import com.umeng.commonsdk.internal.utils.C3455b;
import com.umeng.commonsdk.internal.utils.C3456c;
import com.umeng.commonsdk.internal.utils.C3464k;
import com.umeng.commonsdk.statistics.common.ULog;

/* loaded from: classes2.dex */
public class UMInnerImpl {

    /* renamed from: a */
    public static final /* synthetic */ int f2419a = 0;
    private static boolean isInternal = false;

    public static synchronized void initAndSendInternal(final Context context) {
        if (context != null) {
            try {
                if (!isInternal) {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                                    return;
                                }
                                try {
                                    if (!C3456c.m3539a(context).m3541a()) {
                                        C3456c.m3539a(context).m3542b();
                                    }
                                } catch (Throwable th) {
                                    ULog.m3680e(UMModuleRegister.INNER, "e is " + th);
                                }
                                try {
                                    C3464k.m3572b(context);
                                } catch (Throwable th2) {
                                    ULog.m3680e(UMModuleRegister.INNER, "e is " + th2);
                                }
                                try {
                                    C3454a.m3513c(context);
                                } catch (Throwable th3) {
                                    ULog.m3680e(UMModuleRegister.INNER, "e is " + th3);
                                }
                                try {
                                    if (C3455b.m3531a(context).m3535a()) {
                                        return;
                                    }
                                    C3455b.m3531a(context).m3536b();
                                } catch (Throwable unused) {
                                    ULog.m3680e(UMModuleRegister.INNER, "get station is null ");
                                }
                            } catch (Throwable th4) {
                                UMCrashManager.reportCrash(context, th4);
                            }
                        }
                    }).start();
                    isInternal = true;
                    sendInternal(context);
                }
            } finally {
            }
        }
    }

    private static synchronized void sendInternal(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                            String packageName = context.getPackageName();
                            if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                try {
                                    C3453d.m3493b(context);
                                } catch (Throwable th) {
                                    ULog.m3680e(UMModuleRegister.INNER, "e is " + th);
                                }
                            }
                        } catch (Throwable th2) {
                            UMCrashManager.reportCrash(context, th2);
                        }
                    }
                }).start();
                isInternal = true;
            } finally {
            }
        }
    }
}
