package android.support.v4.media;

import p129o2.C6268a;

/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
public abstract class AbstractC0034c {
    InterfaceC0033b mConnectionCallbackInternal;
    final Object mConnectionCallbackObj = new C0041j(new C6268a(this, 1));

    public abstract void onConnected();

    public abstract void onConnectionFailed();

    public abstract void onConnectionSuspended();

    public void setInternalConnectionCallback(InterfaceC0033b interfaceC0033b) {
        this.mConnectionCallbackInternal = interfaceC0033b;
    }
}
