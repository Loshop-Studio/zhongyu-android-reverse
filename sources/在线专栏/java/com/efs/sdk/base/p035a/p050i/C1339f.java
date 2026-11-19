package com.efs.sdk.base.p035a.p050i;

import com.efs.sdk.base.p035a.p040d.C1293a;
import com.taobao.accs.common.Constants;

/* renamed from: com.efs.sdk.base.a.i.f */
/* loaded from: classes.dex */
public final class C1339f {

    /* renamed from: a */
    public C1336c f7139a;

    /* renamed from: b */
    public C1293a f7140b;

    /* renamed from: c */
    public HandlerC1337d f7141c;

    /* renamed from: d */
    public HandlerC1340g f7142d;

    /* renamed from: com.efs.sdk.base.a.i.f$a */
    public static class a {

        /* renamed from: a */
        private static final C1339f f7143a = new C1339f(0);
    }

    /* synthetic */ C1339f(byte b4) {
        this();
    }

    /* renamed from: a */
    public final void m5596a(String str, String str2, String str3) {
        this.f7142d.m5598a(str, str2, str3);
    }

    private C1339f() {
        this.f7139a = new C1336c();
        this.f7141c = new HandlerC1337d();
        this.f7142d = new HandlerC1340g();
    }

    /* renamed from: a */
    public final void m5594a(int i4) {
        C1293a c1293a = this.f7140b;
        if (c1293a != null) {
            c1293a.m5492a(m5593a("flow_limit", i4));
        }
    }

    /* renamed from: a */
    public final void m5595a(int i4, String str) {
        if (this.f7140b != null || C1293a.m5487a().f7011d) {
            C1335b c1335bM5593a = m5593a("flow_limit_type", i4);
            c1335bM5593a.put(Constants.KEY_HTTP_CODE, str);
            this.f7140b.m5492a(c1335bM5593a);
        }
    }

    /* renamed from: a */
    public final C1335b m5593a(String str, int i4) {
        C1335b c1335b = new C1335b("efs_core", str, this.f7139a.f7133c);
        c1335b.put("cver", Integer.valueOf(i4));
        return c1335b;
    }
}
