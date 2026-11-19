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
/* loaded from: classes3.dex */
public class C5117c implements Callback {

    /* renamed from: a */
    private ParcelableNetworkListener f2886a;

    /* renamed from: b */
    private String f2887b;

    /* renamed from: c */
    private ParcelableInputStreamImpl f2888c = null;

    /* renamed from: d */
    private boolean f2889d;

    /* renamed from: e */
    private C5121g f2890e;

    public C5117c(ParcelableNetworkListener parcelableNetworkListener, C5121g c5121g) {
        this.f2889d = false;
        this.f2886a = parcelableNetworkListener;
        this.f2890e = c5121g;
        if (parcelableNetworkListener != null) {
            try {
                if ((parcelableNetworkListener.getListenerState() & 8) != 0) {
                    this.f2889d = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onDataReceiveSize(int i10, int i11, ByteArray byteArray) {
        ParcelableNetworkListener parcelableNetworkListener = this.f2886a;
        if (parcelableNetworkListener != null) {
            m2606a(new RunnableC5119e(this, i10, byteArray, i11, parcelableNetworkListener));
        }
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onFinish(DefaultFinishEvent defaultFinishEvent) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.Repeater", "[onFinish] ", this.f2887b, new Object[0]);
        }
        ParcelableNetworkListener parcelableNetworkListener = this.f2886a;
        if (parcelableNetworkListener != null) {
            RunnableC5120f runnableC5120f = new RunnableC5120f(this, defaultFinishEvent, parcelableNetworkListener);
            RequestStatistic requestStatistic = defaultFinishEvent.f2776rs;
            if (requestStatistic != null) {
                requestStatistic.rspCbDispatch = System.currentTimeMillis();
            }
            m2606a(runnableC5120f);
        }
        this.f2886a = null;
    }

    @Override // anetwork.channel.interceptor.Callback
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.Repeater", "[onResponseCode]", this.f2887b, new Object[0]);
        }
        ParcelableNetworkListener parcelableNetworkListener = this.f2886a;
        if (parcelableNetworkListener != null) {
            m2606a(new RunnableC5118d(this, parcelableNetworkListener, i10, map));
        }
    }

    /* renamed from: a */
    private void m2606a(Runnable runnable) {
        if (this.f2890e.m2620c()) {
            runnable.run();
        } else {
            String str = this.f2887b;
            C5115a.m2604a(str != null ? str.hashCode() : hashCode(), runnable);
        }
    }

    /* renamed from: a */
    public void m2611a(String str) {
        this.f2887b = str;
    }
}
