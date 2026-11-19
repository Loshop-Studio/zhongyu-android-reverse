package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes4.dex */
public class GestureDetectorOnDoubleTapListenerC6933a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC6935c f7760a;

    public GestureDetectorOnDoubleTapListenerC6933a(ViewOnTouchListenerC6935c viewOnTouchListenerC6935c) {
        m6891a(viewOnTouchListenerC6935c);
    }

    /* renamed from: a */
    public void m6891a(ViewOnTouchListenerC6935c viewOnTouchListenerC6935c) {
        this.f7760a = viewOnTouchListenerC6935c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7760a;
        if (viewOnTouchListenerC6935c == null) {
            return false;
        }
        try {
            float fM6905C = viewOnTouchListenerC6935c.m6905C();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (fM6905C < this.f7760a.m6948y()) {
                ViewOnTouchListenerC6935c viewOnTouchListenerC6935c2 = this.f7760a;
                viewOnTouchListenerC6935c2.m6925Z(viewOnTouchListenerC6935c2.m6948y(), x10, y10, true);
            } else if (fM6905C < this.f7760a.m6948y() || fM6905C >= this.f7760a.m6947x()) {
                ViewOnTouchListenerC6935c viewOnTouchListenerC6935c3 = this.f7760a;
                viewOnTouchListenerC6935c3.m6925Z(viewOnTouchListenerC6935c3.m6949z(), x10, y10, true);
            } else {
                ViewOnTouchListenerC6935c viewOnTouchListenerC6935c4 = this.f7760a;
                viewOnTouchListenerC6935c4.m6925Z(viewOnTouchListenerC6935c4.m6947x(), x10, y10, true);
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
        RectF rectFM6940q;
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7760a;
        if (viewOnTouchListenerC6935c == null) {
            return false;
        }
        ImageView imageViewM6944u = viewOnTouchListenerC6935c.m6944u();
        if (this.f7760a.m6903A() != null && (rectFM6940q = this.f7760a.m6940q()) != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (rectFM6940q.contains(x10, y10)) {
                this.f7760a.m6903A().mo6954b(imageViewM6944u, (x10 - rectFM6940q.left) / rectFM6940q.width(), (y10 - rectFM6940q.top) / rectFM6940q.height());
                return true;
            }
            this.f7760a.m6903A().mo6953a();
        }
        if (this.f7760a.m6904B() != null) {
            this.f7760a.m6904B().mo6955a(imageViewM6944u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
