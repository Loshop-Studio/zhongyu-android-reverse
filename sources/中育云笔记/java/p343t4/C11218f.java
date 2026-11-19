package p343t4;

import android.text.TextUtils;
import android.util.Log;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;
import p332s4.InterfaceC11059c;
import p332s4.InterfaceC11060d;

/* renamed from: t4.f */
/* loaded from: classes5.dex */
public class C11218f implements InterfaceC11060d {

    /* renamed from: a */
    public final InterfaceC11059c f26920a;

    /* renamed from: b */
    public SecretKey f26921b;

    /* renamed from: c */
    public boolean f26922c = false;

    public C11218f(InterfaceC11059c interfaceC11059c) {
        this.f26920a = interfaceC11059c;
    }

    /* renamed from: c */
    public static boolean m24958c(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    @Override // p332s4.InterfaceC11060d
    /* renamed from: a */
    public String mo24515a(String str, String str2) {
        String str3;
        if (!this.f26922c) {
            m24959b();
        }
        if (this.f26921b == null) {
            str3 = "mKey is null, return default value";
        } else {
            if (!m24958c(str)) {
                return str2;
            }
            try {
                return new String(AbstractC11223k.m24969b(this.f26921b, AbstractC11213a.m24932b(m24960d(str))), Request.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("AGC_Mark", str3);
        return str2;
    }

    /* renamed from: b */
    public final void m24959b() {
        try {
            this.f26921b = AbstractC11223k.m24968a(new C11217e(this.f26920a.getString("/code/code1", null), this.f26920a.getString("/code/code2", null), this.f26920a.getString("/code/code3", null), this.f26920a.getString("/code/code4", null), "PBKDF2WithHmacSHA1", 10000));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
            this.f26921b = null;
        }
        this.f26922c = true;
    }

    /* renamed from: d */
    public final String m24960d(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }
}
