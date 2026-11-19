package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(30)
/* loaded from: classes3.dex */
public final class NetworkRequest30 {
    public static final NetworkRequest30 INSTANCE = new NetworkRequest30();

    private NetworkRequest30() {
    }

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest request) {
        AbstractC9979u.m20294g(request, "request");
        return request.getNetworkSpecifier();
    }
}
