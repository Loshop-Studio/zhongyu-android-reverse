package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.engine.InterfaceC5376c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p117i1.AbstractC7647f;
import p162m0.InterfaceC8536a;
import p162m0.InterfaceC8537b;
import p184o0.AbstractC8683c;
import p184o0.C8681a;
import p184o0.C8682b;
import p206q0.InterfaceC8866a;
import p228s0.InterfaceC9112n;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
public class C5384k implements InterfaceC5376c, InterfaceC5376c.a {

    /* renamed from: a */
    public final C5377d f3710a;

    /* renamed from: b */
    public final InterfaceC5376c.a f3711b;

    /* renamed from: c */
    public volatile int f3712c;

    /* renamed from: d */
    public volatile C5375b f3713d;

    /* renamed from: e */
    public volatile Object f3714e;

    /* renamed from: f */
    public volatile InterfaceC9112n.a f3715f;

    /* renamed from: g */
    public volatile C8681a f3716g;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC5356d.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9112n.a f3717a;

        public a(InterfaceC9112n.a aVar) {
            this.f3717a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
        /* renamed from: c */
        public void mo3412c(Exception exc) {
            if (C5384k.this.m3579g(this.f3717a)) {
                C5384k.this.m3581i(this.f3717a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
        /* renamed from: f */
        public void mo3413f(Object obj) {
            if (C5384k.this.m3579g(this.f3717a)) {
                C5384k.this.m3580h(this.f3717a, obj);
            }
        }
    }

    public C5384k(C5377d c5377d, InterfaceC5376c.a aVar) {
        this.f3710a = c5377d;
        this.f3711b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: a */
    public void mo3440a(InterfaceC8537b interfaceC8537b, Exception exc, InterfaceC5356d interfaceC5356d, DataSource dataSource) {
        this.f3711b.mo3440a(interfaceC8537b, exc, interfaceC5356d, this.f3715f.f15786c.mo3406d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: b */
    public void mo3441b(InterfaceC8537b interfaceC8537b, Object obj, InterfaceC5356d interfaceC5356d, DataSource dataSource, InterfaceC8537b interfaceC8537b2) {
        this.f3711b.mo3441b(interfaceC8537b, obj, interfaceC5356d, this.f3715f.f15786c.mo3406d(), interfaceC8537b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c.a
    /* renamed from: c */
    public void mo3442c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    public void cancel() {
        InterfaceC9112n.a aVar = this.f3715f;
        if (aVar != null) {
            aVar.f15786c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    /* renamed from: d */
    public boolean mo3502d() {
        if (this.f3714e != null) {
            Object obj = this.f3714e;
            this.f3714e = null;
            try {
                if (!m3577e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f3713d != null && this.f3713d.mo3502d()) {
            return true;
        }
        this.f3713d = null;
        this.f3715f = null;
        boolean z9 = false;
        while (!z9 && m3578f()) {
            List listM3509g = this.f3710a.m3509g();
            int i10 = this.f3712c;
            this.f3712c = i10 + 1;
            this.f3715f = (InterfaceC9112n.a) listM3509g.get(i10);
            if (this.f3715f != null && (this.f3710a.m3507e().mo14283c(this.f3715f.f15786c.mo3406d()) || this.f3710a.m3523u(this.f3715f.f15786c.mo3399a()))) {
                m3582j(this.f3715f);
                z9 = true;
            }
        }
        return z9;
    }

    /* renamed from: e */
    public final boolean m3577e(Object obj) throws Throwable {
        Throwable th;
        long jM12667b = AbstractC7647f.m12667b();
        boolean z9 = false;
        try {
            InterfaceC5357e interfaceC5357eM3517o = this.f3710a.m3517o(obj);
            Object objMo3393a = interfaceC5357eM3517o.mo3393a();
            InterfaceC8536a interfaceC8536aM3519q = this.f3710a.m3519q(objMo3393a);
            C8682b c8682b = new C8682b(interfaceC8536aM3519q, objMo3393a, this.f3710a.m3513k());
            C8681a c8681a = new C8681a(this.f3715f.f15784a, this.f3710a.m3518p());
            InterfaceC8866a interfaceC8866aM3506d = this.f3710a.m3506d();
            interfaceC8866aM3506d.mo14869b(c8681a, c8682b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c8681a.toString();
                Objects.toString(obj);
                Objects.toString(interfaceC8536aM3519q);
                AbstractC7647f.m12666a(jM12667b);
            }
            if (interfaceC8866aM3506d.mo14868a(c8681a) != null) {
                this.f3716g = c8681a;
                this.f3713d = new C5375b(Collections.singletonList(this.f3715f.f15784a), this.f3710a, this);
                this.f3715f.f15786c.mo3404b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f3716g);
                Objects.toString(obj);
            }
            try {
                this.f3711b.mo3441b(this.f3715f.f15784a, interfaceC5357eM3517o.mo3393a(), this.f3715f.f15786c, this.f3715f.f15786c.mo3406d(), this.f3715f.f15784a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z9 = true;
                if (z9) {
                    throw th;
                }
                this.f3715f.f15786c.mo3404b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public final boolean m3578f() {
        return this.f3712c < this.f3710a.m3509g().size();
    }

    /* renamed from: g */
    public boolean m3579g(InterfaceC9112n.a aVar) {
        InterfaceC9112n.a aVar2 = this.f3715f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m3580h(InterfaceC9112n.a aVar, Object obj) {
        AbstractC8683c abstractC8683cM3507e = this.f3710a.m3507e();
        if (obj != null && abstractC8683cM3507e.mo14283c(aVar.f15786c.mo3406d())) {
            this.f3714e = obj;
            this.f3711b.mo3442c();
        } else {
            InterfaceC5376c.a aVar2 = this.f3711b;
            InterfaceC8537b interfaceC8537b = aVar.f15784a;
            InterfaceC5356d interfaceC5356d = aVar.f15786c;
            aVar2.mo3441b(interfaceC8537b, obj, interfaceC5356d, interfaceC5356d.mo3406d(), this.f3716g);
        }
    }

    /* renamed from: i */
    public void m3581i(InterfaceC9112n.a aVar, Exception exc) {
        InterfaceC5376c.a aVar2 = this.f3711b;
        C8681a c8681a = this.f3716g;
        InterfaceC5356d interfaceC5356d = aVar.f15786c;
        aVar2.mo3440a(c8681a, exc, interfaceC5356d, interfaceC5356d.mo3406d());
    }

    /* renamed from: j */
    public final void m3582j(InterfaceC9112n.a aVar) {
        this.f3715f.f15786c.mo3407e(this.f3710a.m3514l(), new a(aVar));
    }
}
