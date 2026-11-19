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
public final class RunnableC6672aj implements Runnable {

    /* renamed from: a */
    protected int f5843a;

    /* renamed from: b */
    protected long f5844b;

    /* renamed from: c */
    protected long f5845c;

    /* renamed from: d */
    private int f5846d;

    /* renamed from: e */
    private int f5847e;

    /* renamed from: f */
    private final Context f5848f;

    /* renamed from: g */
    private final int f5849g;

    /* renamed from: h */
    private final byte[] f5850h;

    /* renamed from: i */
    private final C6663aa f5851i;

    /* renamed from: j */
    private final C6665ac f5852j;

    /* renamed from: k */
    private final C6668af f5853k;

    /* renamed from: l */
    private final C6671ai f5854l;

    /* renamed from: m */
    private final int f5855m;

    /* renamed from: n */
    private final InterfaceC6670ah f5856n;

    /* renamed from: o */
    private final InterfaceC6670ah f5857o;

    /* renamed from: p */
    private String f5858p;

    /* renamed from: q */
    private final String f5859q;

    /* renamed from: r */
    private final Map<String, String> f5860r;

    /* renamed from: s */
    private boolean f5861s;

    public RunnableC6672aj(Context context, int i9, int i10, byte[] bArr, String str, String str2, InterfaceC6670ah interfaceC6670ah, boolean z9) {
        this(context, i9, i10, bArr, str, str2, interfaceC6670ah, 2, 30000, z9);
    }

