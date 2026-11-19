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
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c;

/* loaded from: classes4.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC6934b {

    /* renamed from: a */
    public ViewOnTouchListenerC6935c f7758a;

    /* renamed from: b */
    public ImageView.ScaleType f7759b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m6888a() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c == null || viewOnTouchListenerC6935c.m6944u() == null) {
            this.f7758a = new ViewOnTouchListenerC6935c(this);
        }
        ImageView.ScaleType scaleType = this.f7759b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f7759b = null;
        }
    }

    /* renamed from: b */
    public void m6889b() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6939p();
            this.f7758a.m6909I();
        }
    }

    /* renamed from: c */
    public void m6890c(float f10, boolean z10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6927a0(f10, z10);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6940q();
        }
        return null;
    }

    public InterfaceC6934b getIPhotoViewImplementation() {
        return this.f7758a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6943t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6947x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6948y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6949z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6905C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6906D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            return viewOnTouchListenerC6935c.m6908F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m6888a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m6889b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6910J(z10);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6933e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6933e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6933e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6933e0();
        }
    }

    public void setMaximumScale(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6912M(f10);
        }
    }

    public void setMediumScale(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6913N(f10);
        }
    }

    public void setMinimumScale(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6914O(f10);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6915P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6916Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC6935c.e eVar) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6917R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC6935c.f fVar) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6918S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC6935c.g gVar) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6919T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC6935c.h hVar) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6920U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC6935c.i iVar) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6921V(iVar);
        }
    }

    public void setRotationBy(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6922W(f10);
        }
    }

    public void setRotationTo(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6923X(f10);
        }
    }

    public void setScale(float f10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6924Y(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6929b0(scaleType);
        } else {
            this.f7759b = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6931c0(i10);
        }
    }

    public void setZoomable(boolean z10) {
        ViewOnTouchListenerC6935c viewOnTouchListenerC6935c = this.f7758a;
        if (viewOnTouchListenerC6935c != null) {
            viewOnTouchListenerC6935c.m6932d0(z10);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m6888a();
    }
}
