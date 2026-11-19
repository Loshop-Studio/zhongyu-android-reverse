package com.tendcloud.tenddata;

/* renamed from: com.tendcloud.tenddata.fr */
/* loaded from: classes5.dex */
public class C7994fr extends AbstractC7987fk {

    /* renamed from: j */
    private static volatile C7994fr f14970j;

    /* renamed from: a */
    private final String f14971a = "oaid";

    /* renamed from: c */
    private final String f14972c = "vaid";

    /* renamed from: d */
    private final String f14973d = "aaid";

    /* renamed from: e */
    private final String f14974e = "udid";

    /* renamed from: f */
    private volatile String f14975f = "";

    /* renamed from: g */
    private volatile String f14976g = "";

    /* renamed from: h */
    private volatile String f14977h = "";

    /* renamed from: i */
    private volatile String f14978i = "";

    private C7994fr() {
    }

    /* renamed from: a */
    public static C7994fr m11998a() {
        if (f14970j == null) {
            synchronized (C7994fr.class) {
                try {
                    if (f14970j == null) {
                        f14970j = new C7994fr();
                    }
                } finally {
                }
            }
        }
        return f14970j;
    }

    /* renamed from: c */
    public String m11999c() {
        return this.f14975f;
    }

    /* renamed from: d */
    public String m12000d() {
        return this.f14976g;
    }

    /* renamed from: e */
    public String m12001e() {
        return this.f14977h;
    }

    /* renamed from: f */
    public String m12002f() {
        return this.f14978i;
    }

    public void setAAID(String str) {
        this.f14976g = str;
        m11979a("aaid", str);
    }

    public void setOAID(String str) {
        this.f14975f = str;
        m11979a("oaid", str);
    }

    public void setUDID(String str) {
        this.f14978i = str;
        m11979a("udid", str);
    }

    public void setVAID(String str) {
        this.f14977h = str;
        m11979a("vaid", str);
    }
}
