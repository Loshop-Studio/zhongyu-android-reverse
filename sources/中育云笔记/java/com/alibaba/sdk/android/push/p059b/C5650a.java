package com.alibaba.sdk.android.push.p059b;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.channel.KeepChannelService;

/* renamed from: com.alibaba.sdk.android.push.b.a */
/* loaded from: classes3.dex */
public class C5650a {

    /* renamed from: a */
    private static final AmsLogger f4213a = AmsLogger.getLogger("MPS:KeepLiveManager");

    /* renamed from: b */
    private static Context f4214b = null;

    /* renamed from: c */
    private static C5650a f4215c = null;

    private C5650a() {
    }

    /* renamed from: a */
    public static C5650a m3607a() {
        if (f4215c == null) {
            f4215c = new C5650a();
        }
        return f4215c;
    }

    /* renamed from: b */
    public void m3609b() {
        if (f4214b != null) {
            f4213a.m3417d("Check KeepChannelService");
            try {
                JobScheduler jobScheduler = (JobScheduler) f4214b.getSystemService("jobscheduler");
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    if (jobInfo.getId() == 900715 && jobInfo.getService().equals(new ComponentName(f4214b.getPackageName(), KeepChannelService.class.getName()))) {
                        f4213a.m3417d("cancel Keep Channel Service");
                        jobScheduler.cancel(jobInfo.getId());
                        return;
                    }
                }
            } catch (Throwable th) {
                f4213a.m3421e("start KeepChannelService failed.", th);
            }
        }
    }

    /* renamed from: a */
    public static void m3608a(Context context) {
        f4214b = context;
        if (f4215c == null) {
            f4215c = m3607a();
        }
    }
}
