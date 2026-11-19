package com.umeng.analytics.pro;

import com.taobao.accs.common.Constants;

/* renamed from: com.umeng.analytics.pro.ap */
/* loaded from: classes.dex */
public class C1858ap extends C1865aw {

    /* renamed from: a */
    public static final int f8409a = 0;

    /* renamed from: b */
    public static final int f8410b = 1;

    /* renamed from: c */
    public static final int f8411c = 2;

    /* renamed from: d */
    public static final int f8412d = 3;

    /* renamed from: e */
    public static final int f8413e = 4;

    /* renamed from: f */
    public static final int f8414f = 5;

    /* renamed from: g */
    public static final int f8415g = 6;

    /* renamed from: h */
    public static final int f8416h = 7;

    /* renamed from: j */
    private static final C1890bu f8417j = new C1890bu("TApplicationException");

    /* renamed from: k */
    private static final C1880bk f8418k = new C1880bk(Constants.SHARED_MESSAGE_ID_FILE, (byte) 11, 1);

    /* renamed from: l */
    private static final C1880bk f8419l = new C1880bk("type", (byte) 8, 2);

    /* renamed from: m */
    private static final long f8420m = 1;

    /* renamed from: i */
    protected int f8421i;

    public C1858ap() {
        this.f8421i = 0;
    }

    /* renamed from: a */
    public int m6881a() {
        return this.f8421i;
    }

    /* renamed from: b */
    public void m6882b(AbstractC1885bp abstractC1885bp) throws C1865aw {
        abstractC1885bp.mo6971a(f8417j);
        if (getMessage() != null) {
            abstractC1885bp.mo6966a(f8418k);
            abstractC1885bp.mo6972a(getMessage());
            abstractC1885bp.mo6978c();
        }
        abstractC1885bp.mo6966a(f8419l);
        abstractC1885bp.mo6964a(this.f8421i);
        abstractC1885bp.mo6978c();
        abstractC1885bp.mo6980d();
        abstractC1885bp.mo6977b();
    }

    /* renamed from: a */
    public static C1858ap m6880a(AbstractC1885bp abstractC1885bp) throws C1865aw {
        abstractC1885bp.mo6987j();
        String strMo7003z = null;
        int iMo7000w = 0;
        while (true) {
            C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
            byte b4 = c1880bkMo6989l.f8499b;
            if (b4 == 0) {
                abstractC1885bp.mo6988k();
                return new C1858ap(iMo7000w, strMo7003z);
            }
            short s3 = c1880bkMo6989l.f8500c;
            if (s3 != 1) {
                if (s3 != 2) {
                    C1888bs.m7033a(abstractC1885bp, b4);
                } else if (b4 == 8) {
                    iMo7000w = abstractC1885bp.mo7000w();
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
            } else if (b4 == 11) {
                strMo7003z = abstractC1885bp.mo7003z();
            } else {
                C1888bs.m7033a(abstractC1885bp, b4);
            }
            abstractC1885bp.mo6990m();
        }
    }

    public C1858ap(int i4) {
        this.f8421i = i4;
    }

    public C1858ap(int i4, String str) {
        super(str);
        this.f8421i = i4;
    }

    public C1858ap(String str) {
        super(str);
        this.f8421i = 0;
    }
}
