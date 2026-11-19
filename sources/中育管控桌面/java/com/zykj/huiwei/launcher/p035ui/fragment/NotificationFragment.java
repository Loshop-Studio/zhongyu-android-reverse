package com.zykj.huiwei.launcher.p035ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zykj.huiwei.launcher.databinding.HwFragmentNotificationBinding;
import com.zykj.huiwei.launcher.p035ui.adapter.NotificationPagingAdapter;
import com.zykj.huiwei.launcher.p035ui.fragment.NotificationFragment;
import com.zykj.huiwei.launcher.viewmodels.NotificationViewModel;
import com.zykj.manage.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/NotificationFragment;", "Lcom/zykj/huiwei/launcher/base/CommonFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwFragmentNotificationBinding;", "<init>", "()V", "", "layoutId", "()I", "", "f", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "", "i", "Z", "()Z", "isLightStatusBars", "j", "h", "isLightNavigationBars", "Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;", "k", "Lkotlin/Lazy;", "x", "()Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;", "viewModel", "", "", "l", "Ljava/util/List;", "readMessageIdList", "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;", "m", "Lcom/zykj/huiwei/launcher/ui/adapter/NotificationPagingAdapter;", "adapter", "n", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nNotificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,129:1\n106#2,15:130\n*S KotlinDebug\n*F\n+ 1 NotificationFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationFragment\n*L\n35#1:130,15\n*E\n"})
/* loaded from: classes4.dex */
public final class NotificationFragment extends Hilt_NotificationFragment<HwFragmentNotificationBinding> {

    /* renamed from: o */
    public static final int f6784o = 8;

    /* renamed from: i, reason: from kotlin metadata */
    public final boolean isLightStatusBars = true;

    /* renamed from: j, reason: from kotlin metadata */
    public final boolean isLightNavigationBars = true;

    /* renamed from: k, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: l, reason: from kotlin metadata */
    public final List readMessageIdList;

    /* renamed from: m, reason: from kotlin metadata */
    public NotificationPagingAdapter adapter;

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$b */
    public static final class C6157b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6797a;

        public C6157b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6797a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6797a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6797a.invoke(obj);
        }
    }

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationFragment", m7918f = "NotificationFragment.kt", m7919i = {}, m7920l = {104}, m7921m = "initData", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initData$1 */
    public static final class C61581 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f6798a;

        /* renamed from: c */
        public int f6800c;

        public C61581(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6798a = obj;
            this.f6800c |= Integer.MIN_VALUE;
            return NotificationFragment.this.initData(this);
        }
    }

    public NotificationFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(NotificationViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.readMessageIdList = new ArrayList();
    }

    /* renamed from: A */
    public static final void m5969A(NotificationFragment notificationFragment) {
        NotificationPagingAdapter notificationPagingAdapter = notificationFragment.adapter;
        if (notificationPagingAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            notificationPagingAdapter = null;
        }
        notificationPagingAdapter.refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final Unit m5970B(NotificationFragment notificationFragment, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((HwFragmentNotificationBinding) notificationFragment.getMBindView()).refreshLayout.setRefreshing(it.getRefresh() instanceof LoadState.Loading);
        LoadState refresh = it.getRefresh();
        if (refresh instanceof LoadState.Loading) {
            notificationFragment.m5979x().getSwipeRefreshShowing().postValue(Boolean.TRUE);
        } else {
            if (!(refresh instanceof LoadState.NotLoading) && !(refresh instanceof LoadState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            notificationFragment.m5979x().getSwipeRefreshShowing().postValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public static final Unit m5971C(NotificationFragment notificationFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            NotificationPagingAdapter notificationPagingAdapter = notificationFragment.adapter;
            if (notificationPagingAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                notificationPagingAdapter = null;
            }
            if (notificationPagingAdapter.getItemCount() == 0) {
                View viewInflate = LayoutInflater.from(((HwFragmentNotificationBinding) notificationFragment.getMBindView()).rvNotification.getContext()).inflate(R.layout.hw_item_home_load_empty, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(R.id.tv_retry)).setVisibility(8);
                ((HwFragmentNotificationBinding) notificationFragment.getMBindView()).statusView.m4962e(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            } else {
                ((HwFragmentNotificationBinding) notificationFragment.getMBindView()).statusView.m4960c();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final NotificationViewModel m5979x() {
        return (NotificationViewModel) this.viewModel.getValue();
    }

    /* renamed from: y */
    public static final Unit m5980y(NotificationFragment notificationFragment, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        notificationFragment.m5982w();
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m5981z(NotificationFragment notificationFragment, View view) {
        notificationFragment.m5982w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: f */
    public void mo5284f() {
        this.adapter = new NotificationPagingAdapter(this.readMessageIdList);
        ((HwFragmentNotificationBinding) getMBindView()).titleBar.m4434h(new View.OnClickListener() { // from class: f4.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationFragment.m5981z(this.f7702a, view);
            }
        });
        ((HwFragmentNotificationBinding) getMBindView()).refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: f4.i0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                NotificationFragment.m5969A(this.f7704a);
            }
        });
        RecyclerView recyclerView = ((HwFragmentNotificationBinding) getMBindView()).rvNotification;
        NotificationPagingAdapter notificationPagingAdapter = this.adapter;
        if (notificationPagingAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            notificationPagingAdapter = null;
        }
        recyclerView.setAdapter(notificationPagingAdapter);
        NotificationPagingAdapter notificationPagingAdapter2 = this.adapter;
        if (notificationPagingAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            notificationPagingAdapter2 = null;
        }
        notificationPagingAdapter2.addLoadStateListener(new Function1() { // from class: f4.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationFragment.m5970B(this.f7706a, (CombinedLoadStates) obj);
            }
        });
        m5979x().getSwipeRefreshShowing().observe(getViewLifecycleOwner(), new C6157b(new Function1() { // from class: f4.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationFragment.m5971C(this.f7708a, (Boolean) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NotificationFragment$initView$5(this, null), 3, null);
    }

    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: h, reason: from getter */
    public boolean getIsLightNavigationBars() {
        return this.isLightNavigationBars;
    }

    @Override // com.zykj.huiwei.launcher.base.CommonFragment
    /* renamed from: i, reason: from getter */
    public boolean getIsLightStatusBars() {
        return this.isLightStatusBars;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.huiwei.launcher.p035ui.fragment.NotificationFragment.C61581
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initData$1 r0 = (com.zykj.huiwei.launcher.p035ui.fragment.NotificationFragment.C61581) r0
            int r1 = r0.f6800c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6800c = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initData$1 r0 = new com.zykj.huiwei.launcher.ui.fragment.NotificationFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6798a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6800c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f6800c = r3
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()
            androidx.activity.OnBackPressedDispatcher r0 = r7.getOnBackPressedDispatcher()
            f4.l0 r3 = new f4.l0
            r3.<init>()
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.fragment.NotificationFragment.initData(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/NotificationFragment.smali:1050
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.hw_fragment_notification;
    }

    /* renamed from: w */
    public final void m5982w() {
        if (!this.readMessageIdList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putLongArray("BUNDLE_KEY_READ_ID", CollectionsKt.toLongArray(this.readMessageIdList));
            Unit unit = Unit.INSTANCE;
            FragmentKt.setFragmentResult(this, "REQUEST_KEY", bundle);
        }
        androidx.navigation.fragment.FragmentKt.findNavController(this).navigateUp();
    }
}
