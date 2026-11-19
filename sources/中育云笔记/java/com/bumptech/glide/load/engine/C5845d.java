package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5812d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p168h0.C9438e;
import p168h0.InterfaceC9434a;
import p168h0.InterfaceC9435b;
import p168h0.InterfaceC9440g;
import p168h0.InterfaceC9441h;
import p198j0.AbstractC9650c;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9770b;
import p229l0.InterfaceC10094a;
import p254n0.InterfaceC10300n;
import p284p0.C10598e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public final class C5845d {

    /* renamed from: a */
    public final List f4810a = new ArrayList();

    /* renamed from: b */
    public final List f4811b = new ArrayList();

    /* renamed from: c */
    public C5812d f4812c;

    /* renamed from: d */
    public Object f4813d;

    /* renamed from: e */
    public int f4814e;

    /* renamed from: f */
    public int f4815f;

    /* renamed from: g */
    public Class f4816g;

    /* renamed from: h */
    public DecodeJob.InterfaceC5839e f4817h;

    /* renamed from: i */
    public C9438e f4818i;

    /* renamed from: j */
    public Map f4819j;

    /* renamed from: k */
    public Class f4820k;

    /* renamed from: l */
    public boolean f4821l;

    /* renamed from: m */
    public boolean f4822m;

    /* renamed from: n */
    public InterfaceC9435b f4823n;

    /* renamed from: o */
    public Priority f4824o;

    /* renamed from: p */
    public AbstractC9650c f4825p;

    /* renamed from: q */
    public boolean f4826q;

    /* renamed from: r */
    public boolean f4827r;

    /* renamed from: a */
    public void m4153a() {
        this.f4812c = null;
        this.f4813d = null;
        this.f4823n = null;
        this.f4816g = null;
        this.f4820k = null;
        this.f4818i = null;
        this.f4824o = null;
        this.f4819j = null;
        this.f4825p = null;
        this.f4810a.clear();
        this.f4821l = false;
        this.f4811b.clear();
        this.f4822m = false;
    }

    /* renamed from: b */
    public InterfaceC9770b m4154b() {
        return this.f4812c.m3965b();
    }

    /* renamed from: c */
    public List m4155c() {
        if (!this.f4822m) {
            this.f4822m = true;
            this.f4811b.clear();
            List listM4159g = m4159g();
            int size = listM4159g.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC10300n.a aVar = (InterfaceC10300n.a) listM4159g.get(i10);
                if (!this.f4811b.contains(aVar.f24542a)) {
                    this.f4811b.add(aVar.f24542a);
                }
                for (int i11 = 0; i11 < aVar.f24543b.size(); i11++) {
                    if (!this.f4811b.contains(aVar.f24543b.get(i11))) {
                        this.f4811b.add(aVar.f24543b.get(i11));
                    }
                }
            }
        }
        return this.f4811b;
    }

    /* renamed from: d */
    public InterfaceC10094a m4156d() {
        return this.f4817h.mo4126a();
    }

    /* renamed from: e */
    public AbstractC9650c m4157e() {
        return this.f4825p;
    }

    /* renamed from: f */
    public int m4158f() {
        return this.f4815f;
    }

    /* renamed from: g */
    public List m4159g() {
        if (!this.f4821l) {
            this.f4821l = true;
            this.f4810a.clear();
            List listM3929i = this.f4812c.m3972i().m3929i(this.f4813d);
            int size = listM3929i.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC10300n.a aVarMo21421b = ((InterfaceC10300n) listM3929i.get(i10)).mo21421b(this.f4813d, this.f4814e, this.f4815f, this.f4818i);
                if (aVarMo21421b != null) {
                    this.f4810a.add(aVarMo21421b);
                }
            }
        }
        return this.f4810a;
    }

    /* renamed from: h */
    public C5850i m4160h(Class cls) {
        return this.f4812c.m3972i().m3928h(cls, this.f4816g, this.f4820k);
    }

    /* renamed from: i */
    public Class m4161i() {
        return this.f4813d.getClass();
    }

    /* renamed from: j */
    public List m4162j(File file) {
        return this.f4812c.m3972i().m3929i(file);
    }

    /* renamed from: k */
    public C9438e m4163k() {
        return this.f4818i;
    }

    /* renamed from: l */
    public Priority m4164l() {
        return this.f4824o;
    }

    /* renamed from: m */
    public List m4165m() {
        return this.f4812c.m3972i().m3930j(this.f4813d.getClass(), this.f4816g, this.f4820k);
    }

    /* renamed from: n */
    public InterfaceC9440g m4166n(InterfaceC9657j interfaceC9657j) {
        return this.f4812c.m3972i().m3931k(interfaceC9657j);
    }

    /* renamed from: o */
    public InterfaceC5825e m4167o(Object obj) {
        return this.f4812c.m3972i().m3932l(obj);
    }

    /* renamed from: p */
    public InterfaceC9435b m4168p() {
        return this.f4823n;
    }

    /* renamed from: q */
    public InterfaceC9434a m4169q(Object obj) {
        return this.f4812c.m3972i().m3933m(obj);
    }

    /* renamed from: r */
    public Class m4170r() {
        return this.f4820k;
    }

    /* renamed from: s */
    public InterfaceC9441h m4171s(Class cls) {
        InterfaceC9441h interfaceC9441h = (InterfaceC9441h) this.f4819j.get(cls);
        if (interfaceC9441h == null) {
            Iterator it = this.f4819j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC9441h = (InterfaceC9441h) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC9441h != null) {
            return interfaceC9441h;
        }
        if (!this.f4819j.isEmpty() || !this.f4826q) {
            return C10598e.m22420c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int m4172t() {
        return this.f4814e;
    }

    /* renamed from: u */
    public boolean m4173u(Class cls) {
        return m4160h(cls) != null;
    }

    /* renamed from: v */
    public void m4174v(C5812d c5812d, Object obj, InterfaceC9435b interfaceC9435b, int i10, int i11, AbstractC9650c abstractC9650c, Class cls, Class cls2, Priority priority, C9438e c9438e, Map map, boolean z10, boolean z11, DecodeJob.InterfaceC5839e interfaceC5839e) {
        this.f4812c = c5812d;
        this.f4813d = obj;
        this.f4823n = interfaceC9435b;
        this.f4814e = i10;
        this.f4815f = i11;
        this.f4825p = abstractC9650c;
        this.f4816g = cls;
        this.f4817h = interfaceC5839e;
        this.f4820k = cls2;
        this.f4824o = priority;
        this.f4818i = c9438e;
        this.f4819j = map;
        this.f4826q = z10;
        this.f4827r = z11;
    }

    /* renamed from: w */
    public boolean m4175w(InterfaceC9657j interfaceC9657j) {
        return this.f4812c.m3972i().m3934n(interfaceC9657j);
    }

    /* renamed from: x */
    public boolean m4176x() {
        return this.f4827r;
    }

    /* renamed from: y */
    public boolean m4177y(InterfaceC9435b interfaceC9435b) {
        List listM4159g = m4159g();
        int size = listM4159g.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((InterfaceC10300n.a) listM4159g.get(i10)).f24542a.equals(interfaceC9435b)) {
                return true;
            }
        }
        return false;
    }
}
