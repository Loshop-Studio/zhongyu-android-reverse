package com.umeng.analytics.pro;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p114g2.AbstractC8025l;
import p114g2.AbstractC8029n;
import p114g2.AbstractC8039s;
import p114g2.AbstractC8046x;
import p114g2.AbstractC8048z;
import p114g2.C8033p;
import p114g2.C8043u;
import p114g2.InterfaceC8045w;
import p217q.AbstractC9343a;

/* renamed from: com.umeng.analytics.pro.aj */
/* loaded from: classes4.dex */
public class C6754aj implements InterfaceC6755aq<C6754aj, e>, Serializable, Cloneable {

    /* renamed from: m */
    public static final C8043u f6571m = new C8043u("UMEnvelope");

    /* renamed from: n */
    public static final C8033p f6572n = new C8033p("version", (byte) 11, 1);

    /* renamed from: o */
    public static final C8033p f6573o = new C8033p("address", (byte) 11, 2);

    /* renamed from: p */
    public static final C8033p f6574p = new C8033p("signature", (byte) 11, 3);

    /* renamed from: q */
    public static final C8033p f6575q = new C8033p("serial_num", (byte) 8, 4);

    /* renamed from: r */
    public static final C8033p f6576r = new C8033p("ts_secs", (byte) 8, 5);

    /* renamed from: s */
    public static final C8033p f6577s = new C8033p("length", (byte) 8, 6);

    /* renamed from: t */
    public static final C8033p f6578t = new C8033p("entity", (byte) 11, 7);

    /* renamed from: u */
    public static final C8033p f6579u = new C8033p("guid", (byte) 11, 8);

    /* renamed from: v */
    public static final C8033p f6580v = new C8033p("checksum", (byte) 11, 9);

    /* renamed from: w */
    public static final C8033p f6581w = new C8033p("codex", (byte) 8, 10);

    /* renamed from: x */
    public static final Map f6582x;

    /* renamed from: y */
    public static final Map f6583y;

    /* renamed from: a */
    public String f6584a;

    /* renamed from: b */
    public String f6585b;

    /* renamed from: c */
    public String f6586c;

    /* renamed from: d */
    public int f6587d;

    /* renamed from: e */
    public int f6588e;

    /* renamed from: f */
    public int f6589f;

    /* renamed from: g */
    public ByteBuffer f6590g;

    /* renamed from: h */
    public String f6591h;

    /* renamed from: i */
    public String f6592i;

    /* renamed from: j */
    public int f6593j;

    /* renamed from: k */
    public byte f6594k = 0;

    /* renamed from: l */
    public e[] f6595l = {e.CODEX};

