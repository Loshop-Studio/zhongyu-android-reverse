package com.liulishuo.okdownload;

import android.net.Uri;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p207q1.C8879d;
import p207q1.InterfaceC8876a;
import p218r1.AbstractC8997a;
import p218r1.AbstractC8999c;
import p229s1.C9126c;
import p262v1.C9660g;

/* renamed from: com.liulishuo.okdownload.a */
/* loaded from: classes2.dex */
public class C6327a extends AbstractC8997a implements Comparable {

    /* renamed from: b */
    public final int f4663b;

    /* renamed from: c */
    public final String f4664c;

    /* renamed from: d */
    public final Uri f4665d;

    /* renamed from: e */
    public final Map f4666e;

    /* renamed from: f */
    public C9126c f4667f;

    /* renamed from: g */
    public final int f4668g;

    /* renamed from: h */
    public final int f4669h;

    /* renamed from: i */
    public final int f4670i;

    /* renamed from: j */
    public final int f4671j;

    /* renamed from: k */
    public final int f4672k;

    /* renamed from: l */
    public final Integer f4673l;

    /* renamed from: m */
    public final Boolean f4674m;

    /* renamed from: n */
    public final boolean f4675n;

    /* renamed from: o */
    public final boolean f4676o;

    /* renamed from: p */
    public final int f4677p;

    /* renamed from: q */
    public volatile InterfaceC8876a f4678q;

    /* renamed from: r */
    public final boolean f4679r;

    /* renamed from: s */
    public final AtomicLong f4680s = new AtomicLong();

    /* renamed from: t */
    public final boolean f4681t;

    /* renamed from: u */
    public final C9660g.a f4682u;

    /* renamed from: v */
    public final File f4683v;

    /* renamed from: w */
    public final File f4684w;

    /* renamed from: x */
    public File f4685x;

    /* renamed from: y */
    public String f4686y;

    /* renamed from: com.liulishuo.okdownload.a$b */
    public static class b extends AbstractC8997a {

        /* renamed from: b */
        public final int f4703b;

        /* renamed from: c */
        public final String f4704c;

        /* renamed from: d */
        public final File f4705d;

        /* renamed from: e */
        public final String f4706e;

        /* renamed from: f */
        public final File f4707f;

        public b(int i10, C6327a c6327a) {
            this.f4703b = i10;
            this.f4704c = c6327a.f4664c;
            this.f4707f = c6327a.mo4386d();
            this.f4705d = c6327a.f4683v;
            this.f4706e = c6327a.mo4384b();
        }

        @Override // p218r1.AbstractC8997a
        /* renamed from: b */
        public String mo4384b() {
            return this.f4706e;
        }

        @Override // p218r1.AbstractC8997a
        /* renamed from: c */
        public int mo4385c() {
            return this.f4703b;
        }

        @Override // p218r1.AbstractC8997a
        /* renamed from: d */
        public File mo4386d() {
            return this.f4707f;
        }

        @Override // p218r1.AbstractC8997a
        /* renamed from: e */
        public File mo4387e() {
            return this.f4705d;
        }

        @Override // p218r1.AbstractC8997a
        /* renamed from: f */
        public String mo4388f() {
            return this.f4704c;
        }
    }

    /* renamed from: com.liulishuo.okdownload.a$c */
    public static class c {
        /* renamed from: a */
        public static long m4410a(C6327a c6327a) {
            return c6327a.m4397q();
        }

        /* renamed from: b */
        public static void m4411b(C6327a c6327a, C9126c c9126c) {
            c6327a.m4381G(c9126c);
        }

        /* renamed from: c */
        public static void m4412c(C6327a c6327a, long j10) {
            c6327a.m4382H(j10);
        }
    }

