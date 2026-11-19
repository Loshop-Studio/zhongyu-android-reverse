package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes5.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f15177a;

    /* renamed from: b */
    public List f15178b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f15177a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return (Fragment) this.f15177a.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return (CharSequence) this.f15178b.get(i10);
    }
}
