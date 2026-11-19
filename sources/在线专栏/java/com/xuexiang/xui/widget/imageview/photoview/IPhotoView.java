package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher;

/* loaded from: classes.dex */
public interface IPhotoView {
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    public static final int DEFAULT_ZOOM_DURATION = 200;

    boolean canZoom();

    void getDisplayMatrix(Matrix matrix);

    RectF getDisplayRect();

    IPhotoView getIPhotoViewImplementation();

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    float getScale();

    ImageView.ScaleType getScaleType();

    Bitmap getVisibleRectangleBitmap();

    void setAllowParentInterceptOnEdge(boolean z3);

    boolean setDisplayMatrix(Matrix matrix);

    void setMaximumScale(float f4);

    void setMediumScale(float f4);

    void setMinimumScale(float f4);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener onMatrixChangedListener);

    void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener onPhotoTapListener);

    void setOnScaleChangeListener(PhotoViewAttacher.OnScaleChangeListener onScaleChangeListener);

    void setOnSingleFlingListener(PhotoViewAttacher.OnSingleFlingListener onSingleFlingListener);

    void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener onViewTapListener);

    void setRotationBy(float f4);

    void setRotationTo(float f4);

    void setScale(float f4);

    void setScale(float f4, float f5, float f6, boolean z3);

    void setScale(float f4, boolean z3);

    void setScaleLevels(float f4, float f5, float f6);

    void setScaleType(ImageView.ScaleType scaleType);

    void setZoomTransitionDuration(int i4);

    void setZoomable(boolean z3);
}
