package com.zykj.study.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CourseFragmentAdapter extends FragmentStateAdapter {

    /* renamed from: a */
    public final List f10884a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragmentAdapter(Fragment fm, List fragments) {
        super(fm);
        AbstractC9133u.m16133g(fm, "fm");
        AbstractC9133u.m16133g(fragments, "fragments");
        this.f10884a = fragments;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i10) {
        return (Fragment) this.f10884a.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10884a.size();
    }
}
