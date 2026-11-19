package p002a1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p085f1.C2511i;
import p085f1.C2520r;
import p085f1.InterfaceC2521s;
import p090g1.C2631c;
import p169x0.AbstractC3445n;
import p169x0.C3453v;
import p173y0.C3494i;
import p173y0.InterfaceC3490e;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public class C0008b implements InterfaceC3490e {

    /* renamed from: e */
    private static final String f48e = AbstractC3445n.m10503f("SystemJobScheduler");

    /* renamed from: a */
    private final Context f49a;

    /* renamed from: b */
    private final JobScheduler f50b;

    /* renamed from: c */
    private final C3494i f51c;

    /* renamed from: d */
    private final C0007a f52d;

    public C0008b(Context context, C3494i c3494i) {
        this(context, c3494i, (JobScheduler) context.getSystemService("jobscheduler"), new C0007a(context));
    }

    /* renamed from: a */
    public static void m50a(Context context) {
        List<JobInfo> listM53g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listM53g = m53g(context, jobScheduler)) == null || listM53g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listM53g.iterator();
        while (it.hasNext()) {
            m51c(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: c */
    private static void m51c(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10505b(f48e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i4)), th);
        }
    }

    /* renamed from: d */
    private static List<Integer> m52d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listM53g = m53g(context, jobScheduler);
        if (listM53g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM53g) {
            if (str.equals(m54h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m53g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10505b(f48e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m54h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m55i(Context context, C3494i c3494i) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM53g = m53g(context, jobScheduler);
        List<String> listMo8436b = c3494i.m10613s().mo4168J().mo8436b();
        boolean z3 = false;
        HashSet hashSet = new HashSet(listM53g != null ? listM53g.size() : 0);
        if (listM53g != null && !listM53g.isEmpty()) {
            for (JobInfo jobInfo : listM53g) {
                String strM54h = m54h(jobInfo);
                if (TextUtils.isEmpty(strM54h)) {
                    m51c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strM54h);
                }
            }
        }
        Iterator<String> it = listMo8436b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC3445n.m10501c().mo10504a(f48e, "Reconciling jobs", new Throwable[0]);
                z3 = true;
                break;
            }
        }
        if (z3) {
            WorkDatabase workDatabaseM10613s = c3494i.m10613s();
            workDatabaseM10613s.m3542e();
            try {
                InterfaceC2521s interfaceC2521sMo4171M = workDatabaseM10613s.mo4171M();
                Iterator<String> it2 = listMo8436b.iterator();
                while (it2.hasNext()) {
                    interfaceC2521sMo4171M.mo8456d(it2.next(), -1L);
                }
                workDatabaseM10613s.m3539A();
            } finally {
                workDatabaseM10613s.m3546i();
            }
        }
        return z3;
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: b */
    public void mo56b(String str) {
        List<Integer> listM52d = m52d(this.f49a, this.f50b, str);
        if (listM52d == null || listM52d.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM52d.iterator();
        while (it.hasNext()) {
            m51c(this.f50b, it.next().intValue());
        }
        this.f51c.m10613s().mo4168J().mo8438d(str);
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: e */
    public boolean mo57e() {
        return true;
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: f */
    public void mo58f(C2520r... c2520rArr) {
        List<Integer> listM52d;
        WorkDatabase workDatabaseM10613s = this.f51c.m10613s();
        C2631c c2631c = new C2631c(workDatabaseM10613s);
        for (C2520r c2520r : c2520rArr) {
            workDatabaseM10613s.m3542e();
            try {
                C2520r c2520rMo8463k = workDatabaseM10613s.mo4171M().mo8463k(c2520r.f10165a);
                if (c2520rMo8463k == null) {
                    AbstractC3445n.m10501c().mo10508h(f48e, "Skipping scheduling " + c2520r.f10165a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseM10613s.m3539A();
                } else if (c2520rMo8463k.f10166b != C3453v.a.ENQUEUED) {
                    AbstractC3445n.m10501c().mo10508h(f48e, "Skipping scheduling " + c2520r.f10165a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseM10613s.m3539A();
                } else {
                    C2511i c2511iMo8437c = workDatabaseM10613s.mo4168J().mo8437c(c2520r.f10165a);
                    int iM8832d = c2511iMo8437c != null ? c2511iMo8437c.f10143b : c2631c.m8832d(this.f51c.m10608l().m10455h(), this.f51c.m10608l().m10453f());
                    if (c2511iMo8437c == null) {
                        this.f51c.m10613s().mo4168J().mo8435a(new C2511i(c2520r.f10165a, iM8832d));
                    }
                    m59j(c2520r, iM8832d);
                    if (Build.VERSION.SDK_INT == 23 && (listM52d = m52d(this.f49a, this.f50b, c2520r.f10165a)) != null) {
                        int iIndexOf = listM52d.indexOf(Integer.valueOf(iM8832d));
                        if (iIndexOf >= 0) {
                            listM52d.remove(iIndexOf);
                        }
                        m59j(c2520r, !listM52d.isEmpty() ? listM52d.get(0).intValue() : c2631c.m8832d(this.f51c.m10608l().m10455h(), this.f51c.m10608l().m10453f()));
                    }
                    workDatabaseM10613s.m3539A();
                }
                workDatabaseM10613s.m3546i();
            } catch (Throwable th) {
                workDatabaseM10613s.m3546i();
                throw th;
            }
        }
    }

    /* renamed from: j */
    public void m59j(C2520r c2520r, int i4) {
        JobInfo jobInfoM49a = this.f52d.m49a(c2520r, i4);
        AbstractC3445n.m10501c().mo10504a(f48e, String.format("Scheduling work ID %s Job ID %s", c2520r.f10165a, Integer.valueOf(i4)), new Throwable[0]);
        try {
            this.f50b.schedule(jobInfoM49a);
        } catch (IllegalStateException e4) {
            List<JobInfo> listM53g = m53g(this.f49a, this.f50b);
            String str = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listM53g != null ? listM53g.size() : 0), Integer.valueOf(this.f51c.m10613s().mo4171M().mo8471s().size()), Integer.valueOf(this.f51c.m10608l().m10454g()));
            AbstractC3445n.m10501c().mo10505b(f48e, str, new Throwable[0]);
            throw new IllegalStateException(str, e4);
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10505b(f48e, String.format("Unable to schedule %s", c2520r), th);
        }
    }

    public C0008b(Context context, C3494i c3494i, JobScheduler jobScheduler, C0007a c0007a) {
        this.f49a = context;
        this.f51c = c3494i;
        this.f50b = jobScheduler;
        this.f52d = c0007a;
    }
}
