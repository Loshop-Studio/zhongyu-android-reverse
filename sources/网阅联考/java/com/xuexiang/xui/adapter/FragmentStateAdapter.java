package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class FragmentStateAdapter<T extends Fragment> extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public List f3087a;

    /* renamed from: b */
    public List f3088b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f3087a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i4) {
        return (Fragment) this.f3087a.get(i4);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        return (CharSequence) this.f3088b.get(i4);
    }
}
