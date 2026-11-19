package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class SavedStateRegistryImpl {
    private static final Companion Companion = new Companion(null);
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private final Map<String, SavedStateRegistry.SavedStateProvider> keyToProviders;
    private final SynchronizedObject lock;
    private final InterfaceC9529a onAttach;
    private final SavedStateRegistryOwner owner;
    private Bundle restoredState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public SavedStateRegistryImpl(SavedStateRegistryOwner owner, InterfaceC9529a onAttach) {
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(onAttach, "onAttach");
        this.owner = owner;
        this.onAttach = onAttach;
        this.lock = new SynchronizedObject();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$12(SavedStateRegistryImpl savedStateRegistryImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC9979u.m20294g(lifecycleOwner, "<unused var>");
        AbstractC9979u.m20294g(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistryImpl.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistryImpl.isAllowingSavingState = false;
        }
    }

    @MainThread
    public final Bundle consumeRestoredStateForKey(String key) {
        AbstractC9979u.m20294g(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
        Bundle bundleM33881getSavedStateimpl = SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, key) ? SavedStateReader.m33881getSavedStateimpl(bundleM33824constructorimpl, key) : null;
        SavedStateWriter.m33946removeimpl(SavedStateWriter.m33910constructorimpl(bundle), key);
        if (SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundle))) {
            this.restoredState = null;
        }
        return bundleM33881getSavedStateimpl;
    }

    public final InterfaceC9529a getOnAttach$savedstate_release() {
        return this.onAttach;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider(String key) {
        SavedStateRegistry.SavedStateProvider savedStateProvider;
        AbstractC9979u.m20294g(key, "key");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                SavedStateRegistry.SavedStateProvider savedStateProvider2 = (SavedStateRegistry.SavedStateProvider) entry.getValue();
                if (AbstractC9979u.m20289b(str, key)) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    @MainThread
    public final boolean isRestored() {
        return this.isRestored;
    }

    @MainThread
    public final void performAttach() {
        if (this.owner.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.invoke();
        this.owner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.internal.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistryImpl.performAttach$lambda$12(this.f2068c, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    @MainThread
    public final void performRestore$savedstate_release(Bundle bundle) {
        if (!this.attached) {
            performAttach();
        }
        if (this.owner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.getLifecycle().getCurrentState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM33881getSavedStateimpl = null;
        if (bundle != null) {
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, SAVED_COMPONENTS_KEY)) {
                bundleM33881getSavedStateimpl = SavedStateReader.m33881getSavedStateimpl(bundleM33824constructorimpl, SAVED_COMPONENTS_KEY);
            }
        }
        this.restoredState = bundleM33881getSavedStateimpl;
        this.isRestored = true;
    }

    @MainThread
    public final void performSave$savedstate_release(Bundle outBundle) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(outBundle, "outBundle");
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
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m33914putAllimpl(bundleM33910constructorimpl, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    SavedStateWriter.m33937putSavedStateimpl(bundleM33910constructorimpl, (String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (SavedStateReader.m33902isEmptyimpl(SavedStateReader.m33824constructorimpl(bundleBundleOf))) {
            return;
        }
        SavedStateWriter.m33937putSavedStateimpl(SavedStateWriter.m33910constructorimpl(outBundle), SAVED_COMPONENTS_KEY, bundleBundleOf);
    }

    @MainThread
    public final void registerSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(provider, "provider");
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z10) {
        this.isAllowingSavingState = z10;
    }

    @MainThread
    public final void unregisterSavedStateProvider(String key) {
        AbstractC9979u.m20294g(key, "key");
        synchronized (this.lock) {
        }
    }

    public /* synthetic */ SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this(savedStateRegistryOwner, (i10 & 2) != 0 ? new InterfaceC9529a() { // from class: androidx.savedstate.internal.b
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C10786q.f26013a;
            }
        } : interfaceC9529a);
    }
}
