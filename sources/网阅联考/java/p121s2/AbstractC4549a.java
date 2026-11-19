package p121s2;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import okio.Buffer;

/* renamed from: s2.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4549a {
    /* renamed from: a */
    public static final boolean m6193a(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, WorkQueueKt.MASK) >= 0 || StringsKt__StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m6194b(String str, int i4, int i5, byte[] bArr, int i6) {
        int i7 = i6;
        while (i4 < i5) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i6) {
                if (str.charAt(i4) != '.') {
                    return false;
                }
                i4++;
            }
            int i8 = i4;
            int i9 = 0;
            while (i8 < i5) {
                char cCharAt = str.charAt(i8);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i9 == 0 && i4 != i8) || (i9 = ((i9 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i8++;
            }
            if (i8 - i4 == 0) {
                return false;
            }
            bArr[i7] = (byte) i9;
            i7++;
            i4 = i8;
        }
        return i7 == i6 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress m6195c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121s2.AbstractC4549a.m6195c(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: d */
    public static final String m6196d(byte[] bArr) {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            int i8 = i6;
            while (i8 < 16 && bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        Buffer buffer = new Buffer();
        while (i5 < bArr.length) {
            if (i5 == i4) {
                buffer.writeByte(58);
                i5 += i7;
                if (i5 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i5 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((AbstractC4550b.m6220b(bArr[i5], 255) << 8) | AbstractC4550b.m6220b(bArr[i5 + 1], 255));
                i5 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* renamed from: e */
    public static final String m6197e(String toCanonicalHost) {
        Intrinsics.checkNotNullParameter(toCanonicalHost, "$this$toCanonicalHost");
        if (!StringsKt__StringsKt.contains$default((CharSequence) toCanonicalHost, (CharSequence) ":", false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                Intrinsics.checkNotNullExpressionValue(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!(lowerCase.length() == 0) && !m6193a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM6195c = (StringsKt__StringsJVMKt.startsWith$default(toCanonicalHost, "[", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(toCanonicalHost, "]", false, 2, null)) ? m6195c(toCanonicalHost, 1, toCanonicalHost.length() - 1) : m6195c(toCanonicalHost, 0, toCanonicalHost.length());
        if (inetAddressM6195c == null) {
            return null;
        }
        byte[] address = inetAddressM6195c.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return m6196d(address);
        }
        if (address.length == 4) {
            return inetAddressM6195c.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + toCanonicalHost + '\'');
    }
}
