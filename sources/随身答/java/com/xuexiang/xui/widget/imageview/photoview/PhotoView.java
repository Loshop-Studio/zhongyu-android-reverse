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
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c;

/* loaded from: classes4.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC6848b {

    /* renamed from: a */
    public ViewOnTouchListenerC6849c f7599a;

    /* renamed from: b */
    public ImageView.ScaleType f7600b;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m6800a() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c == null || viewOnTouchListenerC6849c.m6856u() == null) {
            this.f7599a = new ViewOnTouchListenerC6849c(this);
        }
        ImageView.ScaleType scaleType = this.f7600b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f7600b = null;
        }
    }

    /* renamed from: b */
    public void m6801b() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6851p();
            this.f7599a.m6821I();
        }
    }

    /* renamed from: c */
    public void m6802c(float f10, boolean z9) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6839a0(f10, z9);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6852q();
        }
        return null;
    }

    public InterfaceC6848b getIPhotoViewImplementation() {
        return this.f7599a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6855t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6859x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6860y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6861z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6817C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6818D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            return viewOnTouchListenerC6849c.m6820F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m6800a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m6801b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z9) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6822J(z9);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i9, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i9, i10, i11, i12);
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6845e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6845e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i9) {
        super.setImageResource(i9);
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6845e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6845e0();
        }
    }

    public void setMaximumScale(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6824M(f10);
        }
    }

    public void setMediumScale(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6825N(f10);
        }
    }

    public void setMinimumScale(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6826O(f10);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6827P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6828Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC6849c.e eVar) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6829R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC6849c.f fVar) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6830S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC6849c.g gVar) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6831T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC6849c.h hVar) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6832U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC6849c.i iVar) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6833V(iVar);
        }
    }

    public void setRotationBy(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6834W(f10);
        }
    }

    public void setRotationTo(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6835X(f10);
        }
    }

    public void setScale(float f10) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6836Y(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6841b0(scaleType);
        } else {
            this.f7600b = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i9) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6843c0(i9);
        }
    }

    public void setZoomable(boolean z9) {
        ViewOnTouchListenerC6849c viewOnTouchListenerC6849c = this.f7599a;
        if (viewOnTouchListenerC6849c != null) {
            viewOnTouchListenerC6849c.m6844d0(z9);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m6800a();
    }
}
