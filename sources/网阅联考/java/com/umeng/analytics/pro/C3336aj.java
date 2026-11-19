package com.umeng.analytics.pro;

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
/* loaded from: classes2.dex */
public class C3336aj implements InterfaceC3343aq<C3336aj, e>, Serializable, Cloneable {

    /* renamed from: A */
    private static final int f1747A = 2;

    /* renamed from: B */
    private static final int f1748B = 3;

    /* renamed from: k */
    public static final Map<e, C3356bc> f1749k;

    /* renamed from: l */
    private static final long f1750l = 420342210744516016L;

    /* renamed from: m */
    private static final C3374bu f1751m = new C3374bu("UMEnvelope");

    /* renamed from: n */
    private static final C3364bk f1752n = new C3364bk("version", (byte) 11, 1);

    /* renamed from: o */
    private static final C3364bk f1753o = new C3364bk("address", (byte) 11, 2);

    /* renamed from: p */
    private static final C3364bk f1754p = new C3364bk("signature", (byte) 11, 3);

    /* renamed from: q */
    private static final C3364bk f1755q = new C3364bk("serial_num", (byte) 8, 4);

    /* renamed from: r */
    private static final C3364bk f1756r = new C3364bk("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    private static final C3364bk f1757s = new C3364bk("length", (byte) 8, 6);

    /* renamed from: t */
    private static final C3364bk f1758t = new C3364bk("entity", (byte) 11, 7);

    /* renamed from: u */
    private static final C3364bk f1759u = new C3364bk("guid", (byte) 11, 8);

    /* renamed from: v */
    private static final C3364bk f1760v = new C3364bk("checksum", (byte) 11, 9);

    /* renamed from: w */
    private static final C3364bk f1761w = new C3364bk("codex", (byte) 8, 10);

    /* renamed from: x */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f1762x;

    /* renamed from: y */
    private static final int f1763y = 0;

    /* renamed from: z */
    private static final int f1764z = 1;

    /* renamed from: C */
    private byte f1765C;

    /* renamed from: D */
    private e[] f1766D;

    /* renamed from: a */
    public String f1767a;

    /* renamed from: b */
    public String f1768b;

    /* renamed from: c */
    public String f1769c;

    /* renamed from: d */
    public int f1770d;

    /* renamed from: e */
    public int f1771e;

    /* renamed from: f */
    public int f1772f;

    /* renamed from: g */
    public ByteBuffer f1773g;

    /* renamed from: h */
    public String f1774h;

    /* renamed from: i */
    public String f1775i;

    /* renamed from: j */
    public int f1776j;

    /* renamed from: com.umeng.analytics.pro.aj$a */
    public static class a extends AbstractC3379bz<C3336aj> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3336aj c3336aj) throws C3349aw {
            abstractC3369bp.mo3064j();
            while (true) {
                C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
                byte b4 = c3364bkMo3066l.f1907b;
                if (b4 == 0) {
                    abstractC3369bp.mo3065k();
                    if (!c3336aj.m2895m()) {
                        throw new C3370bq("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c3336aj.m2898p()) {
                        throw new C3370bq("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (c3336aj.m2901s()) {
                        c3336aj.m2860G();
                        return;
                    }
                    throw new C3370bq("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (c3364bkMo3066l.f1908c) {
                    case 1:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1767a = abstractC3369bp.mo3080z();
                            c3336aj.m2866a(true);
                            break;
                        }
                    case 2:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1768b = abstractC3369bp.mo3080z();
                            c3336aj.m2870b(true);
                            break;
                        }
                    case 3:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1769c = abstractC3369bp.mo3080z();
                            c3336aj.m2874c(true);
                            break;
                        }
                    case 4:
                        if (b4 != 8) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1770d = abstractC3369bp.mo3077w();
                            c3336aj.m2877d(true);
                            break;
                        }
                    case 5:
                        if (b4 != 8) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1771e = abstractC3369bp.mo3077w();
                            c3336aj.m2882e(true);
                            break;
                        }
                    case 6:
                        if (b4 != 8) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1772f = abstractC3369bp.mo3077w();
                            c3336aj.m2884f(true);
                            break;
                        }
                    case 7:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1773g = abstractC3369bp.mo3037A();
                            c3336aj.m2885g(true);
                            break;
                        }
                    case 8:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1774h = abstractC3369bp.mo3080z();
                            c3336aj.m2888h(true);
                            break;
                        }
                    case 9:
                        if (b4 != 11) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1775i = abstractC3369bp.mo3080z();
                            c3336aj.m2890i(true);
                            break;
                        }
                    case 10:
                        if (b4 != 8) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                            break;
                        } else {
                            c3336aj.f1776j = abstractC3369bp.mo3077w();
                            c3336aj.m2891j(true);
                            break;
                        }
                    default:
                        C3372bs.m3110a(abstractC3369bp, b4);
                        break;
                }
                abstractC3369bp.mo3067m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3336aj c3336aj) throws C3349aw {
            c3336aj.m2860G();
            abstractC3369bp.mo3048a(C3336aj.f1751m);
            if (c3336aj.f1767a != null) {
                abstractC3369bp.mo3043a(C3336aj.f1752n);
                abstractC3369bp.mo3049a(c3336aj.f1767a);
                abstractC3369bp.mo3055c();
            }
            if (c3336aj.f1768b != null) {
                abstractC3369bp.mo3043a(C3336aj.f1753o);
                abstractC3369bp.mo3049a(c3336aj.f1768b);
                abstractC3369bp.mo3055c();
            }
            if (c3336aj.f1769c != null) {
                abstractC3369bp.mo3043a(C3336aj.f1754p);
                abstractC3369bp.mo3049a(c3336aj.f1769c);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3043a(C3336aj.f1755q);
            abstractC3369bp.mo3041a(c3336aj.f1770d);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3043a(C3336aj.f1756r);
            abstractC3369bp.mo3041a(c3336aj.f1771e);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3043a(C3336aj.f1757s);
            abstractC3369bp.mo3041a(c3336aj.f1772f);
            abstractC3369bp.mo3055c();
            if (c3336aj.f1773g != null) {
                abstractC3369bp.mo3043a(C3336aj.f1758t);
                abstractC3369bp.mo3050a(c3336aj.f1773g);
                abstractC3369bp.mo3055c();
            }
            if (c3336aj.f1774h != null) {
                abstractC3369bp.mo3043a(C3336aj.f1759u);
                abstractC3369bp.mo3049a(c3336aj.f1774h);
                abstractC3369bp.mo3055c();
            }
            if (c3336aj.f1775i != null) {
                abstractC3369bp.mo3043a(C3336aj.f1760v);
                abstractC3369bp.mo3049a(c3336aj.f1775i);
                abstractC3369bp.mo3055c();
            }
            if (c3336aj.m2859F()) {
                abstractC3369bp.mo3043a(C3336aj.f1761w);
                abstractC3369bp.mo3041a(c3336aj.f1776j);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$c */
    public static class c extends AbstractC3381ca<C3336aj> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3336aj c3336aj) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3049a(c3336aj.f1767a);
            c3375bv.mo3049a(c3336aj.f1768b);
            c3375bv.mo3049a(c3336aj.f1769c);
            c3375bv.mo3041a(c3336aj.f1770d);
            c3375bv.mo3041a(c3336aj.f1771e);
            c3375bv.mo3041a(c3336aj.f1772f);
            c3375bv.mo3050a(c3336aj.f1773g);
            c3375bv.mo3049a(c3336aj.f1774h);
            c3375bv.mo3049a(c3336aj.f1775i);
            BitSet bitSet = new BitSet();
            if (c3336aj.m2859F()) {
                bitSet.set(0);
            }
            c3375bv.m3114a(bitSet, 1);
            if (c3336aj.m2859F()) {
                c3375bv.mo3041a(c3336aj.f1776j);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3336aj c3336aj) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3336aj.f1767a = c3375bv.mo3080z();
            c3336aj.m2866a(true);
            c3336aj.f1768b = c3375bv.mo3080z();
            c3336aj.m2870b(true);
            c3336aj.f1769c = c3375bv.mo3080z();
            c3336aj.m2874c(true);
            c3336aj.f1770d = c3375bv.mo3077w();
            c3336aj.m2877d(true);
            c3336aj.f1771e = c3375bv.mo3077w();
            c3336aj.m2882e(true);
            c3336aj.f1772f = c3375bv.mo3077w();
            c3336aj.m2884f(true);
            c3336aj.f1773g = c3375bv.mo3037A();
            c3336aj.m2885g(true);
            c3336aj.f1774h = c3375bv.mo3080z();
            c3336aj.m2888h(true);
            c3336aj.f1775i = c3375bv.mo3080z();
            c3336aj.m2890i(true);
            if (c3375bv.m3115b(1).get(0)) {
                c3336aj.f1776j = c3375bv.mo3077w();
                c3336aj.m2891j(true);
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$d */
    public static class d implements InterfaceC3378by {
        private d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo2914b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f1762x = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new C3356bc("version", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new C3356bc("address", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new C3356bc("signature", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new C3356bc("serial_num", (byte) 1, new C3357bd((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new C3356bc("ts_secs", (byte) 1, new C3357bd((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new C3356bc("length", (byte) 1, new C3357bd((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new C3356bc("entity", (byte) 1, new C3357bd((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new C3356bc("guid", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3356bc("checksum", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new C3356bc("codex", (byte) 2, new C3357bd((byte) 8)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f1749k = mapUnmodifiableMap;
        C3356bc.m3030a(C3336aj.class, mapUnmodifiableMap);
    }

    public C3336aj() {
        this.f1765C = (byte) 0;
        this.f1766D = new e[]{e.CODEX};
    }

    /* renamed from: A */
    public String m2854A() {
        return this.f1775i;
    }

    /* renamed from: B */
    public void m2855B() {
        this.f1775i = null;
    }

    /* renamed from: C */
    public boolean m2856C() {
        return this.f1775i != null;
    }

    /* renamed from: D */
    public int m2857D() {
        return this.f1776j;
    }

    /* renamed from: E */
    public void m2858E() {
        this.f1765C = C3340an.m2948b(this.f1765C, 3);
    }

    /* renamed from: F */
    public boolean m2859F() {
        return C3340an.m2944a(this.f1765C, 3);
    }

    /* renamed from: G */
    public void m2860G() throws C3349aw {
        if (this.f1767a == null) {
            throw new C3370bq("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f1768b == null) {
            throw new C3370bq("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f1769c == null) {
            throw new C3370bq("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f1773g == null) {
            throw new C3370bq("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f1774h == null) {
            throw new C3370bq("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f1775i != null) {
            return;
        }
        throw new C3370bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3336aj deepCopy() {
        return new C3336aj(this);
    }

    /* renamed from: b */
    public String m2869b() {
        return this.f1767a;
    }

    /* renamed from: c */
    public void m2873c() {
        this.f1767a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f1767a = null;
        this.f1768b = null;
        this.f1769c = null;
        m2877d(false);
        this.f1770d = 0;
        m2882e(false);
        this.f1771e = 0;
        m2884f(false);
        this.f1772f = 0;
        this.f1773g = null;
        this.f1774h = null;
        this.f1775i = null;
        m2891j(false);
        this.f1776j = 0;
    }

    /* renamed from: d */
    public boolean m2878d() {
        return this.f1767a != null;
    }

    /* renamed from: e */
    public String m2881e() {
        return this.f1768b;
    }

    /* renamed from: f */
    public void m2883f() {
        this.f1768b = null;
    }

    /* renamed from: g */
    public boolean m2886g() {
        return this.f1768b != null;
    }

    /* renamed from: h */
    public String m2887h() {
        return this.f1769c;
    }

    /* renamed from: i */
    public void m2889i() {
        this.f1769c = null;
    }

    /* renamed from: j */
    public boolean m2892j() {
        return this.f1769c != null;
    }

    /* renamed from: k */
    public int m2893k() {
        return this.f1770d;
    }

    /* renamed from: l */
    public void m2894l() {
        this.f1765C = C3340an.m2948b(this.f1765C, 0);
    }

    /* renamed from: m */
    public boolean m2895m() {
        return C3340an.m2944a(this.f1765C, 0);
    }

    /* renamed from: n */
    public int m2896n() {
        return this.f1771e;
    }

    /* renamed from: o */
    public void m2897o() {
        this.f1765C = C3340an.m2948b(this.f1765C, 1);
    }

    /* renamed from: p */
    public boolean m2898p() {
        return C3340an.m2944a(this.f1765C, 1);
    }

    /* renamed from: q */
    public int m2899q() {
        return this.f1772f;
    }

    /* renamed from: r */
    public void m2900r() {
        this.f1765C = C3340an.m2948b(this.f1765C, 2);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f1762x.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    /* renamed from: s */
    public boolean m2901s() {
        return C3340an.m2944a(this.f1765C, 2);
    }

    /* renamed from: t */
    public byte[] m2902t() {
        m2864a(C3344ar.m2979c(this.f1773g));
        ByteBuffer byteBuffer = this.f1773g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f1767a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f1768b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f1769c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f1770d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f1771e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f1772f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f1773g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C3344ar.m2975a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f1774h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f1775i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m2859F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f1776j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public ByteBuffer m2903u() {
        return this.f1773g;
    }

    /* renamed from: v */
    public void m2904v() {
        this.f1773g = null;
    }

    /* renamed from: w */
    public boolean m2905w() {
        return this.f1773g != null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f1762x.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: x */
    public String m2906x() {
        return this.f1774h;
    }

    /* renamed from: y */
    public void m2907y() {
        this.f1774h = null;
    }

    /* renamed from: z */
    public boolean m2908z() {
        return this.f1774h != null;
    }

    /* renamed from: com.umeng.analytics.pro.aj$e */
    public enum e implements InterfaceC3350ax {
        VERSION(1, "version"),
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
        private static final Map<String, e> f1787k = new HashMap();

        /* renamed from: l */
        private final short f1789l;

        /* renamed from: m */
        private final String f1790m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f1787k.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f1789l = s3;
            this.f1790m = str;
        }

        /* renamed from: a */
        public static e m2918a(int i4) {
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
        public static e m2920b(int i4) {
            e eVarM2918a = m2918a(i4);
            if (eVarM2918a != null) {
                return eVarM2918a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f1790m;
        }

        /* renamed from: a */
        public static e m2919a(String str) {
            return f1787k.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f1789l;
        }
    }

    /* renamed from: a */
    public C3336aj m2863a(String str) {
        this.f1767a = str;
        return this;
    }

    /* renamed from: b */
    public C3336aj m2868b(String str) {
        this.f1768b = str;
        return this;
    }

    /* renamed from: c */
    public C3336aj m2872c(String str) {
        this.f1769c = str;
        return this;
    }

    /* renamed from: d */
    public void m2877d(boolean z3) {
        this.f1765C = C3340an.m2936a(this.f1765C, 0, z3);
    }

    /* renamed from: e */
    public void m2882e(boolean z3) {
        this.f1765C = C3340an.m2936a(this.f1765C, 1, z3);
    }

    /* renamed from: f */
    public void m2884f(boolean z3) {
        this.f1765C = C3340an.m2936a(this.f1765C, 2, z3);
    }

    /* renamed from: g */
    public void m2885g(boolean z3) {
        if (z3) {
            return;
        }
        this.f1773g = null;
    }

    /* renamed from: h */
    public void m2888h(boolean z3) {
        if (z3) {
            return;
        }
        this.f1774h = null;
    }

    /* renamed from: i */
    public void m2890i(boolean z3) {
        if (z3) {
            return;
        }
        this.f1775i = null;
    }

    /* renamed from: j */
    public void m2891j(boolean z3) {
        this.f1765C = C3340an.m2936a(this.f1765C, 3, z3);
    }

    /* renamed from: a */
    public void m2866a(boolean z3) {
        if (z3) {
            return;
        }
        this.f1767a = null;
    }

    /* renamed from: b */
    public void m2870b(boolean z3) {
        if (z3) {
            return;
        }
        this.f1768b = null;
    }

    /* renamed from: c */
    public void m2874c(boolean z3) {
        if (z3) {
            return;
        }
        this.f1769c = null;
    }

    /* renamed from: d */
    public C3336aj m2876d(String str) {
        this.f1774h = str;
        return this;
    }

    /* renamed from: e */
    public C3336aj m2880e(String str) {
        this.f1775i = str;
        return this;
    }

    public C3336aj(String str, String str2, String str3, int i4, int i5, int i6, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f1767a = str;
        this.f1768b = str2;
        this.f1769c = str3;
        this.f1770d = i4;
        m2877d(true);
        this.f1771e = i5;
        m2882e(true);
        this.f1772f = i6;
        m2884f(true);
        this.f1773g = byteBuffer;
        this.f1774h = str4;
        this.f1775i = str5;
    }

    /* renamed from: a */
    public C3336aj m2862a(int i4) {
        this.f1770d = i4;
        m2877d(true);
        return this;
    }

    /* renamed from: b */
    public C3336aj m2867b(int i4) {
        this.f1771e = i4;
        m2882e(true);
        return this;
    }

    /* renamed from: c */
    public C3336aj m2871c(int i4) {
        this.f1772f = i4;
        m2884f(true);
        return this;
    }

    /* renamed from: d */
    public C3336aj m2875d(int i4) {
        this.f1776j = i4;
        m2891j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m2918a(i4);
    }

    /* renamed from: a */
    public C3336aj m2865a(byte[] bArr) {
        m2864a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a */
    public C3336aj m2864a(ByteBuffer byteBuffer) {
        this.f1773g = byteBuffer;
        return this;
    }

    /* renamed from: a */
    private void m2853a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m2852a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f1765C = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C3336aj(C3336aj c3336aj) {
        this.f1765C = (byte) 0;
        this.f1766D = new e[]{e.CODEX};
        this.f1765C = c3336aj.f1765C;
        if (c3336aj.m2878d()) {
            this.f1767a = c3336aj.f1767a;
        }
        if (c3336aj.m2886g()) {
            this.f1768b = c3336aj.f1768b;
        }
        if (c3336aj.m2892j()) {
            this.f1769c = c3336aj.f1769c;
        }
        this.f1770d = c3336aj.f1770d;
        this.f1771e = c3336aj.f1771e;
        this.f1772f = c3336aj.f1772f;
        if (c3336aj.m2905w()) {
            this.f1773g = C3344ar.m2980d(c3336aj.f1773g);
        }
        if (c3336aj.m2908z()) {
            this.f1774h = c3336aj.f1774h;
        }
        if (c3336aj.m2856C()) {
            this.f1775i = c3336aj.f1775i;
        }
        this.f1776j = c3336aj.f1776j;
    }
}
