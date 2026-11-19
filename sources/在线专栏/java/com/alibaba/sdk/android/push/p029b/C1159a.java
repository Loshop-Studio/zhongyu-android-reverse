package com.alibaba.sdk.android.push.p029b;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.channel.KeepChannelService;

/* renamed from: com.alibaba.sdk.android.push.b.a */
/* loaded from: classes.dex */
public class C1159a {

    /* renamed from: a */
    private static final AmsLogger f6689a = AmsLogger.getLogger("MPS:KeepLiveManager");

    /* renamed from: b */
    private static Context f6690b = null;

    /* renamed from: c */
    private static C1159a f6691c = null;

    private C1159a() {
    }

    /* renamed from: a */
    public static C1159a m5156a() {
        if (f6691c == null) {
            f6691c = new C1159a();
        }
        return f6691c;
    }

    /* renamed from: a */
    public static void m5157a(Context context) {
        f6690b = context;
        if (f6691c == null) {
            f6691c = m5156a();
        }
    }

    /* renamed from: b */
    public void m5158b() {
        if (f6690b != null) {
            f6689a.m5016d("Check KeepChannelService");
            try {
                JobScheduler jobScheduler = (JobScheduler) f6690b.getSystemService("jobscheduler");
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    if (jobInfo.getId() == 900715 && jobInfo.getService().equals(new ComponentName(f6690b.getPackageName(), KeepChannelService.class.getName()))) {
                        f6689a.m5016d("cancel Keep Channel Service");
                        jobScheduler.cancel(jobInfo.getId());
                        return;
                    }
                }
            } catch (Throwable th) {
                f6689a.m5020e("start KeepChannelService failed.", th);
            }
        }
    }
}
