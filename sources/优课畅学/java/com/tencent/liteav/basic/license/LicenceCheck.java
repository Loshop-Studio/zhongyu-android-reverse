package com.tencent.liteav.basic.license;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6590c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class LicenceCheck {

    /* renamed from: d */
    private static LicenceCheck f5456d;

    /* renamed from: a */
    private Context f5457a;

    /* renamed from: b */
    private String f5458b = "YTFaceSDK.licence";

    /* renamed from: c */
    private String f5459c = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";

    /* renamed from: e */
    private C6576a f5460e = new C6576a("TXUgcSDK.licence");

    /* renamed from: f */
    private C6576a f5461f = new C6576a("TXLiveSDK.licence");

    /* renamed from: com.tencent.liteav.basic.license.LicenceCheck$a */
    public class C6576a {

        /* renamed from: a */
        String f5464a;

        /* renamed from: b */
        String f5465b;

        /* renamed from: c */
        String f5466c = "";

        /* renamed from: d */
        String f5467d = "";

        /* renamed from: e */
        String f5468e = "";

        /* renamed from: f */
        boolean f5469f = false;

        /* renamed from: g */
        boolean f5470g = false;

        /* renamed from: h */
        int f5471h = -1;

        /* renamed from: i */
        String f5472i = "";

        public C6576a(String str) {
            this.f5464a = str;
            this.f5465b = str + ".tmp";
        }
    }

    private LicenceCheck() {
    }

    /* renamed from: c */
    private int m4966c(C6576a c6576a) throws Throwable {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m4991e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return -10;
        }
        File externalFilesDir = this.f5457a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m4991e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
            return -10;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + c6576a.f5464a;
        if (!m4965b(str)) {
            return -7;
        }
        String strM5035b = C6590c.m5035b(str);
        if (!TextUtils.isEmpty(strM5035b)) {
            return m4977a(c6576a, strM5035b);
        }
        TXCLog.m4991e("LicenceCheck", "checkSdcardLicence, licenceSdcardStr is empty");
        return -8;
    }

    /* renamed from: d */
    private int m4969d(C6576a c6576a) throws IOException {
        if (!m4974e(c6576a)) {
            return -6;
        }
        String strM5034b = C6590c.m5034b(this.f5457a, c6576a.f5464a);
        if (!TextUtils.isEmpty(strM5034b)) {
            return m4977a(c6576a, strM5034b);
        }
        TXCLog.m4991e("LicenceCheck", "checkAssetLicence, licenceSdcardStr is empty");
        return -8;
    }

    /* renamed from: e */
    private boolean m4974e(C6576a c6576a) {
        return C6590c.m5032a(this.f5457a, c6576a.f5464a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m4975f(C6576a c6576a) {
        File externalFilesDir = this.f5457a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m4994i("LicenceCheck", "saveTempLocal sdcardDir is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(externalFilesDir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(c6576a.f5464a);
        File file = new File(sb.toString());
        if (file.exists()) {
            TXCLog.m4994i("LicenceCheck", "delete dst file:" + file.delete());
        }
        File file2 = new File(c6576a.f5466c + str + c6576a.f5465b);
        if (file2.exists()) {
            TXCLog.m4994i("LicenceCheck", "rename file:" + file2.renameTo(file));
        }
        c6576a.f5470g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public String m4976g(C6576a c6576a) {
        return C6590c.m5035b(new File(c6576a.f5466c + File.separator + c6576a.f5465b).getAbsolutePath());
    }

    private native byte[] nativeIvParameterSpec(byte[] bArr);

    /* renamed from: e */
    private int m4972e(C6576a c6576a, String str) {
        String strM4973e = m4973e(str);
        if (TextUtils.isEmpty(strM4973e)) {
            TXCLog.m4991e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
            return -3;
        }
        c6576a.f5472i = strM4973e;
        try {
            JSONObject jSONObject = new JSONObject(strM4973e);
            if (!jSONObject.getString("packagename").equals(m4953a(this.f5457a))) {
                TXCLog.m4991e("LicenceCheck", "packagename not match!");
                m4955a(-4);
                return -4;
            }
            if (m4971d(jSONObject.getString("enddate"))) {
                return -5;
            }
            c6576a.f5471h = 5;
            TXCDRApi.txReportDAU(this.f5457a, C6574a.f5352aI);
            return 0;
        } catch (JSONException e10) {
            e10.printStackTrace();
            TXCLog.m4991e("LicenceCheck", "verifyOldLicence, json format error !");
            m4955a(-1);
            return -1;
        }
    }

    /* renamed from: a */
    public static LicenceCheck m4952a() {
        if (f5456d == null) {
            f5456d = new LicenceCheck();
        }
        return f5456d;
    }

    /* renamed from: b */
    private String m4961b(C6576a c6576a) {
        Context context = this.f5457a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("LicenceCheck.lastModified", 0).getString(c6576a.f5464a + ".lastModified", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4962b(C6576a c6576a, String str) {
        Context context = this.f5457a;
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("LicenceCheck.lastModified", 0).edit();
        editorEdit.putString(c6576a.f5464a + ".lastModified", str);
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public int m4970d(C6576a c6576a, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("appId");
            String string = jSONObject.getString("encryptedLicense");
            String string2 = jSONObject.getString("signature");
            TXCLog.m4994i("LicenceCheck", "appid:" + iOptInt);
            TXCLog.m4994i("LicenceCheck", "encryptedLicense:" + string);
            TXCLog.m4994i("LicenceCheck", "signature:" + string2);
            return m4951a(c6576a, string, string2);
        } catch (JSONException e10) {
            e10.printStackTrace();
            m4955a(-1);
            return -1;
        }
    }

    /* renamed from: a */
    public void m4980a(Context context, String str, String str2) {
        m4956a(this.f5461f, context, str, str2);
    }

    /* renamed from: a */
    private void m4956a(C6576a c6576a, Context context, String str, String str2) {
        if (context != null) {
            this.f5457a = context.getApplicationContext();
            TXCCommonUtil.setAppContext(context);
        }
        c6576a.f5467d = str2;
        c6576a.f5468e = str;
        if (this.f5457a == null || !m4964b()) {
            return;
        }
        File externalFilesDir = this.f5457a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            c6576a.f5466c = externalFilesDir.getAbsolutePath();
        }
        if (!m4965b(c6576a.f5466c + File.separator + c6576a.f5464a)) {
            TXCLog.m4994i("LicenceCheck", "setLicense, sdcard file not exist, to download");
            m4962b(c6576a, "");
        }
        m4981a(c6576a);
    }

    /* renamed from: b */
    private boolean m4964b() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.m4991e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return false;
        }
        if (this.f5457a.getExternalFilesDir(null) != null) {
            return true;
        }
        TXCLog.m4991e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
        return false;
    }

    /* renamed from: c */
    private static long m4967c(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (Exception e10) {
            TXCLog.m4992e("LicenceCheck", "time str to millsecond failed.", e10);
            return -1L;
        }
    }

    /* renamed from: b */
    private boolean m4965b(String str) {
        return C6590c.m5033a(str);
    }

    /* renamed from: c */
    private String m4968c(C6576a c6576a, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (TextUtils.isEmpty(c6576a.f5467d)) {
            TXCLog.m4991e("LicenceCheck", "decodeLicence, mKey is empty!!!");
            return "";
        }
        byte[] bytes = c6576a.f5467d.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nativeIvParameterSpec(bytes));
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(bArrDecode), "UTF-8");
            TXCLog.m4994i("LicenceCheck", "decodeLicence : " + str2);
            return str2;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private boolean m4971d(String str) {
        long jM4967c = m4967c(str);
        if (jM4967c < 0) {
            TXCLog.m4991e("LicenceCheck", "checkEndDate, end date millis < 0!");
            return true;
        }
        if (jM4967c >= System.currentTimeMillis()) {
            return false;
        }
        TXCLog.m4991e("LicenceCheck", "checkEndDate, end date expire!");
        return true;
    }

    /* renamed from: e */
    private String m4973e(String str) {
        try {
            return new String(C6582f.m4988b(Base64.decode(str, 0), Base64.decode("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv", 0)));
        } catch (Exception e10) {
            e10.printStackTrace();
            TXCLog.m4991e("LicenceCheck", "decryptLicenceStr, exception is : " + e10);
            return null;
        }
    }

    /* renamed from: a */
    public void m4981a(final C6576a c6576a) {
        if (TextUtils.isEmpty(c6576a.f5468e)) {
            TXCLog.m4991e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
            return;
        }
        if (c6576a.f5469f) {
            TXCLog.m4994i("LicenceCheck", "downloadLicense, in downloading, ignore");
            return;
        }
        InterfaceC6578b interfaceC6578b = new InterfaceC6578b() { // from class: com.tencent.liteav.basic.license.LicenceCheck.1
            @Override // com.tencent.liteav.basic.license.InterfaceC6578b
            /* renamed from: a */
            public void mo4985a(File file, String str) {
                if (file == null) {
                    TXCLog.m4994i("LicenceCheck", "downloadLicense, license not modified");
                    return;
                }
                LicenceCheck.this.m4962b(c6576a, str);
                TXCLog.m4994i("LicenceCheck", "downloadLicense, onSaveSuccess");
                String strM4976g = LicenceCheck.this.m4976g(c6576a);
                if (TextUtils.isEmpty(strM4976g)) {
                    TXCLog.m4991e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
                    c6576a.f5469f = false;
                } else if (LicenceCheck.this.m4970d(c6576a, strM4976g) == 0) {
                    LicenceCheck.this.m4975f(c6576a);
                }
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC6578b
            /* renamed from: a */
            public void mo4984a(File file, Exception exc) {
                TXCLog.m4994i("LicenceCheck", "downloadLicense, onSaveFailed");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC6578b
            /* renamed from: a */
            public void mo4983a(int i10) {
                TXCLog.m4994i("LicenceCheck", "downloadLicense, onProgressUpdate");
            }

            @Override // com.tencent.liteav.basic.license.InterfaceC6578b
            /* renamed from: a */
            public void mo4982a() {
                TXCLog.m4994i("LicenceCheck", "downloadLicense, onProcessEnd");
                c6576a.f5469f = false;
            }
        };
        Context context = this.f5457a;
        if (context == null) {
            TXCLog.m4991e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
            return;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m4991e("LicenceCheck", "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!");
            return;
        }
        String strM4961b = m4961b(c6576a);
        c6576a.f5466c = externalFilesDir.getAbsolutePath();
        new Thread(new C6579c(this.f5457a, c6576a.f5468e, c6576a.f5466c, c6576a.f5465b, interfaceC6578b, false, strM4961b)).start();
        c6576a.f5469f = true;
    }

    /* renamed from: a */
    public int m4978a(C6581e c6581e, Context context) {
        return m4950a(this.f5461f, c6581e, context);
    }

    /* renamed from: a */
    private int m4950a(C6576a c6576a, C6581e c6581e, Context context) throws Throwable {
        int iM4949a = m4949a(c6576a, context);
        if (iM4949a != 0) {
            m4981a(c6576a);
        }
        if (c6581e != null) {
            c6581e.f5484a = c6576a.f5472i;
        }
        return iM4949a;
    }

    /* renamed from: a */
    private int m4949a(C6576a c6576a, Context context) throws Throwable {
        if (c6576a.f5470g) {
            return 0;
        }
        if (this.f5457a == null) {
            this.f5457a = context;
        }
        if (m4969d(c6576a) == 0) {
            c6576a.f5470g = true;
            return 0;
        }
        int iM4966c = m4966c(c6576a);
        if (iM4966c != 0) {
            return iM4966c;
        }
        c6576a.f5470g = true;
        return 0;
    }

    /* renamed from: a */
    public int m4977a(C6576a c6576a, String str) {
        try {
            new JSONObject(str);
            return m4970d(c6576a, str);
        } catch (JSONException unused) {
            if (c6576a == this.f5461f) {
                return -1;
            }
            return m4972e(c6576a, str);
        }
    }

    /* renamed from: a */
    public PublicKey m4979a(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    /* renamed from: a */
    private int m4951a(C6576a c6576a, String str, String str2) throws Throwable {
        boolean zM4959a;
        try {
            zM4959a = m4959a(Base64.decode(str, 0), Base64.decode(str2, 0), m4979a(this.f5459c));
        } catch (Exception e10) {
            e10.printStackTrace();
            TXCLog.m4991e("LicenceCheck", "verifyLicence, exception is : " + e10);
            zM4959a = false;
        }
        if (!zM4959a) {
            m4955a(-2);
            TXCLog.m4991e("LicenceCheck", "verifyLicence, signature not pass!");
            return -2;
        }
        String strM4968c = m4968c(c6576a, str);
        if (TextUtils.isEmpty(strM4968c)) {
            m4955a(-3);
            TXCLog.m4991e("LicenceCheck", "verifyLicence, decodeValue is empty!");
            return -3;
        }
        c6576a.f5472i = strM4968c;
        try {
            JSONObject jSONObject = new JSONObject(strM4968c);
            String string = jSONObject.getString("pituLicense");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("appData");
            if (jSONArrayOptJSONArray == null) {
                TXCLog.m4991e("LicenceCheck", "verifyLicence, appDataArray is null!");
                m4955a(-1);
                return -1;
            }
            int i10 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean zM4958a = false;
            while (true) {
                if (i10 >= jSONArrayOptJSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                String strOptString = jSONObject2.optString("packageName");
                TXCLog.m4994i("LicenceCheck", "verifyLicence, packageName:" + strOptString);
                if (!strOptString.equals(this.f5457a.getPackageName())) {
                    TXCLog.m4991e("LicenceCheck", "verifyLicence, packageName not match!");
                } else if (!m4971d(jSONObject2.optString("endDate"))) {
                    zM4958a = m4958a(c6576a, jSONObject2, string);
                    if (zM4958a) {
                        z10 = true;
                        z11 = true;
                        zM4958a = true;
                        break;
                    }
                    z10 = true;
                    z11 = true;
                } else {
                    z10 = true;
                }
                i10++;
            }
            if (!z10) {
                m4955a(-4);
                return -4;
            }
            if (!z11) {
                m4955a(-5);
                return -5;
            }
            if (!zM4958a) {
                m4955a(-11);
                return -11;
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    byte[] bArrDecode = Base64.decode(string, 0);
                    File externalFilesDir = this.f5457a.getExternalFilesDir(null);
                    if (externalFilesDir == null) {
                        return -10;
                    }
                    File file = new File(externalFilesDir.getAbsolutePath() + File.separator + this.f5458b);
                    C6590c.m5029a(file.getAbsolutePath(), bArrDecode);
                    TXCCommonUtil.setPituLicencePath(file.getAbsolutePath());
                } catch (Exception e11) {
                    TXCLog.m4991e("LicenceCheck", "decode pitu license error:" + e11);
                }
            }
            TXCDRApi.txReportDAU(this.f5457a, C6574a.f5352aI);
            return 0;
        } catch (JSONException e12) {
            e12.printStackTrace();
            TXCLog.m4991e("LicenceCheck", "verifyLicence, json format error ! exception = " + e12);
            m4955a(-1);
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m4958a(C6576a c6576a, JSONObject jSONObject, String str) {
        int iOptInt = jSONObject.optInt("feature");
        boolean z10 = true;
        if (c6576a == this.f5461f) {
            int i10 = (iOptInt >> 4) & 15;
            if (i10 >= 1) {
                c6576a.f5471h = i10;
            } else {
                z10 = false;
            }
            TXCLog.m4994i("LicenceCheck", "live parseVersionType, mLicenceVersionType = " + c6576a.f5471h);
            return z10;
        }
        if (c6576a != this.f5460e) {
            return false;
        }
        int i11 = iOptInt & 15;
        if (i11 > 1) {
            c6576a.f5471h = i11;
        } else if (i11 != 1 && iOptInt != 0) {
            z10 = false;
        } else if (!TextUtils.isEmpty(str)) {
            c6576a.f5471h = 5;
        } else {
            c6576a.f5471h = 3;
        }
        TXCLog.m4994i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + c6576a.f5471h);
        return z10;
    }

    /* renamed from: a */
    private void m4955a(int i10) {
        TXCDRApi.txReportDAU(this.f5457a, C6574a.f5353aJ, i10, "");
    }

    /* renamed from: a */
    private static String m4953a(Context context) {
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m4959a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
