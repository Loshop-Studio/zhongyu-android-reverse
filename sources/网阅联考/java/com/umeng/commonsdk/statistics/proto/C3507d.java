package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3369bp;
import com.umeng.analytics.pro.AbstractC3379bz;
import com.umeng.analytics.pro.AbstractC3381ca;
import com.umeng.analytics.pro.C3340an;
import com.umeng.analytics.pro.C3349aw;
import com.umeng.analytics.pro.C3356bc;
import com.umeng.analytics.pro.C3357bd;
import com.umeng.analytics.pro.C3359bf;
import com.umeng.analytics.pro.C3361bh;
import com.umeng.analytics.pro.C3363bj;
import com.umeng.analytics.pro.C3364bk;
import com.umeng.analytics.pro.C3366bm;
import com.umeng.analytics.pro.C3370bq;
import com.umeng.analytics.pro.C3372bs;
import com.umeng.analytics.pro.C3374bu;
import com.umeng.analytics.pro.C3375bv;
import com.umeng.analytics.pro.C3376bw;
import com.umeng.analytics.pro.C3382cb;
import com.umeng.analytics.pro.InterfaceC3343aq;
import com.umeng.analytics.pro.InterfaceC3350ax;
import com.umeng.analytics.pro.InterfaceC3377bx;
import com.umeng.analytics.pro.InterfaceC3378by;
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
/* loaded from: classes2.dex */
public class C3507d implements InterfaceC3343aq<C3507d, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3356bc> f2918d;

    /* renamed from: e */
    private static final long f2919e = 2846460275012375038L;

    /* renamed from: f */
    private static final C3374bu f2920f = new C3374bu("Imprint");

    /* renamed from: g */
    private static final C3364bk f2921g = new C3364bk("property", C3376bw.f1944k, 1);

    /* renamed from: h */
    private static final C3364bk f2922h = new C3364bk("version", (byte) 8, 2);

    /* renamed from: i */
    private static final C3364bk f2923i = new C3364bk("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f2924j;

    /* renamed from: k */
    private static final int f2925k = 0;

    /* renamed from: a */
    public Map<String, C3508e> f2926a;

    /* renamed from: b */
    public int f2927b;

    /* renamed from: c */
    public String f2928c;

    /* renamed from: l */
    private byte f2929l;

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    public static class a extends AbstractC3379bz<C3507d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3507d c3507d) throws C3349aw {
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
                            C3372bs.m3110a(abstractC3369bp, b4);
                        } else if (b4 == 11) {
                            c3507d.f2928c = abstractC3369bp.mo3080z();
                            c3507d.m3947c(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 8) {
                        c3507d.f2927b = abstractC3369bp.mo3077w();
                        c3507d.m3945b(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 13) {
                    C3366bm c3366bmMo3068n = abstractC3369bp.mo3068n();
                    c3507d.f2926a = new HashMap(c3366bmMo3068n.f1913c * 2);
                    for (int i4 = 0; i4 < c3366bmMo3068n.f1913c; i4++) {
                        String strMo3080z = abstractC3369bp.mo3080z();
                        C3508e c3508e = new C3508e();
                        c3508e.read(abstractC3369bp);
                        c3507d.f2926a.put(strMo3080z, c3508e);
                    }
                    abstractC3369bp.mo3069o();
                    c3507d.m3942a(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
            abstractC3369bp.mo3065k();
            if (c3507d.m3952h()) {
                c3507d.m3956l();
                return;
            }
            throw new C3370bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3507d c3507d) throws C3349aw {
            c3507d.m3956l();
            abstractC3369bp.mo3048a(C3507d.f2920f);
            if (c3507d.f2926a != null) {
                abstractC3369bp.mo3043a(C3507d.f2921g);
                abstractC3369bp.mo3045a(new C3366bm((byte) 11, (byte) 12, c3507d.f2926a.size()));
                for (Map.Entry<String, C3508e> entry : c3507d.f2926a.entrySet()) {
                    abstractC3369bp.mo3049a(entry.getKey());
                    entry.getValue().write(abstractC3369bp);
                }
                abstractC3369bp.mo3059e();
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3043a(C3507d.f2922h);
            abstractC3369bp.mo3041a(c3507d.f2927b);
            abstractC3369bp.mo3055c();
            if (c3507d.f2928c != null) {
                abstractC3369bp.mo3043a(C3507d.f2923i);
                abstractC3369bp.mo3049a(c3507d.f2928c);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    public static class c extends AbstractC3381ca<C3507d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3507d c3507d) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3041a(c3507d.f2926a.size());
            for (Map.Entry<String, C3508e> entry : c3507d.f2926a.entrySet()) {
                c3375bv.mo3049a(entry.getKey());
                entry.getValue().write(c3375bv);
            }
            c3375bv.mo3041a(c3507d.f2927b);
            c3375bv.mo3049a(c3507d.f2928c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3507d c3507d) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            C3366bm c3366bm = new C3366bm((byte) 11, (byte) 12, c3375bv.mo3077w());
            c3507d.f2926a = new HashMap(c3366bm.f1913c * 2);
            for (int i4 = 0; i4 < c3366bm.f1913c; i4++) {
                String strMo3080z = c3375bv.mo3080z();
                C3508e c3508e = new C3508e();
                c3508e.read(c3375bv);
                c3507d.f2926a.put(strMo3080z, c3508e);
            }
            c3507d.m3942a(true);
            c3507d.f2927b = c3375bv.mo3077w();
            c3507d.m3945b(true);
            c3507d.f2928c = c3375bv.mo3080z();
            c3507d.m3947c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
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
        f2924j = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new C3356bc("property", (byte) 1, new C3359bf(C3376bw.f1944k, new C3357bd((byte) 11), new C3361bh((byte) 12, C3508e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new C3356bc("version", (byte) 1, new C3357bd((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3356bc("checksum", (byte) 1, new C3357bd((byte) 11)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f2918d = mapUnmodifiableMap;
        C3356bc.m3030a(C3507d.class, mapUnmodifiableMap);
    }

    public C3507d() {
        this.f2929l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3507d deepCopy() {
        return new C3507d(this);
    }

    /* renamed from: b */
    public int m3943b() {
        Map<String, C3508e> map = this.f2926a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3508e> m3946c() {
        return this.f2926a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f2926a = null;
        m3945b(false);
        this.f2927b = 0;
        this.f2928c = null;
    }

    /* renamed from: d */
    public void m3948d() {
        this.f2926a = null;
    }

    /* renamed from: e */
    public boolean m3949e() {
        return this.f2926a != null;
    }

    /* renamed from: f */
    public int m3950f() {
        return this.f2927b;
    }

    /* renamed from: g */
    public void m3951g() {
        this.f2929l = C3340an.m2948b(this.f2929l, 0);
    }

    /* renamed from: h */
    public boolean m3952h() {
        return C3340an.m2944a(this.f2929l, 0);
    }

    /* renamed from: i */
    public String m3953i() {
        return this.f2928c;
    }

    /* renamed from: j */
    public void m3954j() {
        this.f2928c = null;
    }

    /* renamed from: k */
    public boolean m3955k() {
        return this.f2928c != null;
    }

    /* renamed from: l */
    public void m3956l() throws C3349aw {
        if (this.f2926a == null) {
            throw new C3370bq("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f2928c != null) {
            return;
        }
        throw new C3370bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2924j.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, C3508e> map = this.f2926a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f2927b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f2928c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2924j.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    public enum e implements InterfaceC3350ax {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f2933d = new HashMap();

        /* renamed from: e */
        private final short f2935e;

        /* renamed from: f */
        private final String f2936f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f2933d.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f2935e = s3;
            this.f2936f = str;
        }

        /* renamed from: a */
        public static e m3963a(int i4) {
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
        public static e m3965b(int i4) {
            e eVarM3963a = m3963a(i4);
            if (eVarM3963a != null) {
                return eVarM3963a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2936f;
        }

        /* renamed from: a */
        public static e m3964a(String str) {
            return f2933d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2935e;
        }
    }

    /* renamed from: a */
    public void m3941a(String str, C3508e c3508e) {
        if (this.f2926a == null) {
            this.f2926a = new HashMap();
        }
        this.f2926a.put(str, c3508e);
    }

    /* renamed from: b */
    public void m3945b(boolean z3) {
        this.f2929l = C3340an.m2936a(this.f2929l, 0, z3);
    }

    /* renamed from: c */
    public void m3947c(boolean z3) {
        if (z3) {
            return;
        }
        this.f2928c = null;
    }

    public C3507d(Map<String, C3508e> map, int i4, String str) {
        this();
        this.f2926a = map;
        this.f2927b = i4;
        m3945b(true);
        this.f2928c = str;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m3963a(i4);
    }

    /* renamed from: a */
    public C3507d m3940a(Map<String, C3508e> map) {
        this.f2926a = map;
        return this;
    }

    /* renamed from: a */
    public void m3942a(boolean z3) {
        if (z3) {
            return;
        }
        this.f2926a = null;
    }

    /* renamed from: a */
    public C3507d m3938a(int i4) {
        this.f2927b = i4;
        m3945b(true);
        return this;
    }

    public C3507d(C3507d c3507d) {
        this.f2929l = (byte) 0;
        this.f2929l = c3507d.f2929l;
        if (c3507d.m3949e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C3508e> entry : c3507d.f2926a.entrySet()) {
                map.put(entry.getKey(), new C3508e(entry.getValue()));
            }
            this.f2926a = map;
        }
        this.f2927b = c3507d.f2927b;
        if (c3507d.m3955k()) {
            this.f2928c = c3507d.f2928c;
        }
    }

    /* renamed from: a */
    public C3507d m3939a(String str) {
        this.f2928c = str;
        return this;
    }

    /* renamed from: a */
    private void m3932a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m3931a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f2929l = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
