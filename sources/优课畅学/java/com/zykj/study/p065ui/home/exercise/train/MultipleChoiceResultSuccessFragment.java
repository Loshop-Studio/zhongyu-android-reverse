package com.zykj.study.p065ui.home.exercise.train;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
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
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.exercise.MicroBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionExtra;
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment;
import com.zykj.study.utils.ChoiceList;
import com.zykj.study.view.MultipleChoiceView;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.TrainMultipleChoiceViewModel;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceResultSuccessFragment extends Hilt_MultipleChoiceResultSuccessFragment<FragmentExerciseTrainMultipleChoiceResultSuccessBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12354f;

    /* renamed from: g */
    public final InterfaceC8724d f12355g;

    /* renamed from: h */
    public MicroAdapter f12356h;

    /* renamed from: i */
    public final InterfaceC8724d f12357i;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment", m17801f = "MultipleChoiceResultSuccessFragment.kt", m17802l = {42}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initData$1 */
    public static final class C78871 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12371a;

        /* renamed from: c */
        public int f12373c;

        public C78871(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12371a = obj;
            this.f12373c |= Integer.MIN_VALUE;
            return MultipleChoiceResultSuccessFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment", m17801f = "MultipleChoiceResultSuccessFragment.kt", m17802l = {81}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initView$1 */
    public static final class C78881 extends ContinuationImpl {

        /* renamed from: a */
        public Object f12377a;

        /* renamed from: b */
        public Object f12378b;

        /* renamed from: c */
        public int f12379c;

        /* renamed from: d */
        public /* synthetic */ Object f12380d;

        /* renamed from: f */
        public int f12382f;

        public C78881(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12380d = obj;
            this.f12382f |= Integer.MIN_VALUE;
            return MultipleChoiceResultSuccessFragment.this.initView(null, this);
        }
    }

    public MultipleChoiceResultSuccessFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: x4.k0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MultipleChoiceResultSuccessFragment.m10928p(this.f20944a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12354f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseTrainViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$viewModels$default$4
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
        final int i10 = R$id.nav_answer_graph;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f12355g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TrainMultipleChoiceViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4
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
        this.f12357i = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: x4.l0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MultipleChoiceResultSuccessFragment.m10926n(this.f20946a);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1] */
    /* renamed from: n */
    public static final MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1 m10926n(final MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((FragmentExerciseTrainMultipleChoiceResultSuccessBinding) this.f12370a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroAdapter microAdapter = this.f12370a.f12356h;
                if (microAdapter == null) {
                    AbstractC9133u.m16151y("microAdapter");
                    microAdapter = null;
                }
                recycler.setVisibility(microAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((FragmentExerciseTrainMultipleChoiceResultSuccessBinding) this.f12370a.getMBindView()).answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((FragmentExerciseTrainMultipleChoiceResultSuccessBinding) this.f12370a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: o */
    private final void m10927o(RecyclerView recyclerView) {
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

    /* renamed from: p */
    public static final ViewModelStoreOwner m10928p(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment) {
        Fragment fragmentRequireParentFragment = multipleChoiceResultSuccessFragment.requireParentFragment().requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* renamed from: r */
    private final ExerciseTrainViewModel m10929r() {
        return (ExerciseTrainViewModel) this.f12354f.getValue();
    }

    /* renamed from: s */
    private final TrainMultipleChoiceViewModel m10930s() {
        return (TrainMultipleChoiceViewModel) this.f12355g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private final void m10931t(QuestionBean questionBean) {
        List<String> options;
        MultipleChoiceView multipleChoiceView = ((FragmentExerciseTrainMultipleChoiceResultSuccessBinding) getMBindView()).answerChoice.recycler;
        multipleChoiceView.setJudgingStatus(MultipleChoiceView.JudgingStatus.f13773c);
        QuestionExtra extra = questionBean.getExtra();
        if (extra != null && (options = extra.getOptions()) != null) {
            multipleChoiceView.setOptionList(options);
        }
        ChoiceList standardAnswerList = questionBean.getStandardAnswerList();
        multipleChoiceView.setRightOptionList(standardAnswerList);
        multipleChoiceView.setAnswerList(standardAnswerList);
    }

    /* renamed from: u */
    public static final C8736p m10932u(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(multipleChoiceResultSuccessFragment).navigate(AbstractC7920k.f12499a.m10994a(it.getUrl()));
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10933v(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initMicro$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initMicro$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initMicro$1) r0
            int r1 = r0.f12376c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12376c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initMicro$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initMicro$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12374a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12376c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10930s()
            r0.f12376c = r3
            java.lang.Object r5 = r5.m12312l(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            com.zykj.study.adapter.MicroAdapter r0 = r4.f12356h
            if (r0 != 0) goto L4d
            java.lang.String r0 = "microAdapter"
            kotlin.jvm.internal.AbstractC9133u.m16151y(r0)
            r0 = 0
        L4d:
            r0.m10028h(r5)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.m10933v(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment.smali:633
    }

    /* renamed from: w */
    public static final C8736p m10934w(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment) {
        multipleChoiceResultSuccessFragment.m10929r().m12013k();
        FragmentKt.findNavController(multipleChoiceResultSuccessFragment).navigate(AbstractC7923n.f12504a.m10998a());
        return C8736p.f16368a;
    }

    /* renamed from: x */
    public static final C8736p m10935x(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment) {
        multipleChoiceResultSuccessFragment.m10929r().m12149C().postValue(1);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.C78871
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.C78871) r0
            int r1 = r0.f12373c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12373c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12371a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12373c
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
            r0.f12373c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MicroAdapter r5 = new com.zykj.study.adapter.MicroAdapter
            x4.m0 r0 = new x4.m0
            r0.<init>()
            r5.<init>(r0)
            r4.f12356h = r5
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment.smali:907
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initView(android.os.Bundle r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.C78881
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initView$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.C78881) r0
            int r1 = r0.f12382f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12382f = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initView$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$initView$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12380d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12382f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f12378b
            com.zykj.study.bean.exercise.QuestionBean r7 = (com.zykj.study.bean.exercise.QuestionBean) r7
            java.lang.Object r7 = r0.f12377a
            android.os.Bundle r7 = (android.os.Bundle) r7
            kotlin.AbstractC9079b.m15926b(r8)
            goto L9a
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.databinding.ViewDataBinding r8 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding r8 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding) r8
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r2 = r6.m10930s()
            r8.setTrainViewModel(r2)
            androidx.databinding.ViewDataBinding r8 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding r8 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding) r8
            com.zykj.study.databinding.ViewMicroBinding r8 = r8.answerMicro
            androidx.recyclerview.widget.RecyclerView r8 = r8.recycler
            com.zykj.study.adapter.MicroAdapter r2 = r6.f12356h
            r4 = 0
            java.lang.String r5 = "microAdapter"
            if (r2 != 0) goto L5e
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            r2 = r4
        L5e:
            r8.setAdapter(r2)
            com.zykj.study.adapter.MicroAdapter r2 = r6.f12356h
            if (r2 != 0) goto L69
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            goto L6a
        L69:
            r4 = r2
        L6a:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1 r2 = r6.m10936q()
            r4.registerAdapterDataObserver(r2)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r8)
            r6.m10927o(r8)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r8 = r6.m10930s()
            com.zykj.study.bean.exercise.QuestionBean r8 = r8.m12023c()
            r6.m10931t(r8)
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
            r0.f12377a = r7
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r8)
            r0.f12378b = r7
            r7 = 0
            r0.f12379c = r7
            r0.f12382f = r3
            java.lang.Object r7 = r6.m10933v(r0)
            if (r7 != r1) goto L9a
            return r1
        L9a:
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding) r7
            com.zykj.study.databinding.ViewEditChoiceButtonBinding r7 = r7.editChoiceButton
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnNext
            java.lang.String r8 = "btnNext"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.i0 r8 = new x4.i0
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding) r7
            com.zykj.study.databinding.ViewEditChoiceButtonBinding r7 = r7.editChoiceButton
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnComplete
            java.lang.String r8 = "btnComplete"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.j0 r8 = new x4.j0
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment.smali:1071
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_multiple_choice_result_success;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MicroAdapter microAdapter = this.f12356h;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.unregisterAdapterDataObserver(m10936q());
    }

    /* renamed from: q */
    public final MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1 m10936q() {
        return (MultipleChoiceResultSuccessFragment$adapterDataObserver$2$1) this.f12357i.getValue();
    }
}
