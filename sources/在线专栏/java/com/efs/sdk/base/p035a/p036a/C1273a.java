package com.efs.sdk.base.p035a.p036a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p048b.C1325d;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.a.a */
/* loaded from: classes.dex */
public final class C1273a {

    /* renamed from: b */
    private static volatile long f6978b = -1;

    /* renamed from: a */
    public boolean f6979a;

    /* renamed from: com.efs.sdk.base.a.a.a$a */
    static class a {

        /* renamed from: a */
        private static final C1273a f6980a = new C1273a(0);
    }

    /* synthetic */ C1273a(byte b4) {
        this();
    }

    /* renamed from: a */
    public static C1273a m5414a() {
        return a.f6980a;
    }

    /* renamed from: b */
    public static long m5417b() {
        return f6978b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + f6978b;
    }

    private C1273a() {
        this.f6979a = true;
    }

    /* renamed from: a */
    public final HttpResponse m5418a(String str, C1275c c1275c, File file, boolean z3) {
        String strM5425b = c1275c.m5425b();
        String strM5415a = m5415a(str, c1275c);
        if (this.f6979a) {
            C1329d.m5571a("efs.px.api", "Upload file, url is ".concat(String.valueOf(strM5415a)));
        }
        HashMap map = new HashMap(1);
        map.put("wpk-header", strM5425b);
        C1325d c1325dM5561a = new C1325d(strM5415a).m5561a(map);
        c1325dM5561a.f7119a.f7114d = file;
        C1325d c1325dM5560a = c1325dM5561a.m5560a("type", c1275c.f6989h);
        StringBuilder sb = new StringBuilder();
        sb.append(c1275c.f6993l);
        return c1325dM5560a.m5560a("size", sb.toString()).m5560a("flow_limit", Boolean.toString(z3)).m5559a(C1276d.m5426a()).m5558a().m5557b();
    }

    /* renamed from: a */
    public static String m5415a(String str, C1275c c1275c) {
        byte b4 = c1275c.f6988g;
        String str2 = "/api/v1/raw/upload";
        if (b4 != 1) {
            if (b4 == 2) {
                str2 = "/perf_upload";
            } else if (b4 == 3) {
                str2 = "/api/v1/mix/upload";
            }
        }
        return str + str2;
    }

    /* renamed from: a */
    static void m5416a(HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String strOptString = jSONObject.optString(Constants.KEY_HTTP_CODE, "-1");
            httpResponse.setBizCode(strOptString);
            if (!MessageService.MSG_DB_READY_REPORT.equals(strOptString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j4 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j4 - m5417b()) > 1500000) {
                f6978b = j4 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            C1329d.m5573b("efs.px.api", "checkPxReturn error", th);
        }
    }
}
