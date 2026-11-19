package p156s2;

import android.view.ScaleGestureDetector;

/* renamed from: s2.a */
/* loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC6552a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a */
    public final /* synthetic */ C6553b f10934a;

    public ScaleGestureDetectorOnScaleGestureListenerC6552a(C6553b c6553b) {
        this.f10934a = c6553b;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f10934a.f10935a.m6119k(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
