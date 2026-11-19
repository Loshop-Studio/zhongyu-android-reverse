package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    private Bundle defaultArgs;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        AbstractC9979u.m20294g(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, modelClass) : (T) create(str, modelClass, SavedStateHandleSupport.createSavedStateHandle(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public abstract <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(ViewModel viewModel) {
        AbstractC9979u.m20294g(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            AbstractC9979u.m20291d(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            AbstractC9979u.m20291d(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner owner, Bundle bundle) {
        AbstractC9979u.m20294g(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        AbstractC9979u.m20291d(savedStateRegistry);
        Lifecycle lifecycle = this.lifecycle;
        AbstractC9979u.m20291d(lifecycle);
        SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        T t10 = (T) create(str, cls, savedStateHandleControllerCreate.getHandle());
        t10.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, savedStateHandleControllerCreate);
        return t10;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        AbstractC9979u.m20294g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
