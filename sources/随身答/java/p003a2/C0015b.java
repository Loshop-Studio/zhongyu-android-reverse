package p003a2;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: a2.b */
/* loaded from: classes4.dex */
public class C0015b extends ViewPager {

    /* renamed from: a */
    public boolean f43a;

    public C0015b(Context context) {
        super(context);
        this.f43a = true;
    }

    /* renamed from: a */
    public void m83a(boolean z9) {
        this.f43a = z9;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i9) {
        return this.f43a && super.canScrollHorizontally(i9);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i9) {
        return this.f43a && super.canScrollVertically(i9);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f43a && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f43a && super.onTouchEvent(motionEvent);
    }
}
