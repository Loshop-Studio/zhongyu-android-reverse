package p113g1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g1.g */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC7994g extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    public final ImageView f13471a;

    /* renamed from: b */
    public final CropOverlayView f13472b;

    /* renamed from: c */
    public final float[] f13473c;

    /* renamed from: d */
    public final float[] f13474d;

    /* renamed from: e */
    public final RectF f13475e;

    /* renamed from: f */
    public final RectF f13476f;

    /* renamed from: g */
    public final float[] f13477g;

    /* renamed from: h */
    public final float[] f13478h;

    public AnimationAnimationListenerC7994g(ImageView imageView, CropOverlayView cropOverlayView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView, "cropOverlayView");
        this.f13471a = imageView;
        this.f13472b = cropOverlayView;
        this.f13473c = new float[8];
        this.f13474d = new float[8];
        this.f13475e = new RectF();
        this.f13476f = new RectF();
        this.f13477g = new float[9];
        this.f13478h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t9) {
        Intrinsics.checkNotNullParameter(t9, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f13475e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f13476f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i9 = 0; i9 < 8; i9++) {
            float f15 = this.f13473c[i9];
            fArr[i9] = f15 + ((this.f13474d[i9] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f13472b;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.m3510u(fArr, this.f13471a.getWidth(), this.f13471a.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f16 = this.f13477g[i10];
            fArr2[i10] = f16 + ((this.f13478h[i10] - f16) * f10);
        }
        ImageView imageView = this.f13471a;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    /* renamed from: b */
    public final void m12549b(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f13474d, 0, 8);
        this.f13476f.set(this.f13472b.getCropWindowRect());
        imageMatrix.getValues(this.f13478h);
    }

    /* renamed from: d */
    public final void m12550d(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f13473c, 0, 8);
        this.f13475e.set(this.f13472b.getCropWindowRect());
        imageMatrix.getValues(this.f13477g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f13471a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
