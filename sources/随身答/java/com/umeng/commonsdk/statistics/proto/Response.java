package com.umeng.commonsdk.statistics.proto;

import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.AbstractC6767c;
import com.umeng.analytics.pro.C6756aw;
import com.umeng.analytics.pro.C6758bc;
import com.umeng.analytics.pro.C6759bd;
import com.umeng.analytics.pro.C6762bh;
import com.umeng.analytics.pro.C6764bj;
import com.umeng.analytics.pro.C6765bq;
import com.umeng.analytics.pro.InterfaceC6755aq;
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
import p114g2.AbstractC8025l;
import p114g2.AbstractC8039s;
import p114g2.AbstractC8046x;
import p114g2.AbstractC8048z;
import p114g2.C8004a0;
import p114g2.C8033p;
import p114g2.C8043u;
import p114g2.InterfaceC8045w;
import p217q.AbstractC9343a;

/* loaded from: classes4.dex */
public class Response implements InterfaceC6755aq<Response, EnumC6788e>, Serializable, Cloneable {

    /* renamed from: f */
    public static final C8043u f6867f = new C8043u("Response");

    /* renamed from: g */
    public static final C8033p f6868g = new C8033p("resp_code", (byte) 8, 1);

    /* renamed from: h */
    public static final C8033p f6869h = new C8033p(NotificationCompat.CATEGORY_MESSAGE, (byte) 11, 2);

    /* renamed from: i */
    public static final C8033p f6870i = new C8033p("imprint", (byte) 12, 3);

    /* renamed from: j */
    public static final Map f6871j;

    /* renamed from: k */
    public static final Map f6872k;

    /* renamed from: a */
    public int f6873a;

    /* renamed from: b */
    public String f6874b;

    /* renamed from: c */
    public C6793d f6875c;

    /* renamed from: d */
    public byte f6876d = 0;

