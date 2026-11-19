package com.taobao.accs.net;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.internal.AccsJobService;

/* renamed from: com.taobao.accs.net.t */
/* loaded from: classes.dex */
public class C1763t extends AbstractC1749f {
    public static final int DEAMON_JOB_ID = 2051;
    public static final int HB_JOB_ID = 2050;

    protected C1763t(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC1749f
    /* renamed from: a */
    protected void mo5987a(int i4) {
        long j4 = i4 * 1000;
        ((JobScheduler) this.f7679a.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2050, new ComponentName(this.f7679a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j4).setOverrideDeadline(j4).setRequiredNetworkType(1).build());
    }
}
