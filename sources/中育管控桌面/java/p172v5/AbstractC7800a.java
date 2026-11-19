package p172v5;

import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Buffer;
import p065g5.AbstractC6424h;

/* renamed from: v5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7800a {

    /* renamed from: a */
    public static final char[] f10354a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final String m9368a(String str, int i6, int i7, String encodeSet, boolean z6, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return m9371d(str, i6, i7, encodeSet, z6, z7, z8, z9, null, 128, null);
    }

    /* renamed from: b */
    public static /* synthetic */ String m9369b(String str, int i6, int i7, String str2, boolean z6, boolean z7, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 8) != 0) {
            z6 = false;
        }
        if ((i8 & 16) != 0) {
            z7 = false;
        }
        if ((i8 & 32) != 0) {
            z8 = false;
        }
        if ((i8 & 64) != 0) {
            z9 = false;
        }
        return m9368a(str, i6, i7, str2, z6, z7, z8, z9);
    }

    /* renamed from: c */
    public static final String m9370c(String str, int i6, int i7, String encodeSet, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i6;
        while (iCharCount < i7) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z6 || (z7 && !m9372e(str, iCharCount, i7)))) || (iCodePointAt == 43 && z8)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i6, iCharCount);
                m9375h(buffer, str, iCharCount, i7, encodeSet, z6, z7, z8, z9, charset);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i6, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: d */
    public static /* synthetic */ String m9371d(String str, int i6, int i7, String str2, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 8) != 0) {
            z6 = false;
        }
        if ((i8 & 16) != 0) {
            z7 = false;
        }
        if ((i8 & 32) != 0) {
            z8 = false;
        }
        if ((i8 & 64) != 0) {
            z9 = false;
        }
        if ((i8 & 128) != 0) {
            charset = null;
        }
        return m9370c(str, i6, i7, str2, z6, z7, z8, z9, charset);
    }

    /* renamed from: e */
    public static final boolean m9372e(String str, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i8 = i6 + 2;
        return i8 < i7 && str.charAt(i6) == '%' && AbstractC6424h.m7009w(str.charAt(i6 + 1)) != -1 && AbstractC6424h.m7009w(str.charAt(i8)) != -1;
    }

    /* renamed from: f */
    public static final String m9373f(String str, int i6, int i7, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i8 = i6; i8 < i7; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i6, i8);
                m9376i(buffer, str, i8, i7, z6);
                return buffer.readUtf8();
            }
        }
        String strSubstring = str.substring(i6, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: g */
    public static /* synthetic */ String m9374g(String str, int i6, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return m9373f(str, i6, i7, z6);
    }

    /* renamed from: h */
    public static final void m9375h(Buffer buffer, String input, int i6, int i7, String encodeSet, boolean z6, boolean z7, boolean z8, boolean z9, Charset charset) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        Buffer buffer2 = null;
        while (i6 < i7) {
            int iCodePointAt = input.codePointAt(i6);
            if (z6 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                Unit unit = Unit.INSTANCE;
            } else {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    buffer.writeUtf8("+");
                } else if (iCodePointAt == 43 && z8) {
                    buffer.writeUtf8(z6 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z9) || StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || (iCodePointAt == 37 && (!z6 || (z7 && !m9372e(input, i6, i7)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        buffer2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        buffer2.writeString(input, i6, Character.charCount(iCodePointAt) + i6, charset);
                    }
                    while (!buffer2.exhausted()) {
                        byte b7 = buffer2.readByte();
                        int i8 = b7 & UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = f10354a;
                        buffer.writeByte((int) cArr[(i8 >> 4) & 15]);
                        buffer.writeByte((int) cArr[b7 & 15]);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i6 += Character.charCount(iCodePointAt);
        }
    }

    /* renamed from: i */
    public static final void m9376i(Buffer buffer, String encoded, int i6, int i7, boolean z6) {
        int i8;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        while (i6 < i7) {
            int iCodePointAt = encoded.codePointAt(i6);
            if (iCodePointAt == 37 && (i8 = i6 + 2) < i7) {
                int iM7009w = AbstractC6424h.m7009w(encoded.charAt(i6 + 1));
                int iM7009w2 = AbstractC6424h.m7009w(encoded.charAt(i8));
                if (iM7009w == -1 || iM7009w2 == -1) {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i6 += Character.charCount(iCodePointAt);
                } else {
                    buffer.writeByte((iM7009w << 4) + iM7009w2);
                    i6 = Character.charCount(iCodePointAt) + i8;
                }
            } else if (iCodePointAt == 43 && z6) {
                buffer.writeByte(32);
                i6++;
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
                i6 += Character.charCount(iCodePointAt);
            }
        }
    }
}
