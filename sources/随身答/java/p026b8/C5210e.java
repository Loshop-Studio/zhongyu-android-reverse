package p026b8;

import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.List;
import p087d8.AbstractC7789b;
import p087d8.AbstractC7790c;
import p087d8.AbstractC7791d;
import p087d8.AbstractC7792e;
import p087d8.AbstractC7793f;

/* renamed from: b8.e */
/* loaded from: classes5.dex */
public class C5210e {

    /* renamed from: a */
    public final FlatBufferBuilder f2396a = new FlatBufferBuilder();

    /* renamed from: b */
    public final List f2397b = new ArrayList();

    /* renamed from: c */
    public long f2398c = 1;

    /* renamed from: d */
    public Integer f2399d;

    /* renamed from: e */
    public Long f2400e;

    /* renamed from: f */
    public Integer f2401f;

    /* renamed from: g */
    public Long f2402g;

    /* renamed from: h */
    public Integer f2403h;

    /* renamed from: i */
    public Long f2404i;

    /* renamed from: b8.e$a */
    public class a {

        /* renamed from: a */
        public final String f2405a;

        /* renamed from: b */
        public final List f2406b = new ArrayList();

        /* renamed from: c */
        public final List f2407c = new ArrayList();

        /* renamed from: d */
        public Integer f2408d;

        /* renamed from: e */
        public Long f2409e;

        /* renamed from: f */
        public Integer f2410f;

        /* renamed from: g */
        public Integer f2411g;

        /* renamed from: h */
        public Long f2412h;

        /* renamed from: i */
        public b f2413i;

        /* renamed from: j */
        public boolean f2414j;

        public a(String str) {
            this.f2405a = str;
        }

        /* renamed from: a */
        public void m2284a() {
            b bVar = this.f2413i;
            if (bVar != null) {
                this.f2406b.add(Integer.valueOf(bVar.m2295b()));
                this.f2413i = null;
            }
        }

        /* renamed from: b */
        public final void m2285b() {
            if (this.f2414j) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: c */
        public C5210e m2286c() {
            m2285b();
            m2284a();
            this.f2414j = true;
            int iCreateString = C5210e.this.f2396a.createString(this.f2405a);
            int iM2279b = C5210e.this.m2279b(this.f2406b);
            int iM2279b2 = this.f2407c.isEmpty() ? 0 : C5210e.this.m2279b(this.f2407c);
            AbstractC7791d.m12141h(C5210e.this.f2396a);
            AbstractC7791d.m12137d(C5210e.this.f2396a, iCreateString);
            AbstractC7791d.m12138e(C5210e.this.f2396a, iM2279b);
            if (iM2279b2 != 0) {
                AbstractC7791d.m12139f(C5210e.this.f2396a, iM2279b2);
            }
            if (this.f2408d != null && this.f2409e != null) {
                AbstractC7791d.m12135b(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, r0.intValue(), this.f2409e.longValue()));
            }
            if (this.f2411g != null) {
                AbstractC7791d.m12136c(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, r0.intValue(), this.f2412h.longValue()));
            }
            if (this.f2410f != null) {
                AbstractC7791d.m12134a(C5210e.this.f2396a, r0.intValue());
            }
            C5210e c5210e = C5210e.this;
            c5210e.f2397b.add(Integer.valueOf(AbstractC7791d.m12140g(c5210e.f2396a)));
            return C5210e.this;
        }

        /* renamed from: d */
        public a m2287d(int i9) {
            this.f2410f = Integer.valueOf(i9);
            return this;
        }

        /* renamed from: e */
        public a m2288e(int i9, long j9) {
            m2285b();
            this.f2408d = Integer.valueOf(i9);
            this.f2409e = Long.valueOf(j9);
            return this;
        }

        /* renamed from: f */
        public a m2289f(int i9, long j9) {
            m2285b();
            this.f2411g = Integer.valueOf(i9);
            this.f2412h = Long.valueOf(j9);
            return this;
        }

        /* renamed from: g */
        public b m2290g(String str, int i9) {
            return m2291h(str, null, i9);
        }

        /* renamed from: h */
        public b m2291h(String str, String str2, int i9) {
            return m2292i(str, str2, null, i9);
        }

        /* renamed from: i */
        public b m2292i(String str, String str2, String str3, int i9) {
            m2285b();
            m2284a();
            b bVar = C5210e.this.new b(str, str2, str3, i9);
            this.f2413i = bVar;
            return bVar;
        }

