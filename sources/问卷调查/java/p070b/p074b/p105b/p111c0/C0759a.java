package p070b.p074b.p105b.p111c0;

import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.p106a0.AbstractC0727q;

/* renamed from: b.b.b.c0.a */
/* loaded from: classes.dex */
public class C0759a implements Closeable {

    /* renamed from: q */
    public static final char[] f4396q = ")]}'\n".toCharArray();

    /* renamed from: b */
    public final Reader f4397b;

    /* renamed from: c */
    public boolean f4398c = false;

    /* renamed from: d */
    public final char[] f4399d = new char[1024];

    /* renamed from: e */
    public int f4400e = 0;

    /* renamed from: f */
    public int f4401f = 0;

    /* renamed from: g */
    public int f4402g = 0;

    /* renamed from: h */
    public int f4403h = 0;

    /* renamed from: i */
    public int f4404i = 0;

    /* renamed from: j */
    public long f4405j;

    /* renamed from: k */
    public int f4406k;

    /* renamed from: l */
    public String f4407l;

    /* renamed from: m */
    public int[] f4408m;

    /* renamed from: n */
    public int f4409n;

    /* renamed from: o */
    public String[] f4410o;

    /* renamed from: p */
    public int[] f4411p;

    /* renamed from: b.b.b.c0.a$a */
    public class a extends AbstractC0727q {
    }

    static {
        AbstractC0727q.f4233a = new a();
    }

    public C0759a(Reader reader) {
        int[] iArr = new int[32];
        this.f4408m = iArr;
        this.f4409n = 0;
        this.f4409n = 0 + 1;
        iArr[0] = 6;
        this.f4410o = new String[32];
        this.f4411p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4397b = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0099, code lost:
    
        m2430c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x0093. Please report as an issue. */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2385A() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p111c0.C0759a.mo2385A():void");
    }

    /* renamed from: B */
    public final IOException m2429B(String str) throws C0762d {
        StringBuilder sbM2079g = C0561a.m2079g(str);
        sbM2079g.append(m2434k());
        throw new C0762d(sbM2079g.toString());
    }

