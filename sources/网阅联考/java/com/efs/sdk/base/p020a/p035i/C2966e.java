package com.efs.sdk.base.p020a.p035i;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p027e.InterfaceC2925c;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p033b.C2953d;
import com.efs.sdk.base.p020a.p031h.p034c.C2956b;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.e */
/* loaded from: classes2.dex */
public final class C2966e implements InterfaceC2925c {
    /* renamed from: a */
    private static void m2233a(HttpResponse httpResponse) {
        if (httpResponse == null || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        for (String str : httpResponse.data.split("`")) {
            String[] strArrSplit = str.split("=");
            if (strArrSplit.length >= 2) {
                if (strArrSplit[0].equalsIgnoreCase("retcode")) {
                    httpResponse.setBizCode(strArrSplit[1]);
                } else {
                    ((Map) httpResponse.extra).put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    @Override // com.efs.sdk.base.p020a.p027e.InterfaceC2925c
    @NonNull
    /* renamed from: a */
    public final HttpResponse mo2134a(C2930b c2930b, boolean z3) {
        HttpResponse httpResponse;
        try {
            C2964c c2964c = C2967f.a.f1173a.f1169a;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strM2208a = C2956b.m2208a(c2964c.f1162b + c2964c.f1163c + strValueOf + "AppChk#2014");
            StringBuilder sb = new StringBuilder();
            String str = c2964c.f1161a;
            if (str.startsWith("http")) {
                sb.append(str);
                sb.append("?chk=");
            } else {
                sb.append(str);
                sb.append("?chk=");
            }
            sb.append(strM2208a.substring(strM2208a.length() - 8));
            sb.append("&vno=");
            sb.append(strValueOf);
            sb.append("&uuid=");
            sb.append(c2964c.f1163c);
            sb.append("&app=");
            sb.append(c2964c.f1162b);
            sb.append("&zip=gzip");
            String string = sb.toString();
            int length = 0;
            byte[] bArrM2186a = new byte[0];
            int i4 = c2930b.f1119a.f1114c;
            if (i4 == 0) {
                bArrM2186a = c2930b.f1121c;
                length = bArrM2186a.length;
            } else if (1 == i4) {
                bArrM2186a = C2949b.m2186a(c2930b.f1122d.getPath());
                length = bArrM2186a.length;
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Length", String.valueOf(length));
            C2953d c2953dM2202a = new C2953d(string).m2202a(map);
            c2953dM2202a.f1149a.f1143c = bArrM2186a;
            httpResponse = c2953dM2202a.m2199a().m2198b();
            m2233a(httpResponse);
        } catch (Throwable th) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            C2957d.m2214b("efs.wa.send", "get file size error", th);
        }
        if (httpResponse.succ) {
            C2957d.m2212a("efs.base", "wa upload succ, " + httpResponse.toString());
            C2949b.m2188b(c2930b.f1122d);
            return httpResponse;
        }
        C2957d.m2212a("efs.base", "wa upload fail, resp is " + httpResponse.toString());
        return httpResponse;
    }
}
