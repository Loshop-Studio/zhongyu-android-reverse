package com.zykj.study.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HomeFragmentAdapter extends FragmentStateAdapter {

    /* renamed from: a */
    public final List f10902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragmentAdapter(FragmentManager fm, Lifecycle lifecycle, List fragments) {
        super(fm, lifecycle);
        AbstractC9133u.m16133g(fm, "fm");
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(fragments, "fragments");
        this.f10902a = fragments;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i10) {
        return (Fragment) this.f10902a.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10902a.size();
    }
}
