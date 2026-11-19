package anetwork.channel.entity;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableNetworkListener;
import java.util.Map;

/* renamed from: anetwork.channel.entity.d */
/* loaded from: classes3.dex */
class RunnableC5118d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ParcelableNetworkListener f2891a;

    /* renamed from: b */
    final /* synthetic */ int f2892b;

    /* renamed from: c */
    final /* synthetic */ Map f2893c;

    /* renamed from: d */
    final /* synthetic */ C5117c f2894d;

    public RunnableC5118d(C5117c c5117c, ParcelableNetworkListener parcelableNetworkListener, int i10, Map map) {
        this.f2894d = c5117c;
        this.f2891a = parcelableNetworkListener;
        this.f2892b = i10;
        this.f2893c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f2891a.onResponseCode(this.f2892b, new ParcelableHeader(this.f2892b, this.f2893c));
        } catch (RemoteException unused) {
        }
    }
}
