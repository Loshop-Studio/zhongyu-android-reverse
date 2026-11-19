package p090g1;

import androidx.work.impl.WorkDatabase;
import p085f1.InterfaceC2521s;
import p169x0.AbstractC3445n;
import p169x0.C3453v;
import p173y0.C3489d;
import p173y0.C3494i;

/* renamed from: g1.l */
/* loaded from: classes.dex */
public class RunnableC2640l implements Runnable {

    /* renamed from: d */
    private static final String f10432d = AbstractC3445n.m10503f("StopWorkRunnable");

    /* renamed from: a */
    private final C3494i f10433a;

    /* renamed from: b */
    private final String f10434b;

    /* renamed from: c */
    private final boolean f10435c;

    public RunnableC2640l(C3494i c3494i, String str, boolean z3) {
        this.f10433a = c3494i;
        this.f10434b = str;
        this.f10435c = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM10574o;
        WorkDatabase workDatabaseM10613s = this.f10433a.m10613s();
        C3489d c3489dM10610p = this.f10433a.m10610p();
        InterfaceC2521s interfaceC2521sMo4171M = workDatabaseM10613s.mo4171M();
        workDatabaseM10613s.m3542e();
        try {
            boolean zM10568h = c3489dM10610p.m10568h(this.f10434b);
            if (this.f10435c) {
                zM10574o = this.f10433a.m10610p().m10573n(this.f10434b);
            } else {
                if (!zM10568h && interfaceC2521sMo4171M.mo8461i(this.f10434b) == C3453v.a.RUNNING) {
                    interfaceC2521sMo4171M.mo8459g(C3453v.a.ENQUEUED, this.f10434b);
                }
                zM10574o = this.f10433a.m10610p().m10574o(this.f10434b);
            }
            AbstractC3445n.m10501c().mo10504a(f10432d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f10434b, Boolean.valueOf(zM10574o)), new Throwable[0]);
            workDatabaseM10613s.m3539A();
        } finally {
            workDatabaseM10613s.m3546i();
        }
    }
}
