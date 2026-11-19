package com.taobao.sophix.p047c;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.c.c */
/* loaded from: classes4.dex */
public class C6367c {

    /* renamed from: j */
    private static String f4921j = UUID.randomUUID().toString();

    /* renamed from: k */
    private static AtomicInteger f4922k = new AtomicInteger(0);

    /* renamed from: a */
    public String f4923a;

    /* renamed from: b */
    public int f4924b;

    /* renamed from: c */
    public String f4925c;

    /* renamed from: d */
    public int f4926d;

    /* renamed from: e */
    public long f4927e;

    /* renamed from: f */
    public int f4928f;

    /* renamed from: g */
    public long f4929g;

    /* renamed from: h */
    public int f4930h;

    /* renamed from: i */
    public int f4931i;

    public C6367c(int i10) {
        this.f4927e = -9999L;
        this.f4928f = -9999;
        this.f4929g = -9999L;
        this.f4930h = -9999;
        this.f4931i = -9999;
        this.f4923a = f4921j + "-" + f4922k.incrementAndGet();
        this.f4924b = i10;
    }

    /* renamed from: a */
    public void m4640a() {
        this.f4925c = null;
        this.f4927e = -9999L;
        this.f4931i = -9999;
    }

    /* renamed from: b */
    public String m4641b() {
        StringBuilder sb = new StringBuilder("path");
        sb.append("=");
        sb.append(this.f4924b);
        if (this.f4927e != -9999) {
            sb.append(",");
            sb.append("cost");
            sb.append("=");
            sb.append(this.f4927e);
        }
        if (this.f4929g != -9999) {
            sb.append(",");
            sb.append("dex");
            sb.append("=");
            sb.append(this.f4929g);
        }
        if (this.f4928f != -9999) {
            sb.append(",");
            sb.append("genre");
            sb.append("=");
            sb.append(this.f4928f);
        }
        if (this.f4930h != -9999) {
            sb.append(",");
            sb.append("load");
            sb.append("=");
            sb.append(this.f4930h);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PatchStat{");
        sb.append("id='");
        sb.append(this.f4923a);
        sb.append('\'');
        sb.append(", path=");
        sb.append(this.f4924b);
        sb.append(", status='");
        sb.append(this.f4925c);
        sb.append('\'');
        sb.append(", version='");
        sb.append(this.f4926d);
        sb.append('\'');
        if (this.f4927e != -9999) {
            sb.append(", cost=");
            sb.append(this.f4927e);
        }
        if (this.f4928f != -9999) {
            sb.append(", genre=");
            sb.append(this.f4928f);
        }
        if (this.f4929g != -9999) {
            sb.append(", dex=");
            sb.append(this.f4929g);
        }
        if (this.f4930h != -9999) {
            sb.append(", load=");
            sb.append(this.f4930h);
        }
        if (this.f4931i != -9999) {
            sb.append(", errorCode=");
            sb.append(this.f4931i);
        }
        sb.append('}');
        return sb.toString();
    }

    public C6367c(C6367c c6367c) {
        this.f4927e = -9999L;
        this.f4928f = -9999;
        this.f4929g = -9999L;
        this.f4930h = -9999;
        this.f4931i = -9999;
        this.f4923a = c6367c.f4923a;
        this.f4924b = c6367c.f4924b;
        this.f4925c = c6367c.f4925c;
        this.f4926d = c6367c.f4926d;
        this.f4927e = c6367c.f4927e;
        this.f4928f = c6367c.f4928f;
        this.f4929g = c6367c.f4929g;
        this.f4930h = c6367c.f4930h;
        this.f4931i = c6367c.f4931i;
    }
}
