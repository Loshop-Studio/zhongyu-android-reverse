package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC6767c;
import com.umeng.analytics.pro.C6758bc;
import com.umeng.analytics.pro.C6759bd;
import com.umeng.analytics.pro.C6760be;
import com.umeng.analytics.pro.C6761bf;
import com.umeng.analytics.pro.C6762bh;
import com.umeng.analytics.pro.C6765bq;
import com.umeng.analytics.pro.InterfaceC6755aq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p114g2.AbstractC8039s;
import p114g2.AbstractC8046x;
import p114g2.AbstractC8048z;
import p114g2.C8033p;
import p114g2.C8035q;
import p114g2.C8037r;
import p114g2.C8043u;
import p114g2.InterfaceC8045w;
import p217q.AbstractC9343a;

/* renamed from: com.umeng.commonsdk.statistics.proto.c */
/* loaded from: classes4.dex */
public class C6792c implements InterfaceC6755aq<C6792c, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final C8043u f6923e = new C8043u("IdTracking");

    /* renamed from: f */
    public static final C8033p f6924f = new C8033p("snapshots", (byte) 13, 1);

    /* renamed from: g */
    public static final C8033p f6925g = new C8033p("journals", (byte) 15, 2);

    /* renamed from: h */
    public static final C8033p f6926h = new C8033p("checksum", (byte) 11, 3);

    /* renamed from: i */
    public static final Map f6927i;

    /* renamed from: j */
    public static final Map f6928j;

    /* renamed from: a */
    public Map f6929a;

    /* renamed from: b */
    public List f6930b;

    /* renamed from: c */
    public String f6931c;

    /* renamed from: d */
    public e[] f6932d = {e.JOURNALS, e.CHECKSUM};

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6792c c6792c) throws C6765bq {
            abstractC8039s.mo6097q();
            while (true) {
                C8033p c8033pMo6099s = abstractC8039s.mo6099s();
                byte b10 = c8033pMo6099s.f13622b;
                if (b10 == 0) {
                    abstractC8039s.mo6098r();
                    c6792c.m6379z();
                    return;
                }
                short s9 = c8033pMo6099s.f13623c;
                int i9 = 0;
                if (s9 != 1) {
                    if (s9 != 2) {
                        if (s9 != 3) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        } else if (b10 == 11) {
                            c6792c.f6931c = abstractC8039s.mo6076G();
                            c6792c.m6375v(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 15) {
                        C8035q c8035qMo6103w = abstractC8039s.mo6103w();
                        c6792c.f6930b = new ArrayList(c8035qMo6103w.f13625b);
                        while (i9 < c8035qMo6103w.f13625b) {
                            C6790a c6790a = new C6790a();
                            c6790a.mo6057p(abstractC8039s);
                            c6792c.f6930b.add(c6790a);
                            i9++;
                        }
                        abstractC8039s.mo6104x();
                        c6792c.m6373t(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 13) {
                    C8037r c8037rMo6101u = abstractC8039s.mo6101u();
                    c6792c.f6929a = new HashMap(c8037rMo6101u.f13628c * 2);
                    while (i9 < c8037rMo6101u.f13628c) {
                        String strMo6076G = abstractC8039s.mo6076G();
                        C6791b c6791b = new C6791b();
                        c6791b.mo6057p(abstractC8039s);
                        c6792c.f6929a.put(strMo6076G, c6791b);
                        i9++;
                    }
                    abstractC8039s.mo6102v();
                    c6792c.m6372q(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6792c c6792c) throws C6765bq {
            c6792c.m6379z();
            abstractC8039s.mo6089i(C6792c.f6923e);
            if (c6792c.f6929a != null) {
                abstractC8039s.mo6086f(C6792c.f6924f);
                abstractC8039s.mo6088h(new C8037r((byte) 11, (byte) 12, c6792c.f6929a.size()));
                for (Map.Entry entry : c6792c.f6929a.entrySet()) {
                    abstractC8039s.mo6090j((String) entry.getKey());
                    ((C6791b) entry.getValue()).mo6055m(abstractC8039s);
                }
                abstractC8039s.mo6095o();
                abstractC8039s.mo6093m();
            }
            if (c6792c.f6930b != null && c6792c.m6377x()) {
                abstractC8039s.mo6086f(C6792c.f6925g);
                abstractC8039s.mo6087g(new C8035q((byte) 12, c6792c.f6930b.size()));
                Iterator it = c6792c.f6930b.iterator();
                while (it.hasNext()) {
                    ((C6790a) it.next()).mo6055m(abstractC8039s);
                }
                abstractC8039s.mo6096p();
                abstractC8039s.mo6093m();
            }
            if (c6792c.f6931c != null && c6792c.m6378y()) {
                abstractC8039s.mo6086f(C6792c.f6926h);
                abstractC8039s.mo6090j(c6792c.f6931c);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6792c c6792c) {
            AbstractC9343a.m15285a(abstractC8039s);
            c6792c.f6929a.size();
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6792c c6792c) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    public enum e {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: f */
        public static final Map f6936f = new HashMap();

        /* renamed from: a */
        public final short f6938a;

        /* renamed from: b */
        public final String f6939b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6936f.put(eVar.m6385a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6938a = s9;
            this.f6939b = str;
        }

        /* renamed from: a */
        public String m6385a() {
            return this.f6939b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$f */
    public static class f implements InterfaceC8045w {
        public f() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d mo6063b() {
            return new d();
        }
    }

    static {
        HashMap map = new HashMap();
        f6927i = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new C6758bc("snapshots", (byte) 1, new C6761bf((byte) 13, new C6759bd((byte) 11), new C6762bh((byte) 12, C6791b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new C6758bc("journals", (byte) 2, new C6760be((byte) 15, new C6762bh((byte) 12, C6790a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C6758bc("checksum", (byte) 2, new C6759bd((byte) 11)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6928j = mapUnmodifiableMap;
        C6758bc.m6069a(C6792c.class, mapUnmodifiableMap);
    }

    /* renamed from: g */
    public C6792c m6370g(List list) {
        this.f6930b = list;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6927i.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public C6792c m6371n(Map map) {
        this.f6929a = map;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6927i.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    /* renamed from: q */
    public void m6372q(boolean z9) {
        if (z9) {
            return;
        }
        this.f6929a = null;
    }

    /* renamed from: t */
    public void m6373t(boolean z9) {
        if (z9) {
            return;
        }
        this.f6930b = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map map = this.f6929a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (m6377x()) {
            sb.append(", ");
            sb.append("journals:");
            List list = this.f6930b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m6378y()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f6931c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public Map m6374u() {
        return this.f6929a;
    }

    /* renamed from: v */
    public void m6375v(boolean z9) {
        if (z9) {
            return;
        }
        this.f6931c = null;
    }

    /* renamed from: w */
    public List m6376w() {
        return this.f6930b;
    }

    /* renamed from: x */
    public boolean m6377x() {
        return this.f6930b != null;
    }

    /* renamed from: y */
    public boolean m6378y() {
        return this.f6931c != null;
    }

    /* renamed from: z */
    public void m6379z() throws C6765bq {
        if (this.f6929a != null) {
            return;
        }
        throw new C6765bq("Required field 'snapshots' was not present! Struct: " + toString());
    }
}
