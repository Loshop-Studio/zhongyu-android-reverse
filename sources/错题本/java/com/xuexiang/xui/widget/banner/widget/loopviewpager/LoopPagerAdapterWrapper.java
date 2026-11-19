package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import p026c2.C3218b;

/* loaded from: classes3.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a */
    public PagerAdapter f4062a;

    /* renamed from: b */
    public SparseArray f4063b;

    /* renamed from: c */
    public boolean f4064c;

    /* renamed from: a */
    public final int m3459a(int i) {
        int count = this.f4062a.getCount();
        if (count == 0) {
            return 0;
        }
        int i8 = (i - 1) % count;
        return i8 < 0 ? i8 + count : i8;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        PagerAdapter pagerAdapter = this.f4062a;
        int count = pagerAdapter.getCount();
        int iM3459a = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i : m3459a(i);
        if (!this.f4064c || (i != 1 && i != count)) {
            pagerAdapter.destroyItem(viewGroup, iM3459a, obj);
            return;
        }
        SparseArray sparseArray = this.f4063b;
        C3218b c3218b = new C3218b();
        c3218b.f1779a = obj;
        sparseArray.put(i, c3218b);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        this.f4062a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f4062a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C3218b c3218b;
        PagerAdapter pagerAdapter = this.f4062a;
        int iM3459a = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i : m3459a(i);
        if (!this.f4064c || (c3218b = (C3218b) this.f4063b.get(i)) == null) {
            return pagerAdapter.instantiateItem(viewGroup, iM3459a);
        }
        this.f4063b.remove(i);
        return c3218b.f1779a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return this.f4062a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.f4063b = new SparseArray();
        this.f4062a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f4062a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return this.f4062a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f4062a.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        this.f4062a.startUpdate(viewGroup);
    }
}
