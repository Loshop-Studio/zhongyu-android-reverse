package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.engine.InterfaceC4712c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p016b1.AbstractC4404f;
import p053f0.InterfaceC6282a;
import p053f0.InterfaceC6283b;
import p067h0.AbstractC6433c;
import p067h0.C6431a;
import p067h0.C6432b;
import p081j0.InterfaceC6573a;
import p097l0.InterfaceC7280n;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
public class C4720k implements InterfaceC4712c, InterfaceC4712c.a {

    /* renamed from: a */
    public final C4713d f2501a;

    /* renamed from: b */
    public final InterfaceC4712c.a f2502b;

    /* renamed from: c */
    public volatile int f2503c;

    /* renamed from: d */
    public volatile C4711b f2504d;

    /* renamed from: e */
    public volatile Object f2505e;

    /* renamed from: f */
    public volatile InterfaceC7280n.a f2506f;

    /* renamed from: g */
    public volatile C6431a f2507g;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC4692d.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC7280n.a f2508a;

        public a(InterfaceC7280n.a aVar) {
            this.f2508a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
        /* renamed from: c */
        public void mo2593c(Exception exc) {
            if (C4720k.this.m2759g(this.f2508a)) {
                C4720k.this.m2761i(this.f2508a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
        /* renamed from: f */
        public void mo2594f(Object obj) {
            if (C4720k.this.m2759g(this.f2508a)) {
                C4720k.this.m2760h(this.f2508a, obj);
            }
        }
    }

    public C4720k(C4713d c4713d, InterfaceC4712c.a aVar) {
        this.f2501a = c4713d;
        this.f2502b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: a */
    public void mo2621a(InterfaceC6283b interfaceC6283b, Object obj, InterfaceC4692d interfaceC4692d, DataSource dataSource, InterfaceC6283b interfaceC6283b2) {
        this.f2502b.mo2621a(interfaceC6283b, obj, interfaceC4692d, this.f2506f.f9232c.mo2587d(), interfaceC6283b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: b */
    public void mo2622b(InterfaceC6283b interfaceC6283b, Exception exc, InterfaceC4692d interfaceC4692d, DataSource dataSource) {
        this.f2502b.mo2622b(interfaceC6283b, exc, interfaceC4692d, this.f2506f.f9232c.mo2587d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c.a
    /* renamed from: c */
    public void mo2623c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    public void cancel() {
        InterfaceC7280n.a aVar = this.f2506f;
        if (aVar != null) {
            aVar.f9232c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    /* renamed from: d */
    public boolean mo2682d() {
        if (this.f2505e != null) {
            Object obj = this.f2505e;
            this.f2505e = null;
            try {
                if (!m2757e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f2504d != null && this.f2504d.mo2682d()) {
            return true;
        }
        this.f2504d = null;
        this.f2506f = null;
        boolean z6 = false;
        while (!z6 && m2758f()) {
            List listM2689g = this.f2501a.m2689g();
            int i6 = this.f2503c;
            this.f2503c = i6 + 1;
            this.f2506f = (InterfaceC7280n.a) listM2689g.get(i6);
            if (this.f2506f != null && (this.f2501a.m2687e().mo7042c(this.f2506f.f9232c.mo2587d()) || this.f2501a.m2703u(this.f2506f.f9232c.mo2580a()))) {
                m2762j(this.f2506f);
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: e */
    public final boolean m2757e(Object obj) throws Throwable {
        Throwable th;
        long jM1422b = AbstractC4404f.m1422b();
        boolean z6 = false;
        try {
            InterfaceC4693e interfaceC4693eM2697o = this.f2501a.m2697o(obj);
            Object objMo2574a = interfaceC4693eM2697o.mo2574a();
            InterfaceC6282a interfaceC6282aM2699q = this.f2501a.m2699q(objMo2574a);
            C6432b c6432b = new C6432b(interfaceC6282aM2699q, objMo2574a, this.f2501a.m2693k());
            C6431a c6431a = new C6431a(this.f2506f.f9230a, this.f2501a.m2698p());
            InterfaceC6573a interfaceC6573aM2686d = this.f2501a.m2686d();
            interfaceC6573aM2686d.mo7439a(c6431a, c6432b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c6431a.toString();
                Objects.toString(obj);
                Objects.toString(interfaceC6282aM2699q);
                AbstractC4404f.m1421a(jM1422b);
            }
            if (interfaceC6573aM2686d.mo7440b(c6431a) != null) {
                this.f2507g = c6431a;
                this.f2504d = new C4711b(Collections.singletonList(this.f2506f.f9230a), this.f2501a, this);
                this.f2506f.f9232c.mo2585b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f2507g);
                Objects.toString(obj);
            }
            try {
                this.f2502b.mo2621a(this.f2506f.f9230a, interfaceC4693eM2697o.mo2574a(), this.f2506f.f9232c, this.f2506f.f9232c.mo2587d(), this.f2506f.f9230a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    throw th;
                }
                this.f2506f.f9232c.mo2585b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public final boolean m2758f() {
        return this.f2503c < this.f2501a.m2689g().size();
    }

    /* renamed from: g */
    public boolean m2759g(InterfaceC7280n.a aVar) {
        InterfaceC7280n.a aVar2 = this.f2506f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m2760h(InterfaceC7280n.a aVar, Object obj) {
        AbstractC6433c abstractC6433cM2687e = this.f2501a.m2687e();
        if (obj != null && abstractC6433cM2687e.mo7042c(aVar.f9232c.mo2587d())) {
            this.f2505e = obj;
            this.f2502b.mo2623c();
        } else {
            InterfaceC4712c.a aVar2 = this.f2502b;
            InterfaceC6283b interfaceC6283b = aVar.f9230a;
            InterfaceC4692d interfaceC4692d = aVar.f9232c;
            aVar2.mo2621a(interfaceC6283b, obj, interfaceC4692d, interfaceC4692d.mo2587d(), this.f2507g);
        }
    }

    /* renamed from: i */
    public void m2761i(InterfaceC7280n.a aVar, Exception exc) {
        InterfaceC4712c.a aVar2 = this.f2502b;
        C6431a c6431a = this.f2507g;
        InterfaceC4692d interfaceC4692d = aVar.f9232c;
        aVar2.mo2622b(c6431a, exc, interfaceC4692d, interfaceC4692d.mo2587d());
    }

    /* renamed from: j */
    public final void m2762j(InterfaceC7280n.a aVar) {
        this.f2506f.f9232c.mo2588e(this.f2501a.m2694l(), new a(aVar));
    }
}
