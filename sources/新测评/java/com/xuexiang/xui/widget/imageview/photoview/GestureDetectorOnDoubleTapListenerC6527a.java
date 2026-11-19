package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes4.dex */
public class GestureDetectorOnDoubleTapListenerC6527a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC6529c f6343a;

    public GestureDetectorOnDoubleTapListenerC6527a(ViewOnTouchListenerC6529c viewOnTouchListenerC6529c) {
        m5697a(viewOnTouchListenerC6529c);
    }

    /* renamed from: a */
    public void m5697a(ViewOnTouchListenerC6529c viewOnTouchListenerC6529c) {
        this.f6343a = viewOnTouchListenerC6529c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6343a;
        if (viewOnTouchListenerC6529c == null) {
            return false;
        }
        try {
            float fM5711C = viewOnTouchListenerC6529c.m5711C();
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (fM5711C < this.f6343a.m5754y()) {
                ViewOnTouchListenerC6529c viewOnTouchListenerC6529c2 = this.f6343a;
                viewOnTouchListenerC6529c2.m5731Z(viewOnTouchListenerC6529c2.m5754y(), x9, y9, true);
            } else if (fM5711C < this.f6343a.m5754y() || fM5711C >= this.f6343a.m5753x()) {
                ViewOnTouchListenerC6529c viewOnTouchListenerC6529c3 = this.f6343a;
                viewOnTouchListenerC6529c3.m5731Z(viewOnTouchListenerC6529c3.m5755z(), x9, y9, true);
            } else {
                ViewOnTouchListenerC6529c viewOnTouchListenerC6529c4 = this.f6343a;
                viewOnTouchListenerC6529c4.m5731Z(viewOnTouchListenerC6529c4.m5753x(), x9, y9, true);
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
        RectF rectFM5746q;
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6343a;
        if (viewOnTouchListenerC6529c == null) {
            return false;
        }
        ImageView imageViewM5750u = viewOnTouchListenerC6529c.m5750u();
        if (this.f6343a.m5709A() != null && (rectFM5746q = this.f6343a.m5746q()) != null) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (rectFM5746q.contains(x9, y9)) {
                this.f6343a.m5709A().mo5760b(imageViewM5750u, (x9 - rectFM5746q.left) / rectFM5746q.width(), (y9 - rectFM5746q.top) / rectFM5746q.height());
                return true;
            }
            this.f6343a.m5709A().mo5759a();
        }
        if (this.f6343a.m5710B() != null) {
            this.f6343a.m5710B().mo5761a(imageViewM5750u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
