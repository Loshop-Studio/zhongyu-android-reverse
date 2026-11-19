package com.efs.sdk.base.p039a.p042c.p043a;

import com.efs.sdk.base.IConfigRefreshAction;

/* renamed from: com.efs.sdk.base.a.c.a.a */
/* loaded from: classes3.dex */
public final class C5654a implements IConfigRefreshAction {

    /* renamed from: com.efs.sdk.base.a.c.a.a$a */
    public static class a {

        /* renamed from: a */
        private static final C5654a f4659a = new C5654a();
    }

    /* renamed from: a */
    public static C5654a m4062a() {
        return a.f4659a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        return "";
     */
    @Override // com.efs.sdk.base.IConfigRefreshAction
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String refresh() {
        /*
            r10 = this;
            com.efs.sdk.base.a.c.a r0 = com.efs.sdk.base.p039a.p044d.C5661a.m4097a()
            android.content.Context r0 = r0.f4644c
            android.net.NetworkInfo r0 = com.efs.sdk.base.p039a.p050h.C5698e.m4184a(r0)
            java.lang.String r1 = "efs.config"
            java.lang.String r2 = ""
            if (r0 == 0) goto Lb6
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto Lb6
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r0 != r3) goto Lb6
            com.efs.sdk.base.a.c.a.c r0 = com.efs.sdk.base.p039a.p042c.p043a.C5656c.m4066a()
            r3 = 1
            java.lang.String r0 = r0.m4075a(r3)
            com.efs.sdk.base.a.a.c r4 = com.efs.sdk.base.p039a.p040a.C5643c.m4034a()
            r5 = 0
        L2c:
            r6 = 3
            if (r5 >= r6) goto La8
            com.efs.sdk.base.a.a.a r6 = com.efs.sdk.base.p039a.p040a.C5641a.m4024a()
            java.lang.String r7 = r4.m4035b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = "/apm_cc"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r6 = r6.f4613a
            if (r6 == 0) goto L5b
            java.lang.String r6 = "get config from server, url is "
            java.lang.String r9 = java.lang.String.valueOf(r8)
            java.lang.String r6 = r6.concat(r9)
            java.lang.String r9 = "efs.px.api"
            com.efs.sdk.base.p039a.p050h.C5697d.m4181a(r9, r6)
        L5b:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r3)
            java.lang.String r9 = "wpk-header"
            r6.put(r9, r7)
            com.efs.sdk.base.a.h.b.d r7 = new com.efs.sdk.base.a.h.b.d
            r7.<init>(r8)
            com.efs.sdk.base.a.h.b.d r6 = r7.m4171a(r6)
            com.efs.sdk.base.a.a.b r7 = com.efs.sdk.base.p039a.p040a.C5642b.m4030a()
            com.efs.sdk.base.a.h.b.d r6 = r6.m4169a(r7)
            com.efs.sdk.base.a.h.b.c r6 = r6.m4168a()
            com.efs.sdk.base.a.h.b.b r7 = r6.f4752a
            java.lang.String r8 = "get"
            r7.f4749e = r8
            java.lang.Object r6 = r6.m4147a()
            com.efs.sdk.base.http.HttpResponse r6 = (com.efs.sdk.base.http.HttpResponse) r6
            boolean r7 = r6.succ
            if (r7 == 0) goto L8d
            java.lang.String r2 = r6.data
            goto La8
        L8d:
            java.lang.String r7 = r6.getBizCode()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto La7
            java.lang.String r7 = "1000"
            java.lang.String r6 = r6.getBizCode()
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto La4
            goto La7
        La4:
            int r5 = r5 + 1
            goto L2c
        La7:
            return r2
        La8:
            java.lang.String r0 = "config request succ, config is:\n "
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r3)
            com.efs.sdk.base.p039a.p050h.C5697d.m4181a(r1, r0)
            return r2
        Lb6:
            java.lang.String r0 = "Config refresh fail, network is disconnected."
            com.efs.sdk.base.p039a.p050h.C5697d.m4181a(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p039a.p042c.p043a.C5654a.refresh():java.lang.String");
    }
}
