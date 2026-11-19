package p173w;

import coil3.network.NetworkFetcher;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import kotlin.jvm.functions.Function0;
import p058f5.C6356a0;
import p058f5.InterfaceC6363e;
import p159u.InterfaceC7739f;

/* renamed from: w.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7802b {
    /* renamed from: b */
    public static final InterfaceC7739f m9378b() {
        return m9379c(new C6356a0());
    }

    /* renamed from: c */
    public static final InterfaceC7739f m9379c(InterfaceC6363e.a aVar) {
        return CallFactoryNetworkClient.m1987b(CallFactoryNetworkClient.m1988c(aVar));
    }

    /* renamed from: d */
    public static final NetworkFetcher.Factory m9380d() {
        return new NetworkFetcher.Factory(new Function0() { // from class: w.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC7802b.m9378b();
            }
        }, null, null, 6, null);
    }
}
