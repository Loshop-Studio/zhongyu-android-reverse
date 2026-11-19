package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C0820e;
import java.util.Collections;
import java.util.List;
import p012b1.C1029d;
import p012b1.InterfaceC1028c;
import p085f1.C2520r;
import p090g1.C2641m;
import p090g1.C2644p;
import p169x0.AbstractC3445n;
import p173y0.InterfaceC3487b;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public class C0819d implements InterfaceC1028c, InterfaceC3487b, C2644p.b {

    /* renamed from: j */
    private static final String f4795j = AbstractC3445n.m10503f("DelayMetCommandHandler");

    /* renamed from: a */
    private final Context f4796a;

    /* renamed from: b */
    private final int f4797b;

    /* renamed from: c */
    private final String f4798c;

    /* renamed from: d */
    private final C0820e f4799d;

    /* renamed from: e */
    private final C1029d f4800e;

    /* renamed from: h */
    private PowerManager.WakeLock f4803h;

    /* renamed from: i */
    private boolean f4804i = false;

    /* renamed from: g */
    private int f4802g = 0;

    /* renamed from: f */
    private final Object f4801f = new Object();

    C0819d(Context context, int i4, String str, C0820e c0820e) {
        this.f4796a = context;
        this.f4797b = i4;
        this.f4799d = c0820e;
        this.f4798c = str;
        this.f4800e = new C1029d(context, c0820e.m4222f(), this);
    }

    /* renamed from: e */
    private void m4210e() {
        synchronized (this.f4801f) {
            this.f4800e.m4794e();
            this.f4799d.m4224h().m8855c(this.f4798c);
            PowerManager.WakeLock wakeLock = this.f4803h;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC3445n.m10501c().mo10504a(f4795j, String.format("Releasing wakelock %s for WorkSpec %s", this.f4803h, this.f4798c), new Throwable[0]);
                this.f4803h.release();
            }
        }
    }

    /* renamed from: g */
    private void m4211g() {
        synchronized (this.f4801f) {
            if (this.f4802g < 2) {
                this.f4802g = 2;
                AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
                String str = f4795j;
                abstractC3445nM10501c.mo10504a(str, String.format("Stopping work for WorkSpec %s", this.f4798c), new Throwable[0]);
                Intent intentM4198g = C0817b.m4198g(this.f4796a, this.f4798c);
                C0820e c0820e = this.f4799d;
                c0820e.m4226k(new C0820e.b(c0820e, intentM4198g, this.f4797b));
                if (this.f4799d.m4221e().m10567g(this.f4798c)) {
                    AbstractC3445n.m10501c().mo10504a(str, String.format("WorkSpec %s needs to be rescheduled", this.f4798c), new Throwable[0]);
                    Intent intentM4197f = C0817b.m4197f(this.f4796a, this.f4798c);
                    C0820e c0820e2 = this.f4799d;
                    c0820e2.m4226k(new C0820e.b(c0820e2, intentM4197f, this.f4797b));
                } else {
                    AbstractC3445n.m10501c().mo10504a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f4798c), new Throwable[0]);
                }
            } else {
                AbstractC3445n.m10501c().mo10504a(f4795j, String.format("Already stopped work for %s", this.f4798c), new Throwable[0]);
            }
        }
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        AbstractC3445n.m10501c().mo10504a(f4795j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z3)), new Throwable[0]);
        m4210e();
        if (z3) {
            Intent intentM4197f = C0817b.m4197f(this.f4796a, this.f4798c);
            C0820e c0820e = this.f4799d;
            c0820e.m4226k(new C0820e.b(c0820e, intentM4197f, this.f4797b));
        }
        if (this.f4804i) {
            Intent intentM4193b = C0817b.m4193b(this.f4796a);
            C0820e c0820e2 = this.f4799d;
            c0820e2.m4226k(new C0820e.b(c0820e2, intentM4193b, this.f4797b));
        }
    }

    @Override // p090g1.C2644p.b
    /* renamed from: b */
    public void mo4212b(String str) {
        AbstractC3445n.m10501c().mo10504a(f4795j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m4211g();
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: c */
    public void mo4213c(List<String> list) {
        m4211g();
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: d */
    public void mo4214d(List<String> list) {
        if (list.contains(this.f4798c)) {
            synchronized (this.f4801f) {
                if (this.f4802g == 0) {
                    this.f4802g = 1;
                    AbstractC3445n.m10501c().mo10504a(f4795j, String.format("onAllConstraintsMet for %s", this.f4798c), new Throwable[0]);
                    if (this.f4799d.m4221e().m10570j(this.f4798c)) {
                        this.f4799d.m4224h().m8854b(this.f4798c, 600000L, this);
                    } else {
                        m4210e();
                    }
                } else {
                    AbstractC3445n.m10501c().mo10504a(f4795j, String.format("Already started work for %s", this.f4798c), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    void m4215f() {
        this.f4803h = C2641m.m8850b(this.f4796a, String.format("%s (%s)", this.f4798c, Integer.valueOf(this.f4797b)));
        AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
        String str = f4795j;
        abstractC3445nM10501c.mo10504a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f4803h, this.f4798c), new Throwable[0]);
        this.f4803h.acquire();
        C2520r c2520rMo8463k = this.f4799d.m4223g().m10613s().mo4171M().mo8463k(this.f4798c);
        if (c2520rMo8463k == null) {
            m4211g();
            return;
        }
        boolean zM8448b = c2520rMo8463k.m8448b();
        this.f4804i = zM8448b;
        if (zM8448b) {
            this.f4800e.m4793d(Collections.singletonList(c2520rMo8463k));
        } else {
            AbstractC3445n.m10501c().mo10504a(str, String.format("No constraints for %s", this.f4798c), new Throwable[0]);
            mo4214d(Collections.singletonList(this.f4798c));
        }
    }
}
