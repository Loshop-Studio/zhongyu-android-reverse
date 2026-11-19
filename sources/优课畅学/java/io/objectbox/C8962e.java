package io.objectbox;

import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.List;
import p200o6.AbstractC9531b;
import p200o6.AbstractC9532c;
import p200o6.AbstractC9533d;
import p200o6.AbstractC9534e;
import p200o6.AbstractC9535f;

/* renamed from: io.objectbox.e */
/* loaded from: classes5.dex */
public class C8962e {

    /* renamed from: a */
    public final FlatBufferBuilder f16920a = new FlatBufferBuilder();

    /* renamed from: b */
    public final List f16921b = new ArrayList();

    /* renamed from: c */
    public long f16922c = 1;

    /* renamed from: d */
    public Integer f16923d;

    /* renamed from: e */
    public Long f16924e;

    /* renamed from: f */
    public Integer f16925f;

    /* renamed from: g */
    public Long f16926g;

    /* renamed from: h */
    public Integer f16927h;

    /* renamed from: i */
    public Long f16928i;

    /* renamed from: io.objectbox.e$a */
    public class a {

        /* renamed from: a */
        public final String f16929a;

        /* renamed from: b */
        public final List f16930b = new ArrayList();

        /* renamed from: c */
        public final List f16931c = new ArrayList();

        /* renamed from: d */
        public Integer f16932d;

        /* renamed from: e */
        public Long f16933e;

        /* renamed from: f */
        public Integer f16934f;

        /* renamed from: g */
        public Integer f16935g;

        /* renamed from: h */
        public Long f16936h;

        /* renamed from: i */
        public b f16937i;

        /* renamed from: j */
        public boolean f16938j;

        public a(String str) {
            this.f16929a = str;
        }

        /* renamed from: a */
        public void m15447a() {
            b bVar = this.f16937i;
            if (bVar != null) {
                this.f16930b.add(Integer.valueOf(bVar.m15458b()));
                this.f16937i = null;
            }
        }

        /* renamed from: b */
        public final void m15448b() {
            if (this.f16938j) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: c */
        public C8962e m15449c() {
            m15448b();
            m15447a();
            this.f16938j = true;
            int iCreateString = C8962e.this.f16920a.createString(this.f16929a);
            int iM15442b = C8962e.this.m15442b(this.f16930b);
            int iM15442b2 = this.f16931c.isEmpty() ? 0 : C8962e.this.m15442b(this.f16931c);
            AbstractC9533d.m17779h(C8962e.this.f16920a);
            AbstractC9533d.m17775d(C8962e.this.f16920a, iCreateString);
            AbstractC9533d.m17776e(C8962e.this.f16920a, iM15442b);
            if (iM15442b2 != 0) {
                AbstractC9533d.m17777f(C8962e.this.f16920a, iM15442b2);
            }
            if (this.f16932d != null && this.f16933e != null) {
                AbstractC9533d.m17773b(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, r0.intValue(), this.f16933e.longValue()));
            }
            if (this.f16935g != null) {
                AbstractC9533d.m17774c(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, r0.intValue(), this.f16936h.longValue()));
            }
            if (this.f16934f != null) {
                AbstractC9533d.m17772a(C8962e.this.f16920a, r0.intValue());
            }
            C8962e c8962e = C8962e.this;
            c8962e.f16921b.add(Integer.valueOf(AbstractC9533d.m17778g(c8962e.f16920a)));
            return C8962e.this;
        }

