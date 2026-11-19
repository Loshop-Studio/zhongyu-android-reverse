package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.d */
/* loaded from: classes.dex */
final class C0803d extends ViewPager2.AbstractC0794i {

    /* renamed from: a */
    private final LinearLayoutManager f4714a;

    /* renamed from: b */
    private ViewPager2.InterfaceC0796k f4715b;

    C0803d(LinearLayoutManager linearLayoutManager) {
        this.f4714a = linearLayoutManager;
    }

    /* renamed from: a */
    ViewPager2.InterfaceC0796k m4099a() {
        return this.f4715b;
    }

    /* renamed from: b */
    void m4100b(ViewPager2.InterfaceC0796k interfaceC0796k) {
        this.f4715b = interfaceC0796k;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageScrolled(int i4, float f4, int i5) {
        if (this.f4715b == null) {
            return;
        }
        float f5 = -f4;
        for (int i6 = 0; i6 < this.f4714a.getChildCount(); i6++) {
            View childAt = this.f4714a.getChildAt(i6);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i6), Integer.valueOf(this.f4714a.getChildCount())));
            }
            this.f4715b.transformPage(childAt, (this.f4714a.getPosition(childAt) - i4) + f5);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0794i
    public void onPageSelected(int i4) {
    }
}
