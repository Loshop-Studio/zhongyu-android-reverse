package com.umeng.analytics.pro;

import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.aj */
/* loaded from: classes.dex */
public class C1852aj implements InterfaceC1859aq<C1852aj, e>, Serializable, Cloneable {

    /* renamed from: A */
    private static final int f8339A = 2;

    /* renamed from: B */
    private static final int f8340B = 3;

    /* renamed from: k */
    public static final Map<e, C1872bc> f8341k;

    /* renamed from: l */
    private static final long f8342l = 420342210744516016L;

    /* renamed from: m */
    private static final C1890bu f8343m = new C1890bu("UMEnvelope");

    /* renamed from: n */
    private static final C1880bk f8344n = new C1880bk(Constants.SP_KEY_VERSION, (byte) 11, 1);

    /* renamed from: o */
    private static final C1880bk f8345o = new C1880bk("address", (byte) 11, 2);

    /* renamed from: p */
    private static final C1880bk f8346p = new C1880bk("signature", (byte) 11, 3);

    /* renamed from: q */
    private static final C1880bk f8347q = new C1880bk("serial_num", (byte) 8, 4);

    /* renamed from: r */
    private static final C1880bk f8348r = new C1880bk("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    private static final C1880bk f8349s = new C1880bk("length", (byte) 8, 6);

    /* renamed from: t */
    private static final C1880bk f8350t = new C1880bk("entity", (byte) 11, 7);

    /* renamed from: u */
    private static final C1880bk f8351u = new C1880bk("guid", (byte) 11, 8);

    /* renamed from: v */
    private static final C1880bk f8352v = new C1880bk("checksum", (byte) 11, 9);

    /* renamed from: w */
    private static final C1880bk f8353w = new C1880bk("codex", (byte) 8, 10);

    /* renamed from: x */
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> f8354x;

    /* renamed from: y */
    private static final int f8355y = 0;

    /* renamed from: z */
    private static final int f8356z = 1;

    /* renamed from: C */
    private byte f8357C;

    /* renamed from: D */
    private e[] f8358D;

    /* renamed from: a */
    public String f8359a;

    /* renamed from: b */
    public String f8360b;

    /* renamed from: c */
    public String f8361c;

    /* renamed from: d */
    public int f8362d;

    /* renamed from: e */
    public int f8363e;

    /* renamed from: f */
    public int f8364f;

    /* renamed from: g */
    public ByteBuffer f8365g;

    /* renamed from: h */
    public String f8366h;

    /* renamed from: i */
    public String f8367i;

    /* renamed from: j */
    public int f8368j;

    /* renamed from: com.umeng.analytics.pro.aj$a */
    private static class a extends AbstractC1895bz<C1852aj> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C1852aj c1852aj) throws C1865aw {
            abstractC1885bp.mo6987j();
            while (true) {
                C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
                byte b4 = c1880bkMo6989l.f8499b;
                if (b4 == 0) {
                    abstractC1885bp.mo6988k();
                    if (!c1852aj.m6818m()) {
                        throw new C1886bq("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c1852aj.m6821p()) {
                        throw new C1886bq("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (c1852aj.m6824s()) {
                        c1852aj.m6783G();
                        return;
                    }
                    throw new C1886bq("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (c1880bkMo6989l.f8500c) {
                    case 1:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8359a = abstractC1885bp.mo7003z();
                            c1852aj.m6789a(true);
                            break;
                        }
                    case 2:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8360b = abstractC1885bp.mo7003z();
                            c1852aj.m6793b(true);
                            break;
                        }
                    case 3:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8361c = abstractC1885bp.mo7003z();
                            c1852aj.m6797c(true);
                            break;
                        }
                    case 4:
                        if (b4 != 8) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8362d = abstractC1885bp.mo7000w();
                            c1852aj.m6800d(true);
                            break;
                        }
                    case 5:
                        if (b4 != 8) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8363e = abstractC1885bp.mo7000w();
                            c1852aj.m6805e(true);
                            break;
                        }
                    case 6:
                        if (b4 != 8) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8364f = abstractC1885bp.mo7000w();
                            c1852aj.m6807f(true);
                            break;
                        }
                    case 7:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8365g = abstractC1885bp.mo6960A();
                            c1852aj.m6808g(true);
                            break;
                        }
                    case 8:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8366h = abstractC1885bp.mo7003z();
                            c1852aj.m6811h(true);
                            break;
                        }
                    case 9:
                        if (b4 != 11) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8367i = abstractC1885bp.mo7003z();
                            c1852aj.m6813i(true);
                            break;
                        }
                    case 10:
                        if (b4 != 8) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                            break;
                        } else {
                            c1852aj.f8368j = abstractC1885bp.mo7000w();
                            c1852aj.m6814j(true);
                            break;
                        }
                    default:
                        C1888bs.m7033a(abstractC1885bp, b4);
                        break;
                }
                abstractC1885bp.mo6990m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C1852aj c1852aj) throws C1865aw {
            c1852aj.m6783G();
            abstractC1885bp.mo6971a(C1852aj.f8343m);
            if (c1852aj.f8359a != null) {
                abstractC1885bp.mo6966a(C1852aj.f8344n);
                abstractC1885bp.mo6972a(c1852aj.f8359a);
                abstractC1885bp.mo6978c();
            }
            if (c1852aj.f8360b != null) {
                abstractC1885bp.mo6966a(C1852aj.f8345o);
                abstractC1885bp.mo6972a(c1852aj.f8360b);
                abstractC1885bp.mo6978c();
            }
            if (c1852aj.f8361c != null) {
                abstractC1885bp.mo6966a(C1852aj.f8346p);
                abstractC1885bp.mo6972a(c1852aj.f8361c);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6966a(C1852aj.f8347q);
            abstractC1885bp.mo6964a(c1852aj.f8362d);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6966a(C1852aj.f8348r);
            abstractC1885bp.mo6964a(c1852aj.f8363e);
            abstractC1885bp.mo6978c();
            abstractC1885bp.mo6966a(C1852aj.f8349s);
            abstractC1885bp.mo6964a(c1852aj.f8364f);
            abstractC1885bp.mo6978c();
            if (c1852aj.f8365g != null) {
                abstractC1885bp.mo6966a(C1852aj.f8350t);
                abstractC1885bp.mo6973a(c1852aj.f8365g);
                abstractC1885bp.mo6978c();
            }
            if (c1852aj.f8366h != null) {
                abstractC1885bp.mo6966a(C1852aj.f8351u);
                abstractC1885bp.mo6972a(c1852aj.f8366h);
                abstractC1885bp.mo6978c();
            }
            if (c1852aj.f8367i != null) {
                abstractC1885bp.mo6966a(C1852aj.f8352v);
                abstractC1885bp.mo6972a(c1852aj.f8367i);
                abstractC1885bp.mo6978c();
            }
            if (c1852aj.m6782F()) {
                abstractC1885bp.mo6966a(C1852aj.f8353w);
                abstractC1885bp.mo6964a(c1852aj.f8368j);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$b */
    private static class b implements InterfaceC1894by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo6837b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$c */
    private static class c extends AbstractC1897ca<C1852aj> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, C1852aj c1852aj) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6972a(c1852aj.f8359a);
            c1891bv.mo6972a(c1852aj.f8360b);
            c1891bv.mo6972a(c1852aj.f8361c);
            c1891bv.mo6964a(c1852aj.f8362d);
            c1891bv.mo6964a(c1852aj.f8363e);
            c1891bv.mo6964a(c1852aj.f8364f);
            c1891bv.mo6973a(c1852aj.f8365g);
            c1891bv.mo6972a(c1852aj.f8366h);
            c1891bv.mo6972a(c1852aj.f8367i);
            BitSet bitSet = new BitSet();
            if (c1852aj.m6782F()) {
                bitSet.set(0);
            }
            c1891bv.m7037a(bitSet, 1);
            if (c1852aj.m6782F()) {
                c1891bv.mo6964a(c1852aj.f8368j);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, C1852aj c1852aj) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1852aj.f8359a = c1891bv.mo7003z();
            c1852aj.m6789a(true);
            c1852aj.f8360b = c1891bv.mo7003z();
            c1852aj.m6793b(true);
            c1852aj.f8361c = c1891bv.mo7003z();
            c1852aj.m6797c(true);
            c1852aj.f8362d = c1891bv.mo7000w();
            c1852aj.m6800d(true);
            c1852aj.f8363e = c1891bv.mo7000w();
            c1852aj.m6805e(true);
            c1852aj.f8364f = c1891bv.mo7000w();
            c1852aj.m6807f(true);
            c1852aj.f8365g = c1891bv.mo6960A();
            c1852aj.m6808g(true);
            c1852aj.f8366h = c1891bv.mo7003z();
            c1852aj.m6811h(true);
            c1852aj.f8367i = c1891bv.mo7003z();
            c1852aj.m6813i(true);
            if (c1891bv.m7038b(1).get(0)) {
                c1852aj.f8368j = c1891bv.mo7000w();
                c1852aj.m6814j(true);
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$d */
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
        f8354x = map;
        map.put(AbstractC1895bz.class, new b());
        map.put(AbstractC1897ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new C1872bc(Constants.SP_KEY_VERSION, (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new C1872bc("address", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new C1872bc("signature", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new C1872bc("serial_num", (byte) 1, new C1873bd((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new C1872bc("ts_secs", (byte) 1, new C1873bd((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new C1872bc("length", (byte) 1, new C1873bd((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new C1872bc("entity", (byte) 1, new C1873bd((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new C1872bc("guid", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C1872bc("checksum", (byte) 1, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new C1872bc("codex", (byte) 2, new C1873bd((byte) 8)));
        Map<e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f8341k = mapUnmodifiableMap;
        C1872bc.m6953a(C1852aj.class, mapUnmodifiableMap);
    }

    public C1852aj() {
        this.f8357C = (byte) 0;
        this.f8358D = new e[]{e.CODEX};
    }

    /* renamed from: A */
    public String m6777A() {
        return this.f8367i;
    }

    /* renamed from: B */
    public void m6778B() {
        this.f8367i = null;
    }

    /* renamed from: C */
    public boolean m6779C() {
        return this.f8367i != null;
    }

    /* renamed from: D */
    public int m6780D() {
        return this.f8368j;
    }

    /* renamed from: E */
    public void m6781E() {
        this.f8357C = C1856an.m6871b(this.f8357C, 3);
    }

    /* renamed from: F */
    public boolean m6782F() {
        return C1856an.m6867a(this.f8357C, 3);
    }

    /* renamed from: G */
    public void m6783G() throws C1865aw {
        if (this.f8359a == null) {
            throw new C1886bq("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f8360b == null) {
            throw new C1886bq("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f8361c == null) {
            throw new C1886bq("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f8365g == null) {
            throw new C1886bq("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f8366h == null) {
            throw new C1886bq("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f8367i != null) {
            return;
        }
        throw new C1886bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1852aj deepCopy() {
        return new C1852aj(this);
    }

    /* renamed from: b */
    public String m6792b() {
        return this.f8359a;
    }

    /* renamed from: c */
    public void m6796c() {
        this.f8359a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        this.f8359a = null;
        this.f8360b = null;
        this.f8361c = null;
        m6800d(false);
        this.f8362d = 0;
        m6805e(false);
        this.f8363e = 0;
        m6807f(false);
        this.f8364f = 0;
        this.f8365g = null;
        this.f8366h = null;
        this.f8367i = null;
        m6814j(false);
        this.f8368j = 0;
    }

    /* renamed from: d */
    public boolean m6801d() {
        return this.f8359a != null;
    }

    /* renamed from: e */
    public String m6804e() {
        return this.f8360b;
    }

    /* renamed from: f */
    public void m6806f() {
        this.f8360b = null;
    }

    /* renamed from: g */
    public boolean m6809g() {
        return this.f8360b != null;
    }

    /* renamed from: h */
    public String m6810h() {
        return this.f8361c;
    }

    /* renamed from: i */
    public void m6812i() {
        this.f8361c = null;
    }

    /* renamed from: j */
    public boolean m6815j() {
        return this.f8361c != null;
    }

    /* renamed from: k */
    public int m6816k() {
        return this.f8362d;
    }

    /* renamed from: l */
    public void m6817l() {
        this.f8357C = C1856an.m6871b(this.f8357C, 0);
    }

    /* renamed from: m */
    public boolean m6818m() {
        return C1856an.m6867a(this.f8357C, 0);
    }

    /* renamed from: n */
    public int m6819n() {
        return this.f8363e;
    }

    /* renamed from: o */
    public void m6820o() {
        this.f8357C = C1856an.m6871b(this.f8357C, 1);
    }

    /* renamed from: p */
    public boolean m6821p() {
        return C1856an.m6867a(this.f8357C, 1);
    }

    /* renamed from: q */
    public int m6822q() {
        return this.f8364f;
    }

    /* renamed from: r */
    public void m6823r() {
        this.f8357C = C1856an.m6871b(this.f8357C, 2);
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f8354x.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    /* renamed from: s */
    public boolean m6824s() {
        return C1856an.m6867a(this.f8357C, 2);
    }

    /* renamed from: t */
    public byte[] m6825t() {
        m6787a(C1860ar.m6902c(this.f8365g));
        ByteBuffer byteBuffer = this.f8365g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f8359a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f8360b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f8361c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f8362d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f8363e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f8364f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f8365g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C1860ar.m6898a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f8366h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f8367i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m6782F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f8368j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public ByteBuffer m6826u() {
        return this.f8365g;
    }

    /* renamed from: v */
    public void m6827v() {
        this.f8365g = null;
    }

    /* renamed from: w */
    public boolean m6828w() {
        return this.f8365g != null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        f8354x.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: x */
    public String m6829x() {
        return this.f8366h;
    }

    /* renamed from: y */
    public void m6830y() {
        this.f8366h = null;
    }

    /* renamed from: z */
    public boolean m6831z() {
        return this.f8366h != null;
    }

    /* renamed from: com.umeng.analytics.pro.aj$e */
    public enum e implements InterfaceC1866ax {
        VERSION(1, Constants.SP_KEY_VERSION),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* renamed from: k */
        private static final Map<String, e> f8379k = new HashMap();

        /* renamed from: l */
        private final short f8381l;

        /* renamed from: m */
        private final String f8382m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f8379k.put(eVar.mo6845b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f8381l = s3;
            this.f8382m = str;
        }

        /* renamed from: a */
        public static e m6841a(int i4) {
            switch (i4) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static e m6843b(int i4) {
            e eVarM6841a = m6841a(i4);
            if (eVarM6841a != null) {
                return eVarM6841a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f8382m;
        }

        /* renamed from: a */
        public static e m6842a(String str) {
            return f8379k.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f8381l;
        }
    }

    /* renamed from: a */
    public C1852aj m6786a(String str) {
        this.f8359a = str;
        return this;
    }

    /* renamed from: b */
    public C1852aj m6791b(String str) {
        this.f8360b = str;
        return this;
    }

    /* renamed from: c */
    public C1852aj m6795c(String str) {
        this.f8361c = str;
        return this;
    }

    /* renamed from: d */
    public void m6800d(boolean z3) {
        this.f8357C = C1856an.m6859a(this.f8357C, 0, z3);
    }

    /* renamed from: e */
    public void m6805e(boolean z3) {
        this.f8357C = C1856an.m6859a(this.f8357C, 1, z3);
    }

    /* renamed from: f */
    public void m6807f(boolean z3) {
        this.f8357C = C1856an.m6859a(this.f8357C, 2, z3);
    }

    /* renamed from: g */
    public void m6808g(boolean z3) {
        if (z3) {
            return;
        }
        this.f8365g = null;
    }

    /* renamed from: h */
    public void m6811h(boolean z3) {
        if (z3) {
            return;
        }
        this.f8366h = null;
    }

    /* renamed from: i */
    public void m6813i(boolean z3) {
        if (z3) {
            return;
        }
        this.f8367i = null;
    }

    /* renamed from: j */
    public void m6814j(boolean z3) {
        this.f8357C = C1856an.m6859a(this.f8357C, 3, z3);
    }

    /* renamed from: a */
    public void m6789a(boolean z3) {
        if (z3) {
            return;
        }
        this.f8359a = null;
    }

    /* renamed from: b */
    public void m6793b(boolean z3) {
        if (z3) {
            return;
        }
        this.f8360b = null;
    }

    /* renamed from: c */
    public void m6797c(boolean z3) {
        if (z3) {
            return;
        }
        this.f8361c = null;
    }

    /* renamed from: d */
    public C1852aj m6799d(String str) {
        this.f8366h = str;
        return this;
    }

    /* renamed from: e */
    public C1852aj m6803e(String str) {
        this.f8367i = str;
        return this;
    }

    public C1852aj(String str, String str2, String str3, int i4, int i5, int i6, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f8359a = str;
        this.f8360b = str2;
        this.f8361c = str3;
        this.f8362d = i4;
        m6800d(true);
        this.f8363e = i5;
        m6805e(true);
        this.f8364f = i6;
        m6807f(true);
        this.f8365g = byteBuffer;
        this.f8366h = str4;
        this.f8367i = str5;
    }

    /* renamed from: a */
    public C1852aj m6785a(int i4) {
        this.f8362d = i4;
        m6800d(true);
        return this;
    }

    /* renamed from: b */
    public C1852aj m6790b(int i4) {
        this.f8363e = i4;
        m6805e(true);
        return this;
    }

    /* renamed from: c */
    public C1852aj m6794c(int i4) {
        this.f8364f = i4;
        m6807f(true);
        return this;
    }

    /* renamed from: d */
    public C1852aj m6798d(int i4) {
        this.f8368j = i4;
        m6814j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m6841a(i4);
    }

    /* renamed from: a */
    public C1852aj m6788a(byte[] bArr) {
        m6787a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public C1852aj m6787a(ByteBuffer byteBuffer) {
        this.f8365g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m6776a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m6775a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f8357C = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C1852aj(C1852aj c1852aj) {
        this.f8357C = (byte) 0;
        this.f8358D = new e[]{e.CODEX};
        this.f8357C = c1852aj.f8357C;
        if (c1852aj.m6801d()) {
            this.f8359a = c1852aj.f8359a;
        }
        if (c1852aj.m6809g()) {
            this.f8360b = c1852aj.f8360b;
        }
        if (c1852aj.m6815j()) {
            this.f8361c = c1852aj.f8361c;
        }
        this.f8362d = c1852aj.f8362d;
        this.f8363e = c1852aj.f8363e;
        this.f8364f = c1852aj.f8364f;
        if (c1852aj.m6828w()) {
            this.f8365g = C1860ar.m6903d(c1852aj.f8365g);
        }
        if (c1852aj.m6831z()) {
            this.f8366h = c1852aj.f8366h;
        }
        if (c1852aj.m6779C()) {
            this.f8367i = c1852aj.f8367i;
        }
        this.f8368j = c1852aj.f8368j;
    }
}
