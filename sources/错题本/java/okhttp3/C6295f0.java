package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.f0 */
/* loaded from: classes4.dex */
public final class C6295f0 {
    /* renamed from: a */
    public static C6293e0 m5890a(String str, C6333u c6333u) {
        AbstractC5830k.m5330g(str, "<this>");
        Charset charset = AbstractC5840a.f9235a;
        if (c6333u != null) {
            Pattern pattern = C6333u.f10275d;
            Charset charsetM5975a = c6333u.m5975a(null);
            if (charsetM5975a == null) {
                c6333u = AbstractC6326o.m5958h(c6333u + "; charset=utf-8");
            } else {
                charset = charsetM5975a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC5830k.m5329f(bytes, "this as java.lang.String).getBytes(charset)");
        return m5891b(c6333u, bytes, 0, bytes.length);
    }

    /* renamed from: b */
    public static C6293e0 m5891b(C6333u c6333u, byte[] bArr, int i, int i8) {
        AbstractC5830k.m5330g(bArr, "<this>");
        long length = bArr.length;
        long j7 = i;
        long j8 = i8;
        byte[] bArr2 = AbstractC6396c.f10486a;
        if ((j7 | j8) < 0 || j7 > length || length - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new C6293e0(c6333u, bArr, i8, i);
    }

    /* renamed from: c */
    public static /* synthetic */ C6293e0 m5892c(C6295f0 c6295f0, byte[] bArr, C6333u c6333u, int i, int i8) {
        if ((i8 & 1) != 0) {
            c6333u = null;
        }
        if ((i8 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        c6295f0.getClass();
        return m5891b(c6333u, bArr, i, length);
    }
}
