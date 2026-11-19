package com.zykj.study.p065ui.home.exercise.train;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.databinding.FragmentExerciseTrainAnswerAreaBinding;
import com.zykj.study.p065ui.home.exercise.train.AnswerAreaFragment;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class AnswerAreaFragment extends Hilt_AnswerAreaFragment<FragmentExerciseTrainAnswerAreaBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12134f;

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$a */
    public static final /* synthetic */ class C7850a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12141a;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.SINGLE_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.MULTIPLE_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12141a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$b */
    public static final class C7851b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12142a;

        public C7851b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12142a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12142a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12142a.invoke(obj);
        }
    }

    public AnswerAreaFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: x4.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerAreaFragment.m10791i(this.f20928a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12134f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseTrainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.AnswerAreaFragment$special$$inlined$viewModels$default$4
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

    /* renamed from: i */
    public static final ViewModelStoreOwner m10791i(AnswerAreaFragment answerAreaFragment) {
        Fragment fragmentRequireParentFragment = answerAreaFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: j */
    private final ExerciseTrainViewModel m10792j() {
        return (ExerciseTrainViewModel) this.f12134f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final C8736p m10793k(AnswerAreaFragment answerAreaFragment, QuestionBean questionBean) {
        ExerciseBean exerciseBean = (ExerciseBean) answerAreaFragment.m10792j().m12159w().getValue();
        if (exerciseBean == null) {
            return C8736p.f16368a;
        }
        if (questionBean == null) {
            return C8736p.f16368a;
        }
        QuestionType questionType = questionBean.getQuestionType();
        int i10 = questionType == null ? -1 : C7850a.f12141a[questionType.ordinal()];
        if (i10 == 1) {
            FragmentKt.findNavController(answerAreaFragment).navigate(AbstractC7910a.f12464a.m10987c(exerciseBean.getExerciseId(), exerciseBean.getGroupId(), questionBean, answerAreaFragment.m10792j().m12017o()));
        } else if (i10 == 2) {
            FragmentKt.findNavController(answerAreaFragment).navigate(AbstractC7910a.f12464a.m10986b(exerciseBean.getExerciseId(), exerciseBean.getGroupId(), questionBean, answerAreaFragment.m10792j().m12017o()));
        } else if (i10 == 3) {
            FragmentKt.findNavController(answerAreaFragment).navigate(AbstractC7910a.f12464a.m10985a(exerciseBean.getExerciseId(), exerciseBean.getGroupId(), questionBean, answerAreaFragment.m10792j().m12017o()));
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        Object objInitData = super.initData(interfaceC9324c);
        return objInitData == AbstractC9434a.m17291f() ? objInitData : C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m10792j().m12008f().observe(getViewLifecycleOwner(), new C7851b(new InterfaceC10570l() { // from class: x4.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AnswerAreaFragment.m10793k(this.f20929a, (QuestionBean) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_answer_area;
    }
}
