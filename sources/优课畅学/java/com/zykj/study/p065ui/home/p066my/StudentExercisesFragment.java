package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.ViewKt;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$layout;
import com.zykj.study.R$navigation;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.ExerciseType;
import com.zykj.study.bean.exercise.GroupStatistic;
import com.zykj.study.bean.teach.Member;
import com.zykj.study.databinding.FragmentStudentExercisesBinding;
import com.zykj.study.p065ui.home.p066my.StudentExercisesFragment;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import com.zykj.study.viewmodels.StudentExercisesViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8811w;
import p173m1.C9293a;
import p173m1.C9295c;
import p176m4.AbstractC9311l;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p207p2.AbstractC9642d;
import p209p4.C9668t;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudentExercisesFragment extends Hilt_StudentExercisesFragment<FragmentStudentExercisesBinding> {

    /* renamed from: f */
    public final NavArgsLazy f13320f = new NavArgsLazy(AbstractC9137y.m16154b(StudentExercisesFragmentArgs.class), new C8062c(this));

    /* renamed from: g */
    public final InterfaceC8724d f13321g;

    /* renamed from: h */
    public final InterfaceC8724d f13322h;

    /* renamed from: i */
    public C9668t f13323i;

    /* renamed from: com.zykj.study.ui.home.my.StudentExercisesFragment$a */
    public static final /* synthetic */ class C8060a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13335a;

        static {
            int[] iArr = new int[ExerciseType.values().length];
            try {
                iArr[ExerciseType.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExerciseType.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExerciseType.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13335a = iArr;
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.StudentExercisesFragment$b */
    public static final class C8061b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13336a;

        public C8061b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13336a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13336a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13336a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.StudentExercisesFragment$c */
    public static final class C8062c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f13337a;

        public C8062c(Fragment fragment) {
            this.f13337a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f13337a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f13337a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentExercisesFragment", m17801f = "StudentExercisesFragment.kt", m17802l = {39}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.StudentExercisesFragment$initData$1 */
    public static final class C80631 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13338a;

        /* renamed from: c */
        public int f13340c;

        public C80631(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13338a = obj;
            this.f13340c |= Integer.MIN_VALUE;
            return StudentExercisesFragment.this.initData(this);
        }
    }

    public StudentExercisesFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13321g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudentExercisesViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$viewModels$default$5
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
        this.f13322h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStatisticsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentExercisesFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: q */
    private final ExerciseStatisticsViewModel m11600q() {
        return (ExerciseStatisticsViewModel) this.f13322h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final C8736p m11601r(StudentExercisesFragment studentExercisesFragment, GroupStatistic groupStatistic) {
        List<ExerciseBean> questionGroups;
        ExerciseBean exerciseBean;
        ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).tvUserName.setText(studentExercisesFragment.m11600q().m12119k().getUserName());
        if (groupStatistic != null && (questionGroups = groupStatistic.getQuestionGroups()) != null && (exerciseBean = questionGroups.get(0)) != null) {
            studentExercisesFragment.m11610p().m12256a().setValue(exerciseBean);
        }
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final void m11602s(StudentExercisesFragment studentExercisesFragment, View view) {
        AbstractC9133u.m16130d(view);
        studentExercisesFragment.m11611x(view);
    }

    /* renamed from: t */
    public static final void m11603t(StudentExercisesFragment studentExercisesFragment, View view) {
        FragmentKt.findNavController(studentExercisesFragment).navigateUp();
    }

    /* renamed from: u */
    public static final void m11604u(StudentExercisesFragment studentExercisesFragment, View view) {
        int iIndexOf = studentExercisesFragment.m11600q().m12128t().indexOf(studentExercisesFragment.m11600q().m12119k());
        if (iIndexOf == 0) {
            iIndexOf = studentExercisesFragment.m11600q().m12128t().size();
        }
        studentExercisesFragment.m11600q().m12131w((Member) studentExercisesFragment.m11600q().m12128t().get(iIndexOf - 1));
    }

    /* renamed from: v */
    public static final void m11605v(StudentExercisesFragment studentExercisesFragment, View view) {
        int iIndexOf = studentExercisesFragment.m11600q().m12128t().indexOf(studentExercisesFragment.m11600q().m12119k());
        studentExercisesFragment.m11600q().m12131w((Member) studentExercisesFragment.m11600q().m12128t().get(iIndexOf == studentExercisesFragment.m11600q().m12128t().size() + (-1) ? 0 : iIndexOf + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final C8736p m11606w(StudentExercisesFragment studentExercisesFragment, ExerciseBean exerciseBean) {
        if (exerciseBean == null) {
            ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_no_exercise);
            return C8736p.f16368a;
        }
        ExerciseType status = exerciseBean.getStatus();
        int i10 = status == null ? -1 : C8060a.f13335a[status.ordinal()];
        if (i10 == 1 || i10 == 2) {
            ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_exercise_on_going);
            return C8736p.f16368a;
        }
        if (exerciseBean.getQuestions().isEmpty()) {
            ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_exercise_on_going);
            return C8736p.f16368a;
        }
        ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).multipleStatusView.m11961f();
        FragmentContainerView fragmentStudentExercise = ((FragmentStudentExercisesBinding) studentExercisesFragment.getMBindView()).fragmentStudentExercise;
        AbstractC9133u.m16132f(fragmentStudentExercise, "fragmentStudentExercise");
        NavController navControllerFindNavController = ViewKt.findNavController(fragmentStudentExercise);
        navControllerFindNavController.setGraph(navControllerFindNavController.getNavInflater().inflate(R$navigation.nav_student_exercise), AbstractC9311l.c.m17112b(AbstractC9311l.f18335a, exerciseBean, exerciseBean.getGroupId(), 0, 4, null).getArguments());
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static final void m11607y(StudentExercisesFragment studentExercisesFragment, List list, C9295c c9295c, C9293a c9293a, int i10) {
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        studentExercisesFragment.m11610p().m12256a().setValue(list.get(i10));
    }

    /* renamed from: z */
    public static final void m11608z(StudentExercisesFragment studentExercisesFragment) {
        studentExercisesFragment.m11610p().m12260e().setValue(Boolean.FALSE);
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.StudentExercisesFragment.C80631
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.StudentExercisesFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.StudentExercisesFragment.C80631) r0
            int r1 = r0.f13340c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13340c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.StudentExercisesFragment$initData$1 r0 = new com.zykj.study.ui.home.my.StudentExercisesFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13338a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13340c
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
            r0.f13340c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.ExerciseStatisticsViewModel r5 = r4.m11600q()
            androidx.lifecycle.MutableLiveData r5 = r5.m12118j()
            b5.t3 r0 = new b5.t3
            r0.<init>()
            com.zykj.study.ui.home.my.StudentExercisesFragment$b r1 = new com.zykj.study.ui.home.my.StudentExercisesFragment$b
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.StudentExercisesFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentExercisesFragment.smali:1108
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentStudentExercisesBinding) getMBindView()).setViewModel(m11610p());
        ((FragmentStudentExercisesBinding) getMBindView()).setFromScore(m11609o().m11614b());
        ((FragmentStudentExercisesBinding) getMBindView()).setEnable(m11600q().m12128t().size() > 1);
        ((FragmentStudentExercisesBinding) getMBindView()).tvUserName.setText(m11600q().m12119k().getUserName());
        ((FragmentStudentExercisesBinding) getMBindView()).setExamClickListener(new View.OnClickListener() { // from class: b5.u3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentExercisesFragment.m11602s(this.f2262a, view);
            }
        });
        ((FragmentStudentExercisesBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return)).m6539t(m11609o().m11616d()).m6530k(17).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: b5.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentExercisesFragment.m11603t(this.f2267a, view);
            }
        });
        m11610p().m12259d(m11609o().m11615c(), m11609o().m11613a(), m11609o().m11617e(), m11600q().m12123o(), m11609o().m11614b());
        ((FragmentStudentExercisesBinding) getMBindView()).ivLast.setOnClickListener(new View.OnClickListener() { // from class: b5.w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentExercisesFragment.m11604u(this.f2273a, view);
            }
        });
        ((FragmentStudentExercisesBinding) getMBindView()).ivNext.setOnClickListener(new View.OnClickListener() { // from class: b5.x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentExercisesFragment.m11605v(this.f2278a, view);
            }
        });
        m11610p().m12256a().observe(getViewLifecycleOwner(), new C8061b(new InterfaceC10570l() { // from class: b5.y3
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return StudentExercisesFragment.m11606w(this.f2282a, (ExerciseBean) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_student_exercises;
    }

    /* renamed from: o */
    public final StudentExercisesFragmentArgs m11609o() {
        return (StudentExercisesFragmentArgs) this.f13320f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m11600q().m12128t().clear();
        super.onDestroy();
    }

    /* renamed from: p */
    public final StudentExercisesViewModel m11610p() {
        return (StudentExercisesViewModel) this.f13321g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final void m11611x(View view) {
        final List<ExerciseBean> questionGroups;
        GroupStatistic groupStatistic = (GroupStatistic) m11610p().m12258c().getValue();
        if (groupStatistic == null || (questionGroups = groupStatistic.getQuestionGroups()) == null || questionGroups.isEmpty()) {
            return;
        }
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(questionGroups, 10));
        Iterator<T> it = questionGroups.iterator();
        while (it.hasNext()) {
            String title = ((ExerciseBean) it.next()).getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(new C9293a(title));
        }
        C9668t c9668t = (C9668t) ((C9668t) new C9668t(contextRequireContext, arrayList).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.z3
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                StudentExercisesFragment.m11607y(this.f2288a, questionGroups, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        this.f13323i = c9668t;
        if (c9668t != null) {
            c9668t.m18218n(new PopupWindow.OnDismissListener() { // from class: b5.a4
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    StudentExercisesFragment.m11608z(this.f2123a);
                }
            });
        }
        C9668t c9668t2 = this.f13323i;
        if (c9668t2 != null) {
            c9668t2.mo18229v(view);
        }
        m11610p().m12260e().setValue(Boolean.TRUE);
    }
}
