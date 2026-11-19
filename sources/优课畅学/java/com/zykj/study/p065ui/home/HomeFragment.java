package com.zykj.study.p065ui.home;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.ActivityKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.zykj.lib.ota.bean.VersionInfo;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentHomeBinding;
import com.zykj.study.p065ui.home.HomeFragment;
import com.zykj.study.p065ui.home.find.FindFragment;
import com.zykj.study.p065ui.home.message.MessageFragment;
import com.zykj.study.p065ui.home.p066my.MyFragment;
import com.zykj.study.p065ui.home.study.StudyFragment;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.HomeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8352a;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p139j1.InterfaceC8994a;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class HomeFragment extends Hilt_HomeFragment<FragmentHomeBinding> {

    /* renamed from: f */
    public InterfaceC8994a f11731f;

    /* renamed from: g */
    public final InterfaceC8724d f11732g;

    /* renamed from: h */
    public final InterfaceC8724d f11733h;

    /* renamed from: i */
    public final List f11734i;

    /* renamed from: j */
    public final List f11735j;

    /* renamed from: k */
    public final List f11736k;

    /* renamed from: l */
    public final List f11737l;

    /* renamed from: m */
    public final ServiceConnection f11738m;

    /* renamed from: com.zykj.study.ui.home.HomeFragment$a */
    public static final class C7776a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11750a;

        public C7776a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11750a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11750a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11750a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment", m17801f = "HomeFragment.kt", m17802l = {63}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.HomeFragment$initData$1 */
    public static final class C77781 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11758a;

        /* renamed from: c */
        public int f11760c;

        public C77781(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11758a = obj;
            this.f11760c |= Integer.MIN_VALUE;
            return HomeFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$initData$2", m17801f = "HomeFragment.kt", m17802l = {66}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.HomeFragment$initData$2 */
    public static final class C77792 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11761a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$initData$2$1", m17801f = "HomeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.HomeFragment$initData$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11763a;

            /* renamed from: b */
            public /* synthetic */ Object f11764b;

            /* renamed from: c */
            public final /* synthetic */ HomeFragment f11765c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeFragment homeFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11765c = homeFragment;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(VersionInfo versionInfo, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(versionInfo, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11765c, interfaceC9324c);
                anonymousClass1.f11764b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                VersionInfo versionInfo = (VersionInfo) this.f11764b;
                AbstractC9434a.m17291f();
                if (this.f11763a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (versionInfo.getVersionCode() > 10103) {
                    FragmentActivity fragmentActivityRequireActivity = this.f11765c.requireActivity();
                    AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityKt.findNavController(fragmentActivityRequireActivity, R$id.nav_host_fragment).navigate(R$id.updateChoiceDialogMain, BundleKt.bundleOf(AbstractC8726f.m14230a("versionInfoMain", versionInfo)));
                }
                return C8736p.f16368a;
            }
        }

        public C77792(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return HomeFragment.this.new C77792(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77792) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11761a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9270g interfaceC9270gM12176c = HomeFragment.this.m10521o().m12176c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeFragment.this, null);
                this.f11761a = 1;
                if (AbstractC9268e.m17019i(interfaceC9270gM12176c, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$initView$2", m17801f = "HomeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.HomeFragment$initView$2 */
    public static final class C77802 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11766a;

        public C77802(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return HomeFragment.this.new C77802(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77802) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f11766a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ViewPager2 viewPager2 = ((FragmentHomeBinding) HomeFragment.this.getMBindView()).viewPager;
            HomeFragment homeFragment = HomeFragment.this;
            viewPager2.setUserInputEnabled(false);
            viewPager2.setOffscreenPageLimit(4);
            final FragmentManager childFragmentManager = homeFragment.getChildFragmentManager();
            final Lifecycle lifecycle = homeFragment.getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.zykj.study.ui.home.HomeFragment$initView$2$1$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    return i10 != 0 ? i10 != 1 ? i10 != 2 ? new MyFragment() : new MessageFragment() : new StudyFragment() : new FindFragment();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public int getItemCount() {
                    return 4;
                }
            });
            return C8736p.f16368a;
        }
    }

    public HomeFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11732g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(HomeViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f11733h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                return (interfaceC10559a3 == null || (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.HomeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f11734i = new ArrayList();
        this.f11735j = new ArrayList();
        this.f11736k = new ArrayList();
        this.f11737l = new ArrayList();
        this.f11738m = new ServiceConnection() { // from class: com.zykj.study.ui.home.HomeFragment$connection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                this.f11751a.f11731f = InterfaceC8994a.a.m15648k(iBinder);
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this.f11751a), C8843i0.m14866a(), null, new HomeFragment$connection$1$onServiceConnected$1(this.f11751a, null), 2, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
    }

    /* renamed from: n */
    private final DictViewModel m10516n() {
        return (DictViewModel) this.f11733h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final C8736p m10517q(HomeFragment homeFragment, Integer num) {
        homeFragment.m10524t(false, homeFragment.f11734i, homeFragment.f11735j, homeFragment.f11736k, homeFragment.f11737l);
        ViewPager2 viewPager2 = ((FragmentHomeBinding) homeFragment.getMBindView()).viewPager;
        AbstractC9133u.m16130d(num);
        viewPager2.setCurrentItem(num.intValue(), false);
        if (num.intValue() == 0) {
            homeFragment.m10524t(true, homeFragment.f11734i);
        } else if (num.intValue() == 1) {
            homeFragment.m10524t(true, homeFragment.f11735j);
        } else if (num.intValue() == 2) {
            homeFragment.m10524t(true, homeFragment.f11736k);
        } else if (num.intValue() == 3) {
            homeFragment.m10524t(true, homeFragment.f11737l);
        }
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final C8736p m10518s(HomeFragment homeFragment, OnBackPressedCallback addCallback) {
        AbstractC9133u.m16133g(addCallback, "$this$addCallback");
        FragmentActivity activity = homeFragment.getActivity();
        if (activity != null) {
            activity.moveTaskToBack(true);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.study.p065ui.home.HomeFragment.C77781
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.ui.home.HomeFragment$initData$1 r0 = (com.zykj.study.p065ui.home.HomeFragment.C77781) r0
            int r1 = r0.f11760c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11760c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.HomeFragment$initData$1 r0 = new com.zykj.study.ui.home.HomeFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11758a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11760c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f11760c = r3
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.DictViewModel r7 = r6.m10516n()
            r7.m12082n()
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            com.zykj.study.ui.home.HomeFragment$initData$2 r3 = new com.zykj.study.ui.home.HomeFragment$initData$2
            r7 = 0
            r3.<init>(r7)
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            p135i8.AbstractC8833f.m14845d(r0, r1, r2, r3, r4, r5)
            e5.a r7 = p086e5.C8352a.f15871a
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r0, r1)
            boolean r7 = r7.m13597b(r0)
            if (r7 == 0) goto L6a
            r6.m10519l()
            goto L71
        L6a:
            com.zykj.study.viewmodels.HomeViewModel r7 = r6.m10521o()
            r7.m12175b()
        L71:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.HomeFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/HomeFragment.smali:613
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentHomeBinding) getMBindView()).setViewModel(m10521o());
        List list = this.f11734i;
        ImageView ivFind = ((FragmentHomeBinding) getMBindView()).ivFind;
        AbstractC9133u.m16132f(ivFind, "ivFind");
        list.add(ivFind);
        List list2 = this.f11734i;
        TextView tvFind = ((FragmentHomeBinding) getMBindView()).tvFind;
        AbstractC9133u.m16132f(tvFind, "tvFind");
        list2.add(tvFind);
        List list3 = this.f11734i;
        LinearLayout llFind = ((FragmentHomeBinding) getMBindView()).llFind;
        AbstractC9133u.m16132f(llFind, "llFind");
        list3.add(llFind);
        List list4 = this.f11735j;
        ImageView ivStudy = ((FragmentHomeBinding) getMBindView()).ivStudy;
        AbstractC9133u.m16132f(ivStudy, "ivStudy");
        list4.add(ivStudy);
        List list5 = this.f11735j;
        TextView tvStudy = ((FragmentHomeBinding) getMBindView()).tvStudy;
        AbstractC9133u.m16132f(tvStudy, "tvStudy");
        list5.add(tvStudy);
        List list6 = this.f11735j;
        LinearLayout llStudy = ((FragmentHomeBinding) getMBindView()).llStudy;
        AbstractC9133u.m16132f(llStudy, "llStudy");
        list6.add(llStudy);
        List list7 = this.f11736k;
        ImageView ivMessage = ((FragmentHomeBinding) getMBindView()).ivMessage;
        AbstractC9133u.m16132f(ivMessage, "ivMessage");
        list7.add(ivMessage);
        List list8 = this.f11736k;
        TextView tvMessage = ((FragmentHomeBinding) getMBindView()).tvMessage;
        AbstractC9133u.m16132f(tvMessage, "tvMessage");
        list8.add(tvMessage);
        List list9 = this.f11736k;
        LinearLayout llMessage = ((FragmentHomeBinding) getMBindView()).llMessage;
        AbstractC9133u.m16132f(llMessage, "llMessage");
        list9.add(llMessage);
        List list10 = this.f11737l;
        ImageView ivMy = ((FragmentHomeBinding) getMBindView()).ivMy;
        AbstractC9133u.m16132f(ivMy, "ivMy");
        list10.add(ivMy);
        List list11 = this.f11737l;
        TextView tvMy = ((FragmentHomeBinding) getMBindView()).tvMy;
        AbstractC9133u.m16132f(tvMy, "tvMy");
        list11.add(tvMy);
        List list12 = this.f11737l;
        LinearLayout llMy = ((FragmentHomeBinding) getMBindView()).llMy;
        AbstractC9133u.m16132f(llMy, "llMy");
        list12.add(llMy);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new C77802(null));
        m10523r();
        m10522p();
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final void m10519l() {
        C8352a c8352a = C8352a.f15871a;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        if (c8352a.m13597b(contextRequireContext)) {
            Intent intent = new Intent();
            intent.setPackage("cn.com.techvision.appstore");
            intent.setAction("cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE");
            requireActivity().bindService(intent, this.f11738m, 1);
        }
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_home;
    }

    /* renamed from: m */
    public final void m10520m() {
        C8352a c8352a = C8352a.f15871a;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        if (c8352a.m13597b(contextRequireContext)) {
            requireActivity().unbindService(this.f11738m);
        }
    }

    /* renamed from: o */
    public final HomeViewModel m10521o() {
        return (HomeViewModel) this.f11732g.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m10520m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f11734i.clear();
        this.f11735j.clear();
        this.f11736k.clear();
        this.f11737l.clear();
        ((FragmentHomeBinding) getMBindView()).viewPager.setAdapter(null);
    }

    /* renamed from: p */
    public final void m10522p() {
        m10521o().m12177d().observe(getViewLifecycleOwner(), new C7776a(new InterfaceC10570l() { // from class: v4.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return HomeFragment.m10517q(this.f20432a, (Integer) obj);
            }
        }));
    }

    /* renamed from: r */
    public final void m10523r() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new InterfaceC10570l() { // from class: v4.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return HomeFragment.m10518s(this.f20433a, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    /* renamed from: t */
    public final void m10524t(boolean z10, List... listArr) {
        for (List list : listArr) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setSelected(z10);
            }
        }
    }
}
