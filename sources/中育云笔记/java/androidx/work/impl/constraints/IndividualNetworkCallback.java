package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p310qd.AbstractC10819z;

@RequiresApi(28)
/* loaded from: classes3.dex */
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final Companion Companion = new Companion(null);
    private final InterfaceC9540l onConstraintState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC9529a addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, InterfaceC9540l onConstraintState) {
            AbstractC9979u.m20294g(connManager, "connManager");
            AbstractC9979u.m20294g(networkRequest, "networkRequest");
            AbstractC9979u.m20294g(onConstraintState, "onConstraintState");
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(onConstraintState, null);
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            try {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                ref$BooleanRef.f23398c = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                AbstractC9979u.m20293f(name, "ex.javaClass.name");
                if (!AbstractC10819z.m23229B(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            return new InterfaceC9529a() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$addCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m33964invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m33964invoke() {
                    if (ref$BooleanRef.f23398c) {
                        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
                        connManager.unregisterNetworkCallback(individualNetworkCallback);
                    }
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ IndividualNetworkCallback(InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(interfaceC9540l);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC9979u.m20294g(network, "network");
        AbstractC9979u.m20294g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        AbstractC9979u.m20294g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
    }

    private IndividualNetworkCallback(InterfaceC9540l interfaceC9540l) {
        this.onConstraintState = interfaceC9540l;
    }
}
