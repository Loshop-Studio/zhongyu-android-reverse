package com.bumptech.glide.load.engine;

import com.bumptech.glide.C2860e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p076j.C3794d;
import p076j.InterfaceC3791a;
import p076j.InterfaceC3792b;
import p076j.InterfaceC3796f;
import p076j.InterfaceC3797g;
import p093m.AbstractC4354c;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4393b;
import p102o.InterfaceC4410a;
import p110q.InterfaceC4464m;
import p118s.C4542l;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes2.dex */
public final class C2875d {

    /* renamed from: a */
    public final List f750a = new ArrayList();

    /* renamed from: b */
    public final List f751b = new ArrayList();

    /* renamed from: c */
    public C2860e f752c;

    /* renamed from: d */
    public Object f753d;

    /* renamed from: e */
    public int f754e;

    /* renamed from: f */
    public int f755f;

    /* renamed from: g */
    public Class f756g;

    /* renamed from: h */
    public DecodeJob.InterfaceC2869e f757h;

    /* renamed from: i */
    public C3794d f758i;

    /* renamed from: j */
    public Map f759j;

    /* renamed from: k */
    public Class f760k;

    /* renamed from: l */
    public boolean f761l;

    /* renamed from: m */
    public boolean f762m;

    /* renamed from: n */
    public InterfaceC3792b f763n;

    /* renamed from: o */
    public Priority f764o;

    /* renamed from: p */
    public AbstractC4354c f765p;

    /* renamed from: q */
    public boolean f766q;

    /* renamed from: r */
    public boolean f767r;

    /* renamed from: a */
    public void m1831a() {
        this.f752c = null;
        this.f753d = null;
        this.f763n = null;
        this.f756g = null;
        this.f760k = null;
        this.f758i = null;
        this.f764o = null;
        this.f759j = null;
        this.f765p = null;
        this.f750a.clear();
        this.f761l = false;
        this.f751b.clear();
        this.f762m = false;
    }

    /* renamed from: b */
    public InterfaceC4393b m1832b() {
        return this.f752c.m1704b();
    }

    /* renamed from: c */
    public List m1833c() {
        if (!this.f762m) {
            this.f762m = true;
            this.f751b.clear();
            List listM1837g = m1837g();
            int size = listM1837g.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC4464m.a aVar = (InterfaceC4464m.a) listM1837g.get(i4);
                if (!this.f751b.contains(aVar.f5193a)) {
                    this.f751b.add(aVar.f5193a);
                }
                for (int i5 = 0; i5 < aVar.f5194b.size(); i5++) {
                    if (!this.f751b.contains(aVar.f5194b.get(i5))) {
                        this.f751b.add(aVar.f5194b.get(i5));
                    }
                }
            }
        }
        return this.f751b;
    }

    /* renamed from: d */
    public InterfaceC4410a m1834d() {
        return this.f757h.mo1802a();
    }

    /* renamed from: e */
    public AbstractC4354c m1835e() {
        return this.f765p;
    }

    /* renamed from: f */
    public int m1836f() {
        return this.f755f;
    }

    /* renamed from: g */
    public List m1837g() {
        if (!this.f761l) {
            this.f761l = true;
            this.f750a.clear();
            List listM1668i = this.f752c.m1710h().m1668i(this.f753d);
            int size = listM1668i.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC4464m.a aVarMo5671b = ((InterfaceC4464m) listM1668i.get(i4)).mo5671b(this.f753d, this.f754e, this.f755f, this.f758i);
                if (aVarMo5671b != null) {
                    this.f750a.add(aVarMo5671b);
                }
            }
        }
        return this.f750a;
    }

    /* renamed from: h */
    public C2880i m1838h(Class cls) {
        return this.f752c.m1710h().m1667h(cls, this.f756g, this.f760k);
    }

    /* renamed from: i */
    public Class m1839i() {
        return this.f753d.getClass();
    }

    /* renamed from: j */
    public List m1840j(File file) {
        return this.f752c.m1710h().m1668i(file);
    }

    /* renamed from: k */
    public C3794d m1841k() {
        return this.f758i;
    }

    /* renamed from: l */
    public Priority m1842l() {
        return this.f764o;
    }

    /* renamed from: m */
    public List m1843m() {
        return this.f752c.m1710h().m1669j(this.f753d.getClass(), this.f756g, this.f760k);
    }

    /* renamed from: n */
    public InterfaceC3796f m1844n(InterfaceC4361j interfaceC4361j) {
        return this.f752c.m1710h().m1670k(interfaceC4361j);
    }

    /* renamed from: o */
    public InterfaceC3792b m1845o() {
        return this.f763n;
    }

    /* renamed from: p */
    public InterfaceC3791a m1846p(Object obj) {
        return this.f752c.m1710h().m1672m(obj);
    }

    /* renamed from: q */
    public Class m1847q() {
        return this.f760k;
    }

    /* renamed from: r */
    public InterfaceC3797g m1848r(Class cls) {
        InterfaceC3797g interfaceC3797g = (InterfaceC3797g) this.f759j.get(cls);
        if (interfaceC3797g == null) {
            Iterator it = this.f759j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC3797g = (InterfaceC3797g) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC3797g != null) {
            return interfaceC3797g;
        }
        if (!this.f759j.isEmpty() || !this.f766q) {
            return C4542l.m6179c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: s */
    public int m1849s() {
        return this.f754e;
    }

    /* renamed from: t */
    public boolean m1850t(Class cls) {
        return m1838h(cls) != null;
    }

    /* renamed from: u */
    public void m1851u(C2860e c2860e, Object obj, InterfaceC3792b interfaceC3792b, int i4, int i5, AbstractC4354c abstractC4354c, Class cls, Class cls2, Priority priority, C3794d c3794d, Map map, boolean z3, boolean z4, DecodeJob.InterfaceC2869e interfaceC2869e) {
        this.f752c = c2860e;
        this.f753d = obj;
        this.f763n = interfaceC3792b;
        this.f754e = i4;
        this.f755f = i5;
        this.f765p = abstractC4354c;
        this.f756g = cls;
        this.f757h = interfaceC2869e;
        this.f760k = cls2;
        this.f764o = priority;
        this.f758i = c3794d;
        this.f759j = map;
        this.f766q = z3;
        this.f767r = z4;
    }

    /* renamed from: v */
    public boolean m1852v(InterfaceC4361j interfaceC4361j) {
        return this.f752c.m1710h().m1673n(interfaceC4361j);
    }

    /* renamed from: w */
    public boolean m1853w() {
        return this.f767r;
    }

    /* renamed from: x */
    public boolean m1854x(InterfaceC3792b interfaceC3792b) {
        List listM1837g = m1837g();
        int size = listM1837g.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((InterfaceC4464m.a) listM1837g.get(i4)).f5193a.equals(interfaceC3792b)) {
                return true;
            }
        }
        return false;
    }
}
