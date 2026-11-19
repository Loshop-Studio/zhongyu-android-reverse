package p148r2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.xuexiang.xui.widget.imageview.preview.p034ui.BasePhotoFragment;
import com.xuexiang.xui.widget.imageview.preview.p034ui.PreviewActivity;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import p189w2.C6702a;

/* renamed from: r2.a */
/* loaded from: classes3.dex */
public final class GestureDetectorOnDoubleTapListenerC6447a implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public final ViewOnTouchListenerC6457k f10586a;

    public GestureDetectorOnDoubleTapListenerC6447a(ViewOnTouchListenerC6457k viewOnTouchListenerC6457k) {
        this.f10586a = viewOnTouchListenerC6457k;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: ArrayIndexOutOfBoundsException -> 0x0032, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0032, blocks: (B:7:0x0007, B:9:0x001b, B:12:0x0023, B:14:0x0029, B:15:0x002d), top: B:19:0x0007 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTap(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2.k r0 = r6.f10586a
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            r1 = 1
            float r0 = r0.m6118j()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            float r2 = r7.getX()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            float r7 = r7.getY()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            r2.k r3 = r6.f10586a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            float r4 = r3.f10602d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L1f
            r3.m6122n(r4, r2, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            goto L32
        L1f:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L2d
            float r4 = r3.f10603e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r3.m6122n(r4, r2, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            goto L32
        L2d:
            float r0 = r3.f10601c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
            r3.m6122n(r0, r2, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L32
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148r2.GestureDetectorOnDoubleTapListenerC6447a.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ImageView imageViewM6117g;
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f10586a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6117g();
            this.f10586a.getClass();
            InterfaceC6456j interfaceC6456j = this.f10586a.f10614p;
            if (interfaceC6456j != null) {
                motionEvent.getX();
                motionEvent.getY();
                BasePhotoFragment basePhotoFragment = ((C6702a) interfaceC6456j).f11314a;
                SmoothImageView smoothImageView = basePhotoFragment.f4441a;
                if (smoothImageView.getScale() != 1.0f) {
                    ViewOnTouchListenerC6457k viewOnTouchListenerC6457k2 = smoothImageView.f4438a;
                    if (viewOnTouchListenerC6457k2 != null && (imageViewM6117g = viewOnTouchListenerC6457k2.m6117g()) != null) {
                        viewOnTouchListenerC6457k2.m6122n(1.0f, imageViewM6117g.getRight() / 2.0f, imageViewM6117g.getBottom() / 2.0f, true);
                    }
                    return false;
                }
                PreviewActivity previewActivity = (PreviewActivity) basePhotoFragment.getActivity();
                if (previewActivity != null) {
                    previewActivity.m3507q();
                }
            }
        }
        return false;
    }
}
