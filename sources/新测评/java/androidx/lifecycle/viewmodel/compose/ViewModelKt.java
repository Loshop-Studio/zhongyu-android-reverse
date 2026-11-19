package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

@Metadata(m13557d1 = {"androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt", "androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModel_androidKt"}, m13559k = 4, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, KClass<VM> kClass, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (VM) ViewModelKt__ViewModelKt.get(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, composer, i10, i11);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Function1<? super CreationExtras, ? extends VM> function1, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, function1, composer, i10, i11);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(Class<VM> cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(KClass<VM> kClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        return (VM) ViewModelKt__ViewModelKt.viewModel(kClass, viewModelStoreOwner, str, factory, creationExtras, composer, i10, i11);
    }
}
