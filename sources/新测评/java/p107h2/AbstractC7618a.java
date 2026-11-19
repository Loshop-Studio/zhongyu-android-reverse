package p107h2;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;
import p074e2.C7329a;
import p140k2.AbstractC7875f;

/* renamed from: h2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7618a {
    /* renamed from: a */
    public static String m12542a(String str) {
        Context contextM11713f = C7329a.m11708b().m11713f();
        return contextM11713f == null ? "" : AbstractC7875f.m13410d(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", "audid", C7329a.m11708b().m11710c(), m12543b(str, "", "", contextM11713f.getPackageName())));
    }

    /* renamed from: b */
    public static String m12543b(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("audid", str2);
        map.put("utdid", str);
        map.put("appkey", str3);
        map.put("appName", str4);
        return new JSONObject(AbstractC7875f.m13408b(map)).toString();
    }
}
