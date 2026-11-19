package p070b.p113c.p114a.p116e.p128f.p130b;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: b.c.a.e.f.b.d */
/* loaded from: classes.dex */
public class C0820d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ ViewOnTouchListenerC0821e f4552a;

    public C0820d(ViewOnTouchListenerC0821e viewOnTouchListenerC0821e) {
        this.f4552a = viewOnTouchListenerC0821e;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4552a;
        if (viewOnTouchListenerC0821e.f4579v == null || viewOnTouchListenerC0821e.m2532l() > 1.0f || motionEvent.getPointerCount() > ViewOnTouchListenerC0821e.f4554F || motionEvent2.getPointerCount() > ViewOnTouchListenerC0821e.f4554F) {
            return false;
        }
        return this.f4552a.f4579v.onFling(motionEvent, motionEvent2, f2, f3);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4552a;
        if (viewOnTouchListenerC0821e.f4577t != null && viewOnTouchListenerC0821e.m2529i().getY() == 0.0f && this.f4552a.m2529i().getX() == 0.0f) {
            ViewOnTouchListenerC0821e viewOnTouchListenerC0821e2 = this.f4552a;
            viewOnTouchListenerC0821e2.f4577t.onLongClick(viewOnTouchListenerC0821e2.m2529i());
        }
    }
}
