package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes5.dex */
public final class C7793az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m10791a(ActivityManager activityManager, long j10) throws InterruptedException {
        if (activityManager == null) {
            C7779al.m10617c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C7779al.m10617c("get anr state, timeout:%d", Long.valueOf(j10));
        long j11 = j10 / 500;
        int i10 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM10793a = m10793a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM10793a == null) {
                C7779al.m10617c("found proc state is null", new Object[0]);
            } else {
                int i11 = processErrorStateInfoM10793a.condition;
                if (i11 == 2) {
                    C7779al.m10617c("found proc state is anr! proc:%s", processErrorStateInfoM10793a.processName);
                    return processErrorStateInfoM10793a;
                }
                if (i11 == 1) {
                    C7779al.m10617c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i12 = i10 + 1;
            if (i10 >= j11) {
                return m10792a("Find process anr, but unable to get anr message.");
            }
            C7779al.m10617c("try the %s times:", Integer.valueOf(i12));
            C7783ap.m10672b(500L);
            i10 = i12;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m10793a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C7779al.m10617c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C7779al.m10617c("current proc not in the error state", new Object[0]);
            return null;
        }
        C7779al.m10617c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m10792a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C7840z.m11011a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
