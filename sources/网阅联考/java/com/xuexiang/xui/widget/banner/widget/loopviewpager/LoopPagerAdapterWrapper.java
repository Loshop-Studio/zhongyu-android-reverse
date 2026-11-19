package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes2.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a */
    public PagerAdapter f3224a;

    /* renamed from: b */
    public SparseArray f3225b = new SparseArray();

    /* renamed from: c */
    public boolean f3226c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C3542a {

        /* renamed from: a */
        public ViewGroup f3227a;

        /* renamed from: b */
        public int f3228b;

        /* renamed from: c */
        public Object f3229c;

        public C3542a(ViewGroup viewGroup, int i4, Object obj) {
            this.f3227a = viewGroup;
            this.f3228b = i4;
            this.f3229c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f3224a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m4191a() {
        return this.f3224a;
    }

    /* renamed from: b */
    public int m4192b() {
        return this.f3224a.getCount();
    }

    /* renamed from: c */
    public final int m4193c() {
        return 1;
    }

    /* renamed from: d */
    public final int m4194d() {
        return (m4193c() + m4192b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        int iM4193c = m4193c();
        int iM4194d = m4194d();
        PagerAdapter pagerAdapter = this.f3224a;
        int iM4197g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i4 : m4197g(i4);
        if (this.f3226c && (i4 == iM4193c || i4 == iM4194d)) {
            this.f3225b.put(i4, new C3542a(viewGroup, iM4197g, obj));
        } else {
            this.f3224a.destroyItem(viewGroup, iM4197g, obj);
        }
    }

    /* renamed from: e */
    public void m4195e(boolean z3) {
        this.f3226c = z3;
    }

    /* renamed from: f */
    public int m4196f(int i4) {
        return i4 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f3224a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m4197g(int i4) {
        int iM4192b = m4192b();
        if (iM4192b == 0) {
            return 0;
        }
        int i5 = (i4 - 1) % iM4192b;
        return i5 < 0 ? i5 + iM4192b : i5;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f3224a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        C3542a c3542a;
        PagerAdapter pagerAdapter = this.f3224a;
        int iM4197g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i4 : m4197g(i4);
        if (!this.f3226c || (c3542a = (C3542a) this.f3225b.get(i4)) == null) {
            return this.f3224a.instantiateItem(viewGroup, iM4197g);
        }
        this.f3225b.remove(i4);
        return c3542a.f3229c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f3224a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f3225b = new SparseArray();
        this.f3224a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f3224a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f3224a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i4, Object obj) {
        this.f3224a.setPrimaryItem(viewGroup, i4, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f3224a.startUpdate(viewGroup);
    }
}
