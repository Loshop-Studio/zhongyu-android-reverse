package p016b0;

import android.os.SystemClock;
import android.support.v4.media.C0039h;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.RunnableC3416b;
import java.util.ArrayList;
import java.util.Collections;
import p055f0.C5510o;
import p180v0.AbstractC6659f;
import p202y.InterfaceC6758a;
import p202y.InterfaceC6760c;
import p208z.InterfaceC6800e;

/* renamed from: b0.l0 */
/* loaded from: classes2.dex */
public final class C3082l0 implements InterfaceC3075i, InterfaceC3073h {

    /* renamed from: a */
    public final C3077j f1471a;

    /* renamed from: b */
    public final RunnableC3416b f1472b;

    /* renamed from: c */
    public int f1473c;

    /* renamed from: d */
    public C3067e f1474d;

    /* renamed from: e */
    public Object f1475e;

    /* renamed from: f */
    public volatile C5510o f1476f;

    /* renamed from: g */
    public C3069f f1477g;

    public C3082l0(C3077j c3077j, RunnableC3416b runnableC3416b) {
        this.f1471a = c3077j;
        this.f1472b = runnableC3416b;
    }

    @Override // p016b0.InterfaceC3073h
    /* renamed from: a */
    public final void mo2023a(InterfaceC6760c interfaceC6760c, Exception exc, InterfaceC6800e interfaceC6800e, DataSource dataSource) {
        this.f1472b.mo2023a(interfaceC6760c, exc, interfaceC6800e, this.f1476f.f8531c.mo23d());
    }

    @Override // p016b0.InterfaceC3073h
    /* renamed from: b */
    public final void mo2024b(InterfaceC6760c interfaceC6760c, Object obj, InterfaceC6800e interfaceC6800e, DataSource dataSource, InterfaceC6760c interfaceC6760c2) {
        this.f1472b.mo2024b(interfaceC6760c, obj, interfaceC6800e, this.f1476f.f8531c.mo23d(), interfaceC6760c);
    }

    @Override // p016b0.InterfaceC3075i
    public final void cancel() {
        C5510o c5510o = this.f1476f;
        if (c5510o != null) {
            c5510o.f8531c.cancel();
        }
    }

    @Override // p016b0.InterfaceC3075i
    /* renamed from: d */
    public final boolean mo2011d() {
        Object obj = this.f1475e;
        boolean z8 = false;
        if (obj != null) {
            this.f1475e = null;
            int i = AbstractC6659f.f11234b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                InterfaceC6758a interfaceC6758aM2028d = this.f1471a.m2028d(obj);
                C3071g c3071g = new C3071g(interfaceC6758aM2028d, obj, 0, this.f1471a.f1450i);
                InterfaceC6760c interfaceC6760c = this.f1476f.f8529a;
                C3077j c3077j = this.f1471a;
                this.f1477g = new C3069f(interfaceC6760c, c3077j.f1455n);
                c3077j.f1449h.m2053a().mo4794c(this.f1477g, c3071g);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f1477g + ", data: " + obj + ", encoder: " + interfaceC6758aM2028d + ", duration: " + AbstractC6659f.m6315a(jElapsedRealtimeNanos));
                }
                this.f1476f.f8531c.mo21a();
                this.f1474d = new C3067e(Collections.singletonList(this.f1476f.f8529a), this.f1471a, this);
            } catch (Throwable th) {
                this.f1476f.f8531c.mo21a();
                throw th;
            }
        }
        C3067e c3067e = this.f1474d;
        if (c3067e != null && c3067e.mo2011d()) {
            return true;
        }
        this.f1474d = null;
        this.f1476f = null;
        while (!z8 && this.f1473c < this.f1471a.m2026b().size()) {
            ArrayList arrayListM2026b = this.f1471a.m2026b();
            int i8 = this.f1473c;
            this.f1473c = i8 + 1;
            this.f1476f = (C5510o) arrayListM2026b.get(i8);
            if (this.f1476f != null && (this.f1471a.f1457p.mo2050c(this.f1476f.f8531c.mo23d()) || this.f1471a.m2027c(this.f1476f.f8531c.mo22b()) != null)) {
                this.f1476f.f8531c.mo24e(this.f1471a.f1456o, new C0039h(2, this, this.f1476f));
                z8 = true;
            }
        }
        return z8;
    }
}
