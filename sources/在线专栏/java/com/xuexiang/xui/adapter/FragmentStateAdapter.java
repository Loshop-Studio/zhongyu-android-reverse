package com.xuexiang.xui.adapter;

import androidx.fragment.app.AbstractC0468q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FragmentStateAdapter<T extends Fragment> extends AbstractC0468q {
    private List<T> mFragmentList;
    private List<String> mTitleList;

    public FragmentStateAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
    }

    public FragmentStateAdapter addFragment(T t3, String str) {
        if (t3 != null) {
            this.mFragmentList.add(t3);
            this.mTitleList.add(str);
        }
        return this;
    }

    public FragmentStateAdapter addFragments(List<T> list) {
        if (list != null && list.size() > 0) {
            this.mFragmentList.addAll(list);
        }
        return this;
    }

    public FragmentStateAdapter addTitles(List<String> list) {
        if (list != null && list.size() > 0) {
            this.mTitleList.addAll(list);
        }
        return this;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public int getCount() {
        return this.mFragmentList.size();
    }

    public List<T> getFragmentList() {
        return this.mFragmentList;
    }

    @Override // androidx.fragment.app.AbstractC0468q
    public T getItem(int i4) {
        return this.mFragmentList.get(i4);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public CharSequence getPageTitle(int i4) {
        return this.mTitleList.get(i4);
    }

    public List<String> getTitleList() {
        return this.mTitleList;
    }

    public FragmentStateAdapter setFragments(List<T> list) {
        if (list != null && list.size() > 0) {
            this.mFragmentList.clear();
            this.mFragmentList.addAll(list);
        }
        return this;
    }

    public FragmentStateAdapter setTitles(List<String> list) {
        if (list != null && list.size() > 0) {
            this.mTitleList.clear();
            this.mTitleList.addAll(list);
        }
        return this;
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, T[] tArr) {
        this(fragmentManager, Arrays.asList(tArr));
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, List<T> list) {
        super(fragmentManager);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
        setFragments(list);
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, int i4) {
        super(fragmentManager, i4);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, int i4, T[] tArr) {
        this(fragmentManager, i4, Arrays.asList(tArr));
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, int i4, List<T> list) {
        super(fragmentManager, i4);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
        setFragments(list);
    }
}
