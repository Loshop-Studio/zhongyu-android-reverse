package com.zykj.study.p065ui;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.FragmentKt;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentMainBinding;
import com.zykj.study.viewmodels.MainViewModel;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8365n;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MainFragment extends Hilt_MainFragment<FragmentMainBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f11632f;

    /* renamed from: g */
    public final InterfaceC8724d f11633g;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainFragment", m17801f = "MainFragment.kt", m17802l = {32, 40}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.MainFragment$initData$1 */
    public static final class C77601 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11645a;

        /* renamed from: c */
        public int f11647c;

        public C77601(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11645a = obj;
            this.f11647c |= Integer.MIN_VALUE;
            return MainFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainFragment$initView$2", m17801f = "MainFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.MainFragment$initView$2 */
    public static final class C77612 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11648a;

        /* renamed from: b */
        public /* synthetic */ Object f11649b;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainFragment$initView$2$1", m17801f = "MainFragment.kt", m17802l = {51}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.MainFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11651a;

            /* renamed from: b */
            public /* synthetic */ Object f11652b;

            /* renamed from: c */
            public final /* synthetic */ MainFragment f11653c;

            @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainFragment$initView$2$1$1", m17801f = "MainFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.study.ui.MainFragment$initView$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107981 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f11654a;

                /* renamed from: b */
                public /* synthetic */ Object f11655b;

                /* renamed from: c */
                public final /* synthetic */ InterfaceC8822b0 f11656c;

                /* renamed from: d */
                public final /* synthetic */ MainFragment f11657d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107981(InterfaceC8822b0 interfaceC8822b0, MainFragment mainFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f11656c = interfaceC8822b0;
                    this.f11657d = mainFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(UserBean userBean, InterfaceC9324c interfaceC9324c) {
                    return ((C107981) create(userBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    C107981 c107981 = new C107981(this.f11656c, this.f11657d, interfaceC9324c);
                    c107981.f11655b = obj;
                    return c107981;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object obj2;
                    UserBean userBean = (UserBean) this.f11655b;
                    AbstractC9434a.m17291f();
                    if (this.f11654a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    MainFragment mainFragment = this.f11657d;
                    try {
                        Result.C9076a c9076a = Result.f17350b;
                        String id = userBean.getId();
                        AbstractC9133u.m16132f(id, "getId(...)");
                        if (id.length() == 0) {
                            FragmentKt.findNavController(mainFragment).navigate(R$id.nav_login);
                            obj2 = C8736p.f16368a;
                        } else {
                            mainFragment.m10464j().m12182c();
                            if (userBean.getRole() == RoleType.Student) {
                                String id2 = userBean.getId();
                                AbstractC9133u.m16132f(id2, "getId(...)");
                                AbstractC8365n.m13648b(Long.parseLong(id2));
                            }
                            CrashReport.setUserId(userBean.getUserName());
                            NavDirections navDirectionsM10509a = AbstractC7775c.f11725a.m10509a();
                            FragmentKt.findNavController(mainFragment).navigate(navDirectionsM10509a);
                            obj2 = navDirectionsM10509a;
                        }
                        Result.m15909b(obj2);
                    } catch (Throwable th) {
                        Result.C9076a c9076a2 = Result.f17350b;
                        Result.m15909b(AbstractC9079b.m15925a(th));
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainFragment mainFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11653c = mainFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11653c, interfaceC9324c);
                anonymousClass1.f11652b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f11652b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11651a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c data = this.f11653c.m10463i().m9295c().getData();
                    C107981 c107981 = new C107981(interfaceC8822b0, this.f11653c, null);
                    this.f11652b = AbstractC9543h.m17814a(interfaceC8822b0);
                    this.f11651a = 1;
                    if (AbstractC9268e.m17019i(data, c107981, this) == objM17291f) {
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

        public C77612(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C77612 c77612 = MainFragment.this.new C77612(interfaceC9324c);
            c77612.f11649b = obj;
            return c77612;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77612) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f11649b;
            AbstractC9434a.m17291f();
            if (this.f11648a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(MainFragment.this, null), 3, null);
            return C8736p.f16368a;
        }
    }

    public MainFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f11632f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f11633g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.MainFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final LoginViewModel m10463i() {
        return (LoginViewModel) this.f11632f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.zykj.study.p065ui.MainFragment.C77601
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.ui.MainFragment$initData$1 r0 = (com.zykj.study.p065ui.MainFragment.C77601) r0
            int r1 = r0.f11647c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11647c = r1
            goto L18
        L13:
            com.zykj.study.ui.MainFragment$initData$1 r0 = new com.zykj.study.ui.MainFragment$initData$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11645a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11647c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r6)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L44
        L38:
            kotlin.AbstractC9079b.m15926b(r6)
            r0.f11647c = r4
            java.lang.Object r6 = super.initData(r0)
            if (r6 != r1) goto L44
            goto L6c
        L44:
            com.zykj.message.client.MessageClient r6 = com.zykj.message.client.MessageClient.f10416a
            boolean r6 = r6.mo9574g()
            if (r6 == 0) goto L58
            androidx.navigation.NavController r6 = androidx.navigation.fragment.FragmentKt.findNavController(r5)
            int r0 = com.zykj.lib.login.R$id.nav_login
            r6.navigate(r0)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L58:
            com.zykj.lib.login.ui.main.LoginViewModel r6 = r5.m10463i()
            androidx.datastore.core.DataStore r6 = r6.m9295c()
            l8.c r6 = r6.getData()
            r0.f11647c = r3
            java.lang.Object r6 = p169l8.AbstractC9268e.m17036z(r6, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.zykj.lib.login.proto.UserBean r6 = (com.zykj.lib.login.proto.UserBean) r6
            if (r6 == 0) goto L76
            com.zykj.lib.login.proto.RoleType r6 = r6.getRole()
            goto L77
        L76:
            r6 = 0
        L77:
            com.zykj.lib.login.proto.RoleType r0 = com.zykj.lib.login.proto.RoleType.Student
            if (r6 != r0) goto L87
            androidx.navigation.NavController r6 = androidx.navigation.fragment.FragmentKt.findNavController(r5)
            int r0 = com.zykj.lib.login.R$id.nav_login
            r6.navigate(r0)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L87:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.MainFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/MainFragment.smali:236
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentMainBinding) getMBindView()).setEntity(m10464j());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C77612(null), 3, null);
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final MainViewModel m10464j() {
        return (MainViewModel) this.f11633g.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_main;
    }
}
