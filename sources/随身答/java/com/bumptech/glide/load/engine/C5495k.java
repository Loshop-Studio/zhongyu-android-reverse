package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC5487c;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p091e1.AbstractC7833e;
import p122h0.InterfaceC8081a;
import p122h0.InterfaceC8082b;
import p132i0.InterfaceC8115d;
import p152k0.AbstractC8252c;
import p152k0.C8250a;
import p152k0.C8251b;
import p194o0.InterfaceC9146m;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
public class C5495k implements InterfaceC5487c, InterfaceC5487c.a {

    /* renamed from: a */
    public final C5488d f3506a;

    /* renamed from: b */
    public final InterfaceC5487c.a f3507b;

    /* renamed from: c */
    public int f3508c;

    /* renamed from: d */
    public C5486b f3509d;

    /* renamed from: e */
    public Object f3510e;

    /* renamed from: f */
    public volatile InterfaceC9146m.a f3511f;

    /* renamed from: g */
    public C8250a f3512g;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC8115d.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9146m.a f3513a;

        public a(InterfaceC9146m.a aVar) {
            this.f3513a = aVar;
        }

        @Override // p132i0.InterfaceC8115d.a
        /* renamed from: c */
        public void mo3154c(Exception exc) {
            if (C5495k.this.m3231g(this.f3513a)) {
                C5495k.this.m3233i(this.f3513a, exc);
            }
        }

        @Override // p132i0.InterfaceC8115d.a
        /* renamed from: f */
        public void mo3155f(Object obj) {
            if (C5495k.this.m3231g(this.f3513a)) {
                C5495k.this.m3232h(this.f3513a, obj);
            }
        }
    }

    public C5495k(C5488d c5488d, InterfaceC5487c.a aVar) {
        this.f3506a = c5488d;
        this.f3507b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    /* renamed from: a */
    public boolean mo3153a() {
        Object obj = this.f3510e;
        if (obj != null) {
            this.f3510e = null;
            m3229b(obj);
        }
        C5486b c5486b = this.f3509d;
        if (c5486b != null && c5486b.mo3153a()) {
            return true;
        }
        this.f3509d = null;
        this.f3511f = null;
        boolean z9 = false;
        while (!z9 && m3230f()) {
            List listM3162g = this.f3506a.m3162g();
            int i9 = this.f3508c;
            this.f3508c = i9 + 1;
            this.f3511f = (InterfaceC9146m.a) listM3162g.get(i9);
            if (this.f3511f != null && (this.f3506a.m3160e().mo13294c(this.f3511f.f15426c.mo12986e()) || this.f3506a.m3175t(this.f3511f.f15426c.mo12978a()))) {
                m3234j(this.f3511f);
                z9 = true;
            }
        }
        return z9;
    }

    /* renamed from: b */
    public final void m3229b(Object obj) {
        long jM12240b = AbstractC7833e.m12240b();
        try {
            InterfaceC8081a interfaceC8081aM3171p = this.f3506a.m3171p(obj);
            C8251b c8251b = new C8251b(interfaceC8081aM3171p, obj, this.f3506a.m3166k());
            this.f3512g = new C8250a(this.f3511f.f15424a, this.f3506a.m3170o());
            this.f3506a.m3159d().mo14250a(this.f3512g, c8251b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Objects.toString(this.f3512g);
                Objects.toString(obj);
                Objects.toString(interfaceC8081aM3171p);
                AbstractC7833e.m12239a(jM12240b);
            }
            this.f3511f.f15426c.mo12983b();
            this.f3509d = new C5486b(Collections.singletonList(this.f3511f.f15424a), this.f3506a, this);
        } catch (Throwable th) {
            this.f3511f.f15426c.mo12983b();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: c */
    public void mo3095c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    public void cancel() {
        InterfaceC9146m.a aVar = this.f3511f;
        if (aVar != null) {
            aVar.f15426c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: d */
    public void mo3096d(InterfaceC8082b interfaceC8082b, Exception exc, InterfaceC8115d interfaceC8115d, DataSource dataSource) {
        this.f3507b.mo3096d(interfaceC8082b, exc, interfaceC8115d, this.f3511f.f15426c.mo12986e());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c.a
    /* renamed from: e */
    public void mo3097e(InterfaceC8082b interfaceC8082b, Object obj, InterfaceC8115d interfaceC8115d, DataSource dataSource, InterfaceC8082b interfaceC8082b2) {
        this.f3507b.mo3097e(interfaceC8082b, obj, interfaceC8115d, this.f3511f.f15426c.mo12986e(), interfaceC8082b);
    }

    /* renamed from: f */
    public final boolean m3230f() {
        return this.f3508c < this.f3506a.m3162g().size();
    }

    /* renamed from: g */
    public boolean m3231g(InterfaceC9146m.a aVar) {
        InterfaceC9146m.a aVar2 = this.f3511f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m3232h(InterfaceC9146m.a aVar, Object obj) {
        AbstractC8252c abstractC8252cM3160e = this.f3506a.m3160e();
        if (obj != null && abstractC8252cM3160e.mo13294c(aVar.f15426c.mo12986e())) {
            this.f3510e = obj;
            this.f3507b.mo3095c();
        } else {
            InterfaceC5487c.a aVar2 = this.f3507b;
            InterfaceC8082b interfaceC8082b = aVar.f15424a;
            InterfaceC8115d interfaceC8115d = aVar.f15426c;
            aVar2.mo3097e(interfaceC8082b, obj, interfaceC8115d, interfaceC8115d.mo12986e(), this.f3512g);
        }
    }

    /* renamed from: i */
    public void m3233i(InterfaceC9146m.a aVar, Exception exc) {
        InterfaceC5487c.a aVar2 = this.f3507b;
        C8250a c8250a = this.f3512g;
        InterfaceC8115d interfaceC8115d = aVar.f15426c;
        aVar2.mo3096d(c8250a, exc, interfaceC8115d, interfaceC8115d.mo12986e());
    }

    /* renamed from: j */
    public final void m3234j(InterfaceC9146m.a aVar) {
        this.f3511f.f15426c.mo12985d(this.f3506a.m3167l(), new a(aVar));
    }
}