    /* renamed from: a */
    public void mo2390a() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 3) {
            m2438w(1);
            this.f4411p[this.f4409n - 1] = 0;
            this.f4404i = 0;
        } else {
            StringBuilder sbM2079g = C0561a.m2079g("Expected BEGIN_ARRAY but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
    }

    /* renamed from: b */
    public void mo2391b() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 1) {
            m2438w(3);
            this.f4404i = 0;
        } else {
            StringBuilder sbM2079g = C0561a.m2079g("Expected BEGIN_OBJECT but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
    }

    /* renamed from: c */
    public final void m2430c() throws C0762d {
        if (this.f4398c) {
            return;
        }
        m2429B("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4404i = 0;
        this.f4408m[0] = 8;
        this.f4409n = 1;
        this.f4397b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x020a, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0210, code lost:
    
        if (m2433j(r6) != false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m2431d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p111c0.C0759a.m2431d():int");
    }

    /* renamed from: e */
    public void mo2392e() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d != 4) {
            StringBuilder sbM2079g = C0561a.m2079g("Expected END_ARRAY but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
        int i = this.f4409n - 1;
        this.f4409n = i;
        int[] iArr = this.f4411p;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f4404i = 0;
    }

    /* renamed from: f */
    public void mo2393f() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d != 2) {
            StringBuilder sbM2079g = C0561a.m2079g("Expected END_OBJECT but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
        int i = this.f4409n - 1;
        this.f4409n = i;
        this.f4410o[i] = null;
        int[] iArr = this.f4411p;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f4404i = 0;
    }

    /* renamed from: g */
    public final boolean m2432g(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f4399d;
        int i4 = this.f4403h;
        int i5 = this.f4400e;
        this.f4403h = i4 - i5;
        int i6 = this.f4401f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4401f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4401f = 0;
        }
        this.f4400e = 0;
        do {
            Reader reader = this.f4397b;
            int i8 = this.f4401f;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f4401f + i9;
            this.f4401f = i2;
            if (this.f4402g == 0 && (i3 = this.f4403h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f4400e++;
                this.f4403h = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: h */
    public String mo2394h() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f4409n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f4408m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f4411p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f4410o;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo2395i() throws IOException {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        return (iM2431d == 2 || iM2431d == 4) ? false : true;
    }

    /* renamed from: j */
    public final boolean m2433j(char c2) throws C0762d {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
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
        m2430c();
        return false;
    }

    /* renamed from: k */
    public String m2434k() {
        return " at line " + (this.f4402g + 1) + " column " + ((this.f4400e - this.f4403h) + 1) + " path " + mo2394h();
    }

    /* renamed from: l */
    public boolean mo2396l() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 5) {
            this.f4404i = 0;
            int[] iArr = this.f4411p;
            int i = this.f4409n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM2431d != 6) {
            StringBuilder sbM2079g = C0561a.m2079g("Expected a boolean but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
        this.f4404i = 0;
        int[] iArr2 = this.f4411p;
        int i2 = this.f4409n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* renamed from: m */
    public double mo2397m() throws IOException, NumberFormatException {
        String strM2436s;
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 15) {
            this.f4404i = 0;
            int[] iArr = this.f4411p;
            int i = this.f4409n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f4405j;
        }
        if (iM2431d == 16) {
            this.f4407l = new String(this.f4399d, this.f4400e, this.f4406k);
            this.f4400e += this.f4406k;
        } else {
            if (iM2431d == 8 || iM2431d == 9) {
                strM2436s = m2436s(iM2431d == 8 ? '\'' : '\"');
            } else if (iM2431d == 10) {
                strM2436s = m2437u();
            } else if (iM2431d != 11) {
                StringBuilder sbM2079g = C0561a.m2079g("Expected a double but was ");
                sbM2079g.append(mo2403v());
                sbM2079g.append(m2434k());
                throw new IllegalStateException(sbM2079g.toString());
            }
            this.f4407l = strM2436s;
        }
        this.f4404i = 11;
        double d2 = Double.parseDouble(this.f4407l);
        if (!this.f4398c && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new C0762d("JSON forbids NaN and infinities: " + d2 + m2434k());
        }
        this.f4407l = null;
        this.f4404i = 0;
        int[] iArr2 = this.f4411p;
        int i2 = this.f4409n - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d2;
    }

    /* renamed from: n */
    public int mo2398n() {
        String strM2436s;
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 15) {
            long j = this.f4405j;
            int i = (int) j;
            if (j != i) {
                StringBuilder sbM2079g = C0561a.m2079g("Expected an int but was ");
                sbM2079g.append(this.f4405j);
                sbM2079g.append(m2434k());
                throw new NumberFormatException(sbM2079g.toString());
            }
            this.f4404i = 0;
            int[] iArr = this.f4411p;
            int i2 = this.f4409n - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM2431d == 16) {
            this.f4407l = new String(this.f4399d, this.f4400e, this.f4406k);
            this.f4400e += this.f4406k;
        } else {
            if (iM2431d != 8 && iM2431d != 9 && iM2431d != 10) {
                StringBuilder sbM2079g2 = C0561a.m2079g("Expected an int but was ");
                sbM2079g2.append(mo2403v());
                sbM2079g2.append(m2434k());
                throw new IllegalStateException(sbM2079g2.toString());
            }
            if (iM2431d == 10) {
                strM2436s = m2437u();
            } else {
                strM2436s = m2436s(iM2431d == 8 ? '\'' : '\"');
            }
            this.f4407l = strM2436s;
            try {
                int i3 = Integer.parseInt(this.f4407l);
                this.f4404i = 0;
                int[] iArr2 = this.f4411p;
                int i4 = this.f4409n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4404i = 11;
        double d2 = Double.parseDouble(this.f4407l);
        int i5 = (int) d2;
        if (i5 != d2) {
            StringBuilder sbM2079g3 = C0561a.m2079g("Expected an int but was ");
            sbM2079g3.append(this.f4407l);
            sbM2079g3.append(m2434k());
            throw new NumberFormatException(sbM2079g3.toString());
        }
        this.f4407l = null;
        this.f4404i = 0;
        int[] iArr3 = this.f4411p;
        int i6 = this.f4409n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* renamed from: o */
    public long mo2399o() throws IOException, NumberFormatException {
        String strM2436s;
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 15) {
            this.f4404i = 0;
            int[] iArr = this.f4411p;
            int i = this.f4409n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f4405j;
        }
        if (iM2431d == 16) {
            this.f4407l = new String(this.f4399d, this.f4400e, this.f4406k);
            this.f4400e += this.f4406k;
        } else {
            if (iM2431d != 8 && iM2431d != 9 && iM2431d != 10) {
                StringBuilder sbM2079g = C0561a.m2079g("Expected a long but was ");
                sbM2079g.append(mo2403v());
                sbM2079g.append(m2434k());
                throw new IllegalStateException(sbM2079g.toString());
            }
            if (iM2431d == 10) {
                strM2436s = m2437u();
            } else {
                strM2436s = m2436s(iM2431d == 8 ? '\'' : '\"');
            }
            this.f4407l = strM2436s;
            try {
                long j = Long.parseLong(this.f4407l);
                this.f4404i = 0;
                int[] iArr2 = this.f4411p;
                int i2 = this.f4409n - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4404i = 11;
        double d2 = Double.parseDouble(this.f4407l);
        long j2 = (long) d2;
        if (j2 != d2) {
            StringBuilder sbM2079g2 = C0561a.m2079g("Expected a long but was ");
            sbM2079g2.append(this.f4407l);
            sbM2079g2.append(m2434k());
            throw new NumberFormatException(sbM2079g2.toString());
        }
        this.f4407l = null;
        this.f4404i = 0;
        int[] iArr3 = this.f4411p;
        int i3 = this.f4409n - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* renamed from: p */
    public String mo2400p() {
        char c2;
        String strM2436s;
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 14) {
            strM2436s = m2437u();
        } else {
            if (iM2431d == 12) {
                c2 = '\'';
            } else {
                if (iM2431d != 13) {
                    StringBuilder sbM2079g = C0561a.m2079g("Expected a name but was ");
                    sbM2079g.append(mo2403v());
                    sbM2079g.append(m2434k());
                    throw new IllegalStateException(sbM2079g.toString());
                }
                c2 = '\"';
            }
            strM2436s = m2436s(c2);
        }
        this.f4404i = 0;
        this.f4410o[this.f4409n - 1] = strM2436s;
        return strM2436s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r1 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r9.f4400e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r9.f4400e = r4 - 1;
        r2 = m2432g(2);
        r9.f4400e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        m2430c();
        r2 = r9.f4400e;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r4 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r9.f4400e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r9.f4400e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if ((r9.f4400e + 2) <= r9.f4401f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (m2432g(2) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r1 = r9.f4399d;
        r2 = r9.f4400e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        if (r1[r2] != '\n') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r9.f4402g++;
        r9.f4403h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r4 >= 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r9.f4399d[r9.f4400e + r4] == "*\/".charAt(r4)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r9.f4400e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r3 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
    
        m2429B("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
    
        r9.f4400e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        if (r1 != '#') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        m2430c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        return r1;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2435q(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p111c0.C0759a.m2435q(boolean):int");
    }

    /* renamed from: r */
    public void mo2401r() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d != 7) {
            StringBuilder sbM2079g = C0561a.m2079g("Expected null but was ");
            sbM2079g.append(mo2403v());
            sbM2079g.append(m2434k());
            throw new IllegalStateException(sbM2079g.toString());
        }
        this.f4404i = 0;
        int[] iArr = this.f4411p;
        int i = this.f4409n - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: s */
    public final String m2436s(char c2) throws C0762d {
        char[] cArr = this.f4399d;
        StringBuilder sb = null;
        while (true) {
            int i = this.f4400e;
            int i2 = this.f4401f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f4400e = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.f4400e = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(m2439x());
                    } else {
                        if (c3 == '\n') {
                            this.f4402g++;
                            this.f4403h = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.f4400e = i;
                    if (!m2432g(1)) {
                        m2429B("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public String mo2402t() {
        String str;
        char c2;
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        if (iM2431d == 10) {
            str = m2437u();
        } else {
            if (iM2431d == 8) {
                c2 = '\'';
            } else if (iM2431d == 9) {
                c2 = '\"';
            } else if (iM2431d == 11) {
                str = this.f4407l;
                this.f4407l = null;
            } else if (iM2431d == 15) {
                str = Long.toString(this.f4405j);
            } else {
                if (iM2431d != 16) {
                    StringBuilder sbM2079g = C0561a.m2079g("Expected a string but was ");
                    sbM2079g.append(mo2403v());
                    sbM2079g.append(m2434k());
                    throw new IllegalStateException(sbM2079g.toString());
                }
                str = new String(this.f4399d, this.f4400e, this.f4406k);
                this.f4400e += this.f4406k;
            }
            str = m2436s(c2);
        }
        this.f4404i = 0;
        int[] iArr = this.f4411p;
        int i = this.f4409n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName() + m2434k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m2430c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2437u() throws p070b.p074b.p105b.p111c0.C0762d {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f4400e
            int r4 = r3 + r2
            int r5 = r6.f4401f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f4399d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m2430c()
            goto L5c
        L4e:
            char[] r3 = r6.f4399d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m2432g(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f4399d
            int r4 = r6.f4400e
            r1.append(r3, r4, r2)
            int r3 = r6.f4400e
            int r3 = r3 + r2
            r6.f4400e = r3
            r2 = 1
            boolean r2 = r6.m2432g(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4399d
            int r3 = r6.f4400e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f4399d
            int r3 = r6.f4400e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f4400e
            int r2 = r2 + r0
            r6.f4400e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p111c0.C0759a.m2437u():java.lang.String");
    }

    /* renamed from: v */
    public EnumC0760b mo2403v() {
        int iM2431d = this.f4404i;
        if (iM2431d == 0) {
            iM2431d = m2431d();
        }
        switch (iM2431d) {
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                return EnumC0760b.BEGIN_OBJECT;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                return EnumC0760b.END_OBJECT;
            case 3:
                return EnumC0760b.BEGIN_ARRAY;
            case 4:
                return EnumC0760b.END_ARRAY;
            case 5:
            case 6:
                return EnumC0760b.BOOLEAN;
            case 7:
                return EnumC0760b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC0760b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC0760b.NAME;
            case 15:
            case 16:
                return EnumC0760b.NUMBER;
            case 17:
                return EnumC0760b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: w */
    public final void m2438w(int i) {
        int i2 = this.f4409n;
        int[] iArr = this.f4408m;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f4408m = Arrays.copyOf(iArr, i3);
            this.f4411p = Arrays.copyOf(this.f4411p, i3);
            this.f4410o = (String[]) Arrays.copyOf(this.f4410o, i3);
        }
        int[] iArr2 = this.f4408m;
        int i4 = this.f4409n;
        this.f4409n = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: x */
    public final char m2439x() throws C0762d {
        int i;
        int i2;
        if (this.f4400e == this.f4401f && !m2432g(1)) {
            m2429B("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f4399d;
        int i3 = this.f4400e;
        int i4 = i3 + 1;
        this.f4400e = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f4402g++;
            this.f4403h = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                m2429B("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.f4401f && !m2432g(4)) {
                m2429B("Unterminated escape sequence");
                throw null;
            }
            char c3 = 0;
            int i5 = this.f4400e;
            int i6 = i5 + 4;
            while (i5 < i6) {
                char c4 = this.f4399d[i5];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            StringBuilder sbM2079g = C0561a.m2079g("\\u");
                            sbM2079g.append(new String(this.f4399d, this.f4400e, 4));
                            throw new NumberFormatException(sbM2079g.toString());
                        }
                        i = c4 - 'A';
                    }
                    i2 = i + 10;
                } else {
                    i2 = c4 - '0';
                }
                c3 = (char) (i2 + c5);
                i5++;
            }
            this.f4400e += 4;
            return c3;
        }
        return c2;
    }

    /* renamed from: y */
    public final void m2440y(char c2) throws C0762d {
        char[] cArr = this.f4399d;
        while (true) {
            int i = this.f4400e;
            int i2 = this.f4401f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f4400e = i3;
                        return;
                    }
                    if (c3 == '\\') {
                        this.f4400e = i3;
                        m2439x();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f4402g++;
                            this.f4403h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f4400e = i;
                    if (!m2432g(1)) {
                        m2429B("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: z */
    public final void m2441z() {
        char c2;
        do {
            if (this.f4400e >= this.f4401f && !m2432g(1)) {
                return;
            }
            char[] cArr = this.f4399d;
            int i = this.f4400e;
            int i2 = i + 1;
            this.f4400e = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.f4402g++;
                this.f4403h = i2;
                return;
            }
        } while (c2 != '\r');
    }
}
