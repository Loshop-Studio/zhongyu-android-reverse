package p173y0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C0810a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p080e1.InterfaceC2471a;
import p085f1.C2520r;
import p085f1.InterfaceC2504b;
import p085f1.InterfaceC2521s;
import p085f1.InterfaceC2524v;
import p090g1.C2633e;
import p090g1.C2642n;
import p090g1.C2643o;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3443l;
import p169x0.AbstractC3445n;
import p169x0.C3433b;
import p169x0.C3453v;

/* renamed from: y0.k */
/* loaded from: classes.dex */
public class RunnableC3496k implements Runnable {

    /* renamed from: t */
    static final String f12206t = AbstractC3445n.m10503f("WorkerWrapper");

    /* renamed from: a */
    Context f12207a;

    /* renamed from: b */
    private String f12208b;

    /* renamed from: c */
    private List<InterfaceC3490e> f12209c;

    /* renamed from: d */
    private WorkerParameters.C0809a f12210d;

    /* renamed from: e */
    C2520r f12211e;

    /* renamed from: f */
    ListenableWorker f12212f;

    /* renamed from: h */
    private C3433b f12214h;

    /* renamed from: i */
    private InterfaceC2654a f12215i;

    /* renamed from: j */
    private InterfaceC2471a f12216j;

    /* renamed from: k */
    private WorkDatabase f12217k;

    /* renamed from: l */
    private InterfaceC2521s f12218l;

    /* renamed from: m */
    private InterfaceC2504b f12219m;

    /* renamed from: n */
    private InterfaceC2524v f12220n;

    /* renamed from: o */
    private List<String> f12221o;

    /* renamed from: p */
    private String f12222p;

    /* renamed from: s */
    private volatile boolean f12225s;

    /* renamed from: g */
    ListenableWorker.AbstractC0807a f12213g = ListenableWorker.AbstractC0807a.m4122a();

    /* renamed from: q */
    C0829d<Boolean> f12223q = C0829d.m4279s();

    /* renamed from: r */
    ListenableFuture<ListenableWorker.AbstractC0807a> f12224r = null;

    /* renamed from: y0.k$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0829d f12226a;

        a(C0829d c0829d) {
            this.f12226a = c0829d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC3445n.m10501c().mo10504a(RunnableC3496k.f12206t, String.format("Starting work for %s", RunnableC3496k.this.f12211e.f10167c), new Throwable[0]);
                RunnableC3496k runnableC3496k = RunnableC3496k.this;
                runnableC3496k.f12224r = runnableC3496k.f12212f.startWork();
                this.f12226a.mo4270q(RunnableC3496k.this.f12224r);
            } catch (Throwable th) {
                this.f12226a.mo4269p(th);
            }
        }
    }

    /* renamed from: y0.k$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0829d f12228a;

        /* renamed from: b */
        final /* synthetic */ String f12229b;

