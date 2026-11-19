package p174n1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.contrarywind.view.WheelView;

/* renamed from: n1.a */
/* loaded from: classes3.dex */
public final class C8617a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f14270a;

    public C8617a(WheelView wheelView) {
        this.f14270a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f14270a.m3998h(f11);
        return true;
    }
}
