package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5393d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p160l.C9230d;
import p160l.InterfaceC9227a;
import p160l.InterfaceC9228b;
import p160l.InterfaceC9232f;
import p160l.InterfaceC9233g;
import p182n.AbstractC9350c;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9498b;
import p204p.InterfaceC9624a;
import p226r.InterfaceC9888n;
import p248t.C10084k;

/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes3.dex */
public final class C5426d {

    /* renamed from: a */
    public final List f3040a = new ArrayList();

    /* renamed from: b */
    public final List f3041b = new ArrayList();

    /* renamed from: c */
    public C5393d f3042c;

    /* renamed from: d */
    public Object f3043d;

    /* renamed from: e */
    public int f3044e;

    /* renamed from: f */
    public int f3045f;

    /* renamed from: g */
    public Class f3046g;

    /* renamed from: h */
    public DecodeJob.InterfaceC5420e f3047h;

    /* renamed from: i */
    public C9230d f3048i;

    /* renamed from: j */
    public Map f3049j;

    /* renamed from: k */
    public Class f3050k;

    /* renamed from: l */
    public boolean f3051l;

    /* renamed from: m */
    public boolean f3052m;

    /* renamed from: n */
    public InterfaceC9228b f3053n;

    /* renamed from: o */
    public Priority f3054o;

    /* renamed from: p */
    public AbstractC9350c f3055p;

    /* renamed from: q */
    public boolean f3056q;

    /* renamed from: r */
    public boolean f3057r;

    /* renamed from: a */
    public void m2949a() {
        this.f3042c = null;
        this.f3043d = null;
        this.f3053n = null;
        this.f3046g = null;
        this.f3050k = null;
        this.f3048i = null;
        this.f3054o = null;
        this.f3049j = null;
        this.f3055p = null;
        this.f3040a.clear();
        this.f3051l = false;
        this.f3041b.clear();
        this.f3052m = false;
    }

    /* renamed from: b */
    public InterfaceC9498b m2950b() {
        return this.f3042c.m2756b();
    }

    /* renamed from: c */
    public List m2951c() {
        if (!this.f3052m) {
            this.f3052m = true;
            this.f3041b.clear();
            List listM2955g = m2955g();
            int size = listM2955g.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9888n.a aVar = (InterfaceC9888n.a) listM2955g.get(i10);
                if (!this.f3041b.contains(aVar.f19819a)) {
                    this.f3041b.add(aVar.f19819a);
                }
                for (int i11 = 0; i11 < aVar.f19820b.size(); i11++) {
                    if (!this.f3041b.contains(aVar.f19820b.get(i11))) {
                        this.f3041b.add(aVar.f19820b.get(i11));
                    }
                }
            }
        }
        return this.f3041b;
    }

    /* renamed from: d */
    public InterfaceC9624a m2952d() {
        return this.f3047h.mo2922a();
    }

    /* renamed from: e */
    public AbstractC9350c m2953e() {
        return this.f3055p;
    }

    /* renamed from: f */
    public int m2954f() {
        return this.f3045f;
    }

    /* renamed from: g */
    public List m2955g() {
        if (!this.f3051l) {
            this.f3051l = true;
            this.f3040a.clear();
            List listM2721i = this.f3042c.m2763i().m2721i(this.f3043d);
            int size = listM2721i.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9888n.a aVarMo18446b = ((InterfaceC9888n) listM2721i.get(i10)).mo18446b(this.f3043d, this.f3044e, this.f3045f, this.f3048i);
                if (aVarMo18446b != null) {
                    this.f3040a.add(aVarMo18446b);
                }
            }
        }
        return this.f3040a;
    }

    /* renamed from: h */
    public C5431i m2956h(Class cls) {
        return this.f3042c.m2763i().m2720h(cls, this.f3046g, this.f3050k);
    }

    /* renamed from: i */
    public Class m2957i() {
        return this.f3043d.getClass();
    }

    /* renamed from: j */
    public List m2958j(File file) {
        return this.f3042c.m2763i().m2721i(file);
    }

    /* renamed from: k */
    public C9230d m2959k() {
        return this.f3048i;
    }

    /* renamed from: l */
    public Priority m2960l() {
        return this.f3054o;
    }

    /* renamed from: m */
    public List m2961m() {
        return this.f3042c.m2763i().m2722j(this.f3043d.getClass(), this.f3046g, this.f3050k);
    }

    /* renamed from: n */
    public InterfaceC9232f m2962n(InterfaceC9357j interfaceC9357j) {
        return this.f3042c.m2763i().m2723k(interfaceC9357j);
    }

    /* renamed from: o */
    public InterfaceC5406e m2963o(Object obj) {
        return this.f3042c.m2763i().m2724l(obj);
    }

    /* renamed from: p */
    public InterfaceC9228b m2964p() {
        return this.f3053n;
    }

    /* renamed from: q */
    public InterfaceC9227a m2965q(Object obj) {
        return this.f3042c.m2763i().m2725m(obj);
    }

    /* renamed from: r */
    public Class m2966r() {
        return this.f3050k;
    }

    /* renamed from: s */
    public InterfaceC9233g m2967s(Class cls) {
        InterfaceC9233g interfaceC9233g = (InterfaceC9233g) this.f3049j.get(cls);
        if (interfaceC9233g == null) {
            Iterator it = this.f3049j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC9233g = (InterfaceC9233g) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC9233g != null) {
            return interfaceC9233g;
        }
        if (!this.f3049j.isEmpty() || !this.f3056q) {
            return C10084k.m18820c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: t */
    public int m2968t() {
        return this.f3044e;
    }

    /* renamed from: u */
    public boolean m2969u(Class cls) {
        return m2956h(cls) != null;
    }

    /* renamed from: v */
    public void m2970v(C5393d c5393d, Object obj, InterfaceC9228b interfaceC9228b, int i10, int i11, AbstractC9350c abstractC9350c, Class cls, Class cls2, Priority priority, C9230d c9230d, Map map, boolean z10, boolean z11, DecodeJob.InterfaceC5420e interfaceC5420e) {
        this.f3042c = c5393d;
        this.f3043d = obj;
        this.f3053n = interfaceC9228b;
        this.f3044e = i10;
        this.f3045f = i11;
        this.f3055p = abstractC9350c;
        this.f3046g = cls;
        this.f3047h = interfaceC5420e;
        this.f3050k = cls2;
        this.f3054o = priority;
        this.f3048i = c9230d;
        this.f3049j = map;
        this.f3056q = z10;
        this.f3057r = z11;
    }

    /* renamed from: w */
    public boolean m2971w(InterfaceC9357j interfaceC9357j) {
        return this.f3042c.m2763i().m2726n(interfaceC9357j);
    }

    /* renamed from: x */
    public boolean m2972x() {
        return this.f3057r;
    }

    /* renamed from: y */
    public boolean m2973y(InterfaceC9228b interfaceC9228b) {
        List listM2955g = m2955g();
        int size = listM2955g.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((InterfaceC9888n.a) listM2955g.get(i10)).f19819a.equals(interfaceC9228b)) {
                return true;
            }
        }
        return false;
    }
}
