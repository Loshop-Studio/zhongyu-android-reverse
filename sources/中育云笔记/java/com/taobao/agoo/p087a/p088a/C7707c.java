package com.taobao.agoo.p087a.p088a;

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
/* loaded from: classes5.dex */
public class C7707c extends AbstractC7706b {
    public static final String JSON_CMD_REGISTER = "register";

    /* renamed from: a */
    public String f13261a;

    /* renamed from: b */
    public String f13262b;

    /* renamed from: c */
    public String f13263c;

    /* renamed from: d */
    public String f13264d = String.valueOf(Constants.SDK_VERSION_CODE);

    /* renamed from: f */
    public String f13265f;

    /* renamed from: g */
    public String f13266g;

    /* renamed from: h */
    public String f13267h;

    /* renamed from: i */
    public String f13268i;

    /* renamed from: j */
    public String f13269j;

    /* renamed from: k */
    public String f13270k;

    /* renamed from: l */
    public String f13271l;

    /* renamed from: m */
    public String f13272m;

    /* renamed from: n */
    public String f13273n;

    /* renamed from: o */
    public String f13274o;

    /* renamed from: p */
    public String f13275p;

    /* renamed from: a */
    public byte[] m10204a() {
        try {
            String string = new JsonUtility.JsonObjectBuilder().put(AbstractC7706b.JSON_CMD, this.f13260e).put(Constants.KEY_APP_KEY, this.f13261a).put("utdid", this.f13262b).put("appVersion", this.f13263c).put(Constants.KEY_SDK_VERSION, this.f13264d).put(Constants.KEY_TTID, this.f13265f).put(Constants.KEY_PACKAGE_NAME, this.f13266g).put("notifyEnable", this.f13267h).put("romInfo", this.f13268i).put("c0", this.f13269j).put("c1", this.f13270k).put("c2", this.f13271l).put("c3", this.f13272m).put("c4", this.f13273n).put("c5", this.f13274o).put("c6", this.f13275p).build().toString();
            ALog.m10119i("RegisterDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m10117e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m10203a(Context context, String str, String str2) {
        Throwable th;
        C7707c c7707c;
        try {
            String deviceId = UtilityImpl.getDeviceId(context);
            String packageName = context.getPackageName();
            String str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(deviceId) && !TextUtils.isEmpty(str3)) {
                c7707c = new C7707c();
                try {
                    c7707c.f13260e = JSON_CMD_REGISTER;
                    c7707c.f13261a = str;
                    c7707c.f13262b = deviceId;
                    c7707c.f13263c = str3;
                    c7707c.f13265f = str2;
                    c7707c.f13266g = packageName;
                    c7707c.f13269j = Build.BRAND;
                    c7707c.f13270k = Build.MODEL;
                    c7707c.f13271l = null;
                    c7707c.f13272m = null;
                    c7707c.f13267h = AdapterUtilityImpl.isNotificationEnabled(context);
                    c7707c.f13268i = RomInfoCollector.getCollector().collect();
                    return c7707c.m10204a();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ALog.m10122w("RegisterDO", "buildRegister", th.getMessage());
                        if (c7707c != null) {
                            return c7707c.m10204a();
                        }
                        return null;
                    } finally {
                    }
                }
            }
            ALog.m10118e("RegisterDO", "buildRegister param null", Constants.KEY_APP_KEY, str, "utdid", deviceId, "appVersion", str3);
            return null;
        } catch (Throwable th3) {
            th = th3;
            c7707c = null;
        }
    }
}
