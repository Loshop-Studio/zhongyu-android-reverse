package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt {

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1 */
    public static final class C41721 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41721(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m27199navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2 */
    public static final class C41732 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41732(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m27199navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3 */
    public static final class C41743 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;
        final /* synthetic */ InterfaceC10559a $extrasProducer;

        public C41743(InterfaceC10559a interfaceC10559a, InterfaceC8724d interfaceC8724d) {
            this.$extrasProducer = interfaceC10559a;
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC10559a interfaceC10559a = this.$extrasProducer;
            return (interfaceC10559a == null || (creationExtras = (CreationExtras) interfaceC10559a.invoke()) == null) ? NavGraphViewModelLazyKt.m27200navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4 */
    public static final class C41754 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41754(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m27200navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5 */
    public static final class C41765 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41765(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m27201navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6 */
    public static final class C41776 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41776(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m27201navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7 */
    public static final class C41787 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;
        final /* synthetic */ InterfaceC10559a $extrasProducer;

        public C41787(InterfaceC10559a interfaceC10559a, InterfaceC8724d interfaceC8724d) {
            this.$extrasProducer = interfaceC10559a;
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC10559a interfaceC10559a = this.$extrasProducer;
            return (interfaceC10559a == null || (creationExtras = (CreationExtras) interfaceC10559a.invoke()) == null) ? NavGraphViewModelLazyKt.m27202navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8 */
    public static final class C41798 implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $backStackEntry$delegate;

        public C41798(InterfaceC8724d interfaceC8724d) {
            this.$backStackEntry$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m27202navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d navGraphViewModels(Fragment fragment, @IdRes int i10, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(fragment, "<this>");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41721 c41721 = new C41721(interfaceC8724dM15924b);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C41732(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c41721, interfaceC10559a);
    }

    public static /* synthetic */ InterfaceC8724d navGraphViewModels$default(Fragment fragment, int i10, InterfaceC10559a interfaceC10559a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC10559a = null;
        }
        AbstractC9133u.m16133g(fragment, "<this>");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41721 c41721 = new C41721(interfaceC8724dM15924b);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C41732(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c41721, interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m27199navGraphViewModels$lambda0(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m27200navGraphViewModels$lambda1(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m27201navGraphViewModels$lambda2(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m27202navGraphViewModels$lambda3(InterfaceC8724d interfaceC8724d) {
        return (NavBackStackEntry) interfaceC8724d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d navGraphViewModels(Fragment fragment, @IdRes int i10, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        AbstractC9133u.m16133g(fragment, "<this>");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41743 c41743 = new C41743(interfaceC10559a, interfaceC8724dM15924b);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C41754(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c41743, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d navGraphViewModels$default(Fragment fragment, int i10, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC10559a = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC10559a2 = null;
        }
        AbstractC9133u.m16133g(fragment, "<this>");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41743 c41743 = new C41743(interfaceC10559a, interfaceC8724dM15924b);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C41754(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c41743, interfaceC10559a2);
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d navGraphViewModels(Fragment fragment, String navGraphRoute, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(fragment, "<this>");
        AbstractC9133u.m16133g(navGraphRoute, "navGraphRoute");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41765 c41765 = new C41765(interfaceC8724dM15924b);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C41776(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c41765, interfaceC10559a);
    }

    public static /* synthetic */ InterfaceC8724d navGraphViewModels$default(Fragment fragment, String navGraphRoute, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        AbstractC9133u.m16133g(fragment, "<this>");
        AbstractC9133u.m16133g(navGraphRoute, "navGraphRoute");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41765 c41765 = new C41765(interfaceC8724dM15924b);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C41776(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c41765, interfaceC10559a);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d navGraphViewModels(Fragment fragment, String navGraphRoute, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        AbstractC9133u.m16133g(fragment, "<this>");
        AbstractC9133u.m16133g(navGraphRoute, "navGraphRoute");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41787 c41787 = new C41787(interfaceC10559a, interfaceC8724dM15924b);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C41798(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c41787, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d navGraphViewModels$default(Fragment fragment, String navGraphRoute, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = null;
        }
        AbstractC9133u.m16133g(fragment, "<this>");
        AbstractC9133u.m16133g(navGraphRoute, "navGraphRoute");
        InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(interfaceC8724dM15924b);
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C41787 c41787 = new C41787(interfaceC10559a, interfaceC8724dM15924b);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C41798(interfaceC8724dM15924b);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC8375cM16154b, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c41787, interfaceC10559a2);
    }
}
