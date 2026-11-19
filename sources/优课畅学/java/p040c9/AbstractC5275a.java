package p040c9;

import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p323z8.C10734e;
import p323z8.InterfaceC10741l;
import p323z8.InterfaceC10742m;

/* renamed from: c9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5275a {

    /* renamed from: a */
    public C10734e f2404a;

    /* renamed from: b */
    public int f2405b;

    /* renamed from: c */
    public int f2406c;

    /* renamed from: d */
    public float f2407d;

    /* renamed from: e */
    public float f2408e;

    /* renamed from: f */
    public InterfaceC10741l f2409f;

    /* renamed from: g */
    public InterfaceC10742m f2410g;

    /* renamed from: h */
    public DanmakuContext f2411h;

    /* renamed from: a */
    public InterfaceC10741l m2198a() {
        InterfaceC10741l interfaceC10741l = this.f2409f;
        if (interfaceC10741l != null) {
            return interfaceC10741l;
        }
        this.f2411h.f18428A.m171i();
        this.f2409f = mo2200c();
        m2202e();
        this.f2411h.f18428A.m172j();
        return this.f2409f;
    }

    /* renamed from: b */
    public float m2199b() {
        return 1.0f / (this.f2407d - 0.6f);
    }

    /* renamed from: c */
    public abstract InterfaceC10741l mo2200c();

    /* renamed from: d */
    public void m2201d() {
        m2202e();
    }

    /* renamed from: f */
    public AbstractC5275a m2203f(DanmakuContext danmakuContext) {
        DanmakuContext danmakuContext2 = this.f2411h;
        if (danmakuContext2 != null && danmakuContext2 != danmakuContext) {
            this.f2409f = null;
        }
        this.f2411h = danmakuContext;
        return this;
    }

    /* renamed from: g */
    public AbstractC5275a m2204g(InterfaceC10742m interfaceC10742m) {
        this.f2410g = interfaceC10742m;
        this.f2405b = interfaceC10742m.getWidth();
        this.f2406c = interfaceC10742m.getHeight();
        this.f2407d = interfaceC10742m.getDensity();
        this.f2408e = interfaceC10742m.mo130g();
        this.f2411h.f18428A.m175m(this.f2405b, this.f2406c, m2199b());
        this.f2411h.f18428A.m172j();
        return this;
    }

    /* renamed from: h */
    public AbstractC5275a m2205h(C10734e c10734e) {
        this.f2404a = c10734e;
        return this;
    }

    /* renamed from: e */
    public void m2202e() {
    }
}
