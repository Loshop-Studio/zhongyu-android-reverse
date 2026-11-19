package p277w;

import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import kotlin.jvm.functions.Function0;
import p172l8.C8923v;
import p172l8.InterfaceC8906e;
import p257u.InterfaceC9648f;

/* renamed from: w.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9788b {
    /* renamed from: b */
    public static final InterfaceC9648f m16590b() {
        return m16591c(new C8923v());
    }

    /* renamed from: c */
    public static final InterfaceC9648f m16591c(InterfaceC8906e.a aVar) {
        return CallFactoryNetworkClient.m2881b(CallFactoryNetworkClient.m2882c(aVar));
    }

    /* renamed from: d */
    public static final NetworkFetcher.Factory m16592d() {
        return new NetworkFetcher.Factory(new Function0() { // from class: w.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC9788b.m16590b();
            }
        }, null, null, 6, null);
    }
}
