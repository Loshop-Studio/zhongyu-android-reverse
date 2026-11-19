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

/* renamed from: com.umeng.commonsdk.statistics.proto.a */
/* loaded from: classes4.dex */
public class C6790a implements InterfaceC6755aq<C6790a, e>, Serializable, Cloneable {

    /* renamed from: g */
    public static final C8043u f6885g = new C8043u("IdJournal");

    /* renamed from: h */
    public static final C8033p f6886h = new C8033p("domain", (byte) 11, 1);

    /* renamed from: i */
    public static final C8033p f6887i = new C8033p("old_id", (byte) 11, 2);

    /* renamed from: j */
    public static final C8033p f6888j = new C8033p("new_id", (byte) 11, 3);

    /* renamed from: k */
    public static final C8033p f6889k = new C8033p("ts", (byte) 10, 4);

    /* renamed from: l */
    public static final Map f6890l;

    /* renamed from: m */
    public static final Map f6891m;

    /* renamed from: a */
    public String f6892a;

    /* renamed from: b */
    public String f6893b;

    /* renamed from: c */
    public String f6894c;

    /* renamed from: d */
    public long f6895d;

    /* renamed from: e */
    public byte f6896e = 0;

    /* renamed from: f */
    public e[] f6897f = {e.OLD_ID};

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6790a c6790a) throws C6765bq {
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
                            if (s9 != 4) {
                                AbstractC6767c.m6129a(abstractC8039s, b10);
                            } else if (b10 == 10) {
                                c6790a.f6895d = abstractC8039s.mo6074E();
                                c6790a.m6333x(true);
                            } else {
                                AbstractC6767c.m6129a(abstractC8039s, b10);
                            }
                        } else if (b10 == 11) {
                            c6790a.f6894c = abstractC8039s.mo6076G();
                            c6790a.m6332w(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 11) {
                        c6790a.f6893b = abstractC8039s.mo6076G();
                        c6790a.m6330u(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 11) {
                    c6790a.f6892a = abstractC8039s.mo6076G();
                    c6790a.m6328q(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
            abstractC8039s.mo6098r();
            if (c6790a.m6335z()) {
                c6790a.m6325A();
                return;
            }
            throw new C6765bq("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6790a c6790a) throws C6765bq {
            c6790a.m6325A();
            abstractC8039s.mo6089i(C6790a.f6885g);
            if (c6790a.f6892a != null) {
                abstractC8039s.mo6086f(C6790a.f6886h);
                abstractC8039s.mo6090j(c6790a.f6892a);
                abstractC8039s.mo6093m();
            }
            if (c6790a.f6893b != null && c6790a.m6334y()) {
                abstractC8039s.mo6086f(C6790a.f6887i);
                abstractC8039s.mo6090j(c6790a.f6893b);
                abstractC8039s.mo6093m();
            }
            if (c6790a.f6894c != null) {
                abstractC8039s.mo6086f(C6790a.f6888j);
                abstractC8039s.mo6090j(c6790a.f6894c);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6086f(C6790a.f6889k);
            abstractC8039s.mo6085e(c6790a.f6895d);
            abstractC8039s.mo6093m();
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6790a c6790a) {
            AbstractC9343a.m15285a(abstractC8039s);
            String str = c6790a.f6892a;
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6790a c6790a) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    public enum e {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* renamed from: g */
        public static final Map f6902g = new HashMap();

        /* renamed from: a */
        public final short f6904a;

        /* renamed from: b */
        public final String f6905b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6902g.put(eVar.m6341a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6904a = s9;
            this.f6905b = str;
        }

        /* renamed from: a */
        public String m6341a() {
            return this.f6905b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$f */
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
        f6890l = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new C6758bc("domain", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new C6758bc("old_id", (byte) 2, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new C6758bc("new_id", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new C6758bc("ts", (byte) 1, new C6759bd((byte) 10)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6891m = mapUnmodifiableMap;
        C6758bc.m6069a(C6790a.class, mapUnmodifiableMap);
    }

    /* renamed from: A */
    public void m6325A() throws C6765bq {
        if (this.f6892a == null) {
            throw new C6765bq("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f6894c != null) {
            return;
        }
        throw new C6765bq("Required field 'new_id' was not present! Struct: " + toString());
    }

    /* renamed from: g */
    public C6790a m6326g(long j9) {
        this.f6895d = j9;
        m6333x(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6890l.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public C6790a m6327n(String str) {
        this.f6892a = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6890l.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    /* renamed from: q */
    public void m6328q(boolean z9) {
        if (z9) {
            return;
        }
        this.f6892a = null;
    }

    /* renamed from: t */
    public C6790a m6329t(String str) {
        this.f6893b = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f6892a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m6334y()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f6893b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f6894c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f6895d);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void m6330u(boolean z9) {
        if (z9) {
            return;
        }
        this.f6893b = null;
    }

    /* renamed from: v */
    public C6790a m6331v(String str) {
        this.f6894c = str;
        return this;
    }

    /* renamed from: w */
    public void m6332w(boolean z9) {
        if (z9) {
            return;
        }
        this.f6894c = null;
    }

    /* renamed from: x */
    public void m6333x(boolean z9) {
        this.f6896e = AbstractC8025l.m12675a(this.f6896e, 0, z9);
    }

    /* renamed from: y */
    public boolean m6334y() {
        return this.f6893b != null;
    }

    /* renamed from: z */
    public boolean m6335z() {
        return AbstractC8025l.m12677c(this.f6896e, 0);
    }
}
