package androidx.navigation.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;

/* loaded from: classes.dex */
public final class NavBackStackEntryStateImpl {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ARGS = "nav-entry-state:args";
    public static final String KEY_DESTINATION_ID = "nav-entry-state:destination-id";
    public static final String KEY_ID = "nav-entry-state:id";
    public static final String KEY_SAVED_STATE = "nav-entry-state:saved-state";
    private final Bundle args;
    private final int destinationId;

    /* renamed from: id */
    private final String f1826id;
    private final Bundle savedState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public NavBackStackEntryStateImpl(NavBackStackEntry entry, int i10) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(entry, "entry");
        this.f1826id = entry.getId();
        this.destinationId = i10;
        this.args = entry.getArguments();
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry2 : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry2.getKey(), entry2.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        this.savedState = bundleBundleOf;
        entry.saveState(bundleBundleOf);
    }

    public final Bundle getArgs$navigation_runtime_release() {
        return this.args;
    }

    public final int getDestinationId$navigation_runtime_release() {
        return this.destinationId;
    }

    public final String getId$navigation_runtime_release() {
        return this.f1826id;
    }

    public final Bundle getSavedState$navigation_runtime_release() {
        return this.savedState;
    }

    public final NavBackStackEntry instantiate(NavContext context, NavDestination destination, Bundle bundle, Lifecycle.State hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(destination, "destination");
        AbstractC9979u.m20294g(hostLifecycleState, "hostLifecycleState");
        return NavBackStackEntry.Companion.create(context, destination, bundle, hostLifecycleState, navControllerViewModel, this.f1826id, this.savedState);
    }

    public final Bundle writeToState$navigation_runtime_release() {
        Pair[] pairArr;
        Pair[] pairArr2;
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM33910constructorimpl = SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        SavedStateWriter.m33943putStringimpl(bundleM33910constructorimpl, KEY_ID, this.f1826id);
        SavedStateWriter.m33927putIntimpl(bundleM33910constructorimpl, KEY_DESTINATION_ID, this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            Map mapM20088h2 = AbstractC9925a.m20088h();
            if (mapM20088h2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapM20088h2.size());
                for (Map.Entry entry2 : mapM20088h2.entrySet()) {
                    arrayList2.add(AbstractC10776g.m22975a((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m33910constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m33937putSavedStateimpl(bundleM33910constructorimpl, KEY_ARGS, bundleBundleOf2);
        SavedStateWriter.m33937putSavedStateimpl(bundleM33910constructorimpl, KEY_SAVED_STATE, this.savedState);
        return bundleBundleOf;
    }

    public NavBackStackEntryStateImpl(Bundle state) {
        AbstractC9979u.m20294g(state, "state");
        this.f1826id = SavedStateReader.m33895getStringimpl(SavedStateReader.m33824constructorimpl(state), KEY_ID);
        this.destinationId = SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(state), KEY_DESTINATION_ID);
        this.args = SavedStateReader.m33881getSavedStateimpl(SavedStateReader.m33824constructorimpl(state), KEY_ARGS);
        this.savedState = SavedStateReader.m33881getSavedStateimpl(SavedStateReader.m33824constructorimpl(state), KEY_SAVED_STATE);
    }
}
