package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC1885bp;
import com.umeng.analytics.pro.AbstractC1895bz;
import com.umeng.analytics.pro.AbstractC1897ca;
import com.umeng.analytics.pro.C1865aw;
import com.umeng.analytics.pro.C1872bc;
import com.umeng.analytics.pro.C1873bd;
import com.umeng.analytics.pro.C1874be;
import com.umeng.analytics.pro.C1875bf;
import com.umeng.analytics.pro.C1877bh;
import com.umeng.analytics.pro.C1879bj;
import com.umeng.analytics.pro.C1880bk;
import com.umeng.analytics.pro.C1881bl;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.c */
/* loaded from: classes.dex */
public class C2022c implements InterfaceC1859aq<C2022c, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C1872bc> f9492d;

    /* renamed from: e */
    private static final long f9493e = -5764118265293965743L;

    /* renamed from: f */
    private static final C1890bu f9494f = new C1890bu("IdTracking");

    /* renamed from: g */
    private static final C1880bk f9495g = new C1880bk("snapshots", C1892bw.f8536k, 1);

    /* renamed from: h */
    private static final C1880bk f9496h = new C1880bk("journals", C1892bw.f8538m, 2);

    /* renamed from: i */
    private static final C1880bk f9497i = new C1880bk("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f9498j;

    /* renamed from: a */
    public Map<String, C2021b> f9499a;

    /* renamed from: b */
    public List<C2020a> f9500b;

    /* renamed from: c */
    public String f9501c;

    /* renamed from: k */
    private e[] f9502k;

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    private static class a extends AbstractC1895bz<C2022c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2022c c2022c) throws C1865aw {
            abstractC1885bp.mo6987j();
            while (true) {
                C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
                byte b4 = c1880bkMo6989l.f8499b;
                if (b4 == 0) {
                    abstractC1885bp.mo6988k();
                    c2022c.m7844n();
                    return;
                }
                short s3 = c1880bkMo6989l.f8500c;
                int i4 = 0;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        } else if (b4 == 11) {
                            c2022c.f9501c = abstractC1885bp.mo7003z();
                            c2022c.m7833c(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 15) {
                        C1881bl c1881blMo6993p = abstractC1885bp.mo6993p();
                        c2022c.f9500b = new ArrayList(c1881blMo6993p.f8502b);
                        while (i4 < c1881blMo6993p.f8502b) {
                            C2020a c2020a = new C2020a();
                            c2020a.read(abstractC1885bp);
                            c2022c.f9500b.add(c2020a);
                            i4++;
                        }
                        abstractC1885bp.mo6994q();
                        c2022c.m7831b(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 13) {
                    C1882bm c1882bmMo6991n = abstractC1885bp.mo6991n();
                    c2022c.f9499a = new HashMap(c1882bmMo6991n.f8505c * 2);
                    while (i4 < c1882bmMo6991n.f8505c) {
                        String strMo7003z = abstractC1885bp.mo7003z();
                        C2021b c2021b = new C2021b();
                        c2021b.read(abstractC1885bp);
                        c2022c.f9499a.put(strMo7003z, c2021b);
                        i4++;
                    }
                    abstractC1885bp.mo6992o();
                    c2022c.m7829a(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2022c c2022c) throws C1865aw {
            c2022c.m7844n();
            abstractC1885bp.mo6971a(C2022c.f9494f);
            if (c2022c.f9499a != null) {
                abstractC1885bp.mo6966a(C2022c.f9495g);
                abstractC1885bp.mo6968a(new C1882bm((byte) 11, (byte) 12, c2022c.f9499a.size()));
                for (Map.Entry<String, C2021b> entry : c2022c.f9499a.entrySet()) {
                    abstractC1885bp.mo6972a(entry.getKey());
                    entry.getValue().write(abstractC1885bp);
                }
                abstractC1885bp.mo6982e();
                abstractC1885bp.mo6978c();
            }
            if (c2022c.f9500b != null && c2022c.m7840j()) {
                abstractC1885bp.mo6966a(C2022c.f9496h);
                abstractC1885bp.mo6967a(new C1881bl((byte) 12, c2022c.f9500b.size()));
                Iterator<C2020a> it = c2022c.f9500b.iterator();
                while (it.hasNext()) {
                    it.next().write(abstractC1885bp);
                }
                abstractC1885bp.mo6983f();
                abstractC1885bp.mo6978c();
            }
            if (c2022c.f9501c != null && c2022c.m7843m()) {
                abstractC1885bp.mo6966a(C2022c.f9497i);
                abstractC1885bp.mo6972a(c2022c.f9501c);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    private static class c extends AbstractC1897ca<C2022c> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2022c c2022c) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6964a(c2022c.f9499a.size());
            for (Map.Entry<String, C2021b> entry : c2022c.f9499a.entrySet()) {
                c1891bv.mo6972a(entry.getKey());
                entry.getValue().write(c1891bv);
            }
            BitSet bitSet = new BitSet();
            if (c2022c.m7840j()) {
                bitSet.set(0);
            }
            if (c2022c.m7843m()) {
                bitSet.set(1);
            }
            c1891bv.m7037a(bitSet, 2);
            if (c2022c.m7840j()) {
                c1891bv.mo6964a(c2022c.f9500b.size());
                Iterator<C2020a> it = c2022c.f9500b.iterator();
                while (it.hasNext()) {
                    it.next().write(c1891bv);
                }
            }
            if (c2022c.m7843m()) {
                c1891bv.mo6972a(c2022c.f9501c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2022c c2022c) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            C1882bm c1882bm = new C1882bm((byte) 11, (byte) 12, c1891bv.mo7000w());
            c2022c.f9499a = new HashMap(c1882bm.f8505c * 2);
            for (int i4 = 0; i4 < c1882bm.f8505c; i4++) {
                String strMo7003z = c1891bv.mo7003z();
                C2021b c2021b = new C2021b();
                c2021b.read(c1891bv);
                c2022c.f9499a.put(strMo7003z, c2021b);
            }
            c2022c.m7829a(true);
            BitSet bitSetM7038b = c1891bv.m7038b(2);
            if (bitSetM7038b.get(0)) {
                C1881bl c1881bl = new C1881bl((byte) 12, c1891bv.mo7000w());
                c2022c.f9500b = new ArrayList(c1881bl.f8502b);
                for (int i5 = 0; i5 < c1881bl.f8502b; i5++) {
                    C2020a c2020a = new C2020a();
                    c2020a.read(c1891bv);
                    c2022c.f9500b.add(c2020a);
                }
                c2022c.m7831b(true);
            }
            if (bitSetM7038b.get(1)) {
                c2022c.f9501c = c1891bv.mo7003z();
                c2022c.m7833c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
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
        f9498j = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new C1872bc("snapshots", (byte) 1, new C1875bf(C1892bw.f8536k, new C1873bd((byte) 11), new C1877bh((byte) 12, C2021b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new C1872bc("journals", (byte) 2, new C1874be(C1892bw.f8538m, new C1877bh((byte) 12, C2020a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C1872bc("checksum", (byte) 2, new C1873bd((byte) 11)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9492d = mapUnmodifiableMap;
        C1872bc.m6953a(C2022c.class, mapUnmodifiableMap);
    }

    public C2022c() {
        this.f9502k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2022c deepCopy() {
        return new C2022c(this);
    }

    /* renamed from: b */
    public int m7830b() {
        Map<String, C2021b> map = this.f9499a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C2021b> m7832c() {
        return this.f9499a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f9499a = null;
        this.f9500b = null;
        this.f9501c = null;
    }

    /* renamed from: d */
    public void m7834d() {
        this.f9499a = null;
    }

    /* renamed from: e */
    public boolean m7835e() {
        return this.f9499a != null;
    }

    /* renamed from: f */
    public int m7836f() {
        List<C2020a> list = this.f9500b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: g */
    public Iterator<C2020a> m7837g() {
        List<C2020a> list = this.f9500b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: h */
    public List<C2020a> m7838h() {
        return this.f9500b;
    }

    /* renamed from: i */
    public void m7839i() {
        this.f9500b = null;
    }

    /* renamed from: j */
    public boolean m7840j() {
        return this.f9500b != null;
    }

    /* renamed from: k */
    public String m7841k() {
        return this.f9501c;
    }

    /* renamed from: l */
    public void m7842l() {
        this.f9501c = null;
    }

    /* renamed from: m */
    public boolean m7843m() {
        return this.f9501c != null;
    }

    /* renamed from: n */
    public void m7844n() throws C1865aw {
        if (this.f9499a != null) {
            return;
        }
        throw new C1886bq("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9498j.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, C2021b> map = this.f9499a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (m7840j()) {
            sb.append(", ");
            sb.append("journals:");
            List<C2020a> list = this.f9500b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m7843m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f9501c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9498j.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    public enum e implements InterfaceC1866ax {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f9506d = new HashMap();

        /* renamed from: e */
        private final short f9508e;

        /* renamed from: f */
        private final String f9509f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9506d.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f9508e = s3;
            this.f9509f = str;
        }

        /* renamed from: a */
        public static e m7851a(int i4) {
            if (i4 == 1) {
                return SNAPSHOTS;
            }
            if (i4 == 2) {
                return JOURNALS;
            }
            if (i4 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static e m7853b(int i4) {
            e eVarM7851a = m7851a(i4);
            if (eVarM7851a != null) {
                return eVarM7851a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9509f;
        }

        /* renamed from: a */
        public static e m7852a(String str) {
            return f9506d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9508e;
        }
    }

    /* renamed from: a */
    public void m7828a(String str, C2021b c2021b) {
        if (this.f9499a == null) {
            this.f9499a = new HashMap();
        }
        this.f9499a.put(str, c2021b);
    }

    /* renamed from: b */
    public void m7831b(boolean z3) {
        if (z3) {
            return;
        }
        this.f9500b = null;
    }

    /* renamed from: c */
    public void m7833c(boolean z3) {
        if (z3) {
            return;
        }
        this.f9501c = null;
    }

    public C2022c(Map<String, C2021b> map) {
        this();
        this.f9499a = map;
    }

    public C2022c(C2022c c2022c) {
        this.f9502k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (c2022c.m7835e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C2021b> entry : c2022c.f9499a.entrySet()) {
                map.put(entry.getKey(), new C2021b(entry.getValue()));
            }
            this.f9499a = map;
        }
        if (c2022c.m7840j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C2020a> it = c2022c.f9500b.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2020a(it.next()));
            }
            this.f9500b = arrayList;
        }
        if (c2022c.m7843m()) {
            this.f9501c = c2022c.f9501c;
        }
    }

    /* renamed from: a */
    public C2022c m7826a(Map<String, C2021b> map) {
        this.f9499a = map;
        return this;
    }

    /* renamed from: a */
    public void m7829a(boolean z3) {
        if (z3) {
            return;
        }
        this.f9499a = null;
    }

    /* renamed from: a */
    public void m7827a(C2020a c2020a) {
        if (this.f9500b == null) {
            this.f9500b = new ArrayList();
        }
        this.f9500b.add(c2020a);
    }

    /* renamed from: a */
    public C2022c m7825a(List<C2020a> list) {
        this.f9500b = list;
        return this;
    }

    /* renamed from: a */
    public C2022c m7824a(String str) {
        this.f9501c = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m7851a(i4);
    }

    /* renamed from: a */
    private void m7817a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m7816a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
