package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.C1969d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C1970a;
import com.umeng.commonsdk.internal.utils.C1971b;
import com.umeng.commonsdk.internal.utils.C1972c;
import com.umeng.commonsdk.internal.utils.C1980k;
import com.umeng.commonsdk.statistics.common.ULog;

/* loaded from: classes.dex */
public class UMInnerImpl {

    /* renamed from: a */
    public static final /* synthetic */ int f9011a = 0;
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
                                    if (!C1972c.m7462a(context).m7464a()) {
                                        C1972c.m7462a(context).m7465b();
                                    }
                                } catch (Throwable th) {
                                    ULog.m7603e(UMModuleRegister.INNER, "e is " + th);
                                }
                                try {
                                    C1980k.m7495b(context);
                                } catch (Throwable th2) {
                                    ULog.m7603e(UMModuleRegister.INNER, "e is " + th2);
                                }
                                try {
                                    C1970a.m7436c(context);
                                } catch (Throwable th3) {
                                    ULog.m7603e(UMModuleRegister.INNER, "e is " + th3);
                                }
                                try {
                                    if (C1971b.m7454a(context).m7458a()) {
                                        return;
                                    }
                                    C1971b.m7454a(context).m7459b();
                                } catch (Throwable unused) {
                                    ULog.m7603e(UMModuleRegister.INNER, "get station is null ");
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
                                    C1969d.m7416b(context);
                                } catch (Throwable th) {
                                    ULog.m7603e(UMModuleRegister.INNER, "e is " + th);
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
