package com.umeng.commonsdk.statistics.proto;

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

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
/* loaded from: classes.dex */
public class C2024e implements InterfaceC1859aq<C2024e, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C1872bc> f9529d;

    /* renamed from: e */
    private static final long f9530e = 7501688097813630241L;

    /* renamed from: f */
    private static final C1890bu f9531f = new C1890bu("ImprintValue");

    /* renamed from: g */
    private static final C1880bk f9532g = new C1880bk("value", (byte) 11, 1);

    /* renamed from: h */
    private static final C1880bk f9533h = new C1880bk("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C1880bk f9534i = new C1880bk("guid", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f9535j;

    /* renamed from: k */
    private static final int f9536k = 0;

    /* renamed from: a */
    public String f9537a;

    /* renamed from: b */
    public long f9538b;

    /* renamed from: c */
    public String f9539c;

    /* renamed from: l */
    private byte f9540l;

    /* renamed from: m */
    private e[] f9541m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    private static class a extends AbstractC1895bz<C2024e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2024e c2024e) throws C1865aw {
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
                            c2024e.f9539c = abstractC1885bp.mo7003z();
                            c2024e.m7904c(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 10) {
                        c2024e.f9538b = abstractC1885bp.mo7001x();
                        c2024e.m7902b(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 11) {
                    c2024e.f9537a = abstractC1885bp.mo7003z();
                    c2024e.m7899a(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
            abstractC1885bp.mo6988k();
            if (c2024e.m7908g()) {
                c2024e.m7912k();
                return;
            }
            throw new C1886bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2024e c2024e) throws C1865aw {
            c2024e.m7912k();
            abstractC1885bp.mo6971a(C2024e.f9531f);
            if (c2024e.f9537a != null && c2024e.m7905d()) {
                abstractC1885bp.mo6966a(C2024e.f9532g);
                abstractC1885bp.mo6972a(c2024e.f9537a);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6966a(C2024e.f9533h);
            abstractC1885bp.mo6965a(c2024e.f9538b);
            abstractC1885bp.mo6978c();
            if (c2024e.f9539c != null) {
                abstractC1885bp.mo6966a(C2024e.f9534i);
                abstractC1885bp.mo6972a(c2024e.f9539c);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    private static class c extends AbstractC1897ca<C2024e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C2024e c2024e) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6965a(c2024e.f9538b);
            c1891bv.mo6972a(c2024e.f9539c);
            BitSet bitSet = new BitSet();
            if (c2024e.m7905d()) {
                bitSet.set(0);
            }
            c1891bv.m7037a(bitSet, 1);
            if (c2024e.m7905d()) {
                c1891bv.mo6972a(c2024e.f9537a);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C2024e c2024e) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c2024e.f9538b = c1891bv.mo7001x();
            c2024e.m7902b(true);
            c2024e.f9539c = c1891bv.mo7003z();
            c2024e.m7904c(true);
            if (c1891bv.m7038b(1).get(0)) {
                c2024e.f9537a = c1891bv.mo7003z();
                c2024e.m7899a(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
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
        f9535j = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VALUE, (e) new C1872bc("value", (byte) 2, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C1872bc("ts", (byte) 1, new C1873bd((byte) 10)));
        enumMap.put((EnumMap) e.GUID, (e) new C1872bc("guid", (byte) 1, new C1873bd((byte) 11)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f9529d = mapUnmodifiableMap;
        C1872bc.m6953a(C2024e.class, mapUnmodifiableMap);
    }

    public C2024e() {
        this.f9540l = (byte) 0;
        this.f9541m = new e[]{e.VALUE};
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2024e deepCopy() {
        return new C2024e(this);
    }

    /* renamed from: b */
    public String m7901b() {
        return this.f9537a;
    }

    /* renamed from: c */
    public void m7903c() {
        this.f9537a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f9537a = null;
        m7902b(false);
        this.f9538b = 0L;
        this.f9539c = null;
    }

    /* renamed from: d */
    public boolean m7905d() {
        return this.f9537a != null;
    }

    /* renamed from: e */
    public long m7906e() {
        return this.f9538b;
    }

    /* renamed from: f */
    public void m7907f() {
        this.f9540l = C1856an.m6871b(this.f9540l, 0);
    }

    /* renamed from: g */
    public boolean m7908g() {
        return C1856an.m6867a(this.f9540l, 0);
    }

    /* renamed from: h */
    public String m7909h() {
        return this.f9539c;
    }

    /* renamed from: i */
    public void m7910i() {
        this.f9539c = null;
    }

    /* renamed from: j */
    public boolean m7911j() {
        return this.f9539c != null;
    }

    /* renamed from: k */
    public void m7912k() throws C1865aw {
        if (this.f9539c != null) {
            return;
        }
        throw new C1886bq("Required field 'guid' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9535j.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public String toString() {
        boolean z3;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (m7905d()) {
            sb.append("value:");
            String str = this.f9537a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f9538b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f9539c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f9535j.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    public enum e implements InterfaceC1866ax {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");


        /* renamed from: d */
        private static final Map<String, e> f9545d = new HashMap();

        /* renamed from: e */
        private final short f9547e;

        /* renamed from: f */
        private final String f9548f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f9545d.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f9547e = s3;
            this.f9548f = str;
        }

        /* renamed from: a */
        public static e m7919a(int i4) {
            if (i4 == 1) {
                return VALUE;
            }
            if (i4 == 2) {
                return TS;
            }
            if (i4 != 3) {
                return null;
            }
            return GUID;
        }

        /* renamed from: b */
        public static e m7921b(int i4) {
            e eVarM7919a = m7919a(i4);
            if (eVarM7919a != null) {
                return eVarM7919a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9548f;
        }

        /* renamed from: a */
        public static e m7920a(String str) {
            return f9545d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9547e;
        }
    }

    /* renamed from: a */
    public C2024e m7898a(String str) {
        this.f9537a = str;
        return this;
    }

    /* renamed from: b */
    public void m7902b(boolean z3) {
        this.f9540l = C1856an.m6859a(this.f9540l, 0, z3);
    }

    /* renamed from: c */
    public void m7904c(boolean z3) {
        if (z3) {
            return;
        }
        this.f9539c = null;
    }

    /* renamed from: a */
    public void m7899a(boolean z3) {
        if (z3) {
            return;
        }
        this.f9537a = null;
    }

    /* renamed from: b */
    public C2024e m7900b(String str) {
        this.f9539c = str;
        return this;
    }

    public C2024e(long j4, String str) {
        this();
        this.f9538b = j4;
        m7902b(true);
        this.f9539c = str;
    }

    /* renamed from: a */
    public C2024e m7897a(long j4) {
        this.f9538b = j4;
        m7902b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m7919a(i4);
    }

    /* renamed from: a */
    private void m7890a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C2024e(C2024e c2024e) {
        this.f9540l = (byte) 0;
        this.f9541m = new e[]{e.VALUE};
        this.f9540l = c2024e.f9540l;
        if (c2024e.m7905d()) {
            this.f9537a = c2024e.f9537a;
        }
        this.f9538b = c2024e.f9538b;
        if (c2024e.m7911j()) {
            this.f9539c = c2024e.f9539c;
        }
    }

    /* renamed from: a */
    private void m7889a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f9540l = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
