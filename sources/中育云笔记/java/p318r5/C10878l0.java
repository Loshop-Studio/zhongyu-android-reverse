package p318r5;

import p007a6.AbstractC0063c;

/* renamed from: r5.l0 */
/* loaded from: classes5.dex */
public class C10878l0 {

    /* renamed from: b */
    public static C10878l0 f26253b = new C10878l0();

    /* renamed from: a */
    public a f26254a = new a();

    /* renamed from: r5.l0$a */
    public class a {

        /* renamed from: a */
        public String f26255a;

        /* renamed from: b */
        public String f26256b;

        /* renamed from: c */
        public long f26257c = 0;

        public a() {
        }

        /* renamed from: a */
        public void m23531a(long j10) {
            C10878l0.this.f26254a.f26257c = j10;
        }

        /* renamed from: b */
        public void m23532b(String str) {
            C10878l0.this.f26254a.f26256b = str;
        }

        /* renamed from: c */
        public void m23533c(String str) {
            C10878l0.this.f26254a.f26255a = str;
        }
    }

    /* renamed from: f */
    public static C10878l0 m23526f() {
        return f26253b;
    }

    /* renamed from: a */
    public String m23527a() {
        return this.f26254a.f26256b;
    }

    /* renamed from: c */
    public void m23528c(String str, String str2) {
        long jM23529d = m23529d();
        String strM23458d = AbstractC10864g1.m23458d(str, str2);
        if (strM23458d == null || strM23458d.isEmpty()) {
            AbstractC10861f1.m23440l("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jM23529d == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM125e = AbstractC0063c.m125e(16);
            String strM23662a = AbstractC10899v.m23662a(strM23458d, strM125e);
            this.f26254a.m23531a(jCurrentTimeMillis);
            this.f26254a.m23533c(strM125e);
            this.f26254a.m23532b(strM23662a);
            return;
        }
        if (System.currentTimeMillis() - jM23529d > 43200000) {
            String strM125e2 = AbstractC0063c.m125e(16);
            String strM23662a2 = AbstractC10899v.m23662a(strM23458d, strM125e2);
            this.f26254a.m23531a(jM23529d);
            this.f26254a.m23533c(strM125e2);
            this.f26254a.m23532b(strM23662a2);
        }
    }

    /* renamed from: d */
    public long m23529d() {
        return this.f26254a.f26257c;
    }

    /* renamed from: e */
    public String m23530e() {
        return this.f26254a.f26255a;
    }
}
