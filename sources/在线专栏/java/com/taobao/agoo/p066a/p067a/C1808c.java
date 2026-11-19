package com.taobao.agoo.p066a.p067a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.accs.utl.RomInfoCollector;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.agoo.a.a.c */
/* loaded from: classes.dex */
public class C1808c extends AbstractC1807b {
    public static final String JSON_CMD_REGISTER = "register";

    /* renamed from: a */
    public String f7863a;

    /* renamed from: b */
    public String f7864b;

    /* renamed from: c */
    public String f7865c;

    /* renamed from: d */
    public String f7866d = String.valueOf(Constants.SDK_VERSION_CODE);

    /* renamed from: f */
    public String f7867f;

    /* renamed from: g */
    public String f7868g;

    /* renamed from: h */
    public String f7869h;

    /* renamed from: i */
    public String f7870i;

    /* renamed from: j */
    public String f7871j;

    /* renamed from: k */
    public String f7872k;

    /* renamed from: l */
    public String f7873l;

    /* renamed from: m */
    public String f7874m;

    /* renamed from: n */
    public String f7875n;

    /* renamed from: o */
    public String f7876o;

    /* renamed from: p */
    public String f7877p;

    /* renamed from: a */
    public byte[] m6178a() {
        try {
            String string = new JsonUtility.JsonObjectBuilder().put(AbstractC1807b.JSON_CMD, this.f7862e).put(Constants.KEY_APP_KEY, this.f7863a).put("utdid", this.f7864b).put("appVersion", this.f7865c).put(Constants.KEY_SDK_VERSION, this.f7866d).put(Constants.KEY_TTID, this.f7867f).put(Constants.KEY_PACKAGE_NAME, this.f7868g).put("notifyEnable", this.f7869h).put("romInfo", this.f7870i).put("c0", this.f7871j).put("c1", this.f7872k).put("c2", this.f7873l).put("c3", this.f7874m).put("c4", this.f7875n).put("c5", this.f7876o).put("c6", this.f7877p).build().toString();
            ALog.m6093i("RegisterDO", "buildData", Constants.KEY_DATA, string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m6091e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m6177a(Context context, String str, String str2) {
        C1808c c1808c;
        String deviceId;
        String packageName;
        String str3;
        try {
            deviceId = UtilityImpl.getDeviceId(context);
            packageName = context.getPackageName();
            str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Throwable th) {
            th = th;
            c1808c = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(deviceId) && !TextUtils.isEmpty(str3)) {
            c1808c = new C1808c();
            try {
                c1808c.f7862e = JSON_CMD_REGISTER;
                c1808c.f7863a = str;
                c1808c.f7864b = deviceId;
                c1808c.f7865c = str3;
                c1808c.f7867f = str2;
                c1808c.f7868g = packageName;
                c1808c.f7871j = Build.BRAND;
                c1808c.f7872k = Build.MODEL;
                c1808c.f7873l = null;
                c1808c.f7874m = null;
                c1808c.f7869h = AdapterUtilityImpl.isNotificationEnabled(context);
                c1808c.f7870i = RomInfoCollector.getCollector().collect();
            } catch (Throwable th2) {
                th = th2;
                try {
                    ALog.m6096w("RegisterDO", "buildRegister", th.getMessage());
                    if (c1808c == null) {
                        return null;
                    }
                    return c1808c.m6178a();
                } finally {
                    if (c1808c != null) {
                        c1808c.m6178a();
                    }
                }
            }
            return c1808c.m6178a();
        }
        ALog.m6092e("RegisterDO", "buildRegister param null", Constants.KEY_APP_KEY, str, "utdid", deviceId, "appVersion", str3);
        return null;
    }
}
