package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes2.dex */
public class GestureDetectorOnDoubleTapListenerC3567a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC3569c f3547a;

    public GestureDetectorOnDoubleTapListenerC3567a(ViewOnTouchListenerC3569c viewOnTouchListenerC3569c) {
        m4339a(viewOnTouchListenerC3569c);
    }

    /* renamed from: a */
    public void m4339a(ViewOnTouchListenerC3569c viewOnTouchListenerC3569c) {
        this.f3547a = viewOnTouchListenerC3569c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3547a;
        if (viewOnTouchListenerC3569c == null) {
            return false;
        }
        try {
            float fM4353C = viewOnTouchListenerC3569c.m4353C();
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (fM4353C < this.f3547a.m4396y()) {
                ViewOnTouchListenerC3569c viewOnTouchListenerC3569c2 = this.f3547a;
                viewOnTouchListenerC3569c2.m4373Z(viewOnTouchListenerC3569c2.m4396y(), x3, y3, true);
            } else if (fM4353C < this.f3547a.m4396y() || fM4353C >= this.f3547a.m4395x()) {
                ViewOnTouchListenerC3569c viewOnTouchListenerC3569c3 = this.f3547a;
                viewOnTouchListenerC3569c3.m4373Z(viewOnTouchListenerC3569c3.m4397z(), x3, y3, true);
            } else {
                ViewOnTouchListenerC3569c viewOnTouchListenerC3569c4 = this.f3547a;
                viewOnTouchListenerC3569c4.m4373Z(viewOnTouchListenerC3569c4.m4395x(), x3, y3, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectFM4388q;
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3547a;
        if (viewOnTouchListenerC3569c == null) {
            return false;
        }
        ImageView imageViewM4392u = viewOnTouchListenerC3569c.m4392u();
        if (this.f3547a.m4351A() != null && (rectFM4388q = this.f3547a.m4388q()) != null) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (rectFM4388q.contains(x3, y3)) {
                this.f3547a.m4351A().mo4401a(imageViewM4392u, (x3 - rectFM4388q.left) / rectFM4388q.width(), (y3 - rectFM4388q.top) / rectFM4388q.height());
                return true;
            }
            this.f3547a.m4351A().mo4402b();
        }
        if (this.f3547a.m4352B() != null) {
            this.f3547a.m4352B().mo4403a(imageViewM4392u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
