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
public final class RunnableC5789aj implements Runnable {

    /* renamed from: a */
    protected int f3987a;

    /* renamed from: b */
    protected long f3988b;

    /* renamed from: c */
    protected long f3989c;

    /* renamed from: d */
    private int f3990d;

    /* renamed from: e */
    private int f3991e;

    /* renamed from: f */
    private final Context f3992f;

    /* renamed from: g */
    private final int f3993g;

    /* renamed from: h */
    private final byte[] f3994h;

    /* renamed from: i */
    private final C5780aa f3995i;

    /* renamed from: j */
    private final C5782ac f3996j;

    /* renamed from: k */
    private final C5785af f3997k;

    /* renamed from: l */
    private final C5788ai f3998l;

    /* renamed from: m */
    private final int f3999m;

    /* renamed from: n */
    private final InterfaceC5787ah f4000n;

    /* renamed from: o */
    private final InterfaceC5787ah f4001o;

    /* renamed from: p */
    private String f4002p;

    /* renamed from: q */
    private final String f4003q;

    /* renamed from: r */
    private final Map<String, String> f4004r;

    /* renamed from: s */
    private boolean f4005s;

    public RunnableC5789aj(Context context, int i6, int i7, byte[] bArr, String str, String str2, InterfaceC5787ah interfaceC5787ah, boolean z6) {
        this(context, i6, i7, bArr, str, str2, interfaceC5787ah, 2, 30000, z6);
    }

