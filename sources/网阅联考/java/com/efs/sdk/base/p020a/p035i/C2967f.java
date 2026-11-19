package com.efs.sdk.base.p020a.p035i;

import com.efs.sdk.base.p020a.p025d.C2921a;

/* renamed from: com.efs.sdk.base.a.i.f */
/* loaded from: classes2.dex */
public final class C2967f {

    /* renamed from: a */
    public C2964c f1169a;

    /* renamed from: b */
    public C2921a f1170b;

    /* renamed from: c */
    public HandlerC2965d f1171c;

    /* renamed from: d */
    public HandlerC2968g f1172d;

    /* renamed from: com.efs.sdk.base.a.i.f$a */
    public static class a {

        /* renamed from: a */
        private static final C2967f f1173a = new C2967f(0);
    }

    public /* synthetic */ C2967f(byte b4) {
        this();
    }

    /* renamed from: a */
    public final void m2237a(String str, String str2, String str3) {
        this.f1172d.m2239a(str, str2, str3);
    }

    private C2967f() {
        this.f1169a = new C2964c();
        this.f1171c = new HandlerC2965d();
        this.f1172d = new HandlerC2968g();
    }

    /* renamed from: a */
    public final void m2235a(int i4) {
        C2921a c2921a = this.f1170b;
        if (c2921a != null) {
            c2921a.m2133a(m2234a("flow_limit", i4));
        }
    }

    /* renamed from: a */
    public final void m2236a(int i4, String str) {
        if (this.f1170b != null || C2921a.m2128a().f1041d) {
            C2963b c2963bM2234a = m2234a("flow_limit_type", i4);
            c2963bM2234a.put("code", str);
            this.f1170b.m2133a(c2963bM2234a);
        }
    }

    /* renamed from: a */
    public final C2963b m2234a(String str, int i4) {
        C2963b c2963b = new C2963b("efs_core", str, this.f1169a.f1163c);
        c2963b.put("cver", Integer.valueOf(i4));
        return c2963b;
    }
}
