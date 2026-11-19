package com.liulishuo.okdownload;

import android.net.Uri;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p209p1.C9315d;
import p209p1.InterfaceC9312a;
import p219q1.AbstractC9351a;
import p219q1.AbstractC9353c;
import p229r1.C9419c;
import p259u1.C9665g;

/* renamed from: com.liulishuo.okdownload.a */
/* loaded from: classes4.dex */
public class C6593a extends AbstractC9351a implements Comparable {

    /* renamed from: b */
    public final int f5271b;

    /* renamed from: c */
    public final String f5272c;

    /* renamed from: d */
    public final Uri f5273d;

    /* renamed from: e */
    public final Map f5274e;

    /* renamed from: f */
    public C9419c f5275f;

    /* renamed from: g */
    public final int f5276g;

    /* renamed from: h */
    public final int f5277h;

    /* renamed from: i */
    public final int f5278i;

    /* renamed from: j */
    public final int f5279j;

    /* renamed from: k */
    public final int f5280k;

    /* renamed from: l */
    public final Integer f5281l;

    /* renamed from: m */
    public final Boolean f5282m;

    /* renamed from: n */
    public final boolean f5283n;

    /* renamed from: o */
    public final boolean f5284o;

    /* renamed from: p */
    public final int f5285p;

    /* renamed from: q */
    public volatile InterfaceC9312a f5286q;

    /* renamed from: r */
    public final boolean f5287r;

    /* renamed from: s */
    public final AtomicLong f5288s = new AtomicLong();

    /* renamed from: t */
    public final boolean f5289t;

    /* renamed from: u */
    public final C9665g.a f5290u;

    /* renamed from: v */
    public final File f5291v;

    /* renamed from: w */
    public final File f5292w;

    /* renamed from: x */
    public File f5293x;

    /* renamed from: y */
    public String f5294y;

    /* renamed from: com.liulishuo.okdownload.a$b */
    public static class b extends AbstractC9351a {

        /* renamed from: b */
        public final int f5311b;

        /* renamed from: c */
        public final String f5312c;

        /* renamed from: d */
        public final File f5313d;

        /* renamed from: e */
        public final String f5314e;

        /* renamed from: f */
        public final File f5315f;

        public b(int i9, C6593a c6593a) {
            this.f5311b = i9;
            this.f5312c = c6593a.f5272c;
            this.f5315f = c6593a.mo4590d();
            this.f5313d = c6593a.f5291v;
            this.f5314e = c6593a.mo4588b();
        }

        @Override // p219q1.AbstractC9351a
        /* renamed from: b */
        public String mo4588b() {
            return this.f5314e;
        }

        @Override // p219q1.AbstractC9351a
        /* renamed from: c */
        public int mo4589c() {
            return this.f5311b;
        }

        @Override // p219q1.AbstractC9351a
        /* renamed from: d */
        public File mo4590d() {
            return this.f5315f;
        }

        @Override // p219q1.AbstractC9351a
        /* renamed from: e */
        public File mo4591e() {
            return this.f5313d;
        }

        @Override // p219q1.AbstractC9351a
        /* renamed from: f */
        public String mo4592f() {
            return this.f5312c;
        }
    }

    /* renamed from: com.liulishuo.okdownload.a$c */
    public static class c {
        /* renamed from: a */
        public static long m4615a(C6593a c6593a) {
            return c6593a.m4601q();
        }

        /* renamed from: b */
        public static void m4616b(C6593a c6593a, C9419c c9419c) {
            c6593a.m4585G(c9419c);
        }

        /* renamed from: c */
        public static void m4617c(C6593a c6593a, long j9) {
            c6593a.m4586H(j9);
        }
    }

