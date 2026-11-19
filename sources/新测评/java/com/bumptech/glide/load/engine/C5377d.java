package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5344d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p162m0.C8539d;
import p162m0.InterfaceC8536a;
import p162m0.InterfaceC8537b;
import p162m0.InterfaceC8541f;
import p162m0.InterfaceC8542g;
import p184o0.AbstractC8683c;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8802b;
import p206q0.InterfaceC8866a;
import p228s0.InterfaceC9112n;
import p250u0.C9533e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public final class C5377d {

    /* renamed from: a */
    public final List f3607a = new ArrayList();

    /* renamed from: b */
    public final List f3608b = new ArrayList();

    /* renamed from: c */
    public C5344d f3609c;

    /* renamed from: d */
    public Object f3610d;

    /* renamed from: e */
    public int f3611e;

    /* renamed from: f */
    public int f3612f;

    /* renamed from: g */
    public Class f3613g;

    /* renamed from: h */
    public DecodeJob.InterfaceC5371e f3614h;

    /* renamed from: i */
    public C8539d f3615i;

    /* renamed from: j */
    public Map f3616j;

    /* renamed from: k */
    public Class f3617k;

    /* renamed from: l */
    public boolean f3618l;

    /* renamed from: m */
    public boolean f3619m;

    /* renamed from: n */
    public InterfaceC8537b f3620n;

    /* renamed from: o */
    public Priority f3621o;

    /* renamed from: p */
    public AbstractC8683c f3622p;

    /* renamed from: q */
    public boolean f3623q;

    /* renamed from: r */
    public boolean f3624r;

    /* renamed from: a */
    public void m3503a() {
        this.f3609c = null;
        this.f3610d = null;
        this.f3620n = null;
        this.f3613g = null;
        this.f3617k = null;
        this.f3615i = null;
        this.f3621o = null;
        this.f3616j = null;
        this.f3622p = null;
        this.f3607a.clear();
        this.f3618l = false;
        this.f3608b.clear();
        this.f3619m = false;
    }

    /* renamed from: b */
    public InterfaceC8802b m3504b() {
        return this.f3609c.m3315b();
    }

    /* renamed from: c */
    public List m3505c() {
        if (!this.f3619m) {
            this.f3619m = true;
            this.f3608b.clear();
            List listM3509g = m3509g();
            int size = listM3509g.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9112n.a aVar = (InterfaceC9112n.a) listM3509g.get(i10);
                if (!this.f3608b.contains(aVar.f15784a)) {
                    this.f3608b.add(aVar.f15784a);
                }
                for (int i11 = 0; i11 < aVar.f15785b.size(); i11++) {
                    if (!this.f3608b.contains(aVar.f15785b.get(i11))) {
                        this.f3608b.add(aVar.f15785b.get(i11));
                    }
                }
            }
        }
        return this.f3608b;
    }

    /* renamed from: d */
    public InterfaceC8866a m3506d() {
        return this.f3614h.mo3476a();
    }

    /* renamed from: e */
    public AbstractC8683c m3507e() {
        return this.f3622p;
    }

    /* renamed from: f */
    public int m3508f() {
        return this.f3612f;
    }

    /* renamed from: g */
    public List m3509g() {
        if (!this.f3618l) {
            this.f3618l = true;
            this.f3607a.clear();
            List listM3280i = this.f3609c.m3322i().m3280i(this.f3610d);
            int size = listM3280i.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9112n.a aVarMo15355b = ((InterfaceC9112n) listM3280i.get(i10)).mo15355b(this.f3610d, this.f3611e, this.f3612f, this.f3615i);
                if (aVarMo15355b != null) {
                    this.f3607a.add(aVarMo15355b);
                }
            }
        }
        return this.f3607a;
    }

    /* renamed from: h */
    public C5382i m3510h(Class cls) {
        return this.f3609c.m3322i().m3279h(cls, this.f3613g, this.f3617k);
    }

    /* renamed from: i */
    public Class m3511i() {
        return this.f3610d.getClass();
    }

    /* renamed from: j */
    public List m3512j(File file) {
        return this.f3609c.m3322i().m3280i(file);
    }

    /* renamed from: k */
    public C8539d m3513k() {
        return this.f3615i;
    }

    /* renamed from: l */
    public Priority m3514l() {
        return this.f3621o;
    }

    /* renamed from: m */
    public List m3515m() {
        return this.f3609c.m3322i().m3281j(this.f3610d.getClass(), this.f3613g, this.f3617k);
    }

    /* renamed from: n */
    public InterfaceC8541f m3516n(InterfaceC8690j interfaceC8690j) {
        return this.f3609c.m3322i().m3282k(interfaceC8690j);
    }

    /* renamed from: o */
    public InterfaceC5357e m3517o(Object obj) {
        return this.f3609c.m3322i().m3283l(obj);
    }

    /* renamed from: p */
    public InterfaceC8537b m3518p() {
        return this.f3620n;
    }

    /* renamed from: q */
    public InterfaceC8536a m3519q(Object obj) {
        return this.f3609c.m3322i().m3284m(obj);
    }

    /* renamed from: r */
    public Class m3520r() {
        return this.f3617k;
    }

    /* renamed from: s */
    public InterfaceC8542g m3521s(Class cls) {
        InterfaceC8542g interfaceC8542g = (InterfaceC8542g) this.f3616j.get(cls);
        if (interfaceC8542g == null) {
            Iterator it = this.f3616j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC8542g = (InterfaceC8542g) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC8542g != null) {
            return interfaceC8542g;
        }
        if (!this.f3616j.isEmpty() || !this.f3623q) {
            return C9533e.m15909c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int m3522t() {
        return this.f3611e;
    }

    /* renamed from: u */
    public boolean m3523u(Class cls) {
        return m3510h(cls) != null;
    }

    /* renamed from: v */
    public void m3524v(C5344d c5344d, Object obj, InterfaceC8537b interfaceC8537b, int i10, int i11, AbstractC8683c abstractC8683c, Class cls, Class cls2, Priority priority, C8539d c8539d, Map map, boolean z9, boolean z10, DecodeJob.InterfaceC5371e interfaceC5371e) {
        this.f3609c = c5344d;
        this.f3610d = obj;
        this.f3620n = interfaceC8537b;
        this.f3611e = i10;
        this.f3612f = i11;
        this.f3622p = abstractC8683c;
        this.f3613g = cls;
        this.f3614h = interfaceC5371e;
        this.f3617k = cls2;
        this.f3621o = priority;
        this.f3615i = c8539d;
        this.f3616j = map;
        this.f3623q = z9;
        this.f3624r = z10;
    }

    /* renamed from: w */
    public boolean m3525w(InterfaceC8690j interfaceC8690j) {
        return this.f3609c.m3322i().m3285n(interfaceC8690j);
    }

    /* renamed from: x */
    public boolean m3526x() {
        return this.f3624r;
    }

    /* renamed from: y */
    public boolean m3527y(InterfaceC8537b interfaceC8537b) {
        List listM3509g = m3509g();
        int size = listM3509g.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((InterfaceC9112n.a) listM3509g.get(i10)).f15784a.equals(interfaceC8537b)) {
                return true;
            }
        }
        return false;
    }
}
