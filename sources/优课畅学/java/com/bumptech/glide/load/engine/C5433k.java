package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.engine.InterfaceC5425c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p116h0.AbstractC8702f;
import p160l.InterfaceC9227a;
import p160l.InterfaceC9228b;
import p182n.AbstractC9350c;
import p182n.C9348a;
import p182n.C9349b;
import p204p.InterfaceC9624a;
import p226r.InterfaceC9888n;

/* renamed from: com.bumptech.glide.load.engine.k */
/* loaded from: classes3.dex */
public class C5433k implements InterfaceC5425c, InterfaceC5425c.a {

    /* renamed from: a */
    public final C5426d f3143a;

    /* renamed from: b */
    public final InterfaceC5425c.a f3144b;

    /* renamed from: c */
    public volatile int f3145c;

    /* renamed from: d */
    public volatile C5424b f3146d;

    /* renamed from: e */
    public volatile Object f3147e;

    /* renamed from: f */
    public volatile InterfaceC9888n.a f3148f;

    /* renamed from: g */
    public volatile C9348a f3149g;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public class a implements InterfaceC5405d.a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9888n.a f3150a;

        public a(InterfaceC9888n.a aVar) {
            this.f3150a = aVar;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
        /* renamed from: c */
        public void mo2858c(Exception exc) {
            if (C5433k.this.m3025g(this.f3150a)) {
                C5433k.this.m3027i(this.f3150a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
        /* renamed from: e */
        public void mo2859e(Object obj) {
            if (C5433k.this.m3025g(this.f3150a)) {
                C5433k.this.m3026h(this.f3150a, obj);
            }
        }
    }

    public C5433k(C5426d c5426d, InterfaceC5425c.a aVar) {
        this.f3143a = c5426d;
        this.f3144b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    /* renamed from: a */
    public boolean mo2948a() {
        if (this.f3147e != null) {
            Object obj = this.f3147e;
            this.f3147e = null;
            try {
                if (!m3023e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f3146d != null && this.f3146d.mo2948a()) {
            return true;
        }
        this.f3146d = null;
        this.f3148f = null;
        boolean z10 = false;
        while (!z10 && m3024f()) {
            List listM2955g = this.f3143a.m2955g();
            int i10 = this.f3145c;
            this.f3145c = i10 + 1;
            this.f3148f = (InterfaceC9888n.a) listM2955g.get(i10);
            if (this.f3148f != null && (this.f3143a.m2953e().mo17229c(this.f3148f.f19821c.getDataSource()) || this.f3143a.m2969u(this.f3148f.f19821c.mo2846a()))) {
                m3028j(this.f3148f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: b */
    public void mo2887b(InterfaceC9228b interfaceC9228b, Object obj, InterfaceC5405d interfaceC5405d, DataSource dataSource, InterfaceC9228b interfaceC9228b2) {
        this.f3144b.mo2887b(interfaceC9228b, obj, interfaceC5405d, this.f3148f.f19821c.getDataSource(), interfaceC9228b);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: c */
    public void mo2888c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    public void cancel() {
        InterfaceC9888n.a aVar = this.f3148f;
        if (aVar != null) {
            aVar.f19821c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c.a
    /* renamed from: d */
    public void mo2889d(InterfaceC9228b interfaceC9228b, Exception exc, InterfaceC5405d interfaceC5405d, DataSource dataSource) {
        this.f3144b.mo2889d(interfaceC9228b, exc, interfaceC5405d, this.f3148f.f19821c.getDataSource());
    }

    /* renamed from: e */
    public final boolean m3023e(Object obj) throws Throwable {
        Throwable th;
        long jM14165b = AbstractC8702f.m14165b();
        boolean z10 = false;
        try {
            InterfaceC5406e interfaceC5406eM2963o = this.f3143a.m2963o(obj);
            Object objMo2840a = interfaceC5406eM2963o.mo2840a();
            InterfaceC9227a interfaceC9227aM2965q = this.f3143a.m2965q(objMo2840a);
            C9349b c9349b = new C9349b(interfaceC9227aM2965q, objMo2840a, this.f3143a.m2959k());
            C9348a c9348a = new C9348a(this.f3148f.f19819a, this.f3143a.m2964p());
            InterfaceC9624a interfaceC9624aM2952d = this.f3143a.m2952d();
            interfaceC9624aM2952d.mo18171b(c9348a, c9349b);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c9348a.toString();
                Objects.toString(obj);
                Objects.toString(interfaceC9227aM2965q);
                AbstractC8702f.m14164a(jM14165b);
            }
            if (interfaceC9624aM2952d.mo18170a(c9348a) != null) {
                this.f3149g = c9348a;
                this.f3146d = new C5424b(Collections.singletonList(this.f3148f.f19819a), this.f3143a, this);
                this.f3148f.f19821c.mo2851b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f3149g);
                Objects.toString(obj);
            }
            try {
                this.f3144b.mo2887b(this.f3148f.f19819a, interfaceC5406eM2963o.mo2840a(), this.f3148f.f19821c, this.f3148f.f19821c.getDataSource(), this.f3148f.f19819a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (z10) {
                    throw th;
                }
                this.f3148f.f19821c.mo2851b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public final boolean m3024f() {
        return this.f3145c < this.f3143a.m2955g().size();
    }

    /* renamed from: g */
    public boolean m3025g(InterfaceC9888n.a aVar) {
        InterfaceC9888n.a aVar2 = this.f3148f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: h */
    public void m3026h(InterfaceC9888n.a aVar, Object obj) {
        AbstractC9350c abstractC9350cM2953e = this.f3143a.m2953e();
        if (obj != null && abstractC9350cM2953e.mo17229c(aVar.f19821c.getDataSource())) {
            this.f3147e = obj;
            this.f3144b.mo2888c();
        } else {
            InterfaceC5425c.a aVar2 = this.f3144b;
            InterfaceC9228b interfaceC9228b = aVar.f19819a;
            InterfaceC5405d interfaceC5405d = aVar.f19821c;
            aVar2.mo2887b(interfaceC9228b, obj, interfaceC5405d, interfaceC5405d.getDataSource(), this.f3149g);
        }
    }

    /* renamed from: i */
    public void m3027i(InterfaceC9888n.a aVar, Exception exc) {
        InterfaceC5425c.a aVar2 = this.f3144b;
        C9348a c9348a = this.f3149g;
        InterfaceC5405d interfaceC5405d = aVar.f19821c;
        aVar2.mo2889d(c9348a, exc, interfaceC5405d, interfaceC5405d.getDataSource());
    }

    /* renamed from: j */
    public final void m3028j(InterfaceC9888n.a aVar) {
        this.f3148f.f19821c.mo2853d(this.f3143a.m2960l(), new a(aVar));
    }
}
