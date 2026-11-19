package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;

/* renamed from: anetwork.channel.entity.e */
/* loaded from: classes3.dex */
class RunnableC5119e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2895a;

    /* renamed from: b */
    final /* synthetic */ ByteArray f2896b;

    /* renamed from: c */
    final /* synthetic */ int f2897c;

    /* renamed from: d */
    final /* synthetic */ ParcelableNetworkListener f2898d;

    /* renamed from: e */
    final /* synthetic */ C5117c f2899e;

    public RunnableC5119e(C5117c c5117c, int i10, ByteArray byteArray, int i11, ParcelableNetworkListener parcelableNetworkListener) {
        this.f2899e = c5117c;
        this.f2895a = i10;
        this.f2896b = byteArray;
        this.f2897c = i11;
        this.f2898d = parcelableNetworkListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f2899e.f2889d) {
                this.f2898d.onDataReceived(new DefaultProgressEvent(this.f2895a, this.f2896b.getDataLength(), this.f2897c, this.f2896b.getBuffer()));
                return;
            }
            try {
                if (this.f2899e.f2888c != null) {
                    this.f2899e.f2888c.write(this.f2896b);
                    return;
                }
                this.f2899e.f2888c = new ParcelableInputStreamImpl();
                this.f2899e.f2888c.init(this.f2899e.f2890e, this.f2897c);
                this.f2899e.f2888c.write(this.f2896b);
                this.f2898d.onInputStreamGet(this.f2899e.f2888c);
            } catch (Exception unused) {
                if (this.f2899e.f2888c != null) {
                    this.f2899e.f2888c.close();
                }
            }
        } catch (RemoteException unused2) {
        }
    }
}
