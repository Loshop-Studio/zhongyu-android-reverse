package com.tencent.smtt.sdk;

import com.tencent.smtt.utils.TbsLog;

/* renamed from: com.tencent.smtt.sdk.bn */
/* loaded from: classes4.dex */
final class C6815bn extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        if (WebView.f6697j == null) {
            TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
            return;
        }
        C6827l c6827lM6214a = C6827l.m6214a(true);
        if (C6827l.f6902a) {
            TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
            return;
        }
        C6780af c6780afM6042a = C6780af.m6042a(WebView.f6697j);
        int iM6054c = c6780afM6042a.m6054c();
        TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = " + iM6054c);
        if (iM6054c == 2) {
            TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
            c6827lM6214a.m6221a(String.valueOf(c6780afM6042a.m6050b()));
            c6827lM6214a.m6223b(true);
            return;
        }
        int iM6051b = c6780afM6042a.m6051b("copy_status");
        TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = " + iM6051b);
        if (iM6051b == 1) {
            TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
            c6827lM6214a.m6221a(String.valueOf(c6780afM6042a.m6055c("copy_core_ver")));
            c6827lM6214a.m6223b(true);
        } else {
            if (C6816bo.m6152b().m6157c()) {
                return;
            }
            if (iM6054c == 3 || iM6051b == 3) {
                TbsLog.m6244d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
                c6827lM6214a.m6221a(String.valueOf(C6827l.m6217d()));
                c6827lM6214a.m6223b(true);
            }
        }
    }
}
