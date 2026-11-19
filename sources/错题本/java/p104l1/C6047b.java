package p104l1;

import com.google.gson.C3836b;
import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: l1.b */
/* loaded from: classes2.dex */
public class C6047b implements Closeable, Flushable {

    /* renamed from: l */
    public static final Pattern f9625l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m */
    public static final String[] f9626m = new String[128];

    /* renamed from: n */
    public static final String[] f9627n;

    /* renamed from: a */
    public final Writer f9628a;

    /* renamed from: b */
    public int[] f9629b;

    /* renamed from: c */
    public int f9630c;

    /* renamed from: d */
    public C3836b f9631d;

    /* renamed from: e */
    public String f9632e;

    /* renamed from: f */
    public String f9633f;

    /* renamed from: g */
    public boolean f9634g;

    /* renamed from: h */
    public Strictness f9635h;

    /* renamed from: i */
    public boolean f9636i;

    /* renamed from: j */
    public String f9637j;

    /* renamed from: k */
    public boolean f9638k;

    static {
        for (int i = 0; i <= 31; i++) {
            f9626m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f9626m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f9627n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C6047b(Writer writer) {
        int[] iArr = new int[32];
        this.f9629b = iArr;
        this.f9630c = 0;
        if (iArr.length == 0) {
            this.f9629b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f9629b;
        int i = this.f9630c;
        this.f9630c = i + 1;
        iArr2[i] = 6;
        this.f9635h = Strictness.LEGACY_STRICT;
        this.f9638k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f9628a = writer;
        m5777m(C3836b.f2972d);
    }

    /* renamed from: a */
    public final void m5767a() throws IOException {
        int iM5776l = m5776l();
        if (iM5776l == 1) {
            this.f9629b[this.f9630c - 1] = 2;
            m5774h();
            return;
        }
        Writer writer = this.f9628a;
        if (iM5776l == 2) {
            writer.append((CharSequence) this.f9633f);
            m5774h();
        } else {
            if (iM5776l == 4) {
                writer.append((CharSequence) this.f9632e);
                this.f9629b[this.f9630c - 1] = 5;
                return;
            }
            if (iM5776l != 6) {
                if (iM5776l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f9635h != Strictness.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f9629b[this.f9630c - 1] = 7;
        }
    }

    /* renamed from: b */
    public void m5768b() throws IOException {
        m5785u();
        m5767a();
        int i = this.f9630c;
        int[] iArr = this.f9629b;
        if (i == iArr.length) {
            this.f9629b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f9629b;
        int i8 = this.f9630c;
        this.f9630c = i8 + 1;
        iArr2[i8] = 1;
        this.f9628a.write(91);
    }

    /* renamed from: c */
    public void m5769c() throws IOException {
        m5785u();
        m5767a();
        int i = this.f9630c;
        int[] iArr = this.f9629b;
        if (i == iArr.length) {
            this.f9629b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f9629b;
        int i8 = this.f9630c;
        this.f9630c = i8 + 1;
        iArr2[i8] = 3;
        this.f9628a.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9628a.close();
        int i = this.f9630c;
        if (i > 1 || (i == 1 && this.f9629b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9630c = 0;
    }

    /* renamed from: d */
    public final void m5770d(int i, int i8, char c) throws IOException {
        int iM5776l = m5776l();
        if (iM5776l != i8 && iM5776l != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f9637j != null) {
            throw new IllegalStateException("Dangling name: " + this.f9637j);
        }
        this.f9630c--;
        if (iM5776l == i8) {
            m5774h();
        }
        this.f9628a.write(c);
    }

    /* renamed from: e */
    public void m5771e() throws IOException {
        m5770d(1, 2, ']');
    }

    /* renamed from: f */
    public void m5772f() throws IOException {
        m5770d(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f9630c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f9628a.flush();
    }

    /* renamed from: g */
    public void m5773g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9637j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM5776l = m5776l();
        if (iM5776l != 3 && iM5776l != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f9637j = str;
    }

    /* renamed from: h */
    public final void m5774h() throws IOException {
        if (this.f9634g) {
            return;
        }
        String str = this.f9631d.f2974a;
        Writer writer = this.f9628a;
        writer.write(str);
        int i = this.f9630c;
        for (int i8 = 1; i8 < i; i8++) {
            writer.write(this.f9631d.f2975b);
        }
    }

    /* renamed from: k */
    public C6047b m5775k() throws IOException {
        if (this.f9637j != null) {
            if (!this.f9638k) {
                this.f9637j = null;
                return this;
            }
            m5785u();
        }
        m5767a();
        this.f9628a.write("null");
        return this;
    }

    /* renamed from: l */
    public final int m5776l() {
        int i = this.f9630c;
        if (i != 0) {
            return this.f9629b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    public final void m5777m(C3836b c3836b) {
        Objects.requireNonNull(c3836b);
        this.f9631d = c3836b;
        this.f9633f = ",";
        if (c3836b.f2976c) {
            this.f9632e = ": ";
            if (c3836b.f2974a.isEmpty()) {
                this.f9633f = ", ";
            }
        } else {
            this.f9632e = ":";
        }
        this.f9634g = this.f9631d.f2974a.isEmpty() && this.f9631d.f2975b.isEmpty();
    }

    /* renamed from: n */
    public final void m5778n(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f9635h = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5779o(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f9636i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p104l1.C6047b.f9627n
            goto L9
        L7:
            java.lang.String[] r0 = p104l1.C6047b.f9626m
        L9:
            java.io.Writer r1 = r8.f9628a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6047b.m5779o(java.lang.String):void");
    }

    /* renamed from: p */
    public void m5780p(double d9) throws IOException {
        m5785u();
        if (this.f9635h == Strictness.LENIENT || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
            m5767a();
            this.f9628a.append((CharSequence) Double.toString(d9));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d9);
        }
    }

    /* renamed from: q */
    public void m5781q(long j7) throws IOException {
        m5785u();
        m5767a();
        this.f9628a.write(Long.toString(j7));
    }

    /* renamed from: r */
    public void m5782r(Number number) throws IOException {
        if (number == null) {
            m5775k();
            return;
        }
        m5785u();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f9635h != Strictness.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f9625l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m5767a();
        this.f9628a.append((CharSequence) string);
    }

    /* renamed from: s */
    public void m5783s(String str) throws IOException {
        if (str == null) {
            m5775k();
            return;
        }
        m5785u();
        m5767a();
        m5779o(str);
    }

    /* renamed from: t */
    public void m5784t(boolean z8) throws IOException {
        m5785u();
        m5767a();
        this.f9628a.write(z8 ? "true" : "false");
    }

    /* renamed from: u */
    public final void m5785u() throws IOException {
        if (this.f9637j != null) {
            int iM5776l = m5776l();
            if (iM5776l == 5) {
                this.f9628a.write(this.f9633f);
            } else if (iM5776l != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m5774h();
            this.f9629b[this.f9630c - 1] = 4;
            m5779o(this.f9637j);
            this.f9637j = null;
        }
    }
}
