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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
/* loaded from: classes2.dex */
public class C3505b implements InterfaceC3343aq<C3505b, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3356bc> f2880d;

    /* renamed from: e */
    private static final long f2881e = -6496538196005191531L;

    /* renamed from: f */
    private static final C3374bu f2882f = new C3374bu("IdSnapshot");

    /* renamed from: g */
    private static final C3364bk f2883g = new C3364bk("identity", (byte) 11, 1);

    /* renamed from: h */
    private static final C3364bk f2884h = new C3364bk("ts", (byte) 10, 2);

    /* renamed from: i */
    private static final C3364bk f2885i = new C3364bk("version", (byte) 8, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f2886j;

    /* renamed from: k */
    private static final int f2887k = 0;

    /* renamed from: l */
    private static final int f2888l = 1;

    /* renamed from: a */
    public String f2889a;

    /* renamed from: b */
    public long f2890b;

    /* renamed from: c */
    public int f2891c;

    /* renamed from: m */
    private byte f2892m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    public static class a extends AbstractC3379bz<C3505b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3505b c3505b) throws C3349aw {
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
                        } else if (b4 == 8) {
                            c3505b.f2891c = abstractC3369bp.mo3077w();
                            c3505b.m3875c(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 10) {
                        c3505b.f2890b = abstractC3369bp.mo3078x();
                        c3505b.m3873b(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 11) {
                    c3505b.f2889a = abstractC3369bp.mo3080z();
                    c3505b.m3870a(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
            abstractC3369bp.mo3065k();
            if (!c3505b.m3879g()) {
                throw new C3370bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (c3505b.m3882j()) {
                c3505b.m3883k();
                return;
            }
            throw new C3370bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3505b c3505b) throws C3349aw {
            c3505b.m3883k();
            abstractC3369bp.mo3048a(C3505b.f2882f);
            if (c3505b.f2889a != null) {
                abstractC3369bp.mo3043a(C3505b.f2883g);
                abstractC3369bp.mo3049a(c3505b.f2889a);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3043a(C3505b.f2884h);
            abstractC3369bp.mo3042a(c3505b.f2890b);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3043a(C3505b.f2885i);
            abstractC3369bp.mo3041a(c3505b.f2891c);
            abstractC3369bp.mo3055c();
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    public static class c extends AbstractC3381ca<C3505b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3505b c3505b) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3049a(c3505b.f2889a);
            c3375bv.mo3042a(c3505b.f2890b);
            c3375bv.mo3041a(c3505b.f2891c);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3505b c3505b) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3505b.f2889a = c3375bv.mo3080z();
            c3505b.m3870a(true);
            c3505b.f2890b = c3375bv.mo3078x();
            c3505b.m3873b(true);
            c3505b.f2891c = c3375bv.mo3077w();
            c3505b.m3875c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
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
        f2886j = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new C3356bc("identity", (byte) 1, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C3356bc("ts", (byte) 1, new C3357bd((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new C3356bc("version", (byte) 1, new C3357bd((byte) 8)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f2880d = mapUnmodifiableMap;
        C3356bc.m3030a(C3505b.class, mapUnmodifiableMap);
    }

    public C3505b() {
        this.f2892m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3505b deepCopy() {
        return new C3505b(this);
    }

    /* renamed from: b */
    public String m3872b() {
        return this.f2889a;
    }

    /* renamed from: c */
    public void m3874c() {
        this.f2889a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f2889a = null;
        m3873b(false);
        this.f2890b = 0L;
        m3875c(false);
        this.f2891c = 0;
    }

    /* renamed from: d */
    public boolean m3876d() {
        return this.f2889a != null;
    }

    /* renamed from: e */
    public long m3877e() {
        return this.f2890b;
    }

    /* renamed from: f */
    public void m3878f() {
        this.f2892m = C3340an.m2948b(this.f2892m, 0);
    }

    /* renamed from: g */
    public boolean m3879g() {
        return C3340an.m2944a(this.f2892m, 0);
    }

    /* renamed from: h */
    public int m3880h() {
        return this.f2891c;
    }

    /* renamed from: i */
    public void m3881i() {
        this.f2892m = C3340an.m2948b(this.f2892m, 1);
    }

    /* renamed from: j */
    public boolean m3882j() {
        return C3340an.m2944a(this.f2892m, 1);
    }

    /* renamed from: k */
    public void m3883k() throws C3349aw {
        if (this.f2889a != null) {
            return;
        }
        throw new C3370bq("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2886j.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f2889a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f2890b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f2891c);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2886j.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    public enum e implements InterfaceC3350ax {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* renamed from: d */
        private static final Map<String, e> f2896d = new HashMap();

        /* renamed from: e */
        private final short f2898e;

        /* renamed from: f */
        private final String f2899f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f2896d.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f2898e = s3;
            this.f2899f = str;
        }

        /* renamed from: a */
        public static e m3890a(int i4) {
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
        public static e m3892b(int i4) {
            e eVarM3890a = m3890a(i4);
            if (eVarM3890a != null) {
                return eVarM3890a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2899f;
        }

        /* renamed from: a */
        public static e m3891a(String str) {
            return f2896d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2898e;
        }
    }

    /* renamed from: a */
    public C3505b m3869a(String str) {
        this.f2889a = str;
        return this;
    }

    /* renamed from: b */
    public void m3873b(boolean z3) {
        this.f2892m = C3340an.m2936a(this.f2892m, 0, z3);
    }

    /* renamed from: c */
    public void m3875c(boolean z3) {
        this.f2892m = C3340an.m2936a(this.f2892m, 1, z3);
    }

    public C3505b(String str, long j4, int i4) {
        this();
        this.f2889a = str;
        this.f2890b = j4;
        m3873b(true);
        this.f2891c = i4;
        m3875c(true);
    }

    /* renamed from: a */
    public void m3870a(boolean z3) {
        if (z3) {
            return;
        }
        this.f2889a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m3890a(i4);
    }

    /* renamed from: a */
    public C3505b m3868a(long j4) {
        this.f2890b = j4;
        m3873b(true);
        return this;
    }

    /* renamed from: a */
    public C3505b m3867a(int i4) {
        this.f2891c = i4;
        m3875c(true);
        return this;
    }

    /* renamed from: a */
    private void m3861a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public C3505b(C3505b c3505b) {
        this.f2892m = (byte) 0;
        this.f2892m = c3505b.f2892m;
        if (c3505b.m3876d()) {
            this.f2889a = c3505b.f2889a;
        }
        this.f2890b = c3505b.f2890b;
        this.f2891c = c3505b.f2891c;
    }

    /* renamed from: a */
    private void m3860a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f2892m = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
