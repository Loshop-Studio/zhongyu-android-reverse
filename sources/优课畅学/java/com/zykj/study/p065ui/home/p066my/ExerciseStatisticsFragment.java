package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$color;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.HomeFragmentAdapter;
import com.zykj.study.adapter.TitleListAdapter;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.bean.teach.QuizScore;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.databinding.FragmentExerciseStatisticsBinding;
import com.zykj.study.p065ui.home.p066my.ExerciseStatisticsFragment;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.AbstractC8839h;
import p173m1.C9293a;
import p173m1.C9295c;
import p179m7.InterfaceC9324c;
import p207p2.AbstractC9642d;
import p209p4.C9673y;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseStatisticsFragment extends Hilt_ExerciseStatisticsFragment<FragmentExerciseStatisticsBinding> {

    /* renamed from: g */
    public final InterfaceC8724d f12970g;

    /* renamed from: h */
    public C9673y f12971h;

    /* renamed from: f */
    public final NavArgsLazy f12969f = new NavArgsLazy(AbstractC9137y.m16154b(ExerciseStatisticsFragmentArgs.class), new C8011b(this));

    /* renamed from: i */
    public final List f12972i = AbstractC8809v.m14776s(new ExerciseStatisticsResultFragment(), new ExerciseStatisticsSingleDetailFragment());

    /* renamed from: j */
    public final InterfaceC8724d f12973j = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.a1
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return ExerciseStatisticsFragment.m11347D(this.f2120a);
        }
    });

    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$a */
    public static final class C8010a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12978a;

        public C8010a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12978a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12978a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12978a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$b */
    public static final class C8011b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12979a;

        public C8011b(Fragment fragment) {
            this.f12979a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12979a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12979a + " has null arguments");
        }
    }

    public ExerciseStatisticsFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12970g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStatisticsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final void m11344A(ExerciseStatisticsFragment exerciseStatisticsFragment, QuizScore quizScore, C9295c c9295c, C9293a c9293a, int i10) {
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        exerciseStatisticsFragment.m11360u().m12120l().setValue(quizScore.getSuperviseGroups().get(i10));
        exerciseStatisticsFragment.m11360u().m12112c(quizScore.getSuperviseGroups().get(i10).getId());
    }

    /* renamed from: B */
    public static final void m11345B(ExerciseStatisticsFragment exerciseStatisticsFragment) {
        exerciseStatisticsFragment.m11360u().m12132x().setValue(Boolean.FALSE);
    }

    /* renamed from: C */
    public static final void m11346C(ExerciseStatisticsFragment exerciseStatisticsFragment, View view) {
        FragmentKt.findNavController(exerciseStatisticsFragment).navigateUp();
    }

    /* renamed from: D */
    public static final TitleListAdapter m11347D(final ExerciseStatisticsFragment exerciseStatisticsFragment) {
        return new TitleListAdapter(new InterfaceC10574p() { // from class: b5.c1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ExerciseStatisticsFragment.m11348E(this.f2131a, ((Integer) obj).intValue(), (GetQuizDetailBean) obj2);
            }
        });
    }

    /* renamed from: E */
    public static final C8736p m11348E(ExerciseStatisticsFragment exerciseStatisticsFragment, int i10, GetQuizDetailBean item) {
        AbstractC9133u.m16133g(item, "item");
        exerciseStatisticsFragment.m11360u().m12114e(i10, item);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final ExerciseStatisticsViewModel m11360u() {
        return (ExerciseStatisticsViewModel) this.f12970g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    private final void m11361v() {
        ((FragmentExerciseStatisticsBinding) getMBindView()).tvCourseGroupName.setOnClickListener(new View.OnClickListener() { // from class: b5.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseStatisticsFragment.m11362w(this.f2137a, view);
            }
        });
    }

    /* renamed from: w */
    public static final void m11362w(ExerciseStatisticsFragment exerciseStatisticsFragment, View view) {
        exerciseStatisticsFragment.m11360u().m12132x().setValue(Boolean.TRUE);
        C9673y c9673y = exerciseStatisticsFragment.f12971h;
        if (c9673y != null) {
            c9673y.mo18229v(view);
        }
    }

    /* renamed from: x */
    private final void m11363x() {
        m11360u().m12124p().observe(this, new C8010a(new InterfaceC10570l() { // from class: b5.b1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseStatisticsFragment.m11364y(this.f2126a, (QuizScore) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseStatisticsFragment$initObserver$2(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static final C8736p m11364y(final ExerciseStatisticsFragment exerciseStatisticsFragment, final QuizScore quizScore) {
        ((FragmentExerciseStatisticsBinding) exerciseStatisticsFragment.getMBindView()).toolbar.m6535p(exerciseStatisticsFragment.getString(R$string.arrow_left_return)).m6539t(quizScore.getTitle()).m6537r(exerciseStatisticsFragment.getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(exerciseStatisticsFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: b5.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseStatisticsFragment.m11365z(this.f2143a, view);
            }
        });
        if (!quizScore.getSuperviseGroups().isEmpty()) {
            exerciseStatisticsFragment.m11360u().m12120l().setValue(AbstractC8778f0.m14566l0(quizScore.getSuperviseGroups()));
        }
        Context contextRequireContext = exerciseStatisticsFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        List<SuperviseGroup> superviseGroups = quizScore.getSuperviseGroups();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(superviseGroups, 10));
        Iterator<T> it = superviseGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9293a(((SuperviseGroup) it.next()).getName()));
        }
        C9673y c9673y = (C9673y) ((C9673y) new C9673y(contextRequireContext, AbstractC8778f0.m14544U0(arrayList)).m18233z(exerciseStatisticsFragment.getResources().getDimensionPixelSize(R$dimen.view_100), 0, new AbstractC9642d.b() { // from class: b5.f1
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                ExerciseStatisticsFragment.m11344A(this.f2152a, quizScore, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        exerciseStatisticsFragment.f12971h = c9673y;
        if (c9673y != null) {
            c9673y.m18226s(2);
        }
        C9673y c9673y2 = exerciseStatisticsFragment.f12971h;
        if (c9673y2 != null) {
            c9673y2.m18218n(new PopupWindow.OnDismissListener() { // from class: b5.g1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ExerciseStatisticsFragment.m11345B(this.f2159a);
                }
            });
        }
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final void m11365z(ExerciseStatisticsFragment exerciseStatisticsFragment, View view) {
        FragmentKt.findNavController(exerciseStatisticsFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public final void m11366F(int i10) {
        int color = requireContext().getColor(R$color.divider);
        int color2 = requireContext().getColor(R$color.transparent);
        if (i10 == 0) {
            ((FragmentExerciseStatisticsBinding) getMBindView()).tvAllCondition.setBackgroundColor(color);
        } else {
            ((FragmentExerciseStatisticsBinding) getMBindView()).tvAllCondition.setBackgroundColor(color2);
        }
        if (i10 == 1) {
            ((FragmentExerciseStatisticsBinding) getMBindView()).tvDoProblem.setBackgroundColor(color);
        } else {
            ((FragmentExerciseStatisticsBinding) getMBindView()).tvDoProblem.setBackgroundColor(color2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        String title;
        ((FragmentExerciseStatisticsBinding) getMBindView()).setViewModel(m11360u());
        m11360u().m12134z();
        m11367r();
        m11363x();
        m11361v();
        TitleBar titleBarM6535p = ((FragmentExerciseStatisticsBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return));
        QuizScore quizScore = (QuizScore) m11360u().m12124p().getValue();
        if (quizScore == null || (title = quizScore.getTitle()) == null) {
            title = "";
        }
        titleBarM6535p.m6539t(title).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: b5.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseStatisticsFragment.m11346C(this.f2285a, view);
            }
        });
        ViewPager2 viewPager2 = ((FragmentExerciseStatisticsBinding) getMBindView()).viewPager;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9133u.m16132f(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        AbstractC9133u.m16132f(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new HomeFragmentAdapter(childFragmentManager, lifecycle, this.f12972i));
        RecyclerView recyclerView = ((FragmentExerciseStatisticsBinding) getMBindView()).f11148rv;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m11369t());
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_statistics;
    }

    /* renamed from: r */
    public final void m11367r() {
        m11360u().m12107A(m11368s().m11373a());
        m11360u().m12109C(m11368s().m11374b());
        m11360u().m12110D(m11368s().m11375c());
        m11360u().m12133y(m11368s().m11375c(), m11368s().m11374b());
        m11360u().m12130v(m11368s().m11375c(), m11368s().m11374b());
    }

    /* renamed from: s */
    public final ExerciseStatisticsFragmentArgs m11368s() {
        return (ExerciseStatisticsFragmentArgs) this.f12969f.getValue();
    }

    /* renamed from: t */
    public final TitleListAdapter m11369t() {
        return (TitleListAdapter) this.f12973j.getValue();
    }
}
