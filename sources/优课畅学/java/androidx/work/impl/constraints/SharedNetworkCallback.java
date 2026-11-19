package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@RequiresApi(30)
/* loaded from: classes3.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();

    @GuardedBy("requestsLock")
    private static final Map<InterfaceC10570l, NetworkRequest> requests = new LinkedHashMap();

    private SharedNetworkCallback() {
    }

    public final InterfaceC10559a addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, final InterfaceC10570l onConstraintState) {
        AbstractC9133u.m16133g(connManager, "connManager");
        AbstractC9133u.m16133g(networkRequest, "networkRequest");
        AbstractC9133u.m16133g(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<InterfaceC10570l, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new InterfaceC10559a() { // from class: androidx.work.impl.constraints.SharedNetworkCallback.addCallback.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27371invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27371invoke() {
                Object obj = SharedNetworkCallback.requestsLock;
                InterfaceC10570l interfaceC10570l = onConstraintState;
                ConnectivityManager connectivityManager = connManager;
                SharedNetworkCallback sharedNetworkCallback = this;
                synchronized (obj) {
                    try {
                        SharedNetworkCallback.requests.remove(interfaceC10570l);
                        if (SharedNetworkCallback.requests.isEmpty()) {
                            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                            connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                        }
                        C8736p c8736p2 = C8736p.f16368a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listM14544U0;
        AbstractC9133u.m16133g(network, "network");
        AbstractC9133u.m16133g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            listM14544U0 = AbstractC8778f0.m14544U0(requests.entrySet());
        }
        for (Map.Entry entry : listM14544U0) {
            ((InterfaceC10570l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        List listM14544U0;
        AbstractC9133u.m16133g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            listM14544U0 = AbstractC8778f0.m14544U0(requests.keySet());
        }
        Iterator it = listM14544U0.iterator();
        while (it.hasNext()) {
            ((InterfaceC10570l) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
    }
}
