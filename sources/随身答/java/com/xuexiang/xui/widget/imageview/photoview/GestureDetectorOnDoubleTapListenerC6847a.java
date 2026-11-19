package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.photoview.a */
/* loaded from: classes4.dex */
public class GestureDetectorOnDoubleTapListenerC6847a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public ViewOnTouchListenerC6849c f7601a;

    public GestureDetectorOnDoubleTapListenerC6847a(ViewOnTouchListenerC6849c viewOnTouchListenerC6849c) {
        m6803a(viewOnTouchListenerC6849c);
    }

    /* renamed from: a */
    public void m6803a(ViewOnTouchListenerC6849c viewOnTouchListenerC6849c) {
        this.f7601a = viewOnTouchListenerC6849c;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7601a;
        if (viewOnTouchListenerC6849c == null) {
            return false;
        }
        try {
            float fM6817C = viewOnTouchListenerC6849c.m6817C();
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (fM6817C < this.f7601a.m6860y()) {
                ViewOnTouchListenerC6849c viewOnTouchListenerC6849c2 = this.f7601a;
                viewOnTouchListenerC6849c2.m6837Z(viewOnTouchListenerC6849c2.m6860y(), x9, y9, true);
            } else if (fM6817C < this.f7601a.m6860y() || fM6817C >= this.f7601a.m6859x()) {
                ViewOnTouchListenerC6849c viewOnTouchListenerC6849c3 = this.f7601a;
                viewOnTouchListenerC6849c3.m6837Z(viewOnTouchListenerC6849c3.m6861z(), x9, y9, true);
            } else {
                ViewOnTouchListenerC6849c viewOnTouchListenerC6849c4 = this.f7601a;
                viewOnTouchListenerC6849c4.m6837Z(viewOnTouchListenerC6849c4.m6859x(), x9, y9, true);
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
        RectF rectFM6852q;
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7601a;
        if (viewOnTouchListenerC6849c == null) {
            return false;
        }
        ImageView imageViewM6856u = viewOnTouchListenerC6849c.m6856u();
        if (this.f7601a.m6815A() != null && (rectFM6852q = this.f7601a.m6852q()) != null) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (rectFM6852q.contains(x9, y9)) {
                this.f7601a.m6815A().mo6866b(imageViewM6856u, (x9 - rectFM6852q.left) / rectFM6852q.width(), (y9 - rectFM6852q.top) / rectFM6852q.height());
                return true;
            }
            this.f7601a.m6815A().mo6865a();
        }
        if (this.f7601a.m6816B() != null) {
            this.f7601a.m6816B().mo6867a(imageViewM6856u, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }
}
