package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes.dex */
final class C0801b extends ViewPager2.AbstractC0794i {

    /* renamed from: a */
    private final List<ViewPager2.AbstractC0794i> f4710a;

    C0801b(int i4) {
        this.f4710a = new ArrayList(i4);
    }

    /* renamed from: c */
    private void m4095c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* renamed from: a */
    void m4096a(ViewPager2.AbstractC0794i abstractC0794i) {
        this.f4710a.add(abstractC0794i);
    }

    /* renamed from: b */
    void m4097b(ViewPager2.AbstractC0794i abstractC0794i) {
        this.f4710a.remove(abstractC0794i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageScrollStateChanged(int i4) {
        try {
            Iterator<ViewPager2.AbstractC0794i> it = this.f4710a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i4);
            }
        } catch (ConcurrentModificationException e4) {
            m4095c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageScrolled(int i4, float f4, int i5) {
        try {
            Iterator<ViewPager2.AbstractC0794i> it = this.f4710a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i4, f4, i5);
            }
        } catch (ConcurrentModificationException e4) {
            m4095c(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageSelected(int i4) {
        try {
            Iterator<ViewPager2.AbstractC0794i> it = this.f4710a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i4);
            }
        } catch (ConcurrentModificationException e4) {
            m4095c(e4);
        }
    }
}
