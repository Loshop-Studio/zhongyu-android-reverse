package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes4.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f5743a;

    /* renamed from: b */
    public List f5744b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f5743a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return (Fragment) this.f5743a.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return (CharSequence) this.f5744b.get(i10);
    }
}
