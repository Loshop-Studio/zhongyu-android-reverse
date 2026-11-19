package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.bq */
/* loaded from: classes4.dex */
public final class C6468bq extends AbstractC6484m {

    /* renamed from: y */
    static byte[] f4870y = {0};

    /* renamed from: z */
    static Map<String, String> f4871z;

    /* renamed from: a */
    public int f4872a = 0;

    /* renamed from: b */
    public String f4873b = "";

    /* renamed from: c */
    public String f4874c = "";

    /* renamed from: d */
    public String f4875d = "";

    /* renamed from: e */
    public String f4876e = "";

    /* renamed from: f */
    public String f4877f = "";

    /* renamed from: g */
    public int f4878g = 0;

    /* renamed from: h */
    public byte[] f4879h = null;

    /* renamed from: i */
    public String f4880i = "";

    /* renamed from: j */
    public String f4881j = "";

    /* renamed from: k */
    public Map<String, String> f4882k = null;

    /* renamed from: l */
    public String f4883l = "";

    /* renamed from: m */
    public long f4884m = 0;

    /* renamed from: n */
    public String f4885n = "";

    /* renamed from: o */
    public String f4886o = "";

    /* renamed from: p */
    public String f4887p = "";

    /* renamed from: q */
    public long f4888q = 0;

    /* renamed from: r */
    public String f4889r = "";

    /* renamed from: s */
    public String f4890s = "";

    /* renamed from: t */
    public String f4891t = "";

    /* renamed from: u */
    public String f4892u = "";

    /* renamed from: v */
    public String f4893v = "";

    /* renamed from: w */
    public String f4894w = "";

    /* renamed from: x */
    public String f4895x = "";

    static {
        HashMap map = new HashMap();
        f4871z = map;
        map.put("", "");
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4575a(this.f4872a, 0);
        c6483l.m4579a(this.f4873b, 1);
        c6483l.m4579a(this.f4874c, 2);
        c6483l.m4579a(this.f4875d, 3);
        String str = this.f4876e;
        if (str != null) {
            c6483l.m4579a(str, 4);
        }
        c6483l.m4579a(this.f4877f, 5);
        c6483l.m4575a(this.f4878g, 6);
        c6483l.m4584a(this.f4879h, 7);
        String str2 = this.f4880i;
        if (str2 != null) {
            c6483l.m4579a(str2, 8);
        }
        String str3 = this.f4881j;
        if (str3 != null) {
            c6483l.m4579a(str3, 9);
        }
        Map<String, String> map = this.f4882k;
        if (map != null) {
            c6483l.m4581a((Map) map, 10);
        }
        String str4 = this.f4883l;
        if (str4 != null) {
            c6483l.m4579a(str4, 11);
        }
        c6483l.m4576a(this.f4884m, 12);
        String str5 = this.f4885n;
        if (str5 != null) {
            c6483l.m4579a(str5, 13);
        }
        String str6 = this.f4886o;
        if (str6 != null) {
            c6483l.m4579a(str6, 14);
        }
        String str7 = this.f4887p;
        if (str7 != null) {
            c6483l.m4579a(str7, 15);
        }
        c6483l.m4576a(this.f4888q, 16);
        String str8 = this.f4889r;
        if (str8 != null) {
            c6483l.m4579a(str8, 17);
        }
        String str9 = this.f4890s;
        if (str9 != null) {
            c6483l.m4579a(str9, 18);
        }
        String str10 = this.f4891t;
        if (str10 != null) {
            c6483l.m4579a(str10, 19);
        }
        String str11 = this.f4892u;
        if (str11 != null) {
            c6483l.m4579a(str11, 20);
        }
        String str12 = this.f4893v;
        if (str12 != null) {
            c6483l.m4579a(str12, 21);
        }
        String str13 = this.f4894w;
        if (str13 != null) {
            c6483l.m4579a(str13, 22);
        }
        String str14 = this.f4895x;
        if (str14 != null) {
            c6483l.m4579a(str14, 23);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4872a = c6482k.m4551a(this.f4872a, 0, true);
        this.f4873b = c6482k.m4560b(1, true);
        this.f4874c = c6482k.m4560b(2, true);
        this.f4875d = c6482k.m4560b(3, true);
        this.f4876e = c6482k.m4560b(4, false);
        this.f4877f = c6482k.m4560b(5, true);
        this.f4878g = c6482k.m4551a(this.f4878g, 6, true);
        this.f4879h = c6482k.m4561c(7, true);
        this.f4880i = c6482k.m4560b(8, false);
        this.f4881j = c6482k.m4560b(9, false);
        this.f4882k = (Map) c6482k.m4555a((C6482k) f4871z, 10, false);
        this.f4883l = c6482k.m4560b(11, false);
        this.f4884m = c6482k.m4553a(this.f4884m, 12, false);
        this.f4885n = c6482k.m4560b(13, false);
        this.f4886o = c6482k.m4560b(14, false);
        this.f4887p = c6482k.m4560b(15, false);
        this.f4888q = c6482k.m4553a(this.f4888q, 16, false);
        this.f4889r = c6482k.m4560b(17, false);
        this.f4890s = c6482k.m4560b(18, false);
        this.f4891t = c6482k.m4560b(19, false);
        this.f4892u = c6482k.m4560b(20, false);
        this.f4893v = c6482k.m4560b(21, false);
        this.f4894w = c6482k.m4560b(22, false);
        this.f4895x = c6482k.m4560b(23, false);
    }
}
