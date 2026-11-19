package com.zykj.study.p065ui.home.exercise;

// RE note 本类字节码直接引用的读写或显示接口包括WebView。

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
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
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionExtra;
import com.zykj.study.bean.exercise.QuestionGroupBean;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.bean.exercise.RoundBean;
import com.zykj.study.databinding.ItemExerciseStudentHistoryBinding;
import com.zykj.study.p065ui.home.exercise.ExerciseHistoryStudentFragment;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.view.MultipleChoiceAnimationView;
import com.zykj.study.view.MultipleChoiceView;
import com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p077d8.C8321f;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p134i7.C8786j0;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseHistoryStudentFragment extends Hilt_ExerciseHistoryStudentFragment<ItemExerciseStudentHistoryBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11832f = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseHistoryStudentFragmentArgs.class), new C7805c(this));

    /* renamed from: g */
    public final InterfaceC8724d f11833g;

    /* renamed from: h */
    public final InterfaceC8724d f11834h;

    /* renamed from: i */
    public MicroAdapter f11835i;

    /* renamed from: j */
    public final InterfaceC8724d f11836j;

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$a */
    public static final /* synthetic */ class C7803a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11851a;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.SINGLE_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.MULTIPLE_CHOICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11851a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$b */
    public static final class C7804b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11853a;

        public C7804b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11853a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11853a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11853a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$c */
    public static final class C7805c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11854a;

        public C7805c(Fragment fragment) {
            this.f11854a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11854a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11854a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment", m17801f = "ExerciseHistoryStudentFragment.kt", m17802l = {52}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$initData$1 */
    public static final class C78061 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f11855a;

        /* renamed from: c */
        public int f11857c;

        public C78061(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11855a = obj;
            this.f11857c |= Integer.MIN_VALUE;
            return ExerciseHistoryStudentFragment.this.initData(this);
        }
    }

    public ExerciseHistoryStudentFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f11833g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStudentHistoryViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f11834h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(WebViewControlViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$9
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$special$$inlined$viewModels$default$10
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
        this.f11836j = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: w4.s
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ExerciseHistoryStudentFragment.m10593q(this.f20571a);
            }
        });
    }

    /* renamed from: A */
    public static final C8736p m10581A(QuestionBean questionBean, ExerciseHistoryStudentFragment exerciseHistoryStudentFragment) {
        String answerEx = questionBean.getAnswerEx();
        if (answerEx != null) {
            FragmentKt.findNavController(exerciseHistoryStudentFragment).navigate(AbstractC7843c.f12103a.m10783b(answerEx));
        }
        return C8736p.f16368a;
    }

    /* renamed from: B */
    public static final C8736p m10582B(ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, SelectModel selectModel, int i10) {
        AbstractC9133u.m16133g(selectModel, "<unused var>");
        exerciseHistoryStudentFragment.m10602u().m12140u(i10);
        return C8736p.f16368a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$adapterDataObserver$2$1] */
    /* renamed from: q */
    public static final ExerciseHistoryStudentFragment$adapterDataObserver$2$1 m10593q(final ExerciseHistoryStudentFragment exerciseHistoryStudentFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((ItemExerciseStudentHistoryBinding) this.f11852a.getMBindView()).exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroAdapter microAdapter = this.f11852a.f11835i;
                if (microAdapter == null) {
                    AbstractC9133u.m16151y("microAdapter");
                    microAdapter = null;
                }
                recycler.setVisibility(microAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((ItemExerciseStudentHistoryBinding) this.f11852a.getMBindView()).exerciseAnswer.answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((ItemExerciseStudentHistoryBinding) this.f11852a.getMBindView()).exerciseAnswer.answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: r */
    private final void m10594r(RecyclerView recyclerView) {
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R$drawable.divider, null);
        if (drawable != null) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 0);
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
            DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(requireContext(), 1);
            dividerItemDecoration2.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration2);
        }
    }

    /* renamed from: v */
    private final WebViewControlViewModel m10595v() {
        return (WebViewControlViewModel) this.f11834h.getValue();
    }

    /* renamed from: w */
    public static final C8736p m10596w(ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(exerciseHistoryStudentFragment).navigate(AbstractC7843c.f12103a.m10782a(it.getUrl()));
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final C8736p m10597x(ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, List list) {
        AbstractC9133u.m16130d(list);
        if (!list.isEmpty()) {
            exerciseHistoryStudentFragment.m10602u().m12140u(0);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static final C8736p m10598y(final ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, final QuestionGroupBean questionGroupBean) {
        List<QuestionBean> questions;
        Object next;
        RoundBean roundBean = (RoundBean) AbstractC8778f0.m14568n0(questionGroupBean.getRounds());
        if (roundBean != null && (questions = roundBean.getQuestions()) != null) {
            ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).multipleChoiceView.m11923b();
            MultipleChoiceAnimationView multipleChoiceAnimationView = ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).multipleChoiceView;
            C8321f c8321f = new C8321f(1, questions.size());
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321f, 10));
            Iterator it = c8321f.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((AbstractC8792m0) it).nextInt()));
            }
            multipleChoiceAnimationView.setOptionList(AbstractC8778f0.m14544U0(arrayList));
            QuestionBean questionBean = (QuestionBean) exerciseHistoryStudentFragment.m10602u().m12008f().getValue();
            if (questionBean != null) {
                ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).multipleChoiceView.setSelectedIndex(questions.indexOf(questionBean));
            }
            List<QuestionBean> questions2 = exerciseHistoryStudentFragment.m10601t().m10604a().getQuestions();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : questions2) {
                QuestionBean questionBean2 = (QuestionBean) obj;
                Iterator<T> it2 = questions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (AbstractC9133u.m16128b(((QuestionBean) next).getId(), questionBean2.getId())) {
                        break;
                    }
                }
                if (next != null) {
                    arrayList2.add(obj);
                }
            }
            Iterable iterableM14555c1 = AbstractC8778f0.m14555c1(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : iterableM14555c1) {
                if (((QuestionBean) ((C8786j0) obj2).m14585b()).getStatus() != QuestionStatus.UN_ANSWERED) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC8811w.m14786x(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(String.valueOf(((C8786j0) it3.next()).m14584a() + 1));
            }
            ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).multipleChoiceView.setAnswerList(AbstractC8778f0.m14544U0(arrayList4));
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (((QuestionBean) ((C8786j0) obj3).m14585b()).getCorrect()) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(AbstractC8811w.m14786x(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(String.valueOf(((C8786j0) it4.next()).m14584a() + 1));
            }
            ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).multipleChoiceView.setRightOptionList(AbstractC8778f0.m14544U0(arrayList6));
        }
        exerciseHistoryStudentFragment.m10602u().m12008f().observe(exerciseHistoryStudentFragment.getViewLifecycleOwner(), new C7804b(new InterfaceC10570l() { // from class: w4.v
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj4) {
                return ExerciseHistoryStudentFragment.m10599z(questionGroupBean, exerciseHistoryStudentFragment, (QuestionBean) obj4);
            }
        }));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static final C8736p m10599z(QuestionGroupBean questionGroupBean, final ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, QuestionBean questionBean) {
        List<QuestionBean> questions;
        Object next;
        Object next2;
        Object next3;
        List<String> options;
        RoundBean roundBean = (RoundBean) AbstractC8778f0.m14568n0(questionGroupBean.getRounds());
        if (roundBean != null && (questions = roundBean.getQuestions()) != null) {
            Iterator<T> it = questions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9133u.m16128b(((QuestionBean) next).getId(), questionBean.getId())) {
                    break;
                }
            }
            QuestionBean questionBean2 = (QuestionBean) next;
            if (questionBean2 != null) {
                ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseSubject.webView.loadData(questionBean2.fetchAdaptContent(), "text/html; charset=UTF-8", null);
                ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseSubject.webViewCorrectAnswer.loadData(questionBean.getAdaptStandardAnswerStr(), "text/html; charset=UTF-8", null);
                ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseSubject.webViewAnalysis.loadData(questionBean.fetchAdaptAnalysis(), "text/html; charset=UTF-8", null);
                QuestionType questionType = questionBean.getQuestionType();
                int i10 = questionType == null ? -1 : C7803a.f11851a[questionType.ordinal()];
                if (i10 == 1) {
                    Iterator<T> it2 = exerciseHistoryStudentFragment.m10601t().m10604a().getQuestions().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (AbstractC9133u.m16128b(((QuestionBean) next2).getId(), questionBean.getId())) {
                            break;
                        }
                    }
                    final QuestionBean questionBean3 = (QuestionBean) next2;
                    if (questionBean3 != null) {
                        ComponentCallbacks2C5391b.m2738t(exerciseHistoryStudentFragment.requireContext()).m2809u(questionBean3.getAnswerEx()).m2790w0(((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseAnswer.myAnswerMicro.ivSnapshot);
                        ShapeableImageView ivSnapshot = ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseAnswer.myAnswerMicro.ivSnapshot;
                        AbstractC9133u.m16132f(ivSnapshot, "ivSnapshot");
                        BindingAdaptersKt.onClick(ivSnapshot, new InterfaceC10559a() { // from class: w4.w
                            @Override // p300x7.InterfaceC10559a
                            public final Object invoke() {
                                return ExerciseHistoryStudentFragment.m10581A(questionBean3, exerciseHistoryStudentFragment);
                            }
                        });
                    }
                } else if (i10 == 2 || i10 == 3) {
                    MultipleChoiceView multipleChoiceView = ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseAnswer.viewChoice.recycler;
                    multipleChoiceView.m11938b();
                    multipleChoiceView.setJudgingStatus(MultipleChoiceView.JudgingStatus.f13775e);
                    QuestionExtra extra = questionBean.getExtra();
                    if (extra != null && (options = extra.getOptions()) != null) {
                        multipleChoiceView.setOptionList(options);
                    }
                    multipleChoiceView.setRightOptionList(questionBean.getStandardAnswerList());
                    Iterator<T> it3 = exerciseHistoryStudentFragment.m10601t().m10604a().getQuestions().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        if (AbstractC9133u.m16128b(((QuestionBean) next3).getId(), questionBean.getId())) {
                            break;
                        }
                    }
                    QuestionBean questionBean4 = (QuestionBean) next3;
                    if (questionBean4 == null) {
                        ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseAnswer.viewChoice.recycler.setAnswerList(AbstractC8809v.m14771n());
                    } else {
                        ((ItemExerciseStudentHistoryBinding) exerciseHistoryStudentFragment.getMBindView()).exerciseAnswer.viewChoice.recycler.setAnswerList(questionBean4.getAnswerSubmit());
                    }
                }
            }
        }
        LifecycleOwner viewLifecycleOwner = exerciseHistoryStudentFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseHistoryStudentFragment$initView$4$2$3(exerciseHistoryStudentFragment, questionBean, null), 3, null);
        return C8736p.f16368a;
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.ExerciseHistoryStudentFragment.C78061
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.ExerciseHistoryStudentFragment.C78061) r0
            int r1 = r0.f11857c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11857c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11855a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11857c
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
            r0.f11857c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MicroAdapter r5 = new com.zykj.study.adapter.MicroAdapter
            w4.q r0 = new w4.q
            r0.<init>()
            r5.<init>(r0)
            r4.f11835i = r5
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel r5 = r4.m10602u()
            com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragmentArgs r0 = r4.m10601t()
            com.zykj.study.bean.exercise.ExerciseBean r0 = r0.m10604a()
            r5.m12141v(r0)
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel r5 = r4.m10602u()
            com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragmentArgs r0 = r4.m10601t()
            int r0 = r0.m10605b()
            r5.m12142w(r0)
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel r5 = r4.m10602u()
            androidx.lifecycle.MutableLiveData r5 = r5.m12010h()
            w4.r r0 = new w4.r
            r0.<init>()
            com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$b r1 = new com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$b
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.ExerciseHistoryStudentFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment.smali:2376
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ConstraintLayout parentLayout = ((ItemExerciseStudentHistoryBinding) getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.parentLayout;
        AbstractC9133u.m16132f(parentLayout, "parentLayout");
        parentLayout.setVisibility(8);
        ((ItemExerciseStudentHistoryBinding) getMBindView()).setEntity(m10602u());
        ((ItemExerciseStudentHistoryBinding) getMBindView()).setWebViewControlViewModel(m10595v());
        ((ItemExerciseStudentHistoryBinding) getMBindView()).setIsTeacher(UserBean.newBuilder().getRole() == RoleType.Teacher);
        m10595v().m12319c();
        RecyclerView recyclerView = ((ItemExerciseStudentHistoryBinding) getMBindView()).exerciseAnswer.answerMicro.recycler;
        MicroAdapter microAdapter = this.f11835i;
        MicroAdapter microAdapter2 = null;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        recyclerView.setAdapter(microAdapter);
        MicroAdapter microAdapter3 = this.f11835i;
        if (microAdapter3 == null) {
            AbstractC9133u.m16151y("microAdapter");
        } else {
            microAdapter2 = microAdapter3;
        }
        microAdapter2.registerAdapterDataObserver(m10600s());
        AbstractC9133u.m16130d(recyclerView);
        m10594r(recyclerView);
        CustomWebView customWebView = ((ItemExerciseStudentHistoryBinding) getMBindView()).exerciseSubject.webView;
        C8356e c8356e = C8356e.f15876a;
        customWebView.m11883a(c8356e.m13622d());
        customWebView.m11883a(c8356e.m13619a());
        customWebView.m11883a(AbstractC8807u.m14755e(c8356e.m13620b()));
        m10602u().m12138s().observe(getViewLifecycleOwner(), new C7804b(new InterfaceC10570l() { // from class: w4.t
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseHistoryStudentFragment.m10598y(this.f20574a, (QuestionGroupBean) obj);
            }
        }));
        ((ItemExerciseStudentHistoryBinding) getMBindView()).multipleChoiceView.setItemClickListener(new InterfaceC10574p() { // from class: w4.u
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ExerciseHistoryStudentFragment.m10582B(this.f20576a, (SelectModel) obj, ((Integer) obj2).intValue());
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.item_exercise_student_history;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MicroAdapter microAdapter = this.f11835i;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.unregisterAdapterDataObserver(m10600s());
    }

    /* renamed from: s */
    public final ExerciseHistoryStudentFragment$adapterDataObserver$2$1 m10600s() {
        return (ExerciseHistoryStudentFragment$adapterDataObserver$2$1) this.f11836j.getValue();
    }

    /* renamed from: t */
    public final ExerciseHistoryStudentFragmentArgs m10601t() {
        return (ExerciseHistoryStudentFragmentArgs) this.f11832f.getValue();
    }

    /* renamed from: u */
    public final ExerciseStudentHistoryViewModel m10602u() {
        return (ExerciseStudentHistoryViewModel) this.f11833g.getValue();
    }
}
