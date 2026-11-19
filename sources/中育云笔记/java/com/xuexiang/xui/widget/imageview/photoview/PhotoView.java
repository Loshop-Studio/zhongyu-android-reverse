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
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC8141c;

/* loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC8140b {

    /* renamed from: c */
    public ViewOnTouchListenerC8141c f16205c;

    /* renamed from: d */
    public ImageView.ScaleType f16206d;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m12781a() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c == null || viewOnTouchListenerC8141c.m12837u() == null) {
            this.f16205c = new ViewOnTouchListenerC8141c(this);
        }
        ImageView.ScaleType scaleType = this.f16206d;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f16206d = null;
        }
    }

    /* renamed from: b */
    public void m12782b() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12832p();
            this.f16205c.m12802I();
        }
    }

    /* renamed from: c */
    public void m12783c(float f10, boolean z10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12820a0(f10, z10);
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12833q();
        }
        return null;
    }

    public InterfaceC8140b getIPhotoViewImplementation() {
        return this.f16205c;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12836t();
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12840x();
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12841y();
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12842z();
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12798C();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12799D();
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            return viewOnTouchListenerC8141c.m12801F();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m12781a();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        m12782b();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12803J(z10);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12826e0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12826e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12826e0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12826e0();
        }
    }

    public void setMaximumScale(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12805M(f10);
        }
    }

    public void setMediumScale(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12806N(f10);
        }
    }

    public void setMinimumScale(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12807O(f10);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12808P(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12809Q(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC8141c.e eVar) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12810R(eVar);
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC8141c.f fVar) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12811S(fVar);
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC8141c.g gVar) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12812T(gVar);
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC8141c.h hVar) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12813U(hVar);
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC8141c.i iVar) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12814V(iVar);
        }
    }

    public void setRotationBy(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12815W(f10);
        }
    }

    public void setRotationTo(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12816X(f10);
        }
    }

    public void setScale(float f10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12817Y(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12822b0(scaleType);
        } else {
            this.f16206d = scaleType;
        }
    }

    public void setZoomTransitionDuration(int i10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12824c0(i10);
        }
    }

    public void setZoomable(boolean z10) {
        ViewOnTouchListenerC8141c viewOnTouchListenerC8141c = this.f16205c;
        if (viewOnTouchListenerC8141c != null) {
            viewOnTouchListenerC8141c.m12825d0(z10);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m12781a();
    }
}
