package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes4.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f7062a;

    /* renamed from: b */
    public List f7063b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f7062a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return (Fragment) this.f7062a.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return (CharSequence) this.f7063b.get(i10);
    }
}
