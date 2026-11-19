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
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;

/* loaded from: classes3.dex */
public final class NavBackStackEntryStateImpl {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ARGS = "nav-entry-state:args";
    public static final String KEY_DESTINATION_ID = "nav-entry-state:destination-id";
    public static final String KEY_ID = "nav-entry-state:id";
    public static final String KEY_SAVED_STATE = "nav-entry-state:saved-state";
    private final Bundle args;
    private final int destinationId;

    /* renamed from: id */
    private final String f1766id;
    private final Bundle savedState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public NavBackStackEntryStateImpl(NavBackStackEntry entry, int i10) {
        Pair[] pairArr;
        AbstractC9133u.m16133g(entry, "entry");
        this.f1766id = entry.getId();
        this.destinationId = i10;
        this.args = entry.getArguments();
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry2 : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry2.getKey(), entry2.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
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
        return this.f1766id;
    }

    public final Bundle getSavedState$navigation_runtime_release() {
        return this.savedState;
    }

    public final NavBackStackEntry instantiate(NavContext context, NavDestination destination, Bundle bundle, Lifecycle.State hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(destination, "destination");
        AbstractC9133u.m16133g(hostLifecycleState, "hostLifecycleState");
        return NavBackStackEntry.Companion.create(context, destination, bundle, hostLifecycleState, navControllerViewModel, this.f1766id, this.savedState);
    }

    public final Bundle writeToState$navigation_runtime_release() {
        Pair[] pairArr;
        Pair[] pairArr2;
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM27315constructorimpl = SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        SavedStateWriter.m27348putStringimpl(bundleM27315constructorimpl, KEY_ID, this.f1766id);
        SavedStateWriter.m27332putIntimpl(bundleM27315constructorimpl, KEY_DESTINATION_ID, this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            Map mapM15943h2 = AbstractC9080a.m15943h();
            if (mapM15943h2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapM15943h2.size());
                for (Map.Entry entry2 : mapM15943h2.entrySet()) {
                    arrayList2.add(AbstractC8726f.m14230a((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m27315constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m27342putSavedStateimpl(bundleM27315constructorimpl, KEY_ARGS, bundleBundleOf2);
        SavedStateWriter.m27342putSavedStateimpl(bundleM27315constructorimpl, KEY_SAVED_STATE, this.savedState);
        return bundleBundleOf;
    }

    public NavBackStackEntryStateImpl(Bundle state) {
        AbstractC9133u.m16133g(state, "state");
        this.f1766id = SavedStateReader.m27300getStringimpl(SavedStateReader.m27229constructorimpl(state), KEY_ID);
        this.destinationId = SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(state), KEY_DESTINATION_ID);
        this.args = SavedStateReader.m27286getSavedStateimpl(SavedStateReader.m27229constructorimpl(state), KEY_ARGS);
        this.savedState = SavedStateReader.m27286getSavedStateimpl(SavedStateReader.m27229constructorimpl(state), KEY_SAVED_STATE);
    }
}
