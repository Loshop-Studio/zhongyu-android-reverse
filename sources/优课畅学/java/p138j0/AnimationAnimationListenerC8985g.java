package p138j0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: j0.g */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC8985g extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    public final ImageView f17177a;

    /* renamed from: b */
    public final CropOverlayView f17178b;

    /* renamed from: c */
    public final float[] f17179c;

    /* renamed from: d */
    public final float[] f17180d;

    /* renamed from: e */
    public final RectF f17181e;

    /* renamed from: f */
    public final RectF f17182f;

    /* renamed from: g */
    public final float[] f17183g;

    /* renamed from: h */
    public final float[] f17184h;

    public AnimationAnimationListenerC8985g(ImageView imageView, CropOverlayView cropOverlayView) {
        AbstractC9133u.m16133g(imageView, "imageView");
        AbstractC9133u.m16133g(cropOverlayView, "cropOverlayView");
        this.f17177a = imageView;
        this.f17178b = cropOverlayView;
        this.f17179c = new float[8];
        this.f17180d = new float[8];
        this.f17181e = new RectF();
        this.f17182f = new RectF();
        this.f17183g = new float[9];
        this.f17184h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        AbstractC9133u.m16133g(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f17181e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f17182f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f17179c[i10];
            fArr[i10] = f15 + ((this.f17180d[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f17178b;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.m3328u(fArr, this.f17177a.getWidth(), this.f17177a.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f17183g[i11];
            fArr2[i11] = f16 + ((this.f17184h[i11] - f16) * f10);
        }
        ImageView imageView = this.f17177a;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    /* renamed from: c */
    public final void m15637c(float[] boundPoints, Matrix imageMatrix) {
        AbstractC9133u.m16133g(boundPoints, "boundPoints");
        AbstractC9133u.m16133g(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f17180d, 0, 8);
        this.f17182f.set(this.f17178b.getCropWindowRect());
        imageMatrix.getValues(this.f17184h);
    }

    /* renamed from: e */
    public final void m15638e(float[] boundPoints, Matrix imageMatrix) {
        AbstractC9133u.m16133g(boundPoints, "boundPoints");
        AbstractC9133u.m16133g(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f17179c, 0, 8);
        this.f17181e.set(this.f17178b.getCropWindowRect());
        imageMatrix.getValues(this.f17183g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
        this.f17177a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AbstractC9133u.m16133g(animation, "animation");
    }
}
