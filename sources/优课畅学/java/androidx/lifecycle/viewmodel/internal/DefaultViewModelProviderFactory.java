package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(InterfaceC8375c modelClass, CreationExtras extras) {
        AbstractC9133u.m16133g(modelClass, "modelClass");
        AbstractC9133u.m16133g(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(AbstractC10360a.m19298a(modelClass));
    }
}
