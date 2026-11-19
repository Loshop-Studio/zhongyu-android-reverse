package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import p262n8.AbstractC10334h;

/* loaded from: classes5.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: n */
    public static final Rect f16071n = new Rect();

    /* renamed from: c */
    public ImageView f16072c;

    /* renamed from: d */
    public CropOverlayView f16073d;

    /* renamed from: e */
    public Bitmap f16074e;

    /* renamed from: f */
    public int f16075f;

    /* renamed from: g */
    public int f16076g;

    /* renamed from: h */
    public int f16077h;

    /* renamed from: i */
    public int f16078i;

    /* renamed from: j */
    public boolean f16079j;

    /* renamed from: k */
    public int f16080k;

    /* renamed from: l */
    public int f16081l;

    /* renamed from: m */
    public int f16082m;

    public CropImageView(Context context) {
        super(context);
        this.f16075f = 0;
        this.f16078i = 1;
        this.f16079j = false;
        this.f16080k = 1;
        this.f16081l = 1;
        this.f16082m = 0;
        m12706b(context);
    }

    /* renamed from: a */
    public static int m12705a(int i10, int i11, int i12) {
        return i10 == 1073741824 ? i11 : i10 == Integer.MIN_VALUE ? Math.min(i12, i11) : i12;
    }

    /* renamed from: b */
    public final void m12706b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.xui_layout_crop_image_view, (ViewGroup) this, true);
        this.f16072c = (ImageView) viewInflate.findViewById(R$id.iv_content);
        setImageResource(this.f16082m);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(R$id.crop_overlay_view);
        this.f16073d = cropOverlayView;
        cropOverlayView.m12720l(this.f16078i, this.f16079j, this.f16080k, this.f16081l);
    }

    /* renamed from: c */
    public void m12707c(int i10) {
        if (this.f16074e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        Bitmap bitmap = this.f16074e;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f16074e.getHeight(), matrix, true);
        this.f16074e = bitmapCreateBitmap;
        setImageBitmap(bitmapCreateBitmap);
        this.f16075f = (this.f16075f + i10) % 360;
    }

    public RectF getActualCropRect() {
        Rect rectM21584b = AbstractC10334h.m21584b(this.f16074e, this.f16072c);
        float width = this.f16074e.getWidth() / rectM21584b.width();
        float height = this.f16074e.getHeight() / rectM21584b.height();
        float fM12729k = Edge.LEFT.m12729k() - rectM21584b.left;
        float f10 = fM12729k * width;
        float fM12729k2 = (Edge.TOP.m12729k() - rectM21584b.top) * height;
        return new RectF(Math.max(0.0f, f10), Math.max(0.0f, fM12729k2), Math.min(this.f16074e.getWidth(), (Edge.m12726n() * width) + f10), Math.min(this.f16074e.getHeight(), (Edge.m12725m() * height) + fM12729k2));
    }

    public CropOverlayView getCropOverlayView() {
        return this.f16073d;
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap = this.f16074e;
        if (bitmap == null) {
            return null;
        }
        Rect rectM21584b = AbstractC10334h.m21584b(bitmap, this.f16072c);
        float width = this.f16074e.getWidth() / rectM21584b.width();
        float height = this.f16074e.getHeight() / rectM21584b.height();
        return Bitmap.createBitmap(this.f16074e, (int) ((Edge.LEFT.m12729k() - rectM21584b.left) * width), (int) ((Edge.TOP.m12729k() - rectM21584b.top) * height), (int) (Edge.m12726n() * width), (int) (Edge.m12725m() * height));
    }

    public int getImageResource() {
        return this.f16082m;
    }

    public ImageView getImageView() {
        return this.f16072c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f16076g <= 0 || this.f16077h <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f16076g;
        layoutParams.height = this.f16077h;
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int width;
        int height;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f16074e == null) {
            this.f16073d.setBitmapRect(f16071n);
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i10, i11);
        if (size2 == 0) {
            size2 = this.f16074e.getHeight();
        }
        double width2 = size < this.f16074e.getWidth() ? size / this.f16074e.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.f16074e.getHeight() ? size2 / this.f16074e.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.f16074e.getWidth();
            height = this.f16074e.getHeight();
        } else if (width2 <= height2) {
            height = (int) (this.f16074e.getHeight() * width2);
            width = size;
        } else {
            width = (int) (this.f16074e.getWidth() * height2);
            height = size2;
        }
        int iM12705a = m12705a(mode, size, width);
        int iM12705a2 = m12705a(mode2, size2, height);
        this.f16076g = iM12705a;
        this.f16077h = iM12705a2;
        this.f16073d.setBitmapRect(AbstractC10334h.m21583a(this.f16074e.getWidth(), this.f16074e.getHeight(), this.f16076g, this.f16077h));
        this.f16073d.m12719k(this.f16074e.getWidth(), this.f16074e.getHeight());
        setMeasuredDimension(this.f16076g, this.f16077h);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.f16074e != null) {
            int i10 = bundle.getInt("DEGREES_ROTATED");
            this.f16075f = i10;
            m12707c(i10);
            this.f16075f = i10;
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("DEGREES_ROTATED", this.f16075f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Bitmap bitmap = this.f16074e;
        if (bitmap == null) {
            this.f16073d.setBitmapRect(f16071n);
        } else {
            this.f16073d.setBitmapRect(AbstractC10334h.m21584b(bitmap, this));
        }
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f16073d.setCropOverlayCornerBitmap(bitmap);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f16073d.setFixedAspectRatio(z10);
    }

    public void setGuidelines(int i10) {
        this.f16073d.setGuidelines(i10);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f16074e = bitmap;
        this.f16072c.setImageBitmap(bitmap);
        CropOverlayView cropOverlayView = this.f16073d;
        if (cropOverlayView != null) {
            cropOverlayView.m12718j();
            this.f16073d.setVisibility(0);
        }
    }

    public void setImagePath(@NonNull String str) {
        setImageBitmap(BitmapFactory.decodeFile(str));
    }

    public void setImageResource(int i10) {
        if (i10 != 0) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), i10));
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16075f = 0;
        this.f16078i = 1;
        this.f16079j = false;
        this.f16080k = 1;
        this.f16081l = 1;
        this.f16082m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropImageView, 0, 0);
        try {
            this.f16078i = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_guidelines, 1);
            this.f16079j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CropImageView_civ_fixAspectRatio, false);
            this.f16080k = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioX, 1);
            this.f16081l = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioY, 1);
            this.f16082m = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CropImageView_civ_imageResource, 0);
            typedArrayObtainStyledAttributes.recycle();
            m12706b(context);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
