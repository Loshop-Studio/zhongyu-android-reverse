package com.efs.sdk.base.p039a.p040a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p052b.C5693d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.a.a */
/* loaded from: classes3.dex */
public final class C5641a {

    /* renamed from: b */
    private static volatile long f4612b = -1;

    /* renamed from: a */
    public boolean f4613a;

    /* renamed from: com.efs.sdk.base.a.a.a$a */
    public static class a {

        /* renamed from: a */
        private static final C5641a f4614a = new C5641a(0);
    }

    public /* synthetic */ C5641a(byte b10) {
        this();
    }

    /* renamed from: a */
    public static C5641a m4024a() {
        return a.f4614a;
    }

    /* renamed from: b */
    public static long m4027b() {
        return f4612b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + f4612b;
    }

    private C5641a() {
        this.f4613a = true;
    }

    @NonNull
    /* renamed from: a */
    public final HttpResponse m4028a(String str, C5643c c5643c, File file, boolean z9) {
        String strM4035b = c5643c.m4035b();
        String strM4025a = m4025a(str, c5643c);
        if (this.f4613a) {
            C5697d.m4181a("efs.px.api", "Upload file, url is ".concat(String.valueOf(strM4025a)));
        }
        HashMap map = new HashMap(1);
        map.put("wpk-header", strM4035b);
        C5693d c5693dM4171a = new C5693d(strM4025a).m4171a(map);
        c5693dM4171a.f4753a.f4748d = file;
        C5693d c5693dM4170a = c5693dM4171a.m4170a("type", c5643c.f4623h);
        StringBuilder sb = new StringBuilder();
        sb.append(c5643c.f4627l);
        return c5693dM4170a.m4170a("size", sb.toString()).m4170a("flow_limit", Boolean.toString(z9)).m4169a(C5644d.m4036a()).m4168a().m4167b();
    }

    /* renamed from: a */
    public static String m4025a(@NonNull String str, @NonNull C5643c c5643c) {
        byte b10 = c5643c.f4622g;
        String str2 = "/api/v1/raw/upload";
        if (b10 != 1) {
            if (b10 == 2) {
                str2 = "/perf_upload";
            } else if (b10 == 3) {
                str2 = "/api/v1/mix/upload";
            }
        }
        return str + str2;
    }

    /* renamed from: a */
    public static void m4026a(@Nullable HttpResponse httpResponse) {
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
            long j9 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j9 - m4027b()) > 1500000) {
                f4612b = j9 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            C5697d.m4183b("efs.px.api", "checkPxReturn error", th);
        }
    }
}
