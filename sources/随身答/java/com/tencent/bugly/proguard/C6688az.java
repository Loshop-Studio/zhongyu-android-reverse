package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes4.dex */
public final class C6688az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m5280a(ActivityManager activityManager, long j9) throws InterruptedException {
        if (activityManager == null) {
            C6674al.m5106c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C6674al.m5106c("get anr state, timeout:%d", Long.valueOf(j9));
        long j10 = j9 / 500;
        int i9 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM5282a = m5282a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM5282a == null) {
                C6674al.m5106c("found proc state is null", new Object[0]);
            } else {
                int i10 = processErrorStateInfoM5282a.condition;
                if (i10 == 2) {
                    C6674al.m5106c("found proc state is anr! proc:%s", processErrorStateInfoM5282a.processName);
                    return processErrorStateInfoM5282a;
                }
                if (i10 == 1) {
                    C6674al.m5106c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i11 = i9 + 1;
            if (i9 >= j10) {
                return m5281a("Find process anr, but unable to get anr message.");
            }
            C6674al.m5106c("try the %s times:", Integer.valueOf(i11));
            C6678ap.m5161b(500L);
            i9 = i11;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m5282a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C6674al.m5106c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C6674al.m5106c("current proc not in the error state", new Object[0]);
            return null;
        }
        C6674al.m5106c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m5281a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C6735z.m5500a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
