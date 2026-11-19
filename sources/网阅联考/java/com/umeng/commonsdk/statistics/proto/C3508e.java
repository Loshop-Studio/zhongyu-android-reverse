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

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
/* loaded from: classes2.dex */
public class C3508e implements InterfaceC3343aq<C3508e, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3356bc> f2937d;

    /* renamed from: e */
    private static final long f2938e = 7501688097813630241L;

    /* renamed from: f */
    private static final C3374bu f2939f = new C3374bu("ImprintValue");

    /* renamed from: g */
    private static final C3364bk f2940g = new C3364bk("value", (byte) 11, 1);

    /* renamed from: h */
    private static final C3364bk f2941h = new C3364bk("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C3364bk f2942i = new C3364bk("guid", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f2943j;

    /* renamed from: k */
    private static final int f2944k = 0;

    /* renamed from: a */
    public String f2945a;

    /* renamed from: b */
    public long f2946b;

    /* renamed from: c */
    public String f2947c;

    /* renamed from: l */
    private byte f2948l;

    /* renamed from: m */
    private e[] f2949m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    public static class a extends AbstractC3379bz<C3508e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3508e c3508e) throws C3349aw {
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
                            c3508e.f2947c = abstractC3369bp.mo3080z();
                            c3508e.m3981c(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 10) {
                        c3508e.f2946b = abstractC3369bp.mo3078x();
                        c3508e.m3979b(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 11) {
                    c3508e.f2945a = abstractC3369bp.mo3080z();
                    c3508e.m3976a(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
            abstractC3369bp.mo3065k();
            if (c3508e.m3985g()) {
                c3508e.m3989k();
                return;
            }
            throw new C3370bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3508e c3508e) throws C3349aw {
            c3508e.m3989k();
            abstractC3369bp.mo3048a(C3508e.f2939f);
            if (c3508e.f2945a != null && c3508e.m3982d()) {
                abstractC3369bp.mo3043a(C3508e.f2940g);
                abstractC3369bp.mo3049a(c3508e.f2945a);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3043a(C3508e.f2941h);
            abstractC3369bp.mo3042a(c3508e.f2946b);
            abstractC3369bp.mo3055c();
            if (c3508e.f2947c != null) {
                abstractC3369bp.mo3043a(C3508e.f2942i);
                abstractC3369bp.mo3049a(c3508e.f2947c);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    public static class c extends AbstractC3381ca<C3508e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3508e c3508e) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3042a(c3508e.f2946b);
            c3375bv.mo3049a(c3508e.f2947c);
            BitSet bitSet = new BitSet();
            if (c3508e.m3982d()) {
                bitSet.set(0);
            }
            c3375bv.m3114a(bitSet, 1);
            if (c3508e.m3982d()) {
                c3375bv.mo3049a(c3508e.f2945a);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3508e c3508e) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3508e.f2946b = c3375bv.mo3078x();
            c3508e.m3979b(true);
            c3508e.f2947c = c3375bv.mo3080z();
            c3508e.m3981c(true);
            if (c3375bv.m3115b(1).get(0)) {
                c3508e.f2945a = c3375bv.mo3080z();
                c3508e.m3976a(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
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
        f2943j = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VALUE, (e) new C3356bc("value", (byte) 2, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3356bc("ts", (byte) 1, new C3357bd((byte) 10)));
        enumMap.put((EnumMap) e.GUID, (e) new C3356bc("guid", (byte) 1, new C3357bd((byte) 11)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f2937d = mapUnmodifiableMap;
        C3356bc.m3030a(C3508e.class, mapUnmodifiableMap);
    }

    public C3508e() {
        this.f2948l = (byte) 0;
        this.f2949m = new e[]{e.VALUE};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3508e deepCopy() {
        return new C3508e(this);
    }

    /* renamed from: b */
    public String m3978b() {
        return this.f2945a;
    }

    /* renamed from: c */
    public void m3980c() {
        this.f2945a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f2945a = null;
        m3979b(false);
        this.f2946b = 0L;
        this.f2947c = null;
    }

    /* renamed from: d */
    public boolean m3982d() {
        return this.f2945a != null;
    }

    /* renamed from: e */
    public long m3983e() {
        return this.f2946b;
    }

    /* renamed from: f */
    public void m3984f() {
        this.f2948l = C3340an.m2948b(this.f2948l, 0);
    }

    /* renamed from: g */
    public boolean m3985g() {
        return C3340an.m2944a(this.f2948l, 0);
    }

    /* renamed from: h */
    public String m3986h() {
        return this.f2947c;
    }

    /* renamed from: i */
    public void m3987i() {
        this.f2947c = null;
    }

    /* renamed from: j */
    public boolean m3988j() {
        return this.f2947c != null;
    }

    /* renamed from: k */
    public void m3989k() throws C3349aw {
        if (this.f2947c != null) {
            return;
        }
        throw new C3370bq("Required field 'guid' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2943j.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        boolean z3;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (m3982d()) {
            sb.append("value:");
            String str = this.f2945a;
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
        sb.append(this.f2946b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f2947c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2943j.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    public enum e implements InterfaceC3350ax {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");


        /* renamed from: d */
        private static final Map<String, e> f2953d = new HashMap();

        /* renamed from: e */
        private final short f2955e;

        /* renamed from: f */
        private final String f2956f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f2953d.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f2955e = s3;
            this.f2956f = str;
        }

        /* renamed from: a */
        public static e m3996a(int i4) {
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
        public static e m3998b(int i4) {
            e eVarM3996a = m3996a(i4);
            if (eVarM3996a != null) {
                return eVarM3996a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2956f;
        }

        /* renamed from: a */
        public static e m3997a(String str) {
            return f2953d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2955e;
        }
    }

    /* renamed from: a */
    public C3508e m3975a(String str) {
        this.f2945a = str;
        return this;
    }

    /* renamed from: b */
    public void m3979b(boolean z3) {
        this.f2948l = C3340an.m2936a(this.f2948l, 0, z3);
    }

    /* renamed from: c */
    public void m3981c(boolean z3) {
        if (z3) {
            return;
        }
        this.f2947c = null;
    }

    /* renamed from: a */
    public void m3976a(boolean z3) {
        if (z3) {
            return;
        }
        this.f2945a = null;
    }

    /* renamed from: b */
    public C3508e m3977b(String str) {
        this.f2947c = str;
        return this;
    }

    public C3508e(long j4, String str) {
        this();
        this.f2946b = j4;
        m3979b(true);
        this.f2947c = str;
    }

    /* renamed from: a */
    public C3508e m3974a(long j4) {
        this.f2946b = j4;
        m3979b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m3996a(i4);
    }

    /* renamed from: a */
    private void m3967a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C3508e(C3508e c3508e) {
        this.f2948l = (byte) 0;
        this.f2949m = new e[]{e.VALUE};
        this.f2948l = c3508e.f2948l;
        if (c3508e.m3982d()) {
            this.f2945a = c3508e.f2945a;
        }
        this.f2946b = c3508e.f2946b;
        if (c3508e.m3988j()) {
            this.f2947c = c3508e.f2947c;
        }
    }

    /* renamed from: a */
    private void m3966a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f2948l = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
