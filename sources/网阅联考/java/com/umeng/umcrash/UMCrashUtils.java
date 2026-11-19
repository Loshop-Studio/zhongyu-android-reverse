package com.umeng.umcrash;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.p040uc.crashsdk.export.CrashApi;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class UMCrashUtils {
    public static final String UNKNOW = "";

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String[] getActiveUser(Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<UMUtils> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = UMUtils.class;
            String str = UMUtils.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getActiveUser", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return (String[]) objInvoke;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void setPuidAndProvider(String str, String str2) {
        if (CrashApi.getInstance() != null) {
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PUID, str);
            CrashApi.getInstance().addHeaderInfo(UMCrash.KEY_HEADER_PROVIDER, str2);
        }
    }

    public static String splitByByte(String str, int i4) {
        StringBuffer stringBuffer = new StringBuffer(i4);
        try {
            int length = str.length();
            int length2 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                String strValueOf = String.valueOf(str.charAt(i5));
                length2 += strValueOf.getBytes().length;
                if (i4 < length2) {
                    break;
                }
                stringBuffer.append(strValueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }
}
