package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class SavedStateRegistryController {
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryImpl impl;
    private final SavedStateRegistry savedStateRegistry;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q create$lambda$0(SavedStateRegistryOwner savedStateRegistryOwner) {
            savedStateRegistryOwner.getLifecycle().addObserver(new Recreator(savedStateRegistryOwner));
            return C10786q.f26013a;
        }

        public final SavedStateRegistryController create(final SavedStateRegistryOwner owner) {
            AbstractC9979u.m20294g(owner, "owner");
            return new SavedStateRegistryController(new SavedStateRegistryImpl(owner, new InterfaceC9529a() { // from class: androidx.savedstate.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return SavedStateRegistryController.Companion.create$lambda$0(owner);
                }
            }), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl, AbstractC9972n abstractC9972n) {
        this(savedStateRegistryImpl);
    }

    public static final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @MainThread
    public final void performAttach() {
        this.impl.performAttach();
    }

    @MainThread
    public final void performRestore(Bundle bundle) {
        this.impl.performRestore$savedstate_release(bundle);
    }

    @MainThread
    public final void performSave(Bundle outBundle) {
        AbstractC9979u.m20294g(outBundle, "outBundle");
        this.impl.performSave$savedstate_release(outBundle);
    }

    private SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.impl = savedStateRegistryImpl;
        this.savedStateRegistry = new SavedStateRegistry(savedStateRegistryImpl);
    }
}
