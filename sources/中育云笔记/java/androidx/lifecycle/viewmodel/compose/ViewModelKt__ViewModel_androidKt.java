package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i11 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i11 & 4) != 0 ? null : factory;
        AbstractC9979u.m20300m(4, "VM");
        return (VM) ViewModelKt.viewModel(AbstractC9983y.m20315b(ViewModel.class), viewModelStoreOwner2, str2, factory2, (CreationExtras) null, composer, (i10 << 3) & 8176, 16);
    }

    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ ViewModel viewModel(Class cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i11 & 4) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i11 & 8) != 0 ? null : factory;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252471378, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:80)");
        }
        ViewModel viewModel = ViewModelKt__ViewModelKt.get$default(viewModelStoreOwner2, AbstractC9293a.m18326c(cls), str2, factory2, null, 8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModel;
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            factory = null;
        }
        if ((i11 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1566358618, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, AbstractC9293a.m18326c(cls), str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vm;
    }
}
