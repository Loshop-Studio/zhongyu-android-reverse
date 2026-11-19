package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC2874c;
import java.util.Collections;
import java.util.List;
import p062g0.AbstractC3745e;
import p076j.InterfaceC3791a;
import p076j.InterfaceC3792b;
import p081k.InterfaceC3843d;
import p093m.AbstractC4354c;
import p093m.C4352a;
import p093m.C4353b;
import p110q.InterfaceC4464m;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes2.dex */
public class C2882k implements InterfaceC2874c, InterfaceC2874c.a {

    /* renamed from: a */
    public final C2875d f852a;

    /* renamed from: b */
    public final InterfaceC2874c.a f853b;

    /* renamed from: c */
    public int f854c;

    /* renamed from: d */
    public C2873b f855d;

    /* renamed from: e */
    public Object f856e;

    /* renamed from: f */
    public volatile InterfaceC4464m.a f857f;

    /* renamed from: g */
    public C4352a f858g;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC3843d.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4464m.a f859a;

        public a(InterfaceC4464m.a aVar) {
            this.f859a = aVar;
        }

        @Override // p081k.InterfaceC3843d.a
        /* renamed from: c */
        public void mo1829c(Exception exc) {
            if (C2882k.this.m1907g(this.f859a)) {
                C2882k.this.m1909i(this.f859a, exc);
            }
        }

        @Override // p081k.InterfaceC3843d.a
        /* renamed from: e */
        public void mo1830e(Object obj) {
            if (C2882k.this.m1907g(this.f859a)) {
                C2882k.this.m1908h(this.f859a, obj);
            }
        }
    }

    public C2882k(C2875d c2875d, InterfaceC2874c.a aVar) {
        this.f852a = c2875d;
        this.f853b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: a */
    public void mo1768a(InterfaceC3792b interfaceC3792b, Object obj, InterfaceC3843d interfaceC3843d, DataSource dataSource, InterfaceC3792b interfaceC3792b2) {
        this.f853b.mo1768a(interfaceC3792b, obj, interfaceC3843d, this.f857f.f5195c.mo5121d(), interfaceC3792b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    /* renamed from: b */
    public boolean mo1828b() {
        Object obj = this.f856e;
        if (obj != null) {
            this.f856e = null;
            m1905e(obj);
        }
        C2873b c2873b = this.f855d;
        if (c2873b != null && c2873b.mo1828b()) {
            return true;
        }
        this.f855d = null;
        this.f857f = null;
        boolean z3 = false;
        while (!z3 && m1906f()) {
            List listM1837g = this.f852a.m1837g();
            int i4 = this.f854c;
            this.f854c = i4 + 1;
            this.f857f = (InterfaceC4464m.a) listM1837g.get(i4);
            if (this.f857f != null && (this.f852a.m1835e().mo5366c(this.f857f.f5195c.mo5121d()) || this.f852a.m1850t(this.f857f.f5195c.mo5114a()))) {
                m1910j(this.f857f);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: c */
    public void mo1770c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    public void cancel() {
        InterfaceC4464m.a aVar = this.f857f;
        if (aVar != null) {
            aVar.f5195c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c.a
    /* renamed from: d */
    public void mo1771d(InterfaceC3792b interfaceC3792b, Exception exc, InterfaceC3843d interfaceC3843d, DataSource dataSource) {
        this.f853b.mo1771d(interfaceC3792b, exc, interfaceC3843d, this.f857f.f5195c.mo5121d());
    }

    /* renamed from: e */
    public final void m1905e(Object obj) {
        long jM4752b = AbstractC3745e.m4752b();
        try {
            InterfaceC3791a interfaceC3791aM1846p = this.f852a.m1846p(obj);
            C4353b c4353b = new C4353b(interfaceC3791aM1846p, obj, this.f852a.m1841k());
            this.f858g = new C4352a(this.f857f.f5193a, this.f852a.m1845o());
            this.f852a.m1834d().mo5497a(this.f858g, c4353b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f858g);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(interfaceC3791aM1846p);
                sb.append(", duration: ");
                sb.append(AbstractC3745e.m4751a(jM4752b));
            }
            this.f857f.f5195c.mo5119b();
            this.f855d = new C2873b(Collections.singletonList(this.f857f.f5193a), this.f852a, this);
        } catch (Throwable th) {
            this.f857f.f5195c.mo5119b();
            throw th;
        }
    }

    /* renamed from: f */
    public final boolean m1906f() {
        return this.f854c < this.f852a.m1837g().size();
    }

    /* renamed from: g */
    public boolean m1907g(InterfaceC4464m.a aVar) {
        InterfaceC4464m.a aVar2 = this.f857f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m1908h(InterfaceC4464m.a aVar, Object obj) {
        AbstractC4354c abstractC4354cM1835e = this.f852a.m1835e();
        if (obj != null && abstractC4354cM1835e.mo5366c(aVar.f5195c.mo5121d())) {
            this.f856e = obj;
            this.f853b.mo1770c();
        } else {
            InterfaceC2874c.a aVar2 = this.f853b;
            InterfaceC3792b interfaceC3792b = aVar.f5193a;
            InterfaceC3843d interfaceC3843d = aVar.f5195c;
            aVar2.mo1768a(interfaceC3792b, obj, interfaceC3843d, interfaceC3843d.mo5121d(), this.f858g);
        }
    }

    /* renamed from: i */
    public void m1909i(InterfaceC4464m.a aVar, Exception exc) {
        InterfaceC2874c.a aVar2 = this.f853b;
        C4352a c4352a = this.f858g;
        InterfaceC3843d interfaceC3843d = aVar.f5195c;
        aVar2.mo1771d(c4352a, exc, interfaceC3843d, interfaceC3843d.mo5121d());
    }

    /* renamed from: j */
    public final void m1910j(InterfaceC4464m.a aVar) {
        this.f857f.f5195c.mo5123f(this.f852a.m1842l(), new a(aVar));
    }
}
