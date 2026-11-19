package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import anet.channel.request.Request;
import com.alibaba.sdk.android.tbrest.rest.RestConstants;
import com.taobao.agoo.p087a.p088a.AbstractC7706b;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aj */
/* loaded from: classes5.dex */
public final class RunnableC7777aj implements Runnable {

    /* renamed from: a */
    protected int f13708a;

    /* renamed from: b */
    protected long f13709b;

    /* renamed from: c */
    protected long f13710c;

    /* renamed from: d */
    private int f13711d;

    /* renamed from: e */
    private int f13712e;

    /* renamed from: f */
    private final Context f13713f;

    /* renamed from: g */
    private final int f13714g;

    /* renamed from: h */
    private final byte[] f13715h;

    /* renamed from: i */
    private final C7768aa f13716i;

    /* renamed from: j */
    private final C7770ac f13717j;

    /* renamed from: k */
    private final C7773af f13718k;

    /* renamed from: l */
    private final C7776ai f13719l;

    /* renamed from: m */
    private final int f13720m;

    /* renamed from: n */
    private final InterfaceC7775ah f13721n;

    /* renamed from: o */
    private final InterfaceC7775ah f13722o;

    /* renamed from: p */
    private String f13723p;

    /* renamed from: q */
    private final String f13724q;

    /* renamed from: r */
    private final Map<String, String> f13725r;

    /* renamed from: s */
    private boolean f13726s;

