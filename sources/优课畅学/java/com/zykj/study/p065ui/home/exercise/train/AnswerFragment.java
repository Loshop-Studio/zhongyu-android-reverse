package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerBinding;
import com.zykj.study.p065ui.home.exercise.train.AnswerFragment;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.TrainAnswerMicroViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import java.io.File;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.AbstractC8366o;
import p105g0.C8514b;
import p113g8.AbstractC8661c0;
import p121h5.C8716c;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AnswerFragment extends Hilt_AnswerFragment<FragmentExerciseTrainAnswerBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12143f = new NavArgsLazy(AbstractC9137y.m16154b(AnswerFragmentArgs.class), new C7853b(this));

    /* renamed from: g */
    public final InterfaceC8724d f12144g;

    /* renamed from: h */
    public final InterfaceC8724d f12145h;

    /* renamed from: i */
    public final InterfaceC8724d f12146i;

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerFragment$a */
    public static final class C7852a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12165a;

        public C7852a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12165a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12165a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12165a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerFragment$b */
    public static final class C7853b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12166a;

        public C7853b(Fragment fragment) {
            this.f12166a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12166a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12166a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerFragment", m17801f = "AnswerFragment.kt", m17802l = {45}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$1 */
    public static final class C78541 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12167a;

        /* renamed from: c */
        public int f12169c;

        public C78541(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12167a = obj;
            this.f12169c |= Integer.MIN_VALUE;
            return AnswerFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$2", m17801f = "AnswerFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$2 */
    public static final class C78552 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12170a;

        public C78552(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return AnswerFragment.this.new C78552(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78552) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AnswerFragment.this.m10812r().m12025e(AnswerFragment.this.m10811p().m10814a());
            AnswerFragment.this.m10812r().m12026f(AnswerFragment.this.m10811p().m10815b());
            AnswerFragment.this.m10812r().m12028h(AnswerFragment.this.m10811p().m10816c());
            AnswerFragment.this.m10812r().m12027g(AnswerFragment.this.m10811p().m10817d());
            return C8736p.f16368a;
        }
    }

    public AnswerFragment() {
        final int i10 = R$id.nav_answer_graph;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f12144g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TrainAnswerMicroViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$hiltNavGraphViewModels$4
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
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: x4.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerFragment.m10802o(this.f20932a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12145h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseTrainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$4
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: x4.e
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerFragment.m10810y(this.f20933a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f12146i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = interfaceC10559a2;
                if (interfaceC10559a4 != null && (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* renamed from: o */
    public static final ViewModelStoreOwner m10802o(AnswerFragment answerFragment) {
        Fragment fragmentRequireParentFragment = answerFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: q */
    private final ExerciseTrainViewModel m10803q() {
        return (ExerciseTrainViewModel) this.f12145h.getValue();
    }

    /* renamed from: s */
    private final WebViewControlViewModel m10804s() {
        return (WebViewControlViewModel) this.f12146i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static final C8736p m10805t(AnswerFragment answerFragment, String str) {
        ((FragmentExerciseTrainAnswerBinding) answerFragment.getMBindView()).setSnapshotUrl(str);
        File file = new File(str);
        if (file.exists()) {
            ((C5396g) ComponentCallbacks2C5391b.m2738t(answerFragment.requireContext()).m2809u(str).m13383d0(new C8514b(Long.valueOf(file.lastModified())))).m2790w0(((FragmentExerciseTrainAnswerBinding) answerFragment.getMBindView()).answerMicro.ivSnapshot);
        } else {
            ComponentCallbacks2C5391b.m2738t(answerFragment.requireContext()).m2801m(((FragmentExerciseTrainAnswerBinding) answerFragment.getMBindView()).answerMicro.ivSnapshot);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static final C8736p m10806u(AnswerFragment answerFragment, Boolean bool) {
        ((FragmentExerciseTrainAnswerBinding) answerFragment.getMBindView()).btnSubmit.setEnabled(!bool.booleanValue());
        return C8736p.f16368a;
    }

    /* renamed from: v */
    public static final C8736p m10807v(AnswerFragment answerFragment) {
        Fragment parentFragment;
        FragmentManager childFragmentManager;
        Fragment parentFragment2 = answerFragment.getParentFragment();
        Fragment fragmentFindFragmentByTag = (parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) ? null : childFragmentManager.findFragmentByTag(BlackboardEvaluationFragment.class.getSimpleName());
        if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
            return C8736p.f16368a;
        }
        answerFragment.m10803q().m12148B().postValue(Boolean.TRUE);
        return C8736p.f16368a;
    }

    /* renamed from: w */
    public static final C8736p m10808w(final AnswerFragment answerFragment) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: x4.j
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerFragment.m10809x(this.f20942a);
            }
        });
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public static final C8736p m10809x(AnswerFragment answerFragment) {
        String str = (String) answerFragment.m10803q().m12147A().getValue();
        if (str == null) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "请在答题区作答");
            return C8736p.f16368a;
        }
        if (!new File(str).exists()) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "请在答题区作答");
            return C8736p.f16368a;
        }
        if (AbstractC8661c0.m13993h0(answerFragment.m10803q().m12158v())) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "题目获取失败，请返回再试");
            return C8736p.f16368a;
        }
        answerFragment.m10804s().m12319c();
        try {
            FragmentKt.findNavController(answerFragment).navigate(AbstractC7911b.f12480a.m10988a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static final ViewModelStoreOwner m10810y(AnswerFragment answerFragment) {
        Fragment fragmentRequireParentFragment = answerFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.AnswerFragment.C78541
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.train.AnswerFragment.C78541) r0
            int r1 = r0.f12169c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12169c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12167a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12169c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f12169c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.lifecycle.LifecycleCoroutineScope r5 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$2 r0 = new com.zykj.study.ui.home.exercise.train.AnswerFragment$initData$2
            r1 = 0
            r0.<init>(r1)
            r5.launchWhenStarted(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.AnswerFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/AnswerFragment.smali:1103
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m10804s().m12318b();
        RelativeLayout rlMicroEdit = ((FragmentExerciseTrainAnswerBinding) getMBindView()).answerMicro.rlMicroEdit;
        AbstractC9133u.m16132f(rlMicroEdit, "rlMicroEdit");
        BindingAdaptersKt.onClick(rlMicroEdit, new InterfaceC10559a() { // from class: x4.f
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerFragment.m10807v(this.f20935a);
            }
        });
        RoundButton btnSubmit = ((FragmentExerciseTrainAnswerBinding) getMBindView()).btnSubmit;
        AbstractC9133u.m16132f(btnSubmit, "btnSubmit");
        BindingAdaptersKt.onClick(btnSubmit, new InterfaceC10559a() { // from class: x4.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerFragment.m10808w(this.f20937a);
            }
        });
        m10803q().m12147A().observe(getViewLifecycleOwner(), new C7852a(new InterfaceC10570l() { // from class: x4.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AnswerFragment.m10805t(this.f20939a, (String) obj);
            }
        }));
        m10803q().m12148B().observe(getViewLifecycleOwner(), new C7852a(new InterfaceC10570l() { // from class: x4.i
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AnswerFragment.m10806u(this.f20940a, (Boolean) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_answer;
    }

    /* renamed from: p */
    public final AnswerFragmentArgs m10811p() {
        return (AnswerFragmentArgs) this.f12143f.getValue();
    }

    /* renamed from: r */
    public final TrainAnswerMicroViewModel m10812r() {
        return (TrainAnswerMicroViewModel) this.f12144g.getValue();
    }
}
