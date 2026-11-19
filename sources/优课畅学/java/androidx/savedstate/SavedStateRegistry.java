package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.Recreator;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class SavedStateRegistry {
    private final SavedStateRegistryImpl impl;
    private Recreator.SavedStateProvider recreatorProvider;

    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    public interface SavedStateProvider {
        Bundle saveState();
    }

    public SavedStateRegistry(SavedStateRegistryImpl impl) {
        AbstractC9133u.m16133g(impl, "impl");
        this.impl = impl;
    }

    @MainThread
    public final Bundle consumeRestoredStateForKey(String key) {
        AbstractC9133u.m16133g(key, "key");
        return this.impl.consumeRestoredStateForKey(key);
    }

    public final SavedStateProvider getSavedStateProvider(String key) {
        AbstractC9133u.m16133g(key, "key");
        return this.impl.getSavedStateProvider(key);
    }

    @MainThread
    public final boolean isRestored() {
        return this.impl.isRestored();
    }

    @MainThread
    public final void registerSavedStateProvider(String key, SavedStateProvider provider) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(provider, "provider");
        this.impl.registerSavedStateProvider(key, provider);
    }

    @MainThread
    public final void runOnNextRecreation(Class<? extends AutoRecreated> clazz) throws NoSuchMethodException, SecurityException {
        AbstractC9133u.m16133g(clazz, "clazz");
        if (!this.impl.isAllowingSavingState$savedstate_release()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                String name = clazz.getName();
                AbstractC9133u.m16132f(name, "getName(...)");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    @MainThread
    public final void unregisterSavedStateProvider(String key) {
        AbstractC9133u.m16133g(key, "key");
        this.impl.unregisterSavedStateProvider(key);
    }
}