    public RunnableC7777aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC7775ah interfaceC7775ah, boolean z10) {
        this(context, i10, i11, bArr, str, str2, interfaceC7775ah, 2, RestConstants.G_MAX_READ_CONNECTION_STREAM_TIME_OUT, z10);
    }

    /* renamed from: a */
    private static void m10598a(String str) {
        C7779al.m10619e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    /* renamed from: b */
    public final void m10603b(long j10) {
        this.f13710c += j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C7770ac c7770ac;
        Pair pair;
        boolean zBooleanValue;
        try {
            this.f13708a = 0;
            this.f13709b = 0L;
            this.f13710c = 0L;
            if (C7769ab.m10522c(this.f13713f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f13715h;
                str = (bArr == null || bArr.length == 0) ? "request package is empty!" : (this.f13713f == null || this.f13716i == null || (c7770ac = this.f13717j) == null || this.f13718k == null) ? "illegal access error" : c7770ac.m10551c() == null ? "illegal local strategy" : null;
            }
            if (str != null) {
                m10599a(false, 0, str);
                return;
            }
            byte[] bArrM10667a = C7783ap.m10667a(this.f13715h);
            if (bArrM10667a == null) {
                m10599a(false, 0, "failed to zip request body");
                return;
            }
            HashMap map = new HashMap(10);
            map.put("tls", "1");
            map.put("prodId", this.f13716i.m10493e());
            map.put("bundleId", this.f13716i.f13636c);
            map.put("appVer", this.f13716i.f13648o);
            Map<String, String> map2 = this.f13725r;
            if (map2 != null) {
                map.putAll(map2);
            }
            map.put(AbstractC7706b.JSON_CMD, Integer.toString(this.f13714g));
            map.put("platformId", Byte.toString((byte) 1));
            map.put("sdkVer", this.f13716i.f13641h);
            map.put("strategylastUpdateTime", Long.toString(this.f13717j.m10551c().f13491o));
            this.f13719l.m10591a(this.f13720m, System.currentTimeMillis());
            String strM10601b = this.f13723p;
            this.f13717j.m10551c();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= this.f13711d) {
                    m10599a(false, i11, "failed after many attempts");
                    return;
                }
                if (i12 > 1) {
                    C7779al.m10618d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i12));
                    C7783ap.m10672b(this.f13712e);
                    if (i12 == this.f13711d) {
                        C7779al.m10618d("[Upload] Use the back-up url at the last time: %s", this.f13724q);
                        strM10601b = this.f13724q;
                    }
                }
                C7779al.m10617c("[Upload] Send %d bytes", Integer.valueOf(bArrM10667a.length));
                strM10601b = m10601b(strM10601b);
                C7779al.m10617c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM10601b, Integer.valueOf(this.f13714g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] bArrM10566a = this.f13718k.m10566a(strM10601b, bArrM10667a, this, map);
                Map<String, String> map3 = this.f13718k.f13675c;
                Pair<Boolean, Boolean> pairM10597a = m10597a(bArrM10566a, map3);
                if (((Boolean) pairM10597a.first).booleanValue()) {
                    Pair<Boolean, Boolean> pairM10596a = m10596a(map3);
                    if (((Boolean) pairM10596a.first).booleanValue()) {
                        byte[] bArrM10677b = C7783ap.m10677b(bArrM10566a);
                        if (bArrM10677b != null) {
                            bArrM10566a = bArrM10677b;
                        }
                        C7812br c7812brM10557a = C7772ae.m10557a(bArrM10566a);
                        if (c7812brM10557a == null) {
                            m10599a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer numValueOf = Integer.valueOf(c7812brM10557a.f13998b);
                            byte[] bArr2 = c7812brM10557a.f13999c;
                            C7779al.m10617c("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (m10600a(c7812brM10557a, this.f13716i, this.f13717j)) {
                                m10599a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                m10599a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        zBooleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        zBooleanValue = ((Boolean) pairM10596a.second).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) pairM10597a.second).booleanValue();
                }
                if (!zBooleanValue) {
                    return;
                }
                i11 = 1;
                i10 = i12;
            }
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public RunnableC7777aj(Context context, int i10, int i11, byte[] bArr, String str, String str2, InterfaceC7775ah interfaceC7775ah, int i12, int i13, boolean z10) {
        this.f13711d = 2;
        this.f13712e = RestConstants.G_MAX_READ_CONNECTION_STREAM_TIME_OUT;
        this.f13723p = null;
        this.f13708a = 0;
        this.f13709b = 0L;
        this.f13710c = 0L;
        this.f13726s = false;
        this.f13713f = context;
        this.f13716i = C7768aa.m10478a(context);
        this.f13715h = bArr;
        this.f13717j = C7770ac.m10542a();
        if (C7773af.f13673a == null) {
            C7773af.f13673a = new C7773af(context);
        }
        this.f13718k = C7773af.f13673a;
        C7776ai c7776aiM10578a = C7776ai.m10578a();
        this.f13719l = c7776aiM10578a;
        this.f13720m = i10;
        this.f13723p = str;
        this.f13724q = str2;
        this.f13721n = interfaceC7775ah;
        this.f13722o = c7776aiM10578a.f13692a;
        this.f13714g = i11;
        if (i12 > 0) {
            this.f13711d = i12;
        }
        if (i13 > 0) {
            this.f13712e = i13;
        }
        this.f13726s = z10;
        this.f13725r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10599a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f13714g
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
            com.tencent.bugly.proguard.C7779al.m10613a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.C7779al.m10619e(r0, r6)
        L35:
            long r0 = r4.f13709b
            long r2 = r4.f13710c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f13719l
            boolean r0 = r4.f13726s
            long r0 = r6.m10590a(r0)
            long r2 = r4.f13709b
            long r0 = r0 + r2
            long r2 = r4.f13710c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f13719l
            boolean r2 = r4.f13726s
            r6.m10594a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f13721n
            if (r6 == 0) goto L5c
            r6.mo10577a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f13722o
            if (r6 == 0) goto L63
            r6.mo10577a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC7777aj.m10599a(boolean, int, java.lang.String):void");
    }

    /* renamed from: b */
    private static String m10601b(String str) {
        if (C7783ap.m10676b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th) {
            C7779al.m10614a(th);
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m10600a(C7812br c7812br, C7768aa c7768aa, C7770ac c7770ac) throws NumberFormatException {
        if (c7812br == null) {
            C7779al.m10618d("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = c7812br.f13997a;
        if (b10 != 0) {
            C7779al.m10619e("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!C7783ap.m10676b(c7812br.f14003g) && !C7768aa.m10480b().m10500i().equals(c7812br.f14003g)) {
                C7837w.m10986a().m11006a(C7770ac.f13663a, "device", c7812br.f14003g.getBytes(Request.DEFAULT_CHARSET), true);
                c7768aa.m10492d(c7812br.f14003g);
            }
        } catch (Throwable th) {
            C7779al.m10614a(th);
        }
        c7768aa.f13646m = c7812br.f14001e;
        int i10 = c7812br.f13998b;
        if (i10 == 510) {
            byte[] bArr = c7812br.f13999c;
            if (bArr == null) {
                C7779al.m10619e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i10));
                return false;
            }
            C7814bt c7814bt = (C7814bt) C7772ae.m10559a(bArr, C7814bt.class);
            if (c7814bt == null) {
                C7779al.m10619e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c7812br.f13998b));
                return false;
            }
            c7770ac.m10549a(c7814bt);
        }
        return true;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m10597a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m10598a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C7779al.m10617c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m10599a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C7779al.m10617c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* renamed from: a */
    public final void m10602a(long j10) {
        this.f13708a++;
        this.f13709b += j10;
    }

    /* renamed from: a */
    private Pair<Boolean, Boolean> m10596a(Map<String, String> map) {
        int i10;
        if (map != null && map.size() != 0) {
            if (!map.containsKey(NotificationCompat.CATEGORY_STATUS)) {
                C7779al.m10618d("[Upload] Headers does not contain %s", NotificationCompat.CATEGORY_STATUS);
            } else if (!map.containsKey("Bugly-Version")) {
                C7779al.m10618d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    C7779al.m10618d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    C7779al.m10617c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i10 = Integer.parseInt(map.get(NotificationCompat.CATEGORY_STATUS));
                    } catch (Throwable unused) {
                        i10 = -1;
                    }
                    try {
                        C7779al.m10617c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i10 != 0) {
                            m10599a(false, 1, "status of server is ".concat(String.valueOf(i10)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        m10598a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i10));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            C7779al.m10618d("[Upload] Headers is empty.", new Object[0]);
        }
        C7779al.m10617c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        m10598a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C7779al.m10617c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        C7779al.m10617c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