    /* renamed from: e */
    public EnumC6788e[] f6877e = {EnumC6788e.MSG, EnumC6788e.IMPRINT};

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    public static class C6785b extends AbstractC8046x {
        public C6785b() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, Response response) throws C6765bq {
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
                        } else if (b10 == 12) {
                            C6793d c6793d = new C6793d();
                            response.f6875c = c6793d;
                            c6793d.mo6057p(abstractC8039s);
                            response.m6311y(true);
                        } else {
                            AbstractC6767c.m6129a(abstractC8039s, b10);
                        }
                    } else if (b10 == 11) {
                        response.f6874b = abstractC8039s.mo6076G();
                        response.m6312z(true);
                    } else {
                        AbstractC6767c.m6129a(abstractC8039s, b10);
                    }
                } else if (b10 == 8) {
                    response.f6873a = abstractC8039s.mo6073D();
                    response.m6305A(true);
                } else {
                    AbstractC6767c.m6129a(abstractC8039s, b10);
                }
                abstractC8039s.mo6100t();
            }
            abstractC8039s.mo6098r();
            if (response.m6310x()) {
                response.m6306B();
                return;
            }
            throw new C6765bq("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, Response response) throws C6765bq {
            response.m6306B();
            abstractC8039s.mo6089i(Response.f6867f);
            abstractC8039s.mo6086f(Response.f6868g);
            abstractC8039s.mo6084d(response.f6873a);
            abstractC8039s.mo6093m();
            if (response.f6874b != null && response.m6309w()) {
                abstractC8039s.mo6086f(Response.f6869h);
                abstractC8039s.mo6090j(response.f6874b);
                abstractC8039s.mo6093m();
            }
            if (response.f6875c != null && response.m6308v()) {
                abstractC8039s.mo6086f(Response.f6870i);
                response.f6875c.mo6055m(abstractC8039s);
                abstractC8039s.mo6093m();
            }
            abstractC8039s.mo6094n();
            abstractC8039s.mo6092l();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    public static class C6786c implements InterfaceC8045w {
        public C6786c() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6785b mo6063b() {
            return new C6785b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    public static class C6787d extends AbstractC8048z {
        public C6787d() {
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo6059b(AbstractC8039s abstractC8039s, Response response) {
            AbstractC9343a.m15285a(abstractC8039s);
            int i9 = response.f6873a;
            throw null;
        }

        @Override // p114g2.InterfaceC8044v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo6058a(AbstractC8039s abstractC8039s, Response response) {
            AbstractC9343a.m15285a(abstractC8039s);
            throw null;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC6788e {
        RESP_CODE(1, "resp_code"),
        MSG(2, NotificationCompat.CATEGORY_MESSAGE),
        IMPRINT(3, "imprint");


        /* renamed from: f */
        public static final Map f6881f = new HashMap();

        /* renamed from: a */
        public final short f6883a;

        /* renamed from: b */
        public final String f6884b;

        static {
            Iterator it = EnumSet.allOf(EnumC6788e.class).iterator();
            while (it.hasNext()) {
                EnumC6788e enumC6788e = (EnumC6788e) it.next();
                f6881f.put(enumC6788e.m6318a(), enumC6788e);
            }
        }

        EnumC6788e(short s9, String str) {
            this.f6883a = s9;
            this.f6884b = str;
        }

        /* renamed from: a */
        public String m6318a() {
            return this.f6884b;
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$f */
    public static class C6789f implements InterfaceC8045w {
        public C6789f() {
        }

        @Override // p114g2.InterfaceC8045w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6787d mo6063b() {
            return new C6787d();
        }
    }

    static {
        HashMap map = new HashMap();
        f6871j = map;
        map.put(AbstractC8046x.class, new C6786c());
        map.put(AbstractC8048z.class, new C6789f());
        EnumMap enumMap = new EnumMap(EnumC6788e.class);
        enumMap.put((EnumMap) EnumC6788e.RESP_CODE, (EnumC6788e) new C6758bc("resp_code", (byte) 1, new C6759bd((byte) 8)));
        enumMap.put((EnumMap) EnumC6788e.MSG, (EnumC6788e) new C6758bc(NotificationCompat.CATEGORY_MESSAGE, (byte) 2, new C6759bd((byte) 11)));
        enumMap.put((EnumMap) EnumC6788e.IMPRINT, (EnumC6788e) new C6758bc("imprint", (byte) 2, new C6762bh((byte) 12, C6793d.class)));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f6872k = mapUnmodifiableMap;
        C6758bc.m6069a(Response.class, mapUnmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f6876d = (byte) 0;
            mo6057p(new C6764bj(new C8004a0(objectInputStream)));
        } catch (C6756aw e10) {
            throw new IOException(e10.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo6055m(new C6764bj(new C8004a0(objectOutputStream)));
        } catch (C6756aw e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: A */
    public void m6305A(boolean z9) {
        this.f6876d = AbstractC8025l.m12675a(this.f6876d, 0, z9);
    }

    /* renamed from: B */
    public void m6306B() throws C6765bq {
        C6793d c6793d = this.f6875c;
        if (c6793d != null) {
            c6793d.m6392B();
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: m */
    public void mo6055m(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6871j.get(abstractC8039s.m12720c())).mo6063b().mo6059b(abstractC8039s, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC6755aq
    /* renamed from: p */
    public void mo6057p(AbstractC8039s abstractC8039s) {
        ((InterfaceC8045w) f6871j.get(abstractC8039s.m12720c())).mo6063b().mo6058a(abstractC8039s, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.f6873a);
        if (m6309w()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.f6874b;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (m6308v()) {
            sb.append(", ");
            sb.append("imprint:");
            C6793d c6793d = this.f6875c;
            if (c6793d == null) {
                sb.append("null");
            } else {
                sb.append(c6793d);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public C6793d m6307u() {
        return this.f6875c;
    }

    /* renamed from: v */
    public boolean m6308v() {
        return this.f6875c != null;
    }

    /* renamed from: w */
    public boolean m6309w() {
        return this.f6874b != null;
    }

    /* renamed from: x */
    public boolean m6310x() {
        return AbstractC8025l.m12677c(this.f6876d, 0);
    }

    /* renamed from: y */
    public void m6311y(boolean z9) {
        if (z9) {
            return;
        }
        this.f6875c = null;
    }

    /* renamed from: z */
    public void m6312z(boolean z9) {
        if (z9) {
            return;
        }
        this.f6874b = null;
    }
}
