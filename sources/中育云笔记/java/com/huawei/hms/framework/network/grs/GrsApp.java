package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import p173h5.C9492a;

/* loaded from: classes5.dex */
public class GrsApp {
    private static final String BRAND;
    private static final GrsApp INSTANCE = new GrsApp();
    private static final String TAG = "GrsApp";
    private String appConfigName;

    static {
        String str;
        String name = GrsApp.class.getPackage().getName();
        if ("com.huawei.hms.framework.network.grs".equals(name)) {
            str = "";
        } else {
            String[] strArrSplit = name.split("\\.");
            Logger.m8586v(TAG, "current brand is: " + strArrSplit[1]);
            str = strArrSplit[1];
        }
        BRAND = str;
    }

    private GrsApp() {
    }

    public static GrsApp getInstance() {
        return INSTANCE;
    }

    public String getAppConfigName() {
        return this.appConfigName;
    }

    public String getBrand(String str) {
        String str2 = BRAND;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str2 + str;
    }

    public String getIssueCountryCode(Context context) {
        return C9492a.m18657a(context, false).getCountryCode();
    }

    public void setAppConfigName(String str) {
        this.appConfigName = str;
    }
}
