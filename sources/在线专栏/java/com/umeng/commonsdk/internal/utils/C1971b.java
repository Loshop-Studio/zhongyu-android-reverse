package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C1965a;
import com.umeng.commonsdk.internal.C1966b;
import com.umeng.commonsdk.statistics.common.ULog;
import org.android.agoo.message.MessageService;

/* renamed from: com.umeng.commonsdk.internal.utils.b */
/* loaded from: classes.dex */
public class C1971b {

    /* renamed from: b */
    private static final String f9226b = "BaseStationUtils";

    /* renamed from: c */
    private static boolean f9227c = false;

    /* renamed from: d */
    private static Context f9228d;

    /* renamed from: a */
    PhoneStateListener f9229a;

    /* renamed from: e */
    private TelephonyManager f9230e;

    /* renamed from: com.umeng.commonsdk.internal.utils.b$a */
    private static class a {

        /* renamed from: a */
        private static final C1971b f9232a = new C1971b(C1971b.f9228d);

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public String m7457e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f9228d.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            String simOperator = telephonyManager.getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            if (!simOperator.equals("46000") && !simOperator.equals("46002")) {
                if (simOperator.equals("46001")) {
                    return "中国联通";
                }
                if (simOperator.equals("46003")) {
                    return "中国电信";
                }
                return null;
            }
            return "中国移动";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public synchronized void m7460c() {
        ULog.m7603e(f9226b, "base station unRegisterListener");
        try {
            TelephonyManager telephonyManager = this.f9230e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f9229a, 0);
            }
            f9227c = false;
        } catch (Throwable unused) {
        }
    }

    private C1971b(Context context) {
        this.f9229a = new PhoneStateListener() { // from class: com.umeng.commonsdk.internal.utils.b.1
            @Override // android.telephony.PhoneStateListener
            public void onSignalStrengthsChanged(SignalStrength signalStrength) throws NumberFormatException {
                String str;
                super.onSignalStrengthsChanged(signalStrength);
                ULog.m7603e(C1971b.f9226b, "base station onSignalStrengthsChanged");
                try {
                    C1971b.this.f9230e = (TelephonyManager) C1971b.f9228d.getSystemService("phone");
                    String[] strArrSplit = signalStrength.toString().split(" ");
                    String str2 = null;
                    if (C1971b.this.f9230e != null && C1971b.this.f9230e.getNetworkType() == 13) {
                        str = "" + Integer.parseInt(strArrSplit[9]);
                    } else if (C1971b.this.f9230e == null || !(C1971b.this.f9230e.getNetworkType() == 8 || C1971b.this.f9230e.getNetworkType() == 10 || C1971b.this.f9230e.getNetworkType() == 9 || C1971b.this.f9230e.getNetworkType() == 3)) {
                        str = ((signalStrength.getGsmSignalStrength() * 2) - 113) + "";
                    } else {
                        String strM7457e = C1971b.this.m7457e();
                        if (!TextUtils.isEmpty(strM7457e) && strM7457e.equals("中国移动")) {
                            str2 = MessageService.MSG_DB_READY_REPORT;
                        } else if (!TextUtils.isEmpty(strM7457e) && strM7457e.equals("中国联通")) {
                            str2 = signalStrength.getCdmaDbm() + "";
                        } else if (!TextUtils.isEmpty(strM7457e) && strM7457e.equals("中国电信")) {
                            str2 = signalStrength.getEvdoDbm() + "";
                        }
                        str = str2;
                    }
                    ULog.m7603e(C1971b.f9226b, "stationStrength is " + str);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            UMWorkDispatch.sendEvent(C1971b.f9228d, C1965a.f9176i, C1966b.m7392a(C1971b.f9228d).m7393a(), str);
                        } catch (Throwable unused) {
                        }
                    }
                    C1971b.this.m7460c();
                } catch (Exception unused2) {
                }
            }
        };
        if (context != null) {
            try {
                this.f9230e = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void m7459b() {
        ULog.m7603e(f9226b, "base station registerListener");
        try {
            TelephonyManager telephonyManager = this.f9230e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f9229a, 256);
            }
            f9227c = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C1971b m7454a(Context context) {
        if (f9228d == null && context != null) {
            f9228d = context.getApplicationContext();
        }
        return a.f9232a;
    }

    /* renamed from: a */
    public synchronized boolean m7458a() {
        return f9227c;
    }
}
