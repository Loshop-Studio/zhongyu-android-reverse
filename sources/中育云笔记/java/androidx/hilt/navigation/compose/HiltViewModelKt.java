package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.alibaba.fastjson.asm.Opcodes;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class HiltViewModelKt {
    @Composable
    public static final ViewModelProvider.Factory createHiltViewModelFactory(ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i10) {
        composer.startReplaceableGroup(1770922558);
        ViewModelProvider.Factory factoryCreate = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? HiltViewModelFactory.create((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory()) : null;
        composer.endReplaceableGroup();
        return factoryCreate;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM hiltViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1890788296);
        if ((i11 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        ViewModelProvider.Factory factoryCreateHiltViewModelFactory = createHiltViewModelFactory(viewModelStoreOwner2, composer, i10 & 14);
        int i12 = i10 & Opcodes.IAND;
        composer.startReplaceableGroup(1729797275);
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        AbstractC9979u.m20300m(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composer, ((i12 << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel, VMF> VM hiltViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        CreationExtras creationExtrasM17602b;
        composer.startReplaceableGroup(-83599083);
        if ((i11 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        ViewModelProvider.Factory factoryCreateHiltViewModelFactory = createHiltViewModelFactory(viewModelStoreOwner2, composer, i10 & 14);
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            creationExtrasM17602b = HiltViewModelExtensions.m17602b(((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras(), interfaceC9540l);
        } else {
            creationExtrasM17602b = HiltViewModelExtensions.m17602b(CreationExtras.Empty.INSTANCE, interfaceC9540l);
        }
        CreationExtras creationExtras = creationExtrasM17602b;
        int i12 = i10 & Opcodes.IAND;
        composer.startReplaceableGroup(1729797275);
        AbstractC9979u.m20300m(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, factoryCreateHiltViewModelFactory, creationExtras, composer, ((i12 << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm;
    }
}
