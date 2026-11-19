package p070b.p074b.p105b.p111c0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.b.b.c0.c */
/* loaded from: classes.dex */
public class C0761c implements Closeable, Flushable {

    /* renamed from: i */
    public static final String[] f4423i = new String[128];

    /* renamed from: j */
    public static final String[] f4424j;

    /* renamed from: b */
    public final Writer f4425b;

    /* renamed from: c */
    public int[] f4426c = new int[32];

    /* renamed from: d */
    public int f4427d = 0;

    /* renamed from: e */
    public String f4428e;

    /* renamed from: f */
    public boolean f4429f;

    /* renamed from: g */
    public String f4430g;

    /* renamed from: h */
    public boolean f4431h;

    static {
        for (int i = 0; i <= 31; i++) {
            f4423i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f4423i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4424j = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0761c(Writer writer) {
        m2445j(6);
        this.f4428e = ":";
        this.f4431h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4425b = writer;
    }

    /* renamed from: a */
    public final void m2442a() throws IOException {
        int iM2444i = m2444i();
        int i = 2;
        if (iM2444i != 1) {
            if (iM2444i == 2) {
                this.f4425b.append(',');
                return;
            }
            if (iM2444i == 4) {
                this.f4425b.append((CharSequence) this.f4428e);
                m2446k(5);
                return;
            }
            i = 7;
            if (iM2444i != 6) {
                if (iM2444i != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f4429f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        m2446k(i);
    }

    /* renamed from: b */
    public C0761c mo2404b() throws IOException {
        m2448r();
        m2442a();
        m2445j(1);
        this.f4425b.write(91);
        return this;
    }

    /* renamed from: c */
    public C0761c mo2405c() throws IOException {
        m2448r();
        m2442a();
        m2445j(3);
        this.f4425b.write(123);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4425b.close();
        int i = this.f4427d;
        if (i > 1 || (i == 1 && this.f4426c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4427d = 0;
    }

    /* renamed from: d */
    public final C0761c m2443d(int i, int i2, char c2) throws IOException {
        int iM2444i = m2444i();
        if (iM2444i != i2 && iM2444i != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4430g == null) {
            this.f4427d--;
            this.f4425b.write(c2);
            return this;
        }
        StringBuilder sbM2079g = C0561a.m2079g("Dangling name: ");
        sbM2079g.append(this.f4430g);
        throw new IllegalStateException(sbM2079g.toString());
    }

    /* renamed from: e */
    public C0761c mo2406e() throws IOException {
        m2443d(1, 2, ']');
        return this;
    }

    /* renamed from: f */
    public C0761c mo2407f() throws IOException {
        m2443d(3, 5, '}');
        return this;
    }

    public void flush() throws IOException {
        if (this.f4427d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4425b.flush();
    }

    /* renamed from: g */
    public C0761c mo2408g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4430g != null) {
            throw new IllegalStateException();
        }
        if (this.f4427d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4430g = str;
        return this;
    }

    /* renamed from: h */
    public C0761c mo2409h() throws IOException {
        if (this.f4430g != null) {
            if (!this.f4431h) {
                this.f4430g = null;
                return this;
            }
            m2448r();
        }
        m2442a();
        this.f4425b.write("null");
        return this;
    }

    /* renamed from: i */
    public final int m2444i() {
        int i = this.f4427d;
        if (i != 0) {
            return this.f4426c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: j */
    public final void m2445j(int i) {
        int i2 = this.f4427d;
        int[] iArr = this.f4426c;
        if (i2 == iArr.length) {
            this.f4426c = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f4426c;
        int i3 = this.f4427d;
        this.f4427d = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: k */
    public final void m2446k(int i) {
        this.f4426c[this.f4427d - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2447l(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String[] r0 = p070b.p074b.p105b.p111c0.C0761c.f4423i
            java.io.Writer r1 = r8.f4425b
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r1) goto L3e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L3b
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L34
            java.io.Writer r6 = r8.f4425b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.f4425b
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.f4425b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r9 = r8.f4425b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p111c0.C0761c.m2447l(java.lang.String):void");
    }

    /* renamed from: m */
    public C0761c mo2410m(long j) throws IOException {
        m2448r();
        m2442a();
        this.f4425b.write(Long.toString(j));
        return this;
    }

    /* renamed from: n */
    public C0761c mo2411n(Boolean bool) throws IOException {
        if (bool == null) {
            return mo2409h();
        }
        m2448r();
        m2442a();
        this.f4425b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: o */
    public C0761c mo2412o(Number number) throws IOException {
        if (number == null) {
            return mo2409h();
        }
        m2448r();
        String string = number.toString();
        if (this.f4429f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            m2442a();
            this.f4425b.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: p */
    public C0761c mo2413p(String str) throws IOException {
        if (str == null) {
            return mo2409h();
        }
        m2448r();
        m2442a();
        m2447l(str);
        return this;
    }

    /* renamed from: q */
    public C0761c mo2414q(boolean z) throws IOException {
        m2448r();
        m2442a();
        this.f4425b.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: r */
    public final void m2448r() throws IOException {
        if (this.f4430g != null) {
            int iM2444i = m2444i();
            if (iM2444i == 5) {
                this.f4425b.write(44);
            } else if (iM2444i != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m2446k(4);
            m2447l(this.f4430g);
            this.f4430g = null;
        }
    }
}
