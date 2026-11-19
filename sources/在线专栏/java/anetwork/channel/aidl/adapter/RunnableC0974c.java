package anetwork.channel.aidl.adapter;

/* renamed from: anetwork.channel.aidl.adapter.c */
/* loaded from: classes.dex */
class RunnableC0974c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte f5522a;

    /* renamed from: b */
    final /* synthetic */ Object f5523b;

    /* renamed from: c */
    final /* synthetic */ ParcelableNetworkListenerWrapper f5524c;

    RunnableC0974c(ParcelableNetworkListenerWrapper parcelableNetworkListenerWrapper, byte b4, Object obj) {
        this.f5524c = parcelableNetworkListenerWrapper;
        this.f5522a = b4;
        this.f5523b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5524c.dispatchCallback(this.f5522a, this.f5523b);
    }
}
