package com.bumptech.glide.load.engine;

import com.bumptech.glide.C4680e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p053f0.C6285d;
import p053f0.InterfaceC6282a;
import p053f0.InterfaceC6283b;
import p053f0.InterfaceC6287f;
import p053f0.InterfaceC6288g;
import p067h0.AbstractC6433c;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6497b;
import p081j0.InterfaceC6573a;
import p097l0.InterfaceC7280n;
import p111n0.C7448e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public final class C4713d {

    /* renamed from: a */
    public final List f2398a = new ArrayList();

    /* renamed from: b */
    public final List f2399b = new ArrayList();

    /* renamed from: c */
    public C4680e f2400c;

    /* renamed from: d */
    public Object f2401d;

    /* renamed from: e */
    public int f2402e;

    /* renamed from: f */
    public int f2403f;

    /* renamed from: g */
    public Class f2404g;

    /* renamed from: h */
    public DecodeJob.InterfaceC4707e f2405h;

    /* renamed from: i */
    public C6285d f2406i;

    /* renamed from: j */
    public Map f2407j;

    /* renamed from: k */
    public Class f2408k;

    /* renamed from: l */
    public boolean f2409l;

    /* renamed from: m */
    public boolean f2410m;

    /* renamed from: n */
    public InterfaceC6283b f2411n;

    /* renamed from: o */
    public Priority f2412o;

    /* renamed from: p */
    public AbstractC6433c f2413p;

    /* renamed from: q */
    public boolean f2414q;

    /* renamed from: r */
    public boolean f2415r;

    /* renamed from: a */
    public void m2683a() {
        this.f2400c = null;
        this.f2401d = null;
        this.f2411n = null;
        this.f2404g = null;
        this.f2408k = null;
        this.f2406i = null;
        this.f2412o = null;
        this.f2407j = null;
        this.f2413p = null;
        this.f2398a.clear();
        this.f2409l = false;
        this.f2399b.clear();
        this.f2410m = false;
    }

    /* renamed from: b */
    public InterfaceC6497b m2684b() {
        return this.f2400c.m2494b();
    }

    /* renamed from: c */
    public List m2685c() {
        if (!this.f2410m) {
            this.f2410m = true;
            this.f2399b.clear();
            List listM2689g = m2689g();
            int size = listM2689g.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC7280n.a aVar = (InterfaceC7280n.a) listM2689g.get(i6);
                if (!this.f2399b.contains(aVar.f9230a)) {
                    this.f2399b.add(aVar.f9230a);
                }
                for (int i7 = 0; i7 < aVar.f9231b.size(); i7++) {
                    if (!this.f2399b.contains(aVar.f9231b.get(i7))) {
                        this.f2399b.add(aVar.f9231b.get(i7));
                    }
                }
            }
        }
        return this.f2399b;
    }

    /* renamed from: d */
    public InterfaceC6573a m2686d() {
        return this.f2405h.mo2656a();
    }

    /* renamed from: e */
    public AbstractC6433c m2687e() {
        return this.f2413p;
    }

    /* renamed from: f */
    public int m2688f() {
        return this.f2403f;
    }

    /* renamed from: g */
    public List m2689g() {
        if (!this.f2409l) {
            this.f2409l = true;
            this.f2398a.clear();
            List listM2458i = this.f2400c.m2501i().m2458i(this.f2401d);
            int size = listM2458i.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC7280n.a aVarMo8191b = ((InterfaceC7280n) listM2458i.get(i6)).mo8191b(this.f2401d, this.f2402e, this.f2403f, this.f2406i);
                if (aVarMo8191b != null) {
                    this.f2398a.add(aVarMo8191b);
                }
            }
        }
        return this.f2398a;
    }

    /* renamed from: h */
    public C4718i m2690h(Class cls) {
        return this.f2400c.m2501i().m2457h(cls, this.f2404g, this.f2408k);
    }

    /* renamed from: i */
    public Class m2691i() {
        return this.f2401d.getClass();
    }

    /* renamed from: j */
    public List m2692j(File file) {
        return this.f2400c.m2501i().m2458i(file);
    }

    /* renamed from: k */
    public C6285d m2693k() {
        return this.f2406i;
    }

    /* renamed from: l */
    public Priority m2694l() {
        return this.f2412o;
    }

    /* renamed from: m */
    public List m2695m() {
        return this.f2400c.m2501i().m2459j(this.f2401d.getClass(), this.f2404g, this.f2408k);
    }

    /* renamed from: n */
    public InterfaceC6287f m2696n(InterfaceC6440j interfaceC6440j) {
        return this.f2400c.m2501i().m2460k(interfaceC6440j);
    }

    /* renamed from: o */
    public InterfaceC4693e m2697o(Object obj) {
        return this.f2400c.m2501i().m2461l(obj);
    }

    /* renamed from: p */
    public InterfaceC6283b m2698p() {
        return this.f2411n;
    }

    /* renamed from: q */
    public InterfaceC6282a m2699q(Object obj) {
        return this.f2400c.m2501i().m2462m(obj);
    }

    /* renamed from: r */
    public Class m2700r() {
        return this.f2408k;
    }

    /* renamed from: s */
    public InterfaceC6288g m2701s(Class cls) {
        InterfaceC6288g interfaceC6288g = (InterfaceC6288g) this.f2407j.get(cls);
        if (interfaceC6288g == null) {
            Iterator it = this.f2407j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC6288g = (InterfaceC6288g) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC6288g != null) {
            return interfaceC6288g;
        }
        if (!this.f2407j.isEmpty() || !this.f2414q) {
            return C7448e.m8496c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int m2702t() {
        return this.f2402e;
    }

    /* renamed from: u */
    public boolean m2703u(Class cls) {
        return m2690h(cls) != null;
    }

    /* renamed from: v */
    public void m2704v(C4680e c4680e, Object obj, InterfaceC6283b interfaceC6283b, int i6, int i7, AbstractC6433c abstractC6433c, Class cls, Class cls2, Priority priority, C6285d c6285d, Map map, boolean z6, boolean z7, DecodeJob.InterfaceC4707e interfaceC4707e) {
        this.f2400c = c4680e;
        this.f2401d = obj;
        this.f2411n = interfaceC6283b;
        this.f2402e = i6;
        this.f2403f = i7;
        this.f2413p = abstractC6433c;
        this.f2404g = cls;
        this.f2405h = interfaceC4707e;
        this.f2408k = cls2;
        this.f2412o = priority;
        this.f2406i = c6285d;
        this.f2407j = map;
        this.f2414q = z6;
        this.f2415r = z7;
    }

    /* renamed from: w */
    public boolean m2705w(InterfaceC6440j interfaceC6440j) {
        return this.f2400c.m2501i().m2463n(interfaceC6440j);
    }

    /* renamed from: x */
    public boolean m2706x() {
        return this.f2415r;
    }

    /* renamed from: y */
    public boolean m2707y(InterfaceC6283b interfaceC6283b) {
        List listM2689g = m2689g();
        int size = listM2689g.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((InterfaceC7280n.a) listM2689g.get(i6)).f9230a.equals(interfaceC6283b)) {
                return true;
            }
        }
        return false;
    }
}
