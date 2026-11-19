package com.alibaba.sdk.android.tbrest.p065a;

import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import com.alibaba.sdk.android.tbrest.utils.MD5Utils;
import com.alibaba.sdk.android.tbrest.utils.RC4;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alibaba.sdk.android.tbrest.a.a */
/* loaded from: classes3.dex */
public class C5699a {

    /* renamed from: a */
    private byte[] f4470a = null;

    /* renamed from: d */
    private boolean f4471d;

    /* renamed from: h */
    private String f4472h;

    /* renamed from: i */
    private String f4473i;

    public C5699a(String str, String str2, boolean z10) {
        this.f4472h = str;
        this.f4473i = str2;
        this.f4471d = z10;
    }

    /* renamed from: a */
    public static String m3850a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return MD5Utils.toHexString(mac.doFinal(bArr2));
    }

    /* renamed from: b */
    public String m3852b(String str) {
        String str2;
        if (this.f4472h == null || (str2 = this.f4473i) == null) {
            LogUtil.m3870e("There is no appkey,please check it!");
            return null;
        }
        if (str == null) {
            return null;
        }
        try {
            return this.f4471d ? m3850a(str2.getBytes(), str.getBytes()) : m3850a(m3851a(), str.getBytes());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private byte[] m3851a() {
        if (this.f4470a == null) {
            this.f4470a = RC4.rc4(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.f4470a;
    }
}
