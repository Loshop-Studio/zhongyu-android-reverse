package com.luck.picture.lib.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p403x6.InterfaceC11801d;
import p403x6.InterfaceC11802e;
import p403x6.InterfaceC11803f;
import p403x6.InterfaceC11804g;
import p403x6.InterfaceC11805h;
import p403x6.InterfaceC11806i;
import p403x6.InterfaceC11807j;
import p403x6.ViewOnTouchListenerC11808k;

/* loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: c */
    public ViewOnTouchListenerC11808k f12472c;

    /* renamed from: d */
    public ImageView.ScaleType f12473d;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m9469a() {
        this.f12472c = new ViewOnTouchListenerC11808k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f12473d;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f12473d = null;
        }
    }

    public ViewOnTouchListenerC11808k getAttacher() {
        return this.f12472c;
    }

    public RectF getDisplayRect() {
        return this.f12472c.m26083B();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f12472c.m26086E();
    }

    public float getMaximumScale() {
        return this.f12472c.m26089H();
    }

    public float getMediumScale() {
        return this.f12472c.m26090I();
    }

    public float getMinimumScale() {
        return this.f12472c.m26091J();
    }

    public float getScale() {
        return this.f12472c.m26092K();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f12472c.m26093L();
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f12472c.m26096O(z10);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f12472c.m26119l0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = this.f12472c;
        if (viewOnTouchListenerC11808k != null) {
            viewOnTouchListenerC11808k.m26119l0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = this.f12472c;
        if (viewOnTouchListenerC11808k != null) {
            viewOnTouchListenerC11808k.m26119l0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = this.f12472c;
        if (viewOnTouchListenerC11808k != null) {
            viewOnTouchListenerC11808k.m26119l0();
        }
    }

    public void setMaximumScale(float f10) {
        this.f12472c.m26098Q(f10);
    }

    public void setMediumScale(float f10) {
        this.f12472c.m26099R(f10);
    }

    public void setMinimumScale(float f10) {
        this.f12472c.m26100S(f10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12472c.m26101T(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f12472c.m26102U(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12472c.m26103V(onLongClickListener);
    }

    public void setOnMatrixChangeListener(InterfaceC11801d interfaceC11801d) {
        this.f12472c.m26104W(interfaceC11801d);
    }

    public void setOnOutsidePhotoTapListener(InterfaceC11802e interfaceC11802e) {
        this.f12472c.m26105X(interfaceC11802e);
    }

    public void setOnPhotoTapListener(InterfaceC11803f interfaceC11803f) {
        this.f12472c.m26106Y(interfaceC11803f);
    }

    public void setOnScaleChangeListener(InterfaceC11804g interfaceC11804g) {
        this.f12472c.m26107Z(interfaceC11804g);
    }

    public void setOnSingleFlingListener(InterfaceC11805h interfaceC11805h) {
        this.f12472c.m26108a0(interfaceC11805h);
    }

    public void setOnViewDragListener(InterfaceC11806i interfaceC11806i) {
        this.f12472c.m26109b0(interfaceC11806i);
    }

    public void setOnViewTapListener(InterfaceC11807j interfaceC11807j) {
        this.f12472c.m26110c0(interfaceC11807j);
    }

    public void setRotationBy(float f10) {
        this.f12472c.m26111d0(f10);
    }

    public void setRotationTo(float f10) {
        this.f12472c.m26112e0(f10);
    }

    public void setScale(float f10) {
        this.f12472c.m26113f0(f10);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC11808k viewOnTouchListenerC11808k = this.f12472c;
        if (viewOnTouchListenerC11808k == null) {
            this.f12473d = scaleType;
        } else {
            viewOnTouchListenerC11808k.m26116i0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f12472c.m26117j0(i10);
    }

    public void setZoomable(boolean z10) {
        this.f12472c.m26118k0(z10);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m9469a();
    }
}
