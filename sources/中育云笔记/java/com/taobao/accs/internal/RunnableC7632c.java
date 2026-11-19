package com.taobao.accs.internal;

import android.app.job.JobParameters;

/* renamed from: com.taobao.accs.internal.c */
/* loaded from: classes5.dex */
class RunnableC7632c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobParameters f13023a;

    /* renamed from: b */
    final /* synthetic */ AccsJobService f13024b;

    public RunnableC7632c(AccsJobService accsJobService, JobParameters jobParameters) {
        this.f13024b = accsJobService;
        this.f13023a = jobParameters;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13024b.jobFinished(this.f13023a, false);
    }
}
