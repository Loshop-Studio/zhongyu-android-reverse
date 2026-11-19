package com.zykj.study.p065ui.home.p066my;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.StudentAchievementAdapter;
import com.zykj.study.bean.exercise.ExerciseType;
import com.zykj.study.bean.teach.Member;
import com.zykj.study.bean.teach.QuizScore;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.databinding.FragmentExerciseStatisticsResultBinding;
import com.zykj.study.p065ui.home.p066my.ExerciseStatisticsResultFragment;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseStatisticsResultFragment extends Hilt_ExerciseStatisticsResultFragment<FragmentExerciseStatisticsResultBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12995f;

    /* renamed from: g */
    public final StudentAchievementAdapter f12996g = new StudentAchievementAdapter(new InterfaceC10574p() { // from class: b5.j1
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Object obj, Object obj2) {
            return ExerciseStatisticsResultFragment.m11379i(this.f2176a, ((Integer) obj).intValue(), (String) obj2);
        }
    });

    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsResultFragment$a */
    public static final class C8017a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13001a;

        public C8017a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13001a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13001a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13001a.invoke(obj);
        }
    }

    public ExerciseStatisticsResultFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f12995f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStatisticsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final C8736p m11379i(ExerciseStatisticsResultFragment exerciseStatisticsResultFragment, int i10, String userId) {
        Object next;
        AbstractC9133u.m16133g(userId, "userId");
        SuperviseGroup superviseGroup = (SuperviseGroup) exerciseStatisticsResultFragment.m11380j().m12120l().getValue();
        if (superviseGroup != null) {
            ArrayList<SuperviseGroupMember> arrayList = new ArrayList();
            List<SuperviseGroupMember> memberList = superviseGroup.getMemberList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : memberList) {
                if (((SuperviseGroupMember) obj).getStatus() == ExerciseType.COMPLETED) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            for (SuperviseGroupMember superviseGroupMember : arrayList) {
                exerciseStatisticsResultFragment.m11380j().m12128t().add(new Member(superviseGroupMember.getUserId(), superviseGroupMember.getUserName(), superviseGroupMember.getGroupId()));
            }
            Iterator it = exerciseStatisticsResultFragment.m11380j().m12128t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Member member = (Member) next;
                if (member.getGroupId() == i10 && AbstractC9133u.m16128b(member.getUserId(), userId)) {
                    break;
                }
            }
            Member member2 = (Member) next;
            if (member2 != null) {
                exerciseStatisticsResultFragment.m11380j().m12108B(member2);
            }
            Fragment fragmentRequireParentFragment = exerciseStatisticsResultFragment.requireParentFragment();
            AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
            NavController navControllerFindNavController = FragmentKt.findNavController(fragmentRequireParentFragment);
            int i11 = R$id.studentExercisesFragment;
            Pair pairM14230a = AbstractC8726f.m14230a("superviseId", Integer.valueOf(exerciseStatisticsResultFragment.m11380j().m12129u()));
            QuizScore quizScore = (QuizScore) exerciseStatisticsResultFragment.m11380j().m12124p().getValue();
            navControllerFindNavController.navigate(i11, BundleKt.bundleOf(pairM14230a, AbstractC8726f.m14230a("title", quizScore != null ? quizScore.getTitle() : null), AbstractC8726f.m14230a("catalogId", Integer.valueOf(exerciseStatisticsResultFragment.m11380j().m12115g())), AbstractC8726f.m14230a("userId", userId), AbstractC8726f.m14230a("fromScore", Boolean.TRUE)));
        }
        return C8736p.f16368a;
    }

    /* renamed from: j */
    private final ExerciseStatisticsViewModel m11380j() {
        return (ExerciseStatisticsViewModel) this.f12995f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final C8736p m11381k(ExerciseStatisticsResultFragment exerciseStatisticsResultFragment, SuperviseGroup superviseGroup) {
        ((FragmentExerciseStatisticsResultBinding) exerciseStatisticsResultFragment.getMBindView()).setGroup(superviseGroup);
        if (superviseGroup.getMemberList().isEmpty()) {
            ((FragmentExerciseStatisticsResultBinding) exerciseStatisticsResultFragment.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_supervise_group_no_member);
        } else {
            ((FragmentExerciseStatisticsResultBinding) exerciseStatisticsResultFragment.getMBindView()).multipleStatusView.m11961f();
            exerciseStatisticsResultFragment.f12996g.m10095g(superviseGroup.getMemberList());
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentExerciseStatisticsResultBinding) getMBindView()).recycler.setAdapter(this.f12996g);
        m11380j().m12120l().observe(getViewLifecycleOwner(), new C8017a(new InterfaceC10570l() { // from class: b5.i1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseStatisticsResultFragment.m11381k(this.f2170a, (SuperviseGroup) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_statistics_result;
    }
}
