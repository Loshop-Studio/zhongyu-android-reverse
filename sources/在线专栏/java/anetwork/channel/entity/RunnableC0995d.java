package anetwork.channel.entity;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableNetworkListener;
import java.util.Map;

/* renamed from: anetwork.channel.entity.d */
/* loaded from: classes.dex */
class RunnableC0995d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ParcelableNetworkListener f5613a;

    /* renamed from: b */
    final /* synthetic */ int f5614b;

    /* renamed from: c */
    final /* synthetic */ Map f5615c;

    /* renamed from: d */
    final /* synthetic */ C0994c f5616d;

    RunnableC0995d(C0994c c0994c, ParcelableNetworkListener parcelableNetworkListener, int i4, Map map) {
        this.f5616d = c0994c;
        this.f5613a = parcelableNetworkListener;
        this.f5614b = i4;
        this.f5615c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5613a.onResponseCode(this.f5614b, new ParcelableHeader(this.f5614b, this.f5615c));
        } catch (RemoteException unused) {
        }
    }
}
