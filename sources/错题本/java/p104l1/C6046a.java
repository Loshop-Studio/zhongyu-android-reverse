package p104l1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import io.reactivex.internal.operators.observable.C5711g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: l1.a */
/* loaded from: classes2.dex */
public class C6046a implements Closeable {

    /* renamed from: a */
    public final Reader f9610a;

    /* renamed from: i */
    public long f9618i;

    /* renamed from: j */
    public int f9619j;

    /* renamed from: k */
    public String f9620k;

    /* renamed from: l */
    public int[] f9621l;

    /* renamed from: n */
    public String[] f9623n;

    /* renamed from: o */
    public int[] f9624o;

    /* renamed from: b */
    public Strictness f9611b = Strictness.LEGACY_STRICT;

    /* renamed from: c */
    public final char[] f9612c = new char[1024];

    /* renamed from: d */
    public int f9613d = 0;

    /* renamed from: e */
    public int f9614e = 0;

    /* renamed from: f */
    public int f9615f = 0;

    /* renamed from: g */
    public int f9616g = 0;

    /* renamed from: h */
    public int f9617h = 0;

    /* renamed from: m */
    public int f9622m = 1;

    static {
        C5711g.f9009b = new C5711g(6);
    }

    public C6046a(Reader reader) {
        int[] iArr = new int[32];
        this.f9621l = iArr;
        iArr[0] = 6;
        this.f9623n = new String[32];
        this.f9624o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f9610a = reader;
    }

    /* renamed from: A */
    public final void m5736A(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f9611b = strictness;
    }

    /* renamed from: B */
    public final void m5737B(char c) throws MalformedJsonException {
        do {
            int i = this.f9613d;
            int i8 = this.f9614e;
            while (i < i8) {
                int i9 = i + 1;
                char c9 = this.f9612c[i];
                if (c9 == c) {
                    this.f9613d = i9;
                    return;
                }
                if (c9 == '\\') {
                    this.f9613d = i9;
                    m5766z();
                    i = this.f9613d;
                    i8 = this.f9614e;
                } else {
                    if (c9 == '\n') {
                        this.f9615f++;
                        this.f9616g = i9;
                    }
                    i = i9;
                }
            }
            this.f9613d = i;
        } while (m5749g(1));
        m5741F("Unterminated string");
        throw null;
    }

