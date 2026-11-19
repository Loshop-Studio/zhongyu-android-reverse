package p094g0;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p127j0.AbstractC7774e;
import p127j0.AbstractC7775f;
import p127j0.AbstractC7776g;

/* renamed from: g0.a */
/* loaded from: classes3.dex */
public class C7507a {

    /* renamed from: a */
    public boolean f12365a;

    /* renamed from: b */
    public String f12366b;

    /* renamed from: c */
    public String f12367c;

    /* renamed from: d */
    public byte[] f12368d = null;

    public C7507a(String str, String str2, boolean z9) {
        this.f12366b = str;
        this.f12367c = str2;
        this.f12365a = z9;
    }

    /* renamed from: a */
    public static String m12212a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return AbstractC7775f.m13124c(mac.doFinal(bArr2));
    }

    /* renamed from: b */
    public final byte[] m12213b() {
        if (this.f12368d == null) {
            this.f12368d = AbstractC7776g.m13127c(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.f12368d;
    }

    /* renamed from: c */
    public String m12214c(String str) {
        String str2;
        if (this.f12366b == null || (str2 = this.f12367c) == null) {
            AbstractC7774e.m13119b("There is no appkey,please check it!");
            return null;
        }
        if (str == null) {
            return null;
        }
        try {
            return this.f12365a ? m12212a(str2.getBytes(), str.getBytes()) : m12212a(m12213b(), str.getBytes());
        } catch (Exception unused) {
            return "";
        }
    }
}
