package p270w;

import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import kotlin.jvm.functions.Function0;
import p011a9.C0059v;
import p011a9.InterfaceC0042e;
import p249u.InterfaceC9520f;

/* renamed from: w.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9724b {
    /* renamed from: b */
    public static final InterfaceC9520f m16254b() {
        return m16255c(new C0059v());
    }

    /* renamed from: c */
    public static final InterfaceC9520f m16255c(InterfaceC0042e.a aVar) {
        return CallFactoryNetworkClient.m3161b(CallFactoryNetworkClient.m3162c(aVar));
    }

    /* renamed from: d */
    public static final NetworkFetcher.Factory m16256d() {
        return new NetworkFetcher.Factory(new Function0() { // from class: w.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC9724b.m16254b();
            }
        }, null, null, 6, null);
    }
}
