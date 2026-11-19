package com.efs.sdk.base.p035a.p050i;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p042e.InterfaceC1297c;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p048b.C1325d;
import com.efs.sdk.base.p035a.p046h.p049c.C1328b;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.e */
/* loaded from: classes.dex */
public final class C1338e implements InterfaceC1297c {
    /* renamed from: a */
    private static void m5592a(HttpResponse httpResponse) {
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

    @Override // com.efs.sdk.base.p035a.p042e.InterfaceC1297c
    /* renamed from: a */
    public final HttpResponse mo5493a(C1302b c1302b, boolean z3) {
        HttpResponse httpResponse;
        try {
            C1336c c1336c = C1339f.a.f7143a.f7139a;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strM5567a = C1328b.m5567a(c1336c.f7132b + c1336c.f7133c + strValueOf + "AppChk#2014");
            StringBuilder sb = new StringBuilder();
            String str = c1336c.f7131a;
            if (str.startsWith(HttpConstant.HTTP)) {
                sb.append(str);
                sb.append("?chk=");
            } else {
                sb.append(str);
                sb.append("?chk=");
            }
            sb.append(strM5567a.substring(strM5567a.length() - 8));
            sb.append("&vno=");
            sb.append(strValueOf);
            sb.append("&uuid=");
            sb.append(c1336c.f7133c);
            sb.append("&app=");
            sb.append(c1336c.f7132b);
            sb.append("&zip=gzip");
            String string = sb.toString();
            int length = 0;
            byte[] bArrM5545a = new byte[0];
            int i4 = c1302b.f7089a.f7084c;
            if (i4 == 0) {
                bArrM5545a = c1302b.f7091c;
                length = bArrM5545a.length;
            } else if (1 == i4) {
                bArrM5545a = C1321b.m5545a(c1302b.f7092d.getPath());
                length = bArrM5545a.length;
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Length", String.valueOf(length));
            C1325d c1325dM5561a = new C1325d(string).m5561a(map);
            c1325dM5561a.f7119a.f7113c = bArrM5545a;
            httpResponse = c1325dM5561a.m5558a().m5557b();
            m5592a(httpResponse);
        } catch (Throwable th) {
            httpResponse = 0 == 0 ? new HttpResponse() : null;
            C1329d.m5573b("efs.wa.send", "get file size error", th);
        }
        if (httpResponse.succ) {
            C1329d.m5571a("efs.base", "wa upload succ, " + httpResponse.toString());
            C1321b.m5547b(c1302b.f7092d);
            return httpResponse;
        }
        C1329d.m5571a("efs.base", "wa upload fail, resp is " + httpResponse.toString());
        return httpResponse;
    }
}
