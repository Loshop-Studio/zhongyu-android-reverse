package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p090g1.C2641m;
import p090g1.C2644p;
import p090g1.ExecutorC2637i;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p173y0.C3489d;
import p173y0.C3494i;
import p173y0.InterfaceC3487b;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* loaded from: classes.dex */
public class C0820e implements InterfaceC3487b {

    /* renamed from: k */
    static final String f4805k = AbstractC3445n.m10503f("SystemAlarmDispatcher");

    /* renamed from: a */
    final Context f4806a;

    /* renamed from: b */
    private final InterfaceC2654a f4807b;

    /* renamed from: c */
    private final C2644p f4808c;

    /* renamed from: d */
    private final C3489d f4809d;

    /* renamed from: e */
    private final C3494i f4810e;

    /* renamed from: f */
    final C0817b f4811f;

    /* renamed from: g */
    private final Handler f4812g;

    /* renamed from: h */
    final List<Intent> f4813h;

    /* renamed from: i */
    Intent f4814i;

    /* renamed from: j */
    private c f4815j;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0820e c0820e;
            d dVar;
            synchronized (C0820e.this.f4813h) {
                C0820e c0820e2 = C0820e.this;
                c0820e2.f4814i = c0820e2.f4813h.get(0);
            }
            Intent intent = C0820e.this.f4814i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0820e.this.f4814i.getIntExtra("KEY_START_ID", 0);
                AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
                String str = C0820e.f4805k;
                abstractC3445nM10501c.mo10504a(str, String.format("Processing command %s, %s", C0820e.this.f4814i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockM8850b = C2641m.m8850b(C0820e.this.f4806a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC3445n.m10501c().mo10504a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockM8850b), new Throwable[0]);
                    wakeLockM8850b.acquire();
                    C0820e c0820e3 = C0820e.this;
                    c0820e3.f4811f.m4208p(c0820e3.f4814i, intExtra, c0820e3);
                    AbstractC3445n.m10501c().mo10504a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM8850b), new Throwable[0]);
                    wakeLockM8850b.release();
                    c0820e = C0820e.this;
                    dVar = new d(c0820e);
                } catch (Throwable th) {
                    try {
                        AbstractC3445n abstractC3445nM10501c2 = AbstractC3445n.m10501c();
                        String str2 = C0820e.f4805k;
                        abstractC3445nM10501c2.mo10505b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC3445n.m10501c().mo10504a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM8850b), new Throwable[0]);
                        wakeLockM8850b.release();
                        c0820e = C0820e.this;
                        dVar = new d(c0820e);
                    } catch (Throwable th2) {
                        AbstractC3445n.m10501c().mo10504a(C0820e.f4805k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM8850b), new Throwable[0]);
                        wakeLockM8850b.release();
                        C0820e c0820e4 = C0820e.this;
                        c0820e4.m4226k(new d(c0820e4));
                        throw th2;
                    }
                }
                c0820e.m4226k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    static class b implements Runnable {

        /* renamed from: a */
        private final C0820e f4817a;

        /* renamed from: b */
        private final Intent f4818b;

        /* renamed from: c */
        private final int f4819c;

        b(C0820e c0820e, Intent intent, int i4) {
            this.f4817a = c0820e;
            this.f4818b = intent;
            this.f4819c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4817a.m4219b(this.f4818b, this.f4819c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    interface c {
        /* renamed from: a */
        void mo4188a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    static class d implements Runnable {

        /* renamed from: a */
        private final C0820e f4820a;

        d(C0820e c0820e) {
            this.f4820a = c0820e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4820a.m4220d();
        }
    }

    C0820e(Context context) {
        this(context, null, null);
    }

    /* renamed from: c */
    private void m4216c() {
        if (this.f4812g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m4217i(String str) {
        m4216c();
        synchronized (this.f4813h) {
            Iterator<Intent> it = this.f4813h.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m4218l() {
        m4216c();
        PowerManager.WakeLock wakeLockM8850b = C2641m.m8850b(this.f4806a, "ProcessCommand");
        try {
            wakeLockM8850b.acquire();
            this.f4810e.m10615u().mo8914b(new a());
        } finally {
            wakeLockM8850b.release();
        }
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        m4226k(new b(this, C0817b.m4195d(this.f4806a, str, z3), 0));
    }

    /* renamed from: b */
    public boolean m4219b(Intent intent, int i4) {
        AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
        String str = f4805k;
        abstractC3445nM10501c.mo10504a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i4)), new Throwable[0]);
        m4216c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC3445n.m10501c().mo10508h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4217i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i4);
        synchronized (this.f4813h) {
            boolean z3 = this.f4813h.isEmpty() ? false : true;
            this.f4813h.add(intent);
            if (!z3) {
                m4218l();
            }
        }
        return true;
    }

    /* renamed from: d */
    void m4220d() {
        AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
        String str = f4805k;
        abstractC3445nM10501c.mo10504a(str, "Checking if commands are complete.", new Throwable[0]);
        m4216c();
        synchronized (this.f4813h) {
            if (this.f4814i != null) {
                AbstractC3445n.m10501c().mo10504a(str, String.format("Removing command %s", this.f4814i), new Throwable[0]);
                if (!this.f4813h.remove(0).equals(this.f4814i)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f4814i = null;
            }
            ExecutorC2637i executorC2637iMo8915c = this.f4807b.mo8915c();
            if (!this.f4811f.m4207o() && this.f4813h.isEmpty() && !executorC2637iMo8915c.m8843a()) {
                AbstractC3445n.m10501c().mo10504a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f4815j;
                if (cVar != null) {
                    cVar.mo4188a();
                }
            } else if (!this.f4813h.isEmpty()) {
                m4218l();
            }
        }
    }

    /* renamed from: e */
    C3489d m4221e() {
        return this.f4809d;
    }

    /* renamed from: f */
    InterfaceC2654a m4222f() {
        return this.f4807b;
    }

    /* renamed from: g */
    C3494i m4223g() {
        return this.f4810e;
    }

    /* renamed from: h */
    C2644p m4224h() {
        return this.f4808c;
    }

    /* renamed from: j */
    void m4225j() {
        AbstractC3445n.m10501c().mo10504a(f4805k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4809d.m10569i(this);
        this.f4808c.m8853a();
        this.f4815j = null;
    }

    /* renamed from: k */
    void m4226k(Runnable runnable) {
        this.f4812g.post(runnable);
    }

    /* renamed from: m */
    void m4227m(c cVar) {
        if (this.f4815j != null) {
            AbstractC3445n.m10501c().mo10505b(f4805k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4815j = cVar;
        }
    }

    C0820e(Context context, C3489d c3489d, C3494i c3494i) {
        Context applicationContext = context.getApplicationContext();
        this.f4806a = applicationContext;
        this.f4811f = new C0817b(applicationContext);
        this.f4808c = new C2644p();
        c3494i = c3494i == null ? C3494i.m10599n(context) : c3494i;
        this.f4810e = c3494i;
        c3489d = c3489d == null ? c3494i.m10610p() : c3489d;
        this.f4809d = c3489d;
        this.f4807b = c3494i.m10615u();
        c3489d.m10565d(this);
        this.f4813h = new ArrayList();
        this.f4814i = null;
        this.f4812g = new Handler(Looper.getMainLooper());
    }
}
