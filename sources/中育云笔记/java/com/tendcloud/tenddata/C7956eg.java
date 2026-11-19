package com.tendcloud.tenddata;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

/* renamed from: com.tendcloud.tenddata.eg */
/* loaded from: classes5.dex */
final class C7956eg extends PhoneStateListener {

    /* renamed from: a */
    static final long f14835a = 180000;

    /* renamed from: d */
    int f14838d;

    /* renamed from: b */
    long f14836b = 0;

    /* renamed from: c */
    long f14837c = 0;

    /* renamed from: e */
    int f14839e = 0;

    /* renamed from: a */
    private void m11875a() {
        try {
            C7951eb.f14813a.post(new Runnable() { // from class: com.tendcloud.tenddata.eg.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C7956eg.this.f14836b = System.currentTimeMillis();
                        C7956eg c7956eg = C7956eg.this;
                        int i10 = c7956eg.f14838d;
                        if (i10 == c7956eg.f14839e || i10 <= 1 || c7956eg.f14836b - c7956eg.f14837c <= C7956eg.f14835a) {
                            return;
                        }
                        C7961el c7961el = new C7961el();
                        c7961el.f14869b = "env";
                        c7961el.f14870c = "cellUpdate";
                        c7961el.f14868a = AbstractC7841a.ENV;
                        C7913cr.m11625a().post(c7961el);
                        C7956eg c7956eg2 = C7956eg.this;
                        c7956eg2.f14837c = c7956eg2.f14836b;
                        c7956eg2.f14839e = c7956eg2.f14838d;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        try {
            if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                this.f14838d = ((GsmCellLocation) cellLocation).getLac();
                m11875a();
            } else if (cellLocation.getClass().equals(CdmaCellLocation.class)) {
                this.f14838d = ((CdmaCellLocation) cellLocation).getNetworkId();
                m11875a();
            }
        } catch (Throwable unused) {
        }
    }
}
