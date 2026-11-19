package com.zykj.study.dialog;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.BaseFragment;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.StuNameAdapter;
import com.zykj.study.databinding.FragmentExerciseFinishDetailBinding;
import com.zykj.study.dialog.ExerciseFinishDetailFragment;
import com.zykj.study.utils.CommonDecoration;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ExerciseFinishDetailFragment extends BaseFragment<FragmentExerciseFinishDetailBinding> {

    /* renamed from: b */
    public static final C7716a f11184b = new C7716a(null);

    /* renamed from: c */
    public static final int f11185c = 8;

    /* renamed from: a */
    public final InterfaceC8724d f11186a = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: p4.n
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return ExerciseFinishDetailFragment.m10260i();
        }
    });

    /* renamed from: com.zykj.study.dialog.ExerciseFinishDetailFragment$a */
    public static final class C7716a {
        public /* synthetic */ C7716a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseFinishDetailFragment m10263a(List data) {
            AbstractC9133u.m16133g(data, "data");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("data", (ArrayList) AbstractC8778f0.m14539P0(data, new ArrayList()));
            ExerciseFinishDetailFragment exerciseFinishDetailFragment = new ExerciseFinishDetailFragment();
            exerciseFinishDetailFragment.setArguments(bundle);
            return exerciseFinishDetailFragment;
        }

        public C7716a() {
        }
    }

    /* renamed from: i */
    public static final StuNameAdapter m10260i() {
        return new StuNameAdapter();
    }

    /* renamed from: g */
    public final StuNameAdapter m10261g() {
        return (StuNameAdapter) this.f11186a.getValue();
    }

    /* renamed from: h */
    public final void m10262h() {
        RecyclerView recyclerView = getMBindView().recyclerViewStudent;
        recyclerView.setAdapter(m10261g());
        recyclerView.addItemDecoration(new CommonDecoration(recyclerView.getResources().getDimensionPixelSize(R$dimen.view_8), recyclerView.getResources().getDimensionPixelSize(R$dimen.view_8), false));
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList("data");
        FragmentExerciseFinishDetailBinding mBindView = getMBindView();
        ArrayList<String> stringArrayList2 = requireArguments().getStringArrayList("data");
        mBindView.setIsEmpty(AbstractC9536a.m17796a(stringArrayList2 == null || stringArrayList2.isEmpty()));
        m10261g().submitList(stringArrayList);
        m10262h();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_exercise_finish_detail;
    }
}
