package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

/* loaded from: classes4.dex */
class TbsLinuxToolsJni {

    /* renamed from: a */
    private static boolean f6641a = false;

    /* renamed from: b */
    private static boolean f6642b = false;

    public TbsLinuxToolsJni(Context context) {
        m5875a(context);
    }

    private native int ChmodInner(String str, String str2);

    /* renamed from: a */
    public int m5876a(String str, String str2) {
        if (f6641a) {
            return ChmodInner(str, str2);
        }
        TbsLog.m6247e("TbsLinuxToolsJni", "jni not loaded!", true);
        return -1;
    }

    /* renamed from: a */
    private void m5875a(Context context) {
        synchronized (TbsLinuxToolsJni.class) {
            try {
                if (f6642b) {
                    return;
                }
                f6642b = true;
                try {
                    File file = TbsShareManager.isThirdPartyApp(context) ? new File(TbsShareManager.m5930c(context)) : C6785ak.m6068a().m6121n(context);
                    if (file != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        String str = File.separator;
                        sb.append(str);
                        sb.append("liblinuxtoolsfortbssdk_jni.so");
                        if (!new File(sb.toString()).exists() && !TbsShareManager.isThirdPartyApp(context)) {
                            file = C6785ak.m6068a().m6120m(context);
                        }
                        if (file != null) {
                            System.load(file.getAbsolutePath() + str + "liblinuxtoolsfortbssdk_jni.so");
                            f6641a = true;
                        }
                    }
                    ChmodInner("/checkChmodeExists", "700");
                } catch (Throwable th) {
                    th.printStackTrace();
                    f6641a = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
