package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class NetworkNotRoamingController extends BaseConstraintController<NetworkState> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG;
    private final int reason;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        TAG = strTagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkNotRoamingController(ConstraintTracker<NetworkState> tracker) {
        super(tracker);
        AbstractC9979u.m20294g(tracker, "tracker");
        this.reason = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING;
    }

    @Override // androidx.work.impl.constraints.controllers.BaseConstraintController
    public boolean isConstrained(NetworkState value) {
        AbstractC9979u.m20294g(value, "value");
        return (value.isConnected() && value.isNotRoaming()) ? false : true;
    }
}
