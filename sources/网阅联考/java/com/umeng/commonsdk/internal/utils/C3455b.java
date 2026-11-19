package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.statistics.common.ULog;

/* renamed from: com.umeng.commonsdk.internal.utils.b */
/* loaded from: classes2.dex */
public class C3455b {

    /* renamed from: b */
    private static final String f2634b = "BaseStationUtils";

    /* renamed from: c */
    private static boolean f2635c = false;

    /* renamed from: d */
    private static Context f2636d;

    /* renamed from: a */
    PhoneStateListener f2637a;

    /* renamed from: e */
    private TelephonyManager f2638e;

    /* renamed from: com.umeng.commonsdk.internal.utils.b$a */
    public static class a {

        /* renamed from: a */
        private static final C3455b f2640a = new C3455b(C3455b.f2636d);

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public String m3534e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f2636d.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
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
    public synchronized void m3537c() {
        ULog.m3680e(f2634b, "base station unRegisterListener");
        try {
            TelephonyManager telephonyManager = this.f2638e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f2637a, 0);
            }
            f2635c = false;
        } catch (Throwable unused) {
        }
    }

    private C3455b(Context context) {
        this.f2637a = new PhoneStateListener() { // from class: com.umeng.commonsdk.internal.utils.b.1
            @Override // android.telephony.PhoneStateListener
            public void onSignalStrengthsChanged(SignalStrength signalStrength) throws NumberFormatException {
                String str;
                super.onSignalStrengthsChanged(signalStrength);
                ULog.m3680e(C3455b.f2634b, "base station onSignalStrengthsChanged");
                try {
                    C3455b.this.f2638e = (TelephonyManager) C3455b.f2636d.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                    String[] strArrSplit = signalStrength.toString().split(" ");
                    if (C3455b.this.f2638e != null && C3455b.this.f2638e.getNetworkType() == 13) {
                        str = "" + Integer.parseInt(strArrSplit[9]);
                    } else if (C3455b.this.f2638e == null || !(C3455b.this.f2638e.getNetworkType() == 8 || C3455b.this.f2638e.getNetworkType() == 10 || C3455b.this.f2638e.getNetworkType() == 9 || C3455b.this.f2638e.getNetworkType() == 3)) {
                        str = ((signalStrength.getGsmSignalStrength() * 2) - 113) + "";
                    } else {
                        String strM3534e = C3455b.this.m3534e();
                        if (!TextUtils.isEmpty(strM3534e) && strM3534e.equals("中国移动")) {
                            str = "0";
                        } else if (!TextUtils.isEmpty(strM3534e) && strM3534e.equals("中国联通")) {
                            str = signalStrength.getCdmaDbm() + "";
                        } else if (TextUtils.isEmpty(strM3534e) || !strM3534e.equals("中国电信")) {
                            str = null;
                        } else {
                            str = signalStrength.getEvdoDbm() + "";
                        }
                    }
                    ULog.m3680e(C3455b.f2634b, "stationStrength is " + str);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            UMWorkDispatch.sendEvent(C3455b.f2636d, C3449a.f2584i, C3450b.m3469a(C3455b.f2636d).m3470a(), str);
                        } catch (Throwable unused) {
                        }
                    }
                    C3455b.this.m3537c();
                } catch (Exception unused2) {
                }
            }
        };
        if (context != null) {
            try {
                this.f2638e = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void m3536b() {
        ULog.m3680e(f2634b, "base station registerListener");
        try {
            TelephonyManager telephonyManager = this.f2638e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f2637a, 256);
            }
            f2635c = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C3455b m3531a(Context context) {
        if (f2636d == null && context != null) {
            f2636d = context.getApplicationContext();
        }
        return a.f2640a;
    }

    /* renamed from: a */
    public synchronized boolean m3535a() {
        return f2635c;
    }
}
