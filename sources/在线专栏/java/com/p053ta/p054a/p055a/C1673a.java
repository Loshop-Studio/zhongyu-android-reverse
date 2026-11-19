package com.p053ta.p054a.p055a;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p053ta.p054a.C1672a;
import com.p053ta.utdid2.p058a.p059a.C1692d;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ta.a.a.a */
/* loaded from: classes.dex */
public class C1673a {
    /* renamed from: a */
    public static String m5736a(String str) {
        Context context = C1672a.m5731a().getContext();
        return context == null ? "" : C1692d.m5784e(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", "audid", C1672a.m5731a().m5733a(), m5737a(str, "", "", context.getPackageName())));
    }

    /* renamed from: a */
    private static String m5737a(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("audid", str2);
        map.put("utdid", str);
        map.put("appkey", str3);
        map.put(DispatchConstants.APP_NAME, str4);
        return new JSONObject(C1692d.m5782a(map)).toString();
    }
}
