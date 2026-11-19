package com.xuexiang.xui.adapter;

import androidx.fragment.app.AbstractC0465n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FragmentAdapter<T extends Fragment> extends AbstractC0465n {
    private List<T> mFragmentList;
    private List<String> mTitleList;

    public FragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
    }

    public FragmentAdapter addFragment(T t3, String str) {
        if (t3 != null) {
            this.mFragmentList.add(t3);
            this.mTitleList.add(str);
        }
        return this;
    }

    public FragmentAdapter addFragments(List<T> list) {
        if (list != null && list.size() > 0) {
            this.mFragmentList.addAll(list);
        }
        return this;
    }

    public FragmentAdapter addTitles(List<String> list) {
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

    @Override // androidx.fragment.app.AbstractC0465n
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

    public FragmentAdapter setFragments(List<T> list) {
        if (list != null && list.size() > 0) {
            this.mFragmentList.clear();
            this.mFragmentList.addAll(list);
        }
        return this;
    }

    public FragmentAdapter setTitles(List<String> list) {
        if (list != null && list.size() > 0) {
            this.mTitleList.clear();
            this.mTitleList.addAll(list);
        }
        return this;
    }

    public FragmentAdapter(FragmentManager fragmentManager, T[] tArr) {
        this(fragmentManager, Arrays.asList(tArr));
    }

    public FragmentAdapter(FragmentManager fragmentManager, List<T> list) {
        super(fragmentManager);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
        setFragments(list);
    }

    public FragmentAdapter(FragmentManager fragmentManager, int i4) {
        super(fragmentManager, i4);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
    }

    public FragmentAdapter(FragmentManager fragmentManager, int i4, T[] tArr) {
        this(fragmentManager, i4, Arrays.asList(tArr));
    }

    public FragmentAdapter(FragmentManager fragmentManager, int i4, List<T> list) {
        super(fragmentManager, i4);
        this.mFragmentList = new ArrayList();
        this.mTitleList = new ArrayList();
        setFragments(list);
    }
}
