package com.zykj.lib.login.p062ui.teacher;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.lib.login.R$id;
import com.zykj.lib.login.R$layout;
import com.zykj.lib.login.databinding.LoginFragmentLoginTeacherBinding;
import com.zykj.lib.login.p062ui.teacher.AbstractC7343a;
import com.zykj.message.client.MessageClient;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p064ui.PolicyCheckView;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TeacherLoginFragment extends Hilt_TeacherLoginFragment<LoginFragmentLoginTeacherBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f9961f;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment", m17801f = "TeacherLoginFragment.kt", m17802l = {33}, m17803m = "initData")
    /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initData$1 */
    public static final class C73381 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f9968a;

        /* renamed from: c */
        public int f9970c;

        public C73381(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9968a = obj;
            this.f9970c |= Integer.MIN_VALUE;
            return TeacherLoginFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2", m17801f = "TeacherLoginFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2 */
    public static final class C73392 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9971a;

        /* renamed from: b */
        public /* synthetic */ Object f9972b;

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$1", m17801f = "TeacherLoginFragment.kt", m17802l = {54}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f9974a;

            /* renamed from: b */
            public final /* synthetic */ TeacherLoginFragment f9975b;

            @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$1$1", m17801f = "TeacherLoginFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107951 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f9976a;

                /* renamed from: b */
                public final /* synthetic */ TeacherLoginFragment f9977b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C107951(TeacherLoginFragment teacherLoginFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f9977b = teacherLoginFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    return new C107951(this.f9977b, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.f9976a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    FragmentKt.findNavController(this.f9977b).navigateUp();
                    return C8736p.f16368a;
                }

                public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                    return ((C107951) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TeacherLoginFragment teacherLoginFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f9975b = teacherLoginFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f9975b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f9974a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM9327l = this.f9975b.m9314i().m9327l();
                    C107951 c107951 = new C107951(this.f9975b, null);
                    this.f9974a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9275lM9327l, c107951, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$2", m17801f = "TeacherLoginFragment.kt", m17802l = {61}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f9978a;

            /* renamed from: b */
            public final /* synthetic */ TeacherLoginFragment f9979b;

            @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$2$1", m17801f = "TeacherLoginFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f9980a;

                /* renamed from: b */
                public /* synthetic */ Object f9981b;

                /* renamed from: c */
                public final /* synthetic */ TeacherLoginFragment f9982c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TeacherLoginFragment teacherLoginFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f9982c = teacherLoginFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC7343a abstractC7343a, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(abstractC7343a, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9982c, interfaceC9324c);
                    anonymousClass1.f9981b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC7343a abstractC7343a = (AbstractC7343a) this.f9981b;
                    AbstractC9434a.m17291f();
                    if (this.f9980a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    if (abstractC7343a instanceof AbstractC7343a.b) {
                        FragmentKt.findNavController(this.f9982c).navigate(R$id.sendSmsDialog);
                    } else {
                        if (!(abstractC7343a instanceof AbstractC7343a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        FragmentKt.findNavController(this.f9982c).navigate(R$id.changePwdDialog, BundleKt.bundleOf(AbstractC8726f.m14230a("arg_pwd_level", AbstractC9536a.m17798c(((AbstractC7343a.a) abstractC7343a).m9331a()))));
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TeacherLoginFragment teacherLoginFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f9979b = teacherLoginFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f9979b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f9978a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM9319d = this.f9979b.m9314i().m9319d();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9979b, null);
                    this.f9978a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9275lM9319d, anonymousClass1, this) == objM17291f) {
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

        public C73392(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73392 c73392 = TeacherLoginFragment.this.new C73392(interfaceC9324c);
            c73392.f9972b = obj;
            return c73392;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73392) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f9972b;
            AbstractC9434a.m17291f();
            if (this.f9971a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(TeacherLoginFragment.this, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(TeacherLoginFragment.this, null), 3, null);
            return C8736p.f16368a;
        }
    }

    public TeacherLoginFragment() {
        final int i10 = R$id.nav_login;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f9961f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TeacherLoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.lib.login.ui.teacher.TeacherLoginFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                AbstractC9133u.m16132f(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* renamed from: j */
    public static final C8736p m9313j(TeacherLoginFragment teacherLoginFragment, OnBackPressedCallback addCallback) {
        AbstractC9133u.m16133g(addCallback, "$this$addCallback");
        teacherLoginFragment.requireActivity().moveTaskToBack(true);
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public final TeacherLoginViewModel m9314i() {
        return (TeacherLoginViewModel) this.f9961f.getValue();
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
            boolean r0 = r7 instanceof com.zykj.lib.login.p062ui.teacher.TeacherLoginFragment.C73381
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initData$1 r0 = (com.zykj.lib.login.p062ui.teacher.TeacherLoginFragment.C73381) r0
            int r1 = r0.f9970c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9970c = r1
            goto L18
        L13:
            com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initData$1 r0 = new com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9968a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f9970c
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
            r0.f9970c = r3
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()
            androidx.activity.OnBackPressedDispatcher r0 = r7.getOnBackPressedDispatcher()
            p3.b r3 = new p3.b
            r3.<init>()
            r4 = 2
            r5 = 0
            r2 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.TeacherLoginFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/TeacherLoginFragment.smali:202
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((LoginFragmentLoginTeacherBinding) getMBindView()).mo9250a(m9314i());
        if (MessageClient.f10416a.mo9574g()) {
            PolicyCheckView policyCheckView = ((LoginFragmentLoginTeacherBinding) getMBindView()).f9891g;
            AbstractC9133u.m16132f(policyCheckView, "policyCheckView");
            policyCheckView.setVisibility(8);
        } else {
            Context contextRequireContext = requireContext();
            AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
            PolicyHelper.Builder builderM9729f = new PolicyHelper.Builder(contextRequireContext).m9730g("https://web.alicdn.zykj.org/privacypolicy/selfStudy/userServiceAgreement.html").m9729f("https://web.alicdn.zykj.org/privacypolicy/selfStudy/userPrivacyPolicy.html");
            PolicyCheckView policyCheckView2 = ((LoginFragmentLoginTeacherBinding) getMBindView()).f9891g;
            AbstractC9133u.m16132f(policyCheckView2, "policyCheckView");
            builderM9729f.m9731h(policyCheckView2);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C73392(null), 3, null);
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.login_fragment_login_teacher;
    }
}
