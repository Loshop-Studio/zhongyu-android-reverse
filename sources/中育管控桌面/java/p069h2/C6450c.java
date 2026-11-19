package p069h2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: h2.c */
/* loaded from: classes3.dex */
public class C6450c extends AbstractC6449b {

    /* renamed from: j */
    public final ScaleGestureDetector f8208j;

    public C6450c(Context context) {
        super(context);
        this.f8208j = new ScaleGestureDetector(context, new a());
    }

    @Override // p069h2.AbstractC6449b, p069h2.AbstractC6448a, p069h2.InterfaceC6451d
    /* renamed from: a */
    public boolean mo7091a(MotionEvent motionEvent) {
        try {
            this.f8208j.onTouchEvent(motionEvent);
            return super.mo7091a(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // p069h2.InterfaceC6451d
    /* renamed from: d */
    public boolean mo7096d() {
        return this.f8208j.isInProgress();
    }

    /* renamed from: h2.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C6450c.this.f8199a.mo4753b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
}
