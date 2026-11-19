package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC6767c;
import com.umeng.analytics.pro.C6758bc;
import com.umeng.analytics.pro.C6759bd;
import com.umeng.analytics.pro.C6761bf;
import com.umeng.analytics.pro.C6762bh;
import com.umeng.analytics.pro.C6765bq;
import com.umeng.analytics.pro.InterfaceC6755aq;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p114g2.AbstractC8025l;
import p114g2.AbstractC8039s;
import p114g2.AbstractC8046x;
import p114g2.AbstractC8048z;
import p114g2.C8033p;
import p114g2.C8037r;
import p114g2.C8043u;
import p114g2.InterfaceC8045w;
import p217q.AbstractC9343a;

/* renamed from: com.umeng.commonsdk.statistics.proto.d */
/* loaded from: classes4.dex */
public class C6793d implements InterfaceC6755aq<C6793d, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final C8043u f6940e = new C8043u("Imprint");

    /* renamed from: f */
    public static final C8033p f6941f = new C8033p("property", (byte) 13, 1);

    /* renamed from: g */
    public static final C8033p f6942g = new C8033p("version", (byte) 8, 2);

    /* renamed from: h */
    public static final C8033p f6943h = new C8033p("checksum", (byte) 11, 3);

    /* renamed from: i */
    public static final Map f6944i;

    /* renamed from: j */
    public static final Map f6945j;

    /* renamed from: a */
    public Map f6946a;

    /* renamed from: b */
    public int f6947b;

    /* renamed from: c */
    public String f6948c;

    /* renamed from: d */
    public byte f6949d = 0;

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6793d c6793d) throws C6765bq {
            abstractC8039s.mo6097q();
            while (true) {
                C8033p c8033pMo6099s = abstractC8039s.mo6099s();
                byte b10 = c8033pMo6099s.f13622b;
                if (b10 == 0) {
                    break;
                }
                short s9 = c8033pMo6099s.f13623c;
                if (s9 != 1) {
                    if (s9 != 2) {
                        if (s9 != 3) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        } else if (b10 == 11) {
                            c6793d.f6948c = abstractC8039s.mo6076G();
                            c6793d.m6399w(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 8) {
                        c6793d.f6947b = abstractC8039s.mo6073D();
                        c6793d.m6397u(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 13) {
                    C8037r c8037rMo6101u = abstractC8039s.mo6101u();
                    c6793d.f6946a = new HashMap(c8037rMo6101u.f13628c * 2);
                    for (int i9 = 0; i9 < c8037rMo6101u.f13628c; i9++) {
                        String strMo6076G = abstractC8039s.mo6076G();
                        C6794e c6794e = new C6794e();
                        c6794e.mo6057p(abstractC8039s);
                        c6793d.f6946a.put(strMo6076G, c6794e);
                    }
                    abstractC8039s.mo6102v();
                    c6793d.m6395q(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
            abstractC8039s.mo6098r();
            if (c6793d.m6402z()) {
                c6793d.m6392B();
                return;
            }
            throw new C6765bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6793d c6793d) throws C6765bq {
            c6793d.m6392B();
            abstractC8039s.mo6089i(C6793d.f6940e);
            if (c6793d.f6946a != null) {
                abstractC8039s.mo6086f(C6793d.f6941f);
                abstractC8039s.mo6088h(new C8037r((byte) 11, (byte) 12, c6793d.f6946a.size()));
                for (Map.Entry entry : c6793d.f6946a.entrySet()) {
                    abstractC8039s.mo6090j((String) entry.getKey());
                    ((C6794e) entry.getValue()).mo6055m(abstractC8039s);
                }
                abstractC8039s.mo6095o();
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6086f(C6793d.f6942g);
            abstractC8039s.mo6084d(c6793d.f6947b);
            abstractC8039s.mo6093m();
            if (c6793d.f6948c != null) {
                abstractC8039s.mo6086f(C6793d.f6943h);
                abstractC8039s.mo6090j(c6793d.f6948c);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6793d c6793d) {
            AbstractC9343a.m15285a(abstractC8039s);
            c6793d.f6946a.size();
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6793d c6793d) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    public enum e {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* renamed from: f */
        public static final Map f6953f = new HashMap();

        /* renamed from: a */
        public final short f6955a;

        /* renamed from: b */
        public final String f6956b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6953f.put(eVar.m6408a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6955a = s9;
            this.f6956b = str;
        }

        /* renamed from: a */
        public String m6408a() {
            return this.f6956b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$f */
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
        f6944i = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new C6758bc("property", (byte) 1, new C6761bf((byte) 13, new C6759bd((byte) 11), new C6762bh((byte) 12, C6794e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new C6758bc("version", (byte) 1, new C6759bd((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C6758bc("checksum", (byte) 1, new C6759bd((byte) 11)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6945j = mapUnmodifiableMap;
        C6758bc.m6069a(C6793d.class, mapUnmodifiableMap);
    }

    /* renamed from: A */
    public String m6391A() {
        return this.f6948c;
    }

    /* renamed from: B */
    public void m6392B() throws C6765bq {
        if (this.f6946a == null) {
            throw new C6765bq("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f6948c != null) {
            return;
        }
        throw new C6765bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    /* renamed from: g */
    public C6793d m6393g(int i9) {
        this.f6947b = i9;
        m6397u(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6944i.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public C6793d m6394n(String str) {
        this.f6948c = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6944i.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    /* renamed from: q */
    public void m6395q(boolean z9) {
        if (z9) {
            return;
        }
        this.f6946a = null;
    }

    /* renamed from: t */
    public int m6396t() {
        Map map = this.f6946a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map map = this.f6946a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f6947b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f6948c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void m6397u(boolean z9) {
        this.f6949d = AbstractC8025l.m12675a(this.f6949d, 0, z9);
    }

    /* renamed from: v */
    public Map m6398v() {
        return this.f6946a;
    }

    /* renamed from: w */
    public void m6399w(boolean z9) {
        if (z9) {
            return;
        }
        this.f6948c = null;
    }

    /* renamed from: x */
    public boolean m6400x() {
        return this.f6946a != null;
    }

    /* renamed from: y */
    public int m6401y() {
        return this.f6947b;
    }

    /* renamed from: z */
    public boolean m6402z() {
        return AbstractC8025l.m12677c(this.f6949d, 0);
    }
}
