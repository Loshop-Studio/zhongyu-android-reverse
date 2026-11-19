package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.TbsLog;
import java.util.Map;

/* renamed from: com.tencent.smtt.sdk.bd */
/* loaded from: classes4.dex */
class C6805bd {

    /* renamed from: a */
    private Context f6853a;

    /* renamed from: b */
    private Context f6854b;

    /* renamed from: c */
    private String f6855c;

    /* renamed from: d */
    private String[] f6856d;

    /* renamed from: e */
    private DexLoader f6857e;

    /* renamed from: f */
    private String f6858f;

    /* renamed from: g */
    private String f6859g = null;

    public C6805bd(Context context, Context context2, String str, String str2, String[] strArr, String str3, C6784aj c6784aj) throws Exception {
        this.f6853a = null;
        this.f6854b = null;
        this.f6855c = null;
        this.f6856d = null;
        this.f6857e = null;
        this.f6858f = "TbsDexOpt";
        TbsLog.m6248i("TbsWizard", "construction start...");
        if (context == null || ((context2 == null && TbsShareManager.getHostCorePathAppDefined() == null) || TextUtils.isEmpty(str) || strArr == null || strArr.length == 0)) {
            throw new Exception("TbsWizard paramter error:-1callerContext:" + context + "hostcontext" + context2 + "isEmpty" + TextUtils.isEmpty(str) + "dexfileList" + strArr);
        }
        this.f6853a = context.getApplicationContext();
        this.f6854b = context2;
        this.f6855c = str;
        this.f6856d = strArr;
        this.f6858f = str2;
        if (c6784aj != null) {
            c6784aj.m6062a("load_tbs_dex", (byte) 1);
        }
        this.f6857e = new DexLoader(str3, this.f6853a, this.f6856d, str2, QbSdk.f6583l);
        if (c6784aj != null) {
            c6784aj.m6062a("load_tbs_dex", (byte) 2);
        }
        libwebp.loadWepLibraryIfNeed(context2, this.f6855c);
        if ("com.nd.android.pandahome2".equals(this.f6853a.getApplicationInfo().packageName)) {
            this.f6857e.invokeStaticMethod("com.tencent.tbs.common.beacon.X5CoreBeaconUploader", "getInstance", new Class[]{Context.class}, this.f6853a);
        }
        Map<String, Object> map = QbSdk.f6583l;
        if (map != null) {
            this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[]{Map.class}, map);
        }
        if (c6784aj != null) {
            c6784aj.m6062a("init_tbs", (byte) 1);
        }
        int iM6142a = m6142a(context);
        if (c6784aj != null) {
            c6784aj.m6062a("init_tbs", (byte) 2);
        }
        if (iM6142a >= 0) {
            TbsLog.m6248i("TbsWizard", "construction end...");
            return;
        }
        throw new Exception("TbsWizard init error: " + iM6142a + "; msg: " + this.f6859g);
    }

    /* renamed from: a */
    private int m6142a(Context context) {
        Context context2;
        Object objInvokeStaticMethod;
        int iIntValue;
        String str;
        this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "putInfo", new Class[]{Context.class, String.class, String.class, String.class, String.class}, context, C6845b.f6958a, C6845b.f6959b, C6845b.f6960c, C6845b.f6961d);
        if (this.f6854b != null || TbsShareManager.getHostCorePathAppDefined() == null) {
            DexLoader dexLoader = this.f6857e;
            context2 = context;
            objInvokeStaticMethod = dexLoader.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, Integer.TYPE, String.class}, context2, this.f6854b, dexLoader, this.f6855c, this.f6858f, TbsConfig.TBS_SDK_VERSIONNAME, 43500, QbSdk.m5838a());
        } else {
            DexLoader dexLoader2 = this.f6857e;
            objInvokeStaticMethod = dexLoader2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, Integer.TYPE, String.class, String.class}, context, this.f6854b, dexLoader2, this.f6855c, this.f6858f, TbsConfig.TBS_SDK_VERSIONNAME, 43500, QbSdk.m5838a(), TbsShareManager.getHostCorePathAppDefined());
            context2 = context;
        }
        if (objInvokeStaticMethod == null) {
            m6143c();
            m6144d();
            DexLoader dexLoader3 = this.f6857e;
            objInvokeStaticMethod = dexLoader3.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class}, context2, this.f6854b, dexLoader3, this.f6855c, this.f6858f);
        }
        if (objInvokeStaticMethod == null) {
            iIntValue = -3;
        } else if (objInvokeStaticMethod instanceof Integer) {
            iIntValue = ((Integer) objInvokeStaticMethod).intValue();
        } else if (objInvokeStaticMethod instanceof Throwable) {
            TbsCoreLoadStat.getInstance().m5852a(this.f6853a, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, (Throwable) objInvokeStaticMethod);
            iIntValue = -5;
        } else {
            iIntValue = -4;
        }
        if (iIntValue < 0) {
            Object objInvokeStaticMethod2 = this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
            if (objInvokeStaticMethod2 instanceof Throwable) {
                Throwable th = (Throwable) objInvokeStaticMethod2;
                this.f6859g = "#" + th.getMessage() + "; cause: " + th.getCause() + "; th: " + th;
            }
            str = objInvokeStaticMethod2 instanceof String ? (String) objInvokeStaticMethod2 : null;
            return iIntValue;
        }
        this.f6859g = str;
        return iIntValue;
    }

    /* renamed from: c */
    private void m6143c() {
        this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[]{String.class}, TbsConfig.TBS_SDK_VERSIONNAME);
    }

    /* renamed from: d */
    private void m6144d() {
        this.f6857e.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", 43500);
    }

    /* renamed from: b */
    public DexLoader m6147b() {
        return this.f6857e;
    }

    /* renamed from: a */
    public String m6145a() {
        String str = null;
        Object objInvokeStaticMethod = this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[]{Boolean.TYPE, String.class, String.class, Class[].class, Object[].class}, Boolean.TRUE, "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        if (objInvokeStaticMethod == null) {
            objInvokeStaticMethod = this.f6857e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        }
        if (objInvokeStaticMethod != null) {
            str = String.valueOf(objInvokeStaticMethod) + " ReaderPackName=" + TbsReaderView.gReaderPackName + " ReaderPackVersion=" + TbsReaderView.gReaderPackVersion;
        }
        return str == null ? "X5 core get nothing..." : str;
    }

    /* renamed from: a */
    public boolean m6146a(Context context, String str, String str2, Bundle bundle) {
        Object objInvokeStaticMethod = this.f6857e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[]{Context.class, String.class, String.class, Bundle.class}, context, str, str2, bundle);
        if (objInvokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) objInvokeStaticMethod).booleanValue();
    }
}
