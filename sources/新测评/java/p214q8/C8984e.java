package p214q8;

import com.google.flatbuffers.FlatBufferBuilder;
import java.util.ArrayList;
import java.util.List;
import p236s8.AbstractC9351b;
import p236s8.AbstractC9352c;
import p236s8.AbstractC9353d;
import p236s8.AbstractC9354e;
import p236s8.AbstractC9355f;

/* renamed from: q8.e */
/* loaded from: classes5.dex */
public class C8984e {

    /* renamed from: a */
    public final FlatBufferBuilder f15338a = new FlatBufferBuilder();

    /* renamed from: b */
    public final List f15339b = new ArrayList();

    /* renamed from: c */
    public long f15340c = 1;

    /* renamed from: d */
    public Integer f15341d;

    /* renamed from: e */
    public Long f15342e;

    /* renamed from: f */
    public Integer f15343f;

    /* renamed from: g */
    public Long f15344g;

    /* renamed from: h */
    public Integer f15345h;

    /* renamed from: i */
    public Long f15346i;

    /* renamed from: q8.e$a */
    public class a {

        /* renamed from: a */
        public final String f15347a;

        /* renamed from: b */
        public final List f15348b = new ArrayList();

        /* renamed from: c */
        public final List f15349c = new ArrayList();

        /* renamed from: d */
        public Integer f15350d;

        /* renamed from: e */
        public Long f15351e;

        /* renamed from: f */
        public Integer f15352f;

        /* renamed from: g */
        public Integer f15353g;

        /* renamed from: h */
        public Long f15354h;

        /* renamed from: i */
        public b f15355i;

        /* renamed from: j */
        public boolean f15356j;

        public a(String str) {
            this.f15347a = str;
        }

        /* renamed from: a */
        public void m15073a() {
            b bVar = this.f15355i;
            if (bVar != null) {
                this.f15348b.add(Integer.valueOf(bVar.m15084b()));
                this.f15355i = null;
            }
        }

        /* renamed from: b */
        public final void m15074b() {
            if (this.f15356j) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: c */
        public C8984e m15075c() {
            m15074b();
            m15073a();
            this.f15356j = true;
            int iCreateString = C8984e.this.f15338a.createString(this.f15347a);
            int iM15068b = C8984e.this.m15068b(this.f15348b);
            int iM15068b2 = this.f15349c.isEmpty() ? 0 : C8984e.this.m15068b(this.f15349c);
            AbstractC9353d.m15590h(C8984e.this.f15338a);
            AbstractC9353d.m15586d(C8984e.this.f15338a, iCreateString);
            AbstractC9353d.m15587e(C8984e.this.f15338a, iM15068b);
            if (iM15068b2 != 0) {
                AbstractC9353d.m15588f(C8984e.this.f15338a, iM15068b2);
            }
            if (this.f15350d != null && this.f15351e != null) {
                AbstractC9353d.m15584b(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, r0.intValue(), this.f15351e.longValue()));
            }
            if (this.f15353g != null) {
                AbstractC9353d.m15585c(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, r0.intValue(), this.f15354h.longValue()));
            }
            if (this.f15352f != null) {
                AbstractC9353d.m15583a(C8984e.this.f15338a, r0.intValue());
            }
            C8984e c8984e = C8984e.this;
            c8984e.f15339b.add(Integer.valueOf(AbstractC9353d.m15589g(c8984e.f15338a)));
            return C8984e.this;
        }

