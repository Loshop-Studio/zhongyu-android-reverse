package p313y9;

import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Buffer;
import org.slf4j.Marker;
import p113g8.AbstractC8661c0;
import p113g8.C8660c;
import p123h7.C8736p;
import p147j9.AbstractC9038h;

/* renamed from: y9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10683a {

    /* renamed from: a */
    public static final char[] f21212a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final String m19970a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(encodeSet, "encodeSet");
        return m19973d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    /* renamed from: b */
    public static /* synthetic */ String m19971b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return m19970a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    /* renamed from: c */
    public static final String m19972c(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        AbstractC9133u.m16133g(str, "<this>");
        AbstractC9133u.m16133g(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || AbstractC8661c0.m13971R(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !m19974e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i10, iCharCount);
                m19977h(buffer, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public static /* synthetic */ String m19973d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return m19972c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    /* renamed from: e */
    public static final boolean m19974e(String str, int i10, int i11) {
        AbstractC9133u.m16133g(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && AbstractC9038h.m15767w(str.charAt(i10 + 1)) != -1 && AbstractC9038h.m15767w(str.charAt(i12)) != -1;
    }

    /* renamed from: f */
    public static final String m19975f(String str, int i10, int i11, boolean z10) {
        AbstractC9133u.m16133g(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i10, i12);
                m19978i(buffer, str, i12, i11, z10);
                return buffer.readUtf8();
            }
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: g */
    public static /* synthetic */ String m19976g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return m19975f(str, i10, i11, z10);
    }

    /* renamed from: h */
    public static final void m19977h(Buffer buffer, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        AbstractC9133u.m16133g(buffer, "<this>");
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(encodeSet, "encodeSet");
        Buffer buffer2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                C8736p c8736p = C8736p.f16368a;
            } else {
                String str = Marker.ANY_NON_NULL_MARKER;
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    buffer.writeUtf8(Marker.ANY_NON_NULL_MARKER);
                } else if (iCodePointAt == 43 && z12) {
                    if (!z10) {
                        str = "%2B";
                    }
                    buffer.writeUtf8(str);
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || AbstractC8661c0.m13971R(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !m19974e(input, i10, i11)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || AbstractC9133u.m16128b(charset, C8660c.f16206b)) {
                        buffer2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        buffer2.writeString(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!buffer2.exhausted()) {
                        byte b10 = buffer2.readByte();
                        buffer.writeByte(37);
                        char[] cArr = f21212a;
                        buffer.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                        buffer.writeByte((int) cArr[b10 & 15]);
                    }
                    C8736p c8736p2 = C8736p.f16368a;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: i */
    public static final void m19978i(Buffer buffer, String encoded, int i10, int i11, boolean z10) {
        int i12;
        AbstractC9133u.m16133g(buffer, "<this>");
        AbstractC9133u.m16133g(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iM15767w = AbstractC9038h.m15767w(encoded.charAt(i10 + 1));
                int iM15767w2 = AbstractC9038h.m15767w(encoded.charAt(i12));
                if (iM15767w == -1 || iM15767w2 == -1) {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    buffer.writeByte((iM15767w << 4) + iM15767w2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                buffer.writeByte(32);
                i10++;
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
