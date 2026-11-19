package com.taobao.accs.net;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.internal.AccsJobService;

/* renamed from: com.taobao.accs.net.t */
/* loaded from: classes5.dex */
public class C7660t extends AbstractC7646f {
    public static final int DEAMON_JOB_ID = 2051;
    public static final int HB_JOB_ID = 2050;

    public C7660t(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC7646f
    /* renamed from: a */
    public void mo10013a(int i10) {
        long j10 = i10 * 1000;
        ((JobScheduler) this.f13077a.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(HB_JOB_ID, new ComponentName(this.f13077a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j10).setOverrideDeadline(j10).setRequiredNetworkType(1).build());
    }
}
