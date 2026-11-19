package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes3.dex */
public class GestureDetectorOnDoubleTapListenerC5906a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC5908c f5068a;

    public GestureDetectorOnDoubleTapListenerC5906a(ViewOnTouchListenerC5908c viewOnTouchListenerC5908c) {
        m4716a(viewOnTouchListenerC5908c);
    }

    /* renamed from: a */
    public void m4716a(ViewOnTouchListenerC5908c viewOnTouchListenerC5908c) {
        this.f5068a = viewOnTouchListenerC5908c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5068a;
        if (viewOnTouchListenerC5908c == null) {
            return false;
        }
        try {
            float fM4730C = viewOnTouchListenerC5908c.m4730C();
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            if (fM4730C < this.f5068a.m4773y()) {
                ViewOnTouchListenerC5908c viewOnTouchListenerC5908c2 = this.f5068a;
                viewOnTouchListenerC5908c2.m4750Z(viewOnTouchListenerC5908c2.m4773y(), x6, y6, true);
            } else if (fM4730C < this.f5068a.m4773y() || fM4730C >= this.f5068a.m4772x()) {
                ViewOnTouchListenerC5908c viewOnTouchListenerC5908c3 = this.f5068a;
                viewOnTouchListenerC5908c3.m4750Z(viewOnTouchListenerC5908c3.m4774z(), x6, y6, true);
            } else {
                ViewOnTouchListenerC5908c viewOnTouchListenerC5908c4 = this.f5068a;
                viewOnTouchListenerC5908c4.m4750Z(viewOnTouchListenerC5908c4.m4772x(), x6, y6, true);
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
        RectF rectFM4765q;
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5068a;
        if (viewOnTouchListenerC5908c == null) {
            return false;
        }
        ImageView imageViewM4769u = viewOnTouchListenerC5908c.m4769u();
        if (this.f5068a.m4728A() != null && (rectFM4765q = this.f5068a.m4765q()) != null) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            if (rectFM4765q.contains(x6, y6)) {
                this.f5068a.m4728A().mo4779b(imageViewM4769u, (x6 - rectFM4765q.left) / rectFM4765q.width(), (y6 - rectFM4765q.top) / rectFM4765q.height());
                return true;
            }
            this.f5068a.m4728A().mo4778a();
        }
        if (this.f5068a.m4729B() != null) {
            this.f5068a.m4729B().mo4780a(imageViewM4769u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
