package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.az */
/* loaded from: classes4.dex */
public final class C6450az {
    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m4461a(ActivityManager activityManager, long j10) throws InterruptedException {
        if (activityManager == null) {
            C6436al.m4287c("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C6436al.m4287c("get anr state, timeout:%d", Long.valueOf(j10));
        long j11 = j10 / 500;
        int i10 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM4463a = m4463a(activityManager.getProcessesInErrorState());
            if (processErrorStateInfoM4463a == null) {
                C6436al.m4287c("found proc state is null", new Object[0]);
            } else {
                int i11 = processErrorStateInfoM4463a.condition;
                if (i11 == 2) {
                    C6436al.m4287c("found proc state is anr! proc:%s", processErrorStateInfoM4463a.processName);
                    return processErrorStateInfoM4463a;
                }
                if (i11 == 1) {
                    C6436al.m4287c("found proc state is crashed!", new Object[0]);
                    return null;
                }
            }
            int i12 = i10 + 1;
            if (i10 >= j11) {
                return m4462a("Find process anr, but unable to get anr message.");
            }
            C6436al.m4287c("try the %s times:", Integer.valueOf(i12));
            C6440ap.m4342b(500L);
            i10 = i12;
        }
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m4463a(List<ActivityManager.ProcessErrorStateInfo> list) {
        if (list != null && !list.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                if (processErrorStateInfo.pid == iMyPid) {
                    if (TextUtils.isEmpty(processErrorStateInfo.longMsg)) {
                        return null;
                    }
                    C6436al.m4287c("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C6436al.m4287c("current proc not in the error state", new Object[0]);
            return null;
        }
        C6436al.m4287c("error state info list is null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static ActivityManager.ProcessErrorStateInfo m4462a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C6497z.m4681a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
