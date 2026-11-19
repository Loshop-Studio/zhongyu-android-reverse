package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.utils.C6865v;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class TbsExtensionFunctionManager {
    public static final String BUGLY_SWITCH_FILE_NAME = "bugly_switch.txt";
    public static final String COOKIE_SWITCH_FILE_NAME = "cookie_switch.txt";
    public static final String SP_KEY_COOKIE_DB_VERSION = "cookie_db_version";
    public static final String SP_NAME_FOR_COOKIE = "cookie_compatiable";
    public static final int SWITCH_BYTE_COOKIE = 1;
    public static final String USEX5_FILE_NAME = "usex5.txt";

    /* renamed from: b */
    private static TbsExtensionFunctionManager f6639b;

    /* renamed from: a */
    private boolean f6640a;

    private TbsExtensionFunctionManager() {
    }

    public static TbsExtensionFunctionManager getInstance() {
        if (f6639b == null) {
            synchronized (TbsExtensionFunctionManager.class) {
                try {
                    if (f6639b == null) {
                        f6639b = new TbsExtensionFunctionManager();
                    }
                } finally {
                }
            }
        }
        return f6639b;
    }

    public synchronized boolean canUseFunction(Context context, String str) {
        File file = new File(context.getFilesDir(), str);
        if (file.exists()) {
            if (file.isFile()) {
                return true;
            }
        }
        return false;
    }

    public synchronized int getRomCookieDBVersion(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SP_NAME_FOR_COOKIE, 4);
        if (sharedPreferences == null) {
            return -1;
        }
        return sharedPreferences.getInt(SP_KEY_COOKIE_DB_VERSION, -1);
    }

    public synchronized void initTbsBuglyIfNeed(Context context) {
        String absolutePath;
        if (this.f6640a) {
            return;
        }
        if (!canUseFunction(context, BUGLY_SWITCH_FILE_NAME)) {
            TbsLog.m6248i("TbsExtensionFunMana", "bugly is forbiden!!");
            return;
        }
        if (!TbsShareManager.isThirdPartyApp(context)) {
            File fileM6121n = C6785ak.m6068a().m6121n(context);
            if (fileM6121n == null) {
                TbsLog.m6248i("TbsExtensionFunMana", "getTbsCoreShareDir is null");
            }
            if (fileM6121n.listFiles() != null && fileM6121n.listFiles().length > 0) {
                absolutePath = fileM6121n.getAbsolutePath();
            }
            TbsLog.m6248i("TbsExtensionFunMana", "getTbsCoreShareDir is empty!");
            return;
        }
        absolutePath = TbsShareManager.m5930c(context);
        if (TextUtils.isEmpty(absolutePath)) {
            TbsLog.m6248i("TbsExtensionFunMana", "bugly init ,corePath is null");
            return;
        }
        File fileM6121n2 = C6785ak.m6068a().m6121n(context);
        if (fileM6121n2 == null) {
            TbsLog.m6248i("TbsExtensionFunMana", "bugly init ,optDir is null");
            return;
        }
        File file = new File(absolutePath, "tbs_bugly_dex.jar");
        try {
            C6865v.m6373a(new DexClassLoader(file.getAbsolutePath(), fileM6121n2.getAbsolutePath(), file.getAbsolutePath(), QbSdk.class.getClassLoader()).loadClass("com.tencent.smtt.tbs.bugly.TBSBuglyManager"), "initBugly", (Class<?>[]) new Class[]{Context.class, String.class, String.class, String.class}, context, absolutePath, String.valueOf(WebView.getTbsSDKVersion(context)), String.valueOf(WebView.getTbsCoreVersion(context)));
            this.f6640a = true;
            TbsLog.m6248i("TbsExtensionFunMana", "initTbsBuglyIfNeed success!");
        } catch (Throwable th) {
            TbsLog.m6248i("TbsExtensionFunMana", "bugly init ,try init bugly failed(need new core):" + Log.getStackTraceString(th));
        }
    }

    public synchronized boolean setFunctionEnable(Context context, String str, boolean z10) {
        if (context == null) {
            return false;
        }
        File file = new File(context.getFilesDir(), str);
        if (z10) {
            if (!file.exists()) {
                try {
                    if (file.createNewFile()) {
                        return true;
                    }
                } catch (IOException e10) {
                    TbsLog.m6246e("TbsExtensionFunMana", "setFunctionEnable,createNewFile fail:" + str);
                    e10.printStackTrace();
                    return false;
                }
            }
        } else if (file.exists()) {
            if (file.delete()) {
                return true;
            }
            TbsLog.m6246e("TbsExtensionFunMana", "setFunctionEnable,file.delete fail:" + str);
            return false;
        }
        return true;
    }
}