    /* renamed from: com.umeng.analytics.pro.aj$b */
    public static class b extends AbstractC8046x {
        public b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6754aj c6754aj) throws C6765bq {
            abstractC8039s.mo6097q();
            while (true) {
                C8033p c8033pMo6099s = abstractC8039s.mo6099s();
                byte b10 = c8033pMo6099s.f13622b;
                if (b10 == 0) {
                    abstractC8039s.mo6098r();
                    if (!c6754aj.m6051Y()) {
                        throw new C6765bq("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c6754aj.m6052Z()) {
                        throw new C6765bq("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (c6754aj.m6053a0()) {
                        c6754aj.m6056n();
                        return;
                    }
                    throw new C6765bq("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (c8033pMo6099s.f13623c) {
                    case 1:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6584a = abstractC8039s.mo6076G();
                            c6754aj.m6034H(true);
                            break;
                        }
                    case 2:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6585b = abstractC8039s.mo6076G();
                            c6754aj.m6037K(true);
                            break;
                        }
                    case 3:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6586c = abstractC8039s.mo6076G();
                            c6754aj.m6040N(true);
                            break;
                        }
                    case 4:
                        if (b10 != 8) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6587d = abstractC8039s.mo6073D();
                            c6754aj.m6043Q(true);
                            break;
                        }
                    case 5:
                        if (b10 != 8) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6588e = abstractC8039s.mo6073D();
                            c6754aj.m6045S(true);
                            break;
                        }
                    case 6:
                        if (b10 != 8) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6589f = abstractC8039s.mo6073D();
                            c6754aj.m6046T(true);
                            break;
                        }
                    case 7:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6590g = abstractC8039s.mo6083a();
                            c6754aj.m6047U(true);
                            break;
                        }
                    case 8:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6591h = abstractC8039s.mo6076G();
                            c6754aj.m6048V(true);
                            break;
                        }
                    case 9:
                        if (b10 != 11) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6592i = abstractC8039s.mo6076G();
                            c6754aj.m6049W(true);
                            break;
                        }
                    case 10:
                        if (b10 != 8) {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                            break;
                        } else {
                            c6754aj.f6593j = abstractC8039s.mo6073D();
                            c6754aj.m6050X(true);
                            break;
                        }
                    default:
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                        break;
                }
                abstractC8039s.mo6100t();
            }
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6754aj c6754aj) throws C6765bq {
            c6754aj.m6056n();
            abstractC8039s.mo6089i(C6754aj.f6571m);
            if (c6754aj.f6584a != null) {
                abstractC8039s.mo6086f(C6754aj.f6572n);
                abstractC8039s.mo6090j(c6754aj.f6584a);
                abstractC8039s.mo6093m();
            }
            if (c6754aj.f6585b != null) {
                abstractC8039s.mo6086f(C6754aj.f6573o);
                abstractC8039s.mo6090j(c6754aj.f6585b);
                abstractC8039s.mo6093m();
            }
            if (c6754aj.f6586c != null) {
                abstractC8039s.mo6086f(C6754aj.f6574p);
                abstractC8039s.mo6090j(c6754aj.f6586c);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6086f(C6754aj.f6575q);
            abstractC8039s.mo6084d(c6754aj.f6587d);
            abstractC8039s.mo6093m();
            abstractC8039s.mo6086f(C6754aj.f6576r);
            abstractC8039s.mo6084d(c6754aj.f6588e);
            abstractC8039s.mo6093m();
            abstractC8039s.mo6086f(C6754aj.f6577s);
            abstractC8039s.mo6084d(c6754aj.f6589f);
            abstractC8039s.mo6093m();
            if (c6754aj.f6590g != null) {
                abstractC8039s.mo6086f(C6754aj.f6578t);
                abstractC8039s.mo6091k(c6754aj.f6590g);
                abstractC8039s.mo6093m();
            }
            if (c6754aj.f6591h != null) {
                abstractC8039s.mo6086f(C6754aj.f6579u);
                abstractC8039s.mo6090j(c6754aj.f6591h);
                abstractC8039s.mo6093m();
            }
            if (c6754aj.f6592i != null) {
                abstractC8039s.mo6086f(C6754aj.f6580v);
                abstractC8039s.mo6090j(c6754aj.f6592i);
                abstractC8039s.mo6093m();
            }
            if (c6754aj.m6054g()) {
                abstractC8039s.mo6086f(C6754aj.f6581w);
                abstractC8039s.mo6084d(c6754aj.f6593j);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$c */
    public static class c implements InterfaceC8045w {
        public c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b mo6063b() {
            return new b();
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$d */
    public static class d extends AbstractC8048z {
        public d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, C6754aj c6754aj) {
            AbstractC9343a.m15285a(abstractC8039s);
            String str = c6754aj.f6584a;
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, C6754aj c6754aj) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$e */
    public enum e {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* renamed from: m */
        public static final Map f6606m = new HashMap();

        /* renamed from: a */
        public final short f6608a;

        /* renamed from: b */
        public final String f6609b;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f6606m.put(eVar.m6066a(), eVar);
            }
        }

        e(short s9, String str) {
            this.f6608a = s9;
            this.f6609b = str;
        }

        /* renamed from: a */
        public String m6066a() {
            return this.f6609b;
        }
    }

    /* renamed from: com.umeng.analytics.pro.aj$f */
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
        f6582x = map;
        map.put(AbstractC8046x.class, new c());
        map.put(AbstractC8048z.class, new f());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new C6758bc("version", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new C6758bc("address", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new C6758bc("signature", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new C6758bc("serial_num", (byte) 1, new C6759bd((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new C6758bc("ts_secs", (byte) 1, new C6759bd((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new C6758bc("length", (byte) 1, new C6759bd((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new C6758bc("entity", (byte) 1, new C6759bd((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new C6758bc("guid", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new C6758bc("checksum", (byte) 1, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new C6758bc("codex", (byte) 2, new C6759bd((byte) 8)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6583y = mapUnmodifiableMap;
        C6758bc.m6069a(C6754aj.class, mapUnmodifiableMap);
    }

    /* renamed from: D */
    public C6754aj m6030D(int i9) {
        this.f6587d = i9;
        m6043Q(true);
        return this;
    }

    /* renamed from: E */
    public C6754aj m6031E(String str) {
        this.f6584a = str;
        return this;
    }

    /* renamed from: F */
    public C6754aj m6032F(ByteBuffer byteBuffer) {
        this.f6590g = byteBuffer;
        return this;
    }

    /* renamed from: G */
    public C6754aj m6033G(byte[] bArr) {
        m6032F(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: H */
    public void m6034H(boolean z9) {
        if (z9) {
            return;
        }
        this.f6584a = null;
    }

    /* renamed from: I */
    public C6754aj m6035I(int i9) {
        this.f6588e = i9;
        m6045S(true);
        return this;
    }

    /* renamed from: J */
    public C6754aj m6036J(String str) {
        this.f6585b = str;
        return this;
    }

    /* renamed from: K */
    public void m6037K(boolean z9) {
        if (z9) {
            return;
        }
        this.f6585b = null;
    }

    /* renamed from: L */
    public C6754aj m6038L(int i9) {
        this.f6589f = i9;
        m6046T(true);
        return this;
    }

    /* renamed from: M */
    public C6754aj m6039M(String str) {
        this.f6586c = str;
        return this;
    }

    /* renamed from: N */
    public void m6040N(boolean z9) {
        if (z9) {
            return;
        }
        this.f6586c = null;
    }

    /* renamed from: O */
    public C6754aj m6041O(int i9) {
        this.f6593j = i9;
        m6050X(true);
        return this;
    }

    /* renamed from: P */
    public C6754aj m6042P(String str) {
        this.f6591h = str;
        return this;
    }

    /* renamed from: Q */
    public void m6043Q(boolean z9) {
        this.f6594k = AbstractC8025l.m12675a(this.f6594k, 0, z9);
    }

    /* renamed from: R */
    public C6754aj m6044R(String str) {
        this.f6592i = str;
        return this;
    }

    /* renamed from: S */
    public void m6045S(boolean z9) {
        this.f6594k = AbstractC8025l.m12675a(this.f6594k, 1, z9);
    }

    /* renamed from: T */
    public void m6046T(boolean z9) {
        this.f6594k = AbstractC8025l.m12675a(this.f6594k, 2, z9);
    }

    /* renamed from: U */
    public void m6047U(boolean z9) {
        if (z9) {
            return;
        }
        this.f6590g = null;
    }

    /* renamed from: V */
    public void m6048V(boolean z9) {
        if (z9) {
            return;
        }
        this.f6591h = null;
    }

    /* renamed from: W */
    public void m6049W(boolean z9) {
        if (z9) {
            return;
        }
        this.f6592i = null;
    }

    /* renamed from: X */
    public void m6050X(boolean z9) {
        this.f6594k = AbstractC8025l.m12675a(this.f6594k, 3, z9);
    }

    /* renamed from: Y */
    public boolean m6051Y() {
        return AbstractC8025l.m12677c(this.f6594k, 0);
    }

    /* renamed from: Z */
    public boolean m6052Z() {
        return AbstractC8025l.m12677c(this.f6594k, 1);
    }

    /* renamed from: a0 */
    public boolean m6053a0() {
        return AbstractC8025l.m12677c(this.f6594k, 2);
    }

    /* renamed from: g */
    public boolean m6054g() {
        return AbstractC8025l.m12677c(this.f6594k, 3);
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6582x.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    /* renamed from: n */
    public void m6056n() throws C6765bq {
        if (this.f6584a == null) {
            throw new C6765bq("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f6585b == null) {
            throw new C6765bq("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f6586c == null) {
            throw new C6765bq("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f6590g == null) {
            throw new C6765bq("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f6591h == null) {
            throw new C6765bq("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f6592i != null) {
            return;
        }
        throw new C6765bq("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6582x.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f6584a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f6585b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f6586c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f6587d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f6588e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f6589f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f6590g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            AbstractC8029n.m12697i(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f6591h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f6592i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m6054g()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f6593j);
        }
        sb.append(")");
        return sb.toString();
    }
}
