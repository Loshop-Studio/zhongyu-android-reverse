package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(m13557d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aP\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m13558d2 = {"navGraphViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "navGraphId", "", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "navGraphRoute", "", "navigation-fragment_release", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt {

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1 */
    public static final class C40501 implements Function0<CreationExtras> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40501(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m24064navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2 */
    public static final class C40512 implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40512(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m24064navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3 */
    public static final class C40523 implements Function0<CreationExtras> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;

        /* JADX WARN: Multi-variable type inference failed */
        public C40523(Function0<? extends CreationExtras> function0, Lazy<NavBackStackEntry> lazy) {
            this.$extrasProducer = function0;
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            return (function0 == null || (creationExtrasInvoke = function0.invoke()) == null) ? NavGraphViewModelLazyKt.m24065navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4 */
    public static final class C40534 implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40534(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m24065navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5 */
    public static final class C40545 implements Function0<CreationExtras> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40545(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m24066navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6 */
    public static final class C40556 implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40556(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m24066navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7 */
    public static final class C40567 implements Function0<CreationExtras> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;

        /* JADX WARN: Multi-variable type inference failed */
        public C40567(Function0<? extends CreationExtras> function0, Lazy<NavBackStackEntry> lazy) {
            this.$extrasProducer = function0;
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            Function0<CreationExtras> function0 = this.$extrasProducer;
            return (function0 == null || (creationExtrasInvoke = function0.invoke()) == null) ? NavGraphViewModelLazyKt.m24067navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 176)
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8 */
    public static final class C40578 implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

        public C40578(Lazy<NavBackStackEntry> lazy) {
            this.$backStackEntry$delegate = lazy;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m24067navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> navGraphViewModels(Fragment fragment, @IdRes int i10, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40501 c40501 = new C40501(lazy);
        if (function0 == null) {
            function0 = new C40512(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c40501, function0);
    }

    public static /* synthetic */ Lazy navGraphViewModels$default(Fragment fragment, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40501 c40501 = new C40501(lazy);
        if (function0 == null) {
            function0 = new C40512(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, c40501, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m24064navGraphViewModels$lambda0(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m24065navGraphViewModels$lambda1(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m24066navGraphViewModels$lambda2(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m24067navGraphViewModels$lambda3(Lazy<NavBackStackEntry> lazy) {
        return lazy.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> navGraphViewModels(Fragment fragment, @IdRes int i10, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40523 c40523 = new C40523(function0, lazy);
        if (function02 == null) {
            function02 = new C40534(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c40523, function02);
    }

    public static /* synthetic */ Lazy navGraphViewModels$default(Fragment fragment, int i10, Function0 function0, Function0 function02, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        if ((i11 & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40523 c40523 = new C40523(function0, lazy);
        if (function02 == null) {
            function02 = new C40534(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, c40523, function02);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> navGraphViewModels(Fragment fragment, String navGraphRoute, Function0<? extends ViewModelProvider.Factory> function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40545 c40545 = new C40545(lazy);
        if (function0 == null) {
            function0 = new C40556(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c40545, function0);
    }

    public static /* synthetic */ Lazy navGraphViewModels$default(Fragment fragment, String navGraphRoute, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40545 c40545 = new C40545(lazy);
        if (function0 == null) {
            function0 = new C40556(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, c40545, function0);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> navGraphViewModels(Fragment fragment, String navGraphRoute, Function0<? extends CreationExtras> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40567 c40567 = new C40567(function0, lazy);
        if (function02 == null) {
            function02 = new C40578(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c40567, function02);
    }

    public static /* synthetic */ Lazy navGraphViewModels$default(Fragment fragment, String navGraphRoute, Function0 function0, Function0 function02, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(navGraphRoute, "navGraphRoute");
        Lazy lazy = LazyKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(lazy);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        C40567 c40567 = new C40567(function0, lazy);
        if (function02 == null) {
            function02 = new C40578(lazy);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, c40567, function02);
    }
}
