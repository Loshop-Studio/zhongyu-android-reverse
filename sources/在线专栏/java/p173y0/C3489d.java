package p173y0;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0332a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0825a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p080e1.InterfaceC2471a;
import p090g1.C2641m;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p169x0.C3433b;
import p169x0.C3440i;
import p173y0.RunnableC3496k;

/* renamed from: y0.d */
/* loaded from: classes.dex */
public class C3489d implements InterfaceC3487b, InterfaceC2471a {

    /* renamed from: l */
    private static final String f12163l = AbstractC3445n.m10503f("Processor");

    /* renamed from: b */
    private Context f12165b;

    /* renamed from: c */
    private C3433b f12166c;

    /* renamed from: d */
    private InterfaceC2654a f12167d;

    /* renamed from: e */
    private WorkDatabase f12168e;

    /* renamed from: h */
    private List<InterfaceC3490e> f12171h;

    /* renamed from: g */
    private Map<String, RunnableC3496k> f12170g = new HashMap();

    /* renamed from: f */
    private Map<String, RunnableC3496k> f12169f = new HashMap();

    /* renamed from: i */
    private Set<String> f12172i = new HashSet();

    /* renamed from: j */
    private final List<InterfaceC3487b> f12173j = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f12164a = null;

    /* renamed from: k */
    private final Object f12174k = new Object();

    /* renamed from: y0.d$a */
    private static class a implements Runnable {

        /* renamed from: a */
        private InterfaceC3487b f12175a;

        /* renamed from: b */
        private String f12176b;

        /* renamed from: c */
        private ListenableFuture<Boolean> f12177c;

        a(InterfaceC3487b interfaceC3487b, String str, ListenableFuture<Boolean> listenableFuture) {
            this.f12175a = interfaceC3487b;
            this.f12176b = str;
            this.f12177c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f12177c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f12175a.mo4206a(this.f12176b, zBooleanValue);
        }
    }

    public C3489d(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, WorkDatabase workDatabase, List<InterfaceC3490e> list) {
        this.f12165b = context;
        this.f12166c = c3433b;
        this.f12167d = interfaceC2654a;
        this.f12168e = workDatabase;
        this.f12171h = list;
    }

    /* renamed from: e */
    private static boolean m10563e(String str, RunnableC3496k runnableC3496k) {
        if (runnableC3496k == null) {
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC3496k.m10633d();
        AbstractC3445n.m10501c().mo10504a(f12163l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* renamed from: m */
    private void m10564m() {
        synchronized (this.f12174k) {
            if (!(!this.f12169f.isEmpty())) {
                try {
                    this.f12165b.startService(C0825a.m4236f(this.f12165b));
                } catch (Throwable th) {
                    AbstractC3445n.m10501c().mo10505b(f12163l, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f12164a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f12164a = null;
                }
            }
        }
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        synchronized (this.f12174k) {
            this.f12170g.remove(str);
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z3)), new Throwable[0]);
            Iterator<InterfaceC3487b> it = this.f12173j.iterator();
            while (it.hasNext()) {
                it.next().mo4206a(str, z3);
            }
        }
    }

    @Override // p080e1.InterfaceC2471a
    /* renamed from: b */
    public void mo8248b(String str) {
        synchronized (this.f12174k) {
            this.f12169f.remove(str);
            m10564m();
        }
    }

    @Override // p080e1.InterfaceC2471a
    /* renamed from: c */
    public void mo8249c(String str, C3440i c3440i) {
        synchronized (this.f12174k) {
            AbstractC3445n.m10501c().mo10506d(f12163l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC3496k runnableC3496kRemove = this.f12170g.remove(str);
            if (runnableC3496kRemove != null) {
                if (this.f12164a == null) {
                    PowerManager.WakeLock wakeLockM8850b = C2641m.m8850b(this.f12165b, "ProcessorForegroundLck");
                    this.f12164a = wakeLockM8850b;
                    wakeLockM8850b.acquire();
                }
                this.f12169f.put(str, runnableC3496kRemove);
                C0332a.m1811i(this.f12165b, C0825a.m4235e(this.f12165b, str, c3440i));
            }
        }
    }

    /* renamed from: d */
    public void m10565d(InterfaceC3487b interfaceC3487b) {
        synchronized (this.f12174k) {
            this.f12173j.add(interfaceC3487b);
        }
    }

    /* renamed from: f */
    public boolean m10566f(String str) {
        boolean zContains;
        synchronized (this.f12174k) {
            zContains = this.f12172i.contains(str);
        }
        return zContains;
    }

    /* renamed from: g */
    public boolean m10567g(String str) {
        boolean z3;
        synchronized (this.f12174k) {
            z3 = this.f12170g.containsKey(str) || this.f12169f.containsKey(str);
        }
        return z3;
    }

    /* renamed from: h */
    public boolean m10568h(String str) {
        boolean zContainsKey;
        synchronized (this.f12174k) {
            zContainsKey = this.f12169f.containsKey(str);
        }
        return zContainsKey;
    }

    /* renamed from: i */
    public void m10569i(InterfaceC3487b interfaceC3487b) {
        synchronized (this.f12174k) {
            this.f12173j.remove(interfaceC3487b);
        }
    }

    /* renamed from: j */
    public boolean m10570j(String str) {
        return m10571k(str, null);
    }

    /* renamed from: k */
    public boolean m10571k(String str, WorkerParameters.C0809a c0809a) {
        synchronized (this.f12174k) {
            if (m10567g(str)) {
                AbstractC3445n.m10501c().mo10504a(f12163l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC3496k runnableC3496kM10636a = new RunnableC3496k.c(this.f12165b, this.f12166c, this.f12167d, this, this.f12168e, str).m10638c(this.f12171h).m10637b(c0809a).m10636a();
            ListenableFuture<Boolean> listenableFutureM10632b = runnableC3496kM10636a.m10632b();
            listenableFutureM10632b.addListener(new a(this, str, listenableFutureM10632b), this.f12167d.mo8913a());
            this.f12170g.put(str, runnableC3496kM10636a);
            this.f12167d.mo8915c().execute(runnableC3496kM10636a);
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean m10572l(String str) {
        boolean zM10563e;
        synchronized (this.f12174k) {
            boolean z3 = true;
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f12172i.add(str);
            RunnableC3496k runnableC3496kRemove = this.f12169f.remove(str);
            if (runnableC3496kRemove == null) {
                z3 = false;
            }
            if (runnableC3496kRemove == null) {
                runnableC3496kRemove = this.f12170g.remove(str);
            }
            zM10563e = m10563e(str, runnableC3496kRemove);
            if (z3) {
                m10564m();
            }
        }
        return zM10563e;
    }

    /* renamed from: n */
    public boolean m10573n(String str) {
        boolean zM10563e;
        synchronized (this.f12174k) {
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zM10563e = m10563e(str, this.f12169f.remove(str));
        }
        return zM10563e;
    }

    /* renamed from: o */
    public boolean m10574o(String str) {
        boolean zM10563e;
        synchronized (this.f12174k) {
            AbstractC3445n.m10501c().mo10504a(f12163l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zM10563e = m10563e(str, this.f12170g.remove(str));
        }
        return zM10563e;
    }
}
