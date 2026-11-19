package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes4.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a */
    public PagerAdapter f7209a;

    /* renamed from: b */
    public SparseArray f7210b = new SparseArray();

    /* renamed from: c */
    public boolean f7211c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C6892a {

        /* renamed from: a */
        public ViewGroup f7212a;

        /* renamed from: b */
        public int f7213b;

        /* renamed from: c */
        public Object f7214c;

        public C6892a(ViewGroup viewGroup, int i10, Object obj) {
            this.f7212a = viewGroup;
            this.f7213b = i10;
            this.f7214c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f7209a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m6626a() {
        return this.f7209a;
    }

    /* renamed from: b */
    public int m6627b() {
        return this.f7209a.getCount();
    }

    /* renamed from: c */
    public final int m6628c() {
        return 1;
    }

    /* renamed from: d */
    public final int m6629d() {
        return (m6628c() + m6627b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        int iM6628c = m6628c();
        int iM6629d = m6629d();
        PagerAdapter pagerAdapter = this.f7209a;
        int iM6632g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m6632g(i10);
        if (this.f7211c && (i10 == iM6628c || i10 == iM6629d)) {
            this.f7210b.put(i10, new C6892a(viewGroup, iM6632g, obj));
        } else {
            this.f7209a.destroyItem(viewGroup, iM6632g, obj);
        }
    }

    /* renamed from: e */
    public void m6630e(boolean z10) {
        this.f7211c = z10;
    }

    /* renamed from: f */
    public int m6631f(int i10) {
        return i10 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f7209a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m6632g(int i10) {
        int iM6627b = m6627b();
        if (iM6627b == 0) {
            return 0;
        }
        int i11 = (i10 - 1) % iM6627b;
        return i11 < 0 ? i11 + iM6627b : i11;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f7209a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        C6892a c6892a;
        PagerAdapter pagerAdapter = this.f7209a;
        int iM6632g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m6632g(i10);
        if (!this.f7211c || (c6892a = (C6892a) this.f7210b.get(i10)) == null) {
            return this.f7209a.instantiateItem(viewGroup, iM6632g);
        }
        this.f7210b.remove(i10);
        return c6892a.f7214c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f7209a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f7210b = new SparseArray();
        this.f7209a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f7209a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f7209a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f7209a.setPrimaryItem(viewGroup, i10, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f7209a.startUpdate(viewGroup);
    }
}