        b(C0829d c0829d, String str) {
            this.f12228a = c0829d;
            this.f12229b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC0807a abstractC0807a = (ListenableWorker.AbstractC0807a) this.f12228a.get();
                    if (abstractC0807a == null) {
                        AbstractC3445n.m10501c().mo10505b(RunnableC3496k.f12206t, String.format("%s returned a null result. Treating it as a failure.", RunnableC3496k.this.f12211e.f10167c), new Throwable[0]);
                    } else {
                        AbstractC3445n.m10501c().mo10504a(RunnableC3496k.f12206t, String.format("%s returned a %s result.", RunnableC3496k.this.f12211e.f10167c, abstractC0807a), new Throwable[0]);
                        RunnableC3496k.this.f12213g = abstractC0807a;
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    AbstractC3445n.m10501c().mo10505b(RunnableC3496k.f12206t, String.format("%s failed because it threw an exception/error", this.f12229b), e);
                } catch (CancellationException e5) {
                    AbstractC3445n.m10501c().mo10506d(RunnableC3496k.f12206t, String.format("%s was cancelled", this.f12229b), e5);
                } catch (ExecutionException e6) {
                    e = e6;
                    AbstractC3445n.m10501c().mo10505b(RunnableC3496k.f12206t, String.format("%s failed because it threw an exception/error", this.f12229b), e);
                }
            } finally {
                RunnableC3496k.this.m10634f();
            }
        }
    }

    /* renamed from: y0.k$c */
    public static class c {

        /* renamed from: a */
        Context f12231a;

        /* renamed from: b */
        ListenableWorker f12232b;

        /* renamed from: c */
        InterfaceC2471a f12233c;

        /* renamed from: d */
        InterfaceC2654a f12234d;

        /* renamed from: e */
        C3433b f12235e;

        /* renamed from: f */
        WorkDatabase f12236f;

        /* renamed from: g */
        String f12237g;

        /* renamed from: h */
        List<InterfaceC3490e> f12238h;

        /* renamed from: i */
        WorkerParameters.C0809a f12239i = new WorkerParameters.C0809a();

        public c(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, InterfaceC2471a interfaceC2471a, WorkDatabase workDatabase, String str) {
            this.f12231a = context.getApplicationContext();
            this.f12234d = interfaceC2654a;
            this.f12233c = interfaceC2471a;
            this.f12235e = c3433b;
            this.f12236f = workDatabase;
            this.f12237g = str;
        }

        /* renamed from: a */
        public RunnableC3496k m10636a() {
            return new RunnableC3496k(this);
        }

        /* renamed from: b */
        public c m10637b(WorkerParameters.C0809a c0809a) {
            if (c0809a != null) {
                this.f12239i = c0809a;
            }
            return this;
        }

        /* renamed from: c */
        public c m10638c(List<InterfaceC3490e> list) {
            this.f12238h = list;
            return this;
        }
    }

    RunnableC3496k(c cVar) {
        this.f12207a = cVar.f12231a;
        this.f12215i = cVar.f12234d;
        this.f12216j = cVar.f12233c;
        this.f12208b = cVar.f12237g;
        this.f12209c = cVar.f12238h;
        this.f12210d = cVar.f12239i;
        this.f12212f = cVar.f12232b;
        this.f12214h = cVar.f12235e;
        WorkDatabase workDatabase = cVar.f12236f;
        this.f12217k = workDatabase;
        this.f12218l = workDatabase.mo4171M();
        this.f12219m = this.f12217k.mo4165D();
        this.f12220n = this.f12217k.mo4172N();
    }

    /* renamed from: a */
    private String m10621a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f12208b);
        sb.append(", tags={ ");
        boolean z3 = true;
        for (String str : list) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m10622c(ListenableWorker.AbstractC0807a abstractC0807a) {
        if (abstractC0807a instanceof ListenableWorker.AbstractC0807a.c) {
            AbstractC3445n.m10501c().mo10506d(f12206t, String.format("Worker result SUCCESS for %s", this.f12222p), new Throwable[0]);
            if (this.f12211e.m8450d()) {
                m10625h();
                return;
            } else {
                m10629m();
                return;
            }
        }
        if (abstractC0807a instanceof ListenableWorker.AbstractC0807a.b) {
            AbstractC3445n.m10501c().mo10506d(f12206t, String.format("Worker result RETRY for %s", this.f12222p), new Throwable[0]);
            m10624g();
            return;
        }
        AbstractC3445n.m10501c().mo10506d(f12206t, String.format("Worker result FAILURE for %s", this.f12222p), new Throwable[0]);
        if (this.f12211e.m8450d()) {
            m10625h();
        } else {
            m10635l();
        }
    }

    /* renamed from: e */
    private void m10623e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f12218l.mo8461i(str2) != C3453v.a.CANCELLED) {
                this.f12218l.mo8459g(C3453v.a.FAILED, str2);
            }
            linkedList.addAll(this.f12219m.mo8427d(str2));
        }
    }

    /* renamed from: g */
    private void m10624g() {
        this.f12217k.m3542e();
        try {
            this.f12218l.mo8459g(C3453v.a.ENQUEUED, this.f12208b);
            this.f12218l.mo8470r(this.f12208b, System.currentTimeMillis());
            this.f12218l.mo8456d(this.f12208b, -1L);
            this.f12217k.m3539A();
        } finally {
            this.f12217k.m3546i();
            m10626i(true);
        }
    }

    /* renamed from: h */
    private void m10625h() {
        this.f12217k.m3542e();
        try {
            this.f12218l.mo8470r(this.f12208b, System.currentTimeMillis());
            this.f12218l.mo8459g(C3453v.a.ENQUEUED, this.f12208b);
            this.f12218l.mo8464l(this.f12208b);
            this.f12218l.mo8456d(this.f12208b, -1L);
            this.f12217k.m3539A();
        } finally {
            this.f12217k.m3546i();
            m10626i(false);
        }
    }

    /* renamed from: i */
    private void m10626i(boolean z3) {
        ListenableWorker listenableWorker;
        this.f12217k.m3542e();
        try {
            List<String> listMo8455c = this.f12217k.mo4171M().mo8455c();
            if (listMo8455c == null || listMo8455c.isEmpty()) {
                C2633e.m8834a(this.f12207a, RescheduleReceiver.class, false);
            }
            if (z3) {
                this.f12218l.mo8459g(C3453v.a.ENQUEUED, this.f12208b);
                this.f12218l.mo8456d(this.f12208b, -1L);
            }
            if (this.f12211e != null && (listenableWorker = this.f12212f) != null && listenableWorker.isRunInForeground()) {
                this.f12216j.mo8248b(this.f12208b);
            }
            this.f12217k.m3539A();
            this.f12217k.m3546i();
            this.f12223q.mo4268o(Boolean.valueOf(z3));
        } catch (Throwable th) {
            this.f12217k.m3546i();
            throw th;
        }
    }

    /* renamed from: j */
    private void m10627j() {
        C3453v.a aVarMo8461i = this.f12218l.mo8461i(this.f12208b);
        if (aVarMo8461i == C3453v.a.RUNNING) {
            AbstractC3445n.m10501c().mo10504a(f12206t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f12208b), new Throwable[0]);
            m10626i(true);
        } else {
            AbstractC3445n.m10501c().mo10504a(f12206t, String.format("Status for %s is %s; not doing any work", this.f12208b, aVarMo8461i), new Throwable[0]);
            m10626i(false);
        }
    }

    /* renamed from: k */
    private void m10628k() {
        C0810a c0810aMo4121b;
        if (m10630n()) {
            return;
        }
        this.f12217k.m3542e();
        try {
            C2520r c2520rMo8463k = this.f12218l.mo8463k(this.f12208b);
            this.f12211e = c2520rMo8463k;
            if (c2520rMo8463k == null) {
                AbstractC3445n.m10501c().mo10505b(f12206t, String.format("Didn't find WorkSpec for id %s", this.f12208b), new Throwable[0]);
                m10626i(false);
                this.f12217k.m3539A();
                return;
            }
            if (c2520rMo8463k.f10166b != C3453v.a.ENQUEUED) {
                m10627j();
                this.f12217k.m3539A();
                AbstractC3445n.m10501c().mo10504a(f12206t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f12211e.f10167c), new Throwable[0]);
                return;
            }
            if (c2520rMo8463k.m8450d() || this.f12211e.m8449c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2520r c2520r = this.f12211e;
                if (!(c2520r.f10178n == 0) && jCurrentTimeMillis < c2520r.m8447a()) {
                    AbstractC3445n.m10501c().mo10504a(f12206t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f12211e.f10167c), new Throwable[0]);
                    m10626i(true);
                    this.f12217k.m3539A();
                    return;
                }
            }
            this.f12217k.m3539A();
            this.f12217k.m3546i();
            if (this.f12211e.m8450d()) {
                c0810aMo4121b = this.f12211e.f10169e;
            } else {
                AbstractC3443l abstractC3443lM10500b = this.f12214h.m10452e().m10500b(this.f12211e.f10168d);
                if (abstractC3443lM10500b == null) {
                    AbstractC3445n.m10501c().mo10505b(f12206t, String.format("Could not create Input Merger %s", this.f12211e.f10168d), new Throwable[0]);
                    m10635l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f12211e.f10169e);
                    arrayList.addAll(this.f12218l.mo8468p(this.f12208b));
                    c0810aMo4121b = abstractC3443lM10500b.mo4121b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f12208b), c0810aMo4121b, this.f12221o, this.f12210d, this.f12211e.f10175k, this.f12214h.m10451d(), this.f12215i, this.f12214h.m10459l(), new C2643o(this.f12217k, this.f12215i), new C2642n(this.f12217k, this.f12216j, this.f12215i));
            if (this.f12212f == null) {
                this.f12212f = this.f12214h.m10459l().m10551b(this.f12207a, this.f12211e.f10167c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f12212f;
            if (listenableWorker == null) {
                AbstractC3445n.m10501c().mo10505b(f12206t, String.format("Could not create Worker %s", this.f12211e.f10167c), new Throwable[0]);
                m10635l();
                return;
            }
            if (listenableWorker.isUsed()) {
                AbstractC3445n.m10501c().mo10505b(f12206t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f12211e.f10167c), new Throwable[0]);
                m10635l();
                return;
            }
            this.f12212f.setUsed();
            if (!m10631o()) {
                m10627j();
            } else {
                if (m10630n()) {
                    return;
                }
                C0829d c0829dM4279s = C0829d.m4279s();
                this.f12215i.mo8913a().execute(new a(c0829dM4279s));
                c0829dM4279s.addListener(new b(c0829dM4279s, this.f12222p), this.f12215i.mo8915c());
            }
        } finally {
            this.f12217k.m3546i();
        }
    }

    /* renamed from: m */
    private void m10629m() {
        this.f12217k.m3542e();
        try {
            this.f12218l.mo8459g(C3453v.a.SUCCEEDED, this.f12208b);
            this.f12218l.mo8473u(this.f12208b, ((ListenableWorker.AbstractC0807a.c) this.f12213g).m4128f());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f12219m.mo8427d(this.f12208b)) {
                if (this.f12218l.mo8461i(str) == C3453v.a.BLOCKED && this.f12219m.mo8424a(str)) {
                    AbstractC3445n.m10501c().mo10506d(f12206t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f12218l.mo8459g(C3453v.a.ENQUEUED, str);
                    this.f12218l.mo8470r(str, jCurrentTimeMillis);
                }
            }
            this.f12217k.m3539A();
        } finally {
            this.f12217k.m3546i();
            m10626i(false);
        }
    }

    /* renamed from: n */
    private boolean m10630n() {
        if (!this.f12225s) {
            return false;
        }
        AbstractC3445n.m10501c().mo10504a(f12206t, String.format("Work interrupted for %s", this.f12222p), new Throwable[0]);
        if (this.f12218l.mo8461i(this.f12208b) == null) {
            m10626i(false);
        } else {
            m10626i(!r0.m10524a());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m10631o() {
        this.f12217k.m3542e();
        try {
            boolean z3 = true;
            if (this.f12218l.mo8461i(this.f12208b) == C3453v.a.ENQUEUED) {
                this.f12218l.mo8459g(C3453v.a.RUNNING, this.f12208b);
                this.f12218l.mo8469q(this.f12208b);
            } else {
                z3 = false;
            }
            this.f12217k.m3539A();
            return z3;
        } finally {
            this.f12217k.m3546i();
        }
    }

    /* renamed from: b */
    public ListenableFuture<Boolean> m10632b() {
        return this.f12223q;
    }

    /* renamed from: d */
    public void m10633d() {
        boolean zIsDone;
        this.f12225s = true;
        m10630n();
        ListenableFuture<ListenableWorker.AbstractC0807a> listenableFuture = this.f12224r;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            this.f12224r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f12212f;
        if (listenableWorker == null || zIsDone) {
            AbstractC3445n.m10501c().mo10504a(f12206t, String.format("WorkSpec %s is already done. Not interrupting.", this.f12211e), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    /* renamed from: f */
    void m10634f() {
        if (!m10630n()) {
            this.f12217k.m3542e();
            try {
                C3453v.a aVarMo8461i = this.f12218l.mo8461i(this.f12208b);
                this.f12217k.mo4170L().mo8443a(this.f12208b);
                if (aVarMo8461i == null) {
                    m10626i(false);
                } else if (aVarMo8461i == C3453v.a.RUNNING) {
                    m10622c(this.f12213g);
                } else if (!aVarMo8461i.m10524a()) {
                    m10624g();
                }
                this.f12217k.m3539A();
            } finally {
                this.f12217k.m3546i();
            }
        }
        List<InterfaceC3490e> list = this.f12209c;
        if (list != null) {
            Iterator<InterfaceC3490e> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo56b(this.f12208b);
            }
            C3491f.m10576b(this.f12214h, this.f12217k, this.f12209c);
        }
    }

    /* renamed from: l */
    void m10635l() {
        this.f12217k.m3542e();
        try {
            m10623e(this.f12208b);
            this.f12218l.mo8473u(this.f12208b, ((ListenableWorker.AbstractC0807a.a) this.f12213g).m4127f());
            this.f12217k.m3539A();
        } finally {
            this.f12217k.m3546i();
            m10626i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listMo8483b = this.f12220n.mo8483b(this.f12208b);
        this.f12221o = listMo8483b;
        this.f12222p = m10621a(listMo8483b);
        m10628k();
    }
}
