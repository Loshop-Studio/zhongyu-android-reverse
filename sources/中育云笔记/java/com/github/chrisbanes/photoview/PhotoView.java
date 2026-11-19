package com.github.chrisbanes.photoview;

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
import p302q4.InterfaceC10728d;
import p302q4.InterfaceC10729e;
import p302q4.InterfaceC10730f;
import p302q4.InterfaceC10731g;
import p302q4.InterfaceC10732h;
import p302q4.InterfaceC10733i;
import p302q4.InterfaceC10734j;
import p302q4.ViewOnTouchListenerC10735k;

/* loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: c */
    public ViewOnTouchListenerC10735k f10868c;

    /* renamed from: d */
    public ImageView.ScaleType f10869d;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m7910a() {
        this.f10868c = new ViewOnTouchListenerC10735k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f10869d;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f10869d = null;
        }
    }

    public ViewOnTouchListenerC10735k getAttacher() {
        return this.f10868c;
    }

    public RectF getDisplayRect() {
        return this.f10868c.m22751B();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f10868c.m22754E();
    }

    public float getMaximumScale() {
        return this.f10868c.m22757H();
    }

    public float getMediumScale() {
        return this.f10868c.m22758I();
    }

    public float getMinimumScale() {
        return this.f10868c.m22759J();
    }

    public float getScale() {
        return this.f10868c.m22760K();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f10868c.m22761L();
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f10868c.m22764O(z10);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f10868c.m22787l0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = this.f10868c;
        if (viewOnTouchListenerC10735k != null) {
            viewOnTouchListenerC10735k.m22787l0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = this.f10868c;
        if (viewOnTouchListenerC10735k != null) {
            viewOnTouchListenerC10735k.m22787l0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = this.f10868c;
        if (viewOnTouchListenerC10735k != null) {
            viewOnTouchListenerC10735k.m22787l0();
        }
    }

    public void setMaximumScale(float f10) {
        this.f10868c.m22766Q(f10);
    }

    public void setMediumScale(float f10) {
        this.f10868c.m22767R(f10);
    }

    public void setMinimumScale(float f10) {
        this.f10868c.m22768S(f10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10868c.m22769T(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f10868c.m22770U(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10868c.m22771V(onLongClickListener);
    }

    public void setOnMatrixChangeListener(InterfaceC10728d interfaceC10728d) {
        this.f10868c.m22772W(interfaceC10728d);
    }

    public void setOnOutsidePhotoTapListener(InterfaceC10729e interfaceC10729e) {
        this.f10868c.m22773X(interfaceC10729e);
    }

    public void setOnPhotoTapListener(InterfaceC10730f interfaceC10730f) {
        this.f10868c.m22774Y(interfaceC10730f);
    }

    public void setOnScaleChangeListener(InterfaceC10731g interfaceC10731g) {
        this.f10868c.m22775Z(interfaceC10731g);
    }

    public void setOnSingleFlingListener(InterfaceC10732h interfaceC10732h) {
        this.f10868c.m22776a0(interfaceC10732h);
    }

    public void setOnViewDragListener(InterfaceC10733i interfaceC10733i) {
        this.f10868c.m22777b0(interfaceC10733i);
    }

    public void setOnViewTapListener(InterfaceC10734j interfaceC10734j) {
        this.f10868c.m22778c0(interfaceC10734j);
    }

    public void setRotationBy(float f10) {
        this.f10868c.m22779d0(f10);
    }

    public void setRotationTo(float f10) {
        this.f10868c.m22780e0(f10);
    }

    public void setScale(float f10) {
        this.f10868c.m22781f0(f10);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC10735k viewOnTouchListenerC10735k = this.f10868c;
        if (viewOnTouchListenerC10735k == null) {
            this.f10869d = scaleType;
        } else {
            viewOnTouchListenerC10735k.m22784i0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f10868c.m22785j0(i10);
    }

    public void setZoomable(boolean z10) {
        this.f10868c.m22786k0(z10);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m7910a();
    }
}
