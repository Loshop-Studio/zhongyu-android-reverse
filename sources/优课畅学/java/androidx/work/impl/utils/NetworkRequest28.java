package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class NetworkRequest28 {
    public static final NetworkRequest28 INSTANCE = new NetworkRequest28();

    private NetworkRequest28() {
    }

    public static final NetworkRequest createNetworkRequest(int[] capabilities, int[] transports) {
        AbstractC9133u.m16133g(capabilities, "capabilities");
        AbstractC9133u.m16133g(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int i11 : NetworkRequestCompatKt.defaultCapabilities) {
            if (!AbstractC8801r.m14717l0(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    Logger.get().warning(NetworkRequestCompat.Companion.getTAG(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        AbstractC9133u.m16132f(networkRequestBuild, "networkRequest.build()");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] capabilities, int[] transports) {
        AbstractC9133u.m16133g(capabilities, "capabilities");
        AbstractC9133u.m16133g(transports, "transports");
        return new NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest request, int i10) {
        AbstractC9133u.m16133g(request, "request");
        return request.hasCapability(i10);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest request, int i10) {
        AbstractC9133u.m16133g(request, "request");
        return request.hasTransport(i10);
    }
}
