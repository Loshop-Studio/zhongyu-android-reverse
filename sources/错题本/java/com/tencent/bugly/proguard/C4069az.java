package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes3.dex */
public final class C4069az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m3198a(ActivityManager activityManager, long j7) throws InterruptedException {
        if (activityManager == null) {
            C4055al.m3025c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C4055al.m3025c("get anr state, timeout:%d", Long.valueOf(j7));
        long j8 = j7 / 500;
        int i = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM3200a = m3200a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM3200a == null) {
                C4055al.m3025c("found proc state is null", new Object[0]);
            } else {
                int i8 = processErrorStateInfoM3200a.condition;
                if (i8 == 2) {
                    C4055al.m3025c("found proc state is anr! proc:%s", processErrorStateInfoM3200a.processName);
                    return processErrorStateInfoM3200a;
                }
                if (i8 == 1) {
                    C4055al.m3025c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i9 = i + 1;
            if (i >= j8) {
                return m3199a("Find process anr, but unable to get anr message.");
            }
            C4055al.m3025c("try the %s times:", Integer.valueOf(i9));
            C4059ap.m3080b(500L);
            i = i9;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m3200a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C4055al.m3025c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C4055al.m3025c("current proc not in the error state", new Object[0]);
            return null;
        }
        C4055al.m3025c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m3199a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C4149z.m3417a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
