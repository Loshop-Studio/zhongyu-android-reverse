package p070b.p113c.p114a.p116e.p128f.p130b;

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
import java.util.Objects;
import p070b.p113c.p114a.p116e.p128f.p130b.ViewOnTouchListenerC0821e;

/* renamed from: b.c.a.e.f.b.c */
/* loaded from: classes.dex */
public class C0819c extends AppCompatImageView implements InterfaceC0818b {

    /* renamed from: d */
    public ViewOnTouchListenerC0821e f4550d;

    /* renamed from: e */
    public ImageView.ScaleType f4551e;

    public C0819c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        m2519c();
    }

    /* renamed from: c */
    public void m2519c() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e == null || viewOnTouchListenerC0821e.m2529i() == null) {
            this.f4550d = new ViewOnTouchListenerC0821e(this);
        }
        ImageView.ScaleType scaleType = this.f4551e;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f4551e = null;
        }
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.m2526f();
        }
        return null;
    }

    public InterfaceC0818b getIPhotoViewImplementation() {
        return this.f4550d;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.f4570m;
        }
        return null;
    }

    public float getMaximumScale() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.f4563f;
        }
        return 3.0f;
    }

    public float getMediumScale() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.f4562e;
        }
        return 1.75f;
    }

    public float getMinimumScale() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.f4561d;
        }
        return 1.0f;
    }

    public float getScale() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.m2532l();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            return viewOnTouchListenerC0821e.f4558D;
        }
        return null;
    }

    public Bitmap getVisibleRectangleBitmap() {
        ImageView imageViewM2529i;
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e == null || (imageViewM2529i = viewOnTouchListenerC0821e.m2529i()) == null) {
            return null;
        }
        return imageViewM2529i.getDrawingCache();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m2519c();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2525e();
            this.f4550d.m2534n();
        }
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4564g = z;
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2538s();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2538s();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2538s();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2538s();
        }
    }

    public void setMaximumScale(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            ViewOnTouchListenerC0821e.m2520d(viewOnTouchListenerC0821e.f4561d, viewOnTouchListenerC0821e.f4562e, f2);
            viewOnTouchListenerC0821e.f4563f = f2;
        }
    }

    public void setMediumScale(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            ViewOnTouchListenerC0821e.m2520d(viewOnTouchListenerC0821e.f4561d, f2, viewOnTouchListenerC0821e.f4563f);
            viewOnTouchListenerC0821e.f4562e = f2;
        }
    }

    public void setMinimumScale(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            ViewOnTouchListenerC0821e.m2520d(f2, viewOnTouchListenerC0821e.f4562e, viewOnTouchListenerC0821e.f4563f);
            viewOnTouchListenerC0821e.f4561d = f2;
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            if (onDoubleTapListener != null) {
                viewOnTouchListenerC0821e.f4567j.setOnDoubleTapListener(onDoubleTapListener);
            } else {
                viewOnTouchListenerC0821e.f4567j.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC0817a(viewOnTouchListenerC0821e));
            }
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4577t = onLongClickListener;
        }
    }

    public void setOnMatrixChangeListener(ViewOnTouchListenerC0821e.d dVar) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4574q = dVar;
        }
    }

    public void setOnPhotoTapListener(ViewOnTouchListenerC0821e.e eVar) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4575r = eVar;
        }
    }

    public void setOnScaleChangeListener(ViewOnTouchListenerC0821e.f fVar) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4578u = fVar;
        }
    }

    public void setOnSingleFlingListener(ViewOnTouchListenerC0821e.g gVar) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4579v = gVar;
        }
    }

    public void setOnViewTapListener(ViewOnTouchListenerC0821e.h hVar) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4576s = hVar;
        }
    }

    public void setRotationBy(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4571n.postRotate(f2 % 360.0f);
            viewOnTouchListenerC0821e.m2523b();
        }
    }

    public void setRotationTo(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4571n.setRotate(f2 % 360.0f);
            viewOnTouchListenerC0821e.m2523b();
        }
    }

    public void setScale(float f2) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.m2537r(f2, false);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e == null) {
            this.f4551e = scaleType;
            return;
        }
        Objects.requireNonNull(viewOnTouchListenerC0821e);
        if (scaleType == null) {
            z = false;
        } else {
            if (ViewOnTouchListenerC0821e.a.f4584a[scaleType.ordinal()] == 1) {
                throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
            }
            z = true;
        }
        if (!z || scaleType == viewOnTouchListenerC0821e.f4558D) {
            return;
        }
        viewOnTouchListenerC0821e.f4558D = scaleType;
        viewOnTouchListenerC0821e.m2538s();
    }

    public void setZoomTransitionDuration(int i) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            if (i < 0) {
                i = 200;
            }
            viewOnTouchListenerC0821e.f4560c = i;
        }
    }

    public void setZoomable(boolean z) {
        ViewOnTouchListenerC0821e viewOnTouchListenerC0821e = this.f4550d;
        if (viewOnTouchListenerC0821e != null) {
            viewOnTouchListenerC0821e.f4557C = z;
            viewOnTouchListenerC0821e.m2538s();
        }
    }
}
