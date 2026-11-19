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
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6529c;

/* loaded from: classes4.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC6528b {

    /* renamed from: a */
    public ViewOnTouchListenerC6529c f6341a;

    /* renamed from: b */
    public ImageView.ScaleType f6342b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m5694a() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c == null || viewOnTouchListenerC6529c.m5750u() == null) {
            this.f6341a = new ViewOnTouchListenerC6529c(this);
        }
        ImageView.ScaleType scaleType = this.f6342b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f6342b = null;
        }
    }

    /* renamed from: b */
    public void m5695b() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5745p();
            this.f6341a.m5715I();
        }
    }

    /* renamed from: c */
    public void m5696c(float f10, boolean z9) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5733a0(f10, z9);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5746q();
        }
        return null;
    }

    public InterfaceC6528b getIPhotoViewImplementation() {
        return this.f6341a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5749t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5753x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5754y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5755z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5711C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5712D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            return viewOnTouchListenerC6529c.m5714F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m5694a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m5695b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z9) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5716J(z9);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5739e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5739e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5739e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5739e0();
        }
    }

    public void setMaximumScale(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5718M(f10);
        }
    }

    public void setMediumScale(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5719N(f10);
        }
    }

    public void setMinimumScale(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5720O(f10);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5721P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5722Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC6529c.e eVar) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5723R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC6529c.f fVar) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5724S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC6529c.g gVar) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5725T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC6529c.h hVar) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5726U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC6529c.i iVar) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5727V(iVar);
        }
    }

    public void setRotationBy(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5728W(f10);
        }
    }

    public void setRotationTo(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5729X(f10);
        }
    }

    public void setScale(float f10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5730Y(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5735b0(scaleType);
        } else {
            this.f6342b = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i10) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5737c0(i10);
        }
    }

    public void setZoomable(boolean z9) {
        ViewOnTouchListenerC6529c viewOnTouchListenerC6529c = this.f6341a;
        if (viewOnTouchListenerC6529c != null) {
            viewOnTouchListenerC6529c.m5738d0(z9);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m5694a();
    }
}
