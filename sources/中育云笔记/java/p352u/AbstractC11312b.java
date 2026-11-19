package p352u;

import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import je.C9742v;
import je.InterfaceC9725e;
import p181hd.InterfaceC9529a;
import p327s.InterfaceC11013f;

/* renamed from: u.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11312b {
    /* renamed from: b */
    public static final InterfaceC11013f m25257b() {
        return m25258c(new C9742v());
    }

    /* renamed from: c */
    public static final InterfaceC11013f m25258c(InterfaceC9725e.a aVar) {
        return CallFactoryNetworkClient.m3252b(CallFactoryNetworkClient.m3253c(aVar));
    }

    /* renamed from: d */
    public static final NetworkFetcher.Factory m25259d() {
        return new NetworkFetcher.Factory(new InterfaceC9529a() { // from class: u.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AbstractC11312b.m25257b();
            }
        }, null, null, 6, null);
    }
}
