package p044c6;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* renamed from: c6.b */
/* loaded from: classes5.dex */
public class C5403b {

    /* renamed from: a */
    public final String f3441a;

    /* renamed from: b */
    public final int f3442b;

    /* renamed from: c */
    public int f3443c;

    /* renamed from: d */
    public int f3444d;

    /* renamed from: e */
    public int f3445e;

    /* renamed from: f */
    public int f3446f;

    /* renamed from: g */
    public char[] f3447g;

    public C5403b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f3441a = name;
        this.f3442b = name.length();
    }

    /* renamed from: a */
    public final int m2827a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f3442b) {
            throw new IllegalStateException("Malformed DN: " + this.f3441a);
        }
        char[] cArr = this.f3447g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3441a);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f3441a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r2 = r8.f3444d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f3445e - r2);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2828b() {
        /*
            r8 = this;
            int r0 = r8.f3443c
            r8.f3444d = r0
            r8.f3445e = r0
        L6:
            int r0 = r8.f3443c
            int r1 = r8.f3442b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f3447g
            int r2 = r8.f3444d
            int r3 = r8.f3445e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f3447g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f3445e
            int r4 = r3 + 1
            r8.f3445e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f3443c = r0
            goto L6
        L3e:
            int r0 = r8.f3445e
            int r2 = r0 + 1
            r8.f3445e = r2
            char r2 = r8.m2829c()
            r1[r0] = r2
            int r0 = r8.f3443c
            int r0 = r0 + 1
            r8.f3443c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f3444d
            int r3 = r8.f3445e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f3445e
            r8.f3446f = r2
            int r0 = r0 + 1
            r8.f3443c = r0
            int r0 = r2 + 1
            r8.f3445e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f3443c
            int r1 = r8.f3442b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f3447g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f3445e
            int r7 = r1 + 1
            r8.f3445e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f3443c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f3447g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f3447g
            int r2 = r8.f3444d
            int r3 = r8.f3446f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p044c6.C5403b.m2828b():java.lang.String");
    }

    /* renamed from: c */
    public final char m2829c() {
        int i10 = this.f3443c + 1;
        this.f3443c = i10;
        if (i10 == this.f3442b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3441a);
        }
        char c10 = this.f3447g[i10];
        if (c10 == ' ' || c10 == '%' || c10 == '\\' || c10 == '_' || c10 == '\"' || c10 == '#') {
            return c10;
        }
        switch (c10) {
            case '*':
            case '+':
            case ',':
                return c10;
            default:
                switch (c10) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c10;
                    default:
                        return m2831e();
                }
        }
    }

    /* renamed from: d */
    public List m2830d(String str) {
        this.f3443c = 0;
        this.f3444d = 0;
        this.f3445e = 0;
        this.f3446f = 0;
        this.f3447g = this.f3441a.toCharArray();
        List arrayList = Collections.EMPTY_LIST;
        String strM2833g = m2833g();
        if (strM2833g == null) {
            return arrayList;
        }
        do {
            int i10 = this.f3443c;
            if (i10 >= this.f3442b) {
                return arrayList;
            }
            char c10 = this.f3447g[i10];
            String strM2828b = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : m2828b() : m2832f() : m2834h();
            if (str.equalsIgnoreCase(strM2833g)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM2828b);
            }
            int i11 = this.f3443c;
            if (i11 >= this.f3442b) {
                return arrayList;
            }
            char c11 = this.f3447g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f3441a);
            }
            this.f3443c = i11 + 1;
            strM2833g = m2833g();
        } while (strM2833g != null);
        throw new IllegalStateException("Malformed DN: " + this.f3441a);
    }

    /* renamed from: e */
    public final char m2831e() {
        int i10;
        int i11;
        int iM2827a = m2827a(this.f3443c);
        this.f3443c++;
        if (iM2827a < 128) {
            return (char) iM2827a;
        }
        if (iM2827a < 192 || iM2827a > 247) {
            return '?';
        }
        if (iM2827a <= 223) {
            i10 = iM2827a & 31;
            i11 = 1;
        } else if (iM2827a <= 239) {
            i10 = iM2827a & 15;
            i11 = 2;
        } else {
            i10 = iM2827a & 7;
            i11 = 3;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f3443c;
            int i14 = i13 + 1;
            this.f3443c = i14;
            if (i14 == this.f3442b || this.f3447g[i14] != '\\') {
                return '?';
            }
            int i15 = i13 + 2;
            this.f3443c = i15;
            int iM2827a2 = m2827a(i15);
            this.f3443c++;
            if ((iM2827a2 & Opcodes.CHECKCAST) != 128) {
                return '?';
            }
            i10 = (i10 << 6) + (iM2827a2 & 63);
        }
        return (char) i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r6.f3445e = r0;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2832f() {
        /*
            r6 = this;
            int r0 = r6.f3443c
            int r1 = r0 + 4
            int r2 = r6.f3442b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L98
            r6.f3444d = r0
            int r0 = r0 + 1
            r6.f3443c = r0
        L10:
            int r0 = r6.f3443c
            int r1 = r6.f3442b
            if (r0 == r1) goto L54
            char[] r1 = r6.f3447g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L54
            r4 = 44
            if (r2 == r4) goto L54
            r4 = 59
            if (r2 != r4) goto L27
            goto L54
        L27:
            r4 = 32
            if (r2 != r4) goto L42
            r6.f3445e = r0
            int r0 = r0 + 1
            r6.f3443c = r0
        L31:
            int r0 = r6.f3443c
            int r1 = r6.f3442b
            if (r0 >= r1) goto L56
            char[] r1 = r6.f3447g
            char r1 = r1[r0]
            if (r1 != r4) goto L56
            int r0 = r0 + 1
            r6.f3443c = r0
            goto L31
        L42:
            r4 = 65
            if (r2 < r4) goto L4f
            r4 = 70
            if (r2 > r4) goto L4f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L4f:
            int r0 = r0 + 1
            r6.f3443c = r0
            goto L10
        L54:
            r6.f3445e = r0
        L56:
            int r0 = r6.f3445e
            int r1 = r6.f3444d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L81
            r2 = r0 & 1
            if (r2 == 0) goto L81
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L69:
            if (r4 >= r2) goto L77
            int r5 = r6.m2827a(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L69
        L77:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f3447g
            int r3 = r6.f3444d
            r1.<init>(r2, r3, r0)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f3441a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f3441a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p044c6.C5403b.m2832f():java.lang.String");
    }

    /* renamed from: g */
    public final String m2833g() {
        int i10;
        int i11;
        int i12;
        int i13;
        char c10;
        char c11;
        char c12;
        int i14;
        int i15;
        char c13;
        char c14;
        while (true) {
            i10 = this.f3443c;
            i11 = this.f3442b;
            if (i10 >= i11 || this.f3447g[i10] != ' ') {
                break;
            }
            this.f3443c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f3444d = i10;
        this.f3443c = i10 + 1;
        while (true) {
            i12 = this.f3443c;
            i13 = this.f3442b;
            if (i12 >= i13 || (c14 = this.f3447g[i12]) == '=' || c14 == ' ') {
                break;
            }
            this.f3443c = i12 + 1;
        }
        if (i12 >= i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f3441a);
        }
        this.f3445e = i12;
        if (this.f3447g[i12] == ' ') {
            while (true) {
                i14 = this.f3443c;
                i15 = this.f3442b;
                if (i14 >= i15 || (c13 = this.f3447g[i14]) == '=' || c13 != ' ') {
                    break;
                }
                this.f3443c = i14 + 1;
            }
            if (this.f3447g[i14] != '=' || i14 == i15) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3441a);
            }
        }
        this.f3443c++;
        while (true) {
            int i16 = this.f3443c;
            if (i16 >= this.f3442b || this.f3447g[i16] != ' ') {
                break;
            }
            this.f3443c = i16 + 1;
        }
        int i17 = this.f3445e;
        int i18 = this.f3444d;
        if (i17 - i18 > 4) {
            char[] cArr = this.f3447g;
            if (cArr[i18 + 3] == '.' && (((c10 = cArr[i18]) == 'O' || c10 == 'o') && (((c11 = cArr[i18 + 1]) == 'I' || c11 == 'i') && ((c12 = cArr[i18 + 2]) == 'D' || c12 == 'd')))) {
                this.f3444d = i18 + 4;
            }
        }
        char[] cArr2 = this.f3447g;
        int i19 = this.f3444d;
        return new String(cArr2, i19, i17 - i19);
    }

    /* renamed from: h */
    public final String m2834h() {
        int i10 = this.f3443c + 1;
        this.f3443c = i10;
        this.f3444d = i10;
        this.f3445e = i10;
        while (true) {
            int i11 = this.f3443c;
            if (i11 == this.f3442b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f3441a);
            }
            char[] cArr = this.f3447g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                this.f3443c = i11 + 1;
                while (true) {
                    int i12 = this.f3443c;
                    if (i12 >= this.f3442b || this.f3447g[i12] != ' ') {
                        break;
                    }
                    this.f3443c = i12 + 1;
                }
                char[] cArr2 = this.f3447g;
                int i13 = this.f3444d;
                return new String(cArr2, i13, this.f3445e - i13);
            }
            if (c10 == '\\') {
                cArr[this.f3445e] = m2829c();
            } else {
                cArr[this.f3445e] = c10;
            }
            this.f3443c++;
            this.f3445e++;
        }
    }
}
