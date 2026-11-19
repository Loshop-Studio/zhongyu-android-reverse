package com.umeng.commonsdk.statistics.proto;

import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.AbstractC1885bp;
import com.umeng.analytics.pro.AbstractC1895bz;
import com.umeng.analytics.pro.AbstractC1897ca;
import com.umeng.analytics.pro.C1856an;
import com.umeng.analytics.pro.C1865aw;
import com.umeng.analytics.pro.C1872bc;
import com.umeng.analytics.pro.C1873bd;
import com.umeng.analytics.pro.C1875bf;
import com.umeng.analytics.pro.C1877bh;
import com.umeng.analytics.pro.C1879bj;
import com.umeng.analytics.pro.C1880bk;
import com.umeng.analytics.pro.C1882bm;
import com.umeng.analytics.pro.C1886bq;
import com.umeng.analytics.pro.C1888bs;
import com.umeng.analytics.pro.C1890bu;
import com.umeng.analytics.pro.C1891bv;
import com.umeng.analytics.pro.C1892bw;
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

/* renamed from: com.umeng.commonsdk.statistics.proto.d */
/* loaded from: classes.dex */
public class C2023d implements InterfaceC1859aq<C2023d, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C1872bc> f9510d;

    /* renamed from: e */
    private static final long f9511e = 2846460275012375038L;

    /* renamed from: f */
    private static final C1890bu f9512f = new C1890bu("Imprint");

    /* renamed from: g */
    private static final C1880bk f9513g = new C1880bk("property", C1892bw.f8536k, 1);

    /* renamed from: h */
    private static final C1880bk f9514h = new C1880bk(Constants.SP_KEY_VERSION, (byte) 8, 2);

    /* renamed from: i */
    private static final C1880bk f9515i = new C1880bk("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f9516j;

    /* renamed from: k */
    private static final int f9517k = 0;

    /* renamed from: a */
    public Map<String, C2024e> f9518a;

    /* renamed from: b */
    public int f9519b;

    /* renamed from: c */
    public String f9520c;

    /* renamed from: l */
    private byte f9521l;

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    private static class a extends AbstractC1895bz<C2023d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2023d c2023d) throws C1865aw {
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
                        } else if (b4 == 11) {
                            c2023d.f9520c = abstractC1885bp.mo7003z();
                            c2023d.m7870c(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 8) {
                        c2023d.f9519b = abstractC1885bp.mo7000w();
                        c2023d.m7868b(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 13) {
                    C1882bm c1882bmMo6991n = abstractC1885bp.mo6991n();
                    c2023d.f9518a = new HashMap(c1882bmMo6991n.f8505c * 2);
                    for (int i4 = 0; i4 < c1882bmMo6991n.f8505c; i4++) {
                        String strMo7003z = abstractC1885bp.mo7003z();
                        C2024e c2024e = new C2024e();
                        c2024e.read(abstractC1885bp);
                        c2023d.f9518a.put(strMo7003z, c2024e);
                    }
                    abstractC1885bp.mo6992o();
                    c2023d.m7865a(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
            abstractC1885bp.mo6988k();
            if (c2023d.m7875h()) {
                c2023d.m7879l();
                return;
            }
            throw new C1886bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2023d c2023d) throws C1865aw {
            c2023d.m7879l();
            abstractC1885bp.mo6971a(C2023d.f9512f);
            if (c2023d.f9518a != null) {
                abstractC1885bp.mo6966a(C2023d.f9513g);
                abstractC1885bp.mo6968a(new C1882bm((byte) 11, (byte) 12, c2023d.f9518a.size()));
                for (Map.Entry<String, C2024e> entry : c2023d.f9518a.entrySet()) {
                    abstractC1885bp.mo6972a(entry.getKey());
                    entry.getValue().write(abstractC1885bp);
                }
                abstractC1885bp.mo6982e();
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6966a(C2023d.f9514h);
            abstractC1885bp.mo6964a(c2023d.f9519b);
            abstractC1885bp.mo6978c();
            if (c2023d.f9520c != null) {
                abstractC1885bp.mo6966a(C2023d.f9515i);
                abstractC1885bp.mo6972a(c2023d.f9520c);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    private static class c extends AbstractC1897ca<C2023d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2023d c2023d) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6964a(c2023d.f9518a.size());
            for (Map.Entry<String, C2024e> entry : c2023d.f9518a.entrySet()) {
                c1891bv.mo6972a(entry.getKey());
                entry.getValue().write(c1891bv);
            }
            c1891bv.mo6964a(c2023d.f9519b);
            c1891bv.mo6972a(c2023d.f9520c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2023d c2023d) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            C1882bm c1882bm = new C1882bm((byte) 11, (byte) 12, c1891bv.mo7000w());
            c2023d.f9518a = new HashMap(c1882bm.f8505c * 2);
            for (int i4 = 0; i4 < c1882bm.f8505c; i4++) {
                String strMo7003z = c1891bv.mo7003z();
                C2024e c2024e = new C2024e();
                c2024e.read(c1891bv);
                c2023d.f9518a.put(strMo7003z, c2024e);
            }
            c2023d.m7865a(true);
            c2023d.f9519b = c1891bv.mo7000w();
            c2023d.m7868b(true);
            c2023d.f9520c = c1891bv.mo7003z();
            c2023d.m7870c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
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
        f9516j = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new C1872bc("property", (byte) 1, new C1875bf(C1892bw.f8536k, new C1873bd((byte) 11), new C1877bh((byte) 12, C2024e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new C1872bc(Constants.SP_KEY_VERSION, (byte) 1, new C1873bd((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C1872bc("checksum", (byte) 1, new C1873bd((byte) 11)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9510d = mapUnmodifiableMap;
        C1872bc.m6953a(C2023d.class, mapUnmodifiableMap);
    }

    public C2023d() {
        this.f9521l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2023d deepCopy() {
        return new C2023d(this);
    }

    /* renamed from: b */
    public int m7866b() {
        Map<String, C2024e> map = this.f9518a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C2024e> m7869c() {
        return this.f9518a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f9518a = null;
        m7868b(false);
        this.f9519b = 0;
        this.f9520c = null;
    }

    /* renamed from: d */
    public void m7871d() {
        this.f9518a = null;
    }

    /* renamed from: e */
    public boolean m7872e() {
        return this.f9518a != null;
    }

    /* renamed from: f */
    public int m7873f() {
        return this.f9519b;
    }

    /* renamed from: g */
    public void m7874g() {
        this.f9521l = C1856an.m6871b(this.f9521l, 0);
    }

    /* renamed from: h */
    public boolean m7875h() {
        return C1856an.m6867a(this.f9521l, 0);
    }

    /* renamed from: i */
    public String m7876i() {
        return this.f9520c;
    }

    /* renamed from: j */
    public void m7877j() {
        this.f9520c = null;
    }

    /* renamed from: k */
    public boolean m7878k() {
        return this.f9520c != null;
    }

    /* renamed from: l */
    public void m7879l() throws C1865aw {
        if (this.f9518a == null) {
            throw new C1886bq("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f9520c != null) {
            return;
        }
        throw new C1886bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9516j.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, C2024e> map = this.f9518a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f9519b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f9520c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9516j.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    public enum e implements InterfaceC1866ax {
        PROPERTY(1, "property"),
        VERSION(2, Constants.SP_KEY_VERSION),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f9525d = new HashMap();

        /* renamed from: e */
        private final short f9527e;

        /* renamed from: f */
        private final String f9528f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9525d.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f9527e = s3;
            this.f9528f = str;
        }

        /* renamed from: a */
        public static e m7886a(int i4) {
            if (i4 == 1) {
                return PROPERTY;
            }
            if (i4 == 2) {
                return VERSION;
            }
            if (i4 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static e m7888b(int i4) {
            e eVarM7886a = m7886a(i4);
            if (eVarM7886a != null) {
                return eVarM7886a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9528f;
        }

        /* renamed from: a */
        public static e m7887a(String str) {
            return f9525d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9527e;
        }
    }

    /* renamed from: a */
    public void m7864a(String str, C2024e c2024e) {
        if (this.f9518a == null) {
            this.f9518a = new HashMap();
        }
        this.f9518a.put(str, c2024e);
    }

    /* renamed from: b */
    public void m7868b(boolean z3) {
        this.f9521l = C1856an.m6859a(this.f9521l, 0, z3);
    }

    /* renamed from: c */
    public void m7870c(boolean z3) {
        if (z3) {
            return;
        }
        this.f9520c = null;
    }

    public C2023d(Map<String, C2024e> map, int i4, String str) {
        this();
        this.f9518a = map;
        this.f9519b = i4;
        m7868b(true);
        this.f9520c = str;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m7886a(i4);
    }

    /* renamed from: a */
    public C2023d m7863a(Map<String, C2024e> map) {
        this.f9518a = map;
        return this;
    }

    /* renamed from: a */
    public void m7865a(boolean z3) {
        if (z3) {
            return;
        }
        this.f9518a = null;
    }

    /* renamed from: a */
    public C2023d m7861a(int i4) {
        this.f9519b = i4;
        m7868b(true);
        return this;
    }

    public C2023d(C2023d c2023d) {
        this.f9521l = (byte) 0;
        this.f9521l = c2023d.f9521l;
        if (c2023d.m7872e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C2024e> entry : c2023d.f9518a.entrySet()) {
                map.put(entry.getKey(), new C2024e(entry.getValue()));
            }
            this.f9518a = map;
        }
        this.f9519b = c2023d.f9519b;
        if (c2023d.m7878k()) {
            this.f9520c = c2023d.f9520c;
        }
    }

    /* renamed from: a */
    public C2023d m7862a(String str) {
        this.f9520c = str;
        return this;
    }

    /* renamed from: a */
    private void m7855a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m7854a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9521l = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
