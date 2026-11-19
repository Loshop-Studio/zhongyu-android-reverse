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

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
/* loaded from: classes4.dex */
public class C6791b implements InterfaceC6755aq<C6791b, e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final C8043u f6906e = new C8043u("IdSnapshot");

    /* renamed from: f */
    public static final C8033p f6907f = new C8033p("identity", (byte) 11, 1);

    /* renamed from: g */
    public static final C8033p f6908g = new C8033p("ts", (byte) 10, 2);

    /* renamed from: h */
    public static final C8033p f6909h = new C8033p("version", (byte) 8, 3);

    /* renamed from: i */
    public static final Map f6910i;

    /* renamed from: j */
    public static final Map f6911j;

    /* renamed from: a */
    public String f6912a;

    /* renamed from: b */
    public long f6913b;

    /* renamed from: c */
    public int f6914c;

    /* renamed from: d */
    public byte f6915d = 0;

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6791b c6791b) throws C6765bq {
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
                        } else if (b10 == 8) {
                            c6791b.f6914c = abstractC8039s.mo6073D();
                            c6791b.m6355w(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 10) {
                        c6791b.f6913b = abstractC8039s.mo6074E();
                        c6791b.m6354v(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 11) {
                    c6791b.f6912a = abstractC8039s.mo6076G();
                    c6791b.m6352t(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
            abstractC8039s.mo6098r();
            if (!c6791b.m6357y()) {
                throw new C6765bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (c6791b.m6347A()) {
                c6791b.m6348B();
                return;
            }
            throw new C6765bq("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6791b c6791b) throws C6765bq {
            c6791b.m6348B();
            abstractC8039s.mo6089i(C6791b.f6906e);
            if (c6791b.f6912a != null) {
                abstractC8039s.mo6086f(C6791b.f6907f);
                abstractC8039s.mo6090j(c6791b.f6912a);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6086f(C6791b.f6908g);
            abstractC8039s.mo6085e(c6791b.f6913b);
            abstractC8039s.mo6093m();
            abstractC8039s.mo6086f(C6791b.f6909h);
            abstractC8039s.mo6084d(c6791b.f6914c);
            abstractC8039s.mo6093m();
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6791b c6791b) {
            AbstractC9343a.m15285a(abstractC8039s);
            String str = c6791b.f6912a;
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6791b c6791b) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    public enum e {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* renamed from: f */
        public static final Map f6919f = new HashMap();

        /* renamed from: a */
        public final short f6921a;

        /* renamed from: b */
        public final String f6922b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6919f.put(eVar.m6364a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6921a = s9;
            this.f6922b = str;
        }

        /* renamed from: a */
        public String m6364a() {
            return this.f6922b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$f */
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
        f6910i = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new C6758bc("identity", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C6758bc("ts", (byte) 1, new C6759bd((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new C6758bc("version", (byte) 1, new C6759bd((byte) 8)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6911j = mapUnmodifiableMap;
        C6758bc.m6069a(C6791b.class, mapUnmodifiableMap);
    }

    /* renamed from: A */
    public boolean m6347A() {
        return AbstractC8025l.m12677c(this.f6915d, 1);
    }

    /* renamed from: B */
    public void m6348B() throws C6765bq {
        if (this.f6912a != null) {
            return;
        }
        throw new C6765bq("Required field 'identity' was not present! Struct: " + toString());
    }

    /* renamed from: g */
    public C6791b m6349g(int i9) {
        this.f6914c = i9;
        m6355w(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6910i.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public C6791b m6350n(long j9) {
        this.f6913b = j9;
        m6354v(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6910i.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    /* renamed from: q */
    public C6791b m6351q(String str) {
        this.f6912a = str;
        return this;
    }

    /* renamed from: t */
    public void m6352t(boolean z9) {
        if (z9) {
            return;
        }
        this.f6912a = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f6912a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f6913b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f6914c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public String m6353u() {
        return this.f6912a;
    }

    /* renamed from: v */
    public void m6354v(boolean z9) {
        this.f6915d = AbstractC8025l.m12675a(this.f6915d, 0, z9);
    }

    /* renamed from: w */
    public void m6355w(boolean z9) {
        this.f6915d = AbstractC8025l.m12675a(this.f6915d, 1, z9);
    }

    /* renamed from: x */
    public long m6356x() {
        return this.f6913b;
    }

    /* renamed from: y */
    public boolean m6357y() {
        return AbstractC8025l.m12677c(this.f6915d, 0);
    }

    /* renamed from: z */
    public int m6358z() {
        return this.f6914c;
    }
}
