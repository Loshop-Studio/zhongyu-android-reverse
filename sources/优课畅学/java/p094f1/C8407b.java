package p094f1;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: f1.b */
/* loaded from: classes4.dex */
public class C8407b extends ViewPager {

    /* renamed from: a */
    public boolean f15927a;

    public C8407b(Context context) {
        super(context);
        this.f15927a = true;
    }

    /* renamed from: a */
    public void m13700a(boolean z10) {
        this.f15927a = z10;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f15927a && super.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f15927a && super.canScrollVertically(i10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15927a && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15927a && super.onTouchEvent(motionEvent);
    }
}
