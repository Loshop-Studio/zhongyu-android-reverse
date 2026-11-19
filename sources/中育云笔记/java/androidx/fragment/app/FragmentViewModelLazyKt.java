package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p280od.InterfaceC10469c;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt {

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 */
    public static final class C38451 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38451(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 */
    public static final class C38462 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38462(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3 */
    public static final class C38473 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38473(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 */
    public static final class C38484 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38484(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 */
    public static final class C38495 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC9529a $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38495(InterfaceC9529a interfaceC9529a, Fragment fragment) {
            super(0);
            this.$extrasProducer = interfaceC9529a;
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC9529a interfaceC9529a = this.$extrasProducer;
            return (interfaceC9529a == null || (creationExtras = (CreationExtras) interfaceC9529a.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6 */
    public static final class C38506 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38506(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 */
    public static final class C38542 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38542(InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m33784viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 */
    public static final class C38553 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38553(InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM33784viewModels$lambda0 = FragmentViewModelLazyKt.m33784viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33784viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33784viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4 */
    public static final class C38564 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38564(Fragment fragment, InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM33784viewModels$lambda0 = FragmentViewModelLazyKt.m33784viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33784viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33784viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 */
    public static final class C38586 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38586(InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m33785viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 */
    public static final class C38597 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC9529a $extrasProducer;
        final /* synthetic */ InterfaceC10773d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38597(InterfaceC9529a interfaceC9529a, InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$extrasProducer = interfaceC9529a;
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC9529a interfaceC9529a = this.$extrasProducer;
            if (interfaceC9529a != null && (creationExtras = (CreationExtras) interfaceC9529a.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8 */
    public static final class C38608 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC10773d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38608(Fragment fragment, InterfaceC10773d interfaceC10773d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC10773d;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM33785viewModels$lambda1 = FragmentViewModelLazyKt.m33785viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM33785viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM33785viewModels$lambda1 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d activityViewModels(Fragment fragment, InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38451 c38451 = new C38451(fragment);
        C38462 c38462 = new C38462(fragment);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C38473(fragment);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38451, c38462, interfaceC9529a);
    }

    public static /* synthetic */ InterfaceC10773d activityViewModels$default(Fragment fragment, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38451 c38451 = new C38451(fragment);
        C38462 c38462 = new C38462(fragment);
        if (interfaceC9529a == null) {
            interfaceC9529a = new C38473(fragment);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38451, c38462, interfaceC9529a);
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ InterfaceC10773d createViewModelLazy(final Fragment fragment, InterfaceC10469c interfaceC10469c, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        return createViewModelLazy(fragment, interfaceC10469c, interfaceC9529a, new InterfaceC9529a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                return fragment.getDefaultViewModelCreationExtras();
            }
        }, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d createViewModelLazy$default(Fragment fragment, InterfaceC10469c interfaceC10469c, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = null;
        }
        return createViewModelLazy(fragment, interfaceC10469c, interfaceC9529a, interfaceC9529a2);
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d viewModels(Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC9529a));
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38542 c38542 = new C38542(interfaceC10773dM20069b);
        C38553 c38553 = new C38553(interfaceC10773dM20069b);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C38564(fragment, interfaceC10773dM20069b);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38542, c38553, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d viewModels$default(final Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a2 = null;
        }
        InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC9529a));
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38542 c38542 = new C38542(interfaceC10773dM20069b);
        C38553 c38553 = new C38553(interfaceC10773dM20069b);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C38564(fragment, interfaceC10773dM20069b);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38542, c38553, interfaceC9529a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m33784viewModels$lambda0(InterfaceC10773d interfaceC10773d) {
        return (ViewModelStoreOwner) interfaceC10773d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m33785viewModels$lambda1(InterfaceC10773d interfaceC10773d) {
        return (ViewModelStoreOwner) interfaceC10773d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d activityViewModels(Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38484 c38484 = new C38484(fragment);
        C38495 c38495 = new C38495(interfaceC9529a, fragment);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C38506(fragment);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38484, c38495, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d activityViewModels$default(Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a2 = null;
        }
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38484 c38484 = new C38484(fragment);
        C38495 c38495 = new C38495(interfaceC9529a, fragment);
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new C38506(fragment);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38484, c38495, interfaceC9529a2);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC10773d createViewModelLazy(final Fragment fragment, InterfaceC10469c interfaceC10469c, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3) {
        if (interfaceC9529a3 == null) {
            interfaceC9529a3 = new InterfaceC9529a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final ViewModelProvider.Factory invoke() {
                    return fragment.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new ViewModelLazy(interfaceC10469c, interfaceC9529a, interfaceC9529a3, interfaceC9529a2);
    }

    public static /* synthetic */ InterfaceC10773d createViewModelLazy$default(final Fragment fragment, InterfaceC10469c interfaceC10469c, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final CreationExtras invoke() {
                    return fragment.getDefaultViewModelCreationExtras();
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9529a3 = null;
        }
        return createViewModelLazy(fragment, interfaceC10469c, interfaceC9529a, interfaceC9529a2, interfaceC9529a3);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d viewModels(Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3) {
        InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC9529a));
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38586 c38586 = new C38586(interfaceC10773dM20069b);
        C38597 c38597 = new C38597(interfaceC9529a2, interfaceC10773dM20069b);
        if (interfaceC9529a3 == null) {
            interfaceC9529a3 = new C38608(fragment, interfaceC10773dM20069b);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38586, c38597, interfaceC9529a3);
    }

    public static /* synthetic */ InterfaceC10773d viewModels$default(final Fragment fragment, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a3 = null;
        }
        InterfaceC10773d interfaceC10773dM20069b = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC9529a));
        AbstractC9979u.m20300m(4, "VM");
        InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(ViewModel.class);
        C38586 c38586 = new C38586(interfaceC10773dM20069b);
        C38597 c38597 = new C38597(interfaceC9529a2, interfaceC10773dM20069b);
        if (interfaceC9529a3 == null) {
            interfaceC9529a3 = new C38608(fragment, interfaceC10773dM20069b);
        }
        return createViewModelLazy(fragment, interfaceC10469cM20315b, c38586, c38597, interfaceC9529a3);
    }
}
