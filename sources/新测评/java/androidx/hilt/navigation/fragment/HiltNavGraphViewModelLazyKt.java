package androidx.hilt.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(m13557d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0087\b\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\b*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\b\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00020\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b²\u0006\u0016\u0010\f\u001a\u00020\r\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008a\u0084\u0002²\u0006\"\u0010\f\u001a\u00020\r\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\u0007\u0018\u0001*\u00020\bX\u008a\u0084\u0002"}, m13558d2 = {"hiltNavGraphViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "navGraphId", "", "VMF", "", "creationCallback", "Lkotlin/Function1;", "hilt-navigation-fragment_release", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class HiltNavGraphViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24056hiltNavGraphViewModels$lambda0(lazy).getViewModelStore();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, new Function0<CreationExtras>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24056hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24056hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m24056hiltNavGraphViewModels$lambda0(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m24057hiltNavGraphViewModels$lambda1(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel, VMF> Lazy<VM> hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10, final Function1<? super VMF, ? extends VM> creationCallback) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(creationCallback, "creationCallback");
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24057hiltNavGraphViewModels$lambda1(lazy).getViewModelStore();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, new Function0<CreationExtras>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltViewModelExtensions.m11617b(HiltNavGraphViewModelLazyKt.m24057hiltNavGraphViewModels$lambda1(lazy).getDefaultViewModelCreationExtras(), creationCallback);
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24057hiltNavGraphViewModels$lambda1(lazy).getDefaultViewModelProviderFactory());
            }
        });
    }
}