        /* renamed from: d */
        public a m15076d(int i10) {
            this.f15352f = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public a m15077e(int i10, long j10) {
            m15074b();
            this.f15350d = Integer.valueOf(i10);
            this.f15351e = Long.valueOf(j10);
            return this;
        }

        /* renamed from: f */
        public a m15078f(int i10, long j10) {
            m15074b();
            this.f15353g = Integer.valueOf(i10);
            this.f15354h = Long.valueOf(j10);
            return this;
        }

        /* renamed from: g */
        public b m15079g(String str, int i10) {
            return m15080h(str, null, i10);
        }

        /* renamed from: h */
        public b m15080h(String str, String str2, int i10) {
            return m15081i(str, str2, null, i10);
        }

        /* renamed from: i */
        public b m15081i(String str, String str2, String str3, int i10) {
            m15074b();
            m15073a();
            b bVar = C8984e.this.new b(str, str2, str3, i10);
            this.f15355i = bVar;
            return bVar;
        }

        /* renamed from: j */
        public a m15082j(String str, int i10, long j10, int i11, long j11) {
            m15074b();
            m15073a();
            int iCreateString = C8984e.this.f15338a.createString(str);
            AbstractC9355f.m15606e(C8984e.this.f15338a);
            AbstractC9355f.m15603b(C8984e.this.f15338a, iCreateString);
            AbstractC9355f.m15602a(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, i10, j10));
            AbstractC9355f.m15604c(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, i11, j11));
            this.f15349c.add(Integer.valueOf(AbstractC9355f.m15605d(C8984e.this.f15338a)));
            return this;
        }
    }

    /* renamed from: q8.e$b */
    public class b {

        /* renamed from: a */
        public final int f15358a;

        /* renamed from: b */
        public final int f15359b;

        /* renamed from: c */
        public final int f15360c;

        /* renamed from: d */
        public final int f15361d;

        /* renamed from: e */
        public int f15362e;

        /* renamed from: f */
        public boolean f15363f;

        /* renamed from: g */
        public int f15364g;

        /* renamed from: h */
        public int f15365h;

        /* renamed from: i */
        public long f15366i;

        /* renamed from: j */
        public int f15367j;

        /* renamed from: k */
        public long f15368k;

        /* renamed from: l */
        public int f15369l;

        public b(String str, String str2, String str3, int i10) {
            this.f15358a = i10;
            this.f15360c = C8984e.this.f15338a.createString(str);
            this.f15361d = str2 != null ? C8984e.this.f15338a.createString(str2) : 0;
            this.f15359b = str3 != null ? C8984e.this.f15338a.createString(str3) : 0;
        }

        /* renamed from: a */
        public final void m15083a() {
            if (this.f15363f) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: b */
        public int m15084b() {
            m15083a();
            this.f15363f = true;
            AbstractC9354e.m15601k(C8984e.this.f15338a);
            AbstractC9354e.m15595e(C8984e.this.f15338a, this.f15360c);
            int i10 = this.f15361d;
            if (i10 != 0) {
                AbstractC9354e.m15597g(C8984e.this.f15338a, i10);
            }
            int i11 = this.f15359b;
            if (i11 != 0) {
                AbstractC9354e.m15599i(C8984e.this.f15338a, i11);
            }
            int i12 = this.f15362e;
            if (i12 != 0) {
                AbstractC9354e.m15596f(C8984e.this.f15338a, i12);
            }
            int i13 = this.f15365h;
            if (i13 != 0) {
                AbstractC9354e.m15592b(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, i13, this.f15366i));
            }
            int i14 = this.f15367j;
            if (i14 != 0) {
                AbstractC9354e.m15593c(C8984e.this.f15338a, AbstractC9351b.m15573a(C8984e.this.f15338a, i14, this.f15368k));
            }
            int i15 = this.f15369l;
            if (i15 > 0) {
                AbstractC9354e.m15594d(C8984e.this.f15338a, i15);
            }
            AbstractC9354e.m15598h(C8984e.this.f15338a, this.f15358a);
            int i16 = this.f15364g;
            if (i16 != 0) {
                AbstractC9354e.m15591a(C8984e.this.f15338a, i16);
            }
            return AbstractC9354e.m15600j(C8984e.this.f15338a);
        }

        /* renamed from: c */
        public b m15085c(int i10) {
            m15083a();
            this.f15364g = i10;
            return this;
        }

        /* renamed from: d */
        public b m15086d(int i10, long j10) {
            m15083a();
            this.f15365h = i10;
            this.f15366i = j10;
            return this;
        }

        /* renamed from: e */
        public b m15087e(int i10, long j10) {
            m15083a();
            this.f15367j = i10;
            this.f15368k = j10;
            return this;
        }
    }

    /* renamed from: a */
    public byte[] m15067a() {
        int iCreateString = this.f15338a.createString("default");
        int iM15068b = m15068b(this.f15339b);
        AbstractC9352c.m15582i(this.f15338a);
        AbstractC9352c.m15579f(this.f15338a, iCreateString);
        AbstractC9352c.m15578e(this.f15338a, 2L);
        AbstractC9352c.m15580g(this.f15338a, 1L);
        AbstractC9352c.m15574a(this.f15338a, iM15068b);
        if (this.f15341d != null) {
            AbstractC9352c.m15575b(this.f15338a, AbstractC9351b.m15573a(this.f15338a, r0.intValue(), this.f15342e.longValue()));
        }
        if (this.f15343f != null) {
            AbstractC9352c.m15576c(this.f15338a, AbstractC9351b.m15573a(this.f15338a, r0.intValue(), this.f15344g.longValue()));
        }
        if (this.f15345h != null) {
            AbstractC9352c.m15577d(this.f15338a, AbstractC9351b.m15573a(this.f15338a, r0.intValue(), this.f15346i.longValue()));
        }
        this.f15338a.finish(AbstractC9352c.m15581h(this.f15338a));
        return this.f15338a.sizedByteArray();
    }

    /* renamed from: b */
    public int m15068b(List list) {
        int[] iArr = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return this.f15338a.createVectorOfTables(iArr);
    }

    /* renamed from: c */
    public a m15069c(String str) {
        return new a(str);
    }

    /* renamed from: d */
    public C8984e m15070d(int i10, long j10) {
        this.f15341d = Integer.valueOf(i10);
        this.f15342e = Long.valueOf(j10);
        return this;
    }

    /* renamed from: e */
    public C8984e m15071e(int i10, long j10) {
        this.f15343f = Integer.valueOf(i10);
        this.f15344g = Long.valueOf(j10);
        return this;
    }

    /* renamed from: f */
    public C8984e m15072f(int i10, long j10) {
        this.f15345h = Integer.valueOf(i10);
        this.f15346i = Long.valueOf(j10);
        return this;
    }
}
