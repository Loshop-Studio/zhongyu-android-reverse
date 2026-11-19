package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, InterfaceC10469c interfaceC10469c, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        ViewModelProvider viewModelProviderCreate = factory != null ? ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), factory, creationExtras) : viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), creationExtras) : ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, (ViewModelProvider.Factory) null, (CreationExtras) null, 6, (Object) null);
        return str != null ? (VM) viewModelProviderCreate.get(str, interfaceC10469c) : (VM) viewModelProviderCreate.get(interfaceC10469c);
    }

    public static /* synthetic */ ViewModel get$default(ViewModelStoreOwner viewModelStoreOwner, InterfaceC10469c interfaceC10469c, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            factory = null;
        }
        if ((i10 & 8) != 0) {
            creationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
        return ViewModelKt.get(viewModelStoreOwner, interfaceC10469c, str, factory, creationExtras);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i11 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i11 & 4) != 0 ? null : factory;
        if ((i11 & 8) != 0) {
            creationExtras = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
        AbstractC9979u.m20300m(4, "VM");
        return (VM) ViewModelKt.viewModel(AbstractC9983y.m20315b(ViewModel.class), viewModelStoreOwner2, str2, factory2, creationExtras, composer, (i10 << 3) & 65520, 0);
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(InterfaceC10469c interfaceC10469c, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i10, int i11) {
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
            ComposerKt.traceEventStart(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, interfaceC10469c, str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vm;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        CreationExtras defaultViewModelCreationExtras;
        if ((i11 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        AbstractC9979u.m20300m(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(AbstractC9983y.m20315b(ViewModel.class), interfaceC9540l);
        C10786q c10786q = C10786q.f26013a;
        ViewModelProvider.Factory factoryBuild = initializerViewModelFactoryBuilder.build();
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        return (VM) ViewModelKt.viewModel(interfaceC10469cM20315b, viewModelStoreOwner2, str2, factoryBuild, defaultViewModelCreationExtras, composer, (i10 << 3) & 1008, 0);
    }
}
