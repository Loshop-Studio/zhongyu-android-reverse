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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

@RequiresApi(30)
/* loaded from: classes3.dex */
final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    private static final Object requestsLock = new Object();

    @GuardedBy("requestsLock")
    private static final Map<InterfaceC9540l, NetworkRequest> requests = new LinkedHashMap();

    private SharedNetworkCallback() {
    }

    public final InterfaceC9529a addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, final InterfaceC9540l onConstraintState) {
        AbstractC9979u.m20294g(connManager, "connManager");
        AbstractC9979u.m20294g(networkRequest, "networkRequest");
        AbstractC9979u.m20294g(onConstraintState, "onConstraintState");
        synchronized (requestsLock) {
            try {
                Map<InterfaceC9540l, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new InterfaceC9529a() { // from class: androidx.work.impl.constraints.SharedNetworkCallback.addCallback.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33966invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33966invoke() {
                Object obj = SharedNetworkCallback.requestsLock;
                InterfaceC9540l interfaceC9540l = onConstraintState;
                ConnectivityManager connectivityManager = connManager;
                SharedNetworkCallback sharedNetworkCallback = this;
                synchronized (obj) {
                    try {
                        SharedNetworkCallback.requests.remove(interfaceC9540l);
                        if (SharedNetworkCallback.requests.isEmpty()) {
                            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister shared callback");
                            connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                        }
                        C10786q c10786q2 = C10786q.f26013a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listM23922X0;
        AbstractC9979u.m20294g(network, "network");
        AbstractC9979u.m20294g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            listM23922X0 = AbstractC10947g0.m23922X0(requests.entrySet());
        }
        for (Map.Entry entry : listM23922X0) {
            ((InterfaceC9540l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        List listM23922X0;
        AbstractC9979u.m20294g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            listM23922X0 = AbstractC10947g0.m23922X0(requests.keySet());
        }
        Iterator it = listM23922X0.iterator();
        while (it.hasNext()) {
            ((InterfaceC9540l) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
        }
    }
}
