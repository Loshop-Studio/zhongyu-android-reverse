package com.zykj.study.p065ui.home.exercise.train;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
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
import com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBinding;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment;
import com.zykj.study.utils.ChoiceList;
import com.zykj.study.view.MultipleChoiceView;
import com.zykj.study.viewmodels.TrainMultipleChoiceViewModel;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8797p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MultipleChoiceResultFailFragment extends Hilt_MultipleChoiceResultFailFragment<FragmentExerciseTrainMultipleChoiceResultFailBinding> {

    /* renamed from: f */
    public final NavArgsLazy f12327f = new NavArgsLazy(AbstractC9137y.m16154b(MultipleChoiceResultFailFragmentArgs.class), new C7875a(this));

    /* renamed from: g */
    public final InterfaceC8724d f12328g;

    /* renamed from: h */
    public MicroAdapter f12329h;

    /* renamed from: i */
    public final InterfaceC8724d f12330i;

    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$a */
    public static final class C7875a implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12337a;

        public C7875a(Fragment fragment) {
            this.f12337a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12337a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12337a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment", m17801f = "MultipleChoiceResultFailFragment.kt", m17802l = {42}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initData$1 */
    public static final class C78761 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12339a;

        /* renamed from: c */
        public int f12341c;

        public C78761(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12339a = obj;
            this.f12341c |= Integer.MIN_VALUE;
            return MultipleChoiceResultFailFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment", m17801f = "MultipleChoiceResultFailFragment.kt", m17802l = {81}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initView$1 */
    public static final class C78771 extends ContinuationImpl {

        /* renamed from: a */
        public Object f12345a;

        /* renamed from: b */
        public Object f12346b;

        /* renamed from: c */
        public int f12347c;

        /* renamed from: d */
        public /* synthetic */ Object f12348d;

        /* renamed from: f */
        public int f12350f;

        public C78771(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12348d = obj;
            this.f12350f |= Integer.MIN_VALUE;
            return MultipleChoiceResultFailFragment.this.initView(null, this);
        }
    }

    public MultipleChoiceResultFailFragment() {
        final int i10 = R$id.nav_answer_graph;
        final InterfaceC8724d interfaceC8724dM15924b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i10);
            }
        });
        this.f12328g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TrainMultipleChoiceViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m27191hiltNavGraphViewModels$lambda0(interfaceC8724dM15924b).getDefaultViewModelCreationExtras();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$special$$inlined$hiltNavGraphViewModels$4
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
        this.f12330i = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: x4.g0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MultipleChoiceResultFailFragment.m10907l(this.f20938a);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$adapterDataObserver$2$1] */
    /* renamed from: l */
    public static final MultipleChoiceResultFailFragment$adapterDataObserver$2$1 m10907l(final MultipleChoiceResultFailFragment multipleChoiceResultFailFragment) {
        return new RecyclerView.AdapterDataObserver() { // from class: com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$adapterDataObserver$2$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                RecyclerView recycler = ((FragmentExerciseTrainMultipleChoiceResultFailBinding) this.f12338a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler, "recycler");
                MicroAdapter microAdapter = this.f12338a.f12329h;
                if (microAdapter == null) {
                    AbstractC9133u.m16151y("microAdapter");
                    microAdapter = null;
                }
                recycler.setVisibility(microAdapter.getItemCount() > 0 ? 0 : 8);
                LinearLayout llMicroEmpty = ((FragmentExerciseTrainMultipleChoiceResultFailBinding) this.f12338a.getMBindView()).answerMicro.llMicroEmpty;
                AbstractC9133u.m16132f(llMicroEmpty, "llMicroEmpty");
                RecyclerView recycler2 = ((FragmentExerciseTrainMultipleChoiceResultFailBinding) this.f12338a.getMBindView()).answerMicro.recycler;
                AbstractC9133u.m16132f(recycler2, "recycler");
                llMicroEmpty.setVisibility(recycler2.getVisibility() == 0 ? 8 : 0);
            }
        };
    }

    /* renamed from: m */
    private final void m10908m(RecyclerView recyclerView) {
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
    private final TrainMultipleChoiceViewModel m10909p() {
        return (TrainMultipleChoiceViewModel) this.f12328g.getValue();
    }

    /* renamed from: r */
    public static final C8736p m10910r(MultipleChoiceResultFailFragment multipleChoiceResultFailFragment, MicroBean it) {
        AbstractC9133u.m16133g(it, "it");
        FragmentKt.findNavController(multipleChoiceResultFailFragment).navigate(AbstractC7919j.f12498a.m10993a(it.getUrl()));
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10911s(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment$initMicro$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initMicro$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment$initMicro$1) r0
            int r1 = r0.f12344c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12344c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initMicro$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initMicro$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12342a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12344c
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
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r5 = r4.m10909p()
            r0.f12344c = r3
            java.lang.Object r5 = r5.m12312l(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            com.zykj.study.adapter.MicroAdapter r0 = r4.f12329h
            if (r0 != 0) goto L4d
            java.lang.String r0 = "microAdapter"
            kotlin.jvm.internal.AbstractC9133u.m16151y(r0)
            r0 = 0
        L4d:
            r0.m10028h(r5)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.m10911s(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultFailFragment.smali:422
    }

    /* renamed from: t */
    public static final C8736p m10912t(MultipleChoiceResultFailFragment multipleChoiceResultFailFragment) {
        FragmentKt.findNavController(multipleChoiceResultFailFragment).navigateUp();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.C78761
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initData$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.C78761) r0
            int r1 = r0.f12341c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12341c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initData$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12339a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12341c
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
            r0.f12341c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.MicroAdapter r5 = new com.zykj.study.adapter.MicroAdapter
            x4.e0 r0 = new x4.e0
            r0.<init>()
            r5.<init>(r0)
            r4.f12329h = r5
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultFailFragment.smali:628
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
            boolean r0 = r8 instanceof com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.C78771
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initView$1 r0 = (com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.C78771) r0
            int r1 = r0.f12350f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12350f = r1
            goto L18
        L13:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initView$1 r0 = new com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$initView$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12348d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12350f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f12346b
            com.zykj.study.bean.exercise.QuestionBean r7 = (com.zykj.study.bean.exercise.QuestionBean) r7
            java.lang.Object r7 = r0.f12345a
            android.os.Bundle r7 = (android.os.Bundle) r7
            kotlin.AbstractC9079b.m15926b(r8)
            goto L8d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.databinding.ViewDataBinding r8 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBinding r8 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBinding) r8
            com.zykj.study.databinding.ViewMicroBinding r8 = r8.answerMicro
            androidx.recyclerview.widget.RecyclerView r8 = r8.recycler
            com.zykj.study.adapter.MicroAdapter r2 = r6.f12329h
            r4 = 0
            java.lang.String r5 = "microAdapter"
            if (r2 != 0) goto L51
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            r2 = r4
        L51:
            r8.setAdapter(r2)
            com.zykj.study.adapter.MicroAdapter r2 = r6.f12329h
            if (r2 != 0) goto L5c
            kotlin.jvm.internal.AbstractC9133u.m16151y(r5)
            goto L5d
        L5c:
            r4 = r2
        L5d:
            com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment$adapterDataObserver$2$1 r2 = r6.m10913n()
            r4.registerAdapterDataObserver(r2)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r8)
            r6.m10908m(r8)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r8 = r6.m10909p()
            com.zykj.study.bean.exercise.QuestionBean r8 = r8.m12023c()
            r6.m10915q(r8)
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
            r0.f12345a = r7
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r8)
            r0.f12346b = r7
            r7 = 0
            r0.f12347c = r7
            r0.f12350f = r3
            java.lang.Object r7 = r6.m10911s(r0)
            if (r7 != r1) goto L8d
            return r1
        L8d:
            androidx.databinding.ViewDataBinding r7 = r6.getMBindView()
            com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBinding r7 = (com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultFailBinding) r7
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r7 = r7.btnRevision
            java.lang.String r8 = "btnRevision"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r7, r8)
            x4.f0 r8 = new x4.f0
            r8.<init>()
            com.zykj.base.ext.BindingAdaptersKt.onClick(r7, r8)
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/train/MultipleChoiceResultFailFragment.smali:792
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_train_multiple_choice_result_fail;
    }

    /* renamed from: n */
    public final MultipleChoiceResultFailFragment$adapterDataObserver$2$1 m10913n() {
        return (MultipleChoiceResultFailFragment$adapterDataObserver$2$1) this.f12330i.getValue();
    }

    /* renamed from: o */
    public final MultipleChoiceResultFailFragmentArgs m10914o() {
        return (MultipleChoiceResultFailFragmentArgs) this.f12327f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MicroAdapter microAdapter = this.f12329h;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.unregisterAdapterDataObserver(m10913n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final void m10915q(QuestionBean questionBean) {
        List<String> options;
        MultipleChoiceView multipleChoiceView = ((FragmentExerciseTrainMultipleChoiceResultFailBinding) getMBindView()).answerChoice.recycler;
        multipleChoiceView.setJudgingStatus(MultipleChoiceView.JudgingStatus.f13772b);
        QuestionExtra extra = questionBean.getExtra();
        if (extra != null && (options = extra.getOptions()) != null) {
            multipleChoiceView.setOptionList(options);
        }
        ChoiceList standardAnswerList = questionBean.getStandardAnswerList();
        if (standardAnswerList != null) {
            multipleChoiceView.setRightOptionList(standardAnswerList);
        }
        multipleChoiceView.setAnswerList(AbstractC8797p.m14640g(m10914o().m10917a()));
    }
}
