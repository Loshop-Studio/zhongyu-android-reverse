package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import okio.Buffer;
import okio.BufferedSource;

/* renamed from: okhttp3.l0 */
/* loaded from: classes4.dex */
public final class C6321l0 {
    /* renamed from: a */
    public static C6319k0 m5947a(String str, C6333u c6333u) {
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
        Buffer bufferWriteString = new Buffer().writeString(str, charset);
        return m5948b(c6333u, bufferWriteString.size(), bufferWriteString);
    }

    /* renamed from: b */
    public static C6319k0 m5948b(C6333u c6333u, long j7, BufferedSource bufferedSource) {
        AbstractC5830k.m5330g(bufferedSource, "<this>");
        return new C6319k0(c6333u, j7, bufferedSource);
    }

    /* renamed from: c */
    public static C6319k0 m5949c(byte[] bArr, C6333u c6333u) {
        AbstractC5830k.m5330g(bArr, "<this>");
        return m5948b(c6333u, bArr.length, new Buffer().write(bArr));
    }
}
