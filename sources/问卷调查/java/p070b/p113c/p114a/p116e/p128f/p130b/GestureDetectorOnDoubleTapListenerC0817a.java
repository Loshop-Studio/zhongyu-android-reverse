package p070b.p113c.p114a.p116e.p128f.p130b;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;
import p070b.p113c.p114a.p116e.p128f.p130b.ViewOnTouchListenerC0821e;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0837c;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0838d;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0842h;

/* renamed from: b.c.a.e.f.b.a */
/* loaded from: classes.dex */
public class GestureDetectorOnDoubleTapListenerC0817a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC0821e f4549a;

    public GestureDetectorOnDoubleTapListenerC0817a(ViewOnTouchListenerC0821e viewOnTouchListenerC0821e) {
        this.f4549a = viewOnTouchListenerC0821e;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        float fM2532l;
        float x;
        float y;
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e;
        float f2;
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e2 = this.f4549a;
        if (viewOnTouchListenerC0821e2 == null) {
            return false;
        }
        try {
            fM2532l = viewOnTouchListenerC0821e2.m2532l();
            x = motionEvent.getX();
            y = motionEvent.getY();
            viewOnTouchListenerC0821e = this.f4549a;
            f2 = viewOnTouchListenerC0821e.f4562e;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (fM2532l >= f2) {
            if (fM2532l >= f2) {
                f2 = viewOnTouchListenerC0821e.f4563f;
                if (fM2532l < f2) {
                }
                return true;
            }
            viewOnTouchListenerC0821e.m2536q(viewOnTouchListenerC0821e.f4561d, x, y, true);
            return true;
        }
        viewOnTouchListenerC0821e.m2536q(f2, x, y, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectFM2526f;
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4549a;
        if (viewOnTouchListenerC0821e == null) {
            return false;
        }
        viewOnTouchListenerC0821e.m2529i();
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e2 = this.f4549a;
        if (viewOnTouchListenerC0821e2.f4575r != null && (rectFM2526f = viewOnTouchListenerC0821e2.m2526f()) != null) {
            if (rectFM2526f.contains(motionEvent.getX(), motionEvent.getY())) {
                rectFM2526f.width();
                rectFM2526f.height();
                C0838d c0838d = (C0838d) this.f4549a.f4575r;
                if (!c0838d.f4615a.f4622X.m2768e()) {
                    return true;
                }
                C0842h.m2557x0(c0838d.f4615a);
                return true;
            }
            Objects.requireNonNull((C0838d) this.f4549a.f4575r);
        }
        ViewOnTouchListenerC0821e.h hVar = this.f4549a.f4576s;
        if (hVar != null) {
            motionEvent.getX();
            motionEvent.getY();
            C0837c c0837c = (C0837c) hVar;
            if (c0837c.f4614a.f4622X.m2768e()) {
                C0842h.m2557x0(c0837c.f4614a);
            }
        }
        return false;
    }
}
