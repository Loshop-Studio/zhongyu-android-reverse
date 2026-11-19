package com.xuexiang.xui.widget.imageview.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC3569c;

/* loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC3568b {

    /* renamed from: a */
    public ViewOnTouchListenerC3569c f3545a;

    /* renamed from: b */
    public ImageView.ScaleType f3546b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m4336a() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c == null || viewOnTouchListenerC3569c.m4392u() == null) {
            this.f3545a = new ViewOnTouchListenerC3569c(this);
        }
        ImageView.ScaleType scaleType = this.f3546b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f3546b = null;
        }
    }

    /* renamed from: b */
    public void m4337b() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4387p();
            this.f3545a.m4357I();
        }
    }

    /* renamed from: c */
    public void m4338c(float f4, boolean z3) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4375a0(f4, z3);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4388q();
        }
        return null;
    }

    public InterfaceC3568b getIPhotoViewImplementation() {
        return this.f3545a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4391t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4395x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4396y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4397z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4353C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4354D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            return viewOnTouchListenerC3569c.m4356F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m4336a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m4337b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z3) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4358J(z3);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4381e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4381e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        super.setImageResource(i4);
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4381e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4381e0();
        }
    }

    public void setMaximumScale(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4360M(f4);
        }
    }

    public void setMediumScale(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4361N(f4);
        }
    }

    public void setMinimumScale(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4362O(f4);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4363P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4364Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC3569c.e eVar) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4365R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC3569c.f fVar) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4366S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC3569c.g gVar) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4367T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC3569c.h hVar) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4368U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC3569c.i iVar) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4369V(iVar);
        }
    }

    public void setRotationBy(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4370W(f4);
        }
    }

    public void setRotationTo(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4371X(f4);
        }
    }

    public void setScale(float f4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4372Y(f4);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4377b0(scaleType);
        } else {
            this.f3546b = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i4) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4379c0(i4);
        }
    }

    public void setZoomable(boolean z3) {
        ViewOnTouchListenerC3569c viewOnTouchListenerC3569c = this.f3545a;
        if (viewOnTouchListenerC3569c != null) {
            viewOnTouchListenerC3569c.m4380d0(z3);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m4336a();
    }
}
