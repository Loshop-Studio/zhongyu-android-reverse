package p318r5;

import android.util.Pair;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import p007a6.AbstractC0064d;
import p402x5.AbstractC11796a;
import p402x5.AbstractC11797b;

/* renamed from: r5.p0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10888p0 {

    /* renamed from: a */
    public static final Charset f26270a = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    public static Pair m23585a(String str, int i10) {
        if (str == null || str.length() < i10) {
            return new Pair(new byte[0], str);
        }
        String strSubstring = str.substring(0, i10);
        return new Pair(AbstractC0064d.m128b(strSubstring), str.substring(i10));
    }

    /* renamed from: b */
    public static String m23586b(String str, String str2) {
        Pair pairM23585a = m23585a(str, 32);
        return new String(AbstractC11796a.m26035i(AbstractC0064d.m128b((String) pairM23585a.second), AbstractC0064d.m128b(str2), (byte[]) pairM23585a.first), f26270a);
    }

    /* renamed from: c */
    public static String m23587c(byte[] bArr, String str) throws UnsupportedEncodingException {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] bArrM128b = AbstractC0064d.m128b(str);
            if (bArrM128b.length >= 16) {
                return AbstractC0064d.m127a(AbstractC11797b.m26041b(bArr, bArrM128b));
            }
            str2 = "key length is not right";
        }
        AbstractC10861f1.m23433e("AesCipher", str2);
        return "";
    }

    /* renamed from: d */
    public static String m23588d(String str, String str2) {
        return AbstractC0064d.m127a(AbstractC11796a.m26038l(str.getBytes(f26270a), AbstractC0064d.m128b(str2)));
    }
}
