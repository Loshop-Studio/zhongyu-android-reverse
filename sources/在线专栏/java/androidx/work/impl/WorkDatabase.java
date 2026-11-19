package androidx.work.impl;

import android.content.Context;
import androidx.room.AbstractC0621h0;
import androidx.room.C0619g0;
import androidx.work.impl.C0814a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p085f1.InterfaceC2504b;
import p085f1.InterfaceC2507e;
import p085f1.InterfaceC2509g;
import p085f1.InterfaceC2512j;
import p085f1.InterfaceC2515m;
import p085f1.InterfaceC2518p;
import p085f1.InterfaceC2521s;
import p085f1.InterfaceC2524v;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;
import p153t0.C3398c;
import p173y0.C3493h;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC0621h0 {

    /* renamed from: n */
    private static final long f4756n = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C0811a implements InterfaceC3372c.c {

        /* renamed from: a */
        final /* synthetic */ Context f4757a;

        C0811a(Context context) {
            this.f4757a = context;
        }

        @Override // p149s0.InterfaceC3372c.c
        /* renamed from: a */
        public InterfaceC3372c mo3484a(InterfaceC3372c.b bVar) {
            InterfaceC3372c.b.a aVarM10261a = InterfaceC3372c.b.m10261a(this.f4757a);
            aVarM10261a.m10264c(bVar.f11845b).m10263b(bVar.f11846c).m10265d(true);
            return new C3398c().mo3484a(aVarM10261a.m10262a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C0812b extends AbstractC0621h0.b {
        C0812b() {
        }

        @Override // androidx.room.AbstractC0621h0.b
        /* renamed from: c */
        public void mo3568c(InterfaceC3371b interfaceC3371b) {
            super.mo3568c(interfaceC3371b);
            interfaceC3371b.mo3506f();
            try {
                interfaceC3371b.mo3508h(WorkDatabase.m4164G());
                interfaceC3371b.mo3513x();
            } finally {
                interfaceC3371b.mo3505e();
            }
        }
    }

    /* renamed from: C */
    public static WorkDatabase m4161C(Context context, Executor executor, boolean z3) {
        AbstractC0621h0.a aVarM3527a;
        if (z3) {
            aVarM3527a = C0619g0.m3529c(context, WorkDatabase.class).m3561c();
        } else {
            aVarM3527a = C0619g0.m3527a(context, WorkDatabase.class, C3493h.m10593d());
            aVarM3527a.m3564f(new C0811a(context));
        }
        return (WorkDatabase) aVarM3527a.m3565g(executor).m3559a(m4162E()).m3560b(C0814a.f4767a).m3560b(new C0814a.g(context, 2, 3)).m3560b(C0814a.f4768b).m3560b(C0814a.f4769c).m3560b(new C0814a.g(context, 5, 6)).m3560b(C0814a.f4770d).m3560b(C0814a.f4771e).m3560b(C0814a.f4772f).m3560b(new C0814a.h(context)).m3560b(new C0814a.g(context, 10, 11)).m3563e().m3562d();
    }

    /* renamed from: E */
    static AbstractC0621h0.b m4162E() {
        return new C0812b();
    }

    /* renamed from: F */
    static long m4163F() {
        return System.currentTimeMillis() - f4756n;
    }

    /* renamed from: G */
    static String m4164G() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m4163F() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: D */
    public abstract InterfaceC2504b mo4165D();

    /* renamed from: H */
    public abstract InterfaceC2507e mo4166H();

    /* renamed from: I */
    public abstract InterfaceC2509g mo4167I();

    /* renamed from: J */
    public abstract InterfaceC2512j mo4168J();

    /* renamed from: K */
    public abstract InterfaceC2515m mo4169K();

    /* renamed from: L */
    public abstract InterfaceC2518p mo4170L();

    /* renamed from: M */
    public abstract InterfaceC2521s mo4171M();

    /* renamed from: N */
    public abstract InterfaceC2524v mo4172N();
}
