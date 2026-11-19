package p165l1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.contrarywind.view.WheelView;

/* renamed from: l1.a */
/* loaded from: classes3.dex */
public final class C8877a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final WheelView f14675a;

    public C8877a(WheelView wheelView) {
        this.f14675a = wheelView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f14675a.m4022h(f11);
        return true;
    }
}
