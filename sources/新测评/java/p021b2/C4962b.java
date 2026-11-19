package p021b2;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: b2.b */
/* loaded from: classes4.dex */
public class C4962b extends ViewPager {

    /* renamed from: a */
    public boolean f2393a;

    public C4962b(Context context) {
        super(context);
        this.f2393a = true;
    }

    /* renamed from: a */
    public void m2372a(boolean z9) {
        this.f2393a = z9;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f2393a && super.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f2393a && super.canScrollVertically(i10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2393a && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f2393a && super.onTouchEvent(motionEvent);
    }
}
