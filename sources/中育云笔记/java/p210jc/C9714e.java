package p210jc;

import com.google.flatbuffers.FlatBufferBuilder;
import com.taobao.accs.AccsClientConfig;
import java.util.ArrayList;
import java.util.List;
import lc.AbstractC10178b;
import lc.AbstractC10179c;
import lc.AbstractC10180d;
import lc.AbstractC10181e;
import lc.AbstractC10182f;

/* renamed from: jc.e */
/* loaded from: classes6.dex */
public class C9714e {

    /* renamed from: a */
    public final FlatBufferBuilder f22624a = new FlatBufferBuilder();

    /* renamed from: b */
    public final List f22625b = new ArrayList();

    /* renamed from: c */
    public long f22626c = 1;

    /* renamed from: d */
    public Integer f22627d;

    /* renamed from: e */
    public Long f22628e;

    /* renamed from: f */
    public Integer f22629f;

    /* renamed from: g */
    public Long f22630g;

    /* renamed from: h */
    public Integer f22631h;

    /* renamed from: i */
    public Long f22632i;

    /* renamed from: jc.e$a */
    public class a {

        /* renamed from: a */
        public final String f22633a;

        /* renamed from: b */
        public final List f22634b = new ArrayList();

        /* renamed from: c */
        public final List f22635c = new ArrayList();

        /* renamed from: d */
        public Integer f22636d;

        /* renamed from: e */
        public Long f22637e;

        /* renamed from: f */
        public Integer f22638f;

        /* renamed from: g */
        public Integer f22639g;

        /* renamed from: h */
        public Long f22640h;

        /* renamed from: i */
        public b f22641i;

        /* renamed from: j */
        public boolean f22642j;

        public a(String str) {
            this.f22633a = str;
        }

        /* renamed from: a */
        public void m19257a() {
            b bVar = this.f22641i;
            if (bVar != null) {
                this.f22634b.add(Integer.valueOf(bVar.m19268b()));
                this.f22641i = null;
            }
        }

        /* renamed from: b */
        public final void m19258b() {
            if (this.f22642j) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: c */
        public C9714e m19259c() {
            m19258b();
            m19257a();
            this.f22642j = true;
            int iCreateString = C9714e.this.f22624a.createString(this.f22633a);
            int iM19252b = C9714e.this.m19252b(this.f22634b);
            int iM19252b2 = this.f22635c.isEmpty() ? 0 : C9714e.this.m19252b(this.f22635c);
            AbstractC10180d.m21241h(C9714e.this.f22624a);
            AbstractC10180d.m21237d(C9714e.this.f22624a, iCreateString);
            AbstractC10180d.m21238e(C9714e.this.f22624a, iM19252b);
            if (iM19252b2 != 0) {
                AbstractC10180d.m21239f(C9714e.this.f22624a, iM19252b2);
            }
            if (this.f22636d != null && this.f22637e != null) {
                AbstractC10180d.m21235b(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, r0.intValue(), this.f22637e.longValue()));
            }
            if (this.f22639g != null) {
                AbstractC10180d.m21236c(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, r0.intValue(), this.f22640h.longValue()));
            }
            if (this.f22638f != null) {
                AbstractC10180d.m21234a(C9714e.this.f22624a, r0.intValue());
            }
            C9714e c9714e = C9714e.this;
            c9714e.f22625b.add(Integer.valueOf(AbstractC10180d.m21240g(c9714e.f22624a)));
            return C9714e.this;
        }

