package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlinx.serialization.json.internal.y */
/* loaded from: classes4.dex */
public abstract class AbstractC6044y {

    /* renamed from: a */
    public static final String[] f9602a;

    /* renamed from: b */
    public static final byte[] f9603b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m5729b(i >> 12) + m5729b(i >> 8) + m5729b(i >> 4) + m5729b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f9602a = strArr;
        byte[] bArr = new byte[93];
        for (int i8 = 0; i8 < 32; i8++) {
            bArr[i8] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f9603b = bArr;
    }

    /* renamed from: a */
    public static final void m5728a(StringBuilder sb, String value) {
        AbstractC5830k.m5330g(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = value.charAt(i8);
            String[] strArr = f9602a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i8);
                sb.append(strArr[cCharAt]);
                i = i8 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    /* renamed from: b */
    public static final char m5729b(int i) {
        int i8 = i & 15;
        return (char) (i8 < 10 ? i8 + 48 : i8 + 87);
    }
}
