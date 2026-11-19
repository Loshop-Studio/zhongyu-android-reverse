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
import p204y1.AbstractC6768a;

/* loaded from: classes3.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: l */
    public static final Rect f4350l = new Rect();

    /* renamed from: a */
    public ImageView f4351a;

    /* renamed from: b */
    public CropOverlayView f4352b;

    /* renamed from: c */
    public Bitmap f4353c;

    /* renamed from: d */
    public int f4354d;

    /* renamed from: e */
    public int f4355e;

    /* renamed from: f */
    public int f4356f;

    /* renamed from: g */
    public final int f4357g;

    /* renamed from: h */
    public final boolean f4358h;

    /* renamed from: i */
    public final int f4359i;

    /* renamed from: j */
    public final int f4360j;

    /* renamed from: k */
    public final int f4361k;

    public CropImageView(Context context) {
        super(context);
        this.f4354d = 0;
        this.f4357g = 1;
        this.f4358h = false;
        this.f4359i = 1;
        this.f4360j = 1;
        this.f4361k = 0;
        m3493a(context);
    }

    /* renamed from: a */
    public final void m3493a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.xui_layout_crop_image_view, (ViewGroup) this, true);
        this.f4351a = (ImageView) viewInflate.findViewById(R$id.iv_content);
        setImageResource(this.f4361k);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(R$id.crop_overlay_view);
        this.f4352b = cropOverlayView;
        cropOverlayView.getClass();
        int i = this.f4357g;
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Guideline value must be set between 0 and 2. See documentation.");
        }
        cropOverlayView.f4377n = i;
        cropOverlayView.f4373j = this.f4358h;
        int i8 = this.f4359i;
        if (i8 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        cropOverlayView.f4374k = i8;
        float f = i8;
        cropOverlayView.f4376m = f / cropOverlayView.f4375l;
        int i9 = this.f4360j;
        if (i9 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        cropOverlayView.f4375l = i9;
        cropOverlayView.f4376m = f / i9;
    }

    public RectF getActualCropRect() {
        Bitmap bitmap = this.f4353c;
        ImageView imageView = this.f4351a;
        Rect rectM6447l = AbstractC6768a.m6447l(bitmap.getWidth(), bitmap.getHeight(), imageView.getWidth(), imageView.getHeight());
        float width = this.f4353c.getWidth() / rectM6447l.width();
        float height = this.f4353c.getHeight() / rectM6447l.height();
        float coordinate = Edge.LEFT.getCoordinate() - rectM6447l.left;
        float f = coordinate * width;
        float coordinate2 = (Edge.TOP.getCoordinate() - rectM6447l.top) * height;
        return new RectF(Math.max(0.0f, f), Math.max(0.0f, coordinate2), Math.min(this.f4353c.getWidth(), (Edge.getWidth() * width) + f), Math.min(this.f4353c.getHeight(), (Edge.getHeight() * height) + coordinate2));
    }

    public CropOverlayView getCropOverlayView() {
        return this.f4352b;
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap = this.f4353c;
        if (bitmap == null) {
            return null;
        }
        ImageView imageView = this.f4351a;
        Rect rectM6447l = AbstractC6768a.m6447l(bitmap.getWidth(), bitmap.getHeight(), imageView.getWidth(), imageView.getHeight());
        float width = this.f4353c.getWidth() / rectM6447l.width();
        float height = this.f4353c.getHeight() / rectM6447l.height();
        return Bitmap.createBitmap(this.f4353c, (int) ((Edge.LEFT.getCoordinate() - rectM6447l.left) * width), (int) ((Edge.TOP.getCoordinate() - rectM6447l.top) * height), (int) (Edge.getWidth() * width), (int) (Edge.getHeight() * height));
    }

    public int getImageResource() {
        return this.f4361k;
    }

    public ImageView getImageView() {
        return this.f4351a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (this.f4355e <= 0 || this.f4356f <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f4355e;
        layoutParams.height = this.f4356f;
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int width;
        int height;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (this.f4353c == null) {
            this.f4352b.setBitmapRect(f4350l);
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i, i8);
        if (size2 == 0) {
            size2 = this.f4353c.getHeight();
        }
        double width2 = size < this.f4353c.getWidth() ? size / this.f4353c.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.f4353c.getHeight() ? size2 / this.f4353c.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.f4353c.getWidth();
            height = this.f4353c.getHeight();
        } else if (width2 <= height2) {
            height = (int) (this.f4353c.getHeight() * width2);
            width = size;
        } else {
            width = (int) (this.f4353c.getWidth() * height2);
            height = size2;
        }
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(width, size) : width;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(height, size2) : height;
        }
        this.f4355e = size;
        this.f4356f = size2;
        this.f4352b.setBitmapRect(AbstractC6768a.m6447l(this.f4353c.getWidth(), this.f4353c.getHeight(), this.f4355e, this.f4356f));
        CropOverlayView cropOverlayView = this.f4352b;
        int width3 = this.f4353c.getWidth();
        int height3 = this.f4353c.getHeight();
        cropOverlayView.f4382s = width3;
        cropOverlayView.f4383t = height3;
        setMeasuredDimension(this.f4355e, this.f4356f);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.f4353c != null) {
            int i = bundle.getInt("DEGREES_ROTATED");
            this.f4354d = i;
            if (this.f4353c != null) {
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                Bitmap bitmap = this.f4353c;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f4353c.getHeight(), matrix, true);
                this.f4353c = bitmapCreateBitmap;
                setImageBitmap(bitmapCreateBitmap);
                this.f4354d = (this.f4354d + i) % 360;
            }
            this.f4354d = i;
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("DEGREES_ROTATED", this.f4354d);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        Bitmap bitmap = this.f4353c;
        if (bitmap == null) {
            this.f4352b.setBitmapRect(f4350l);
        } else {
            this.f4352b.setBitmapRect(AbstractC6768a.m6447l(bitmap.getWidth(), bitmap.getHeight(), getWidth(), getHeight()));
        }
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f4352b.setCropOverlayCornerBitmap(bitmap);
    }

    public void setFixedAspectRatio(boolean z8) {
        this.f4352b.setFixedAspectRatio(z8);
    }

    public void setGuidelines(int i) {
        this.f4352b.setGuidelines(i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f4353c = bitmap;
        this.f4351a.setImageBitmap(bitmap);
        CropOverlayView cropOverlayView = this.f4352b;
        if (cropOverlayView != null) {
            cropOverlayView.m3499e();
            this.f4352b.setVisibility(0);
        }
    }

    public void setImagePath(@NonNull String str) {
        setImageBitmap(BitmapFactory.decodeFile(str));
    }

    public void setImageResource(int i) {
        if (i != 0) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), i));
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4354d = 0;
        this.f4357g = 1;
        this.f4358h = false;
        this.f4359i = 1;
        this.f4360j = 1;
        this.f4361k = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropImageView, 0, 0);
        try {
            this.f4357g = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_guidelines, 1);
            this.f4358h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CropImageView_civ_fixAspectRatio, false);
            this.f4359i = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioX, 1);
            this.f4360j = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioY, 1);
            this.f4361k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CropImageView_civ_imageResource, 0);
            typedArrayObtainStyledAttributes.recycle();
            m3493a(context);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
