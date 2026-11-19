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
import com.xuexiang.xui.utils.AbstractC6873c;
import p071d2.AbstractC8285h;

/* loaded from: classes4.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: l */
    public static final Rect f7700l = new Rect();

    /* renamed from: a */
    public ImageView f7701a;

    /* renamed from: b */
    public CropOverlayView f7702b;

    /* renamed from: c */
    public Bitmap f7703c;

    /* renamed from: d */
    public int f7704d;

    /* renamed from: e */
    public int f7705e;

    /* renamed from: f */
    public int f7706f;

    /* renamed from: g */
    public int f7707g;

    /* renamed from: h */
    public boolean f7708h;

    /* renamed from: i */
    public int f7709i;

    /* renamed from: j */
    public int f7710j;

    /* renamed from: k */
    public int f7711k;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7704d = 0;
        this.f7707g = 1;
        this.f7708h = false;
        this.f7709i = 1;
        this.f7710j = 1;
        this.f7711k = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropImageView, 0, 0);
        try {
            this.f7707g = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_guidelines, 1);
            this.f7708h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CropImageView_civ_fixAspectRatio, false);
            this.f7709i = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioX, 1);
            this.f7710j = typedArrayObtainStyledAttributes.getInteger(R$styleable.CropImageView_civ_aspectRatioY, 1);
            this.f7711k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CropImageView_civ_imageResource, 0);
            typedArrayObtainStyledAttributes.recycle();
            m6854b(context);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public static int m6853a(int i10, int i11, int i12) {
        return i10 == 1073741824 ? i11 : i10 == Integer.MIN_VALUE ? Math.min(i12, i11) : i12;
    }

    /* renamed from: b */
    public final void m6854b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.xui_layout_crop_image_view, (ViewGroup) this, true);
        this.f7701a = (ImageView) viewInflate.findViewById(R$id.iv_content);
        setImageResource(this.f7711k);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(R$id.crop_overlay_view);
        this.f7702b = cropOverlayView;
        cropOverlayView.m6869l(this.f7707g, this.f7708h, this.f7709i, this.f7710j);
    }

    /* renamed from: c */
    public void m6855c(int i10) {
        if (this.f7703c == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        Bitmap bitmap = this.f7703c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f7703c.getHeight(), matrix, true);
        this.f7703c = bitmapCreateBitmap;
        setImageBitmap(bitmapCreateBitmap);
        this.f7704d = (this.f7704d + i10) % 360;
    }

    /* renamed from: d */
    public void m6856d(int i10, int i11) {
        this.f7709i = i10;
        this.f7702b.setAspectRatioX(i10);
        this.f7710j = i11;
        this.f7702b.setAspectRatioY(i11);
    }

    public RectF getActualCropRect() {
        Rect rectM13452b = AbstractC8285h.m13452b(this.f7703c, this.f7701a);
        float width = this.f7703c.getWidth() / rectM13452b.width();
        float height = this.f7703c.getHeight() / rectM13452b.height();
        float fM6878h = Edge.LEFT.m6878h() - rectM13452b.left;
        float f10 = fM6878h * width;
        float fM6878h2 = (Edge.TOP.m6878h() - rectM13452b.top) * height;
        return new RectF(Math.max(0.0f, f10), Math.max(0.0f, fM6878h2), Math.min(this.f7703c.getWidth(), (Edge.m6875j() * width) + f10), Math.min(this.f7703c.getHeight(), (Edge.m6874i() * height) + fM6878h2));
    }

    public CropOverlayView getCropOverlayView() {
        return this.f7702b;
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap = this.f7703c;
        if (bitmap == null) {
            return null;
        }
        Rect rectM13452b = AbstractC8285h.m13452b(bitmap, this.f7701a);
        float width = this.f7703c.getWidth() / rectM13452b.width();
        float height = this.f7703c.getHeight() / rectM13452b.height();
        return AbstractC6873c.m6429a(this.f7703c, (int) ((Edge.LEFT.m6878h() - rectM13452b.left) * width), (int) ((Edge.TOP.m6878h() - rectM13452b.top) * height), (int) (Edge.m6875j() * width), (int) (Edge.m6874i() * height), 1);
    }

    public int getImageResource() {
        return this.f7711k;
    }

    public ImageView getImageView() {
        return this.f7701a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f7705e <= 0 || this.f7706f <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f7705e;
        layoutParams.height = this.f7706f;
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
        if (this.f7703c == null) {
            this.f7702b.setBitmapRect(f7700l);
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i10, i11);
        if (size2 == 0) {
            size2 = this.f7703c.getHeight();
        }
        double width2 = size < this.f7703c.getWidth() ? size / this.f7703c.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.f7703c.getHeight() ? size2 / this.f7703c.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.f7703c.getWidth();
            height = this.f7703c.getHeight();
        } else if (width2 <= height2) {
            height = (int) (this.f7703c.getHeight() * width2);
            width = size;
        } else {
            width = (int) (this.f7703c.getWidth() * height2);
            height = size2;
        }
        int iM6853a = m6853a(mode, size, width);
        int iM6853a2 = m6853a(mode2, size2, height);
        this.f7705e = iM6853a;
        this.f7706f = iM6853a2;
        this.f7702b.setBitmapRect(AbstractC8285h.m13451a(this.f7703c.getWidth(), this.f7703c.getHeight(), this.f7705e, this.f7706f));
        this.f7702b.m6868k(this.f7703c.getWidth(), this.f7703c.getHeight());
        setMeasuredDimension(this.f7705e, this.f7706f);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.f7703c != null) {
            int i10 = bundle.getInt("DEGREES_ROTATED");
            this.f7704d = i10;
            m6855c(i10);
            this.f7704d = i10;
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("DEGREES_ROTATED", this.f7704d);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Bitmap bitmap = this.f7703c;
        if (bitmap == null) {
            this.f7702b.setBitmapRect(f7700l);
        } else {
            this.f7702b.setBitmapRect(AbstractC8285h.m13452b(bitmap, this));
        }
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.f7702b.setCropOverlayCornerBitmap(bitmap);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f7702b.setFixedAspectRatio(z10);
    }

    public void setGuidelines(int i10) {
        this.f7702b.setGuidelines(i10);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f7703c = bitmap;
        this.f7701a.setImageBitmap(bitmap);
        CropOverlayView cropOverlayView = this.f7702b;
        if (cropOverlayView != null) {
            cropOverlayView.m6867j();
            this.f7702b.setVisibility(0);
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
}
