package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(34)
/* loaded from: classes3.dex */
final class JobScheduler34 {
    public static final JobScheduler34 INSTANCE = new JobScheduler34();

    private JobScheduler34() {
    }

    public final JobScheduler forNamespace(JobScheduler jobScheduler) {
        AbstractC9979u.m20294g(jobScheduler, "jobScheduler");
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace(JobSchedulerExtKt.WORKMANAGER_NAMESPACE);
        AbstractC9979u.m20293f(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
