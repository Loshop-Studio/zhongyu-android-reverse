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
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10773d;

/* loaded from: classes2.dex */
public final class HiltNavGraphViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10) {
        AbstractC9979u.m20294g(fragment, "<this>");
        final InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m33788hiltNavGraphViewModels$lambda0(interfaceC10773dM20068a).getViewModelStore();
            }
        };
        AbstractC9979u.m20300m(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, AbstractC9983y.m20315b(ViewModel.class), interfaceC9529a, new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m33788hiltNavGraphViewModels$lambda0(interfaceC10773dM20068a).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m33788hiltNavGraphViewModels$lambda0(interfaceC10773dM20068a).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m33788hiltNavGraphViewModels$lambda0(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hiltNavGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m33789hiltNavGraphViewModels$lambda1(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel, VMF> InterfaceC10773d hiltNavGraphViewModels(final Fragment fragment, @IdRes final int i10, final InterfaceC9540l creationCallback) {
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20294g(creationCallback, "creationCallback");
        final InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$backStackEntry$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(fragment).getBackStackEntry(i10);
            }
        });
        InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$storeProducer$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m33789hiltNavGraphViewModels$lambda1(interfaceC10773dM20068a).getViewModelStore();
            }
        };
        AbstractC9979u.m20300m(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, AbstractC9983y.m20315b(ViewModel.class), interfaceC9529a, new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                return HiltViewModelExtensions.m17602b(HiltNavGraphViewModelLazyKt.m33789hiltNavGraphViewModels$lambda1(interfaceC10773dM20068a).getDefaultViewModelCreationExtras(), creationCallback);
            }
        }, new InterfaceC9529a() { // from class: androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt.hiltNavGraphViewModels.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m33789hiltNavGraphViewModels$lambda1(interfaceC10773dM20068a).getDefaultViewModelProviderFactory());
            }
        });
    }
}
