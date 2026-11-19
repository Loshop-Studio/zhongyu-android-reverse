package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3369bp;
import com.umeng.analytics.pro.AbstractC3379bz;
import com.umeng.analytics.pro.AbstractC3381ca;
import com.umeng.analytics.pro.C3340an;
import com.umeng.analytics.pro.C3349aw;
import com.umeng.analytics.pro.C3356bc;
import com.umeng.analytics.pro.C3357bd;
import com.umeng.analytics.pro.C3363bj;
import com.umeng.analytics.pro.C3364bk;
import com.umeng.analytics.pro.C3370bq;
import com.umeng.analytics.pro.C3372bs;
import com.umeng.analytics.pro.C3374bu;
import com.umeng.analytics.pro.C3375bv;
import com.umeng.analytics.pro.C3382cb;
import com.umeng.analytics.pro.InterfaceC3343aq;
import com.umeng.analytics.pro.InterfaceC3350ax;
import com.umeng.analytics.pro.InterfaceC3377bx;
import com.umeng.analytics.pro.InterfaceC3378by;
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
/* loaded from: classes2.dex */
public class C3504a implements InterfaceC3343aq<C3504a, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final Map<e, C3356bc> f2857e;

    /* renamed from: f */
    private static final long f2858f = 9132678615281394583L;

    /* renamed from: g */
    private static final C3374bu f2859g = new C3374bu("IdJournal");

    /* renamed from: h */
    private static final C3364bk f2860h = new C3364bk("domain", (byte) 11, 1);

    /* renamed from: i */
    private static final C3364bk f2861i = new C3364bk("old_id", (byte) 11, 2);

    /* renamed from: j */
    private static final C3364bk f2862j = new C3364bk("new_id", (byte) 11, 3);

    /* renamed from: k */
    private static final C3364bk f2863k = new C3364bk("ts", (byte) 10, 4);

    /* renamed from: l */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f2864l;

    /* renamed from: m */
    private static final int f2865m = 0;

    /* renamed from: a */
    public String f2866a;

    /* renamed from: b */
    public String f2867b;

    /* renamed from: c */
    public String f2868c;

    /* renamed from: d */
    public long f2869d;

    /* renamed from: n */
    private byte f2870n;

    /* renamed from: o */
    private e[] f2871o;

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    public static class a extends AbstractC3379bz<C3504a> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3504a c3504a) throws C3349aw {
            abstractC3369bp.mo3064j();
            while (true) {
                C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
                byte b4 = c3364bkMo3066l.f1907b;
                if (b4 == 0) {
                    break;
                }
                short s3 = c3364bkMo3066l.f1908c;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            if (s3 != 4) {
                                C3372bs.m3110a(abstractC3369bp, b4);
                            } else if (b4 == 10) {
                                c3504a.f2869d = abstractC3369bp.mo3078x();
                                c3504a.m3839d(true);
                            } else {
                                C3372bs.m3110a(abstractC3369bp, b4);
                            }
                        } else if (b4 == 11) {
                            c3504a.f2868c = abstractC3369bp.mo3080z();
                            c3504a.m3838c(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 11) {
                        c3504a.f2867b = abstractC3369bp.mo3080z();
                        c3504a.m3835b(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 11) {
                    c3504a.f2866a = abstractC3369bp.mo3080z();
                    c3504a.m3832a(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
            abstractC3369bp.mo3065k();
            if (c3504a.m3849m()) {
                c3504a.m3850n();
                return;
            }
            throw new C3370bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3504a c3504a) throws C3349aw {
            c3504a.m3850n();
            abstractC3369bp.mo3048a(C3504a.f2859g);
            if (c3504a.f2866a != null) {
                abstractC3369bp.mo3043a(C3504a.f2860h);
                abstractC3369bp.mo3049a(c3504a.f2866a);
                abstractC3369bp.mo3055c();
            }
            if (c3504a.f2867b != null && c3504a.m3843g()) {
                abstractC3369bp.mo3043a(C3504a.f2861i);
                abstractC3369bp.mo3049a(c3504a.f2867b);
                abstractC3369bp.mo3055c();
            }
            if (c3504a.f2868c != null) {
                abstractC3369bp.mo3043a(C3504a.f2862j);
                abstractC3369bp.mo3049a(c3504a.f2868c);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3043a(C3504a.f2863k);
            abstractC3369bp.mo3042a(c3504a.f2869d);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    public static class c extends AbstractC3381ca<C3504a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3504a c3504a) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3049a(c3504a.f2866a);
            c3375bv.mo3049a(c3504a.f2868c);
            c3375bv.mo3042a(c3504a.f2869d);
            BitSet bitSet = new BitSet();
            if (c3504a.m3843g()) {
                bitSet.set(0);
            }
            c3375bv.m3114a(bitSet, 1);
            if (c3504a.m3843g()) {
                c3375bv.mo3049a(c3504a.f2867b);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3504a c3504a) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3504a.f2866a = c3375bv.mo3080z();
            c3504a.m3832a(true);
            c3504a.f2868c = c3375bv.mo3080z();
            c3504a.m3838c(true);
            c3504a.f2869d = c3375bv.mo3078x();
            c3504a.m3839d(true);
            if (c3375bv.m3115b(1).get(0)) {
                c3504a.f2867b = c3375bv.mo3080z();
                c3504a.m3835b(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
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
        f2864l = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new C3356bc("domain", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new C3356bc("old_id", (byte) 2, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new C3356bc("new_id", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3356bc("ts", (byte) 1, new C3357bd((byte) 10)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f2857e = mapUnmodifiableMap;
        C3356bc.m3030a(C3504a.class, mapUnmodifiableMap);
    }

    public C3504a() {
        this.f2870n = (byte) 0;
        this.f2871o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3504a deepCopy() {
        return new C3504a(this);
    }

    /* renamed from: b */
    public String m3834b() {
        return this.f2866a;
    }

    /* renamed from: c */
    public void m3837c() {
        this.f2866a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f2866a = null;
        this.f2867b = null;
        this.f2868c = null;
        m3839d(false);
        this.f2869d = 0L;
    }

    /* renamed from: d */
    public boolean m3840d() {
        return this.f2866a != null;
    }

    /* renamed from: e */
    public String m3841e() {
        return this.f2867b;
    }

    /* renamed from: f */
    public void m3842f() {
        this.f2867b = null;
    }

    /* renamed from: g */
    public boolean m3843g() {
        return this.f2867b != null;
    }

    /* renamed from: h */
    public String m3844h() {
        return this.f2868c;
    }

    /* renamed from: i */
    public void m3845i() {
        this.f2868c = null;
    }

    /* renamed from: j */
    public boolean m3846j() {
        return this.f2868c != null;
    }

    /* renamed from: k */
    public long m3847k() {
        return this.f2869d;
    }

    /* renamed from: l */
    public void m3848l() {
        this.f2870n = C3340an.m2948b(this.f2870n, 0);
    }

    /* renamed from: m */
    public boolean m3849m() {
        return C3340an.m2944a(this.f2870n, 0);
    }

    /* renamed from: n */
    public void m3850n() throws C3349aw {
        if (this.f2866a == null) {
            throw new C3370bq("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f2868c != null) {
            return;
        }
        throw new C3370bq("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2864l.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f2866a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m3843g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f2867b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f2868c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f2869d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2864l.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    public enum e implements InterfaceC3350ax {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* renamed from: e */
        private static final Map<String, e> f2876e = new HashMap();

        /* renamed from: f */
        private final short f2878f;

        /* renamed from: g */
        private final String f2879g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f2876e.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f2878f = s3;
            this.f2879g = str;
        }

        /* renamed from: a */
        public static e m3857a(int i4) {
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
        public static e m3859b(int i4) {
            e eVarM3857a = m3857a(i4);
            if (eVarM3857a != null) {
                return eVarM3857a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2879g;
        }

        /* renamed from: a */
        public static e m3858a(String str) {
            return f2876e.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2878f;
        }
    }

    /* renamed from: a */
    public C3504a m3831a(String str) {
        this.f2866a = str;
        return this;
    }

    /* renamed from: b */
    public C3504a m3833b(String str) {
        this.f2867b = str;
        return this;
    }

    /* renamed from: c */
    public C3504a m3836c(String str) {
        this.f2868c = str;
        return this;
    }

    /* renamed from: d */
    public void m3839d(boolean z3) {
        this.f2870n = C3340an.m2936a(this.f2870n, 0, z3);
    }

    /* renamed from: a */
    public void m3832a(boolean z3) {
        if (z3) {
            return;
        }
        this.f2866a = null;
    }

    /* renamed from: b */
    public void m3835b(boolean z3) {
        if (z3) {
            return;
        }
        this.f2867b = null;
    }

    /* renamed from: c */
    public void m3838c(boolean z3) {
        if (z3) {
            return;
        }
        this.f2868c = null;
    }

    public C3504a(String str, String str2, long j4) {
        this();
        this.f2866a = str;
        this.f2868c = str2;
        this.f2869d = j4;
        m3839d(true);
    }

    /* renamed from: a */
    public C3504a m3830a(long j4) {
        this.f2869d = j4;
        m3839d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m3857a(i4);
    }

    /* renamed from: a */
    private void m3822a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C3504a(C3504a c3504a) {
        this.f2870n = (byte) 0;
        this.f2871o = new e[]{e.OLD_ID};
        this.f2870n = c3504a.f2870n;
        if (c3504a.m3840d()) {
            this.f2866a = c3504a.f2866a;
        }
        if (c3504a.m3843g()) {
            this.f2867b = c3504a.f2867b;
        }
        if (c3504a.m3846j()) {
            this.f2868c = c3504a.f2868c;
        }
        this.f2869d = c3504a.f2869d;
    }

    /* renamed from: a */
    private void m3821a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f2870n = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
