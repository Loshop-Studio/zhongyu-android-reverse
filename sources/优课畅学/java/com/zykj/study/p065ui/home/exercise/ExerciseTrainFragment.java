package com.zykj.study.p065ui.home.exercise;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.databinding.FragmentExerciseTrainBinding;
import com.zykj.study.p065ui.home.exercise.ExerciseTrainFragment;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8356e;
import p113g8.AbstractC8661c0;
import p121h5.AbstractC8715b;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8807u;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p232r5.C9913a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseTrainFragment extends Hilt_ExerciseTrainFragment<FragmentExerciseTrainBinding> {

    /* renamed from: j */
    public static final C7811a f11866j = new C7811a(null);

    /* renamed from: k */
    public static final int f11867k = 8;

    /* renamed from: f */
    public final InterfaceC8724d f11868f;

    /* renamed from: g */
    public final NavArgsLazy f11869g = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseTrainFragmentArgs.class), new C7813c(this));

    /* renamed from: h */
    public final InterfaceC8724d f11870h;

    /* renamed from: i */
    public final InterfaceC8724d f11871i;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$a */
    public static final class C7811a {
        public /* synthetic */ C7811a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7811a() {
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$b */
    public static final class C7812b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11890a;

        public C7812b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11890a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11890a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11890a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$c */
    public static final class C7813c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11891a;

        public C7813c(Fragment fragment) {
            this.f11891a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11891a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11891a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment", m17801f = "ExerciseTrainFragment.kt", m17802l = {52, 54}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initData$1 */
    public static final class C78141 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11892a;

        /* renamed from: c */
        public int f11894c;

        public C78141(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11892a = obj;
            this.f11894c |= Integer.MIN_VALUE;
            return ExerciseTrainFragment.this.initData(this);
        }
    }

    public ExerciseTrainFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f11868f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f11870h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseTrainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f11871i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = interfaceC10559a;
                if (interfaceC10559a4 != null && (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseTrainFragment$special$$inlined$viewModels$default$10
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final LoginViewModel m10607A() {
        return (LoginViewModel) this.f11868f.getValue();
    }

    /* renamed from: B */
    private final WebViewControlViewModel m10608B() {
        return (WebViewControlViewModel) this.f11871i.getValue();
    }

    /* renamed from: D */
    public static final C8736p m10609D(ExerciseTrainFragment exerciseTrainFragment, List list) {
        exerciseTrainFragment.m10644z().m12015m();
        return C8736p.f16368a;
    }

    /* renamed from: E */
    public static final C8736p m10610E(ExerciseTrainFragment exerciseTrainFragment, ToastMessage toastMessage) {
        LifecycleOwner viewLifecycleOwner = exerciseTrainFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new ExerciseTrainFragment$initData$3$1(exerciseTrainFragment, toastMessage, null));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public static final C8736p m10611G(final ExerciseTrainFragment exerciseTrainFragment, ExerciseBean exerciseBean) {
        TitleBar titleBar = ((FragmentExerciseTrainBinding) exerciseTrainFragment.getMBindView()).toolbar;
        String title = exerciseBean.getTitle();
        if (title == null) {
            title = "";
        }
        titleBar.m6539t(title).m6535p(exerciseTrainFragment.getString(R$string.arrow_left_return)).m6537r(exerciseTrainFragment.getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(exerciseTrainFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseTrainFragment.m10612H(this.f20510a, view);
            }
        });
        ((FragmentExerciseTrainBinding) exerciseTrainFragment.getMBindView()).multipleStatusView.m11961f();
        return C8736p.f16368a;
    }

    /* renamed from: H */
    public static final void m10612H(ExerciseTrainFragment exerciseTrainFragment, View view) {
        FragmentKt.findNavController(exerciseTrainFragment).navigateUp();
    }

    /* renamed from: I */
    public static final void m10613I(ExerciseTrainFragment exerciseTrainFragment, View view) {
        FragmentKt.findNavController(exerciseTrainFragment).navigateUp();
    }

    /* renamed from: J */
    public static final C8736p m10614J(ExerciseTrainFragment exerciseTrainFragment, OnBackPressedCallback addCallback) {
        AbstractC9133u.m16133g(addCallback, "$this$addCallback");
        Fragment fragmentFindFragmentByTag = exerciseTrainFragment.getChildFragmentManager().findFragmentByTag("BlackboardEvaluationFragment");
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            FragmentKt.findNavController(exerciseTrainFragment).navigateUp();
        } else {
            exerciseTrainFragment.m10638O();
        }
        return C8736p.f16368a;
    }

    /* renamed from: K */
    public static final C8736p m10615K(ExerciseTrainFragment exerciseTrainFragment, QuestionBean questionBean) {
        LifecycleOwner viewLifecycleOwner = exerciseTrainFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseTrainFragment$initView$3$1(exerciseTrainFragment, questionBean, null), 3, null);
        return C8736p.f16368a;
    }

    /* renamed from: L */
    public static final void m10616L(ExerciseTrainFragment exerciseTrainFragment, View view) {
        LifecycleOwner viewLifecycleOwner = exerciseTrainFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new ExerciseTrainFragment$initView$4$1(exerciseTrainFragment, null));
    }

    /* renamed from: M */
    public static final C8736p m10617M(ExerciseTrainFragment exerciseTrainFragment, Integer num) {
        LifecycleOwner viewLifecycleOwner = exerciseTrainFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseTrainFragment$initView$5$1(exerciseTrainFragment, null), 3, null);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public static final C8736p m10618N(ExerciseTrainFragment exerciseTrainFragment, Boolean bool) {
        ((FragmentExerciseTrainBinding) exerciseTrainFragment.getMBindView()).toolbar.getLeftText().setEnabled(!bool.booleanValue());
        if (bool.booleanValue()) {
            exerciseTrainFragment.m10640Q();
        } else {
            exerciseTrainFragment.m10636C();
        }
        return C8736p.f16368a;
    }

    /* renamed from: R */
    public static final C8736p m10619R(ExerciseTrainFragment exerciseTrainFragment, float f10) {
        exerciseTrainFragment.m10639P(f10);
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final C8736p m10635x(ExerciseTrainFragment exerciseTrainFragment) {
        exerciseTrainFragment.m10638O();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final void m10636C() {
        TextView tvPageMovingProgress = ((FragmentExerciseTrainBinding) getMBindView()).tvPageMovingProgress;
        AbstractC9133u.m16132f(tvPageMovingProgress, "tvPageMovingProgress");
        tvPageMovingProgress.setVisibility(8);
        getChildFragmentManager().beginTransaction().remove(m10642w()).commitNowAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public final void m10637F() {
        ((FragmentExerciseTrainBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return)).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: w4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseTrainFragment.m10613I(this.f20539a, view);
            }
        });
        m10644z().m12159w().observe(getViewLifecycleOwner(), new C7812b(new InterfaceC10570l() { // from class: w4.z
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseTrainFragment.m10611G(this.f20587a, (ExerciseBean) obj);
            }
        }));
    }

    /* renamed from: O */
    public final void m10638O() {
        AbstractC8715b.a aVar = AbstractC8715b.f16339a;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        int iM14219b = aVar.m14219b(contextRequireContext);
        Context contextRequireContext2 = requireContext();
        AbstractC9133u.m16132f(contextRequireContext2, "requireContext(...)");
        int iM14218a = aVar.m14218a(contextRequireContext2);
        m10644z().m12153G(m10642w(), iM14219b, iM14218a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final void m10639P(float f10) {
        if (f10 < 0.05f) {
            ((FragmentExerciseTrainBinding) getMBindView()).tvPageMovingProgress.setText(getString(R$string.page_on_the_top));
        } else if (f10 >= 0.95f) {
            ((FragmentExerciseTrainBinding) getMBindView()).tvPageMovingProgress.setText(getString(R$string.page_on_the_bottom));
        } else {
            ((FragmentExerciseTrainBinding) getMBindView()).tvPageMovingProgress.setText(getString(R$string.page_could_be_slide));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final void m10640Q() {
        if (AbstractC8661c0.m13993h0(m10644z().m12158v())) {
            return;
        }
        BlackboardEvaluationFragment blackboardEvaluationFragmentM10642w = m10642w();
        TextView tvPageMovingProgress = ((FragmentExerciseTrainBinding) getMBindView()).tvPageMovingProgress;
        AbstractC9133u.m16132f(tvPageMovingProgress, "tvPageMovingProgress");
        tvPageMovingProgress.setVisibility(0);
        blackboardEvaluationFragmentM10642w.m13072v0(new InterfaceC10570l() { // from class: w4.h0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseTrainFragment.m10619R(this.f20527a, ((Float) obj).floatValue());
            }
        });
        getChildFragmentManager().beginTransaction().replace(R$id.frame_layout, blackboardEvaluationFragmentM10642w, "BlackboardEvaluationFragment").commitNowAllowingStateLoss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r7.m12156J(r2, r4, r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.study.p065ui.home.exercise.ExerciseTrainFragment.C78141
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.ExerciseTrainFragment.C78141) r0
            int r1 = r0.f11894c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11894c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initData$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11892a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11894c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L44
        L38:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f11894c = r4
            java.lang.Object r7 = super.initData(r0)
            if (r7 != r1) goto L44
            goto L68
        L44:
            com.zykj.study.viewmodels.ExerciseTrainViewModel r7 = r6.m10644z()
            com.zykj.study.ui.home.exercise.ExerciseTrainFragmentArgs r2 = r6.m10643y()
            int r2 = r2.m10647b()
            com.zykj.study.ui.home.exercise.ExerciseTrainFragmentArgs r4 = r6.m10643y()
            int r4 = r4.m10646a()
            com.zykj.study.ui.home.exercise.ExerciseTrainFragmentArgs r5 = r6.m10643y()
            int r5 = r5.m10648c()
            r0.f11894c = r3
            java.lang.Object r7 = r7.m12156J(r2, r4, r5, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            com.zykj.study.viewmodels.ExerciseTrainViewModel r7 = r6.m10644z()
            androidx.lifecycle.MutableLiveData r7 = r7.m12010h()
            w4.f0 r0 = new w4.f0
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseTrainFragment$b r1 = new com.zykj.study.ui.home.exercise.ExerciseTrainFragment$b
            r1.<init>(r0)
            r7.observe(r6, r1)
            com.zykj.study.viewmodels.ExerciseTrainViewModel r7 = r6.m10644z()
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r7.m12161y()
            w4.g0 r0 = new w4.g0
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseTrainFragment$b r1 = new com.zykj.study.ui.home.exercise.ExerciseTrainFragment$b
            r1.<init>(r0)
            r7.observe(r6, r1)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.ExerciseTrainFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseTrainFragment.smali:1780
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        ((FragmentExerciseTrainBinding) getMBindView()).setEntity(m10644z());
        ((FragmentExerciseTrainBinding) getMBindView()).setWebViewControlViewModel(m10608B());
        m10637F();
        CustomWebView webView = ((FragmentExerciseTrainBinding) getMBindView()).exerciseSubject.webView;
        AbstractC9133u.m16132f(webView, "webView");
        CustomWebView webViewAnalysis = ((FragmentExerciseTrainBinding) getMBindView()).exerciseSubject.webViewAnalysis;
        AbstractC9133u.m16132f(webViewAnalysis, "webViewAnalysis");
        CustomWebView webViewCorrectAnswer = ((FragmentExerciseTrainBinding) getMBindView()).exerciseSubject.webViewCorrectAnswer;
        AbstractC9133u.m16132f(webViewCorrectAnswer, "webViewCorrectAnswer");
        m10641v(webView, webViewAnalysis, webViewCorrectAnswer);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new InterfaceC10570l() { // from class: w4.y
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return ExerciseTrainFragment.m10614J(this.f20585a, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        m10644z().m12008f().observe(getViewLifecycleOwner(), new C7812b(new InterfaceC10570l() { // from class: w4.b0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseTrainFragment.m10615K(this.f20512a, (QuestionBean) obj);
            }
        }));
        ((FragmentExerciseTrainBinding) getMBindView()).multipleStatusView.setOnRetryClickListener(new View.OnClickListener() { // from class: w4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseTrainFragment.m10616L(this.f20515a, view);
            }
        });
        m10644z().m12149C().observe(getViewLifecycleOwner(), new C7812b(new InterfaceC10570l() { // from class: w4.d0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseTrainFragment.m10617M(this.f20518a, (Integer) obj);
            }
        }));
        m10644z().m12148B().observe(getViewLifecycleOwner(), new C7812b(new InterfaceC10570l() { // from class: w4.e0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseTrainFragment.m10618N(this.f20520a, (Boolean) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train;
    }

    /* renamed from: v */
    public final void m10641v(CustomWebView... customWebViewArr) {
        for (CustomWebView customWebView : customWebViewArr) {
            C8356e c8356e = C8356e.f15876a;
            customWebView.m11883a(c8356e.m13622d());
            customWebView.m11883a(c8356e.m13619a());
            customWebView.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        }
    }

    /* renamed from: w */
    public final BlackboardEvaluationFragment m10642w() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("BlackboardEvaluationFragment");
        return (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded() && (fragmentFindFragmentByTag instanceof BlackboardEvaluationFragment)) ? (BlackboardEvaluationFragment) fragmentFindFragmentByTag : BlackboardEvaluationFragment.f15147l.m13074a(m10644z().m12158v(), new C9913a(false, true, 2, 3, false, 0.0f, 35.0f, new InterfaceC10559a() { // from class: w4.i0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ExerciseTrainFragment.m10635x(this.f20531a);
            }
        }, false, false, false, false, 0.0f, false, null, 32561, null));
    }

    /* renamed from: y */
    public final ExerciseTrainFragmentArgs m10643y() {
        return (ExerciseTrainFragmentArgs) this.f11869g.getValue();
    }

    /* renamed from: z */
    public final ExerciseTrainViewModel m10644z() {
        return (ExerciseTrainViewModel) this.f11870h.getValue();
    }
}
