package p177z0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p012b1.C1029d;
import p012b1.InterfaceC1028c;
import p085f1.C2520r;
import p090g1.C2635g;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p169x0.C3433b;
import p169x0.C3453v;
import p173y0.C3494i;
import p173y0.InterfaceC3487b;
import p173y0.InterfaceC3490e;

/* renamed from: z0.b */
/* loaded from: classes.dex */
public class C3507b implements InterfaceC3490e, InterfaceC1028c, InterfaceC3487b {

    /* renamed from: i */
    private static final String f12294i = AbstractC3445n.m10503f("GreedyScheduler");

    /* renamed from: a */
    private final Context f12295a;

    /* renamed from: b */
    private final C3494i f12296b;

    /* renamed from: c */
    private final C1029d f12297c;

    /* renamed from: e */
    private C3506a f12299e;

    /* renamed from: f */
    private boolean f12300f;

    /* renamed from: h */
    Boolean f12302h;

    /* renamed from: d */
    private final Set<C2520r> f12298d = new HashSet();

    /* renamed from: g */
    private final Object f12301g = new Object();

    public C3507b(Context context, C3433b c3433b, InterfaceC2654a interfaceC2654a, C3494i c3494i) {
        this.f12295a = context;
        this.f12296b = c3494i;
        this.f12297c = new C1029d(context, interfaceC2654a, this);
        this.f12299e = new C3506a(this, c3433b.m10457j());
    }

    /* renamed from: g */
    private void m10682g() {
        this.f12302h = Boolean.valueOf(C2635g.m8840b(this.f12295a, this.f12296b.m10608l()));
    }

    /* renamed from: h */
    private void m10683h() {
        if (this.f12300f) {
            return;
        }
        this.f12296b.m10610p().m10565d(this);
        this.f12300f = true;
    }

    /* renamed from: i */
    private void m10684i(String str) {
        synchronized (this.f12301g) {
            Iterator<C2520r> it = this.f12298d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2520r next = it.next();
                if (next.f10165a.equals(str)) {
                    AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f12298d.remove(next);
                    this.f12297c.m4793d(this.f12298d);
                    break;
                }
            }
        }
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        m10684i(str);
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: b */
    public void mo56b(String str) {
        if (this.f12302h == null) {
            m10682g();
        }
        if (!this.f12302h.booleanValue()) {
            AbstractC3445n.m10501c().mo10506d(f12294i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m10683h();
        AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C3506a c3506a = this.f12299e;
        if (c3506a != null) {
            c3506a.m10681b(str);
        }
        this.f12296b.m10603C(str);
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: c */
    public void mo4213c(List<String> list) {
        for (String str : list) {
            AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f12296b.m10603C(str);
        }
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: d */
    public void mo4214d(List<String> list) {
        for (String str : list) {
            AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f12296b.m10619z(str);
        }
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: e */
    public boolean mo57e() {
        return false;
    }

    @Override // p173y0.InterfaceC3490e
    /* renamed from: f */
    public void mo58f(C2520r... c2520rArr) {
        if (this.f12302h == null) {
            m10682g();
        }
        if (!this.f12302h.booleanValue()) {
            AbstractC3445n.m10501c().mo10506d(f12294i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m10683h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C2520r c2520r : c2520rArr) {
            long jM8447a = c2520r.m8447a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c2520r.f10166b == C3453v.a.ENQUEUED) {
                if (jCurrentTimeMillis < jM8447a) {
                    C3506a c3506a = this.f12299e;
                    if (c3506a != null) {
                        c3506a.m10680a(c2520r);
                    }
                } else if (c2520r.m8448b()) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23 && c2520r.f10174j.m10469h()) {
                        AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Ignoring WorkSpec %s, Requires device idle.", c2520r), new Throwable[0]);
                    } else if (i4 < 24 || !c2520r.f10174j.m10466e()) {
                        hashSet.add(c2520r);
                        hashSet2.add(c2520r.f10165a);
                    } else {
                        AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c2520r), new Throwable[0]);
                    }
                } else {
                    AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Starting work for %s", c2520r.f10165a), new Throwable[0]);
                    this.f12296b.m10619z(c2520r.f10165a);
                }
            }
        }
        synchronized (this.f12301g) {
            if (!hashSet.isEmpty()) {
                AbstractC3445n.m10501c().mo10504a(f12294i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f12298d.addAll(hashSet);
                this.f12297c.m4793d(this.f12298d);
            }
        }
    }
}
