package com.taobao.sophix.p064c;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.c.c */
/* loaded from: classes4.dex */
public class C6627c {

    /* renamed from: j */
    private static String f5498j = UUID.randomUUID().toString();

    /* renamed from: k */
    private static AtomicInteger f5499k = new AtomicInteger(0);

    /* renamed from: a */
    public String f5500a;

    /* renamed from: b */
    public int f5501b;

    /* renamed from: c */
    public String f5502c;

    /* renamed from: d */
    public int f5503d;

    /* renamed from: e */
    public long f5504e;

    /* renamed from: f */
    public int f5505f;

    /* renamed from: g */
    public long f5506g;

    /* renamed from: h */
    public int f5507h;

    /* renamed from: i */
    public int f5508i;

    public C6627c(int i9) {
        this.f5504e = -9999L;
        this.f5505f = -9999;
        this.f5506g = -9999L;
        this.f5507h = -9999;
        this.f5508i = -9999;
        this.f5500a = f5498j + "-" + f5499k.incrementAndGet();
        this.f5501b = i9;
    }

    /* renamed from: a */
    public void m4819a() {
        this.f5502c = null;
        this.f5504e = -9999L;
        this.f5508i = -9999;
    }

    /* renamed from: b */
    public String m4820b() {
        StringBuilder sb = new StringBuilder("path");
        sb.append("=");
        sb.append(this.f5501b);
        if (this.f5504e != -9999) {
            sb.append(",");
            sb.append("cost");
            sb.append("=");
            sb.append(this.f5504e);
        }
        if (this.f5506g != -9999) {
            sb.append(",");
            sb.append("dex");
            sb.append("=");
            sb.append(this.f5506g);
        }
        if (this.f5505f != -9999) {
            sb.append(",");
            sb.append("genre");
            sb.append("=");
            sb.append(this.f5505f);
        }
        if (this.f5507h != -9999) {
            sb.append(",");
            sb.append("load");
            sb.append("=");
            sb.append(this.f5507h);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PatchStat{");
        sb.append("id='");
        sb.append(this.f5500a);
        sb.append('\'');
        sb.append(", path=");
        sb.append(this.f5501b);
        sb.append(", status='");
        sb.append(this.f5502c);
        sb.append('\'');
        sb.append(", version='");
        sb.append(this.f5503d);
        sb.append('\'');
        if (this.f5504e != -9999) {
            sb.append(", cost=");
            sb.append(this.f5504e);
        }
        if (this.f5505f != -9999) {
            sb.append(", genre=");
            sb.append(this.f5505f);
        }
        if (this.f5506g != -9999) {
            sb.append(", dex=");
            sb.append(this.f5506g);
        }
        if (this.f5507h != -9999) {
            sb.append(", load=");
            sb.append(this.f5507h);
        }
        if (this.f5508i != -9999) {
            sb.append(", errorCode=");
            sb.append(this.f5508i);
        }
        sb.append('}');
        return sb.toString();
    }

    public C6627c(C6627c c6627c) {
        this.f5504e = -9999L;
        this.f5505f = -9999;
        this.f5506g = -9999L;
        this.f5507h = -9999;
        this.f5508i = -9999;
        this.f5500a = c6627c.f5500a;
        this.f5501b = c6627c.f5501b;
        this.f5502c = c6627c.f5502c;
        this.f5503d = c6627c.f5503d;
        this.f5504e = c6627c.f5504e;
        this.f5505f = c6627c.f5505f;
        this.f5506g = c6627c.f5506g;
        this.f5507h = c6627c.f5507h;
        this.f5508i = c6627c.f5508i;
    }
}
