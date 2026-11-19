package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes5.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a */
    public PagerAdapter f15520a;

    /* renamed from: b */
    public SparseArray f15521b = new SparseArray();

    /* renamed from: c */
    public boolean f15522c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C8067a {

        /* renamed from: a */
        public ViewGroup f15523a;

        /* renamed from: b */
        public int f15524b;

        /* renamed from: c */
        public Object f15525c;

        public C8067a(ViewGroup viewGroup, int i10, Object obj) {
            this.f15523a = viewGroup;
            this.f15524b = i10;
            this.f15525c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f15520a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m12411a() {
        return this.f15520a;
    }

    /* renamed from: b */
    public int m12412b() {
        return this.f15520a.getCount();
    }

    /* renamed from: c */
    public final int m12413c() {
        return 1;
    }

    /* renamed from: d */
    public final int m12414d() {
        return (m12413c() + m12412b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        int iM12413c = m12413c();
        int iM12414d = m12414d();
        PagerAdapter pagerAdapter = this.f15520a;
        int iM12417g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m12417g(i10);
        if (this.f15522c && (i10 == iM12413c || i10 == iM12414d)) {
            this.f15521b.put(i10, new C8067a(viewGroup, iM12417g, obj));
        } else {
            this.f15520a.destroyItem(viewGroup, iM12417g, obj);
        }
    }

    /* renamed from: e */
    public void m12415e(boolean z10) {
        this.f15522c = z10;
    }

    /* renamed from: f */
    public int m12416f(int i10) {
        return i10 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f15520a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m12417g(int i10) {
        int iM12412b = m12412b();
        if (iM12412b == 0) {
            return 0;
        }
        int i11 = (i10 - 1) % iM12412b;
        return i11 < 0 ? i11 + iM12412b : i11;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f15520a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        C8067a c8067a;
        PagerAdapter pagerAdapter = this.f15520a;
        int iM12417g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m12417g(i10);
        if (!this.f15522c || (c8067a = (C8067a) this.f15521b.get(i10)) == null) {
            return this.f15520a.instantiateItem(viewGroup, iM12417g);
        }
        this.f15521b.remove(i10);
        return c8067a.f15525c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f15520a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f15521b = new SparseArray();
        this.f15520a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f15520a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f15520a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f15520a.setPrimaryItem(viewGroup, i10, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f15520a.startUpdate(viewGroup);
    }
}
