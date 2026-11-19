package p318r5;

/* renamed from: r5.i0 */
/* loaded from: classes5.dex */
public class C10869i0 {

    /* renamed from: a */
    public C10906y0 f26231a;

    /* renamed from: b */
    public C10906y0 f26232b;

    /* renamed from: c */
    public C10906y0 f26233c;

    /* renamed from: d */
    public C10906y0 f26234d;

    public C10869i0(String str) {
    }

    /* renamed from: a */
    public C10906y0 m23479a() {
        return this.f26233c;
    }

    /* renamed from: b */
    public C10906y0 m23480b(String str) {
        if (str.equals("oper")) {
            return m23484f();
        }
        if (str.equals("maint")) {
            return m23482d();
        }
        if (str.equals("diffprivacy")) {
            return m23479a();
        }
        if (str.equals("preins")) {
            return m23485g();
        }
        AbstractC10861f1.m23441m("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    /* renamed from: c */
    public void m23481c(C10906y0 c10906y0) {
        this.f26231a = c10906y0;
    }

    /* renamed from: d */
    public C10906y0 m23482d() {
        return this.f26231a;
    }

    /* renamed from: e */
    public void m23483e(C10906y0 c10906y0) {
        this.f26232b = c10906y0;
    }

    /* renamed from: f */
    public C10906y0 m23484f() {
        return this.f26232b;
    }

    /* renamed from: g */
    public C10906y0 m23485g() {
        return this.f26234d;
    }
}
