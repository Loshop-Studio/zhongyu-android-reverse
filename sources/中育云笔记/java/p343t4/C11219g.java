package p343t4;

import android.text.TextUtils;
import android.util.Log;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import p332s4.InterfaceC11060d;

/* renamed from: t4.g */
/* loaded from: classes5.dex */
public class C11219g implements InterfaceC11060d {

    /* renamed from: a */
    public SecretKey f26923a;

    /* renamed from: b */
    public final C11217e f26924b;

    /* renamed from: c */
    public boolean f26925c = false;

    public C11219g(C11217e c11217e) {
        this.f26924b = c11217e;
    }

    /* renamed from: b */
    private void m24961b() {
        try {
            this.f26923a = AbstractC11223k.m24968a(this.f26924b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e10.getMessage());
            this.f26923a = null;
        }
        this.f26925c = true;
    }

    @Override // p332s4.InterfaceC11060d
    /* renamed from: a */
    public String mo24515a(String str, String str2) {
        StringBuilder sb2;
        if (!this.f26925c) {
            m24961b();
        }
        if (this.f26923a == null || TextUtils.isEmpty(str)) {
            sb2 = new StringBuilder();
            sb2.append("decrypt exception: secretKey = ");
            sb2.append(this.f26923a);
            sb2.append("raw = ");
        } else {
            try {
                return new String(AbstractC11223k.m24969b(this.f26923a, AbstractC11213a.m24932b(str)), Request.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e10) {
                sb2 = new StringBuilder();
                sb2.append("decrypt exception:");
                str = e10.getMessage();
            }
        }
        sb2.append(str);
        Log.e("AGC_LocalResource", sb2.toString());
        return str2;
    }
}
