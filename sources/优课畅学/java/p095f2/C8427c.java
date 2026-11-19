package p095f2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: f2.c */
/* loaded from: classes4.dex */
public class C8427c extends AbstractC8426b {

    /* renamed from: j */
    public final ScaleGestureDetector f16003j;

    public C8427c(Context context) {
        super(context);
        this.f16003j = new ScaleGestureDetector(context, new a());
    }

    @Override // p095f2.InterfaceC8428d
    /* renamed from: c */
    public boolean mo13766c() {
        return this.f16003j.isInProgress();
    }

    @Override // p095f2.AbstractC8426b, p095f2.AbstractC8425a, p095f2.InterfaceC8428d
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.f16003j.onTouchEvent(motionEvent);
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: f2.c$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C8427c.this.f15994a.mo6928b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
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
