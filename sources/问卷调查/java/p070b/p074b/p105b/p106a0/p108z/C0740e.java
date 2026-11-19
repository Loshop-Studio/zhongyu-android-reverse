package p070b.p074b.p105b.p106a0.p108z;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.C0770k;
import p070b.p074b.p105b.C0775p;
import p070b.p074b.p105b.C0776q;
import p070b.p074b.p105b.C0778s;
import p070b.p074b.p105b.p106a0.C0729s;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.e */
/* loaded from: classes.dex */
public final class C0740e extends C0759a {

    /* renamed from: v */
    public static final Object f4271v;

    /* renamed from: r */
    public Object[] f4272r;

    /* renamed from: s */
    public int f4273s;

    /* renamed from: t */
    public String[] f4274t;

    /* renamed from: u */
    public int[] f4275u;

    /* renamed from: b.b.b.a0.z.e$a */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f4271v = new Object();
    }

    /* renamed from: k */
    private String m2384k() {
        StringBuilder sbM2079g = C0561a.m2079g(" at path ");
        sbM2079g.append(mo2394h());
        return sbM2079g.toString();
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: A */
    public void mo2385A() {
        if (mo2403v() == EnumC0760b.NAME) {
            mo2400p();
            this.f4274t[this.f4273s - 2] = "null";
        } else {
            m2388E();
            int i = this.f4273s;
            if (i > 0) {
                this.f4274t[i - 1] = "null";
            }
        }
        int i2 = this.f4273s;
        if (i2 > 0) {
            int[] iArr = this.f4275u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: C */
    public final void m2386C(EnumC0760b enumC0760b) {
        if (mo2403v() == enumC0760b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC0760b + " but was " + mo2403v() + m2384k());
    }

    /* renamed from: D */
    public final Object m2387D() {
        return this.f4272r[this.f4273s - 1];
    }

    /* renamed from: E */
    public final Object m2388E() {
        Object[] objArr = this.f4272r;
        int i = this.f4273s - 1;
        this.f4273s = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: F */
    public final void m2389F(Object obj) {
        int i = this.f4273s;
        Object[] objArr = this.f4272r;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f4272r = Arrays.copyOf(objArr, i2);
            this.f4275u = Arrays.copyOf(this.f4275u, i2);
            this.f4274t = (String[]) Arrays.copyOf(this.f4274t, i2);
        }
        Object[] objArr2 = this.f4272r;
        int i3 = this.f4273s;
        this.f4273s = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: a */
    public void mo2390a() {
        m2386C(EnumC0760b.BEGIN_ARRAY);
        m2389F(((C0770k) m2387D()).iterator());
        this.f4275u[this.f4273s - 1] = 0;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: b */
    public void mo2391b() {
        m2386C(EnumC0760b.BEGIN_OBJECT);
        m2389F(new C0729s.b.a((C0729s.b) ((C0776q) m2387D()).f4443a.entrySet()));
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4272r = new Object[]{f4271v};
        this.f4273s = 1;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: e */
    public void mo2392e() {
        m2386C(EnumC0760b.END_ARRAY);
        m2388E();
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: f */
    public void mo2393f() {
        m2386C(EnumC0760b.END_OBJECT);
        m2388E();
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: h */
    public String mo2394h() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f4273s) {
            Object[] objArr = this.f4272r;
            if (objArr[i] instanceof C0770k) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f4275u[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C0776q) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f4274t;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: i */
    public boolean mo2395i() {
        EnumC0760b enumC0760bMo2403v = mo2403v();
        return (enumC0760bMo2403v == EnumC0760b.END_OBJECT || enumC0760bMo2403v == EnumC0760b.END_ARRAY) ? false : true;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: l */
    public boolean mo2396l() {
        m2386C(EnumC0760b.BOOLEAN);
        boolean zM2457b = ((C0778s) m2388E()).m2457b();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zM2457b;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: m */
    public double mo2397m() {
        EnumC0760b enumC0760bMo2403v = mo2403v();
        EnumC0760b enumC0760b = EnumC0760b.NUMBER;
        if (enumC0760bMo2403v != enumC0760b && enumC0760bMo2403v != EnumC0760b.STRING) {
            throw new IllegalStateException("Expected " + enumC0760b + " but was " + enumC0760bMo2403v + m2384k());
        }
        C0778s c0778s = (C0778s) m2387D();
        double dDoubleValue = c0778s.f4444a instanceof Number ? c0778s.m2458c().doubleValue() : Double.parseDouble(c0778s.m2459d());
        if (!this.f4398c && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: n */
    public int mo2398n() {
        EnumC0760b enumC0760bMo2403v = mo2403v();
        EnumC0760b enumC0760b = EnumC0760b.NUMBER;
        if (enumC0760bMo2403v != enumC0760b && enumC0760bMo2403v != EnumC0760b.STRING) {
            throw new IllegalStateException("Expected " + enumC0760b + " but was " + enumC0760bMo2403v + m2384k());
        }
        C0778s c0778s = (C0778s) m2387D();
        int iIntValue = c0778s.f4444a instanceof Number ? c0778s.m2458c().intValue() : Integer.parseInt(c0778s.m2459d());
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: o */
    public long mo2399o() {
        EnumC0760b enumC0760bMo2403v = mo2403v();
        EnumC0760b enumC0760b = EnumC0760b.NUMBER;
        if (enumC0760bMo2403v != enumC0760b && enumC0760bMo2403v != EnumC0760b.STRING) {
            throw new IllegalStateException("Expected " + enumC0760b + " but was " + enumC0760bMo2403v + m2384k());
        }
        C0778s c0778s = (C0778s) m2387D();
        long jLongValue = c0778s.f4444a instanceof Number ? c0778s.m2458c().longValue() : Long.parseLong(c0778s.m2459d());
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: p */
    public String mo2400p() {
        m2386C(EnumC0760b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m2387D()).next();
        String str = (String) entry.getKey();
        this.f4274t[this.f4273s - 1] = str;
        m2389F(entry.getValue());
        return str;
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: r */
    public void mo2401r() {
        m2386C(EnumC0760b.NULL);
        m2388E();
        int i = this.f4273s;
        if (i > 0) {
            int[] iArr = this.f4275u;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: t */
    public String mo2402t() {
        EnumC0760b enumC0760bMo2403v = mo2403v();
        EnumC0760b enumC0760b = EnumC0760b.STRING;
        if (enumC0760bMo2403v == enumC0760b || enumC0760bMo2403v == EnumC0760b.NUMBER) {
            String strM2459d = ((C0778s) m2388E()).m2459d();
            int i = this.f4273s;
            if (i > 0) {
                int[] iArr = this.f4275u;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strM2459d;
        }
        throw new IllegalStateException("Expected " + enumC0760b + " but was " + enumC0760bMo2403v + m2384k());
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    public String toString() {
        return C0740e.class.getSimpleName();
    }

    @Override // p070b.p074b.p105b.p111c0.C0759a
    /* renamed from: v */
    public EnumC0760b mo2403v() {
        if (this.f4273s == 0) {
            return EnumC0760b.END_DOCUMENT;
        }
        Object objM2387D = m2387D();
        if (objM2387D instanceof Iterator) {
            boolean z = this.f4272r[this.f4273s - 2] instanceof C0776q;
            Iterator it = (Iterator) objM2387D;
            if (!it.hasNext()) {
                return z ? EnumC0760b.END_OBJECT : EnumC0760b.END_ARRAY;
            }
            if (z) {
                return EnumC0760b.NAME;
            }
            m2389F(it.next());
            return mo2403v();
        }
        if (objM2387D instanceof C0776q) {
            return EnumC0760b.BEGIN_OBJECT;
        }
        if (objM2387D instanceof C0770k) {
            return EnumC0760b.BEGIN_ARRAY;
        }
        if (!(objM2387D instanceof C0778s)) {
            if (objM2387D instanceof C0775p) {
                return EnumC0760b.NULL;
            }
            if (objM2387D == f4271v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((C0778s) objM2387D).f4444a;
        if (obj instanceof String) {
            return EnumC0760b.STRING;
        }
        if (obj instanceof Boolean) {
            return EnumC0760b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return EnumC0760b.NUMBER;
        }
        throw new AssertionError();
    }
}
