package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... initializers) {
        AbstractC9133u.m16133g(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <VM extends ViewModel> VM create(Class<VM> modelClass, CreationExtras extras) {
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        InterfaceC8375c interfaceC8375cM19300c = AbstractC10360a.m19300c(modelClass);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.initializers;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(interfaceC8375cM19300c, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
