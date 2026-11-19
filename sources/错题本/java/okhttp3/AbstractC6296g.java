package okhttp3;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.AbstractC5830k;
import okio.ByteString;

/* renamed from: okhttp3.g */
/* loaded from: classes4.dex */
public abstract class AbstractC6296g {
    /* renamed from: a */
    public static String m5893a(X509Certificate certificate) {
        AbstractC5830k.m5330g(certificate, "certificate");
        StringBuilder sb = new StringBuilder("sha256/");
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        AbstractC5830k.m5329f(encoded, "publicKey.encoded");
        sb.append(ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256().base64());
        return sb.toString();
    }
}