    public C6593a(String str, Uri uri, int i9, int i10, int i11, int i12, int i13, boolean z9, int i14, Map map, String str2, boolean z10, boolean z11, Boolean bool, Integer num, Boolean bool2) {
        Boolean bool3;
        this.f5272c = str;
        this.f5273d = uri;
        this.f5276g = i9;
        this.f5277h = i10;
        this.f5278i = i11;
        this.f5279j = i12;
        this.f5280k = i13;
        this.f5284o = z9;
        this.f5285p = i14;
        this.f5274e = map;
        this.f5283n = z10;
        this.f5287r = z11;
        this.f5281l = num;
        this.f5282m = bool2;
        if (AbstractC9353c.m15317t(uri)) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        throw new IllegalArgumentException("If you want filename from response please make sure you provide path is directory " + file.getPath());
                    }
                    if (!AbstractC9353c.m15313p(str2)) {
                        AbstractC9353c.m15323z("DownloadTask", "Discard filename[" + str2 + "] because you set filenameFromResponse=true");
                        str2 = null;
                    }
                    this.f5292w = file;
                } else {
                    if (file.exists() && file.isDirectory() && AbstractC9353c.m15313p(str2)) {
                        throw new IllegalArgumentException("If you don't want filename from response please make sure you have already provided valid filename or not directory path " + file.getPath());
                    }
                    if (AbstractC9353c.m15313p(str2)) {
                        str2 = file.getName();
                        this.f5292w = AbstractC9353c.m15309l(file);
                    } else {
                        this.f5292w = file;
                    }
                }
                bool3 = bool;
            } else if (file.exists() && file.isDirectory()) {
                bool3 = Boolean.TRUE;
                this.f5292w = file;
            } else {
                bool3 = Boolean.FALSE;
                if (file.exists()) {
                    if (!AbstractC9353c.m15313p(str2) && !file.getName().equals(str2)) {
                        throw new IllegalArgumentException("Uri already provided filename!");
                    }
                    str2 = file.getName();
                    this.f5292w = AbstractC9353c.m15309l(file);
                } else if (AbstractC9353c.m15313p(str2)) {
                    str2 = file.getName();
                    this.f5292w = AbstractC9353c.m15309l(file);
                } else {
                    this.f5292w = file;
                }
            }
            this.f5289t = bool3.booleanValue();
        } else {
            this.f5289t = false;
            this.f5292w = new File(uri.getPath());
        }
        if (AbstractC9353c.m15313p(str2)) {
            this.f5290u = new C9665g.a();
            this.f5291v = this.f5292w;
        } else {
            this.f5290u = new C9665g.a(str2);
            File file2 = new File(this.f5292w, str2);
            this.f5293x = file2;
            this.f5291v = file2;
        }
        this.f5271b = C9315d.m15182k().m15183a().mo15555c(this);
    }

    /* renamed from: A */
    public Uri m4579A() {
        return this.f5273d;
    }

    /* renamed from: B */
    public boolean m4580B() {
        return this.f5284o;
    }

    /* renamed from: C */
    public boolean m4581C() {
        return this.f5289t;
    }

    /* renamed from: D */
    public boolean m4582D() {
        return this.f5283n;
    }

    /* renamed from: E */
    public boolean m4583E() {
        return this.f5287r;
    }

    /* renamed from: F */
    public b m4584F(int i9) {
        return new b(i9, this);
    }

    /* renamed from: G */
    public void m4585G(C9419c c9419c) {
        this.f5275f = c9419c;
    }

    /* renamed from: H */
    public void m4586H(long j9) {
        this.f5288s.set(j9);
    }

    /* renamed from: I */
    public void m4587I(String str) {
        this.f5294y = str;
    }

    @Override // p219q1.AbstractC9351a
    /* renamed from: b */
    public String mo4588b() {
        return this.f5290u.m16111a();
    }

    @Override // p219q1.AbstractC9351a
    /* renamed from: c */
    public int mo4589c() {
        return this.f5271b;
    }

    @Override // p219q1.AbstractC9351a
    /* renamed from: d */
    public File mo4590d() {
        return this.f5292w;
    }

    @Override // p219q1.AbstractC9351a
    /* renamed from: e */
    public File mo4591e() {
        return this.f5291v;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof C6593a)) {
            return false;
        }
        C6593a c6593a = (C6593a) obj;
        if (c6593a.f5271b == this.f5271b) {
            return true;
        }
        return m15294a(c6593a);
    }

    @Override // p219q1.AbstractC9351a
    /* renamed from: f */
    public String mo4592f() {
        return this.f5272c;
    }

    public int hashCode() {
        return (this.f5272c + this.f5291v.toString() + this.f5290u.m16111a()).hashCode();
    }

    /* renamed from: i */
    public void m4593i() {
        C9315d.m15182k().m15187e().m15848a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6593a c6593a) {
        return c6593a.m4604t() - m4604t();
    }

    /* renamed from: k */
    public void m4595k(InterfaceC9312a interfaceC9312a) {
        this.f5286q = interfaceC9312a;
        C9315d.m15182k().m15187e().m15850c(this);
    }

    /* renamed from: l */
    public File m4596l() {
        String strM16111a = this.f5290u.m16111a();
        if (strM16111a == null) {
            return null;
        }
        if (this.f5293x == null) {
            this.f5293x = new File(this.f5292w, strM16111a);
        }
        return this.f5293x;
    }

    /* renamed from: m */
    public C9665g.a m4597m() {
        return this.f5290u;
    }

    /* renamed from: n */
    public int m4598n() {
        return this.f5278i;
    }

    /* renamed from: o */
    public Map m4599o() {
        return this.f5274e;
    }

    /* renamed from: p */
    public C9419c m4600p() {
        if (this.f5275f == null) {
            this.f5275f = C9315d.m15182k().m15183a().get(this.f5271b);
        }
        return this.f5275f;
    }

    /* renamed from: q */
    public long m4601q() {
        return this.f5288s.get();
    }

    /* renamed from: r */
    public InterfaceC9312a m4602r() {
        return this.f5286q;
    }

    /* renamed from: s */
    public int m4603s() {
        return this.f5285p;
    }

    /* renamed from: t */
    public int m4604t() {
        return this.f5276g;
    }

    public String toString() {
        return super.toString() + "@" + this.f5271b + "@" + this.f5272c + "@" + this.f5292w.toString() + "/" + this.f5290u.m16111a();
    }

    /* renamed from: u */
    public int m4605u() {
        return this.f5277h;
    }

    /* renamed from: v */
    public String m4606v() {
        return this.f5294y;
    }

    /* renamed from: w */
    public Integer m4607w() {
        return this.f5281l;
    }

    /* renamed from: x */
    public Boolean m4608x() {
        return this.f5282m;
    }

    /* renamed from: y */
    public int m4609y() {
        return this.f5280k;
    }

    /* renamed from: z */
    public int m4610z() {
        return this.f5279j;
    }

    /* renamed from: com.liulishuo.okdownload.a$a */
    public static class a {

        /* renamed from: a */
        public final String f5295a;

        /* renamed from: b */
        public final Uri f5296b;

        /* renamed from: c */
        public volatile Map f5297c;

        /* renamed from: d */
        public int f5298d;

        /* renamed from: e */
        public int f5299e;

        /* renamed from: f */
        public int f5300f;

        /* renamed from: g */
        public int f5301g;

        /* renamed from: h */
        public int f5302h;

        /* renamed from: i */
        public boolean f5303i;

        /* renamed from: j */
        public int f5304j;

        /* renamed from: k */
        public String f5305k;

        /* renamed from: l */
        public boolean f5306l;

        /* renamed from: m */
        public boolean f5307m;

        /* renamed from: n */
        public Boolean f5308n;

        /* renamed from: o */
        public Integer f5309o;

        /* renamed from: p */
        public Boolean f5310p;

        public a(String str, String str2, String str3) {
            this(str, Uri.fromFile(new File(str2)));
            if (AbstractC9353c.m15313p(str3)) {
                this.f5308n = Boolean.TRUE;
            } else {
                this.f5305k = str3;
            }
        }

        /* renamed from: a */
        public C6593a m4611a() {
            return new C6593a(this.f5295a, this.f5296b, this.f5298d, this.f5299e, this.f5300f, this.f5301g, this.f5302h, this.f5303i, this.f5304j, this.f5297c, this.f5305k, this.f5306l, this.f5307m, this.f5308n, this.f5309o, this.f5310p);
        }

        /* renamed from: b */
        public a m4612b(int i9) {
            this.f5304j = i9;
            return this;
        }

        /* renamed from: c */
        public a m4613c(boolean z9) {
            this.f5306l = z9;
            return this;
        }

        /* renamed from: d */
        public a m4614d(int i9) {
            this.f5298d = i9;
            return this;
        }

        public a(String str, File file) {
            this.f5299e = 4096;
            this.f5300f = 16384;
            this.f5301g = 65536;
            this.f5302h = 2000;
            this.f5303i = true;
            this.f5304j = 3000;
            this.f5306l = true;
            this.f5307m = false;
            this.f5295a = str;
            this.f5296b = Uri.fromFile(file);
        }

        public a(String str, Uri uri) {
            this.f5299e = 4096;
            this.f5300f = 16384;
            this.f5301g = 65536;
            this.f5302h = 2000;
            this.f5303i = true;
            this.f5304j = 3000;
            this.f5306l = true;
            this.f5307m = false;
            this.f5295a = str;
            this.f5296b = uri;
            if (AbstractC9353c.m15316s(uri)) {
                this.f5305k = AbstractC9353c.m15307j(uri);
            }
        }
    }
}