    /* renamed from: a */
    private static void m5087a(String str) {
        C6674al.m5108e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m5092b(long j9) {
        this.f5845c += j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C6665ac c6665ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f5843a = 0;
            this.f5844b = 0L;
            this.f5845c = 0L;
            if (C6664ab.m5011c(this.f5848f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f5850h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f5848f == null || this.f5851i == null || (c6665ac = this.f5852j) == null || this.f5853k == null) ? "illegal access error" : c6665ac.m5040c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m5088a(false, 0, str);
                return;
            }
            byte[] bArrM5156a = C6678ap.m5156a(this.f5850h);
            if (bArrM5156a == null) {
                m5088a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f5851i.m4982e());
            map.put("bundleId", this.f5851i.f5771c);
            map.put("appVer", this.f5851i.f5783o);
            Map<String, String> map2 = this.f5860r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f5849g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f5851i.f5776h);
            map.put("strategylastUpdateTime", Long.toString(this.f5852j.m5040c().f5626o));
            this.f5854l.m5080a(this.f5855m, System.currentTimeMillis());
            String strM5090b = this.f5858p;
            this.f5852j.m5040c();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= this.f5846d) {
                    m5088a(false, i10, "failed after many attempts");
                    return;
                }
                if (i11 > 1) {
                    C6674al.m5107d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i11));
                    C6678ap.m5161b(this.f5847e);
                    if (i11 == this.f5846d) {
                        C6674al.m5107d("[Upload] Use the back-up url at the last time: %s", this.f5859q);
                        strM5090b = this.f5859q;
                    }
                }
                C6674al.m5106c("[Upload] Send %d bytes", Integer.valueOf(bArrM5156a.length));
                strM5090b = m5090b(strM5090b);
                C6674al.m5106c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM5090b, Integer.valueOf(this.f5849g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM5055a = this.f5853k.m5055a(strM5090b, bArrM5156a, this, map);
                Map<String, String> map3 = this.f5853k.f5810c;
                Pair<Boolean, Boolean> pairM5086a = m5086a(bArrM5055a, map3);
                if (((Boolean) pairM5086a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM5085a = m5085a(map3);
                    if (((Boolean) pairM5085a.first).booleanValue()) {
                        byte[] bArrM5166b = C6678ap.m5166b(bArrM5055a);
                        if (bArrM5166b != null) {
                            bArrM5055a = bArrM5166b;
                        }
                        C6707br c6707brM5046a = C6667ae.m5046a(bArrM5055a);
                        if (c6707brM5046a == null) {
                            m5088a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c6707brM5046a.f6133b);
                            byte[] bArr2 = c6707brM5046a.f6134c;
                            C6674al.m5106c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m5089a(c6707brM5046a, this.f5851i, this.f5852j)) {
                                m5088a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m5088a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM5085a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM5086a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i10 = 1;
                i9 = i11;
            }
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC6672aj(Context context, int i9, int i10, byte[] bArr, String str, String str2, InterfaceC6670ah interfaceC6670ah, int i11, int i12, boolean z9) {
        this.f5846d = 2;
        this.f5847e = 30000;
        this.f5858p = null;
        this.f5843a = 0;
        this.f5844b = 0L;
        this.f5845c = 0L;
        this.f5861s = false;
        this.f5848f = context;
        this.f5851i = C6663aa.m4967a(context);
        this.f5850h = bArr;
        this.f5852j = C6665ac.m5031a();
        if (C6668af.f5808a == null) {
            C6668af.f5808a = new C6668af(context);
        }
        this.f5853k = C6668af.f5808a;
        C6671ai c6671aiM5067a = C6671ai.m5067a();
        this.f5854l = c6671aiM5067a;
        this.f5855m = i9;
        this.f5858p = str;
        this.f5859q = str2;
        this.f5856n = interfaceC6670ah;
        this.f5857o = c6671aiM5067a.f5827a;
        this.f5849g = i10;
        if (i11 > 0) {
            this.f5846d = i11;
        }
        if (i12 > 0) {
            this.f5847e = i12;
        }
        this.f5861s = z9;
        this.f5860r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5088a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f5849g
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
            com.tencent.bugly.proguard.C6674al.m5102a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C6674al.m5108e(r0, r6)
        L35:
            long r0 = r4.f5844b
            long r2 = r4.f5845c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f5854l
            boolean r0 = r4.f5861s
            long r0 = r6.m5079a(r0)
            long r2 = r4.f5844b
            long r0 = r0 + r2
            long r2 = r4.f5845c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f5854l
            boolean r2 = r4.f5861s
            r6.m5083a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f5856n
            if (r6 == 0) goto L5c
            r6.mo5066a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f5857o
            if (r6 == 0) goto L63
            r6.mo5066a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC6672aj.m5088a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m5090b(String str) {
        if (C6678ap.m5165b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C6674al.m5103a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m5089a(C6707br c6707br, C6663aa c6663aa, C6665ac c6665ac) throws NumberFormatException {
        if (c6707br == null) {
            C6674al.m5107d("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = c6707br.f6132a;
        if (b10 != 0) {
            C6674al.m5108e("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!C6678ap.m5165b(c6707br.f6138g) && !C6663aa.m4969b().m4989i().equals(c6707br.f6138g)) {
                C6732w.m5475a().m5495a(C6665ac.f5798a, "device", c6707br.f6138g.getBytes("UTF-8"), true);
                c6663aa.m4981d(c6707br.f6138g);
            }
        } catch (Throwable th) {
            C6674al.m5103a(th);
        }
        c6663aa.f5781m = c6707br.f6136e;
        int i9 = c6707br.f6133b;
        if (i9 == 510) {
            byte[] bArr = c6707br.f6134c;
            if (bArr == null) {
                C6674al.m5108e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i9));
                return false;
            }
            C6709bt c6709bt = (C6709bt) C6667ae.m5048a(bArr, C6709bt.class);
            if (c6709bt == null) {
                C6674al.m5108e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c6707br.f6133b));
                return false;
            }
            c6665ac.m5038a(c6709bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m5086a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m5087a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C6674al.m5106c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m5088a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C6674al.m5106c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m5091a(long j9) {
        this.f5843a++;
        this.f5844b += j9;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m5085a(Map<String, String> map) {
        int i9;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C6674al.m5107d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C6674al.m5107d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C6674al.m5107d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C6674al.m5106c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i9 = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i9 = -1;
                    }
                    try {
                        C6674al.m5106c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i9), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i9 != 0) {
                            m5088a(false, 1, "status of server is ".concat(String.valueOf(i9)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m5087a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i9));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C6674al.m5107d("[Upload] Headers is empty.", new Object[0]);
        }
        C6674al.m5106c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m5087a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C6674al.m5106c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C6674al.m5106c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
