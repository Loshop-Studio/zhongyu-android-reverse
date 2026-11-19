package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.QuestionExtra;
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceBinding;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceFragment;
import com.zykj.study.utils.ChoiceList;
import com.zykj.study.view.MultipleChoiceView;
import com.zykj.study.viewmodels.TrainMultipleChoiceViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceFragment extends Hilt_MultipleChoiceFragment<FragmentExerciseTrainMultipleChoiceBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12302f = new NavArgsLazy(AbstractC9137y.m16154b(MultipleChoiceFragmentArgs.class), new C7868a(this));

    /* renamed from: g */
    public final InterfaceC8724d f12303g;

    /* renamed from: h */
    public final InterfaceC8724d f12304h;

    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$a */
    public static final class C7868a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12317a;

        public C7868a(Fragment fragment) {
            this.f12317a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12317a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12317a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment", m17801f = "MultipleChoiceFragment.kt", m17802l = {39}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$initData$1 */
    public static final class C78691 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12318a;

        /* renamed from: c */
        public int f12320c;

        public C78691(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12318a = obj;
            this.f12320c |= Integer.MIN_VALUE;
            return MultipleChoiceFragment.this.initData(this);
        }
    }

    public MultipleChoiceFragment() {
        final int i10 = R$id.nav_answer_graph;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f12303g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TrainMultipleChoiceViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$4
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
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: x4.b0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MultipleChoiceFragment.m10893m(this.f20930a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12304h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$special$$inlined$viewModels$default$4
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

    /* renamed from: k */
    private final WebViewControlViewModel m10891k() {
        return (WebViewControlViewModel) this.f12304h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static final C8736p m10892l(MultipleChoiceFragment multipleChoiceFragment) {
        ChoiceList choiceList = new ChoiceList();
        Iterator it = ((FragmentExerciseTrainMultipleChoiceBinding) multipleChoiceFragment.getMBindView()).answerChoice.recycler.m11939c().iterator();
        while (it.hasNext()) {
            choiceList.add((String) it.next());
        }
        if (choiceList.isEmpty()) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "请选择答案");
            return C8736p.f16368a;
        }
        multipleChoiceFragment.m10891k().m12320d();
        if (multipleChoiceFragment.m10895j().m12309i(choiceList)) {
            FragmentKt.findNavController(multipleChoiceFragment).navigate(AbstractC7918i.f12495a.m10992b());
        } else {
            FragmentKt.findNavController(multipleChoiceFragment).navigate(AbstractC7918i.f12495a.m10991a((String[]) ((FragmentExerciseTrainMultipleChoiceBinding) multipleChoiceFragment.getMBindView()).answerChoice.recycler.m11939c().toArray(new String[0])));
        }
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final ViewModelStoreOwner m10893m(MultipleChoiceFragment multipleChoiceFragment) {
        Fragment fragmentRequireParentFragment = multipleChoiceFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: i */
    public final MultipleChoiceFragmentArgs m10894i() {
        return (MultipleChoiceFragmentArgs) this.f12302f.getValue();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceFragment.C78691
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceFragment.C78691) r0
            int r1 = r0.f12320c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12320c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12318a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12320c
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
            r0.f12320c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10895j()
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragmentArgs r0 = r4.m10894i()
            long r0 = r0.m10897a()
            r5.m12025e(r0)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10895j()
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragmentArgs r0 = r4.m10894i()
            int r0 = r0.m10898b()
            r5.m12026f(r0)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10895j()
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragmentArgs r0 = r4.m10894i()
            com.zykj.study.bean.exercise.QuestionBean r0 = r0.m10899c()
            r5.m12028h(r0)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10895j()
            com.zykj.study.ui.home.exercise.train.MultipleChoiceFragmentArgs r0 = r4.m10894i()
            boolean r0 = r0.m10900d()
            r5.m12027g(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceFragment.smali:597
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        List<String> options;
        m10891k().m12318b();
        MultipleChoiceView multipleChoiceView = ((FragmentExerciseTrainMultipleChoiceBinding) getMBindView()).answerChoice.recycler;
        multipleChoiceView.setJudgingStatus(MultipleChoiceView.JudgingStatus.f13771a);
        QuestionExtra extra = m10895j().m12023c().getExtra();
        if (extra != null && (options = extra.getOptions()) != null) {
            multipleChoiceView.setOptionList(options);
        }
        multipleChoiceView.setRightOptionList(m10895j().m12023c().getStandardAnswerList());
        RoundButton btnSubmit = ((FragmentExerciseTrainMultipleChoiceBinding) getMBindView()).btnSubmit;
        AbstractC9133u.m16132f(btnSubmit, "btnSubmit");
        BindingAdaptersKt.onClick(btnSubmit, new InterfaceC10559a() { // from class: x4.c0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MultipleChoiceFragment.m10892l(this.f20931a);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final TrainMultipleChoiceViewModel m10895j() {
        return (TrainMultipleChoiceViewModel) this.f12303g.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_multiple_choice;
    }
}
