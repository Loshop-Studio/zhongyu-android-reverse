package com.taobao.agoo.p087a.p088a;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.JsonUtility;

/* renamed from: com.taobao.agoo.a.a.d */
/* loaded from: classes5.dex */
public class C7708d extends AbstractC7706b {
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* renamed from: a */
    public String f13276a;

    /* renamed from: b */
    public String f13277b;

    /* renamed from: c */
    public String f13278c;

    /* renamed from: a */
    public byte[] m10206a() {
        try {
            JsonUtility.JsonObjectBuilder jsonObjectBuilder = new JsonUtility.JsonObjectBuilder();
            jsonObjectBuilder.put(AbstractC7706b.JSON_CMD, this.f13260e).put(Constants.KEY_APP_KEY, this.f13276a);
            if (TextUtils.isEmpty(this.f13277b)) {
                jsonObjectBuilder.put("utdid", this.f13278c);
            } else {
                jsonObjectBuilder.put("deviceId", this.f13277b);
            }
            String string = jsonObjectBuilder.build().toString();
            ALog.m10119i("SwitchDO", "buildData", "data", string);
            return string.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m10117e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m10205a(String str, String str2, String str3, boolean z10) {
        C7708d c7708d = new C7708d();
        c7708d.f13276a = str;
        c7708d.f13277b = str2;
        c7708d.f13278c = str3;
        if (z10) {
            c7708d.f13260e = JSON_CMD_ENABLEPUSH;
        } else {
            c7708d.f13260e = JSON_CMD_DISABLEPUSH;
        }
        return c7708d.m10206a();
    }
}
