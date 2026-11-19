package p139k1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k1.g */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC7861g extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    public final ImageView f13628a;

    /* renamed from: b */
    public final CropOverlayView f13629b;

    /* renamed from: c */
    public final float[] f13630c;

    /* renamed from: d */
    public final float[] f13631d;

    /* renamed from: e */
    public final RectF f13632e;

    /* renamed from: f */
    public final RectF f13633f;

    /* renamed from: g */
    public final float[] f13634g;

    /* renamed from: h */
    public final float[] f13635h;

    public AnimationAnimationListenerC7861g(ImageView imageView, CropOverlayView cropOverlayView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView, "cropOverlayView");
        this.f13628a = imageView;
        this.f13629b = cropOverlayView;
        this.f13630c = new float[8];
        this.f13631d = new float[8];
        this.f13632e = new RectF();
        this.f13633f = new RectF();
        this.f13634g = new float[9];
        this.f13635h = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f13632e;
        float f11 = rectF2.left;
        RectF rectF3 = this.f13633f;
        rectF.left = f11 + ((rectF3.left - f11) * f10);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * f10);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * f10);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * f10);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            float f15 = this.f13630c[i10];
            fArr[i10] = f15 + ((this.f13631d[i10] - f15) * f10);
        }
        CropOverlayView cropOverlayView = this.f13629b;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.m3884u(fArr, this.f13628a.getWidth(), this.f13628a.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i11 = 0; i11 < 9; i11++) {
            float f16 = this.f13634g[i11];
            fArr2[i11] = f16 + ((this.f13635h[i11] - f16) * f10);
        }
        ImageView imageView = this.f13628a;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    /* renamed from: b */
    public final void m13379b(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f13631d, 0, 8);
        this.f13633f.set(this.f13629b.getCropWindowRect());
        imageMatrix.getValues(this.f13635h);
    }

    /* renamed from: c */
    public final void m13380c(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f13630c, 0, 8);
        this.f13632e.set(this.f13629b.getCropWindowRect());
        imageMatrix.getValues(this.f13634g);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f13628a.clearAnimation();
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
