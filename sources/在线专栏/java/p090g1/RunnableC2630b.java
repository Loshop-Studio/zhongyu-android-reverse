package p090g1;

import android.text.TextUtils;
import androidx.work.C0810a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;
import p085f1.C2520r;
import p169x0.AbstractC3445n;
import p169x0.C3434c;
import p169x0.InterfaceC3448q;
import p173y0.C3488c;
import p173y0.C3491f;
import p173y0.C3492g;
import p173y0.C3494i;
import p173y0.InterfaceC3490e;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public class RunnableC2630b implements Runnable {

    /* renamed from: c */
    private static final String f10406c = AbstractC3445n.m10503f("EnqueueRunnable");

    /* renamed from: a */
    private final C3492g f10407a;

    /* renamed from: b */
    private final C3488c f10408b = new C3488c();

    public RunnableC2630b(C3492g c3492g) {
        this.f10407a = c3492g;
    }

    /* renamed from: b */
    private static boolean m8820b(C3492g c3492g) {
        boolean zM8821c = m8821c(c3492g.m10586g(), c3492g.m10585f(), (String[]) C3492g.m10579l(c3492g).toArray(new String[0]), c3492g.m10583d(), c3492g.m10581b());
        c3492g.m10589k();
        return zM8821c;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e A[PHI: r1 r9 r12 r13 r14
      0x014e: PHI (r1v1 java.lang.String[]) = (r1v0 java.lang.String[]), (r1v0 java.lang.String[]), (r1v4 java.lang.String[]) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v7 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v4 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v5 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v5 boolean) binds: [B:32:0x006c, B:34:0x007a, B:88:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m8821c(p173y0.C3494i r19, java.util.List<? extends p169x0.AbstractC3456y> r20, java.lang.String[] r21, java.lang.String r22, p169x0.EnumC3439h r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p090g1.RunnableC2630b.m8821c(y0.i, java.util.List, java.lang.String[], java.lang.String, x0.h):boolean");
    }

    /* renamed from: e */
    private static boolean m8822e(C3492g c3492g) {
        List<C3492g> listM10584e = c3492g.m10584e();
        boolean z3 = false;
        if (listM10584e != null) {
            boolean zM8822e = false;
            for (C3492g c3492g2 : listM10584e) {
                if (c3492g2.m10588j()) {
                    AbstractC3445n.m10501c().mo10508h(f10406c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c3492g2.m10582c())), new Throwable[0]);
                } else {
                    zM8822e |= m8822e(c3492g2);
                }
            }
            z3 = zM8822e;
        }
        return m8820b(c3492g) | z3;
    }

    /* renamed from: g */
    private static void m8823g(C2520r c2520r) {
        C3434c c3434c = c2520r.f10174j;
        if (c3434c.m10467f() || c3434c.m10470i()) {
            String str = c2520r.f10167c;
            C0810a.a aVar = new C0810a.a();
            aVar.m4157c(c2520r.f10169e).m4160f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            c2520r.f10167c = ConstraintTrackingWorker.class.getName();
            c2520r.f10169e = aVar.m4155a();
        }
    }

    /* renamed from: h */
    private static boolean m8824h(C3494i c3494i, String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<InterfaceC3490e> it = c3494i.m10612r().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean m8825a() {
        WorkDatabase workDatabaseM10613s = this.f10407a.m10586g().m10613s();
        workDatabaseM10613s.m3542e();
        try {
            boolean zM8822e = m8822e(this.f10407a);
            workDatabaseM10613s.m3539A();
            return zM8822e;
        } finally {
            workDatabaseM10613s.m3546i();
        }
    }

    /* renamed from: d */
    public InterfaceC3448q m8826d() {
        return this.f10408b;
    }

    /* renamed from: f */
    public void m8827f() {
        C3494i c3494iM10586g = this.f10407a.m10586g();
        C3491f.m10576b(c3494iM10586g.m10608l(), c3494iM10586g.m10613s(), c3494iM10586g.m10612r());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f10407a.m10587h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f10407a));
            }
            if (m8825a()) {
                C2633e.m8834a(this.f10407a.m10586g().m10607k(), RescheduleReceiver.class, true);
                m8827f();
            }
            this.f10408b.m10562b(InterfaceC3448q.f12081a);
        } catch (Throwable th) {
            this.f10408b.m10562b(new InterfaceC3448q.b.a(th));
        }
    }
}