        /* renamed from: j */
        public a m2293j(String str, int i9, long j9, int i10, long j10) {
            m2285b();
            m2284a();
            int iCreateString = C5210e.this.f2396a.createString(str);
            AbstractC7793f.m12157e(C5210e.this.f2396a);
            AbstractC7793f.m12154b(C5210e.this.f2396a, iCreateString);
            AbstractC7793f.m12153a(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, i9, j9));
            AbstractC7793f.m12155c(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, i10, j10));
            this.f2407c.add(Integer.valueOf(AbstractC7793f.m12156d(C5210e.this.f2396a)));
            return this;
        }
    }

    /* renamed from: b8.e$b */
    public class b {

        /* renamed from: a */
        public final int f2416a;

        /* renamed from: b */
        public final int f2417b;

        /* renamed from: c */
        public final int f2418c;

        /* renamed from: d */
        public final int f2419d;

        /* renamed from: e */
        public int f2420e;

        /* renamed from: f */
        public boolean f2421f;

        /* renamed from: g */
        public int f2422g;

        /* renamed from: h */
        public int f2423h;

        /* renamed from: i */
        public long f2424i;

        /* renamed from: j */
        public int f2425j;

        /* renamed from: k */
        public long f2426k;

        /* renamed from: l */
        public int f2427l;

        public b(String str, String str2, String str3, int i9) {
            this.f2416a = i9;
            this.f2418c = C5210e.this.f2396a.createString(str);
            this.f2419d = str2 != null ? C5210e.this.f2396a.createString(str2) : 0;
            this.f2417b = str3 != null ? C5210e.this.f2396a.createString(str3) : 0;
        }

        /* renamed from: a */
        public final void m2294a() {
            if (this.f2421f) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: b */
        public int m2295b() {
            m2294a();
            this.f2421f = true;
            AbstractC7792e.m12152k(C5210e.this.f2396a);
            AbstractC7792e.m12146e(C5210e.this.f2396a, this.f2418c);
            int i9 = this.f2419d;
            if (i9 != 0) {
                AbstractC7792e.m12148g(C5210e.this.f2396a, i9);
            }
            int i10 = this.f2417b;
            if (i10 != 0) {
                AbstractC7792e.m12150i(C5210e.this.f2396a, i10);
            }
            int i11 = this.f2420e;
            if (i11 != 0) {
                AbstractC7792e.m12147f(C5210e.this.f2396a, i11);
            }
            int i12 = this.f2423h;
            if (i12 != 0) {
                AbstractC7792e.m12143b(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, i12, this.f2424i));
            }
            int i13 = this.f2425j;
            if (i13 != 0) {
                AbstractC7792e.m12144c(C5210e.this.f2396a, AbstractC7789b.m12124a(C5210e.this.f2396a, i13, this.f2426k));
            }
            int i14 = this.f2427l;
            if (i14 > 0) {
                AbstractC7792e.m12145d(C5210e.this.f2396a, i14);
            }
            AbstractC7792e.m12149h(C5210e.this.f2396a, this.f2416a);
            int i15 = this.f2422g;
            if (i15 != 0) {
                AbstractC7792e.m12142a(C5210e.this.f2396a, i15);
            }
            return AbstractC7792e.m12151j(C5210e.this.f2396a);
        }

        /* renamed from: c */
        public b m2296c(int i9) {
            m2294a();
            this.f2422g = i9;
            return this;
        }

        /* renamed from: d */
        public b m2297d(int i9, long j9) {
            m2294a();
            this.f2423h = i9;
            this.f2424i = j9;
            return this;
        }

        /* renamed from: e */
        public b m2298e(int i9, long j9) {
            m2294a();
            this.f2425j = i9;
            this.f2426k = j9;
            return this;
        }
    }

    /* renamed from: a */
    public byte[] m2278a() {
        int iCreateString = this.f2396a.createString("default");
        int iM2279b = m2279b(this.f2397b);
        AbstractC7790c.m12133i(this.f2396a);
        AbstractC7790c.m12130f(this.f2396a, iCreateString);
        AbstractC7790c.m12129e(this.f2396a, 2L);
        AbstractC7790c.m12131g(this.f2396a, 1L);
        AbstractC7790c.m12125a(this.f2396a, iM2279b);
        if (this.f2399d != null) {
            AbstractC7790c.m12126b(this.f2396a, AbstractC7789b.m12124a(this.f2396a, r0.intValue(), this.f2400e.longValue()));
        }
        if (this.f2401f != null) {
            AbstractC7790c.m12127c(this.f2396a, AbstractC7789b.m12124a(this.f2396a, r0.intValue(), this.f2402g.longValue()));
        }
        if (this.f2403h != null) {
            AbstractC7790c.m12128d(this.f2396a, AbstractC7789b.m12124a(this.f2396a, r0.intValue(), this.f2404i.longValue()));
        }
        this.f2396a.finish(AbstractC7790c.m12132h(this.f2396a));
        return this.f2396a.sizedByteArray();
    }

    /* renamed from: b */
    public int m2279b(List list) {
        int[] iArr = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr[i9] = ((Integer) list.get(i9)).intValue();
        }
        return this.f2396a.createVectorOfTables(iArr);
    }

    /* renamed from: c */
    public a m2280c(String str) {
        return new a(str);
    }

    /* renamed from: d */
    public C5210e m2281d(int i9, long j9) {
        this.f2399d = Integer.valueOf(i9);
        this.f2400e = Long.valueOf(j9);
        return this;
    }

    /* renamed from: e */
    public C5210e m2282e(int i9, long j9) {
        this.f2401f = Integer.valueOf(i9);
        this.f2402g = Long.valueOf(j9);
        return this;
    }

    /* renamed from: f */
    public C5210e m2283f(int i9, long j9) {
        this.f2403h = Integer.valueOf(i9);
        this.f2404i = Long.valueOf(j9);
        return this;
    }
}
