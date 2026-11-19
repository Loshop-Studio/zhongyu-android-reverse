package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.liteav.audio.impl.a */
/* loaded from: classes4.dex */
public class C6552a {

    /* renamed from: a */
    private static final C6552a f5122a = new C6552a();

    /* renamed from: b */
    private ConcurrentHashMap<Integer, WeakReference<InterfaceC6553b>> f5123b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private PhoneStateListener f5124c = null;

    /* renamed from: d */
    private Context f5125d;

    private C6552a() {
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f5124c == null || this.f5125d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (C6552a.this.f5124c != null && C6552a.this.f5125d != null) {
                    try {
                        ((TelephonyManager) C6552a.this.f5125d.getApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).listen(C6552a.this.f5124c, 0);
                    } catch (Exception e10) {
                        TXCLog.m4992e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e10);
                    }
                }
                C6552a.this.f5124c = null;
            }
        });
    }

    /* renamed from: a */
    public static C6552a m4758a() {
        return f5122a;
    }

    /* renamed from: a */
    public synchronized void m4763a(InterfaceC6553b interfaceC6553b) {
        if (interfaceC6553b == null) {
            return;
        }
        this.f5123b.put(Integer.valueOf(interfaceC6553b.hashCode()), new WeakReference<>(interfaceC6553b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m4759a(int i10) {
        try {
            Iterator<Map.Entry<Integer, WeakReference<InterfaceC6553b>>> it = this.f5123b.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC6553b interfaceC6553b = it.next().getValue().get();
                if (interfaceC6553b != null) {
                    interfaceC6553b.onCallStateChanged(i10);
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m4762a(Context context) {
        if (this.f5124c != null) {
            return;
        }
        this.f5125d = context.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (C6552a.this.f5124c != null) {
                    return;
                }
                C6552a.this.f5124c = new PhoneStateListener() { // from class: com.tencent.liteav.audio.impl.a.1.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i10, String str) {
                        super.onCallStateChanged(i10, str);
                        TXCLog.m4994i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:" + i10);
                        C6552a.this.m4759a(i10);
                    }
                };
                try {
                    ((TelephonyManager) C6552a.this.f5125d.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).listen(C6552a.this.f5124c, 32);
                } catch (Exception e10) {
                    TXCLog.m4992e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e10);
                }
            }
        });
    }
}
