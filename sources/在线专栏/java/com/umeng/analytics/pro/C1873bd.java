package com.umeng.analytics.pro;

import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.bd */
/* loaded from: classes.dex */
public class C1873bd implements Serializable {

    /* renamed from: a */
    private final boolean f8441a;

    /* renamed from: b */
    public final byte f8442b;

    /* renamed from: c */
    private final String f8443c;

    /* renamed from: d */
    private final boolean f8444d;

    public C1873bd(byte b4, boolean z3) {
        this.f8442b = b4;
        this.f8441a = false;
        this.f8443c = null;
        this.f8444d = z3;
    }

    /* renamed from: a */
    public boolean m6954a() {
        return this.f8441a;
    }

    /* renamed from: b */
    public String m6955b() {
        return this.f8443c;
    }

    /* renamed from: c */
    public boolean m6956c() {
        return this.f8442b == 12;
    }

    /* renamed from: d */
    public boolean m6957d() {
        byte b4 = this.f8442b;
        return b4 == 15 || b4 == 13 || b4 == 14;
    }

    /* renamed from: e */
    public boolean m6958e() {
        return this.f8444d;
    }

    public C1873bd(byte b4) {
        this(b4, false);
    }

    public C1873bd(byte b4, String str) {
        this.f8442b = b4;
        this.f8441a = true;
        this.f8443c = str;
        this.f8444d = false;
    }
}
