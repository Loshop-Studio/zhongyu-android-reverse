package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes5.dex */
public class GestureDetectorOnDoubleTapListenerC8139a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: c */
    public ViewOnTouchListenerC8141c f16207c;

    public GestureDetectorOnDoubleTapListenerC8139a(ViewOnTouchListenerC8141c viewOnTouchListenerC8141c) {
        m12784a(viewOnTouchListenerC8141c);
    }

    /* renamed from: a */
    public void m12784a(ViewOnTouchListenerC8141c viewOnTouchListenerC8141c) {
        this.f16207c = viewOnTouchListenerC8141c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16207c;
        if (viewOnTouchListenerC8141c == null) {
            return false;
        }
        try {
            float fM12798C = viewOnTouchListenerC8141c.m12798C();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (fM12798C < this.f16207c.m12841y()) {
                ViewOnTouchListenerC8141c viewOnTouchListenerC8141c2 = this.f16207c;
                viewOnTouchListenerC8141c2.m12818Z(viewOnTouchListenerC8141c2.m12841y(), x10, y10, true);
            } else if (fM12798C < this.f16207c.m12841y() || fM12798C >= this.f16207c.m12840x()) {
                ViewOnTouchListenerC8141c viewOnTouchListenerC8141c3 = this.f16207c;
                viewOnTouchListenerC8141c3.m12818Z(viewOnTouchListenerC8141c3.m12842z(), x10, y10, true);
            } else {
                ViewOnTouchListenerC8141c viewOnTouchListenerC8141c4 = this.f16207c;
                viewOnTouchListenerC8141c4.m12818Z(viewOnTouchListenerC8141c4.m12840x(), x10, y10, true);
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
        RectF rectFM12833q;
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16207c;
        if (viewOnTouchListenerC8141c == null) {
            return false;
        }
        ImageView imageViewM12837u = viewOnTouchListenerC8141c.m12837u();
        if (this.f16207c.m12796A() != null && (rectFM12833q = this.f16207c.m12833q()) != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (rectFM12833q.contains(x10, y10)) {
                this.f16207c.m12796A().mo12847b(imageViewM12837u, (x10 - rectFM12833q.left) / rectFM12833q.width(), (y10 - rectFM12833q.top) / rectFM12833q.height());
                return true;
            }
            this.f16207c.m12796A().mo12846a();
        }
        if (this.f16207c.m12797B() != null) {
            this.f16207c.m12797B().mo12848a(imageViewM12837u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
