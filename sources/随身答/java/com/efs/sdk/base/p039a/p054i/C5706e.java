package com.efs.sdk.base.p039a.p054i;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p046e.InterfaceC5665c;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p052b.C5693d;
import com.efs.sdk.base.p039a.p050h.p053c.C5696b;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.e */
/* loaded from: classes3.dex */
public final class C5706e implements InterfaceC5665c {
    /* renamed from: a */
    private static void m4202a(HttpResponse httpResponse) {
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

    @Override // com.efs.sdk.base.p039a.p046e.InterfaceC5665c
    @NonNull
    /* renamed from: a */
    public final HttpResponse mo4103a(C5670b c5670b, boolean z9) {
        try {
            C5704c c5704c = C5707f.a.f4777a.f4773a;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strM4177a = C5696b.m4177a(c5704c.f4766b + c5704c.f4767c + strValueOf + "AppChk#2014");
            StringBuilder sb = new StringBuilder();
            String str = c5704c.f4765a;
            if (str.startsWith("http")) {
                sb.append(str);
                sb.append("?chk=");
            } else {
                sb.append(str);
                sb.append("?chk=");
            }
            sb.append(strM4177a.substring(strM4177a.length() - 8));
            sb.append("&vno=");
            sb.append(strValueOf);
            sb.append("&uuid=");
            sb.append(c5704c.f4767c);
            sb.append("&app=");
            sb.append(c5704c.f4766b);
            sb.append("&zip=gzip");
            String string = sb.toString();
            int length = 0;
            byte[] bArrM4155a = new byte[0];
            int i9 = c5670b.f4723a.f4718c;
            if (i9 == 0) {
                bArrM4155a = c5670b.f4725c;
                length = bArrM4155a.length;
            } else if (1 == i9) {
                bArrM4155a = C5689b.m4155a(c5670b.f4726d.getPath());
                length = bArrM4155a.length;
            }
            HashMap map = new HashMap();
            map.put(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            map.put(HttpHeaders.CONTENT_LENGTH, String.valueOf(length));
            C5693d c5693dM4171a = new C5693d(string).m4171a(map);
            c5693dM4171a.f4753a.f4747c = bArrM4155a;
            HttpResponse httpResponseM4167b = c5693dM4171a.m4168a().m4167b();
            m4202a(httpResponseM4167b);
            if (httpResponseM4167b.succ) {
                C5697d.m4181a("efs.base", "wa upload succ, " + httpResponseM4167b.toString());
                C5689b.m4157b(c5670b.f4726d);
                return httpResponseM4167b;
            }
            C5697d.m4181a("efs.base", "wa upload fail, resp is " + httpResponseM4167b.toString());
            return httpResponseM4167b;
        } catch (Throwable th) {
            HttpResponse httpResponse = 0 == 0 ? new HttpResponse() : null;
            C5697d.m4183b("efs.wa.send", "get file size error", th);
            return httpResponse;
        }
    }
}
