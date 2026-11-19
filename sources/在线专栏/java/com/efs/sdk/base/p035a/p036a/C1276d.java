package com.efs.sdk.base.p035a.p036a;

import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1318c;
import com.efs.sdk.base.p035a.p046h.p048b.C1323b;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.a.d */
/* loaded from: classes.dex */
public final class C1276d extends AbsHttpListener {

    /* renamed from: com.efs.sdk.base.a.a.d$a */
    static class a {

        /* renamed from: a */
        private static final C1276d f6994a = new C1276d(0);
    }

    /* synthetic */ C1276d(byte b4) {
        this();
    }

    /* renamed from: b */
    private static void m5428b(HttpResponse httpResponse) {
        C1339f.a.f7143a.m5596a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    /* renamed from: c */
    private static void m5429c(HttpResponse httpResponse) {
        int i4;
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str) && (i4 = Integer.parseInt(str)) > C1288c.m5456a().f7035d.f7026a) {
                C1288c.m5456a().m5466a(i4);
            }
        }
    }

    @Override // com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1317b
    /* renamed from: a */
    public final /* synthetic */ void mo5422a(InterfaceC1318c<HttpResponse> interfaceC1318c, HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C1323b c1323b = (C1323b) interfaceC1318c;
            ((Map) httpResponse2.extra).putAll(c1323b.f7116f);
            c1323b.f7116f.clear();
            C1273a.m5414a();
            C1273a.m5416a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(HttpResponse httpResponse) {
        m5427a(httpResponse);
        if (httpResponse == null) {
            return;
        }
        m5428b(httpResponse);
        m5429c(httpResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // com.efs.sdk.base.http.AbsHttpListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.efs.sdk.base.http.HttpResponse r6) {
        /*
            r5 = this;
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "flow_limit"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r0 = r0.toString()
            T r2 = r6.extra
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r2.get(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
        L20:
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "type"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L37
            T r0 = r6.extra
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L39
        L37:
            java.lang.String r0 = ""
        L39:
            T r1 = r6.extra
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "size"
            boolean r1 = r1.containsKey(r2)
            r3 = 0
            if (r1 == 0) goto L5b
            T r1 = r6.extra
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L5b
            int r1 = java.lang.Integer.parseInt(r1)
            goto L5c
        L5b:
            r1 = 0
        L5c:
            com.efs.sdk.base.a.e.b r2 = com.efs.sdk.base.p035a.p042e.HandlerC1296b.m5495a()
            android.os.Message r4 = android.os.Message.obtain()
            r4.what = r3
            r4.obj = r0
            r4.arg1 = r1
            r2.sendMessage(r4)
        L6d:
            m5428b(r6)
            com.efs.sdk.base.a.i.f r0 = com.efs.sdk.base.p035a.p050i.C1339f.a.m5597a()
            com.efs.sdk.base.a.i.d r0 = r0.f7141c
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f7134b
            r0.incrementAndGet()
            m5429c(r6)
            m5427a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p035a.p036a.C1276d.onSuccess(com.efs.sdk.base.http.HttpResponse):void");
    }

    private C1276d() {
    }

    /* renamed from: a */
    public static C1276d m5426a() {
        return a.f6994a;
    }

    /* renamed from: a */
    private static void m5427a(HttpResponse httpResponse) {
        String str;
        if (C1293a.m5487a().f7013f) {
            if (httpResponse == null) {
                str = "upload result : " + RequestConstant.FALSE;
            } else {
                str = "upload result : " + httpResponse.succ + ", resp is " + httpResponse.toString();
            }
            C1329d.m5571a("efs.px.api", str);
        }
    }
}
