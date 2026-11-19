package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(31)
/* loaded from: classes3.dex */
final class NetworkRequest31 {
    public static final NetworkRequest31 INSTANCE = new NetworkRequest31();

    private NetworkRequest31() {
    }

    public final int[] capabilities(NetworkRequest request) {
        AbstractC9133u.m16133g(request, "request");
        int[] capabilities = request.getCapabilities();
        AbstractC9133u.m16132f(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] transportTypes(NetworkRequest request) {
        AbstractC9133u.m16133g(request, "request");
        int[] transportTypes = request.getTransportTypes();
        AbstractC9133u.m16132f(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
