package anetwork.channel.aidl.adapter;

/* renamed from: anetwork.channel.aidl.adapter.c */
/* loaded from: classes3.dex */
class RunnableC5097c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte f2800a;

    /* renamed from: b */
    final /* synthetic */ Object f2801b;

    /* renamed from: c */
    final /* synthetic */ ParcelableNetworkListenerWrapper f2802c;

    public RunnableC5097c(ParcelableNetworkListenerWrapper parcelableNetworkListenerWrapper, byte b10, Object obj) {
        this.f2802c = parcelableNetworkListenerWrapper;
        this.f2800a = b10;
        this.f2801b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2802c.dispatchCallback(this.f2800a, this.f2801b);
    }
}
