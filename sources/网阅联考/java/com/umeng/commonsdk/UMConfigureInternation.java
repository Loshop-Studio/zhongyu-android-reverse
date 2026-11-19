package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;

/* loaded from: classes2.dex */
public class UMConfigureInternation {
    private static boolean isInternal = false;

    public static void doSelfCheck(Context context) {
        try {
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                return;
            }
            UMWorkDispatch.sendEvent(context, C3449a.f2601z, C3450b.m3469a(context).m3470a(), null);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void sendInternal(final Context context) {
        if (context != null) {
            try {
                if (!isInternal) {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMConfigureInternation.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName) || !UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                                    return;
                                }
                                Context context2 = context;
                                UMWorkDispatch.sendEvent(context2, C3449a.f2589n, C3450b.m3469a(context2).m3470a(), null);
                            } catch (Throwable unused) {
                            }
                        }
                    }).start();
                    isInternal = true;
                }
            } finally {
            }
        }
    }
}
