package com.umeng.commonsdk.statistics.proto;

import com.taobao.accs.common.Constants;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
/* loaded from: classes.dex */
public class C2021b implements InterfaceC1859aq<C2021b, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C1872bc> f9472d;

    /* renamed from: e */
    private static final long f9473e = -6496538196005191531L;

    /* renamed from: f */
    private static final C1890bu f9474f = new C1890bu("IdSnapshot");

    /* renamed from: g */
    private static final C1880bk f9475g = new C1880bk("identity", (byte) 11, 1);

    /* renamed from: h */
    private static final C1880bk f9476h = new C1880bk("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C1880bk f9477i = new C1880bk(Constants.SP_KEY_VERSION, (byte) 8, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f9478j;

    /* renamed from: k */
    private static final int f9479k = 0;

    /* renamed from: l */
    private static final int f9480l = 1;

    /* renamed from: a */
    public String f9481a;

    /* renamed from: b */
    public long f9482b;

    /* renamed from: c */
    public int f9483c;

    /* renamed from: m */
    private byte f9484m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    private static class a extends AbstractC1895bz<C2021b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2021b c2021b) throws C1865aw {
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
                            C1888bs.m7033a(abstractC1885bp, b4);
                        } else if (b4 == 8) {
                            c2021b.f9483c = abstractC1885bp.mo7000w();
                            c2021b.m7798c(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 10) {
                        c2021b.f9482b = abstractC1885bp.mo7001x();
                        c2021b.m7796b(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 11) {
                    c2021b.f9481a = abstractC1885bp.mo7003z();
                    c2021b.m7793a(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
            abstractC1885bp.mo6988k();
            if (!c2021b.m7802g()) {
                throw new C1886bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (c2021b.m7805j()) {
                c2021b.m7806k();
                return;
            }
            throw new C1886bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2021b c2021b) throws C1865aw {
            c2021b.m7806k();
            abstractC1885bp.mo6971a(C2021b.f9474f);
            if (c2021b.f9481a != null) {
                abstractC1885bp.mo6966a(C2021b.f9475g);
                abstractC1885bp.mo6972a(c2021b.f9481a);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6966a(C2021b.f9476h);
            abstractC1885bp.mo6965a(c2021b.f9482b);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6966a(C2021b.f9477i);
            abstractC1885bp.mo6964a(c2021b.f9483c);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    private static class c extends AbstractC1897ca<C2021b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2021b c2021b) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6972a(c2021b.f9481a);
            c1891bv.mo6965a(c2021b.f9482b);
            c1891bv.mo6964a(c2021b.f9483c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2021b c2021b) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c2021b.f9481a = c1891bv.mo7003z();
            c2021b.m7793a(true);
            c2021b.f9482b = c1891bv.mo7001x();
            c2021b.m7796b(true);
            c2021b.f9483c = c1891bv.mo7000w();
            c2021b.m7798c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
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
        f9478j = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new C1872bc("identity", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C1872bc("ts", (byte) 1, new C1873bd((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new C1872bc(Constants.SP_KEY_VERSION, (byte) 1, new C1873bd((byte) 8)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9472d = mapUnmodifiableMap;
        C1872bc.m6953a(C2021b.class, mapUnmodifiableMap);
    }

    public C2021b() {
        this.f9484m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2021b deepCopy() {
        return new C2021b(this);
    }

    /* renamed from: b */
    public String m7795b() {
        return this.f9481a;
    }

    /* renamed from: c */
    public void m7797c() {
        this.f9481a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f9481a = null;
        m7796b(false);
        this.f9482b = 0L;
        m7798c(false);
        this.f9483c = 0;
    }

    /* renamed from: d */
    public boolean m7799d() {
        return this.f9481a != null;
    }

    /* renamed from: e */
    public long m7800e() {
        return this.f9482b;
    }

    /* renamed from: f */
    public void m7801f() {
        this.f9484m = C1856an.m6871b(this.f9484m, 0);
    }

    /* renamed from: g */
    public boolean m7802g() {
        return C1856an.m6867a(this.f9484m, 0);
    }

    /* renamed from: h */
    public int m7803h() {
        return this.f9483c;
    }

    /* renamed from: i */
    public void m7804i() {
        this.f9484m = C1856an.m6871b(this.f9484m, 1);
    }

    /* renamed from: j */
    public boolean m7805j() {
        return C1856an.m6867a(this.f9484m, 1);
    }

    /* renamed from: k */
    public void m7806k() throws C1865aw {
        if (this.f9481a != null) {
            return;
        }
        throw new C1886bq("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9478j.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f9481a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f9482b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9483c);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9478j.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    public enum e implements InterfaceC1866ax {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, Constants.SP_KEY_VERSION);


        /* renamed from: d */
        private static final Map<String, e> f9488d = new HashMap();

        /* renamed from: e */
        private final short f9490e;

        /* renamed from: f */
        private final String f9491f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9488d.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f9490e = s3;
            this.f9491f = str;
        }

        /* renamed from: a */
        public static e m7813a(int i4) {
            if (i4 == 1) {
                return IDENTITY;
            }
            if (i4 == 2) {
                return TS;
            }
            if (i4 != 3) {
                return null;
            }
            return VERSION;
        }

        /* renamed from: b */
        public static e m7815b(int i4) {
            e eVarM7813a = m7813a(i4);
            if (eVarM7813a != null) {
                return eVarM7813a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9491f;
        }

        /* renamed from: a */
        public static e m7814a(String str) {
            return f9488d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9490e;
        }
    }

    /* renamed from: a */
    public C2021b m7792a(String str) {
        this.f9481a = str;
        return this;
    }

    /* renamed from: b */
    public void m7796b(boolean z3) {
        this.f9484m = C1856an.m6859a(this.f9484m, 0, z3);
    }

    /* renamed from: c */
    public void m7798c(boolean z3) {
        this.f9484m = C1856an.m6859a(this.f9484m, 1, z3);
    }

    public C2021b(String str, long j4, int i4) {
        this();
        this.f9481a = str;
        this.f9482b = j4;
        m7796b(true);
        this.f9483c = i4;
        m7798c(true);
    }

    /* renamed from: a */
    public void m7793a(boolean z3) {
        if (z3) {
            return;
        }
        this.f9481a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m7813a(i4);
    }

    /* renamed from: a */
    public C2021b m7791a(long j4) {
        this.f9482b = j4;
        m7796b(true);
        return this;
    }

    /* renamed from: a */
    public C2021b m7790a(int i4) {
        this.f9483c = i4;
        m7798c(true);
        return this;
    }

    /* renamed from: a */
    private void m7784a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C2021b(C2021b c2021b) {
        this.f9484m = (byte) 0;
        this.f9484m = c2021b.f9484m;
        if (c2021b.m7799d()) {
            this.f9481a = c2021b.f9481a;
        }
        this.f9482b = c2021b.f9482b;
        this.f9483c = c2021b.f9483c;
    }

    /* renamed from: a */
    private void m7783a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9484m = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
