package anet.channel.security;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anet.channel.security.b */
/* loaded from: classes3.dex */
class C5037b implements ISecurity {

    /* renamed from: a */
    private static String f2543a = "awcn.DefaultSecurityGuard";

    /* renamed from: b */
    private static boolean f2544b = false;

    /* renamed from: c */
    private static Map<String, Integer> f2545c;

    /* renamed from: d */
    private String f2546d;

    static {
        try {
            Class.forName("com.alibaba.wireless.security.open.SecurityGuardManager");
            f2544b = true;
            HashMap map = new HashMap();
            f2545c = map;
            map.put(ISecurity.SIGN_ALGORITHM_HMAC_SHA1, 3);
            f2545c.put(ISecurity.CIPHER_ALGORITHM_AES128, 16);
        } catch (Throwable unused) {
            f2544b = false;
        }
    }

    public C5037b(String str) {
        this.f2546d = str;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        if (!f2544b || context == null || bArr == null || TextUtils.isEmpty(str2) || !f2545c.containsKey(str) || (num = f2545c.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null && (staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.f2546d);
            }
        } catch (Throwable th) {
            ALog.m2528e(f2543a, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
                if (securityGuardManager != null && (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) != null) {
                    return dynamicDataStoreComp.getByteArray(str);
                }
            } catch (Throwable th) {
                ALog.m2528e(f2543a, "getBytes", null, th, new Object[0]);
            }
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        if (context != null && bArr != null && !TextUtils.isEmpty(str)) {
            try {
                SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
                if (securityGuardManager != null && (dynamicDataStoreComp = securityGuardManager.getDynamicDataStoreComp()) != null) {
                    return dynamicDataStoreComp.putByteArray(str, bArr) != 0;
                }
            } catch (Throwable th) {
                ALog.m2528e(f2543a, "saveBytes", null, th, new Object[0]);
            }
        }
        return false;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        if (f2544b && context != null && !TextUtils.isEmpty(str2) && f2545c.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = f2545c.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.f2546d);
                }
            } catch (Throwable th) {
                ALog.m2528e(f2543a, "Securityguard sign request failed.", null, th, new Object[0]);
            }
        }
        return null;
    }
}
