package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(21)
/* loaded from: classes3.dex */
final class JobScheduler21 {
    public static final JobScheduler21 INSTANCE = new JobScheduler21();

    private JobScheduler21() {
    }

    public final List<JobInfo> getAllPendingJobs(JobScheduler jobScheduler) {
        AbstractC9133u.m16133g(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        AbstractC9133u.m16132f(allPendingJobs, "jobScheduler.allPendingJobs");
        return allPendingJobs;
    }
}
