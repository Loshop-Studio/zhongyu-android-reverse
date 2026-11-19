package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes4.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f6999a;

    /* renamed from: b */
    public List f7000b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f6999a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i9) {
        return (Fragment) this.f6999a.get(i9);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i9) {
        return (CharSequence) this.f7000b.get(i9);
    }
}
