package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes5.dex */
public class FragmentStateAdapter<T extends Fragment> extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public List f15179a;

    /* renamed from: b */
    public List f15180b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f15179a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i10) {
        return (Fragment) this.f15179a.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return (CharSequence) this.f15180b.get(i10);
    }
}
