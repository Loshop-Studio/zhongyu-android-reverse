package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3369bp;
import com.umeng.analytics.pro.AbstractC3379bz;
import com.umeng.analytics.pro.AbstractC3381ca;
import com.umeng.analytics.pro.C3349aw;
import com.umeng.analytics.pro.C3356bc;
import com.umeng.analytics.pro.C3357bd;
import com.umeng.analytics.pro.C3358be;
import com.umeng.analytics.pro.C3359bf;
import com.umeng.analytics.pro.C3361bh;
import com.umeng.analytics.pro.C3363bj;
import com.umeng.analytics.pro.C3364bk;
import com.umeng.analytics.pro.C3365bl;
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
/* loaded from: classes2.dex */
public class C3506c implements InterfaceC3343aq<C3506c, e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<e, C3356bc> f2900d;

    /* renamed from: e */
    private static final long f2901e = -5764118265293965743L;

    /* renamed from: f */
    private static final C3374bu f2902f = new C3374bu("IdTracking");

    /* renamed from: g */
    private static final C3364bk f2903g = new C3364bk("snapshots", C3376bw.f1944k, 1);

    /* renamed from: h */
    private static final C3364bk f2904h = new C3364bk("journals", C3376bw.f1946m, 2);

    /* renamed from: i */
    private static final C3364bk f2905i = new C3364bk("checksum", (byte) 11, 3);

    /* renamed from: j */
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> f2906j;

    /* renamed from: a */
    public Map<String, C3505b> f2907a;

    /* renamed from: b */
    public List<C3504a> f2908b;

    /* renamed from: c */
    public String f2909c;

    /* renamed from: k */
    private e[] f2910k;

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    public static class a extends AbstractC3379bz<C3506c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3506c c3506c) throws C3349aw {
            abstractC3369bp.mo3064j();
            while (true) {
                C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
                byte b4 = c3364bkMo3066l.f1907b;
                if (b4 == 0) {
                    abstractC3369bp.mo3065k();
                    c3506c.m3921n();
                    return;
                }
                short s3 = c3364bkMo3066l.f1908c;
                int i4 = 0;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        } else if (b4 == 11) {
                            c3506c.f2909c = abstractC3369bp.mo3080z();
                            c3506c.m3910c(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 15) {
                        C3365bl c3365blMo3070p = abstractC3369bp.mo3070p();
                        c3506c.f2908b = new ArrayList(c3365blMo3070p.f1910b);
                        while (i4 < c3365blMo3070p.f1910b) {
                            C3504a c3504a = new C3504a();
                            c3504a.read(abstractC3369bp);
                            c3506c.f2908b.add(c3504a);
                            i4++;
                        }
                        abstractC3369bp.mo3071q();
                        c3506c.m3908b(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 13) {
                    C3366bm c3366bmMo3068n = abstractC3369bp.mo3068n();
                    c3506c.f2907a = new HashMap(c3366bmMo3068n.f1913c * 2);
                    while (i4 < c3366bmMo3068n.f1913c) {
                        String strMo3080z = abstractC3369bp.mo3080z();
                        C3505b c3505b = new C3505b();
                        c3505b.read(abstractC3369bp);
                        c3506c.f2907a.put(strMo3080z, c3505b);
                        i4++;
                    }
                    abstractC3369bp.mo3069o();
                    c3506c.m3906a(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3506c c3506c) throws C3349aw {
            c3506c.m3921n();
            abstractC3369bp.mo3048a(C3506c.f2902f);
            if (c3506c.f2907a != null) {
                abstractC3369bp.mo3043a(C3506c.f2903g);
                abstractC3369bp.mo3045a(new C3366bm((byte) 11, (byte) 12, c3506c.f2907a.size()));
                for (Map.Entry<String, C3505b> entry : c3506c.f2907a.entrySet()) {
                    abstractC3369bp.mo3049a(entry.getKey());
                    entry.getValue().write(abstractC3369bp);
                }
                abstractC3369bp.mo3059e();
                abstractC3369bp.mo3055c();
            }
            if (c3506c.f2908b != null && c3506c.m3917j()) {
                abstractC3369bp.mo3043a(C3506c.f2904h);
                abstractC3369bp.mo3044a(new C3365bl((byte) 12, c3506c.f2908b.size()));
                Iterator<C3504a> it = c3506c.f2908b.iterator();
                while (it.hasNext()) {
                    it.next().write(abstractC3369bp);
                }
                abstractC3369bp.mo3060f();
                abstractC3369bp.mo3055c();
            }
            if (c3506c.f2909c != null && c3506c.m3920m()) {
                abstractC3369bp.mo3043a(C3506c.f2905i);
                abstractC3369bp.mo3049a(c3506c.f2909c);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    public static class b implements InterfaceC3378by {
        private b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo2914b() {
            return new a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    public static class c extends AbstractC3381ca<C3506c> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, C3506c c3506c) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3041a(c3506c.f2907a.size());
            for (Map.Entry<String, C3505b> entry : c3506c.f2907a.entrySet()) {
                c3375bv.mo3049a(entry.getKey());
                entry.getValue().write(c3375bv);
            }
            BitSet bitSet = new BitSet();
            if (c3506c.m3917j()) {
                bitSet.set(0);
            }
            if (c3506c.m3920m()) {
                bitSet.set(1);
            }
            c3375bv.m3114a(bitSet, 2);
            if (c3506c.m3917j()) {
                c3375bv.mo3041a(c3506c.f2908b.size());
                Iterator<C3504a> it = c3506c.f2908b.iterator();
                while (it.hasNext()) {
                    it.next().write(c3375bv);
                }
            }
            if (c3506c.m3920m()) {
                c3375bv.mo3049a(c3506c.f2909c);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, C3506c c3506c) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            C3366bm c3366bm = new C3366bm((byte) 11, (byte) 12, c3375bv.mo3077w());
            c3506c.f2907a = new HashMap(c3366bm.f1913c * 2);
            for (int i4 = 0; i4 < c3366bm.f1913c; i4++) {
                String strMo3080z = c3375bv.mo3080z();
                C3505b c3505b = new C3505b();
                c3505b.read(c3375bv);
                c3506c.f2907a.put(strMo3080z, c3505b);
            }
            c3506c.m3906a(true);
            BitSet bitSetM3115b = c3375bv.m3115b(2);
            if (bitSetM3115b.get(0)) {
                C3365bl c3365bl = new C3365bl((byte) 12, c3375bv.mo3077w());
                c3506c.f2908b = new ArrayList(c3365bl.f1910b);
                for (int i5 = 0; i5 < c3365bl.f1910b; i5++) {
                    C3504a c3504a = new C3504a();
                    c3504a.read(c3375bv);
                    c3506c.f2908b.add(c3504a);
                }
                c3506c.m3908b(true);
            }
            if (bitSetM3115b.get(1)) {
                c3506c.f2909c = c3375bv.mo3080z();
                c3506c.m3910c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
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
        f2906j = map;
        map.put(AbstractC3379bz.class, new b());
        map.put(AbstractC3381ca.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new C3356bc("snapshots", (byte) 1, new C3359bf(C3376bw.f1944k, new C3357bd((byte) 11), new C3361bh((byte) 12, C3505b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new C3356bc("journals", (byte) 2, new C3358be(C3376bw.f1946m, new C3361bh((byte) 12, C3504a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C3356bc("checksum", (byte) 2, new C3357bd((byte) 11)));
        Map<e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f2900d = mapUnmodifiableMap;
        C3356bc.m3030a(C3506c.class, mapUnmodifiableMap);
    }

    public C3506c() {
        this.f2910k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3506c deepCopy() {
        return new C3506c(this);
    }

    /* renamed from: b */
    public int m3907b() {
        Map<String, C3505b> map = this.f2907a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, C3505b> m3909c() {
        return this.f2907a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        this.f2907a = null;
        this.f2908b = null;
        this.f2909c = null;
    }

    /* renamed from: d */
    public void m3911d() {
        this.f2907a = null;
    }

    /* renamed from: e */
    public boolean m3912e() {
        return this.f2907a != null;
    }

    /* renamed from: f */
    public int m3913f() {
        List<C3504a> list = this.f2908b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: g */
    public Iterator<C3504a> m3914g() {
        List<C3504a> list = this.f2908b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: h */
    public List<C3504a> m3915h() {
        return this.f2908b;
    }

    /* renamed from: i */
    public void m3916i() {
        this.f2908b = null;
    }

    /* renamed from: j */
    public boolean m3917j() {
        return this.f2908b != null;
    }

    /* renamed from: k */
    public String m3918k() {
        return this.f2909c;
    }

    /* renamed from: l */
    public void m3919l() {
        this.f2909c = null;
    }

    /* renamed from: m */
    public boolean m3920m() {
        return this.f2909c != null;
    }

    /* renamed from: n */
    public void m3921n() throws C3349aw {
        if (this.f2907a != null) {
            return;
        }
        throw new C3370bq("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2906j.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, C3505b> map = this.f2907a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (m3917j()) {
            sb.append(", ");
            sb.append("journals:");
            List<C3504a> list = this.f2908b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m3920m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f2909c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        f2906j.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    public enum e implements InterfaceC3350ax {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: d */
        private static final Map<String, e> f2914d = new HashMap();

        /* renamed from: e */
        private final short f2916e;

        /* renamed from: f */
        private final String f2917f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f2914d.put(eVar.mo2922b(), eVar);
            }
        }

        e(short s3, String str) {
            this.f2916e = s3;
            this.f2917f = str;
        }

        /* renamed from: a */
        public static e m3928a(int i4) {
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
        public static e m3930b(int i4) {
            e eVarM3928a = m3928a(i4);
            if (eVarM3928a != null) {
                return eVarM3928a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2917f;
        }

        /* renamed from: a */
        public static e m3929a(String str) {
            return f2914d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2916e;
        }
    }

    /* renamed from: a */
    public void m3905a(String str, C3505b c3505b) {
        if (this.f2907a == null) {
            this.f2907a = new HashMap();
        }
        this.f2907a.put(str, c3505b);
    }

    /* renamed from: b */
    public void m3908b(boolean z3) {
        if (z3) {
            return;
        }
        this.f2908b = null;
    }

    /* renamed from: c */
    public void m3910c(boolean z3) {
        if (z3) {
            return;
        }
        this.f2909c = null;
    }

    public C3506c(Map<String, C3505b> map) {
        this();
        this.f2907a = map;
    }

    public C3506c(C3506c c3506c) {
        this.f2910k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (c3506c.m3912e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C3505b> entry : c3506c.f2907a.entrySet()) {
                map.put(entry.getKey(), new C3505b(entry.getValue()));
            }
            this.f2907a = map;
        }
        if (c3506c.m3917j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C3504a> it = c3506c.f2908b.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3504a(it.next()));
            }
            this.f2908b = arrayList;
        }
        if (c3506c.m3920m()) {
            this.f2909c = c3506c.f2909c;
        }
    }

    /* renamed from: a */
    public C3506c m3903a(Map<String, C3505b> map) {
        this.f2907a = map;
        return this;
    }

    /* renamed from: a */
    public void m3906a(boolean z3) {
        if (z3) {
            return;
        }
        this.f2907a = null;
    }

    /* renamed from: a */
    public void m3904a(C3504a c3504a) {
        if (this.f2908b == null) {
            this.f2908b = new ArrayList();
        }
        this.f2908b.add(c3504a);
    }

    /* renamed from: a */
    public C3506c m3902a(List<C3504a> list) {
        this.f2908b = list;
        return this;
    }

    /* renamed from: a */
    public C3506c m3901a(String str) {
        this.f2909c = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i4) {
        return e.m3928a(i4);
    }

    /* renamed from: a */
    private void m3894a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    /* renamed from: a */
    private void m3893a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }
}
