package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;

/* renamed from: anetwork.channel.entity.e */
/* loaded from: classes.dex */
class RunnableC0996e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f5617a;

    /* renamed from: b */
    final /* synthetic */ ByteArray f5618b;

    /* renamed from: c */
    final /* synthetic */ int f5619c;

    /* renamed from: d */
    final /* synthetic */ ParcelableNetworkListener f5620d;

    /* renamed from: e */
    final /* synthetic */ C0994c f5621e;

    RunnableC0996e(C0994c c0994c, int i4, ByteArray byteArray, int i5, ParcelableNetworkListener parcelableNetworkListener) {
        this.f5621e = c0994c;
        this.f5617a = i4;
        this.f5618b = byteArray;
        this.f5619c = i5;
        this.f5620d = parcelableNetworkListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f5621e.f5611d) {
                try {
                    if (this.f5621e.f5610c == null) {
                        this.f5621e.f5610c = new ParcelableInputStreamImpl();
                        this.f5621e.f5610c.init(this.f5621e.f5612e, this.f5619c);
                        this.f5621e.f5610c.write(this.f5618b);
                        this.f5620d.onInputStreamGet(this.f5621e.f5610c);
                    } else {
                        this.f5621e.f5610c.write(this.f5618b);
                    }
                } catch (Exception unused) {
                    if (this.f5621e.f5610c == null) {
                    } else {
                        this.f5621e.f5610c.close();
                    }
                }
            } else {
                this.f5620d.onDataReceived(new DefaultProgressEvent(this.f5617a, this.f5618b.getDataLength(), this.f5619c, this.f5618b.getBuffer()));
            }
        } catch (RemoteException unused2) {
        }
    }
}
