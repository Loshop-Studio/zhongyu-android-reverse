package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p280od.InterfaceC10469c;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt {

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1 */
    public static final class C40481 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40481(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m33796navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2 */
    public static final class C40492 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40492(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m33796navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3 */
    public static final class C40503 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;
        final /* synthetic */ InterfaceC9529a $extrasProducer;

        public C40503(InterfaceC9529a interfaceC9529a, InterfaceC10773d interfaceC10773d) {
            this.$extrasProducer = interfaceC9529a;
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC9529a interfaceC9529a = this.$extrasProducer;
            return (interfaceC9529a == null || (creationExtras = (CreationExtras) interfaceC9529a.invoke()) == null) ? NavGraphViewModelLazyKt.m33797navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4 */
    public static final class C40514 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40514(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m33797navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5 */
    public static final class C40525 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40525(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m33798navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6 */
    public static final class C40536 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40536(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m33798navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7 */
    public static final class C40547 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;
        final /* synthetic */ InterfaceC9529a $extrasProducer;

        public C40547(InterfaceC9529a interfaceC9529a, InterfaceC10773d interfaceC10773d) {
            this.$extrasProducer = interfaceC9529a;
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC9529a interfaceC9529a = this.$extrasProducer;
            return (interfaceC9529a == null || (creationExtras = (CreationExtras) interfaceC9529a.invoke()) == null) ? NavGraphViewModelLazyKt.m33799navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8 */
    public static final class C40558 implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $backStackEntry$delegate;

        public C40558(InterfaceC10773d interfaceC10773d) {
            this.$backStackEntry$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m33799navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d navGraphViewModels(Fragment fragment, @IdRes int i10, InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20294g(fragment, "<this>");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40481 c40481 = new C40481(interfaceC10773dM20068a);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C40492(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c40481, interfaceC9529a);
    }

    public static /* synthetic */ InterfaceC10773d navGraphViewModels$default(Fragment fragment, int i10, InterfaceC9529a interfaceC9529a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC9529a = null;
        }
        AbstractC9979u.m20294g(fragment, "<this>");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40481 c40481 = new C40481(interfaceC10773dM20068a);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C40492(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c40481, interfaceC9529a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m33796navGraphViewModels$lambda0(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m33797navGraphViewModels$lambda1(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m33798navGraphViewModels$lambda2(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m33799navGraphViewModels$lambda3(InterfaceC10773d interfaceC10773d) {
        return (NavBackStackEntry) interfaceC10773d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d navGraphViewModels(Fragment fragment, @IdRes int i10, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        AbstractC9979u.m20294g(fragment, "<this>");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40503 c40503 = new C40503(interfaceC9529a, interfaceC10773dM20068a);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C40514(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c40503, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d navGraphViewModels$default(Fragment fragment, int i10, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC9529a = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC9529a2 = null;
        }
        AbstractC9979u.m20294g(fragment, "<this>");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40503 c40503 = new C40503(interfaceC9529a, interfaceC10773dM20068a);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C40514(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c40503, interfaceC9529a2);
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d navGraphViewModels(Fragment fragment, String navGraphRoute, InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20294g(navGraphRoute, "navGraphRoute");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40525 c40525 = new C40525(interfaceC10773dM20068a);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C40536(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c40525, interfaceC9529a);
    }

    public static /* synthetic */ InterfaceC10773d navGraphViewModels$default(Fragment fragment, String navGraphRoute, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20294g(navGraphRoute, "navGraphRoute");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40525 c40525 = new C40525(interfaceC10773dM20068a);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C40536(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c40525, interfaceC9529a);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d navGraphViewModels(Fragment fragment, String navGraphRoute, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20294g(navGraphRoute, "navGraphRoute");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40547 c40547 = new C40547(interfaceC9529a, interfaceC10773dM20068a);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C40558(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c40547, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d navGraphViewModels$default(Fragment fragment, String navGraphRoute, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = null;
        }
        AbstractC9979u.m20294g(fragment, "<this>");
        AbstractC9979u.m20294g(navGraphRoute, "navGraphRoute");
        InterfaceC10773d interfaceC10773dM20068a = AbstractC9923a.m20068a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(interfaceC10773dM20068a);
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C40547 c40547 = new C40547(interfaceC9529a, interfaceC10773dM20068a);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C40558(interfaceC10773dM20068a);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC10469cM20315b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c40547, interfaceC9529a2);
    }
}
