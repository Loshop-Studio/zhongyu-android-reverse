package com.umeng.analytics.pro;

import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.bd */
/* loaded from: classes2.dex */
public class C3357bd implements Serializable {

    /* renamed from: a */
    private final boolean f1849a;

    /* renamed from: b */
    public final byte f1850b;

    /* renamed from: c */
    private final String f1851c;

    /* renamed from: d */
    private final boolean f1852d;

    public C3357bd(byte b4, boolean z3) {
        this.f1850b = b4;
        this.f1849a = false;
        this.f1851c = null;
        this.f1852d = z3;
    }

    /* renamed from: a */
    public boolean m3031a() {
        return this.f1849a;
    }

    /* renamed from: b */
    public String m3032b() {
        return this.f1851c;
    }

    /* renamed from: c */
    public boolean m3033c() {
        return this.f1850b == 12;
    }

    /* renamed from: d */
    public boolean m3034d() {
        byte b4 = this.f1850b;
        return b4 == 15 || b4 == 13 || b4 == 14;
    }

    /* renamed from: e */
    public boolean m3035e() {
        return this.f1852d;
    }

    public C3357bd(byte b4) {
        this(b4, false);
    }

    public C3357bd(byte b4, String str) {
        this.f1850b = b4;
        this.f1849a = true;
        this.f1851c = str;
        this.f1852d = false;
    }
}
