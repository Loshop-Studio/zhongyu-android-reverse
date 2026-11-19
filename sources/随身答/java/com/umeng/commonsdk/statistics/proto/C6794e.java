package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC6767c;
import com.umeng.analytics.pro.C6758bc;
import com.umeng.analytics.pro.C6759bd;
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
import p114g2.C8043u;
import p114g2.InterfaceC8045w;
import p217q.AbstractC9343a;

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
/* loaded from: classes4.dex */
public class C6794e implements InterfaceC6755aq<C6794e, e>, Serializable, Cloneable {

    /* renamed from: f */
    public static final C8043u f6957f = new C8043u("ImprintValue");

    /* renamed from: g */
    public static final C8033p f6958g = new C8033p("value", (byte) 11, 1);

    /* renamed from: h */
    public static final C8033p f6959h = new C8033p("ts", (byte) 10, 2);

    /* renamed from: i */
    public static final C8033p f6960i = new C8033p("guid", (byte) 11, 3);

    /* renamed from: j */
    public static final Map f6961j;

    /* renamed from: k */
    public static final Map f6962k;

    /* renamed from: a */
    public String f6963a;

    /* renamed from: b */
    public long f6964b;

    /* renamed from: c */
    public String f6965c;

    /* renamed from: d */
    public byte f6966d = 0;

    /* renamed from: e */
    public e[] f6967e = {e.VALUE};

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6794e c6794e) throws C6765bq {
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
                            c6794e.f6965c = abstractC8039s.mo6076G();
                            c6794e.m6417t(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 10) {
                        c6794e.f6964b = abstractC8039s.mo6074E();
                        c6794e.m6416q(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 11) {
                    c6794e.f6963a = abstractC8039s.mo6076G();
                    c6794e.m6414g(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
            abstractC8039s.mo6098r();
            if (c6794e.m6420w()) {
                c6794e.m6422y();
                return;
            }
            throw new C6765bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6794e c6794e) throws C6765bq {
            c6794e.m6422y();
            abstractC8039s.mo6089i(C6794e.f6957f);
            if (c6794e.f6963a != null && c6794e.m6418u()) {
                abstractC8039s.mo6086f(C6794e.f6958g);
                abstractC8039s.mo6090j(c6794e.f6963a);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6086f(C6794e.f6959h);
            abstractC8039s.mo6085e(c6794e.f6964b);
            abstractC8039s.mo6093m();
            if (c6794e.f6965c != null) {
                abstractC8039s.mo6086f(C6794e.f6960i);
                abstractC8039s.mo6090j(c6794e.f6965c);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6794e c6794e) {
            AbstractC9343a.m15285a(abstractC8039s);
            long j9 = c6794e.f6964b;
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6794e c6794e) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    public enum e {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");


        /* renamed from: f */
        public static final Map f6971f = new HashMap();

        /* renamed from: a */
        public final short f6973a;

        /* renamed from: b */
        public final String f6974b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6971f.put(eVar.m6428a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6973a = s9;
            this.f6974b = str;
        }

        /* renamed from: a */
        public String m6428a() {
            return this.f6974b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$f */
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
        f6961j = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VALUE, (e) new C6758bc("value", (byte) 2, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C6758bc("ts", (byte) 1, new C6759bd((byte) 10)));
        enumMap.put((EnumMap) e.GUID, (e) new C6758bc("guid", (byte) 1, new C6759bd((byte) 11)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6962k = mapUnmodifiableMap;
        C6758bc.m6069a(C6794e.class, mapUnmodifiableMap);
    }

    /* renamed from: g */
    public void m6414g(boolean z9) {
        if (z9) {
            return;
        }
        this.f6963a = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6961j.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public String m6415n() {
        return this.f6963a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6961j.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    /* renamed from: q */
    public void m6416q(boolean z9) {
        this.f6966d = AbstractC8025l.m12675a(this.f6966d, 0, z9);
    }

    /* renamed from: t */
    public void m6417t(boolean z9) {
        if (z9) {
            return;
        }
        this.f6965c = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (m6418u()) {
            sb.append("value:");
            String str = this.f6963a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f6964b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f6965c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean m6418u() {
        return this.f6963a != null;
    }

    /* renamed from: v */
    public long m6419v() {
        return this.f6964b;
    }

    /* renamed from: w */
    public boolean m6420w() {
        return AbstractC8025l.m12677c(this.f6966d, 0);
    }

    /* renamed from: x */
    public String m6421x() {
        return this.f6965c;
    }

    /* renamed from: y */
    public void m6422y() throws C6765bq {
        if (this.f6965c != null) {
            return;
        }
        throw new C6765bq("Required field 'guid' was not present! Struct: " + toString());
    }
}
