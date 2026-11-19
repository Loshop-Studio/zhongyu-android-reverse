package com.xuexiang.xui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* loaded from: classes3.dex */
public class FragmentStateAdapter<T extends Fragment> extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public List f4466a;

    /* renamed from: b */
    public List f4467b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f4466a.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i6) {
        return (Fragment) this.f4466a.get(i6);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i6) {
        return (CharSequence) this.f4467b.get(i6);
    }
}
