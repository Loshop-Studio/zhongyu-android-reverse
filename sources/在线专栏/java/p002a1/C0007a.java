package p002a1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p169x0.C3434c;
import p169x0.C3435d;
import p169x0.EnumC3432a;
import p169x0.EnumC3446o;

/* renamed from: a1.a */
/* loaded from: classes.dex */
class C0007a {

    /* renamed from: b */
    private static final String f45b = AbstractC3445n.m10503f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f46a;

    /* renamed from: a1.a$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47a;

        static {
            int[] iArr = new int[EnumC3446o.values().length];
            f47a = iArr;
            try {
                iArr[EnumC3446o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47a[EnumC3446o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47a[EnumC3446o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47a[EnumC3446o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47a[EnumC3446o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C0007a(Context context) {
        this.f46a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m47b(C3435d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.m10491a(), aVar.m10492b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m48c(EnumC3446o enumC3446o) {
        int i4 = a.f47a[enumC3446o.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 != 4) {
            if (i4 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC3445n.m10501c().mo10504a(f45b, String.format("API version too low. Cannot convert network type value %s", enumC3446o), new Throwable[0]);
        return 1;
    }

    /* renamed from: a */
    JobInfo m49a(C2520r c2520r, int i4) {
        C3434c c3434c = c2520r.f10174j;
        int iM48c = m48c(c3434c.m10463b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c2520r.f10165a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c2520r.m8450d());
        JobInfo.Builder extras = new JobInfo.Builder(i4, this.f46a).setRequiredNetworkType(iM48c).setRequiresCharging(c3434c.m10468g()).setRequiresDeviceIdle(c3434c.m10469h()).setExtras(persistableBundle);
        if (!c3434c.m10469h()) {
            extras.setBackoffCriteria(c2520r.f10177m, c2520r.f10176l == EnumC3432a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c2520r.m8447a() - System.currentTimeMillis(), 0L);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28 && jMax <= 0) {
            extras.setImportantWhileForeground(true);
        } else {
            extras.setMinimumLatency(jMax);
        }
        if (i5 >= 24 && c3434c.m10466e()) {
            Iterator<C3435d.a> it = c3434c.m10462a().m10489b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m47b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c3434c.m10464c());
            extras.setTriggerContentMaxDelay(c3434c.m10465d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c3434c.m10467f());
            extras.setRequiresStorageNotLow(c3434c.m10470i());
        }
        return extras.build();
    }
}
