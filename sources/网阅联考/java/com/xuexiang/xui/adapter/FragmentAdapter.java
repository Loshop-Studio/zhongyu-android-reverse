package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f3085a;

    /* renamed from: b */
    public List f3086b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f3085a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i4) {
        return (Fragment) this.f3085a.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        return (CharSequence) this.f3086b.get(i4);
    }
}
