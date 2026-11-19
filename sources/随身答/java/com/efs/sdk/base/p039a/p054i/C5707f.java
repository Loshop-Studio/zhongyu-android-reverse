package com.efs.sdk.base.p039a.p054i;

import com.efs.sdk.base.p039a.p044d.C5661a;

/* renamed from: com.efs.sdk.base.a.i.f */
/* loaded from: classes3.dex */
public final class C5707f {

    /* renamed from: a */
    public C5704c f4773a;

    /* renamed from: b */
    public C5661a f4774b;

    /* renamed from: c */
    public HandlerC5705d f4775c;

    /* renamed from: d */
    public HandlerC5708g f4776d;

    /* renamed from: com.efs.sdk.base.a.i.f$a */
    public static class a {

        /* renamed from: a */
        private static final C5707f f4777a = new C5707f(0);
    }

    public /* synthetic */ C5707f(byte b10) {
        this();
    }

    /* renamed from: a */
    public final void m4206a(String str, String str2, String str3) {
        this.f4776d.m4208a(str, str2, str3);
    }

    private C5707f() {
        this.f4773a = new C5704c();
        this.f4775c = new HandlerC5705d();
        this.f4776d = new HandlerC5708g();
    }

    /* renamed from: a */
    public final void m4204a(int i9) {
        C5661a c5661a = this.f4774b;
        if (c5661a != null) {
            c5661a.m4102a(m4203a("flow_limit", i9));
        }
    }

    /* renamed from: a */
    public final void m4205a(int i9, String str) {
        if (this.f4774b != null || C5661a.m4097a().f4645d) {
            C5703b c5703bM4203a = m4203a("flow_limit_type", i9);
            c5703bM4203a.put("code", str);
            this.f4774b.m4102a(c5703bM4203a);
        }
    }

    /* renamed from: a */
    public final C5703b m4203a(String str, int i9) {
        C5703b c5703b = new C5703b("efs_core", str, this.f4773a.f4767c);
        c5703b.put("cver", Integer.valueOf(i9));
        return c5703b;
    }
}
