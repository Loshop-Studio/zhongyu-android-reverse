package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;
import anetwork.channel.interceptor.Callback;
import java.util.List;
import java.util.Map;

/* renamed from: anetwork.channel.entity.c */
/* loaded from: classes.dex */
public class C0994c implements Callback {

    /* renamed from: a */
    private ParcelableNetworkListener f5608a;

    /* renamed from: b */
    private String f5609b;

    /* renamed from: c */
    private ParcelableInputStreamImpl f5610c = null;

    /* renamed from: d */
    private boolean f5611d;

    /* renamed from: e */
    private C0998g f5612e;

    public C0994c(ParcelableNetworkListener parcelableNetworkListener, C0998g c0998g) {
        this.f5611d = false;
        this.f5608a = parcelableNetworkListener;
        this.f5612e = c0998g;
        if (parcelableNetworkListener != null) {
            try {
                if ((parcelableNetworkListener.getListenerState() & 8) != 0) {
                    this.f5611d = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onDataReceiveSize(int i4, int i5, ByteArray byteArray) {
        ParcelableNetworkListener parcelableNetworkListener = this.f5608a;
        if (parcelableNetworkListener != null) {
            m4715a(new RunnableC0996e(this, i4, byteArray, i5, parcelableNetworkListener));
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onFinish(DefaultFinishEvent defaultFinishEvent) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.Repeater", "[onFinish] ", this.f5609b, new Object[0]);
        }
        ParcelableNetworkListener parcelableNetworkListener = this.f5608a;
        if (parcelableNetworkListener != null) {
            RunnableC0997f runnableC0997f = new RunnableC0997f(this, defaultFinishEvent, parcelableNetworkListener);
            RequestStatistic requestStatistic = defaultFinishEvent.f5498rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbDispatch = System.currentTimeMillis();
            }
            m4715a(runnableC0997f);
        }
        this.f5608a = null;
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onResponseCode(int i4, Map<String, List<String>> map) {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.Repeater", "[onResponseCode]", this.f5609b, new Object[0]);
        }
        ParcelableNetworkListener parcelableNetworkListener = this.f5608a;
        if (parcelableNetworkListener != null) {
            m4715a(new RunnableC0995d(this, parcelableNetworkListener, i4, map));
        }
    }

    /* renamed from: a */
    private void m4715a(Runnable runnable) {
        if (this.f5612e.m4729c()) {
            runnable.run();
        } else {
            String str = this.f5609b;
            C0992a.m4713a(str != null ? str.hashCode() : hashCode(), runnable);
        }
    }

    /* renamed from: a */
    public void m4720a(String str) {
        this.f5609b = str;
    }
}
