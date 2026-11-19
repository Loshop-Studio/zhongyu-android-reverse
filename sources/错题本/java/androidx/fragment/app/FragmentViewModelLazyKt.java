package androidx.fragment.app;

import android.view.HasDefaultViewModelProviderFactory;
import android.view.ViewModel;
import android.view.ViewModelLazy;
import android.view.ViewModelProvider;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import android.view.viewmodel.CreationExtras;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5773a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001aZ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\t\u0010\r\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aJ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000e\u0010\n\u001aQ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aa\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0016¨\u0006\u0018²\u0006\u0018\u0010\u0017\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0017\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Ld6/e;", "viewModels", "(Landroidx/fragment/app/Fragment;Lr6/a;Lr6/a;)Ld6/e;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "(Landroidx/fragment/app/Fragment;Lr6/a;Lr6/a;Lr6/a;)Ld6/e;", "activityViewModels", "(Landroidx/fragment/app/Fragment;Lr6/a;)Ld6/e;", "Ly6/c;", "viewModelClass", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "createViewModelLazy", "(Landroidx/fragment/app/Fragment;Ly6/c;Lr6/a;Lr6/a;)Ld6/e;", "(Landroidx/fragment/app/Fragment;Ly6/c;Lr6/a;Lr6/a;Lr6/a;)Ld6/e;", "owner", "fragment-ktx_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt {

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1 */
    public static final class C26841 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26841(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2 */
    public static final class C26852 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26852(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final CreationExtras invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3 */
    public static final class C26863 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26863(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4 */
    public static final class C26874 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26874(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelStore invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5 */
    public static final class C26885 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6469a $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26885(InterfaceC6469a interfaceC6469a, Fragment fragment) {
            super(0);
            this.$extrasProducer = interfaceC6469a;
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC6469a interfaceC6469a = this.$extrasProducer;
            return (interfaceC6469a == null || (creationExtras = (CreationExtras) interfaceC6469a.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6 */
    public static final class C26896 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26896(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2 */
    public static final class C26932 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC5429e $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26932(InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m13588viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3 */
    public static final class C26943 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC5429e $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26943(InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM13588viewModels$lambda0 = FragmentViewModelLazyKt.m13588viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13588viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13588viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4 */
    public static final class C26954 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC5429e $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26954(Fragment fragment, InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM13588viewModels$lambda0 = FragmentViewModelLazyKt.m13588viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13588viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13588viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6 */
    public static final class C26976 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC5429e $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26976(InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m13589viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7 */
    public static final class C26987 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6469a $extrasProducer;
        final /* synthetic */ InterfaceC5429e $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26987(InterfaceC6469a interfaceC6469a, InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$extrasProducer = interfaceC6469a;
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC6469a interfaceC6469a = this.$extrasProducer;
            if (interfaceC6469a != null && (creationExtras = (CreationExtras) interfaceC6469a.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerM13589viewModels$lambda1 = FragmentViewModelLazyKt.m13589viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13589viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13589viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8 */
    public static final class C26998 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC5429e $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26998(Fragment fragment, InterfaceC5429e interfaceC5429e) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = interfaceC5429e;
        }

        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM13589viewModels$lambda1 = FragmentViewModelLazyKt.m13589viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13589viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13589viewModels$lambda1 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.$this_viewModels.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e activityViewModels(Fragment fragment, InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e activityViewModels$default(Fragment fragment, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        AbstractC5830k.m5338o();
        throw null;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ InterfaceC5429e createViewModelLazy(final Fragment fragment, InterfaceC6779c interfaceC6779c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        return createViewModelLazy(fragment, interfaceC6779c, interfaceC6469a, new InterfaceC6469a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final CreationExtras invoke() {
                return fragment.getDefaultViewModelCreationExtras();
            }
        }, interfaceC6469a2);
    }

    public static /* synthetic */ InterfaceC5429e createViewModelLazy$default(Fragment fragment, InterfaceC6779c interfaceC6779c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC6469a2 = null;
        }
        return createViewModelLazy(fragment, interfaceC6779c, interfaceC6469a, interfaceC6469a2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e viewModels(Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC6469a));
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e viewModels$default(final Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(interfaceC6469a));
        AbstractC5830k.m5338o();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m13588viewModels$lambda0(InterfaceC5429e interfaceC5429e) {
        return (ViewModelStoreOwner) interfaceC5429e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m13589viewModels$lambda1(InterfaceC5429e interfaceC5429e) {
        return (ViewModelStoreOwner) interfaceC5429e.getValue();
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e activityViewModels(Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e activityViewModels$default(Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        AbstractC5830k.m5338o();
        throw null;
    }

    @MainThread
    @NotNull
    public static final <VM extends ViewModel> InterfaceC5429e createViewModelLazy(@NotNull final Fragment fragment, @NotNull InterfaceC6779c interfaceC6779c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @Nullable InterfaceC6469a interfaceC6469a3) {
        if (interfaceC6469a3 == null) {
            interfaceC6469a3 = new InterfaceC6469a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final ViewModelProvider.Factory invoke() {
                    return fragment.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new ViewModelLazy(interfaceC6779c, interfaceC6469a, interfaceC6469a3, interfaceC6469a2);
    }

    public static /* synthetic */ InterfaceC5429e createViewModelLazy$default(final Fragment fragment, InterfaceC6779c interfaceC6779c, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final CreationExtras invoke() {
                    return fragment.getDefaultViewModelCreationExtras();
                }
            };
        }
        if ((i & 8) != 0) {
            interfaceC6469a3 = null;
        }
        return createViewModelLazy(fragment, interfaceC6779c, interfaceC6469a, interfaceC6469a2, interfaceC6469a3);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e viewModels(Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3) {
        AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC6469a));
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e viewModels$default(final Fragment fragment, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(interfaceC6469a));
        AbstractC5830k.m5338o();
        throw null;
    }
}
