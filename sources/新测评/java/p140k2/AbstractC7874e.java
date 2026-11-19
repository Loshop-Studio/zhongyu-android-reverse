package p140k2;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import java.util.Random;
import p096g2.AbstractC7514d;

/* renamed from: k2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7874e {
    /* renamed from: a */
    public static String m13402a(Context context) throws ClassNotFoundException {
        TelephonyManager telephonyManager;
        String strM13403b = null;
        if (!AbstractC7872c.m13400a() && context != null) {
            try {
                if (AbstractC7514d.m12228c(context) && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null) {
                    strM13403b = telephonyManager.getDeviceId();
                }
            } catch (Exception unused) {
            }
        }
        if (AbstractC7875f.m13409c(strM13403b)) {
            strM13403b = m13405d();
        }
        if (AbstractC7875f.m13409c(strM13403b)) {
            strM13403b = m13403b(context);
        }
        return AbstractC7875f.m13409c(strM13403b) ? m13404c() : strM13403b;
    }

    /* renamed from: b */
    public static String m13403b(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            try {
                return (TextUtils.isEmpty(string) || string.equalsIgnoreCase("a5f5faddde9e9f02") || string.equalsIgnoreCase("8e17f7422b35fbea") || string.equalsIgnoreCase("ece1e988e8bf71f2") || string.equalsIgnoreCase("9e3ecdf2be3b9a69")) ? "" : string.equalsIgnoreCase("0000000000000000") ? "" : string;
            } catch (Throwable unused) {
                return string;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m13404c() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrM13401a = AbstractC7873d.m13401a(iCurrentTimeMillis);
        byte[] bArrM13401a2 = AbstractC7873d.m13401a(iNanoTime);
        byte[] bArrM13401a3 = AbstractC7873d.m13401a(iNextInt);
        byte[] bArrM13401a4 = AbstractC7873d.m13401a(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrM13401a, 0, bArr, 0, 4);
        System.arraycopy(bArrM13401a2, 0, bArr, 4, 4);
        System.arraycopy(bArrM13401a3, 0, bArr, 8, 4);
        System.arraycopy(bArrM13401a4, 0, bArr, 12, 4);
        return AbstractC7871b.m13397f(bArr, 2);
    }

    /* renamed from: d */
    public static String m13405d() throws ClassNotFoundException {
        String strM13412a = AbstractC7876g.m13412a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(strM13412a)) {
            strM13412a = AbstractC7876g.m13412a("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(strM13412a) ? m13406e() : strM13412a;
    }

    /* renamed from: e */
    public static String m13406e() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", null).invoke(null, null);
        } catch (Exception unused) {
            return "";
        }
    }
}
