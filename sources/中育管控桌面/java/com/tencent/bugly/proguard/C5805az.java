package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes3.dex */
public final class C5805az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m4106a(ActivityManager activityManager, long j6) throws InterruptedException {
        if (activityManager == null) {
            C5791al.m3932c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C5791al.m3932c("get anr state, timeout:%d", Long.valueOf(j6));
        long j7 = j6 / 500;
        int i6 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM4108a = m4108a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM4108a == null) {
                C5791al.m3932c("found proc state is null", new Object[0]);
            } else {
                int i7 = processErrorStateInfoM4108a.condition;
                if (i7 == 2) {
                    C5791al.m3932c("found proc state is anr! proc:%s", processErrorStateInfoM4108a.processName);
                    return processErrorStateInfoM4108a;
                }
                if (i7 == 1) {
                    C5791al.m3932c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i8 = i6 + 1;
            if (i6 >= j7) {
                return m4107a("Find process anr, but unable to get anr message.");
            }
            C5791al.m3932c("try the %s times:", Integer.valueOf(i8));
            C5795ap.m3987b(500L);
            i6 = i8;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m4108a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C5791al.m3932c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C5791al.m3932c("current proc not in the error state", new Object[0]);
            return null;
        }
        C5791al.m3932c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m4107a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C5852z.m4326a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
