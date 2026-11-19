package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes4.dex */
public final class C6428az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m5101a(ActivityManager activityManager, long j10) throws InterruptedException {
        if (activityManager == null) {
            C6414al.m4927c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C6414al.m4927c("get anr state, timeout:%d", Long.valueOf(j10));
        long j11 = j10 / 500;
        int i10 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM5103a = m5103a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM5103a == null) {
                C6414al.m4927c("found proc state is null", new Object[0]);
            } else {
                int i11 = processErrorStateInfoM5103a.condition;
                if (i11 == 2) {
                    C6414al.m4927c("found proc state is anr! proc:%s", processErrorStateInfoM5103a.processName);
                    return processErrorStateInfoM5103a;
                }
                if (i11 == 1) {
                    C6414al.m4927c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i12 = i10 + 1;
            if (i10 >= j11) {
                return m5102a("Find process anr, but unable to get anr message.");
            }
            C6414al.m4927c("try the %s times:", Integer.valueOf(i12));
            C6418ap.m4982b(500L);
            i10 = i12;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m5103a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C6414al.m4927c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C6414al.m4927c("current proc not in the error state", new Object[0]);
            return null;
        }
        C6414al.m4927c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m5102a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C6475z.m5321a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