        /* renamed from: d */
        public a m19260d(int i10) {
            this.f22638f = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public a m19261e(int i10, long j10) {
            m19258b();
            this.f22636d = Integer.valueOf(i10);
            this.f22637e = Long.valueOf(j10);
            return this;
        }

        /* renamed from: f */
        public a m19262f(int i10, long j10) {
            m19258b();
            this.f22639g = Integer.valueOf(i10);
            this.f22640h = Long.valueOf(j10);
            return this;
        }

        /* renamed from: g */
        public b m19263g(String str, int i10) {
            return m19264h(str, null, i10);
        }

        /* renamed from: h */
        public b m19264h(String str, String str2, int i10) {
            return m19265i(str, str2, null, i10);
        }

        /* renamed from: i */
        public b m19265i(String str, String str2, String str3, int i10) {
            m19258b();
            m19257a();
            b bVar = C9714e.this.new b(str, str2, str3, i10);
            this.f22641i = bVar;
            return bVar;
        }

        /* renamed from: j */
        public a m19266j(String str, int i10, long j10, int i11, long j11) {
            m19258b();
            m19257a();
            int iCreateString = C9714e.this.f22624a.createString(str);
            AbstractC10182f.m21257e(C9714e.this.f22624a);
            AbstractC10182f.m21254b(C9714e.this.f22624a, iCreateString);
            AbstractC10182f.m21253a(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, i10, j10));
            AbstractC10182f.m21255c(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, i11, j11));
            this.f22635c.add(Integer.valueOf(AbstractC10182f.m21256d(C9714e.this.f22624a)));
            return this;
        }
    }

    /* renamed from: jc.e$b */
    public class b {

        /* renamed from: a */
        public final int f22644a;

        /* renamed from: b */
        public final int f22645b;

        /* renamed from: c */
        public final int f22646c;

        /* renamed from: d */
        public final int f22647d;

        /* renamed from: e */
        public int f22648e;

        /* renamed from: f */
        public boolean f22649f;

        /* renamed from: g */
        public int f22650g;

        /* renamed from: h */
        public int f22651h;

        /* renamed from: i */
        public long f22652i;

        /* renamed from: j */
        public int f22653j;

        /* renamed from: k */
        public long f22654k;

        /* renamed from: l */
        public int f22655l;

        public b(String str, String str2, String str3, int i10) {
            this.f22644a = i10;
            this.f22646c = C9714e.this.f22624a.createString(str);
            this.f22647d = str2 != null ? C9714e.this.f22624a.createString(str2) : 0;
            this.f22645b = str3 != null ? C9714e.this.f22624a.createString(str3) : 0;
        }

        /* renamed from: a */
        public final void m19267a() {
            if (this.f22649f) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* renamed from: b */
        public int m19268b() {
            m19267a();
            this.f22649f = true;
            AbstractC10181e.m21252k(C9714e.this.f22624a);
            AbstractC10181e.m21246e(C9714e.this.f22624a, this.f22646c);
            int i10 = this.f22647d;
            if (i10 != 0) {
                AbstractC10181e.m21248g(C9714e.this.f22624a, i10);
            }
            int i11 = this.f22645b;
            if (i11 != 0) {
                AbstractC10181e.m21250i(C9714e.this.f22624a, i11);
            }
            int i12 = this.f22648e;
            if (i12 != 0) {
                AbstractC10181e.m21247f(C9714e.this.f22624a, i12);
            }
            int i13 = this.f22651h;
            if (i13 != 0) {
                AbstractC10181e.m21243b(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, i13, this.f22652i));
            }
            int i14 = this.f22653j;
            if (i14 != 0) {
                AbstractC10181e.m21244c(C9714e.this.f22624a, AbstractC10178b.m21224a(C9714e.this.f22624a, i14, this.f22654k));
            }
            int i15 = this.f22655l;
            if (i15 > 0) {
                AbstractC10181e.m21245d(C9714e.this.f22624a, i15);
            }
            AbstractC10181e.m21249h(C9714e.this.f22624a, this.f22644a);
            int i16 = this.f22650g;
            if (i16 != 0) {
                AbstractC10181e.m21242a(C9714e.this.f22624a, i16);
            }
            return AbstractC10181e.m21251j(C9714e.this.f22624a);
        }

        /* renamed from: c */
        public b m19269c(int i10) {
            m19267a();
            this.f22650g = i10;
            return this;
        }

        /* renamed from: d */
        public b m19270d(int i10, long j10) {
            m19267a();
            this.f22651h = i10;
            this.f22652i = j10;
            return this;
        }

        /* renamed from: e */
        public b m19271e(int i10, long j10) {
            m19267a();
            this.f22653j = i10;
            this.f22654k = j10;
            return this;
        }
    }

    /* renamed from: a */
    public byte[] m19251a() {
        int iCreateString = this.f22624a.createString(AccsClientConfig.DEFAULT_CONFIG_TAG);
        int iM19252b = m19252b(this.f22625b);
        AbstractC10179c.m21233i(this.f22624a);
        AbstractC10179c.m21230f(this.f22624a, iCreateString);
        AbstractC10179c.m21229e(this.f22624a, 2L);
        AbstractC10179c.m21231g(this.f22624a, 1L);
        AbstractC10179c.m21225a(this.f22624a, iM19252b);
        if (this.f22627d != null) {
            AbstractC10179c.m21226b(this.f22624a, AbstractC10178b.m21224a(this.f22624a, r0.intValue(), this.f22628e.longValue()));
        }
        if (this.f22629f != null) {
            AbstractC10179c.m21227c(this.f22624a, AbstractC10178b.m21224a(this.f22624a, r0.intValue(), this.f22630g.longValue()));
        }
        if (this.f22631h != null) {
            AbstractC10179c.m21228d(this.f22624a, AbstractC10178b.m21224a(this.f22624a, r0.intValue(), this.f22632i.longValue()));
        }
        this.f22624a.finish(AbstractC10179c.m21232h(this.f22624a));
        return this.f22624a.sizedByteArray();
    }

    /* renamed from: b */
    public int m19252b(List list) {
        int[] iArr = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return this.f22624a.createVectorOfTables(iArr);
    }

    /* renamed from: c */
    public a m19253c(String str) {
        return new a(str);
    }

    /* renamed from: d */
    public C9714e m19254d(int i10, long j10) {
        this.f22627d = Integer.valueOf(i10);
        this.f22628e = Long.valueOf(j10);
        return this;
    }

    /* renamed from: e */
    public C9714e m19255e(int i10, long j10) {
        this.f22629f = Integer.valueOf(i10);
        this.f22630g = Long.valueOf(j10);
        return this;
    }

    /* renamed from: f */
    public C9714e m19256f(int i10, long j10) {
        this.f22631h = Integer.valueOf(i10);
        this.f22632i = Long.valueOf(j10);
        return this;
    }
}
