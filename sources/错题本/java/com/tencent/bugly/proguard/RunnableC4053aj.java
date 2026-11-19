package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aj */
/* loaded from: classes3.dex */
public final class RunnableC4053aj implements Runnable {

    /* renamed from: a */
    protected int f3498a;

    /* renamed from: b */
    protected long f3499b;

    /* renamed from: c */
    protected long f3500c;

    /* renamed from: d */
    private int f3501d;

    /* renamed from: e */
    private int f3502e;

    /* renamed from: f */
    private final Context f3503f;

    /* renamed from: g */
    private final int f3504g;

    /* renamed from: h */
    private final byte[] f3505h;

    /* renamed from: i */
    private final C4044aa f3506i;

    /* renamed from: j */
    private final C4046ac f3507j;

    /* renamed from: k */
    private final C4049af f3508k;

    /* renamed from: l */
    private final C4052ai f3509l;

    /* renamed from: m */
    private final int f3510m;

    /* renamed from: n */
    private final InterfaceC4051ah f3511n;

    /* renamed from: o */
    private final InterfaceC4051ah f3512o;

    /* renamed from: p */
    private String f3513p;

    /* renamed from: q */
    private final String f3514q;

    /* renamed from: r */
    private final Map<String, String> f3515r;

    /* renamed from: s */
    private boolean f3516s;

    public RunnableC4053aj(Context context, int i, int i8, byte[] bArr, String str, String str2, InterfaceC4051ah interfaceC4051ah, boolean z8) {
        this(context, i, i8, bArr, str, str2, interfaceC4051ah, 2, 30000, z8);
    }