    /* renamed from: a */
    private static void m3913a(String str) {
        C5791al.m3934e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m3918b(long j6) {
        this.f3989c += j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C5782ac c5782ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f3987a = 0;
            this.f3988b = 0L;
            this.f3989c = 0L;
            if (C5781ab.m3837c(this.f3992f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f3994h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f3992f == null || this.f3995i == null || (c5782ac = this.f3996j) == null || this.f3997k == null) ? "illegal access error" : c5782ac.m3866c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m3914a(false, 0, str);
                return;
            }
            byte[] bArrM3982a = C5795ap.m3982a(this.f3994h);
            if (bArrM3982a == null) {
                m3914a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f3995i.m3808e());
            map.put("bundleId", this.f3995i.f3915c);
            map.put("appVer", this.f3995i.f3927o);
            Map<String, String> map2 = this.f4004r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f3993g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f3995i.f3920h);
            map.put("strategylastUpdateTime", Long.toString(this.f3996j.m3866c().f3770o));
            this.f3998l.m3906a(this.f3999m, System.currentTimeMillis());
            String strM3916b = this.f4002p;
            this.f3996j.m3866c();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = i6 + 1;
                if (i6 >= this.f3990d) {
                    m3914a(false, i7, "failed after many attempts");
                    return;
                }
                if (i8 > 1) {
                    C5791al.m3933d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i8));
                    C5795ap.m3987b(this.f3991e);
                    if (i8 == this.f3990d) {
                        C5791al.m3933d("[Upload] Use the back-up url at the last time: %s", this.f4003q);
                        strM3916b = this.f4003q;
                    }
                }
                C5791al.m3932c("[Upload] Send %d bytes", Integer.valueOf(bArrM3982a.length));
                strM3916b = m3916b(strM3916b);
                C5791al.m3932c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM3916b, Integer.valueOf(this.f3993g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM3881a = this.f3997k.m3881a(strM3916b, bArrM3982a, this, map);
                Map<String, String> map3 = this.f3997k.f3954c;
                Pair<Boolean, Boolean> pairM3912a = m3912a(bArrM3881a, map3);
                if (((Boolean) pairM3912a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM3911a = m3911a(map3);
                    if (((Boolean) pairM3911a.first).booleanValue()) {
                        byte[] bArrM3992b = C5795ap.m3992b(bArrM3881a);
                        if (bArrM3992b != null) {
                            bArrM3881a = bArrM3992b;
                        }
                        C5824br c5824brM3872a = C5784ae.m3872a(bArrM3881a);
                        if (c5824brM3872a == null) {
                            m3914a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c5824brM3872a.f4277b);
                            byte[] bArr2 = c5824brM3872a.f4278c;
                            C5791al.m3932c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m3915a(c5824brM3872a, this.f3995i, this.f3996j)) {
                                m3914a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m3914a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM3911a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM3912a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i7 = 1;
                i6 = i8;
            }
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC5789aj(Context context, int i6, int i7, byte[] bArr, String str, String str2, InterfaceC5787ah interfaceC5787ah, int i8, int i9, boolean z6) {
        this.f3990d = 2;
        this.f3991e = 30000;
        this.f4002p = null;
        this.f3987a = 0;
        this.f3988b = 0L;
        this.f3989c = 0L;
        this.f4005s = false;
        this.f3992f = context;
        this.f3995i = C5780aa.m3793a(context);
        this.f3994h = bArr;
        this.f3996j = C5782ac.m3857a();
        if (C5785af.f3952a == null) {
            C5785af.f3952a = new C5785af(context);
        }
        this.f3997k = C5785af.f3952a;
        C5788ai c5788aiM3893a = C5788ai.m3893a();
        this.f3998l = c5788aiM3893a;
        this.f3999m = i6;
        this.f4002p = str;
        this.f4003q = str2;
        this.f4000n = interfaceC5787ah;
        this.f4001o = c5788aiM3893a.f3971a;
        this.f3993g = i7;
        if (i8 > 0) {
            this.f3990d = i8;
        }
        if (i9 > 0) {
            this.f3991e = i9;
        }
        this.f4005s = z6;
        this.f4004r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3914a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f3993g
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
            com.tencent.bugly.proguard.C5791al.m3928a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C5791al.m3934e(r0, r6)
        L35:
            long r0 = r4.f3988b
            long r2 = r4.f3989c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f3998l
            boolean r0 = r4.f4005s
            long r0 = r6.m3905a(r0)
            long r2 = r4.f3988b
            long r0 = r0 + r2
            long r2 = r4.f3989c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f3998l
            boolean r2 = r4.f4005s
            r6.m3909a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f4000n
            if (r6 == 0) goto L5c
            r6.mo3892a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f4001o
            if (r6 == 0) goto L63
            r6.mo3892a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC5789aj.m3914a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m3916b(String str) {
        if (C5795ap.m3991b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C5791al.m3929a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m3915a(C5824br c5824br, C5780aa c5780aa, C5782ac c5782ac) throws NumberFormatException {
        if (c5824br == null) {
            C5791al.m3933d("resp == null!", new Object[0]);
            return false;
        }
        byte b7 = c5824br.f4276a;
        if (b7 != 0) {
            C5791al.m3934e("resp result error %d", Byte.valueOf(b7));
            return false;
        }
        try {
            if (!C5795ap.m3991b(c5824br.f4282g) && !C5780aa.m3795b().m3815i().equals(c5824br.f4282g)) {
                C5849w.m4301a().m4321a(C5782ac.f3942a, "device", c5824br.f4282g.getBytes("UTF-8"), true);
                c5780aa.m3807d(c5824br.f4282g);
            }
        } catch (Throwable th) {
            C5791al.m3929a(th);
        }
        c5780aa.f3925m = c5824br.f4280e;
        int i6 = c5824br.f4277b;
        if (i6 == 510) {
            byte[] bArr = c5824br.f4278c;
            if (bArr == null) {
                C5791al.m3934e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i6));
                return false;
            }
            C5826bt c5826bt = (C5826bt) C5784ae.m3874a(bArr, C5826bt.class);
            if (c5826bt == null) {
                C5791al.m3934e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c5824br.f4277b));
                return false;
            }
            c5782ac.m3864a(c5826bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m3912a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m3913a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C5791al.m3932c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m3914a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C5791al.m3932c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m3917a(long j6) {
        this.f3987a++;
        this.f3988b += j6;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m3911a(Map<String, String> map) {
        int i6;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C5791al.m3933d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C5791al.m3933d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C5791al.m3933d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C5791al.m3932c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i6 = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i6 = -1;
                    }
                    try {
                        C5791al.m3932c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i6), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i6 != 0) {
                            m3914a(false, 1, "status of server is ".concat(String.valueOf(i6)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m3913a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i6));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C5791al.m3933d("[Upload] Headers is empty.", new Object[0]);
        }
        C5791al.m3932c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m3913a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C5791al.m3932c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C5791al.m3932c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
