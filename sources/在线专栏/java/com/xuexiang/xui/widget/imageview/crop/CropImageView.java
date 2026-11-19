package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DrawableUtils;
import com.xuexiang.xui.widget.imageview.crop.CropImageType;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class CropImageView extends FrameLayout {
    public static final int DEFAULT_ASPECT_RATIO_X = 1;
    public static final int DEFAULT_ASPECT_RATIO_Y = 1;
    public static final boolean DEFAULT_FIXED_ASPECT_RATIO = false;
    public static final int DEFAULT_GUIDELINES = 1;
    private static final int DEFAULT_IMAGE_RESOURCE = 0;
    private static final String DEGREES_ROTATED = "DEGREES_ROTATED";
    private static final Rect EMPTY_RECT = new Rect();
    private int mAspectRatioX;
    private int mAspectRatioY;
    private Bitmap mBitmap;
    private CropOverlayView mCropOverlayView;
    private int mDegreesRotated;
    private boolean mFixAspectRatio;
    private int mGuidelines;
    private int mImageResource;
    private ImageView mImageView;
    private int mLayoutHeight;
    private int mLayoutWidth;

    public CropImageView(Context context) {
        super(context);
        this.mDegreesRotated = 0;
        this.mGuidelines = 1;
        this.mFixAspectRatio = false;
        this.mAspectRatioX = 1;
        this.mAspectRatioY = 1;
        this.mImageResource = 0;
        init(context);
    }

    private static int getOnMeasureSpec(int i4, int i5, int i6) {
        return i4 == 1073741824 ? i5 : i4 == Integer.MIN_VALUE ? Math.min(i6, i5) : i6;
    }

    private void init(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_crop_image_view, (ViewGroup) this, true);
        this.mImageView = (ImageView) viewInflate.findViewById(C2042R.id.iv_content);
        setImageResource(this.mImageResource);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(C2042R.id.crop_overlay_view);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setInitialAttributeValues(this.mGuidelines, this.mFixAspectRatio, this.mAspectRatioX, this.mAspectRatioY);
    }

    public Bitmap cropImage() {
        return cropImage(false);
    }

    public RectF getActualCropRect() {
        Rect bitmapRectCenterInside = ImageViewUtil.getBitmapRectCenterInside(this.mBitmap, this.mImageView);
        float width = this.mBitmap.getWidth() / bitmapRectCenterInside.width();
        float height = this.mBitmap.getHeight() / bitmapRectCenterInside.height();
        float coordinate = Edge.LEFT.getCoordinate() - bitmapRectCenterInside.left;
        float f4 = coordinate * width;
        float coordinate2 = (Edge.TOP.getCoordinate() - bitmapRectCenterInside.top) * height;
        return new RectF(Math.max(IGoodView.DEFAULT_TO_ALPHA, f4), Math.max(IGoodView.DEFAULT_TO_ALPHA, coordinate2), Math.min(this.mBitmap.getWidth(), (Edge.getWidth() * width) + f4), Math.min(this.mBitmap.getHeight(), (Edge.getHeight() * height) + coordinate2));
    }

    public CropOverlayView getCropOverlayView() {
        return this.mCropOverlayView;
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            return null;
        }
        Rect bitmapRectCenterInside = ImageViewUtil.getBitmapRectCenterInside(bitmap, this.mImageView);
        float width = this.mBitmap.getWidth() / bitmapRectCenterInside.width();
        float height = this.mBitmap.getHeight() / bitmapRectCenterInside.height();
        return DrawableUtils.createBitmapSafely(this.mBitmap, (int) ((Edge.LEFT.getCoordinate() - bitmapRectCenterInside.left) * width), (int) ((Edge.TOP.getCoordinate() - bitmapRectCenterInside.top) * height), (int) (Edge.getWidth() * width), (int) (Edge.getHeight() * height), 1);
    }

    public int getImageResource() {
        return this.mImageResource;
    }

    public ImageView getImageView() {
        return this.mImageView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (this.mLayoutWidth <= 0 || this.mLayoutHeight <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.mLayoutWidth;
        layoutParams.height = this.mLayoutHeight;
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int width;
        int height;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (this.mBitmap == null) {
            this.mCropOverlayView.setBitmapRect(EMPTY_RECT);
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i4, i5);
        if (size2 == 0) {
            size2 = this.mBitmap.getHeight();
        }
        double width2 = size < this.mBitmap.getWidth() ? size / this.mBitmap.getWidth() : Double.POSITIVE_INFINITY;
        double height2 = size2 < this.mBitmap.getHeight() ? size2 / this.mBitmap.getHeight() : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = this.mBitmap.getWidth();
            height = this.mBitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (this.mBitmap.getHeight() * width2);
            width = size;
        } else {
            width = (int) (this.mBitmap.getWidth() * height2);
            height = size2;
        }
        int onMeasureSpec = getOnMeasureSpec(mode, size, width);
        int onMeasureSpec2 = getOnMeasureSpec(mode2, size2, height);
        this.mLayoutWidth = onMeasureSpec;
        this.mLayoutHeight = onMeasureSpec2;
        this.mCropOverlayView.setBitmapRect(ImageViewUtil.getBitmapRectCenterInside(this.mBitmap.getWidth(), this.mBitmap.getHeight(), this.mLayoutWidth, this.mLayoutHeight));
        this.mCropOverlayView.setBitmapSize(this.mBitmap.getWidth(), this.mBitmap.getHeight());
        setMeasuredDimension(this.mLayoutWidth, this.mLayoutHeight);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (this.mBitmap != null) {
            int i4 = bundle.getInt(DEGREES_ROTATED);
            this.mDegreesRotated = i4;
            rotateImage(i4);
            this.mDegreesRotated = i4;
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt(DEGREES_ROTATED, this.mDegreesRotated);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            this.mCropOverlayView.setBitmapRect(EMPTY_RECT);
        } else {
            this.mCropOverlayView.setBitmapRect(ImageViewUtil.getBitmapRectCenterInside(bitmap, this));
        }
    }

    public void reverseImage(CropImageType.REVERSE_TYPE reverse_type) {
        if (this.mBitmap == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (reverse_type == CropImageType.REVERSE_TYPE.UP_DOWN) {
            matrix.postScale(1.0f, -1.0f);
        } else if (reverse_type == CropImageType.REVERSE_TYPE.LEFT_RIGHT) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Bitmap bitmap = this.mBitmap;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight(), matrix, true);
        this.mBitmap = bitmapCreateBitmap;
        setImageBitmap(bitmapCreateBitmap);
    }

    public void rotateImage(int i4) {
        if (this.mBitmap == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i4);
        Bitmap bitmap = this.mBitmap;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight(), matrix, true);
        this.mBitmap = bitmapCreateBitmap;
        setImageBitmap(bitmapCreateBitmap);
        int i5 = this.mDegreesRotated + i4;
        this.mDegreesRotated = i5;
        this.mDegreesRotated = i5 % 360;
    }

    public void setAspectRatio(int i4, int i5) {
        this.mAspectRatioX = i4;
        this.mCropOverlayView.setAspectRatioX(i4);
        this.mAspectRatioY = i5;
        this.mCropOverlayView.setAspectRatioY(i5);
    }

    public void setCropOverlayCornerBitmap(Bitmap bitmap) {
        this.mCropOverlayView.setCropOverlayCornerBitmap(bitmap);
    }

    public CropImageView setCropOverlayViewVisibility(int i4) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility(i4);
        }
        return this;
    }

    public void setFixedAspectRatio(boolean z3) {
        this.mCropOverlayView.setFixedAspectRatio(z3);
    }

    public void setGuidelines(int i4) {
        this.mCropOverlayView.setGuidelines(i4);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
        this.mImageView.setImageBitmap(bitmap);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.resetCropOverlayView();
            this.mCropOverlayView.setVisibility(0);
        }
    }

    public void setImagePath(String str) {
        setImageBitmap(BitmapFactory.decodeFile(str));
    }

    public void setImageResource(int i4) {
        if (i4 != 0) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), i4));
        }
    }

    public CropImageView switchCropOverlayViewVisibility(boolean z3) {
        return setCropOverlayViewVisibility(z3 ? 0 : 8);
    }

    public Bitmap cropImage(boolean z3) {
        Bitmap croppedImage = getCroppedImage();
        if (croppedImage == null) {
            return null;
        }
        setImageBitmap(croppedImage);
        if (!z3) {
            setCropOverlayViewVisibility(8);
        }
        return croppedImage;
    }

    public void setImageBitmap(Bitmap bitmap, ExifInterface exifInterface) {
        if (bitmap == null) {
            return;
        }
        if (exifInterface == null) {
            setImageBitmap(bitmap);
            return;
        }
        Matrix matrix = new Matrix();
        int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
        int i4 = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? -1 : 270 : 90 : 180;
        if (i4 == -1) {
            setImageBitmap(bitmap);
            return;
        }
        matrix.postRotate(i4);
        setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        bitmap.recycle();
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDegreesRotated = 0;
        this.mGuidelines = 1;
        this.mFixAspectRatio = false;
        this.mAspectRatioX = 1;
        this.mAspectRatioY = 1;
        this.mImageResource = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.CropImageView, 0, 0);
        try {
            this.mGuidelines = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.CropImageView_civ_guidelines, 1);
            this.mFixAspectRatio = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CropImageView_civ_fixAspectRatio, false);
            this.mAspectRatioX = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.CropImageView_civ_aspectRatioX, 1);
            this.mAspectRatioY = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.CropImageView_civ_aspectRatioY, 1);
            this.mImageResource = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.CropImageView_civ_imageResource, 0);
            typedArrayObtainStyledAttributes.recycle();
            init(context);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
