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
    public PagerAdapter f7139a;

    /* renamed from: b */
    public SparseArray f7140b = new SparseArray();

    /* renamed from: c */
    public boolean f7141c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C6812a {

        /* renamed from: a */
        public ViewGroup f7142a;

        /* renamed from: b */
        public int f7143b;

        /* renamed from: c */
        public Object f7144c;

        public C6812a(ViewGroup viewGroup, int i9, Object obj) {
            this.f7142a = viewGroup;
            this.f7143b = i9;
            this.f7144c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f7139a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m6601a() {
        return this.f7139a;
    }

    /* renamed from: b */
    public int m6602b() {
        return this.f7139a.getCount();
    }

    /* renamed from: c */
    public final int m6603c() {
        return 1;
    }

    /* renamed from: d */
    public final int m6604d() {
        return (m6603c() + m6602b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
        int iM6603c = m6603c();
        int iM6604d = m6604d();
        PagerAdapter pagerAdapter = this.f7139a;
        int iM6607g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i9 : m6607g(i9);
        if (this.f7141c && (i9 == iM6603c || i9 == iM6604d)) {
            this.f7140b.put(i9, new C6812a(viewGroup, iM6607g, obj));
        } else {
            this.f7139a.destroyItem(viewGroup, iM6607g, obj);
        }
    }

    /* renamed from: e */
    public void m6605e(boolean z9) {
        this.f7141c = z9;
    }

    /* renamed from: f */
    public int m6606f(int i9) {
        return i9 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f7139a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m6607g(int i9) {
        int iM6602b = m6602b();
        if (iM6602b == 0) {
            return 0;
        }
        int i10 = (i9 - 1) % iM6602b;
        return i10 < 0 ? i10 + iM6602b : i10;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f7139a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i9) {
        C6812a c6812a;
        PagerAdapter pagerAdapter = this.f7139a;
        int iM6607g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i9 : m6607g(i9);
        if (!this.f7141c || (c6812a = (C6812a) this.f7140b.get(i9)) == null) {
            return this.f7139a.instantiateItem(viewGroup, iM6607g);
        }
        this.f7140b.remove(i9);
        return c6812a.f7144c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f7139a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f7140b = new SparseArray();
        this.f7139a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f7139a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f7139a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i9, Object obj) {
        this.f7139a.setPrimaryItem(viewGroup, i9, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f7139a.startUpdate(viewGroup);
    }
}