    /* renamed from: a */
    private static void m3006a(String str) {
        C4055al.m3027e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m3011b(long j7) {
        this.f3500c += j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C4046ac c4046ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f3498a = 0;
            this.f3499b = 0L;
            this.f3500c = 0L;
            if (C4045ab.m2932c(this.f3503f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f3505h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f3503f == null || this.f3506i == null || (c4046ac = this.f3507j) == null || this.f3508k == null) ? "illegal access error" : c4046ac.m2960c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m3007a(false, 0, str);
                return;
            }
            byte[] bArrM3075a = C4059ap.m3075a(this.f3505h);
            if (bArrM3075a == null) {
                m3007a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f3506i.m2903e());
            map.put("bundleId", this.f3506i.f3433c);
            map.put("appVer", this.f3506i.f3445o);
            Map<String, String> map2 = this.f3515r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f3504g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f3506i.f3438h);
            map.put("strategylastUpdateTime", Long.toString(this.f3507j.m2960c().f3283o));
            this.f3509l.m2999a(this.f3510m, System.currentTimeMillis());
            String strM3009b = this.f3513p;
            this.f3507j.m2960c();
            int i = 0;
            int i8 = 0;
            while (true) {
                int i9 = i + 1;
                if (i >= this.f3501d) {
                    m3007a(false, i8, "failed after many attempts");
                    return;
                }
                if (i9 > 1) {
                    C4055al.m3026d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i9));
                    C4059ap.m3080b(this.f3502e);
                    if (i9 == this.f3501d) {
                        C4055al.m3026d("[Upload] Use the back-up url at the last time: %s", this.f3514q);
                        strM3009b = this.f3514q;
                    }
                }
                C4055al.m3025c("[Upload] Send %d bytes", Integer.valueOf(bArrM3075a.length));
                strM3009b = m3009b(strM3009b);
                C4055al.m3025c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM3009b, Integer.valueOf(this.f3504g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM2975a = this.f3508k.m2975a(strM3009b, bArrM3075a, this, map);
                Map<String, String> map3 = this.f3508k.f3472c;
                Pair<Boolean, Boolean> pairM3005a = m3005a(bArrM2975a, map3);
                if (((Boolean) pairM3005a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM3004a = m3004a(map3);
                    if (((Boolean) pairM3004a.first).booleanValue()) {
                        byte[] bArrM3085b = C4059ap.m3085b(bArrM2975a);
                        if (bArrM3085b != null) {
                            bArrM2975a = bArrM3085b;
                        }
                        C4090br c4090brM2966a = C4048ae.m2966a(bArrM2975a);
                        if (c4090brM2966a == null) {
                            m3007a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c4090brM2966a.f3758b);
                            byte[] bArr2 = c4090brM2966a.f3759c;
                            C4055al.m3025c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m3008a(c4090brM2966a, this.f3506i, this.f3507j)) {
                                m3007a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m3007a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM3004a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM3005a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i8 = 1;
                i = i9;
            }
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC4053aj(Context context, int i, int i8, byte[] bArr, String str, String str2, InterfaceC4051ah interfaceC4051ah, int i9, int i10, boolean z8) {
        this.f3501d = 2;
        this.f3502e = 30000;
        this.f3513p = null;
        this.f3498a = 0;
        this.f3499b = 0L;
        this.f3500c = 0L;
        this.f3516s = false;
        this.f3503f = context;
        this.f3506i = C4044aa.m2888a(context);
        this.f3505h = bArr;
        this.f3507j = C4046ac.m2951a();
        if (C4049af.f3470a == null) {
            C4049af.f3470a = new C4049af(context);
        }
        this.f3508k = C4049af.f3470a;
        C4052ai c4052aiM2986a = C4052ai.m2986a();
        this.f3509l = c4052aiM2986a;
        this.f3510m = i;
        this.f3513p = str;
        this.f3514q = str2;
        this.f3511n = interfaceC4051ah;
        this.f3512o = c4052aiM2986a.f3487a;
        this.f3504g = i8;
        if (i9 > 0) {
            this.f3501d = i9;
        }
        if (i10 > 0) {
            this.f3502e = i10;
        }
        this.f3516s = z8;
        this.f3515r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3007a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f3504g
            r1 = 630(0x276, float:8.83E-43)
            if (r0 == r1) goto L1a
            r1 = 640(0x280, float:8.97E-43)
            if (r0 == r1) goto L17
            r1 = 830(0x33e, float:1.163E-42)
            if (r0 == r1) goto L1a
            r1 = 840(0x348, float:1.177E-42)
            if (r0 == r1) goto L17
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L1c
        L17:
            java.lang.String r0 = "userinfo"
            goto L1c
        L1a:
            java.lang.String r0 = "crash"
        L1c:
            if (r5 == 0) goto L28
            java.lang.String r6 = "[Upload] Success: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.bugly.proguard.C4055al.m3021a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C4055al.m3027e(r0, r6)
        L35:
            long r0 = r4.f3499b
            long r2 = r4.f3500c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f3509l
            boolean r0 = r4.f3516s
            long r0 = r6.m2998a(r0)
            long r2 = r4.f3499b
            long r0 = r0 + r2
            long r2 = r4.f3500c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f3509l
            boolean r2 = r4.f3516s
            r6.m3002a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f3511n
            if (r6 == 0) goto L5c
            r6.mo106a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f3512o
            if (r6 == 0) goto L63
            r6.mo106a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC4053aj.m3007a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m3009b(String str) {
        if (C4059ap.m3084b(str)) {
            return str;
        }
        try {
            return str + "?aid=" + UUID.randomUUID().toString();
        } catch (Throwable th) {
            C4055al.m3022a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m3008a(C4090br c4090br, C4044aa c4044aa, C4046ac c4046ac) throws NumberFormatException {
        if (c4090br == null) {
            C4055al.m3026d("resp == null!", new Object[0]);
            return false;
        }
        byte b6 = c4090br.f3757a;
        if (b6 != 0) {
            C4055al.m3027e("resp result error %d", Byte.valueOf(b6));
            return false;
        }
        try {
            if (!C4059ap.m3084b(c4090br.f3763g) && !C4044aa.m2890b().m2910i().equals(c4090br.f3763g)) {
                C4143w.m3393a().m3413a(C4046ac.f3460a, "device", c4090br.f3763g.getBytes("UTF-8"), true);
                c4044aa.m2902d(c4090br.f3763g);
            }
        } catch (Throwable th) {
            C4055al.m3022a(th);
        }
        c4044aa.f3443m = c4090br.f3761e;
        int i = c4090br.f3758b;
        if (i == 510) {
            byte[] bArr = c4090br.f3759c;
            if (bArr == null) {
                C4055al.m3027e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i));
                return false;
            }
            C4092bt c4092bt = (C4092bt) C4048ae.m2968a(bArr, C4092bt.class);
            if (c4092bt == null) {
                C4055al.m3027e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c4090br.f3758b));
                return false;
            }
            c4046ac.m2958a(c4092bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m3005a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m3006a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C4055al.m3025c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m3007a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C4055al.m3025c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m3010a(long j7) {
        this.f3498a++;
        this.f3499b += j7;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m3004a(Map<String, String> map) {
        int i;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C4055al.m3026d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C4055al.m3026d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C4055al.m3026d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C4055al.m3025c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i = -1;
                    }
                    try {
                        C4055al.m3025c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i != 0) {
                            m3007a(false, 1, "status of server is ".concat(String.valueOf(i)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m3006a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C4055al.m3026d("[Upload] Headers is empty.", new Object[0]);
        }
        C4055al.m3025c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m3006a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C4055al.m3025c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C4055al.m3025c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
