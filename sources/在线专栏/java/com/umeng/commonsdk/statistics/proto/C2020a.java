package com.umeng.commonsdk.statistics.proto;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.analytics.pro.AbstractC1885bp;
import com.umeng.analytics.pro.AbstractC1895bz;
import com.umeng.analytics.pro.AbstractC1897ca;
import com.umeng.analytics.pro.C1856an;
import com.umeng.analytics.pro.C1865aw;
import com.umeng.analytics.pro.C1872bc;
import com.umeng.analytics.pro.C1873bd;
import com.umeng.analytics.pro.C1879bj;
import com.umeng.analytics.pro.C1880bk;
import com.umeng.analytics.pro.C1886bq;
import com.umeng.analytics.pro.C1888bs;
import com.umeng.analytics.pro.C1890bu;
import com.umeng.analytics.pro.C1891bv;
import com.umeng.analytics.pro.C1898cb;
import com.umeng.analytics.pro.InterfaceC1859aq;
import com.umeng.analytics.pro.InterfaceC1866ax;
import com.umeng.analytics.pro.InterfaceC1893bx;
import com.umeng.analytics.pro.InterfaceC1894by;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.a */
/* loaded from: classes.dex */
public class C2020a implements InterfaceC1859aq<C2020a, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final Map<e, C1872bc> f9449e;

    /* renamed from: f */
    private static final long f9450f = 9132678615281394583L;

    /* renamed from: g */
    private static final C1890bu f9451g = new C1890bu("IdJournal");

    /* renamed from: h */
    private static final C1880bk f9452h = new C1880bk(DispatchConstants.DOMAIN, (byte) 11, 1);

    /* renamed from: i */
    private static final C1880bk f9453i = new C1880bk("old_id", (byte) 11, 2);

    /* renamed from: j */
    private static final C1880bk f9454j = new C1880bk("new_id", (byte) 11, 3);

    /* renamed from: k */
    private static final C1880bk f9455k = new C1880bk("ts", (byte) 10, 4);

    /* renamed from: l */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f9456l;

    /* renamed from: m */
    private static final int f9457m = 0;

    /* renamed from: a */
    public String f9458a;

    /* renamed from: b */
    public String f9459b;

    /* renamed from: c */
    public String f9460c;

    /* renamed from: d */
    public long f9461d;

    /* renamed from: n */
    private byte f9462n;

    /* renamed from: o */
    private e[] f9463o;

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    private static class a extends AbstractC1895bz<C2020a> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2020a c2020a) throws C1865aw {
            abstractC1885bp.mo6987j();
            while (true) {
                C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
                byte b4 = c1880bkMo6989l.f8499b;
                if (b4 == 0) {
                    break;
                }
                short s3 = c1880bkMo6989l.f8500c;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            if (s3 != 4) {
                                C1888bs.m7033a(abstractC1885bp, b4);
                            } else if (b4 == 10) {
                                c2020a.f9461d = abstractC1885bp.mo7001x();
                                c2020a.m7762d(true);
                            } else {
                                C1888bs.m7033a(abstractC1885bp, b4);
                            }
                        } else if (b4 == 11) {
                            c2020a.f9460c = abstractC1885bp.mo7003z();
                            c2020a.m7761c(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 11) {
                        c2020a.f9459b = abstractC1885bp.mo7003z();
                        c2020a.m7758b(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 11) {
                    c2020a.f9458a = abstractC1885bp.mo7003z();
                    c2020a.m7755a(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
            abstractC1885bp.mo6988k();
            if (c2020a.m7772m()) {
                c2020a.m7773n();
                return;
            }
            throw new C1886bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2020a c2020a) throws C1865aw {
            c2020a.m7773n();
            abstractC1885bp.mo6971a(C2020a.f9451g);
            if (c2020a.f9458a != null) {
                abstractC1885bp.mo6966a(C2020a.f9452h);
                abstractC1885bp.mo6972a(c2020a.f9458a);
                abstractC1885bp.mo6978c();
            }
            if (c2020a.f9459b != null && c2020a.m7766g()) {
                abstractC1885bp.mo6966a(C2020a.f9453i);
                abstractC1885bp.mo6972a(c2020a.f9459b);
                abstractC1885bp.mo6978c();
            }
            if (c2020a.f9460c != null) {
                abstractC1885bp.mo6966a(C2020a.f9454j);
                abstractC1885bp.mo6972a(c2020a.f9460c);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6966a(C2020a.f9455k);
            abstractC1885bp.mo6965a(c2020a.f9461d);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    private static class c extends AbstractC1897ca<C2020a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2020a c2020a) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6972a(c2020a.f9458a);
            c1891bv.mo6972a(c2020a.f9460c);
            c1891bv.mo6965a(c2020a.f9461d);
            BitSet bitSet = new BitSet();
            if (c2020a.m7766g()) {
                bitSet.set(0);
            }
            c1891bv.m7037a(bitSet, 1);
            if (c2020a.m7766g()) {
                c1891bv.mo6972a(c2020a.f9459b);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2020a c2020a) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c2020a.f9458a = c1891bv.mo7003z();
            c2020a.m7755a(true);
            c2020a.f9460c = c1891bv.mo7003z();
            c2020a.m7761c(true);
            c2020a.f9461d = c1891bv.mo7001x();
            c2020a.m7762d(true);
            if (c1891bv.m7038b(1).get(0)) {
                c2020a.f9459b = c1891bv.mo7003z();
                c2020a.m7758b(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
    private static class d implements InterfaceC1894by {
        private d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo6837b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f9456l = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new C1872bc(DispatchConstants.DOMAIN, (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new C1872bc("old_id", (byte) 2, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new C1872bc("new_id", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C1872bc("ts", (byte) 1, new C1873bd((byte) 10)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9449e = mapUnmodifiableMap;
        C1872bc.m6953a(C2020a.class, mapUnmodifiableMap);
    }

    public C2020a() {
        this.f9462n = (byte) 0;
        this.f9463o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2020a deepCopy() {
        return new C2020a(this);
    }

    /* renamed from: b */
    public String m7757b() {
        return this.f9458a;
    }

    /* renamed from: c */
    public void m7760c() {
        this.f9458a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f9458a = null;
        this.f9459b = null;
        this.f9460c = null;
        m7762d(false);
        this.f9461d = 0L;
    }

    /* renamed from: d */
    public boolean m7763d() {
        return this.f9458a != null;
    }

    /* renamed from: e */
    public String m7764e() {
        return this.f9459b;
    }

    /* renamed from: f */
    public void m7765f() {
        this.f9459b = null;
    }

    /* renamed from: g */
    public boolean m7766g() {
        return this.f9459b != null;
    }

    /* renamed from: h */
    public String m7767h() {
        return this.f9460c;
    }

    /* renamed from: i */
    public void m7768i() {
        this.f9460c = null;
    }

    /* renamed from: j */
    public boolean m7769j() {
        return this.f9460c != null;
    }

    /* renamed from: k */
    public long m7770k() {
        return this.f9461d;
    }

    /* renamed from: l */
    public void m7771l() {
        this.f9462n = C1856an.m6871b(this.f9462n, 0);
    }

    /* renamed from: m */
    public boolean m7772m() {
        return C1856an.m6867a(this.f9462n, 0);
    }

    /* renamed from: n */
    public void m7773n() throws C1865aw {
        if (this.f9458a == null) {
            throw new C1886bq("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f9460c != null) {
            return;
        }
        throw new C1886bq("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9456l.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f9458a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m7766g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f9459b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f9460c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9461d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9456l.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    public enum e implements InterfaceC1866ax {
        DOMAIN(1, DispatchConstants.DOMAIN),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* renamed from: e */
        private static final Map<String, e> f9468e = new HashMap();

        /* renamed from: f */
        private final short f9470f;

        /* renamed from: g */
        private final String f9471g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9468e.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f9470f = s3;
            this.f9471g = str;
        }

        /* renamed from: a */
        public static e m7780a(int i4) {
            if (i4 == 1) {
                return DOMAIN;
            }
            if (i4 == 2) {
                return OLD_ID;
            }
            if (i4 == 3) {
                return NEW_ID;
            }
            if (i4 != 4) {
                return null;
            }
            return TS;
        }

        /* renamed from: b */
        public static e m7782b(int i4) {
            e eVarM7780a = m7780a(i4);
            if (eVarM7780a != null) {
                return eVarM7780a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9471g;
        }

        /* renamed from: a */
        public static e m7781a(String str) {
            return f9468e.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9470f;
        }
    }

    /* renamed from: a */
    public C2020a m7754a(String str) {
        this.f9458a = str;
        return this;
    }

    /* renamed from: b */
    public C2020a m7756b(String str) {
        this.f9459b = str;
        return this;
    }

    /* renamed from: c */
    public C2020a m7759c(String str) {
        this.f9460c = str;
        return this;
    }

    /* renamed from: d */
    public void m7762d(boolean z3) {
        this.f9462n = C1856an.m6859a(this.f9462n, 0, z3);
    }

    /* renamed from: a */
    public void m7755a(boolean z3) {
        if (z3) {
            return;
        }
        this.f9458a = null;
    }

    /* renamed from: b */
    public void m7758b(boolean z3) {
        if (z3) {
            return;
        }
        this.f9459b = null;
    }

    /* renamed from: c */
    public void m7761c(boolean z3) {
        if (z3) {
            return;
        }
        this.f9460c = null;
    }

    public C2020a(String str, String str2, long j4) {
        this();
        this.f9458a = str;
        this.f9460c = str2;
        this.f9461d = j4;
        m7762d(true);
    }

    /* renamed from: a */
    public C2020a m7753a(long j4) {
        this.f9461d = j4;
        m7762d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m7780a(i4);
    }

    /* renamed from: a */
    private void m7745a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C2020a(C2020a c2020a) {
        this.f9462n = (byte) 0;
        this.f9463o = new e[]{e.OLD_ID};
        this.f9462n = c2020a.f9462n;
        if (c2020a.m7763d()) {
            this.f9458a = c2020a.f9458a;
        }
        if (c2020a.m7766g()) {
            this.f9459b = c2020a.f9459b;
        }
        if (c2020a.m7769j()) {
            this.f9460c = c2020a.f9460c;
        }
        this.f9461d = c2020a.f9461d;
    }

    /* renamed from: a */
    private void m7744a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9462n = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