    /* renamed from: C */
    public final void m5738C() {
        char c;
        do {
            if (this.f9613d >= this.f9614e && !m5749g(1)) {
                return;
            }
            int i = this.f9613d;
            int i8 = i + 1;
            this.f9613d = i8;
            c = this.f9612c[i];
            if (c == '\n') {
                this.f9615f++;
                this.f9616g = i8;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m5745c();
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5739D() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f9613d
            int r2 = r1 + r0
            int r3 = r4.f9614e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f9612c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m5745c()
        L4b:
            int r1 = r4.f9613d
            int r1 = r1 + r0
            r4.f9613d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f9613d = r1
            r0 = 1
            boolean r0 = r4.m5749g(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6046a.m5739D():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: E */
    public final void m5740E() throws IOException {
        int i = 0;
        do {
            int iM5746d = this.f9617h;
            if (iM5746d == 0) {
                iM5746d = m5746d();
            }
            switch (iM5746d) {
                case 1:
                    m5765y(3);
                    i++;
                    this.f9617h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f9623n[this.f9622m - 1] = null;
                    }
                    this.f9622m--;
                    i--;
                    this.f9617h = 0;
                    break;
                case 3:
                    m5765y(1);
                    i++;
                    this.f9617h = 0;
                    break;
                case 4:
                    this.f9622m--;
                    i--;
                    this.f9617h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f9617h = 0;
                    break;
                case 8:
                    m5737B('\'');
                    this.f9617h = 0;
                    break;
                case 9:
                    m5737B('\"');
                    this.f9617h = 0;
                    break;
                case 10:
                    m5739D();
                    this.f9617h = 0;
                    break;
                case 12:
                    m5737B('\'');
                    if (i == 0) {
                        this.f9623n[this.f9622m - 1] = "<skipped>";
                    }
                    this.f9617h = 0;
                    break;
                case 13:
                    m5737B('\"');
                    if (i == 0) {
                        this.f9623n[this.f9622m - 1] = "<skipped>";
                    }
                    this.f9617h = 0;
                    break;
                case 14:
                    m5739D();
                    if (i == 0) {
                        this.f9623n[this.f9622m - 1] = "<skipped>";
                    }
                    this.f9617h = 0;
                    break;
                case 16:
                    this.f9613d += this.f9619j;
                    this.f9617h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f9624o;
        int i8 = this.f9622m - 1;
        iArr[i8] = iArr[i8] + 1;
    }

    /* renamed from: F */
    public final void m5741F(String str) throws MalformedJsonException {
        StringBuilder sbM97v = AbstractC0037f.m97v(str);
        sbM97v.append(m5753m());
        sbM97v.append("\nSee ");
        sbM97v.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbM97v.toString());
    }

    /* renamed from: G */
    public final IllegalStateException m5742G(String str) {
        String str2 = m5764x() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM100y = AbstractC0037f.m100y("Expected ", str, " but was ");
        sbM100y.append(m5764x());
        sbM100y.append(m5753m());
        sbM100y.append("\nSee ");
        sbM100y.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM100y.toString());
    }

    /* renamed from: a */
    public final void m5743a() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d != 3) {
            throw m5742G("BEGIN_ARRAY");
        }
        m5765y(1);
        this.f9624o[this.f9622m - 1] = 0;
        this.f9617h = 0;
    }

    /* renamed from: b */
    public final void m5744b() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d != 1) {
            throw m5742G("BEGIN_OBJECT");
        }
        m5765y(3);
        this.f9617h = 0;
    }

    /* renamed from: c */
    public final void m5745c() throws MalformedJsonException {
        if (this.f9611b == Strictness.LENIENT) {
            return;
        }
        m5741F("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9617h = 0;
        this.f9621l[0] = 8;
        this.f9622m = 1;
        this.f9610a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x021d, code lost:
    
        if (m5752l(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5746d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6046a.m5746d():int");
    }

    /* renamed from: e */
    public final void m5747e() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d != 4) {
            throw m5742G("END_ARRAY");
        }
        int i = this.f9622m;
        this.f9622m = i - 1;
        int[] iArr = this.f9624o;
        int i8 = i - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f9617h = 0;
    }

    /* renamed from: f */
    public final void m5748f() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d != 2) {
            throw m5742G("END_OBJECT");
        }
        int i = this.f9622m;
        int i8 = i - 1;
        this.f9622m = i8;
        this.f9623n[i8] = null;
        int[] iArr = this.f9624o;
        int i9 = i - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f9617h = 0;
    }

    /* renamed from: g */
    public final boolean m5749g(int i) throws IOException {
        int i8;
        int i9;
        int i10 = this.f9616g;
        int i11 = this.f9613d;
        this.f9616g = i10 - i11;
        int i12 = this.f9614e;
        char[] cArr = this.f9612c;
        if (i12 != i11) {
            int i13 = i12 - i11;
            this.f9614e = i13;
            System.arraycopy(cArr, i11, cArr, 0, i13);
        } else {
            this.f9614e = 0;
        }
        this.f9613d = 0;
        do {
            int i14 = this.f9614e;
            int i15 = this.f9610a.read(cArr, i14, cArr.length - i14);
            if (i15 == -1) {
                return false;
            }
            i8 = this.f9614e + i15;
            this.f9614e = i8;
            if (this.f9615f == 0 && (i9 = this.f9616g) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f9613d++;
                this.f9616g = i9 + 1;
                i++;
            }
        } while (i8 < i);
        return true;
    }

    /* renamed from: h */
    public final String m5750h(boolean z8) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i8 = this.f9622m;
            if (i >= i8) {
                return sb.toString();
            }
            int i9 = this.f9621l[i];
            switch (i9) {
                case 1:
                case 2:
                    int i10 = this.f9624o[i];
                    if (z8 && i10 > 0 && i == i8 - 1) {
                        i10--;
                    }
                    sb.append('[');
                    sb.append(i10);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f9623n[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC0037f.m81f(i9, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* renamed from: k */
    public final boolean m5751k() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        return (iM5746d == 2 || iM5746d == 4 || iM5746d == 17) ? false : true;
    }

    /* renamed from: l */
    public final boolean m5752l(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m5745c();
        return false;
    }

    /* renamed from: m */
    public final String m5753m() {
        StringBuilder sbM99x = AbstractC0037f.m99x(" at line ", " column ", this.f9615f + 1, " path ", (this.f9613d - this.f9616g) + 1);
        sbM99x.append(m5750h(false));
        return sbM99x.toString();
    }

    /* renamed from: n */
    public final boolean m5754n() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 5) {
            this.f9617h = 0;
            int[] iArr = this.f9624o;
            int i = this.f9622m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM5746d != 6) {
            throw m5742G("a boolean");
        }
        this.f9617h = 0;
        int[] iArr2 = this.f9624o;
        int i8 = this.f9622m - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return false;
    }

    /* renamed from: o */
    public final double m5755o() throws IOException, NumberFormatException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 15) {
            this.f9617h = 0;
            int[] iArr = this.f9624o;
            int i = this.f9622m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f9618i;
        }
        if (iM5746d == 16) {
            this.f9620k = new String(this.f9612c, this.f9613d, this.f9619j);
            this.f9613d += this.f9619j;
        } else if (iM5746d == 8 || iM5746d == 9) {
            this.f9620k = m5761u(iM5746d == 8 ? '\'' : '\"');
        } else if (iM5746d == 10) {
            this.f9620k = m5763w();
        } else if (iM5746d != 11) {
            throw m5742G("a double");
        }
        this.f9617h = 11;
        double d9 = Double.parseDouble(this.f9620k);
        if (this.f9611b != Strictness.LENIENT && (Double.isNaN(d9) || Double.isInfinite(d9))) {
            m5741F("JSON forbids NaN and infinities: " + d9);
            throw null;
        }
        this.f9620k = null;
        this.f9617h = 0;
        int[] iArr2 = this.f9624o;
        int i8 = this.f9622m - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return d9;
    }

    /* renamed from: p */
    public final int m5756p() throws IOException, NumberFormatException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 15) {
            long j7 = this.f9618i;
            int i = (int) j7;
            if (j7 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f9618i + m5753m());
            }
            this.f9617h = 0;
            int[] iArr = this.f9624o;
            int i8 = this.f9622m - 1;
            iArr[i8] = iArr[i8] + 1;
            return i;
        }
        if (iM5746d == 16) {
            this.f9620k = new String(this.f9612c, this.f9613d, this.f9619j);
            this.f9613d += this.f9619j;
        } else {
            if (iM5746d != 8 && iM5746d != 9 && iM5746d != 10) {
                throw m5742G("an int");
            }
            if (iM5746d == 10) {
                this.f9620k = m5763w();
            } else {
                this.f9620k = m5761u(iM5746d == 8 ? '\'' : '\"');
            }
            try {
                int i9 = Integer.parseInt(this.f9620k);
                this.f9617h = 0;
                int[] iArr2 = this.f9624o;
                int i10 = this.f9622m - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9617h = 11;
        double d9 = Double.parseDouble(this.f9620k);
        int i11 = (int) d9;
        if (i11 != d9) {
            throw new NumberFormatException("Expected an int but was " + this.f9620k + m5753m());
        }
        this.f9620k = null;
        this.f9617h = 0;
        int[] iArr3 = this.f9624o;
        int i12 = this.f9622m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return i11;
    }

    /* renamed from: q */
    public final long m5757q() throws IOException, NumberFormatException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 15) {
            this.f9617h = 0;
            int[] iArr = this.f9624o;
            int i = this.f9622m - 1;
            iArr[i] = iArr[i] + 1;
            return this.f9618i;
        }
        if (iM5746d == 16) {
            this.f9620k = new String(this.f9612c, this.f9613d, this.f9619j);
            this.f9613d += this.f9619j;
        } else {
            if (iM5746d != 8 && iM5746d != 9 && iM5746d != 10) {
                throw m5742G("a long");
            }
            if (iM5746d == 10) {
                this.f9620k = m5763w();
            } else {
                this.f9620k = m5761u(iM5746d == 8 ? '\'' : '\"');
            }
            try {
                long j7 = Long.parseLong(this.f9620k);
                this.f9617h = 0;
                int[] iArr2 = this.f9624o;
                int i8 = this.f9622m - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9617h = 11;
        double d9 = Double.parseDouble(this.f9620k);
        long j8 = (long) d9;
        if (j8 != d9) {
            throw new NumberFormatException("Expected a long but was " + this.f9620k + m5753m());
        }
        this.f9620k = null;
        this.f9617h = 0;
        int[] iArr3 = this.f9624o;
        int i9 = this.f9622m - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j8;
    }

    /* renamed from: r */
    public final String m5758r() throws IOException {
        String strM5761u;
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 14) {
            strM5761u = m5763w();
        } else if (iM5746d == 12) {
            strM5761u = m5761u('\'');
        } else {
            if (iM5746d != 13) {
                throw m5742G("a name");
            }
            strM5761u = m5761u('\"');
        }
        this.f9617h = 0;
        this.f9623n[this.f9622m - 1] = strM5761u;
        return strM5761u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5759s(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6046a.m5759s(boolean):int");
    }

    /* renamed from: t */
    public final void m5760t() {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d != 7) {
            throw m5742G("null");
        }
        this.f9617h = 0;
        int[] iArr = this.f9624o;
        int i = this.f9622m - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String toString() {
        return C6046a.class.getSimpleName() + m5753m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.f9613d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f9613d = r2;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5761u(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f9613d
            int r3 = r11.f9614e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f9612c
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            com.google.gson.Strictness r9 = r11.f9611b
            com.google.gson.Strictness r10 = com.google.gson.Strictness.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.m5741F(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f9613d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f9613d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.m5766z()
            r1.append(r2)
            int r2 = r11.f9613d
            int r3 = r11.f9614e
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f9615f
            int r2 = r2 + r6
            r11.f9615f = r2
            r11.f9616g = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f9613d = r2
            boolean r2 = r11.m5749g(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.m5741F(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6046a.m5761u(char):java.lang.String");
    }

    /* renamed from: v */
    public final String m5762v() throws IOException {
        String str;
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        if (iM5746d == 10) {
            str = m5763w();
        } else if (iM5746d == 8) {
            str = m5761u('\'');
        } else if (iM5746d == 9) {
            str = m5761u('\"');
        } else if (iM5746d == 11) {
            str = this.f9620k;
            this.f9620k = null;
        } else if (iM5746d == 15) {
            str = Long.toString(this.f9618i);
        } else {
            if (iM5746d != 16) {
                throw m5742G("a string");
            }
            str = new String(this.f9612c, this.f9613d, this.f9619j);
            this.f9613d += this.f9619j;
        }
        this.f9617h = 0;
        int[] iArr = this.f9624o;
        int i = this.f9622m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m5745c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5763w() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f9613d
            int r4 = r3 + r2
            int r5 = r7.f9614e
            char[] r6 = r7.f9612c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m5745c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m5749g(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f9613d
            r0.append(r6, r3, r2)
            int r3 = r7.f9613d
            int r3 = r3 + r2
            r7.f9613d = r3
            r2 = 1
            boolean r2 = r7.m5749g(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f9613d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f9613d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f9613d
            int r2 = r2 + r1
            r7.f9613d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p104l1.C6046a.m5763w():java.lang.String");
    }

    /* renamed from: x */
    public final JsonToken m5764x() throws IOException {
        int iM5746d = this.f9617h;
        if (iM5746d == 0) {
            iM5746d = m5746d();
        }
        switch (iM5746d) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: y */
    public final void m5765y(int i) throws MalformedJsonException {
        int i8 = this.f9622m;
        if (i8 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + m5753m());
        }
        int[] iArr = this.f9621l;
        if (i8 == iArr.length) {
            int i9 = i8 * 2;
            this.f9621l = Arrays.copyOf(iArr, i9);
            this.f9624o = Arrays.copyOf(this.f9624o, i9);
            this.f9623n = (String[]) Arrays.copyOf(this.f9623n, i9);
        }
        int[] iArr2 = this.f9621l;
        int i10 = this.f9622m;
        this.f9622m = i10 + 1;
        iArr2[i10] = i;
    }

    /* renamed from: z */
    public final char m5766z() throws MalformedJsonException {
        int i;
        if (this.f9613d == this.f9614e && !m5749g(1)) {
            m5741F("Unterminated escape sequence");
            throw null;
        }
        int i8 = this.f9613d;
        int i9 = i8 + 1;
        this.f9613d = i9;
        char[] cArr = this.f9612c;
        char c = cArr[i8];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            m5741F("Invalid escape sequence");
                            throw null;
                        }
                        if (i8 + 5 > this.f9614e && !m5749g(4)) {
                            m5741F("Unterminated escape sequence");
                            throw null;
                        }
                        int i10 = this.f9613d;
                        int i11 = i10 + 4;
                        int i12 = 0;
                        while (i10 < i11) {
                            char c9 = cArr[i10];
                            int i13 = i12 << 4;
                            if (c9 >= '0' && c9 <= '9') {
                                i = c9 - '0';
                            } else if (c9 >= 'a' && c9 <= 'f') {
                                i = c9 - 'W';
                            } else {
                                if (c9 < 'A' || c9 > 'F') {
                                    m5741F("Malformed Unicode escape \\u".concat(new String(cArr, this.f9613d, 4)));
                                    throw null;
                                }
                                i = c9 - '7';
                            }
                            i12 = i + i13;
                            i10++;
                        }
                        this.f9613d += 4;
                        return (char) i12;
                    }
                }
            }
            return c;
        }
        if (this.f9611b == Strictness.STRICT) {
            m5741F("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f9615f++;
        this.f9616g = i9;
        if (this.f9611b == Strictness.STRICT) {
            m5741F("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }
}
