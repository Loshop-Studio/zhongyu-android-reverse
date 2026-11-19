package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@RequiresApi(28)
/* loaded from: classes3.dex */
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final Companion Companion = new Companion(null);
    private final InterfaceC10570l onConstraintState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final InterfaceC10559a addCallback(final ConnectivityManager connManager, NetworkRequest networkRequest, InterfaceC10570l onConstraintState) {
            AbstractC9133u.m16133g(connManager, "connManager");
            AbstractC9133u.m16133g(networkRequest, "networkRequest");
            AbstractC9133u.m16133g(onConstraintState, "onConstraintState");
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(onConstraintState, null);
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            try {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                ref$BooleanRef.f17469a = true;
            } catch (RuntimeException e10) {
                String name = e10.getClass().getName();
                AbstractC9133u.m16132f(name, "ex.javaClass.name");
                if (!AbstractC8687z.m14111z(name, "TooManyRequestsException", false, 2, null)) {
                    throw e10;
                }
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e10);
                onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            return new InterfaceC10559a() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$addCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27369invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27369invoke() {
                    if (ref$BooleanRef.f17469a) {
                        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
                        connManager.unregisterNetworkCallback(individualNetworkCallback);
                    }
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ IndividualNetworkCallback(InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(interfaceC10570l);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC9133u.m16133g(network, "network");
        AbstractC9133u.m16133g(networkCapabilities, "networkCapabilities");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        AbstractC9133u.m16133g(network, "network");
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
    }

    private IndividualNetworkCallback(InterfaceC10570l interfaceC10570l) {
        this.onConstraintState = interfaceC10570l;
    }
}
