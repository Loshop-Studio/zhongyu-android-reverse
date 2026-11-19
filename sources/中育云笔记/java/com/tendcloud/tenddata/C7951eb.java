package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.tendcloud.tenddata.eb */
/* loaded from: classes5.dex */
public final class C7951eb {

    /* renamed from: a */
    static Handler f14813a = null;

    /* renamed from: b */
    static HandlerThread f14814b = null;

    /* renamed from: c */
    private static final String f14815c = "check_wifi_permission";

    /* renamed from: d */
    private static final String f14816d = "check_bs_permission";

    /* renamed from: e */
    private static final String f14817e = "check_gps_permission";

    /* renamed from: f */
    private static final int f14818f = 1;

    /* renamed from: g */
    private static final int f14819g = 2;

    /* renamed from: h */
    private static final int f14820h = 3;

    /* renamed from: i */
    private static final int f14821i = 4;

    /* renamed from: j */
    private static final long f14822j = 600000;

    /* renamed from: k */
    private static volatile C7951eb f14823k;

    /* renamed from: l */
    private static WifiManager f14824l;

    static {
        try {
            C7913cr.m11625a().register(m11845a());
        } catch (Throwable unused) {
        }
    }

    private C7951eb() {
        try {
            HandlerThread handlerThread = new HandlerThread("locHandlerThread", 10);
            f14814b = handlerThread;
            handlerThread.start();
            f14813a = new Handler(f14814b.getLooper()) { // from class: com.tendcloud.tenddata.eb.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i10 = message.what;
                    if (i10 == 1) {
                        C7951eb.this.m11847b();
                        return;
                    }
                    if (i10 == 3) {
                        C7951eb.this.m11849c();
                    } else {
                        if (i10 != 4) {
                            return;
                        }
                        C7951eb.this.m11849c();
                        C7951eb.this.m11847b();
                    }
                }
            };
            m11850a(4, 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: c */
    public void m11849c() {
        try {
            if (!m11851a(f14816d)) {
                m11850a(3, 180000L);
                return;
            }
            Context context = C7843ab.f14307g;
            if (context != null) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager.getSimState() == 5) {
                    telephonyManager.getCellLocation();
                    telephonyManager.listen(new C7956eg(), 16);
                    CellLocation.requestLocationUpdate();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventLocationEvent(C7958ei c7958ei) {
    }

    /* renamed from: a */
    public static C7951eb m11845a() {
        if (f14823k == null) {
            synchronized (C7951eb.class) {
                try {
                    if (f14823k == null) {
                        f14823k = new C7951eb();
                    }
                } finally {
                }
            }
        }
        return f14823k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11847b() {
        try {
            if (!m11851a(f14815c)) {
                m11850a(1, 180000L);
                return;
            }
            WifiManager wifiManager = (WifiManager) C7843ab.f14307g.getSystemService(UtilityImpl.NET_TYPE_WIFI);
            f14824l = wifiManager;
            if (wifiManager.isWifiEnabled()) {
                C7843ab.f14307g.registerReceiver(new C7957eh(f14824l), new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m11850a(int i10, long j10) {
        try {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            f14813a.sendMessageDelayed(messageObtain, j10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m11851a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            android.content.Context r1 = com.tendcloud.tenddata.C7843ab.f14307g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.tendcloud.tenddata.C7912cq.m11607b(r1, r2)     // Catch: java.lang.Throwable -> L7a
            android.content.Context r2 = com.tendcloud.tenddata.C7843ab.f14307g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = com.tendcloud.tenddata.C7912cq.m11607b(r2, r3)     // Catch: java.lang.Throwable -> L7a
            r3 = 1
            if (r2 != 0) goto L21
            android.content.Context r2 = com.tendcloud.tenddata.C7843ab.f14307g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = com.tendcloud.tenddata.C7912cq.m11607b(r2, r4)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L1f
            goto L21
        L1f:
            r2 = r0
            goto L22
        L21:
            r2 = r3
        L22:
            android.content.Context r4 = com.tendcloud.tenddata.C7843ab.f14307g     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = com.tendcloud.tenddata.C7912cq.m11607b(r4, r5)     // Catch: java.lang.Throwable -> L7a
            int r5 = r9.hashCode()     // Catch: java.lang.Throwable -> L7a
            r6 = -1215157370(0xffffffffb7922b86, float:-1.7424823E-5)
            r7 = 2
            if (r5 == r6) goto L53
            r6 = 1219872770(0x48b5c802, float:372288.06)
            if (r5 == r6) goto L49
            r6 = 1355887771(0x50d1349b, float:2.8079086E10)
            if (r5 == r6) goto L3f
            goto L5d
        L3f:
            java.lang.String r5 = "check_gps_permission"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L5d
            r9 = r3
            goto L5e
        L49:
            java.lang.String r5 = "check_wifi_permission"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L5d
            r9 = r7
            goto L5e
        L53:
            java.lang.String r5 = "check_bs_permission"
            boolean r9 = r9.equals(r5)     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L5d
            r9 = r0
            goto L5e
        L5d:
            r9 = -1
        L5e:
            if (r9 == 0) goto L75
            if (r9 == r3) goto L74
            if (r9 == r7) goto L65
            goto L7a
        L65:
            r9 = 23
            boolean r9 = com.tendcloud.tenddata.C7912cq.m11595a(r9)     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto L73
            if (r4 == 0) goto L72
            if (r2 == 0) goto L72
            return r3
        L72:
            return r0
        L73:
            return r4
        L74:
            return r2
        L75:
            if (r2 == 0) goto L7a
            if (r1 == 0) goto L7a
            return r3
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7951eb.m11851a(java.lang.String):boolean");
    }
}
