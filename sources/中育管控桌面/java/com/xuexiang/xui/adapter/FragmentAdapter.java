package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;

/* loaded from: classes3.dex */
public class FragmentAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    public List f4464a;

    /* renamed from: b */
    public List f4465b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f4464a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i6) {
        return (Fragment) this.f4464a.get(i6);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i6) {
        return (CharSequence) this.f4465b.get(i6);
    }
}
