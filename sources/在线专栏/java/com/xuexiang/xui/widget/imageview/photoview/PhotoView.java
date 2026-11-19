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
import com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher;

/* loaded from: classes.dex */
public class PhotoView extends AppCompatImageView implements IPhotoView {
    private PhotoViewAttacher mAttacher;
    private ImageView.ScaleType mPendingScaleType;

    public PhotoView(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public boolean canZoom() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        return photoViewAttacher != null && photoViewAttacher.canZoom();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void getDisplayMatrix(Matrix matrix) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.getDisplayMatrix(matrix);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public RectF getDisplayRect() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getDisplayRect();
        }
        return null;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public IPhotoView getIPhotoViewImplementation() {
        return this.mAttacher;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getImageMatrix();
        }
        return null;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMaximumScale() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getMaximumScale();
        }
        return 3.0f;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMediumScale() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getMediumScale();
        }
        return 1.75f;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMinimumScale() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getMinimumScale();
        }
        return 1.0f;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getScale() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getScale();
        }
        return 1.0f;
    }

    @Override // android.widget.ImageView, com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public ImageView.ScaleType getScaleType() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getScaleType();
        }
        return null;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public Bitmap getVisibleRectangleBitmap() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            return photoViewAttacher.getVisibleRectangleBitmap();
        }
        return null;
    }

    protected void init() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher == null || photoViewAttacher.getImageView() == null) {
            this.mAttacher = new PhotoViewAttacher(this);
        }
        ImageView.ScaleType scaleType = this.mPendingScaleType;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.mPendingScaleType = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        init();
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        resetMatrix();
        super.onDetachedFromWindow();
    }

    public void resetMatrix() {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.cleanup();
            this.mAttacher.resetMatrix();
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setAllowParentInterceptOnEdge(boolean z3) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setAllowParentInterceptOnEdge(z3);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public boolean setDisplayMatrix(Matrix matrix) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        return photoViewAttacher != null && photoViewAttacher.setDisplayMatrix(matrix);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i4, int i5, int i6, int i7) {
        boolean frame = super.setFrame(i4, i5, i6, i7);
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        super.setImageResource(i4);
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMaximumScale(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setMaximumScale(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMediumScale(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setMediumScale(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMinimumScale(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setMinimumScale(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    @Override // android.view.View, com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener onMatrixChangedListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnMatrixChangeListener(onMatrixChangedListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener onPhotoTapListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnPhotoTapListener(onPhotoTapListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnScaleChangeListener(PhotoViewAttacher.OnScaleChangeListener onScaleChangeListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnScaleChangeListener(onScaleChangeListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnSingleFlingListener(PhotoViewAttacher.OnSingleFlingListener onSingleFlingListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnSingleFlingListener(onSingleFlingListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener onViewTapListener) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setOnViewTapListener(onViewTapListener);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setRotationBy(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setRotationBy(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setRotationTo(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setRotationTo(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScale(f4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScaleLevels(float f4, float f5, float f6) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScaleLevels(f4, f5, f6);
        }
    }

    @Override // android.widget.ImageView, com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScaleType(scaleType);
        } else {
            this.mPendingScaleType = scaleType;
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setZoomTransitionDuration(int i4) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setZoomTransitionDuration(i4);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setZoomable(boolean z3) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setZoomable(z3);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        init();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4, boolean z3) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScale(f4, z3);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4, float f5, float f6, boolean z3) {
        PhotoViewAttacher photoViewAttacher = this.mAttacher;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScale(f4, f5, f6, z3);
        }
    }
}
