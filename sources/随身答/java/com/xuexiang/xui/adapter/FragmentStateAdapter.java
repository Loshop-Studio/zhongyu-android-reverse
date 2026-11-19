package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes4.dex */
public class FragmentStateAdapter<T extends Fragment> extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public List f7001a;

    /* renamed from: b */
    public List f7002b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f7001a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i9) {
        return (Fragment) this.f7001a.get(i9);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i9) {
        return (CharSequence) this.f7002b.get(i9);
    }
}
