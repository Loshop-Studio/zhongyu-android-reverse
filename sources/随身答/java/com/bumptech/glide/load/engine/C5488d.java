package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5473d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p122h0.C8084d;
import p122h0.InterfaceC8081a;
import p122h0.InterfaceC8082b;
import p122h0.InterfaceC8086f;
import p122h0.InterfaceC8087g;
import p152k0.AbstractC8252c;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8865b;
import p174m0.InterfaceC8939a;
import p194o0.InterfaceC9146m;
import p218q0.C9350f;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public final class C5488d {

    /* renamed from: a */
    public final List f3404a = new ArrayList();

    /* renamed from: b */
    public final List f3405b = new ArrayList();

    /* renamed from: c */
    public C5473d f3406c;

    /* renamed from: d */
    public Object f3407d;

    /* renamed from: e */
    public int f3408e;

    /* renamed from: f */
    public int f3409f;

    /* renamed from: g */
    public Class f3410g;

    /* renamed from: h */
    public DecodeJob.InterfaceC5482e f3411h;

    /* renamed from: i */
    public C8084d f3412i;

    /* renamed from: j */
    public Map f3413j;

    /* renamed from: k */
    public Class f3414k;

    /* renamed from: l */
    public boolean f3415l;

    /* renamed from: m */
    public boolean f3416m;

    /* renamed from: n */
    public InterfaceC8082b f3417n;

    /* renamed from: o */
    public Priority f3418o;

    /* renamed from: p */
    public AbstractC8252c f3419p;

    /* renamed from: q */
    public boolean f3420q;

    /* renamed from: r */
    public boolean f3421r;

    /* renamed from: a */
    public void m3156a() {
        this.f3406c = null;
        this.f3407d = null;
        this.f3417n = null;
        this.f3410g = null;
        this.f3414k = null;
        this.f3412i = null;
        this.f3418o = null;
        this.f3413j = null;
        this.f3419p = null;
        this.f3404a.clear();
        this.f3415l = false;
        this.f3405b.clear();
        this.f3416m = false;
    }

    /* renamed from: b */
    public InterfaceC8865b m3157b() {
        return this.f3406c.m3030b();
    }

    /* renamed from: c */
    public List m3158c() {
        if (!this.f3416m) {
            this.f3416m = true;
            this.f3405b.clear();
            List listM3162g = m3162g();
            int size = listM3162g.size();
            for (int i9 = 0; i9 < size; i9++) {
                InterfaceC9146m.a aVar = (InterfaceC9146m.a) listM3162g.get(i9);
                if (!this.f3405b.contains(aVar.f15424a)) {
                    this.f3405b.add(aVar.f15424a);
                }
                for (int i10 = 0; i10 < aVar.f15425b.size(); i10++) {
                    if (!this.f3405b.contains(aVar.f15425b.get(i10))) {
                        this.f3405b.add(aVar.f15425b.get(i10));
                    }
                }
            }
        }
        return this.f3405b;
    }

    /* renamed from: d */
    public InterfaceC8939a m3159d() {
        return this.f3411h.mo3127a();
    }

    /* renamed from: e */
    public AbstractC8252c m3160e() {
        return this.f3419p;
    }

    /* renamed from: f */
    public int m3161f() {
        return this.f3409f;
    }

    /* renamed from: g */
    public List m3162g() {
        if (!this.f3415l) {
            this.f3415l = true;
            this.f3404a.clear();
            List listM2995i = this.f3406c.m3036h().m2995i(this.f3407d);
            int size = listM2995i.size();
            for (int i9 = 0; i9 < size; i9++) {
                InterfaceC9146m.a aVarMo14656b = ((InterfaceC9146m) listM2995i.get(i9)).mo14656b(this.f3407d, this.f3408e, this.f3409f, this.f3412i);
                if (aVarMo14656b != null) {
                    this.f3404a.add(aVarMo14656b);
                }
            }
        }
        return this.f3404a;
    }

    /* renamed from: h */
    public C5493i m3163h(Class cls) {
        return this.f3406c.m3036h().m2994h(cls, this.f3410g, this.f3414k);
    }

    /* renamed from: i */
    public Class m3164i() {
        return this.f3407d.getClass();
    }

    /* renamed from: j */
    public List m3165j(File file) {
        return this.f3406c.m3036h().m2995i(file);
    }

    /* renamed from: k */
    public C8084d m3166k() {
        return this.f3412i;
    }

    /* renamed from: l */
    public Priority m3167l() {
        return this.f3418o;
    }

    /* renamed from: m */
    public List m3168m() {
        return this.f3406c.m3036h().m2996j(this.f3407d.getClass(), this.f3410g, this.f3414k);
    }

    /* renamed from: n */
    public InterfaceC8086f m3169n(InterfaceC8259j interfaceC8259j) {
        return this.f3406c.m3036h().m2997k(interfaceC8259j);
    }

    /* renamed from: o */
    public InterfaceC8082b m3170o() {
        return this.f3417n;
    }

    /* renamed from: p */
    public InterfaceC8081a m3171p(Object obj) {
        return this.f3406c.m3036h().m2999m(obj);
    }

    /* renamed from: q */
    public Class m3172q() {
        return this.f3414k;
    }

    /* renamed from: r */
    public InterfaceC8087g m3173r(Class cls) {
        InterfaceC8087g interfaceC8087g = (InterfaceC8087g) this.f3413j.get(cls);
        if (interfaceC8087g == null) {
            Iterator it = this.f3413j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC8087g = (InterfaceC8087g) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC8087g != null) {
            return interfaceC8087g;
        }
        if (!this.f3413j.isEmpty() || !this.f3420q) {
            return C9350f.m15293c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: s */
    public int m3174s() {
        return this.f3408e;
    }

    /* renamed from: t */
    public boolean m3175t(Class cls) {
        return m3163h(cls) != null;
    }

    /* renamed from: u */
    public void m3176u(C5473d c5473d, Object obj, InterfaceC8082b interfaceC8082b, int i9, int i10, AbstractC8252c abstractC8252c, Class cls, Class cls2, Priority priority, C8084d c8084d, Map map, boolean z9, boolean z10, DecodeJob.InterfaceC5482e interfaceC5482e) {
        this.f3406c = c5473d;
        this.f3407d = obj;
        this.f3417n = interfaceC8082b;
        this.f3408e = i9;
        this.f3409f = i10;
        this.f3419p = abstractC8252c;
        this.f3410g = cls;
        this.f3411h = interfaceC5482e;
        this.f3414k = cls2;
        this.f3418o = priority;
        this.f3412i = c8084d;
        this.f3413j = map;
        this.f3420q = z9;
        this.f3421r = z10;
    }

    /* renamed from: v */
    public boolean m3177v(InterfaceC8259j interfaceC8259j) {
        return this.f3406c.m3036h().m3000n(interfaceC8259j);
    }

    /* renamed from: w */
    public boolean m3178w() {
        return this.f3421r;
    }

    /* renamed from: x */
    public boolean m3179x(InterfaceC8082b interfaceC8082b) {
        List listM3162g = m3162g();
        int size = listM3162g.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((InterfaceC9146m.a) listM3162g.get(i9)).f15424a.equals(interfaceC8082b)) {
                return true;
            }
        }
        return false;
    }
}
