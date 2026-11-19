package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aj */
/* loaded from: classes4.dex */
public final class RunnableC6434aj implements Runnable {

    /* renamed from: a */
    protected int f4609a;

    /* renamed from: b */
    protected long f4610b;

    /* renamed from: c */
    protected long f4611c;

    /* renamed from: d */
    private int f4612d;

    /* renamed from: e */
    private int f4613e;

    /* renamed from: f */
    private final Context f4614f;

    /* renamed from: g */
    private final int f4615g;

    /* renamed from: h */
    private final byte[] f4616h;

    /* renamed from: i */
    private final C6425aa f4617i;

    /* renamed from: j */
    private final C6427ac f4618j;

    /* renamed from: k */
    private final C6430af f4619k;

    /* renamed from: l */
    private final C6433ai f4620l;

    /* renamed from: m */
    private final int f4621m;

    /* renamed from: n */
    private final InterfaceC6432ah f4622n;

    /* renamed from: o */
    private final InterfaceC6432ah f4623o;

    /* renamed from: p */
    private String f4624p;

    /* renamed from: q */
    private final String f4625q;

    /* renamed from: r */
    private final Map<String, String> f4626r;

    /* renamed from: s */
    private boolean f4627s;

    public RunnableC6434aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6432ah interfaceC6432ah, boolean z10) {
        this(context, i10, i11, bArr, str, str2, interfaceC6432ah, 2, 30000, z10);
    }

    /* renamed from: a */
    private static void m4268a(String str) {
        C6436al.m4289e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m4273b(long j10) {
        this.f4611c += j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C6427ac c6427ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f4609a = 0;
            this.f4610b = 0L;
            this.f4611c = 0L;
            if (C6426ab.m4192c(this.f4614f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f4616h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f4614f == null || this.f4617i == null || (c6427ac = this.f4618j) == null || this.f4619k == null) ? "illegal access error" : c6427ac.m4221c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m4269a(false, 0, str);
                return;
            }
            byte[] bArrM4337a = C6440ap.m4337a(this.f4616h);
            if (bArrM4337a == null) {
                m4269a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f4617i.m4163e());
            map.put("bundleId", this.f4617i.f4537c);
            map.put("appVer", this.f4617i.f4549o);
            Map<String, String> map2 = this.f4626r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f4615g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f4617i.f4542h);
            map.put("strategylastUpdateTime", Long.toString(this.f4618j.m4221c().f4392o));
            this.f4620l.m4261a(this.f4621m, System.currentTimeMillis());
            String strM4271b = this.f4624p;
            this.f4618j.m4221c();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= this.f4612d) {
                    m4269a(false, i11, "failed after many attempts");
                    return;
                }
                if (i12 > 1) {
                    C6436al.m4288d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i12));
                    C6440ap.m4342b(this.f4613e);
                    if (i12 == this.f4612d) {
                        C6436al.m4288d("[Upload] Use the back-up url at the last time: %s", this.f4625q);
                        strM4271b = this.f4625q;
                    }
                }
                C6436al.m4287c("[Upload] Send %d bytes", Integer.valueOf(bArrM4337a.length));
                strM4271b = m4271b(strM4271b);
                C6436al.m4287c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM4271b, Integer.valueOf(this.f4615g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM4236a = this.f4619k.m4236a(strM4271b, bArrM4337a, this, map);
                Map<String, String> map3 = this.f4619k.f4576c;
                Pair<Boolean, Boolean> pairM4267a = m4267a(bArrM4236a, map3);
                if (((Boolean) pairM4267a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM4266a = m4266a(map3);
                    if (((Boolean) pairM4266a.first).booleanValue()) {
                        byte[] bArrM4347b = C6440ap.m4347b(bArrM4236a);
                        if (bArrM4347b != null) {
                            bArrM4236a = bArrM4347b;
                        }
                        C6469br c6469brM4227a = C6429ae.m4227a(bArrM4236a);
                        if (c6469brM4227a == null) {
                            m4269a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c6469brM4227a.f4899b);
                            byte[] bArr2 = c6469brM4227a.f4900c;
                            C6436al.m4287c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m4270a(c6469brM4227a, this.f4617i, this.f4618j)) {
                                m4269a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m4269a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM4266a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM4267a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i11 = 1;
                i10 = i12;
            }
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC6434aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6432ah interfaceC6432ah, int i12, int i13, boolean z10) {
        this.f4612d = 2;
        this.f4613e = 30000;
        this.f4624p = null;
        this.f4609a = 0;
        this.f4610b = 0L;
        this.f4611c = 0L;
        this.f4627s = false;
        this.f4614f = context;
        this.f4617i = C6425aa.m4148a(context);
        this.f4616h = bArr;
        this.f4618j = C6427ac.m4212a();
        if (C6430af.f4574a == null) {
            C6430af.f4574a = new C6430af(context);
        }
        this.f4619k = C6430af.f4574a;
        C6433ai c6433aiM4248a = C6433ai.m4248a();
        this.f4620l = c6433aiM4248a;
        this.f4621m = i10;
        this.f4624p = str;
        this.f4625q = str2;
        this.f4622n = interfaceC6432ah;
        this.f4623o = c6433aiM4248a.f4593a;
        this.f4615g = i11;
        if (i12 > 0) {
            this.f4612d = i12;
        }
        if (i13 > 0) {
            this.f4613e = i13;
        }
        this.f4627s = z10;
        this.f4626r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4269a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f4615g
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
            com.tencent.bugly.proguard.C6436al.m4283a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C6436al.m4289e(r0, r6)
        L35:
            long r0 = r4.f4610b
            long r2 = r4.f4611c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f4620l
            boolean r0 = r4.f4627s
            long r0 = r6.m4260a(r0)
            long r2 = r4.f4610b
            long r0 = r0 + r2
            long r2 = r4.f4611c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f4620l
            boolean r2 = r4.f4627s
            r6.m4264a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f4622n
            if (r6 == 0) goto L5c
            r6.mo4247a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f4623o
            if (r6 == 0) goto L63
            r6.mo4247a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC6434aj.m4269a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m4271b(String str) {
        if (C6440ap.m4346b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C6436al.m4284a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m4270a(C6469br c6469br, C6425aa c6425aa, C6427ac c6427ac) throws NumberFormatException {
        if (c6469br == null) {
            C6436al.m4288d("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = c6469br.f4898a;
        if (b10 != 0) {
            C6436al.m4289e("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!C6440ap.m4346b(c6469br.f4904g) && !C6425aa.m4150b().m4170i().equals(c6469br.f4904g)) {
                C6494w.m4656a().m4676a(C6427ac.f4564a, "device", c6469br.f4904g.getBytes("UTF-8"), true);
                c6425aa.m4162d(c6469br.f4904g);
            }
        } catch (Throwable th) {
            C6436al.m4284a(th);
        }
        c6425aa.f4547m = c6469br.f4902e;
        int i10 = c6469br.f4899b;
        if (i10 == 510) {
            byte[] bArr = c6469br.f4900c;
            if (bArr == null) {
                C6436al.m4289e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i10));
                return false;
            }
            C6471bt c6471bt = (C6471bt) C6429ae.m4229a(bArr, C6471bt.class);
            if (c6471bt == null) {
                C6436al.m4289e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c6469br.f4899b));
                return false;
            }
            c6427ac.m4219a(c6471bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m4267a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m4268a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C6436al.m4287c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m4269a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C6436al.m4287c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m4272a(long j10) {
        this.f4609a++;
        this.f4610b += j10;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m4266a(Map<String, String> map) {
        int i10;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C6436al.m4288d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C6436al.m4288d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C6436al.m4288d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C6436al.m4287c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i10 = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i10 = -1;
                    }
                    try {
                        C6436al.m4287c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i10 != 0) {
                            m4269a(false, 1, "status of server is ".concat(String.valueOf(i10)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m4268a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i10));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C6436al.m4288d("[Upload] Headers is empty.", new Object[0]);
        }
        C6436al.m4287c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m4268a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C6436al.m4287c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C6436al.m4287c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
