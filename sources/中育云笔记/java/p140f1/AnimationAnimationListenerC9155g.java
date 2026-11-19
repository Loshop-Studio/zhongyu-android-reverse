package p140f1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: f1.g */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC9155g extends Animation implements Animation.AnimationListener {

    /* renamed from: c */
    public final ImageView f21394c;

    /* renamed from: d */
    public final CropOverlayView f21395d;

    /* renamed from: e */
    public final float[] f21396e;

    /* renamed from: f */
    public final float[] f21397f;

    /* renamed from: g */
    public final RectF f21398g;

    /* renamed from: h */
    public final RectF f21399h;

    /* renamed from: i */
    public final float[] f21400i;

    /* renamed from: j */
    public final float[] f21401j;

    public AnimationAnimationListenerC9155g(ImageView imageView, CropOverlayView cropOverlayView) {
        AbstractC9979u.m20294g(imageView, "imageView");
        AbstractC9979u.m20294g(cropOverlayView, "cropOverlayView");
        this.f21394c = imageView;
        this.f21395d = cropOverlayView;
        this.f21396e = new float[8];
        this.f21397f = new float[8];
        this.f21398g = new RectF();
        this.f21399h = new RectF();
        this.f21400i = new float[9];
        this.f21401j = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        AbstractC9979u.m20294g(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f21398g;
        float f11 = rectF2.left;
        RectF rectF3 = this.f21399h;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f21396e[i10];
            fArr[i10] = f15 + ((this.f21397f[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f21395d;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.m4530u(fArr, this.f21394c.getWidth(), this.f21394c.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f21400i[i11];
            fArr2[i11] = f16 + ((this.f21401j[i11] - f16) * f10);
        }
        ImageView imageView = this.f21394c;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    /* renamed from: b */
    public final void m18046b(float[] boundPoints, Matrix imageMatrix) {
        AbstractC9979u.m20294g(boundPoints, "boundPoints");
        AbstractC9979u.m20294g(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f21397f, 0, 8);
        this.f21399h.set(this.f21395d.getCropWindowRect());
        imageMatrix.getValues(this.f21401j);
    }

    /* renamed from: d */
    public final void m18047d(float[] boundPoints, Matrix imageMatrix) {
        AbstractC9979u.m20294g(boundPoints, "boundPoints");
        AbstractC9979u.m20294g(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f21396e, 0, 8);
        this.f21398g.set(this.f21395d.getCropWindowRect());
        imageMatrix.getValues(this.f21400i);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        AbstractC9979u.m20294g(animation, "animation");
        this.f21394c.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        AbstractC9979u.m20294g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        AbstractC9979u.m20294g(animation, "animation");
    }
}