    public C6327a(String str, Uri uri, int i10, int i11, int i12, int i13, int i14, boolean z9, int i15, Map map, String str2, boolean z10, boolean z11, Boolean bool, Integer num, Boolean bool2) {
        Boolean bool3;
        this.f4664c = str;
        this.f4665d = uri;
        this.f4668g = i10;
        this.f4669h = i11;
        this.f4670i = i12;
        this.f4671j = i13;
        this.f4672k = i14;
        this.f4676o = z9;
        this.f4677p = i15;
        this.f4666e = map;
        this.f4675n = z10;
        this.f4679r = z11;
        this.f4673l = num;
        this.f4674m = bool2;
        if (AbstractC8999c.m15136t(uri)) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        throw new IllegalArgumentException("If you want filename from response please make sure you provide path is directory " + file.getPath());
                    }
                    if (!AbstractC8999c.m15132p(str2)) {
                        AbstractC8999c.m15142z("DownloadTask", "Discard filename[" + str2 + "] because you set filenameFromResponse=true");
                        str2 = null;
                    }
                    this.f4684w = file;
                } else {
                    if (file.exists() && file.isDirectory() && AbstractC8999c.m15132p(str2)) {
                        throw new IllegalArgumentException("If you don't want filename from response please make sure you have already provided valid filename or not directory path " + file.getPath());
                    }
                    if (AbstractC8999c.m15132p(str2)) {
                        str2 = file.getName();
                        this.f4684w = AbstractC8999c.m15128l(file);
                    } else {
                        this.f4684w = file;
                    }
                }
                bool3 = bool;
            } else if (file.exists() && file.isDirectory()) {
                bool3 = Boolean.TRUE;
                this.f4684w = file;
            } else {
                bool3 = Boolean.FALSE;
                if (file.exists()) {
                    if (!AbstractC8999c.m15132p(str2) && !file.getName().equals(str2)) {
                        throw new IllegalArgumentException("Uri already provided filename!");
                    }
                    str2 = file.getName();
                    this.f4684w = AbstractC8999c.m15128l(file);
                } else if (AbstractC8999c.m15132p(str2)) {
                    str2 = file.getName();
                    this.f4684w = AbstractC8999c.m15128l(file);
                } else {
                    this.f4684w = file;
                }
            }
            this.f4681t = bool3.booleanValue();
        } else {
            this.f4681t = false;
            this.f4684w = new File(uri.getPath());
        }
        if (AbstractC8999c.m15132p(str2)) {
            this.f4682u = new C9660g.a();
            this.f4683v = this.f4684w;
        } else {
            this.f4682u = new C9660g.a(str2);
            File file2 = new File(this.f4684w, str2);
            this.f4685x = file2;
            this.f4683v = file2;
        }
        this.f4663b = C8879d.m14905k().m14906a().mo15503f(this);
    }

    /* renamed from: A */
    public Uri m4375A() {
        return this.f4665d;
    }

    /* renamed from: B */
    public boolean m4376B() {
        return this.f4676o;
    }

    /* renamed from: C */
    public boolean m4377C() {
        return this.f4681t;
    }

    /* renamed from: D */
    public boolean m4378D() {
        return this.f4675n;
    }

    /* renamed from: E */
    public boolean m4379E() {
        return this.f4679r;
    }

    /* renamed from: F */
    public b m4380F(int i10) {
        return new b(i10, this);
    }

    /* renamed from: G */
    public void m4381G(C9126c c9126c) {
        this.f4667f = c9126c;
    }

    /* renamed from: H */
    public void m4382H(long j10) {
        this.f4680s.set(j10);
    }

    /* renamed from: I */
    public void m4383I(String str) {
        this.f4686y = str;
    }

    @Override // p218r1.AbstractC8997a
    /* renamed from: b */
    public String mo4384b() {
        return this.f4682u.m16150a();
    }

    @Override // p218r1.AbstractC8997a
    /* renamed from: c */
    public int mo4385c() {
        return this.f4663b;
    }

    @Override // p218r1.AbstractC8997a
    /* renamed from: d */
    public File mo4386d() {
        return this.f4684w;
    }

    @Override // p218r1.AbstractC8997a
    /* renamed from: e */
    public File mo4387e() {
        return this.f4683v;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof C6327a)) {
            return false;
        }
        C6327a c6327a = (C6327a) obj;
        if (c6327a.f4663b == this.f4663b) {
            return true;
        }
        return m15113a(c6327a);
    }

    @Override // p218r1.AbstractC8997a
    /* renamed from: f */
    public String mo4388f() {
        return this.f4664c;
    }

    public int hashCode() {
        return (this.f4664c + this.f4683v.toString() + this.f4682u.m16150a()).hashCode();
    }

    /* renamed from: i */
    public void m4389i() {
        C8879d.m14905k().m14910e().m15917a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6327a c6327a) {
        return c6327a.m4400t() - m4400t();
    }

    /* renamed from: k */
    public void m4391k(InterfaceC8876a interfaceC8876a) {
        this.f4678q = interfaceC8876a;
        C8879d.m14905k().m14910e().m15919c(this);
    }

    /* renamed from: l */
    public File m4392l() {
        String strM16150a = this.f4682u.m16150a();
        if (strM16150a == null) {
            return null;
        }
        if (this.f4685x == null) {
            this.f4685x = new File(this.f4684w, strM16150a);
        }
        return this.f4685x;
    }

    /* renamed from: m */
    public C9660g.a m4393m() {
        return this.f4682u;
    }

    /* renamed from: n */
    public int m4394n() {
        return this.f4670i;
    }

    /* renamed from: o */
    public Map m4395o() {
        return this.f4666e;
    }

    /* renamed from: p */
    public C9126c m4396p() {
        if (this.f4667f == null) {
            this.f4667f = C8879d.m14905k().m14906a().get(this.f4663b);
        }
        return this.f4667f;
    }

    /* renamed from: q */
    public long m4397q() {
        return this.f4680s.get();
    }

    /* renamed from: r */
    public InterfaceC8876a m4398r() {
        return this.f4678q;
    }

    /* renamed from: s */
    public int m4399s() {
        return this.f4677p;
    }

    /* renamed from: t */
    public int m4400t() {
        return this.f4668g;
    }

    public String toString() {
        return super.toString() + "@" + this.f4663b + "@" + this.f4664c + "@" + this.f4684w.toString() + "/" + this.f4682u.m16150a();
    }

    /* renamed from: u */
    public int m4401u() {
        return this.f4669h;
    }

    /* renamed from: v */
    public String m4402v() {
        return this.f4686y;
    }

    /* renamed from: w */
    public Integer m4403w() {
        return this.f4673l;
    }

    /* renamed from: x */
    public Boolean m4404x() {
        return this.f4674m;
    }

    /* renamed from: y */
    public int m4405y() {
        return this.f4672k;
    }

    /* renamed from: z */
    public int m4406z() {
        return this.f4671j;
    }

    /* renamed from: com.liulishuo.okdownload.a$a */
    public static class a {

        /* renamed from: a */
        public final String f4687a;

        /* renamed from: b */
        public final Uri f4688b;

        /* renamed from: c */
        public volatile Map f4689c;

        /* renamed from: d */
        public int f4690d;

        /* renamed from: e */
        public int f4691e;

        /* renamed from: f */
        public int f4692f;

        /* renamed from: g */
        public int f4693g;

        /* renamed from: h */
        public int f4694h;

        /* renamed from: i */
        public boolean f4695i;

        /* renamed from: j */
        public int f4696j;

        /* renamed from: k */
        public String f4697k;

        /* renamed from: l */
        public boolean f4698l;

        /* renamed from: m */
        public boolean f4699m;

        /* renamed from: n */
        public Boolean f4700n;

        /* renamed from: o */
        public Integer f4701o;

        /* renamed from: p */
        public Boolean f4702p;

        public a(String str, String str2, String str3) {
            this(str, Uri.fromFile(new File(str2)));
            if (AbstractC8999c.m15132p(str3)) {
                this.f4700n = Boolean.TRUE;
            } else {
                this.f4697k = str3;
            }
        }

        /* renamed from: a */
        public C6327a m4407a() {
            return new C6327a(this.f4687a, this.f4688b, this.f4690d, this.f4691e, this.f4692f, this.f4693g, this.f4694h, this.f4695i, this.f4696j, this.f4689c, this.f4697k, this.f4698l, this.f4699m, this.f4700n, this.f4701o, this.f4702p);
        }

        /* renamed from: b */
        public a m4408b(int i10) {
            this.f4696j = i10;
            return this;
        }

        /* renamed from: c */
        public a m4409c(boolean z9) {
            this.f4698l = z9;
            return this;
        }

        public a(String str, File file) {
            this.f4691e = 4096;
            this.f4692f = 16384;
            this.f4693g = 65536;
            this.f4694h = 2000;
            this.f4695i = true;
            this.f4696j = 3000;
            this.f4698l = true;
            this.f4699m = false;
            this.f4687a = str;
            this.f4688b = Uri.fromFile(file);
        }

        public a(String str, Uri uri) {
            this.f4691e = 4096;
            this.f4692f = 16384;
            this.f4693g = 65536;
            this.f4694h = 2000;
            this.f4695i = true;
            this.f4696j = 3000;
            this.f4698l = true;
            this.f4699m = false;
            this.f4687a = str;
            this.f4688b = uri;
            if (AbstractC8999c.m15135s(uri)) {
                this.f4697k = AbstractC8999c.m15126j(uri);
            }
        }
    }
}
