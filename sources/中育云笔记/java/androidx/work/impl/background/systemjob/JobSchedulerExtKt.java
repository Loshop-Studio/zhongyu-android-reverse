package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class JobSchedulerExtKt {
    private static final String TAG;
    public static final String WORKMANAGER_NAMESPACE = "androidx.work.systemjobscheduler";

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("SystemJobScheduler");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"SystemJobScheduler\")");
        TAG = strTagWithPrefix;
    }

    @RequiresApi(23)
    public static final String createErrorMessage(Context context, WorkDatabase workDatabase, Configuration configuration) {
        String str;
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(workDatabase, "workDatabase");
        AbstractC9979u.m20294g(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int i11 = i10 >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        String strM23954w0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler wmJobScheduler = getWmJobScheduler(context);
            List<JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                List<JobInfo> pendingJobs = SystemJobScheduler.getPendingJobs(context, wmJobScheduler);
                int size2 = pendingJobs != null ? safePendingJobs.size() - pendingJobs.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> pendingJobs2 = SystemJobScheduler.getPendingJobs(context, (JobScheduler) systemService);
                int size3 = pendingJobs2 != null ? pendingJobs2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strM23954w0 = AbstractC10947g0.m23954w0(AbstractC10978w.m24140r(safePendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> pendingJobs3 = SystemJobScheduler.getPendingJobs(context, getWmJobScheduler(context));
            if (pendingJobs3 != null) {
                strM23954w0 = pendingJobs3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i11 + " job limit exceeded.\nIn JobScheduler there are " + strM23954w0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    @RequiresApi(21)
    public static final List<JobInfo> getSafePendingJobs(JobScheduler jobScheduler) {
        AbstractC9979u.m20294g(jobScheduler, "<this>");
        try {
            return JobScheduler21.INSTANCE.getAllPendingJobs(jobScheduler);
        } catch (Throwable th) {
            Logger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    @RequiresApi(21)
    public static final JobScheduler getWmJobScheduler(Context context) {
        AbstractC9979u.m20294g(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? JobScheduler34.INSTANCE.forNamespace(jobScheduler) : jobScheduler;
    }
}
