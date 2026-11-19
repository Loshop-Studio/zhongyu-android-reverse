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
import p148r2.AbstractC6449c;
import p148r2.GestureDetectorOnDoubleTapListenerC6447a;
import p148r2.InterfaceC6448b;
import p148r2.InterfaceC6452f;
import p148r2.InterfaceC6453g;
import p148r2.InterfaceC6454h;
import p148r2.InterfaceC6455i;
import p148r2.InterfaceC6456j;
import p148r2.ViewOnTouchListenerC6457k;

/* loaded from: classes3.dex */
public class PhotoView extends AppCompatImageView implements InterfaceC6448b {

    /* renamed from: a */
    public ViewOnTouchListenerC6457k f4438a;

    /* renamed from: b */
    public ImageView.ScaleType f4439b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null) {
            return null;
        }
        viewOnTouchListenerC6457k.m6113b();
        return viewOnTouchListenerC6457k.m6115e(viewOnTouchListenerC6457k.m6116f());
    }

    public InterfaceC6448b getIPhotoViewImplementation() {
        return this.f4438a;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.f10610l;
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.f10603e;
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.f10602d;
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.f10601c;
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.m6118j();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            return viewOnTouchListenerC6457k.f10623y;
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ImageView imageViewM6117g;
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null || (imageViewM6117g = viewOnTouchListenerC6457k.m6117g()) == null) {
            return null;
        }
        return imageViewM6117g.getDrawingCache();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null || viewOnTouchListenerC6457k.m6117g() == null) {
            this.f4438a = new ViewOnTouchListenerC6457k(this);
        }
        ImageView.ScaleType scaleType = this.f4439b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f4439b = null;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6114d();
            this.f4438a.m6120l();
        }
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z8) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10604f = z8;
        }
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i, i8, i9, i10);
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6123o();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6123o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6123o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.m6123o();
        }
    }

    public void setMaximumScale(float f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            ViewOnTouchListenerC6457k.m6109c(viewOnTouchListenerC6457k.f10601c, viewOnTouchListenerC6457k.f10602d, f);
            viewOnTouchListenerC6457k.f10603e = f;
        }
    }

    public void setMediumScale(float f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            ViewOnTouchListenerC6457k.m6109c(viewOnTouchListenerC6457k.f10601c, f, viewOnTouchListenerC6457k.f10603e);
            viewOnTouchListenerC6457k.f10602d = f;
        }
    }

    public void setMinimumScale(float f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            ViewOnTouchListenerC6457k.m6109c(f, viewOnTouchListenerC6457k.f10602d, viewOnTouchListenerC6457k.f10603e);
            viewOnTouchListenerC6457k.f10601c = f;
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            GestureDetector gestureDetector = viewOnTouchListenerC6457k.f10607i;
            if (onDoubleTapListener != null) {
                gestureDetector.setOnDoubleTapListener(onDoubleTapListener);
            } else {
                gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC6447a(viewOnTouchListenerC6457k));
            }
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10615q = onLongClickListener;
        }
    }

    public void setOnMatrixChangeListener(InterfaceC6452f interfaceC6452f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.getClass();
        }
    }

    public void setOnScaleChangeListener(InterfaceC6454h interfaceC6454h) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.getClass();
        }
    }

    public void setOnSingleFlingListener(InterfaceC6455i interfaceC6455i) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.getClass();
        }
    }

    public void setOnViewTapListener(InterfaceC6456j interfaceC6456j) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10614p = interfaceC6456j;
        }
    }

    public void setRotationBy(float f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10611m.postRotate(f % 360.0f);
            viewOnTouchListenerC6457k.m6112a();
        }
    }

    public void setRotationTo(float f) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10611m.setRotate(f % 360.0f);
            viewOnTouchListenerC6457k.m6112a();
        }
    }

    public void setScale(float f) {
        ImageView imageViewM6117g;
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null || (imageViewM6117g = viewOnTouchListenerC6457k.m6117g()) == null) {
            return;
        }
        viewOnTouchListenerC6457k.m6122n(f, imageViewM6117g.getRight() / 2.0f, imageViewM6117g.getBottom() / 2.0f, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null) {
            this.f4439b = scaleType;
            return;
        }
        viewOnTouchListenerC6457k.getClass();
        if (scaleType == null) {
            return;
        }
        if (AbstractC6449c.f10587a[scaleType.ordinal()] == 1) {
            throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
        }
        if (scaleType != viewOnTouchListenerC6457k.f10623y) {
            viewOnTouchListenerC6457k.f10623y = scaleType;
            viewOnTouchListenerC6457k.m6123o();
        }
    }

    public void setZoomTransitionDuration(int i) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.getClass();
            if (i < 0) {
                i = 200;
            }
            viewOnTouchListenerC6457k.f10600b = i;
        }
    }

    public void setZoomable(boolean z8) {
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k != null) {
            viewOnTouchListenerC6457k.f10622x = z8;
            viewOnTouchListenerC6457k.m6123o();
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f4438a;
        if (viewOnTouchListenerC6457k == null || viewOnTouchListenerC6457k.m6117g() == null) {
            this.f4438a = new ViewOnTouchListenerC6457k(this);
        }
        ImageView.ScaleType scaleType = this.f4439b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f4439b = null;
        }
    }

    public void setOnPhotoTapListener(InterfaceC6453g interfaceC6453g) {
    }
}