        /* renamed from: d */
        public a m15450d(int i10) {
            this.f16934f = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public a m15451e(int i10, long j10) {
            m15448b();
            this.f16932d = Integer.valueOf(i10);
            this.f16933e = Long.valueOf(j10);
            return this;
        }

        /* renamed from: f */
        public a m15452f(int i10, long j10) {
            m15448b();
            this.f16935g = Integer.valueOf(i10);
            this.f16936h = Long.valueOf(j10);
            return this;
        }

        /* renamed from: g */
        public b m15453g(String str, int i10) {
            return m15454h(str, null, i10);
        }

        /* renamed from: h */
        public b m15454h(String str, String str2, int i10) {
            return m15455i(str, str2, null, i10);
        }

        /* renamed from: i */
        public b m15455i(String str, String str2, String str3, int i10) {
            m15448b();
            m15447a();
            b bVar = C8962e.this.new b(str, str2, str3, i10);
            this.f16937i = bVar;
            return bVar;
        }

        /* renamed from: j */
        public a m15456j(String str, int i10, long j10, int i11, long j11) {
            m15448b();
            m15447a();
            int iCreateString = C8962e.this.f16920a.createString(str);
            AbstractC9535f.m17795e(C8962e.this.f16920a);
            AbstractC9535f.m17792b(C8962e.this.f16920a, iCreateString);
            AbstractC9535f.m17791a(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, i10, j10));
            AbstractC9535f.m17793c(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, i11, j11));
            this.f16931c.add(Integer.valueOf(AbstractC9535f.m17794d(C8962e.this.f16920a)));
            return this;
        }
    }

    /* renamed from: io.objectbox.e$b */
    public class b {

        /* renamed from: a */
        public final int f16940a;

        /* renamed from: b */
        public final int f16941b;

        /* renamed from: c */
        public final int f16942c;

        /* renamed from: d */
        public final int f16943d;

        /* renamed from: e */
        public int f16944e;

        /* renamed from: f */
        public boolean f16945f;

        /* renamed from: g */
        public int f16946g;

        /* renamed from: h */
        public int f16947h;

        /* renamed from: i */
        public long f16948i;

        /* renamed from: j */
        public int f16949j;

        /* renamed from: k */
        public long f16950k;

        /* renamed from: l */
        public int f16951l;

        public b(String str, String str2, String str3, int i10) {
            this.f16940a = i10;
            this.f16942c = C8962e.this.f16920a.createString(str);
            this.f16943d = str2 != null ? C8962e.this.f16920a.createString(str2) : 0;
            this.f16941b = str3 != null ? C8962e.this.f16920a.createString(str3) : 0;
        }

        /* renamed from: a */
        public final void m15457a() {
            if (this.f16945f) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: b */
        public int m15458b() {
            m15457a();
            this.f16945f = true;
            AbstractC9534e.m17790k(C8962e.this.f16920a);
            AbstractC9534e.m17784e(C8962e.this.f16920a, this.f16942c);
            int i10 = this.f16943d;
            if (i10 != 0) {
                AbstractC9534e.m17786g(C8962e.this.f16920a, i10);
            }
            int i11 = this.f16941b;
            if (i11 != 0) {
                AbstractC9534e.m17788i(C8962e.this.f16920a, i11);
            }
            int i12 = this.f16944e;
            if (i12 != 0) {
                AbstractC9534e.m17785f(C8962e.this.f16920a, i12);
            }
            int i13 = this.f16947h;
            if (i13 != 0) {
                AbstractC9534e.m17781b(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, i13, this.f16948i));
            }
            int i14 = this.f16949j;
            if (i14 != 0) {
                AbstractC9534e.m17782c(C8962e.this.f16920a, AbstractC9531b.m17762a(C8962e.this.f16920a, i14, this.f16950k));
            }
            int i15 = this.f16951l;
            if (i15 > 0) {
                AbstractC9534e.m17783d(C8962e.this.f16920a, i15);
            }
            AbstractC9534e.m17787h(C8962e.this.f16920a, this.f16940a);
            int i16 = this.f16946g;
            if (i16 != 0) {
                AbstractC9534e.m17780a(C8962e.this.f16920a, i16);
            }
            return AbstractC9534e.m17789j(C8962e.this.f16920a);
        }

        /* renamed from: c */
        public b m15459c(int i10) {
            m15457a();
            this.f16946g = i10;
            return this;
        }

        /* renamed from: d */
        public b m15460d(int i10, long j10) {
            m15457a();
            this.f16947h = i10;
            this.f16948i = j10;
            return this;
        }

        /* renamed from: e */
        public b m15461e(int i10, long j10) {
            m15457a();
            this.f16949j = i10;
            this.f16950k = j10;
            return this;
        }
    }

    /* renamed from: a */
    public byte[] m15441a() {
        int iCreateString = this.f16920a.createString("default");
        int iM15442b = m15442b(this.f16921b);
        AbstractC9532c.m17771i(this.f16920a);
        AbstractC9532c.m17768f(this.f16920a, iCreateString);
        AbstractC9532c.m17767e(this.f16920a, 2L);
        AbstractC9532c.m17769g(this.f16920a, 1L);
        AbstractC9532c.m17763a(this.f16920a, iM15442b);
        if (this.f16923d != null) {
            AbstractC9532c.m17764b(this.f16920a, AbstractC9531b.m17762a(this.f16920a, r0.intValue(), this.f16924e.longValue()));
        }
        if (this.f16925f != null) {
            AbstractC9532c.m17765c(this.f16920a, AbstractC9531b.m17762a(this.f16920a, r0.intValue(), this.f16926g.longValue()));
        }
        if (this.f16927h != null) {
            AbstractC9532c.m17766d(this.f16920a, AbstractC9531b.m17762a(this.f16920a, r0.intValue(), this.f16928i.longValue()));
        }
        this.f16920a.finish(AbstractC9532c.m17770h(this.f16920a));
        return this.f16920a.sizedByteArray();
    }

    /* renamed from: b */
    public int m15442b(List list) {
        int[] iArr = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return this.f16920a.createVectorOfTables(iArr);
    }

    /* renamed from: c */
    public a m15443c(String str) {
        return new a(str);
    }

    /* renamed from: d */
    public C8962e m15444d(int i10, long j10) {
        this.f16923d = Integer.valueOf(i10);
        this.f16924e = Long.valueOf(j10);
        return this;
    }

    /* renamed from: e */
    public C8962e m15445e(int i10, long j10) {
        this.f16925f = Integer.valueOf(i10);
        this.f16926g = Long.valueOf(j10);
        return this;
    }

    /* renamed from: f */
    public C8962e m15446f(int i10, long j10) {
        this.f16927h = Integer.valueOf(i10);
        this.f16928i = Long.valueOf(j10);
        return this;
    }
}
