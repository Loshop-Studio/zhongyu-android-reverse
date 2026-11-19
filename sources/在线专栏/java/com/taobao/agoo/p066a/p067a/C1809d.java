package com.taobao.agoo.p066a.p067a;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;

/* renamed from: com.taobao.agoo.a.a.d */
/* loaded from: classes.dex */
public class C1809d extends AbstractC1807b {
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* renamed from: a */
    public String f7878a;

    /* renamed from: b */
    public String f7879b;

    /* renamed from: c */
    public String f7880c;

    /* renamed from: a */
    public byte[] m6180a() {
        try {
            JsonUtility.JsonObjectBuilder jsonObjectBuilder = new JsonUtility.JsonObjectBuilder();
            jsonObjectBuilder.put(AbstractC1807b.JSON_CMD, this.f7862e).put(Constants.KEY_APP_KEY, this.f7878a);
            if (TextUtils.isEmpty(this.f7879b)) {
                jsonObjectBuilder.put("utdid", this.f7880c);
            } else {
                jsonObjectBuilder.put("deviceId", this.f7879b);
            }
            String string = jsonObjectBuilder.build().toString();
            ALog.m6093i("SwitchDO", "buildData", Constants.KEY_DATA, string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m6091e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m6179a(String str, String str2, String str3, boolean z3) {
        C1809d c1809d = new C1809d();
        c1809d.f7878a = str;
        c1809d.f7879b = str2;
        c1809d.f7880c = str3;
        if (z3) {
            c1809d.f7862e = JSON_CMD_ENABLEPUSH;
        } else {
            c1809d.f7862e = JSON_CMD_DISABLEPUSH;
        }
        return c1809d.m6180a();
    }
}
