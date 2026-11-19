package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
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
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a0\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0087\b¢\u0006\u0002\u0010\n\u001aN\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007\"\u0006\b\u0001\u0010\u000b\u0018\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\b\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00060\rH\u0087\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m13558d2 = {"createHiltViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;", "hiltViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "key", "", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "VMF", "creationCallback", "Lkotlin/Function1;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "hilt-navigation-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHiltViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n86#2,6:105\n91#2:111\n76#3:112\n*S KotlinDebug\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n*L\n52#1:105,6\n76#1:111\n96#1:112\n*E\n"})
/* loaded from: classes2.dex */
public final class HiltViewModelKt {
    @Composable
    @PublishedApi
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
        int i12 = i10 & 126;
        composer.startReplaceableGroup(1729797275);
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, composer, ((i12 << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel, VMF> VM hiltViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Function1<? super VMF, ? extends VM> function1, Composer composer, int i10, int i11) {
        CreationExtras creationExtrasM11617b;
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
            creationExtrasM11617b = HiltViewModelExtensions.m11617b(((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras(), function1);
        } else {
            creationExtrasM11617b = HiltViewModelExtensions.m11617b(CreationExtras.Empty.INSTANCE, function1);
        }
        CreationExtras creationExtras = creationExtrasM11617b;
        composer.startReplaceableGroup(1729797275);
        Intrinsics.reifiedOperationMarker(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner2, str2, factoryCreateHiltViewModelFactory, creationExtras, composer, (((i10 & 126) << 3) & 896) | 36936, 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return vm;
    }
}
