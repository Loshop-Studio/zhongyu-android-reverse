package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p169x0.AbstractC3445n;
import p173y0.C3494i;
import p173y0.InterfaceC3487b;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC3487b {

    /* renamed from: c */
    private static final String f4823c = AbstractC3445n.m10503f("SystemJobService");

    /* renamed from: a */
    private C3494i f4824a;

    /* renamed from: b */
    private final Map<String, JobParameters> f4825b = new HashMap();

    /* renamed from: b */
    private static String m4229b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        JobParameters jobParametersRemove;
        AbstractC3445n.m10501c().mo10504a(f4823c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f4825b) {
            jobParametersRemove = this.f4825b.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z3);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C3494i c3494iM10599n = C3494i.m10599n(getApplicationContext());
            this.f4824a = c3494iM10599n;
            c3494iM10599n.m10610p().m10565d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC3445n.m10501c().mo10508h(f4823c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C3494i c3494i = this.f4824a;
        if (c3494i != null) {
            c3494i.m10610p().m10569i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f4824a == null) {
            AbstractC3445n.m10501c().mo10504a(f4823c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strM4229b = m4229b(jobParameters);
        if (TextUtils.isEmpty(strM4229b)) {
            AbstractC3445n.m10501c().mo10505b(f4823c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f4825b) {
            if (this.f4825b.containsKey(strM4229b)) {
                AbstractC3445n.m10501c().mo10504a(f4823c, String.format("Job is already being executed by SystemJobService: %s", strM4229b), new Throwable[0]);
                return false;
            }
            AbstractC3445n.m10501c().mo10504a(f4823c, String.format("onStartJob for %s", strM4229b), new Throwable[0]);
            this.f4825b.put(strM4229b, jobParameters);
            WorkerParameters.C0809a c0809a = null;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                c0809a = new WorkerParameters.C0809a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0809a.f4750b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0809a.f4749a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i4 >= 28) {
                    c0809a.f4751c = jobParameters.getNetwork();
                }
            }
            this.f4824a.m10601A(strM4229b, c0809a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4824a == null) {
            AbstractC3445n.m10501c().mo10504a(f4823c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strM4229b = m4229b(jobParameters);
        if (TextUtils.isEmpty(strM4229b)) {
            AbstractC3445n.m10501c().mo10505b(f4823c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC3445n.m10501c().mo10504a(f4823c, String.format("onStopJob for %s", strM4229b), new Throwable[0]);
        synchronized (this.f4825b) {
            this.f4825b.remove(strM4229b);
        }
        this.f4824a.m10603C(strM4229b);
        return !this.f4824a.m10610p().m10566f(strM4229b);
    }
}
