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
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC5908c;

/* loaded from: classes3.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC5907b {

    /* renamed from: a */
    public ViewOnTouchListenerC5908c f5066a;

    /* renamed from: b */
    public ImageView.ScaleType f5067b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m4713a() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c == null || viewOnTouchListenerC5908c.m4769u() == null) {
            this.f5066a = new ViewOnTouchListenerC5908c(this);
        }
        ImageView.ScaleType scaleType = this.f5067b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f5067b = null;
        }
    }

    /* renamed from: b */
    public void m4714b() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4764p();
            this.f5066a.m4734I();
        }
    }

    /* renamed from: c */
    public void m4715c(float f6, boolean z6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4752a0(f6, z6);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4765q();
        }
        return null;
    }

    public InterfaceC5907b getIPhotoViewImplementation() {
        return this.f5066a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4768t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4772x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4773y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4774z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4730C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4731D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            return viewOnTouchListenerC5908c.m4733F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m4713a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m4714b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4735J(z6);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i6, int i7, int i8, int i9) {
        boolean frame = super.setFrame(i6, i7, i8, i9);
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4758e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4758e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i6) {
        super.setImageResource(i6);
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4758e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4758e0();
        }
    }

    public void setMaximumScale(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4737M(f6);
        }
    }

    public void setMediumScale(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4738N(f6);
        }
    }

    public void setMinimumScale(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4739O(f6);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4740P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4741Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC5908c.e eVar) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4742R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC5908c.f fVar) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4743S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC5908c.g gVar) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4744T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC5908c.h hVar) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4745U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC5908c.i iVar) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4746V(iVar);
        }
    }

    public void setRotationBy(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4747W(f6);
        }
    }

    public void setRotationTo(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4748X(f6);
        }
    }

    public void setScale(float f6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4749Y(f6);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4754b0(scaleType);
        } else {
            this.f5067b = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4756c0(i6);
        }
    }

    public void setZoomable(boolean z6) {
        ViewOnTouchListenerC5908c viewOnTouchListenerC5908c = this.f5066a;
        if (viewOnTouchListenerC5908c != null) {
            viewOnTouchListenerC5908c.m4757d0(z6);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m4713a();
    }
}
