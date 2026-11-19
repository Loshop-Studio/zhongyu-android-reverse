package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ap */
/* loaded from: classes2.dex */
public class C3342ap extends C3349aw {

    /* renamed from: a */
    public static final int f1817a = 0;

    /* renamed from: b */
    public static final int f1818b = 1;

    /* renamed from: c */
    public static final int f1819c = 2;

    /* renamed from: d */
    public static final int f1820d = 3;

    /* renamed from: e */
    public static final int f1821e = 4;

    /* renamed from: f */
    public static final int f1822f = 5;

    /* renamed from: g */
    public static final int f1823g = 6;

    /* renamed from: h */
    public static final int f1824h = 7;

    /* renamed from: j */
    private static final C3374bu f1825j = new C3374bu("TApplicationException");

    /* renamed from: k */
    private static final C3364bk f1826k = new C3364bk("message", (byte) 11, 1);

    /* renamed from: l */
    private static final C3364bk f1827l = new C3364bk("type", (byte) 8, 2);

    /* renamed from: m */
    private static final long f1828m = 1;

    /* renamed from: i */
    protected int f1829i;

    public C3342ap() {
        this.f1829i = 0;
    }

    /* renamed from: a */
    public int m2958a() {
        return this.f1829i;
    }

    /* renamed from: b */
    public void m2959b(AbstractC3369bp abstractC3369bp) throws C3349aw {
        abstractC3369bp.mo3048a(f1825j);
        if (getMessage() != null) {
            abstractC3369bp.mo3043a(f1826k);
            abstractC3369bp.mo3049a(getMessage());
            abstractC3369bp.mo3055c();
        }
        abstractC3369bp.mo3043a(f1827l);
        abstractC3369bp.mo3041a(this.f1829i);
        abstractC3369bp.mo3055c();
        abstractC3369bp.mo3057d();
        abstractC3369bp.mo3054b();
    }

    /* renamed from: a */
    public static C3342ap m2957a(AbstractC3369bp abstractC3369bp) throws C3349aw {
        abstractC3369bp.mo3064j();
        String strMo3080z = null;
        int iMo3077w = 0;
        while (true) {
            C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
            byte b4 = c3364bkMo3066l.f1907b;
            if (b4 == 0) {
                abstractC3369bp.mo3065k();
                return new C3342ap(iMo3077w, strMo3080z);
            }
            short s3 = c3364bkMo3066l.f1908c;
            if (s3 != 1) {
                if (s3 != 2) {
                    C3372bs.m3110a(abstractC3369bp, b4);
                } else if (b4 == 8) {
                    iMo3077w = abstractC3369bp.mo3077w();
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
            } else if (b4 == 11) {
                strMo3080z = abstractC3369bp.mo3080z();
            } else {
                C3372bs.m3110a(abstractC3369bp, b4);
            }
            abstractC3369bp.mo3067m();
        }
    }

    public C3342ap(int i4) {
        this.f1829i = i4;
    }

    public C3342ap(int i4, String str) {
        super(str);
        this.f1829i = i4;
    }

    public C3342ap(String str) {
        super(str);
        this.f1829i = 0;
    }
}
