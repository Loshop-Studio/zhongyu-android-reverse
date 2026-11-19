package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p002a1.C0008b;
import p085f1.C2520r;
import p085f1.InterfaceC2518p;
import p085f1.InterfaceC2521s;
import p090g1.C2635g;
import p169x0.AbstractC3445n;
import p169x0.C3453v;
import p169x0.InterfaceC3442k;
import p173y0.C3491f;
import p173y0.C3493h;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: d */
    private static final String f4856d = AbstractC3445n.m10503f("ForceStopRunnable");

    /* renamed from: e */
    private static final long f4857e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    private final Context f4858a;

    /* renamed from: b */
    private final C3494i f4859b;

    /* renamed from: c */
    private int f4860c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f4861a = AbstractC3445n.m10503f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC3445n.m10501c().mo10507g(f4861a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m4246g(context);
        }
    }

    public ForceStopRunnable(Context context, C3494i c3494i) {
        this.f4858a = context.getApplicationContext();
        this.f4859b = c3494i;
    }

    /* renamed from: c */
    static Intent m4244c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m4245d(Context context, int i4) {
        return PendingIntent.getBroadcast(context, -1, m4244c(context), i4);
    }

    /* renamed from: g */
    static void m4246g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentM4245d = m4245d(context, 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4857e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM4245d);
        }
    }

    /* renamed from: a */
    public boolean m4247a() {
        boolean zM55i = Build.VERSION.SDK_INT >= 23 ? C0008b.m55i(this.f4858a, this.f4859b) : false;
        WorkDatabase workDatabaseM10613s = this.f4859b.m10613s();
        InterfaceC2521s interfaceC2521sMo4171M = workDatabaseM10613s.mo4171M();
        InterfaceC2518p interfaceC2518pMo4170L = workDatabaseM10613s.mo4170L();
        workDatabaseM10613s.m3542e();
        try {
            List<C2520r> listMo8454b = interfaceC2521sMo4171M.mo8454b();
            boolean z3 = (listMo8454b == null || listMo8454b.isEmpty()) ? false : true;
            if (z3) {
                for (C2520r c2520r : listMo8454b) {
                    interfaceC2521sMo4171M.mo8459g(C3453v.a.ENQUEUED, c2520r.f10165a);
                    interfaceC2521sMo4171M.mo8456d(c2520r.f10165a, -1L);
                }
            }
            interfaceC2518pMo4170L.mo8445c();
            workDatabaseM10613s.m3539A();
            return z3 || zM55i;
        } finally {
            workDatabaseM10613s.m3546i();
        }
    }

    /* renamed from: b */
    public void m4248b() {
        boolean zM4247a = m4247a();
        if (m4251h()) {
            AbstractC3445n.m10501c().mo10504a(f4856d, "Rescheduling Workers.", new Throwable[0]);
            this.f4859b.m10617x();
            this.f4859b.m10609o().m8838d(false);
        } else if (m4249e()) {
            AbstractC3445n.m10501c().mo10504a(f4856d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4859b.m10617x();
        } else if (zM4247a) {
            AbstractC3445n.m10501c().mo10504a(f4856d, "Found unfinished work, scheduling it.", new Throwable[0]);
            C3491f.m10576b(this.f4859b.m10608l(), this.f4859b.m10613s(), this.f4859b.m10612r());
        }
        this.f4859b.m10616w();
    }

    /* renamed from: e */
    public boolean m4249e() {
        if (m4245d(this.f4858a, 536870912) != null) {
            return false;
        }
        m4246g(this.f4858a);
        return true;
    }

    /* renamed from: f */
    public boolean m4250f() {
        if (this.f4859b.m10611q() == null) {
            return true;
        }
        AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
        String str = f4856d;
        abstractC3445nM10501c.mo10504a(str, "Found a remote implementation for WorkManager", new Throwable[0]);
        boolean zM8840b = C2635g.m8840b(this.f4858a, this.f4859b.m10608l());
        AbstractC3445n.m10501c().mo10504a(str, String.format("Is default app process = %s", Boolean.valueOf(zM8840b)), new Throwable[0]);
        return zM8840b;
    }

    /* renamed from: h */
    boolean m4251h() {
        return this.f4859b.m10609o().m8836a();
    }

    /* renamed from: i */
    public void m4252i(long j4) throws InterruptedException {
        try {
            Thread.sleep(j4);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        int i4;
        if (!m4250f()) {
            return;
        }
        while (true) {
            C3493h.m10594e(this.f4858a);
            AbstractC3445n.m10501c().mo10504a(f4856d, "Performing cleanup operations.", new Throwable[0]);
            try {
                m4248b();
                return;
            } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                i4 = this.f4860c + 1;
                this.f4860c = i4;
                if (i4 >= 3) {
                    AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
                    String str = f4856d;
                    abstractC3445nM10501c.mo10505b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                    IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                    InterfaceC3442k interfaceC3442kM10450c = this.f4859b.m10608l().m10450c();
                    if (interfaceC3442kM10450c == null) {
                        throw illegalStateException;
                    }
                    AbstractC3445n.m10501c().mo10504a(str, "Routing exception to the specified exception handler", illegalStateException);
                    interfaceC3442kM10450c.m10496a(illegalStateException);
                    return;
                }
                AbstractC3445n.m10501c().mo10504a(f4856d, String.format("Retrying after %s", Long.valueOf(i4 * 300)), e4);
                m4252i(this.f4860c * 300);
            }
            AbstractC3445n.m10501c().mo10504a(f4856d, String.format("Retrying after %s", Long.valueOf(i4 * 300)), e4);
            m4252i(this.f4860c * 300);
        }
    }
}
