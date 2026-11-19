package com.efs.sdk.base.p035a.p038c.p039a;

import com.efs.sdk.base.IConfigRefreshAction;

/* renamed from: com.efs.sdk.base.a.c.a.a */
/* loaded from: classes.dex */
public final class C1286a implements IConfigRefreshAction {

    /* renamed from: com.efs.sdk.base.a.c.a.a$a */
    static class a {

        /* renamed from: a */
        private static final C1286a f7025a = new C1286a();
    }

    /* renamed from: a */
    public static C1286a m5452a() {
        return a.f7025a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        com.efs.sdk.base.p035a.p046h.C1329d.m5571a("efs.config", "config request succ, config is:\n ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        return r4;
     */
    @Override // com.efs.sdk.base.IConfigRefreshAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String refresh() {
        /*
            r10 = this;
            com.efs.sdk.base.a.c.a r0 = com.efs.sdk.base.p035a.p040d.C1293a.m5487a()
            android.content.Context r0 = r0.f7010c
            android.net.NetworkInfo r0 = com.efs.sdk.base.p035a.p046h.C1330e.m5574a(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L1e
            android.net.NetworkInfo$State r0 = r0.getState()
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r0 != r3) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.String r3 = "efs.config"
            java.lang.String r4 = ""
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Config refresh fail, network is disconnected."
            com.efs.sdk.base.p035a.p046h.C1329d.m5571a(r3, r0)
            return r4
        L2b:
            com.efs.sdk.base.a.c.a.c r0 = com.efs.sdk.base.p035a.p038c.p039a.C1288c.m5456a()
            java.lang.String r0 = r0.m5465a(r2)
            com.efs.sdk.base.a.a.c r5 = com.efs.sdk.base.p035a.p036a.C1275c.m5424a()
        L37:
            r6 = 3
            if (r1 >= r6) goto Lb3
            com.efs.sdk.base.a.a.a r6 = com.efs.sdk.base.p035a.p036a.C1273a.m5414a()
            java.lang.String r7 = r5.m5425b()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r9 = "/apm_cc"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r6 = r6.f6979a
            if (r6 == 0) goto L66
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "get config from server, url is "
            java.lang.String r6 = r9.concat(r6)
            java.lang.String r9 = "efs.px.api"
            com.efs.sdk.base.p035a.p046h.C1329d.m5571a(r9, r6)
        L66:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r2)
            java.lang.String r9 = "wpk-header"
            r6.put(r9, r7)
            com.efs.sdk.base.a.h.b.d r7 = new com.efs.sdk.base.a.h.b.d
            r7.<init>(r8)
            com.efs.sdk.base.a.h.b.d r6 = r7.m5561a(r6)
            com.efs.sdk.base.a.a.b r7 = com.efs.sdk.base.p035a.p036a.C1274b.m5420a()
            com.efs.sdk.base.a.h.b.d r6 = r6.m5559a(r7)
            com.efs.sdk.base.a.h.b.c r6 = r6.m5558a()
            com.efs.sdk.base.a.h.b.b r7 = r6.f7118a
            java.lang.String r8 = "get"
            r7.f7115e = r8
            java.lang.Object r6 = r6.m5537a()
            com.efs.sdk.base.http.HttpResponse r6 = (com.efs.sdk.base.http.HttpResponse) r6
            boolean r7 = r6.succ
            if (r7 == 0) goto L98
            java.lang.String r4 = r6.data
            goto Lb3
        L98:
            java.lang.String r7 = r6.getBizCode()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lb2
            java.lang.String r6 = r6.getBizCode()
            java.lang.String r7 = "1000"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto Laf
            goto Lb2
        Laf:
            int r1 = r1 + 1
            goto L37
        Lb2:
            return r4
        Lb3:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "config request succ, config is:\n "
            java.lang.String r0 = r1.concat(r0)
            com.efs.sdk.base.p035a.p046h.C1329d.m5571a(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p035a.p038c.p039a.C1286a.refresh():java.lang.String");
    }
}
