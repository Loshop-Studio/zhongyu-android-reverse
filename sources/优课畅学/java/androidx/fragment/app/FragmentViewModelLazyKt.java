package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.Lambda;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt {

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 */
    public static final class C39721 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39721(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 */
    public static final class C39732 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39732(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3 */
    public static final class C39743 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39743(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 */
    public static final class C39754 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39754(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 */
    public static final class C39765 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC10559a $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39765(InterfaceC10559a interfaceC10559a, Fragment fragment) {
            super(0);
            this.$extrasProducer = interfaceC10559a;
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC10559a interfaceC10559a = this.$extrasProducer;
            return (interfaceC10559a == null || (creationExtras = (CreationExtras) interfaceC10559a.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6 */
    public static final class C39776 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39776(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 */
    public static final class C39812 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39812(InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m27187viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 */
    public static final class C39823 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39823(InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM27187viewModels$lambda0 = FragmentViewModelLazyKt.m27187viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27187viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27187viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4 */
    public static final class C39834 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39834(Fragment fragment, InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM27187viewModels$lambda0 = FragmentViewModelLazyKt.m27187viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27187viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27187viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 */
    public static final class C39856 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39856(InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m27188viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 */
    public static final class C39867 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC10559a $extrasProducer;
        final /* synthetic */ InterfaceC8724d $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39867(InterfaceC10559a interfaceC10559a, InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$extrasProducer = interfaceC10559a;
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC10559a interfaceC10559a = this.$extrasProducer;
            if (interfaceC10559a != null && (creationExtras = (CreationExtras) interfaceC10559a.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8 */
    public static final class C39878 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC8724d $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39878(Fragment fragment, InterfaceC8724d interfaceC8724d) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC8724d;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d activityViewModels(Fragment fragment, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39721 c39721 = new C39721(fragment);
        C39732 c39732 = new C39732(fragment);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C39743(fragment);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39721, c39732, interfaceC10559a);
    }

    public static /* synthetic */ InterfaceC8724d activityViewModels$default(Fragment fragment, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39721 c39721 = new C39721(fragment);
        C39732 c39732 = new C39732(fragment);
        if (interfaceC10559a == null) {
            interfaceC10559a = new C39743(fragment);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39721, c39732, interfaceC10559a);
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ InterfaceC8724d createViewModelLazy(final Fragment fragment, InterfaceC8375c interfaceC8375c, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        return createViewModelLazy(fragment, interfaceC8375c, interfaceC10559a, new InterfaceC10559a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return fragment.getDefaultViewModelCreationExtras();
            }
        }, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d createViewModelLazy$default(Fragment fragment, InterfaceC8375c interfaceC8375c, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = null;
        }
        return createViewModelLazy(fragment, interfaceC8375c, interfaceC10559a, interfaceC10559a2);
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d viewModels(Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC10559a));
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39812 c39812 = new C39812(interfaceC8724dM15923a);
        C39823 c39823 = new C39823(interfaceC8724dM15923a);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C39834(fragment, interfaceC8724dM15923a);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39812, c39823, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d viewModels$default(final Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a2 = null;
        }
        InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC10559a));
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39812 c39812 = new C39812(interfaceC8724dM15923a);
        C39823 c39823 = new C39823(interfaceC8724dM15923a);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C39834(fragment, interfaceC8724dM15923a);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39812, c39823, interfaceC10559a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m27187viewModels$lambda0(InterfaceC8724d interfaceC8724d) {
        return (ViewModelStoreOwner) interfaceC8724d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m27188viewModels$lambda1(InterfaceC8724d interfaceC8724d) {
        return (ViewModelStoreOwner) interfaceC8724d.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d activityViewModels(Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39754 c39754 = new C39754(fragment);
        C39765 c39765 = new C39765(interfaceC10559a, fragment);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C39776(fragment);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39754, c39765, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d activityViewModels$default(Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a2 = null;
        }
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39754 c39754 = new C39754(fragment);
        C39765 c39765 = new C39765(interfaceC10559a, fragment);
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new C39776(fragment);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39754, c39765, interfaceC10559a2);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC8724d createViewModelLazy(final Fragment fragment, InterfaceC8375c interfaceC8375c, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3) {
        if (interfaceC10559a3 == null) {
            interfaceC10559a3 = new InterfaceC10559a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final ViewModelProvider.Factory invoke() {
                    return fragment.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new ViewModelLazy(interfaceC8375c, interfaceC10559a, interfaceC10559a3, interfaceC10559a2);
    }

    public static /* synthetic */ InterfaceC8724d createViewModelLazy$default(final Fragment fragment, InterfaceC8375c interfaceC8375c, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = new InterfaceC10559a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final CreationExtras invoke() {
                    return fragment.getDefaultViewModelCreationExtras();
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC10559a3 = null;
        }
        return createViewModelLazy(fragment, interfaceC8375c, interfaceC10559a, interfaceC10559a2, interfaceC10559a3);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d viewModels(Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3) {
        InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC10559a));
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39856 c39856 = new C39856(interfaceC8724dM15923a);
        C39867 c39867 = new C39867(interfaceC10559a2, interfaceC8724dM15923a);
        if (interfaceC10559a3 == null) {
            interfaceC10559a3 = new C39878(fragment, interfaceC8724dM15923a);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39856, c39867, interfaceC10559a3);
    }

    public static /* synthetic */ InterfaceC8724d viewModels$default(final Fragment fragment, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a2 = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a3 = null;
        }
        InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC10559a));
        AbstractC9133u.m16139m(4, "VM");
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(ViewModel.class);
        C39856 c39856 = new C39856(interfaceC8724dM15923a);
        C39867 c39867 = new C39867(interfaceC10559a2, interfaceC8724dM15923a);
        if (interfaceC10559a3 == null) {
            interfaceC10559a3 = new C39878(fragment, interfaceC8724dM15923a);
        }
        return createViewModelLazy(fragment, interfaceC8375cM16154b, c39856, c39867, interfaceC10559a3);
    }
}
