package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.BaseFragment;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.ChartBarAdapter;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.databinding.FragmentExerciseStatisticsSingleDetailBinding;
import com.zykj.study.dialog.ExerciseFinishDialog;
import com.zykj.study.p065ui.home.p066my.ExerciseStatisticsSingleDetailFragment;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseStatisticsSingleDetailFragment extends BaseFragment<FragmentExerciseStatisticsSingleDetailBinding> {

    /* renamed from: a */
    public final InterfaceC8724d f13002a;

    /* renamed from: b */
    public final InterfaceC8724d f13003b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.l1
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return ExerciseStatisticsSingleDetailFragment.m11387k(this.f2191a);
        }
    });

    public ExerciseStatisticsSingleDetailFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13002a = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStatisticsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: k */
    public static final ChartBarAdapter m11387k(final ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment) {
        return new ChartBarAdapter(new InterfaceC10570l() { // from class: b5.n1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseStatisticsSingleDetailFragment.m11388l(this.f2212a, (ChoiceChartData) obj);
            }
        });
    }

    /* renamed from: l */
    public static final C8736p m11388l(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, ChoiceChartData entity) {
        AbstractC9133u.m16133g(entity, "entity");
        exerciseStatisticsSingleDetailFragment.m11390n().m12111b(entity);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final ChartBarAdapter m11389m() {
        return (ChartBarAdapter) this.f13003b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final ExerciseStatisticsViewModel m11390n() {
        return (ExerciseStatisticsViewModel) this.f13002a.getValue();
    }

    /* renamed from: p */
    public static final C8736p m11391p(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, View it) {
        AbstractC9133u.m16133g(it, "it");
        ExerciseFinishDialog.f11187d.m10279a().show(exerciseStatisticsSingleDetailFragment.getParentFragmentManager(), "finish_dialog_tag");
        return C8736p.f16368a;
    }

    /* renamed from: q */
    private final void m11392q() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ExerciseStatisticsSingleDetailFragment$initObserver$1(this, null), 3, null);
    }

    /* renamed from: r */
    private final void m11393r() {
        RecyclerView recyclerView = getMBindView().recyclerViewChart;
        recyclerView.setAdapter(m11389m());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m11393r();
        m11392q();
        m11394o();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_statistics_single_detail;
    }

    /* renamed from: o */
    public final void m11394o() {
        LinearLayout LinearLayoutFinishPerson = getMBindView().LinearLayoutFinishPerson;
        AbstractC9133u.m16132f(LinearLayoutFinishPerson, "LinearLayoutFinishPerson");
        AbstractC8354c.m13615r(LinearLayoutFinishPerson, new InterfaceC10570l() { // from class: b5.m1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseStatisticsSingleDetailFragment.m11391p(this.f2206a, (View) obj);
            }
        });
    }
}
