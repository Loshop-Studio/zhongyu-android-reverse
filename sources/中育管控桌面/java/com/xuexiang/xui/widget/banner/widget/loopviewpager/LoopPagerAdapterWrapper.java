package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes3.dex */
public class LoopPagerAdapterWrapper extends PagerAdapter {

    /* renamed from: a */
    public PagerAdapter f4608a;

    /* renamed from: b */
    public SparseArray f4609b = new SparseArray();

    /* renamed from: c */
    public boolean f4610c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C5871a {

        /* renamed from: a */
        public ViewGroup f4611a;

        /* renamed from: b */
        public int f4612b;

        /* renamed from: c */
        public Object f4613c;

        public C5871a(ViewGroup viewGroup, int i6, Object obj) {
            this.f4611a = viewGroup;
            this.f4612b = i6;
            this.f4613c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f4608a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m4515a() {
        return this.f4608a;
    }

    /* renamed from: b */
    public int m4516b() {
        return this.f4608a.getCount();
    }

    /* renamed from: c */
    public final int m4517c() {
        return 1;
    }

    /* renamed from: d */
    public final int m4518d() {
        return (m4517c() + m4516b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i6, Object obj) {
        int iM4517c = m4517c();
        int iM4518d = m4518d();
        PagerAdapter pagerAdapter = this.f4608a;
        int iM4521g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i6 : m4521g(i6);
        if (this.f4610c && (i6 == iM4517c || i6 == iM4518d)) {
            this.f4609b.put(i6, new C5871a(viewGroup, iM4521g, obj));
        } else {
            this.f4608a.destroyItem(viewGroup, iM4521g, obj);
        }
    }

    /* renamed from: e */
    public void m4519e(boolean z6) {
        this.f4610c = z6;
    }

    /* renamed from: f */
    public int m4520f(int i6) {
        return i6 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f4608a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m4521g(int i6) {
        int iM4516b = m4516b();
        if (iM4516b == 0) {
            return 0;
        }
        int i7 = (i6 - 1) % iM4516b;
        return i7 < 0 ? i7 + iM4516b : i7;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f4608a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i6) {
        C5871a c5871a;
        PagerAdapter pagerAdapter = this.f4608a;
        int iM4521g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i6 : m4521g(i6);
        if (!this.f4610c || (c5871a = (C5871a) this.f4609b.get(i6)) == null) {
            return this.f4608a.instantiateItem(viewGroup, iM4521g);
        }
        this.f4609b.remove(i6);
        return c5871a.f4613c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f4608a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f4609b = new SparseArray();
        this.f4608a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f4608a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f4608a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i6, Object obj) {
        this.f4608a.setPrimaryItem(viewGroup, i6, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f4608a.startUpdate(viewGroup);
    }
}
