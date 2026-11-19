package p318r5;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r5.c1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10852c1 {
    /* renamed from: a */
    public static C10887p m23389a(String str, String str2, String str3, String str4) {
        C10887p c10887p = new C10887p();
        c10887p.m23423a(str);
        c10887p.m23424b(AbstractC10900v0.m23676k());
        c10887p.m23427e(str2);
        c10887p.m23425c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        c10887p.m23426d(stringBuffer.toString());
        return c10887p;
    }

    /* renamed from: b */
    public static C10872j0 m23390b(String str, String str2) {
        C10872j0 c10872j0 = new C10872j0();
        c10872j0.m23361a(C10848b0.m23347c().m23348a(str, str2));
        return c10872j0;
    }

    /* renamed from: c */
    public static C10873j1 m23391c(String str, String str2, String str3) {
        C10873j1 c10873j1 = new C10873j1();
        c10873j1.m23344c(AbstractC10900v0.m23683r());
        c10873j1.m23346e(AbstractC10900v0.m23685t());
        c10873j1.m23342a(str3);
        c10873j1.m23343b(C10848b0.m23347c().m23351e(str2, str));
        return c10873j1;
    }

    /* renamed from: d */
    public static C10901w m23392d(String str, String str2) {
        C10878l0.m23526f().m23528c(str, str2);
        if (!TextUtils.isEmpty(C10878l0.m23526f().m23527a())) {
            return new C10901w(C10878l0.m23526f().m23530e());
        }
        AbstractC10861f1.m23441m("hmsSdk", "event chifer is empty");
        return null;
    }

    /* renamed from: e */
    public static Map m23393e(String str, String str2) {
        HashMap map = new HashMap();
        map.put("App-Id", AbstractC10900v0.m23676k());
        map.put("App-Ver", AbstractC10900v0.m23678m());
        map.put("Sdk-Name", "hianalytics");
        map.put("Sdk-Ver", "2.2.0.315");
        map.put("Device-Type", Build.MODEL);
        map.put("servicetag", str);
        AbstractC10861f1.m23430b("hmsSdk", "sendData RequestId : " + str2);
        map.put("Request-Id", str2);
        return map;
    }
}
