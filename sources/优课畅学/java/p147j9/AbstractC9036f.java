package p147j9;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import okio.Buffer;
import p077d8.AbstractC8323h;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8801r;
import p247s9.AbstractC10071b;
import p247s9.C10073d;

/* renamed from: j9.f */
/* loaded from: classes5.dex */
public abstract class AbstractC9036f {

    /* renamed from: a */
    public static final Regex f17258a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static final boolean m15728a(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        return f17258a.m16181h(str);
    }

    /* renamed from: b */
    public static final byte[] m15729b(byte[] address) {
        AbstractC9133u.m16133g(address, "address");
        return m15737j(address) ? AbstractC8801r.m14706f1(address, AbstractC8323h.m13525t(12, 16)) : address;
    }

    /* renamed from: c */
    public static final boolean m15730c(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC9133u.m16135i(cCharAt, 31) <= 0 || AbstractC9133u.m16135i(cCharAt, 127) >= 0 || AbstractC8661c0.m13990e0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m15731d(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iM13990e0 = AbstractC8661c0.m13990e0(str2, '.', i10, false, 4, null);
                int length2 = iM13990e0 == -1 ? str2.length() - i10 : iM13990e0 - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (iM13990e0 == -1 || iM13990e0 == str2.length() - 1) {
                    break;
                }
                i10 = iM13990e0 + 1;
                str = str2;
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m15732e(String input, int i10, int i11, byte[] address, int i12) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
                if (AbstractC9133u.m16135i(cCharAt, 48) < 0 || AbstractC9133u.m16135i(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        p134i7.AbstractC8797p.m14643j(r8, r8, 16 - (r11 - r12), r12, r11);
        p134i7.AbstractC8797p.m14659z(r8, (byte) 0, r12, (16 - r11) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] m15733f(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r6 = r18
            java.lang.String r1 = "input"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r0, r1)
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        L14:
            r14 = 0
            if (r2 >= r6) goto L95
            if (r11 != r7) goto L1a
            return r14
        L1a:
            int r15 = r2 + 2
            if (r15 > r6) goto L38
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            boolean r1 = p113g8.AbstractC8687z.m14104L(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L38
            if (r12 == r10) goto L2c
            return r14
        L2c:
            int r11 = r11 + 2
            if (r15 != r6) goto L33
            r12 = r11
            goto L95
        L33:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L67
        L38:
            if (r11 == 0) goto L49
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = p113g8.AbstractC8687z.m14104L(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4d
            int r2 = r2 + 1
        L49:
            r0 = r16
            r13 = r2
            goto L67
        L4d:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = p113g8.AbstractC8687z.m14104L(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L66
            int r1 = r11 + (-2)
            boolean r0 = m15732e(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L63
            return r14
        L63:
            int r11 = r11 + 2
            goto L95
        L66:
            return r14
        L67:
            r1 = r9
            r2 = r13
        L69:
            if (r2 >= r6) goto L7b
            char r3 = r0.charAt(r2)
            int r3 = p147j9.AbstractC9038h.m15767w(r3)
            if (r3 == r10) goto L7b
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L69
        L7b:
            int r3 = r2 - r13
            if (r3 == 0) goto L94
            r4 = 4
            if (r3 <= r4) goto L83
            goto L94
        L83:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L14
        L94:
            return r14
        L95:
            if (r11 == r7) goto La6
            if (r12 != r10) goto L9a
            return r14
        L9a:
            int r0 = r11 - r12
            int r0 = 16 - r0
            p134i7.AbstractC8797p.m14643j(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            p134i7.AbstractC8797p.m14659z(r8, r9, r12, r7)
        La6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p147j9.AbstractC9036f.m15733f(java.lang.String, int, int):byte[]");
    }

    /* renamed from: g */
    public static final String m15734g(String host) throws EOFException {
        AbstractC9133u.m16133g(host, "host");
        Buffer bufferWriteUtf8 = new Buffer().writeUtf8(host);
        Buffer buffer = new Buffer();
        while (!bufferWriteUtf8.exhausted()) {
            if (!AbstractC10071b.m18802a().m18801c(bufferWriteUtf8.readUtf8CodePoint(), buffer)) {
                return null;
            }
        }
        bufferWriteUtf8.writeUtf8(AbstractC9037g.m15739a(buffer.readUtf8()));
        C10073d c10073d = C10073d.f20122a;
        String strM18806c = c10073d.m18806c(bufferWriteUtf8.readUtf8());
        if (strM18806c != null && AbstractC9133u.m16128b(strM18806c, AbstractC9037g.m15739a(strM18806c))) {
            return c10073d.m18808e(strM18806c);
        }
        return null;
    }

    /* renamed from: h */
    public static final String m15735h(byte[] address) {
        AbstractC9133u.m16133g(address, "address");
        if (address.length == 4) {
            return new Buffer().writeDecimalLong(AbstractC9038h.m15746b(address[0], 255)).writeByte(46).writeDecimalLong(AbstractC9038h.m15746b(address[1], 255)).writeByte(46).writeDecimalLong(AbstractC9038h.m15746b(address[2], 255)).writeByte(46).writeDecimalLong(AbstractC9038h.m15746b(address[3], 255)).readUtf8();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: i */
    public static final String m15736i(byte[] address) {
        AbstractC9133u.m16133g(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i11 < address.length) {
            if (i11 == i10) {
                buffer.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((AbstractC9038h.m15746b(address[i11], 255) << 8) | AbstractC9038h.m15746b(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* renamed from: j */
    public static final boolean m15737j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    /* renamed from: k */
    public static final String m15738k(String str) {
        AbstractC9133u.m16133g(str, "<this>");
        if (!AbstractC8661c0.m13973S(str, ":", false, 2, null)) {
            String strM15734g = m15734g(str);
            if (strM15734g == null || strM15734g.length() == 0 || m15730c(strM15734g) || m15731d(strM15734g)) {
                return null;
            }
            return strM15734g;
        }
        byte[] bArrM15733f = (AbstractC8687z.m14105M(str, "[", false, 2, null) && AbstractC8687z.m14111z(str, "]", false, 2, null)) ? m15733f(str, 1, str.length() - 1) : m15733f(str, 0, str.length());
        if (bArrM15733f == null) {
            return null;
        }
        byte[] bArrM15729b = m15729b(bArrM15733f);
        if (bArrM15729b.length == 16) {
            return m15736i(bArrM15729b);
        }
        if (bArrM15729b.length == 4) {
            return m15735h(bArrM15729b);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
