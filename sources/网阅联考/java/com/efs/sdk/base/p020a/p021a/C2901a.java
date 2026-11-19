package com.efs.sdk.base.p020a.p021a;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p033b.C2953d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.a.a */
/* loaded from: classes2.dex */
public final class C2901a {

    /* renamed from: b */
    private static volatile long f1008b = -1;

    /* renamed from: a */
    public boolean f1009a;

    /* renamed from: com.efs.sdk.base.a.a.a$a */
    public static class a {

        /* renamed from: a */
        private static final C2901a f1010a = new C2901a(0);
    }

    public /* synthetic */ C2901a(byte b4) {
        this();
    }

    /* renamed from: a */
    public static C2901a m2055a() {
        return a.f1010a;
    }

    /* renamed from: b */
    public static long m2058b() {
        return f1008b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + f1008b;
    }

    private C2901a() {
        this.f1009a = true;
    }

    @NonNull
    /* renamed from: a */
    public final HttpResponse m2059a(String str, C2903c c2903c, File file, boolean z3) {
        String strM2066b = c2903c.m2066b();
        String strM2056a = m2056a(str, c2903c);
        if (this.f1009a) {
            C2957d.m2212a("efs.px.api", "Upload file, url is ".concat(String.valueOf(strM2056a)));
        }
        HashMap map = new HashMap(1);
        map.put("wpk-header", strM2066b);
        C2953d c2953dM2202a = new C2953d(strM2056a).m2202a(map);
        c2953dM2202a.f1149a.f1144d = file;
        C2953d c2953dM2201a = c2953dM2202a.m2201a("type", c2903c.f1019h);
        StringBuilder sb = new StringBuilder();
        sb.append(c2903c.f1023l);
        return c2953dM2201a.m2201a("size", sb.toString()).m2201a("flow_limit", Boolean.toString(z3)).m2200a(C2904d.m2067a()).m2199a().m2198b();
    }

    /* renamed from: a */
    public static String m2056a(@NonNull String str, @NonNull C2903c c2903c) {
        byte b4 = c2903c.f1018g;
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
    public static void m2057a(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String strOptString = jSONObject.optString("code", "-1");
            httpResponse.setBizCode(strOptString);
            if (!"0".equals(strOptString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j4 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j4 - m2058b()) > 1500000) {
                f1008b = j4 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            C2957d.m2214b("efs.px.api", "checkPxReturn error", th);
        }
    }
}
