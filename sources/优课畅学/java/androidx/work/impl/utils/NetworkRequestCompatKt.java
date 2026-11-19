package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes3.dex */
public final class NetworkRequestCompatKt {
    private static final int[] defaultCapabilities = {13, 15, 14};

    @RequiresApi(28)
    public static final int[] getCapabilitiesCompat(NetworkRequest networkRequest) {
        AbstractC9133u.m16133g(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.capabilities(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 30; i10++) {
            int i11 = iArr[i10];
            if (NetworkRequest28.INSTANCE.hasCapability$work_runtime_release(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return AbstractC8778f0.m14543T0(arrayList);
    }

    @RequiresApi(28)
    public static final int[] getTransportTypesCompat(NetworkRequest networkRequest) {
        AbstractC9133u.m16133g(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return NetworkRequest31.INSTANCE.transportTypes(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            if (NetworkRequest28.INSTANCE.hasTransport$work_runtime_release(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return AbstractC8778f0.m14543T0(arrayList);
    }
}
