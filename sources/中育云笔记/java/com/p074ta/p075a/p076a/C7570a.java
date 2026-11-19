package com.p074ta.p075a.p076a;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p074ta.p075a.C7569a;
import com.p074ta.utdid2.p079a.p080a.C7589d;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ta.a.a.a */
/* loaded from: classes5.dex */
public class C7570a {
    /* renamed from: a */
    public static String m9762a(String str) {
        Context context = C7569a.m9757a().getContext();
        return context == null ? "" : C7589d.m9810e(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", "audid", C7569a.m9757a().m9759a(), m9763a(str, "", "", context.getPackageName())));
    }

    /* renamed from: a */
    private static String m9763a(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("audid", str2);
        map.put("utdid", str);
        map.put("appkey", str3);
        map.put(DispatchConstants.APP_NAME, str4);
        return new JSONObject(C7589d.m9808a(map)).toString();
    }
}
