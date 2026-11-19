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
public final class RunnableC6412aj implements Runnable {

    /* renamed from: a */
    protected int f5266a;

    /* renamed from: b */
    protected long f5267b;

    /* renamed from: c */
    protected long f5268c;

    /* renamed from: d */
    private int f5269d;

    /* renamed from: e */
    private int f5270e;

    /* renamed from: f */
    private final Context f5271f;

    /* renamed from: g */
    private final int f5272g;

    /* renamed from: h */
    private final byte[] f5273h;

    /* renamed from: i */
    private final C6403aa f5274i;

    /* renamed from: j */
    private final C6405ac f5275j;

    /* renamed from: k */
    private final C6408af f5276k;

    /* renamed from: l */
    private final C6411ai f5277l;

    /* renamed from: m */
    private final int f5278m;

    /* renamed from: n */
    private final InterfaceC6410ah f5279n;

    /* renamed from: o */
    private final InterfaceC6410ah f5280o;

    /* renamed from: p */
    private String f5281p;

    /* renamed from: q */
    private final String f5282q;

    /* renamed from: r */
    private final Map<String, String> f5283r;

    /* renamed from: s */
    private boolean f5284s;

    public RunnableC6412aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6410ah interfaceC6410ah, boolean z9) {
        this(context, i10, i11, bArr, str, str2, interfaceC6410ah, 2, 30000, z9);
    }

    /* renamed from: a */
    private static void m4908a(String str) {
        C6414al.m4929e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m4913b(long j10) {
        this.f5268c += j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C6405ac c6405ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f5266a = 0;
            this.f5267b = 0L;
            this.f5268c = 0L;
            if (C6404ab.m4832c(this.f5271f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f5273h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f5271f == null || this.f5274i == null || (c6405ac = this.f5275j) == null || this.f5276k == null) ? "illegal access error" : c6405ac.m4861c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m4909a(false, 0, str);
                return;
            }
            byte[] bArrM4977a = C6418ap.m4977a(this.f5273h);
            if (bArrM4977a == null) {
                m4909a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f5274i.m4803e());
            map.put("bundleId", this.f5274i.f5194c);
            map.put("appVer", this.f5274i.f5206o);
            Map<String, String> map2 = this.f5283r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put("cmd", Integer.toString(this.f5272g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f5274i.f5199h);
            map.put("strategylastUpdateTime", Long.toString(this.f5275j.m4861c().f5049o));
            this.f5277l.m4901a(this.f5278m, System.currentTimeMillis());
            String strM4911b = this.f5281p;
            this.f5275j.m4861c();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= this.f5269d) {
                    m4909a(false, i11, "failed after many attempts");
                    return;
                }
                if (i12 > 1) {
                    C6414al.m4928d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i12));
                    C6418ap.m4982b(this.f5270e);
                    if (i12 == this.f5269d) {
                        C6414al.m4928d("[Upload] Use the back-up url at the last time: %s", this.f5282q);
                        strM4911b = this.f5282q;
                    }
                }
                C6414al.m4927c("[Upload] Send %d bytes", Integer.valueOf(bArrM4977a.length));
                strM4911b = m4911b(strM4911b);
                C6414al.m4927c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM4911b, Integer.valueOf(this.f5272g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM4876a = this.f5276k.m4876a(strM4911b, bArrM4977a, this, map);
                Map<String, String> map3 = this.f5276k.f5233c;
                Pair<Boolean, Boolean> pairM4907a = m4907a(bArrM4876a, map3);
                if (((Boolean) pairM4907a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM4906a = m4906a(map3);
                    if (((Boolean) pairM4906a.first).booleanValue()) {
                        byte[] bArrM4987b = C6418ap.m4987b(bArrM4876a);
                        if (bArrM4987b != null) {
                            bArrM4876a = bArrM4987b;
                        }
                        C6447br c6447brM4867a = C6407ae.m4867a(bArrM4876a);
                        if (c6447brM4867a == null) {
                            m4909a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c6447brM4867a.f5556b);
                            byte[] bArr2 = c6447brM4867a.f5557c;
                            C6414al.m4927c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m4910a(c6447brM4867a, this.f5274i, this.f5275j)) {
                                m4909a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m4909a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM4906a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM4907a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i11 = 1;
                i10 = i12;
            }
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC6412aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6410ah interfaceC6410ah, int i12, int i13, boolean z9) {
        this.f5269d = 2;
        this.f5270e = 30000;
        this.f5281p = null;
        this.f5266a = 0;
        this.f5267b = 0L;
        this.f5268c = 0L;
        this.f5284s = false;
        this.f5271f = context;
        this.f5274i = C6403aa.m4788a(context);
        this.f5273h = bArr;
        this.f5275j = C6405ac.m4852a();
        if (C6408af.f5231a == null) {
            C6408af.f5231a = new C6408af(context);
        }
        this.f5276k = C6408af.f5231a;
        C6411ai c6411aiM4888a = C6411ai.m4888a();
        this.f5277l = c6411aiM4888a;
        this.f5278m = i10;
        this.f5281p = str;
        this.f5282q = str2;
        this.f5279n = interfaceC6410ah;
        this.f5280o = c6411aiM4888a.f5250a;
        this.f5272g = i11;
        if (i12 > 0) {
            this.f5269d = i12;
        }
        if (i13 > 0) {
            this.f5270e = i13;
        }
        this.f5284s = z9;
        this.f5283r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4909a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f5272g
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
            com.tencent.bugly.proguard.C6414al.m4923a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C6414al.m4929e(r0, r6)
        L35:
            long r0 = r4.f5267b
            long r2 = r4.f5268c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f5277l
            boolean r0 = r4.f5284s
            long r0 = r6.m4900a(r0)
            long r2 = r4.f5267b
            long r0 = r0 + r2
            long r2 = r4.f5268c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f5277l
            boolean r2 = r4.f5284s
            r6.m4904a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f5279n
            if (r6 == 0) goto L5c
            r6.mo4887a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f5280o
            if (r6 == 0) goto L63
            r6.mo4887a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC6412aj.m4909a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m4911b(String str) {
        if (C6418ap.m4986b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C6414al.m4924a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m4910a(C6447br c6447br, C6403aa c6403aa, C6405ac c6405ac) throws NumberFormatException {
        if (c6447br == null) {
            C6414al.m4928d("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = c6447br.f5555a;
        if (b10 != 0) {
            C6414al.m4929e("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!C6418ap.m4986b(c6447br.f5561g) && !C6403aa.m4790b().m4810i().equals(c6447br.f5561g)) {
                C6472w.m5296a().m5316a(C6405ac.f5221a, "device", c6447br.f5561g.getBytes("UTF-8"), true);
                c6403aa.m4802d(c6447br.f5561g);
            }
        } catch (Throwable th) {
            C6414al.m4924a(th);
        }
        c6403aa.f5204m = c6447br.f5559e;
        int i10 = c6447br.f5556b;
        if (i10 == 510) {
            byte[] bArr = c6447br.f5557c;
            if (bArr == null) {
                C6414al.m4929e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i10));
                return false;
            }
            C6449bt c6449bt = (C6449bt) C6407ae.m4869a(bArr, C6449bt.class);
            if (c6449bt == null) {
                C6414al.m4929e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c6447br.f5556b));
                return false;
            }
            c6405ac.m4859a(c6449bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m4907a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m4908a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C6414al.m4927c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m4909a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C6414al.m4927c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m4912a(long j10) {
        this.f5266a++;
        this.f5267b += j10;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m4906a(Map<String, String> map) {
        int i10;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C6414al.m4928d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C6414al.m4928d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C6414al.m4928d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C6414al.m4927c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i10 = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i10 = -1;
                    }
                    try {
                        C6414al.m4927c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i10 != 0) {
                            m4909a(false, 1, "status of server is ".concat(String.valueOf(i10)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m4908a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i10));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C6414al.m4928d("[Upload] Headers is empty.", new Object[0]);
        }
        C6414al.m4927c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m4908a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C6414al.m4927c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C6414al.m4927c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
