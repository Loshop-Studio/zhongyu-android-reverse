package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.engine.InterfaceC5844c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p109d1.AbstractC8905f;
import p168h0.InterfaceC9434a;
import p168h0.InterfaceC9435b;
import p198j0.AbstractC9650c;
import p198j0.C9648a;
import p198j0.C9649b;
import p229l0.InterfaceC10094a;
import p254n0.InterfaceC10300n;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
public class C5852k implements InterfaceC5844c, InterfaceC5844c.a {

    /* renamed from: c */
    public final C5845d f4913c;

    /* renamed from: d */
    public final InterfaceC5844c.a f4914d;

    /* renamed from: e */
    public volatile int f4915e;

    /* renamed from: f */
    public volatile C5843b f4916f;

    /* renamed from: g */
    public volatile Object f4917g;

    /* renamed from: h */
    public volatile InterfaceC10300n.a f4918h;

    /* renamed from: i */
    public volatile C9648a f4919i;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC5824d.a {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10300n.a f4920c;

        public a(InterfaceC10300n.a aVar) {
            this.f4920c = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
        /* renamed from: b */
        public void mo4062b(Exception exc) {
            if (C5852k.this.m4229g(this.f4920c)) {
                C5852k.this.m4231i(this.f4920c, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
        /* renamed from: d */
        public void mo4063d(Object obj) {
            if (C5852k.this.m4229g(this.f4920c)) {
                C5852k.this.m4230h(this.f4920c, obj);
            }
        }
    }

    public C5852k(C5845d c5845d, InterfaceC5844c.a aVar) {
        this.f4913c = c5845d;
        this.f4914d = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: a */
    public void mo4090a(InterfaceC9435b interfaceC9435b, Object obj, InterfaceC5824d interfaceC5824d, DataSource dataSource, InterfaceC9435b interfaceC9435b2) {
        this.f4914d.mo4090a(interfaceC9435b, obj, interfaceC5824d, this.f4918h.f24544c.getDataSource(), interfaceC9435b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: b */
    public void mo4091b(InterfaceC9435b interfaceC9435b, Exception exc, InterfaceC5824d interfaceC5824d, DataSource dataSource) {
        this.f4914d.mo4091b(interfaceC9435b, exc, interfaceC5824d, this.f4918h.f24544c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    /* renamed from: c */
    public boolean mo4152c() {
        if (this.f4917g != null) {
            Object obj = this.f4917g;
            this.f4917g = null;
            try {
                if (!m4227d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f4916f != null && this.f4916f.mo4152c()) {
            return true;
        }
        this.f4916f = null;
        this.f4918h = null;
        boolean z10 = false;
        while (!z10 && m4228f()) {
            List listM4159g = this.f4913c.m4159g();
            int i10 = this.f4915e;
            this.f4915e = i10 + 1;
            this.f4918h = (InterfaceC10300n.a) listM4159g.get(i10);
            if (this.f4918h != null && (this.f4913c.m4157e().mo19047c(this.f4918h.f24544c.getDataSource()) || this.f4913c.m4173u(this.f4918h.f24544c.mo4051a()))) {
                m4232j(this.f4918h);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    public void cancel() {
        InterfaceC10300n.a aVar = this.f4918h;
        if (aVar != null) {
            aVar.f24544c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean m4227d(Object obj) throws Throwable {
        Throwable th;
        long jM17452b = AbstractC8905f.m17452b();
        boolean z10 = false;
        try {
            InterfaceC5825e interfaceC5825eM4167o = this.f4913c.m4167o(obj);
            Object objMo4046a = interfaceC5825eM4167o.mo4046a();
            InterfaceC9434a interfaceC9434aM4169q = this.f4913c.m4169q(objMo4046a);
            C9649b c9649b = new C9649b(interfaceC9434aM4169q, objMo4046a, this.f4913c.m4163k());
            C9648a c9648a = new C9648a(this.f4918h.f24542a, this.f4913c.m4168p());
            InterfaceC10094a interfaceC10094aM4156d = this.f4913c.m4156d();
            interfaceC10094aM4156d.mo21106a(c9648a, c9649b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c9648a.toString();
                Objects.toString(obj);
                Objects.toString(interfaceC9434aM4169q);
                AbstractC8905f.m17451a(jM17452b);
            }
            if (interfaceC10094aM4156d.mo21107b(c9648a) != null) {
                this.f4919i = c9648a;
                this.f4916f = new C5843b(Collections.singletonList(this.f4918h.f24542a), this.f4913c, this);
                this.f4918h.f24544c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f4919i);
                Objects.toString(obj);
            }
            try {
                this.f4914d.mo4090a(this.f4918h.f24542a, interfaceC5825eM4167o.mo4046a(), this.f4918h.f24544c, this.f4918h.f24544c.getDataSource(), this.f4918h.f24542a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (z10) {
                    throw th;
                }
                this.f4918h.f24544c.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c.a
    /* renamed from: e */
    public void mo4094e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final boolean m4228f() {
        return this.f4915e < this.f4913c.m4159g().size();
    }

    /* renamed from: g */
    public boolean m4229g(InterfaceC10300n.a aVar) {
        InterfaceC10300n.a aVar2 = this.f4918h;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m4230h(InterfaceC10300n.a aVar, Object obj) {
        AbstractC9650c abstractC9650cM4157e = this.f4913c.m4157e();
        if (obj != null && abstractC9650cM4157e.mo19047c(aVar.f24544c.getDataSource())) {
            this.f4917g = obj;
            this.f4914d.mo4094e();
        } else {
            InterfaceC5844c.a aVar2 = this.f4914d;
            InterfaceC9435b interfaceC9435b = aVar.f24542a;
            InterfaceC5824d interfaceC5824d = aVar.f24544c;
            aVar2.mo4090a(interfaceC9435b, obj, interfaceC5824d, interfaceC5824d.getDataSource(), this.f4919i);
        }
    }

    /* renamed from: i */
    public void m4231i(InterfaceC10300n.a aVar, Exception exc) {
        InterfaceC5844c.a aVar2 = this.f4914d;
        C9648a c9648a = this.f4919i;
        InterfaceC5824d interfaceC5824d = aVar.f24544c;
        aVar2.mo4091b(c9648a, exc, interfaceC5824d, interfaceC5824d.getDataSource());
    }

    /* renamed from: j */
    public final void m4232j(InterfaceC10300n.a aVar) {
        this.f4918h.f24544c.mo4057c(this.f4913c.m4164l(), new a(aVar));
    }
}
