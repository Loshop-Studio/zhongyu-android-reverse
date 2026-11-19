package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import okio.Buffer;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.b */
/* loaded from: classes4.dex */
public final class C6286b {

    /* renamed from: a */
    public static final C6286b f10053a = new C6286b();

    /* renamed from: b */
    public static final C6286b f10054b = new C6286b();

    /* renamed from: c */
    public static final C6286b f10055c = new C6286b();

    /* renamed from: a */
    public static final C6316j m5877a(C6286b c6286b, String str) {
        C6316j c6316j = new C6316j(str);
        C6316j.f10204d.put(str, c6316j);
        return c6316j;
    }

    /* renamed from: b */
    public static String m5878b(String str, int i, String str2, int i8, int i9) throws EOFException {
        int i10 = (i9 & 1) != 0 ? 0 : i;
        int length = (i9 & 2) != 0 ? str.length() : i8;
        boolean z8 = (i9 & 8) == 0;
        boolean z9 = (i9 & 16) == 0;
        boolean z10 = (i9 & 32) == 0;
        boolean z11 = (i9 & 64) == 0;
        AbstractC5830k.m5330g(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i11 = 128;
            int i12 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || AbstractC5855p.m5373G(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z8 || (z9 && !m5879d(iCharCount, length, str)))) || (iCodePointAt == 43 && z10)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i10, iCharCount);
                Buffer buffer2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z8 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z10) {
                            buffer.writeUtf8(z8 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i12 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i11 && !z11) || AbstractC5855p.m5373G(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z8 || (z9 && !m5879d(iCharCount, length, str)))))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(iCodePointAt2);
                            while (!buffer2.exhausted()) {
                                byte b6 = buffer2.readByte();
                                buffer.writeByte(37);
                                char[] cArr = C6330r.f10264k;
                                buffer.writeByte((int) cArr[((b6 & 255) >> 4) & 15]);
                                buffer.writeByte((int) cArr[b6 & 15]);
                            }
                        } else {
                            buffer.writeUtf8CodePoint(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i11 = 128;
                    i12 = 32;
                }
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, length);
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: d */
    public static boolean m5879d(int i, int i8, String str) {
        int i9 = i + 2;
        return i9 < i8 && str.charAt(i) == '%' && AbstractC6396c.m6056p(str.charAt(i + 1)) != -1 && AbstractC6396c.m6056p(str.charAt(i9)) != -1;
    }

    /* renamed from: e */
    public static String m5880e(String str, int i, int i8, int i9) {
        int i10;
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        boolean z8 = (i9 & 4) == 0;
        AbstractC5830k.m5330g(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i8) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z8)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, iCharCount);
                while (iCharCount < i8) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i10 = iCharCount + 2) < i8) {
                        int iM6056p = AbstractC6396c.m6056p(str.charAt(iCharCount + 1));
                        int iM6056p2 = AbstractC6396c.m6056p(str.charAt(i10));
                        if (iM6056p == -1 || iM6056p2 == -1) {
                            buffer.writeUtf8CodePoint(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            buffer.writeByte((iM6056p << 4) + iM6056p2);
                            iCharCount = Character.charCount(iCodePointAt) + i10;
                        }
                    } else if (iCodePointAt == 43 && z8) {
                        buffer.writeByte(32);
                        iCharCount++;
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return buffer.readUtf8();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i8);
        AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: f */
    public static ArrayList m5881f(String str) {
        AbstractC5830k.m5330g(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM5379M = AbstractC5855p.m5379M(str, '&', i, 4);
            if (iM5379M == -1) {
                iM5379M = str.length();
            }
            int iM5379M2 = AbstractC5855p.m5379M(str, '=', i, 4);
            if (iM5379M2 == -1 || iM5379M2 > iM5379M) {
                String strSubstring = str.substring(i, iM5379M);
                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iM5379M2);
                AbstractC5830k.m5329f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM5379M2 + 1, iM5379M);
                AbstractC5830k.m5329f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iM5379M + 1;
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized C6316j m5882c(String javaName) {
        C6316j c6316j;
        String strConcat;
        try {
            AbstractC5830k.m5330g(javaName, "javaName");
            LinkedHashMap linkedHashMap = C6316j.f10204d;
            c6316j = (C6316j) linkedHashMap.get(javaName);
            if (c6316j == null) {
                if (AbstractC5862w.m5409C(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (AbstractC5862w.m5409C(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    AbstractC5830k.m5329f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                c6316j = (C6316j) linkedHashMap.get(strConcat);
                if (c6316j == null) {
                    c6316j = new C6316j(javaName);
                }
                linkedHashMap.put(javaName, c6316j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c6316j;
    }
}
