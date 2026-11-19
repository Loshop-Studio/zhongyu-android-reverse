package com.huawei.hms.framework.common;

import com.huawei.android.os.BuildEx;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes5.dex */
public class EmuiUtil {
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";

    /* renamed from: a */
    public static int f11630a = -1;

    /* renamed from: b */
    public static boolean f11631b = false;

    static {
        m8555a();
        m8556b();
    }

    /* renamed from: a */
    public static void m8555a() throws NoSuchFieldException {
        int eMUIVersionCode = getEMUIVersionCode();
        Logger.m8571d("KPMS_Util_Emui", "getEmuiType emuiVersionCode=" + eMUIVersionCode);
        if (eMUIVersionCode >= 17) {
            f11630a = 90;
        } else if (eMUIVersionCode >= 15) {
            f11630a = 81;
        } else if (eMUIVersionCode >= 14) {
            f11630a = 60;
        } else if (eMUIVersionCode >= 11) {
            f11630a = 50;
        } else if (eMUIVersionCode >= 10) {
            f11630a = 41;
        } else if (eMUIVersionCode >= 9) {
            f11630a = 40;
        } else if (eMUIVersionCode >= 8) {
            f11630a = 31;
        } else if (eMUIVersionCode >= 7) {
            f11630a = 30;
        }
        if (f11630a == -1) {
            Logger.m8580i("KPMS_Util_Emui", "emuiType is unkown");
        }
    }

    /* renamed from: b */
    public static void m8556b() throws ClassNotFoundException {
        String property = SystemPropUtils.getProperty("get", "ro.product.manufacturer", "android.os.SystemProperties", "");
        if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(property)) {
            f11631b = true;
        }
        Logger.m8580i("KPMS_Util_Emui", "Get Manufacturer: " + property + ", isHuaweiDevice : " + f11631b);
    }

    public static int getEMUIVersionCode() throws NoSuchFieldException {
        int iIntValue;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                iIntValue = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e10) {
                Logger.m8574e("KPMS_Util_Emui", "getEMUIVersionCode ClassCastException:", e10);
            }
        } else {
            iIntValue = 0;
        }
        Logger.m8571d("KPMS_Util_Emui", "the emui version code is::" + iIntValue);
        return iIntValue;
    }

    public static boolean isEMUI() {
        return -1 != f11630a;
    }

    public static boolean isHuaweiDevice() {
        return f11631b;
    }

    public static boolean isUpPVersion() {
        try {
            if (ReflectionUtils.checkCompatible("com.huawei.android.os.BuildEx") && ReflectionUtils.checkCompatible(BUILDEX_VERSION)) {
                return BuildEx.VERSION.EMUI_SDK_INT >= 17;
            }
        } catch (NoSuchMethodError unused) {
            Logger.m8571d("KPMS_Util_Emui", "no such method for com.huawei.android.os.BuildEx.VERSION");
        } catch (Throwable unused2) {
            Logger.m8571d("KPMS_Util_Emui", "com.huawei.android.os.BuildEx.VERSION has other exception");
        }
        Logger.m8571d("KPMS_Util_Emui", "com.huawei.android.os.BuildEx : false");
        return false;
    }
}
