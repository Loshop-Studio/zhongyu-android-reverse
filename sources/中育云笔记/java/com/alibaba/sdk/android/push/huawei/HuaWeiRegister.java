package com.alibaba.sdk.android.push.huawei;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.alibaba.sdk.android.push.impl.HuaweiMsgParseImpl;
import com.alibaba.sdk.android.push.register.ThirdPushManager;
import com.alibaba.sdk.android.push.utils.SysUtils;
import com.alibaba.sdk.android.push.utils.ThreadUtil;
import com.huawei.hms.common.ApiException;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.p087a.p088a.C7707c;
import org.android.agoo.common.AgooConstants;
import p417y4.C11911a;

/* loaded from: classes3.dex */
public class HuaWeiRegister {
    private static final String TAG = "MPS:HuaWeiRegister";
    public static boolean isChannelRegister = false;

    private static boolean checkDevice() {
        boolean zEqualsIgnoreCase = Build.BRAND.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI);
        if (zEqualsIgnoreCase) {
            return zEqualsIgnoreCase;
        }
        return (TextUtils.isEmpty(getProp("ro.build.version.emui")) && TextUtils.isEmpty(getProp("hw_sc.build.platform.version"))) ? false : true;
    }

    private static String getProp(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getToken(final Context context) {
        ThreadUtil.getExecutor().execute(new Runnable() { // from class: com.alibaba.sdk.android.push.huawei.HuaWeiRegister.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.huawei.hms.client.appid");
                    String strReplace = !TextUtils.isEmpty(string) ? string.replace("appid=", "") : "";
                    String strM26444g = TextUtils.isEmpty(strReplace) ? C11911a.m26438f(context).m26444g() : C11911a.m26438f(context).m26445h(strReplace, "HCM");
                    ALog.m10119i(HuaWeiRegister.TAG, "onToken", "appId", strReplace, "token", strM26444g);
                    if (TextUtils.isEmpty(strM26444g)) {
                        return;
                    }
                    try {
                        ThirdPushManager.reportToken(context, ThirdPushManager.ThirdPushReportKeyword.HUAWEI.thirdTokenKeyword, strM26444g, BuildConfig.HW_VERSION);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (Throwable th) {
                    if (th instanceof ApiException) {
                        ALog.m10117e(HuaWeiRegister.TAG, "getToken failed. " + th.getStatusCode(), th, new Object[0]);
                    } else {
                        ALog.m10117e(HuaWeiRegister.TAG, "getToken failed. " + th.getMessage(), th, new Object[0]);
                    }
                    try {
                        ThirdPushManager.reportToken(context, ThirdPushManager.ThirdPushReportKeyword.HUAWEI.thirdTokenKeyword, "", BuildConfig.HW_VERSION);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        });
    }

    public static boolean register(Application application) {
        return registerBundle(application, false);
    }

    public static boolean registerBundle(final Application application, boolean z10) {
        try {
            isChannelRegister = z10;
        } catch (Throwable th) {
            ALog.m10117e(TAG, C7707c.JSON_CMD_REGISTER, th, new Object[0]);
        }
        if (!z10 && !SysUtils.isTargetProcess(application)) {
            ALog.m10118e(TAG, "register not in target process, return", new Object[0]);
            return false;
        }
        if (!checkDevice()) {
            ALog.m10119i(TAG, "register checkDevice false", new Object[0]);
            return false;
        }
        ThirdPushManager.registerImpl(new HuaweiMsgParseImpl());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alibaba.sdk.android.push.huawei.HuaWeiRegister.1
            @Override // java.lang.Runnable
            public void run() {
                ALog.m10119i(HuaWeiRegister.TAG, "register begin isChannel:" + HuaWeiRegister.isChannelRegister, new Object[0]);
                HuaWeiRegister.getToken(application.getApplicationContext());
            }
        }, CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        return true;
    }
}
