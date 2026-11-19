package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, InterfaceC10469c interfaceC10469c, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (VM) ViewModelKt__ViewModelKt.get(viewModelStoreOwner, interfaceC10469c, str, factory, creationExtras);
    }

    @Composable
    @InterfaceC10770a
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, composer, i10, i11);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, interfaceC9540l, composer, i10, i11);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(InterfaceC10469c interfaceC10469c, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(interfaceC10469c, viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }
}
