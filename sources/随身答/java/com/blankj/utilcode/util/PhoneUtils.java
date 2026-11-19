package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.autofill.HintConstants;

/* loaded from: classes3.dex */
public final class PhoneUtils {
    private PhoneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static void call(@NonNull String str) {
        Utils.getApp().startActivity(UtilsBridge.getCallIntent(str));
    }

    public static void dial(@NonNull String str) {
        Utils.getApp().startActivity(UtilsBridge.getDialIntent(str));
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getDeviceId() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            return "";
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        String deviceId = telephonyManager.getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        if (i9 < 26) {
            return "";
        }
        String imei = telephonyManager.getImei();
        if (!TextUtils.isEmpty(imei)) {
            return imei;
        }
        String meid = telephonyManager.getMeid();
        return TextUtils.isEmpty(meid) ? "" : meid;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getIMEI() {
        return getImeiOrMeid(true);
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getIMSI() {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                getTelephonyManager().getSubscriberId();
            } catch (SecurityException e10) {
                e10.printStackTrace();
                return "";
            }
        }
        return getTelephonyManager().getSubscriberId();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[PHI: r0
      0x00a5: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v5 java.lang.String), (r0v9 java.lang.String), (r0v9 java.lang.String) binds: [B:56:0x00b2, B:58:0x00b8, B:46:0x009c, B:48:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getImeiOrMeid(boolean r8) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            java.lang.String r2 = ""
            if (r0 < r1) goto L9
            return r2
        L9:
            android.telephony.TelephonyManager r1 = getTelephonyManager()
            r3 = 26
            r4 = 1
            r5 = 0
            if (r0 < r3) goto L2f
            if (r8 == 0) goto L22
            java.lang.String r8 = com.blankj.utilcode.util.AbstractC5466w.m2981a(r1, r5)
            java.lang.String r0 = com.blankj.utilcode.util.AbstractC5466w.m2981a(r1, r4)
            java.lang.String r8 = getMinOne(r8, r0)
            return r8
        L22:
            java.lang.String r8 = com.blankj.utilcode.util.AbstractC5467x.m2982a(r1, r5)
            java.lang.String r0 = com.blankj.utilcode.util.AbstractC5467x.m2982a(r1, r4)
            java.lang.String r8 = getMinOne(r8, r0)
            return r8
        L2f:
            if (r8 == 0) goto L34
            java.lang.String r0 = "ril.gsm.imei"
            goto L36
        L34:
            java.lang.String r0 = "ril.cdma.meid"
        L36:
            java.lang.String r0 = getSystemPropertyByReflect(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r6 = 2
            if (r3 != 0) goto L56
            java.lang.String r8 = ","
            java.lang.String[] r8 = r0.split(r8)
            int r0 = r8.length
            if (r0 != r6) goto L53
            r0 = r8[r5]
            r8 = r8[r4]
            java.lang.String r8 = getMinOne(r0, r8)
            return r8
        L53:
            r8 = r8[r5]
            return r8
        L56:
            java.lang.String r0 = r1.getDeviceId()
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r5 = "getDeviceId"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.reflect.Method r3 = r3.getMethod(r5, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            if (r8 == 0) goto L6d
            goto L6e
        L6d:
            r4 = r6
        L6e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object r1 = r3.invoke(r1, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            goto L8f
        L7d:
            r1 = move-exception
            goto L83
        L7f:
            r1 = move-exception
            goto L87
        L81:
            r1 = move-exception
            goto L8b
        L83:
            r1.printStackTrace()
            goto L8e
        L87:
            r1.printStackTrace()
            goto L8e
        L8b:
            r1.printStackTrace()
        L8e:
            r1 = r2
        L8f:
            if (r8 == 0) goto La7
            r8 = 15
            if (r0 == 0) goto L9c
            int r3 = r0.length()
            if (r3 >= r8) goto L9c
            r0 = r2
        L9c:
            if (r1 == 0) goto La5
            int r3 = r1.length()
            if (r3 >= r8) goto La5
            goto Lba
        La5:
            r2 = r1
            goto Lba
        La7:
            r8 = 14
            if (r0 == 0) goto Lb2
            int r3 = r0.length()
            if (r3 != r8) goto Lb2
            r0 = r2
        Lb2:
            if (r1 == 0) goto La5
            int r3 = r1.length()
            if (r3 != r8) goto La5
        Lba:
            java.lang.String r8 = getMinOne(r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.PhoneUtils.getImeiOrMeid(boolean):java.lang.String");
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getMEID() {
        return getImeiOrMeid(false);
    }

    private static String getMinOne(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (zIsEmpty && zIsEmpty2) {
            return "";
        }
        if (zIsEmpty || zIsEmpty2) {
            if (!zIsEmpty) {
                return str;
            }
        } else if (str.compareTo(str2) <= 0) {
            return str;
        }
        return str2;
    }

    public static int getPhoneType() {
        return getTelephonyManager().getPhoneType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        return "";
     */
    @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSerial() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            java.lang.String r0 = com.blankj.utilcode.util.AbstractC5465v.m2980a()     // Catch: java.lang.SecurityException -> Lb
            return r0
        Lb:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = ""
            return r0
        L12:
            r1 = 26
            if (r0 < r1) goto L1b
            java.lang.String r0 = com.blankj.utilcode.util.AbstractC5465v.m2980a()
            return r0
        L1b:
            java.lang.String r0 = android.os.Build.SERIAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.PhoneUtils.getSerial():java.lang.String");
    }

    public static String getSimOperatorByMnc() {
        String simOperator = getTelephonyManager().getSimOperator();
        if (simOperator == null) {
            return "";
        }
        switch (simOperator) {
            case "46000":
            case "46002":
            case "46007":
            case "46020":
                return "中国移动";
            case "46001":
            case "46006":
            case "46009":
                return "中国联通";
            case "46003":
            case "46005":
            case "46011":
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String getSimOperatorName() {
        return getTelephonyManager().getSimOperatorName();
    }

    private static String getSystemPropertyByReflect(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) Utils.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    public static boolean isPhone() {
        return getTelephonyManager().getPhoneType() != 0;
    }

    public static boolean isSimCardReady() {
        return getTelephonyManager().getSimState() == 5;
    }

    public static void sendSms(@NonNull String str, String str2) {
        Utils.getApp().startActivity(UtilsBridge.getSendSmsIntent(str, str2));
    }
}
