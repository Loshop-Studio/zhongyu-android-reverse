package p139x0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: x0.c */
/* loaded from: classes2.dex */
public class C4659c extends AbstractC4658b {

    /* renamed from: j */
    public final ScaleGestureDetector f5958j;

    /* renamed from: x0.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C4659c.this.f5949a.mo4374a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C4659c(Context context) {
        super(context);
        this.f5958j = new ScaleGestureDetector(context, new a());
    }

    @Override // p139x0.InterfaceC4660d
    /* renamed from: c */
    public boolean mo6560c() {
        return this.f5958j.isInProgress();
    }

    @Override // p139x0.AbstractC4658b, p139x0.AbstractC4657a, p139x0.InterfaceC4660d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f5958j.onTouchEvent(motionEvent);
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
