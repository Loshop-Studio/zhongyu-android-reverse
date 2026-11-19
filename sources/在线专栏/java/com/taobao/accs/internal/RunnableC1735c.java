package com.taobao.accs.internal;

import android.app.job.JobParameters;

/* renamed from: com.taobao.accs.internal.c */
/* loaded from: classes.dex */
class RunnableC1735c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobParameters f7625a;

    /* renamed from: b */
    final /* synthetic */ AccsJobService f7626b;

    RunnableC1735c(AccsJobService accsJobService, JobParameters jobParameters) {
        this.f7626b = accsJobService;
        this.f7625a = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7626b.jobFinished(this.f7625a, false);
    }
}
