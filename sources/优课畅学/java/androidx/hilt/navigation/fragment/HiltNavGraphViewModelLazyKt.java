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
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class HiltNavGraphViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10) {
        AbstractC9133u.m16133g(fragment, "<this>");
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        };
        AbstractC9133u.m16139m(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, AbstractC9137y.m16154b(ViewModel.class), interfaceC10559a, new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m27191hiltNavGraphViewModels$lambda0(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m27192hiltNavGraphViewModels$lambda1(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel, VMF> InterfaceC8724d hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10, final InterfaceC10570l creationCallback) {
        AbstractC9133u.m16133g(fragment, "<this>");
        AbstractC9133u.m16133g(creationCallback, "creationCallback");
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27192hiltNavGraphViewModels$lambda1(interfaceC8724dM15924b).getViewModelStore();
            }
        };
        AbstractC9133u.m16139m(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, AbstractC9137y.m16154b(ViewModel.class), interfaceC10559a, new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltViewModelExtensions.m13544b(HiltNavGraphViewModelLazyKt.m27192hiltNavGraphViewModels$lambda1(interfaceC8724dM15924b).getDefaultViewModelCreationExtras(), creationCallback);
            }
        }, new InterfaceC10559a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m27192hiltNavGraphViewModels$lambda1(interfaceC8724dM15924b).getDefaultViewModelProviderFactory());
            }
        });
    }
}
