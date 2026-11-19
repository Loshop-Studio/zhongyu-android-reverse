package p318r5;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import androidx.autofill.HintConstants;
import com.huawei.hms.hatool.AbstractC7317o;
import java.lang.reflect.InvocationTargetException;

/* renamed from: r5.h1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10867h1 extends AbstractC7317o {
    /* renamed from: k */
    public static String m23470k() {
        String str;
        String str2 = "";
        try {
            String str3 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", null).invoke(null, null);
            try {
                AbstractC10861f1.m23436h("hmsSdk", "getUDID success");
                return str3;
            } catch (AndroidRuntimeException unused) {
                str2 = str3;
                str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            } catch (ClassNotFoundException unused2) {
                str2 = str3;
                str = "getUDID method invoke failed";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            } catch (IllegalAccessException unused3) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal AccessException";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            } catch (IllegalArgumentException unused4) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal ArgumentException";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            } catch (NoSuchMethodException unused5) {
                str2 = str3;
                str = "getUDID method invoke failed : NoSuchMethodException";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            } catch (InvocationTargetException unused6) {
                str2 = str3;
                str = "getUDID method invoke failed : InvocationTargetException";
                AbstractC10861f1.m23441m("hmsSdk", str);
                return str2;
            }
        } catch (AndroidRuntimeException unused7) {
        } catch (ClassNotFoundException unused8) {
        } catch (IllegalAccessException unused9) {
        } catch (IllegalArgumentException unused10) {
        } catch (NoSuchMethodException unused11) {
        } catch (InvocationTargetException unused12) {
        }
    }

    /* renamed from: l */
    public static Pair m23471l(Context context) {
        if (AbstractC10865h.m23461b(context, "android.permission.READ_PHONE_STATE")) {
            AbstractC10861f1.m23441m("hmsSdk", "getMccAndMnc() Pair value is empty");
            return new Pair("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return new Pair("", "");
        }
        if (telephonyManager.getSimState() != 5) {
            return new Pair("", "");
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, "null")) ? new Pair("", "") : networkOperator.length() > 3 ? new Pair(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair("", "");
    }
}
