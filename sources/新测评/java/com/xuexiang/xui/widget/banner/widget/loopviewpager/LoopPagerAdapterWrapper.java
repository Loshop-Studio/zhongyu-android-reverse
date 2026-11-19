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
    public PagerAdapter f5884a;

    /* renamed from: b */
    public SparseArray f5885b = new SparseArray();

    /* renamed from: c */
    public boolean f5886c;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopPagerAdapterWrapper$a */
    public static class C6493a {

        /* renamed from: a */
        public ViewGroup f5887a;

        /* renamed from: b */
        public int f5888b;

        /* renamed from: c */
        public Object f5889c;

        public C6493a(ViewGroup viewGroup, int i10, Object obj) {
            this.f5887a = viewGroup;
            this.f5888b = i10;
            this.f5889c = obj;
        }
    }

    public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
        this.f5884a = pagerAdapter;
    }

    /* renamed from: a */
    public PagerAdapter m5505a() {
        return this.f5884a;
    }

    /* renamed from: b */
    public int m5506b() {
        return this.f5884a.getCount();
    }

    /* renamed from: c */
    public final int m5507c() {
        return 1;
    }

    /* renamed from: d */
    public final int m5508d() {
        return (m5507c() + m5506b()) - 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        int iM5507c = m5507c();
        int iM5508d = m5508d();
        PagerAdapter pagerAdapter = this.f5884a;
        int iM5511g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m5511g(i10);
        if (this.f5886c && (i10 == iM5507c || i10 == iM5508d)) {
            this.f5885b.put(i10, new C6493a(viewGroup, iM5511g, obj));
        } else {
            this.f5884a.destroyItem(viewGroup, iM5511g, obj);
        }
    }

    /* renamed from: e */
    public void m5509e(boolean z9) {
        this.f5886c = z9;
    }

    /* renamed from: f */
    public int m5510f(int i10) {
        return i10 + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f5884a.finishUpdate(viewGroup);
    }

    /* renamed from: g */
    public int m5511g(int i10) {
        int iM5506b = m5506b();
        if (iM5506b == 0) {
            return 0;
        }
        int i11 = (i10 - 1) % iM5506b;
        return i11 < 0 ? i11 + iM5506b : i11;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f5884a.getCount() + 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        C6493a c6493a;
        PagerAdapter pagerAdapter = this.f5884a;
        int iM5511g = ((pagerAdapter instanceof FragmentPagerAdapter) || (pagerAdapter instanceof FragmentStatePagerAdapter)) ? i10 : m5511g(i10);
        if (!this.f5886c || (c6493a = (C6493a) this.f5885b.get(i10)) == null) {
            return this.f5884a.instantiateItem(viewGroup, iM5511g);
        }
        this.f5885b.remove(i10);
        return c6493a.f5889c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f5884a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f5885b = new SparseArray();
        this.f5884a.notifyDataSetChanged();
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f5884a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f5884a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f5884a.setPrimaryItem(viewGroup, i10, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f5884a.startUpdate(viewGroup);
    }
}
