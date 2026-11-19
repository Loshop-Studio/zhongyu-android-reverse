package com.xuexiang.xui.widget.imageview.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.core.view.C0347j;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector;
import com.xuexiang.xui.widget.imageview.photoview.gestures.OnGestureListener;
import com.xuexiang.xui.widget.imageview.photoview.gestures.VersionedGestureDetector;
import com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class PhotoViewAttacher implements IPhotoView, View.OnTouchListener, OnGestureListener, ViewTreeObserver.OnGlobalLayoutListener {
    static final int EDGE_BOTH = 2;
    static final int EDGE_LEFT = 0;
    static final int EDGE_NONE = -1;
    static final int EDGE_RIGHT = 1;
    int ZOOM_DURATION;
    private boolean mAllowParentInterceptOnEdge;
    private final Matrix mBaseMatrix;
    private float mBaseRotation;
    private boolean mBlockParentIntercept;
    private FlingRunnable mCurrentFlingRunnable;
    private final RectF mDisplayRect;
    private final Matrix mDrawMatrix;
    private GestureDetector mGestureDetector;
    private WeakReference<ImageView> mImageView;
    private Interpolator mInterpolator;
    private int mIvBottom;
    private int mIvLeft;
    private int mIvRight;
    private int mIvTop;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private final float[] mMatrixValues;
    private float mMaxScale;
    private float mMidScale;
    private float mMinScale;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangeListener mScaleChangeListener;
    private IGestureDetector mScaleDragDetector;
    private ImageView.ScaleType mScaleType;
    private int mScrollEdge;
    private OnSingleFlingListener mSingleFlingListener;
    private final Matrix mSuppMatrix;
    private OnViewTapListener mViewTapListener;
    private boolean mZoomEnabled;
    private static final String LOG_TAG = "PhotoViewAttacher";
    private static final boolean DEBUG = Log.isLoggable(LOG_TAG, 3);
    static int SINGLE_TOUCH = 1;

    /* renamed from: com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher$2 */
    static /* synthetic */ class C21972 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f4, float f5, float f6, float f7) {
            this.mFocalX = f6;
            this.mFocalY = f7;
            this.mZoomStart = f4;
            this.mZoomEnd = f5;
        }

        private float interpolate() {
            return PhotoViewAttacher.this.mInterpolator.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.mStartTime) * 1.0f) / PhotoViewAttacher.this.ZOOM_DURATION));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = PhotoViewAttacher.this.getImageView();
            if (imageView == null) {
                return;
            }
            float fInterpolate = interpolate();
            float f4 = this.mZoomStart;
            PhotoViewAttacher.this.onScale((f4 + ((this.mZoomEnd - f4) * fInterpolate)) / PhotoViewAttacher.this.getScale(), this.mFocalX, this.mFocalY);
            if (fInterpolate < 1.0f) {
                Compat.postOnAnimation(imageView, this);
            }
        }
    }

    private class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final ScrollerProxy mScroller;

        public FlingRunnable(Context context) {
            this.mScroller = ScrollerProxy.getScroller(context);
        }

        public void cancelFling() {
            if (PhotoViewAttacher.DEBUG) {
                UILog.dTag(PhotoViewAttacher.LOG_TAG, "Cancel Fling");
            }
            this.mScroller.forceFinished(true);
        }

        public void fling(int i4, int i5, int i6, int i7) {
            int i8;
            int iRound;
            int i9;
            int iRound2;
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int iRound3 = Math.round(-displayRect.left);
            float f4 = i4;
            if (f4 < displayRect.width()) {
                iRound = Math.round(displayRect.width() - f4);
                i8 = 0;
            } else {
                i8 = iRound3;
                iRound = i8;
            }
            int iRound4 = Math.round(-displayRect.top);
            float f5 = i5;
            if (f5 < displayRect.height()) {
                iRound2 = Math.round(displayRect.height() - f5);
                i9 = 0;
            } else {
                i9 = iRound4;
                iRound2 = i9;
            }
            this.mCurrentX = iRound3;
            this.mCurrentY = iRound4;
            if (PhotoViewAttacher.DEBUG) {
                UILog.dTag(PhotoViewAttacher.LOG_TAG, "fling. StartX:" + iRound3 + " StartY:" + iRound4 + " MaxX:" + iRound + " MaxY:" + iRound2);
            }
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.mScroller.fling(iRound3, iRound4, i6, i7, i8, iRound, i9, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            if (this.mScroller.isFinished() || (imageView = PhotoViewAttacher.this.getImageView()) == null || !this.mScroller.computeScrollOffset()) {
                return;
            }
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (PhotoViewAttacher.DEBUG) {
                UILog.dTag(PhotoViewAttacher.LOG_TAG, "fling run(). CurrentX:" + this.mCurrentX + " CurrentY:" + this.mCurrentY + " NewX:" + currX + " NewY:" + currY);
            }
            PhotoViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            photoViewAttacher.setImageViewMatrix(photoViewAttacher.getDrawMatrix());
            this.mCurrentX = currX;
            this.mCurrentY = currY;
            Compat.postOnAnimation(imageView, this);
        }
    }

    public interface OnMatrixChangedListener {
        void onMatrixChanged(RectF rectF);
    }

    public interface OnPhotoTapListener {
        void onOutsidePhotoTap();

        void onPhotoTap(View view, float f4, float f5);
    }

    public interface OnScaleChangeListener {
        void onScaleChange(float f4, float f5, float f6);
    }

    public interface OnSingleFlingListener {
        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5);
    }

    public interface OnViewTapListener {
        void onViewTap(View view, float f4, float f5);
    }

    public PhotoViewAttacher(ImageView imageView) {
        this(imageView, true);
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    private void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private void checkImageViewScaleType() {
        ImageView imageView = getImageView();
        if (imageView != null && !(imageView instanceof IPhotoView) && !ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    private boolean checkMatrixBounds() {
        RectF displayRect;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageView imageView = getImageView();
        if (imageView == null || (displayRect = getDisplayRect(getDrawMatrix())) == null) {
            return false;
        }
        float fHeight = displayRect.height();
        float fWidth = displayRect.width();
        float imageViewHeight = getImageViewHeight(imageView);
        float f10 = IGoodView.DEFAULT_TO_ALPHA;
        if (fHeight <= imageViewHeight) {
            int i4 = C21972.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    imageViewHeight = (imageViewHeight - fHeight) / 2.0f;
                    f5 = displayRect.top;
                } else {
                    imageViewHeight -= fHeight;
                    f5 = displayRect.top;
                }
            } else {
                f4 = displayRect.top;
                f6 = -f4;
            }
        } else {
            f4 = displayRect.top;
            if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                f6 = -f4;
            } else {
                f5 = displayRect.bottom;
                f6 = f5 < imageViewHeight ? imageViewHeight - f5 : IGoodView.DEFAULT_TO_ALPHA;
            }
        }
        float imageViewWidth = getImageViewWidth(imageView);
        if (fWidth <= imageViewWidth) {
            int i5 = C21972.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f8 = (imageViewWidth - fWidth) / 2.0f;
                    f9 = displayRect.left;
                } else {
                    f8 = imageViewWidth - fWidth;
                    f9 = displayRect.left;
                }
                f7 = f8 - f9;
            } else {
                f7 = -displayRect.left;
            }
            f10 = f7;
            this.mScrollEdge = 2;
        } else {
            float f11 = displayRect.left;
            if (f11 > IGoodView.DEFAULT_TO_ALPHA) {
                this.mScrollEdge = 0;
                f10 = -f11;
            } else {
                float f12 = displayRect.right;
                if (f12 < imageViewWidth) {
                    f10 = imageViewWidth - f12;
                    this.mScrollEdge = 1;
                } else {
                    this.mScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f10, f6);
        return true;
    }

    private static void checkZoomLevels(float f4, float f5, float f6) {
        if (f4 >= f5) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f5 >= f6) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    private int getImageViewHeight(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private int getImageViewWidth(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i4) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i4];
    }

    private static boolean hasDrawable(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    private static boolean isSupportedScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C21972.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        ImageView imageView = getImageView();
        if (imageView != null) {
            checkImageViewScaleType();
            imageView.setImageMatrix(matrix);
            if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
                return;
            }
            this.mMatrixChangeListener.onMatrixChanged(displayRect);
        }
    }

    private static void setImageViewScaleTypeMatrix(ImageView imageView) {
        if (imageView == null || (imageView instanceof IPhotoView) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void updateBaseMatrix(Drawable drawable) {
        ImageView imageView = getImageView();
        if (imageView == null || drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(imageView);
        float imageViewHeight = getImageViewHeight(imageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mBaseMatrix.reset();
        float f4 = intrinsicWidth;
        float f5 = imageViewWidth / f4;
        float f6 = intrinsicHeight;
        float f7 = imageViewHeight / f6;
        ImageView.ScaleType scaleType = this.mScaleType;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((imageViewWidth - f4) / 2.0f, (imageViewHeight - f6) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f5, f7);
            this.mBaseMatrix.postScale(fMax, fMax);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f4 * fMax)) / 2.0f, (imageViewHeight - (f6 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f5, f7));
            this.mBaseMatrix.postScale(fMin, fMin);
            this.mBaseMatrix.postTranslate((imageViewWidth - (f4 * fMin)) / 2.0f, (imageViewHeight - (f6 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, f6);
            RectF rectF2 = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, imageViewWidth, imageViewHeight);
            if (((int) this.mBaseRotation) % 180 != 0) {
                rectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f6, f4);
            }
            int i4 = C21972.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i4 == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i4 == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i4 == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i4 == 5) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public boolean canZoom() {
        return this.mZoomEnabled;
    }

    public void cleanup() {
        WeakReference<ImageView> weakReference = this.mImageView;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            cancelFling();
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.mMatrixChangeListener = null;
        this.mPhotoTapListener = null;
        this.mViewTapListener = null;
        this.mLongClickListener = null;
        this.mScaleChangeListener = null;
        this.mSingleFlingListener = null;
        this.mImageView = null;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public IPhotoView getIPhotoViewImplementation() {
        return this;
    }

    public Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public ImageView getImageView() {
        WeakReference<ImageView> weakReference = this.mImageView;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            cleanup();
            UILog.iTag(LOG_TAG, "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMaximumScale() {
        return this.mMaxScale;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMediumScale() {
        return this.mMidScale;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getMinimumScale() {
        return this.mMinScale;
    }

    OnPhotoTapListener getOnPhotoTapListener() {
        return this.mPhotoTapListener;
    }

    OnViewTapListener getOnViewTapListener() {
        return this.mViewTapListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public Bitmap getVisibleRectangleBitmap() {
        ImageView imageView = getImageView();
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawingCache();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.gestures.OnGestureListener
    public void onDrag(float f4, float f5) {
        if (this.mScaleDragDetector.isScaling()) {
            return;
        }
        if (DEBUG) {
            UILog.dTag(LOG_TAG, String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f4), Float.valueOf(f5)));
        }
        ImageView imageView = getImageView();
        this.mSuppMatrix.postTranslate(f4, f5);
        checkAndDisplayMatrix();
        ViewParent parent = imageView.getParent();
        if (!this.mAllowParentInterceptOnEdge || this.mScaleDragDetector.isScaling() || this.mBlockParentIntercept) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i4 = this.mScrollEdge;
        if ((i4 == 2 || ((i4 == 0 && f4 >= 1.0f) || (i4 == 1 && f4 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.gestures.OnGestureListener
    public void onFling(float f4, float f5, float f6, float f7) {
        if (DEBUG) {
            UILog.dTag(LOG_TAG, "onFling. sX: " + f4 + " sY: " + f5 + " Vx: " + f6 + " Vy: " + f7);
        }
        ImageView imageView = getImageView();
        FlingRunnable flingRunnable = new FlingRunnable(imageView.getContext());
        this.mCurrentFlingRunnable = flingRunnable;
        flingRunnable.fling(getImageViewWidth(imageView), getImageViewHeight(imageView), (int) f6, (int) f7);
        imageView.post(this.mCurrentFlingRunnable);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ImageView imageView = getImageView();
        if (imageView != null) {
            if (!this.mZoomEnabled) {
                updateBaseMatrix(imageView.getDrawable());
                return;
            }
            int top = imageView.getTop();
            int right = imageView.getRight();
            int bottom = imageView.getBottom();
            int left = imageView.getLeft();
            if (top == this.mIvTop && bottom == this.mIvBottom && left == this.mIvLeft && right == this.mIvRight) {
                return;
            }
            updateBaseMatrix(imageView.getDrawable());
            this.mIvTop = top;
            this.mIvRight = right;
            this.mIvBottom = bottom;
            this.mIvLeft = left;
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.gestures.OnGestureListener
    public void onScale(float f4, float f5, float f6) {
        if (DEBUG) {
            UILog.dTag(LOG_TAG, String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6)));
        }
        if (getScale() < this.mMaxScale || f4 < 1.0f) {
            if (getScale() > this.mMinScale || f4 > 1.0f) {
                OnScaleChangeListener onScaleChangeListener = this.mScaleChangeListener;
                if (onScaleChangeListener != null) {
                    onScaleChangeListener.onScaleChange(f4, f5, f6);
                }
                this.mSuppMatrix.postScale(f4, f4, f5, f6);
                checkAndDisplayMatrix();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.mZoomEnabled
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9d
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = hasDrawable(r0)
            if (r0 == 0) goto L9d
            android.view.ViewParent r0 = r11.getParent()
            int r3 = r12.getAction()
            if (r3 == 0) goto L49
            if (r3 == r2) goto L1f
            r0 = 3
            if (r3 == r0) goto L1f
            goto L59
        L1f:
            float r0 = r10.getScale()
            float r3 = r10.mMinScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L59
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L59
            com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.getScale()
            float r6 = r10.mMinScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            r11 = 1
            goto L5a
        L49:
            if (r0 == 0) goto L4f
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L56
        L4f:
            java.lang.String r11 = "PhotoViewAttacher"
            java.lang.String r0 = "onTouch getParent() returned null"
            com.xuexiang.xui.logs.UILog.iTag(r11, r0)
        L56:
            r10.cancelFling()
        L59:
            r11 = 0
        L5a:
            com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector r0 = r10.mScaleDragDetector
            if (r0 == 0) goto L91
            boolean r11 = r0.isScaling()
            com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector r3 = r10.mScaleDragDetector
            boolean r3 = r3.onTouchEvent(r12)
            if (r11 != 0) goto L7a
            com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector r11 = r10.mScaleDragDetector
            boolean r11 = r11.isScaling()
            if (r11 != 0) goto L7a
            r11 = 1
            goto L7b
        L7a:
            r11 = 0
        L7b:
            if (r0 != 0) goto L87
            com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            if (r0 != 0) goto L87
            r0 = 1
            goto L88
        L87:
            r0 = 0
        L88:
            if (r11 == 0) goto L8d
            if (r0 == 0) goto L8d
            r1 = 1
        L8d:
            r10.mBlockParentIntercept = r1
            r1 = r3
            goto L92
        L91:
            r1 = r11
        L92:
            android.view.GestureDetector r11 = r10.mGestureDetector
            if (r11 == 0) goto L9d
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L9d
            r1 = 1
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setAllowParentInterceptOnEdge(boolean z3) {
        this.mAllowParentInterceptOnEdge = z3;
    }

    public void setBaseRotation(float f4) {
        this.mBaseRotation = f4 % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        ImageView imageView = getImageView();
        if (imageView == null || imageView.getDrawable() == null) {
            return false;
        }
        this.mSuppMatrix.set(matrix);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
        return true;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMaximumScale(float f4) {
        checkZoomLevels(this.mMinScale, this.mMidScale, f4);
        this.mMaxScale = f4;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMediumScale(float f4) {
        checkZoomLevels(this.mMinScale, f4, this.mMaxScale);
        this.mMidScale = f4;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setMinimumScale(float f4) {
        checkZoomLevels(f4, this.mMidScale, this.mMaxScale);
        this.mMinScale = f4;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.mGestureDetector.setOnDoubleTapListener(new DefaultOnDoubleTapListener(this));
        }
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnScaleChangeListener(OnScaleChangeListener onScaleChangeListener) {
        this.mScaleChangeListener = onScaleChangeListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.mSingleFlingListener = onSingleFlingListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setRotationBy(float f4) {
        this.mSuppMatrix.postRotate(f4 % 360.0f);
        checkAndDisplayMatrix();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setRotationTo(float f4) {
        this.mSuppMatrix.setRotate(f4 % 360.0f);
        checkAndDisplayMatrix();
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4) {
        setScale(f4, false);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScaleLevels(float f4, float f5, float f6) {
        checkZoomLevels(f4, f5, f6);
        this.mMinScale = f4;
        this.mMidScale = f5;
        this.mMaxScale = f6;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setZoomTransitionDuration(int i4) {
        if (i4 < 0) {
            i4 = 200;
        }
        this.ZOOM_DURATION = i4;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setZoomable(boolean z3) {
        this.mZoomEnabled = z3;
        update();
    }

    public void update() {
        ImageView imageView = getImageView();
        if (imageView != null) {
            if (!this.mZoomEnabled) {
                resetMatrix();
            } else {
                setImageViewScaleTypeMatrix(imageView);
                updateBaseMatrix(imageView.getDrawable());
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView, boolean z3) {
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        this.ZOOM_DURATION = 200;
        this.mMinScale = 1.0f;
        this.mMidScale = 1.75f;
        this.mMaxScale = 3.0f;
        this.mAllowParentInterceptOnEdge = true;
        this.mBlockParentIntercept = false;
        this.mBaseMatrix = new Matrix();
        this.mDrawMatrix = new Matrix();
        this.mSuppMatrix = new Matrix();
        this.mDisplayRect = new RectF();
        this.mMatrixValues = new float[9];
        this.mScrollEdge = 2;
        this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        this.mImageView = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        setImageViewScaleTypeMatrix(imageView);
        this.mScaleDragDetector = VersionedGestureDetector.newInstance(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
                if (PhotoViewAttacher.this.mSingleFlingListener == null || PhotoViewAttacher.this.getScale() > 1.0f || C0347j.m1947a(motionEvent) > PhotoViewAttacher.SINGLE_TOUCH || C0347j.m1947a(motionEvent2) > PhotoViewAttacher.SINGLE_TOUCH) {
                    return false;
                }
                return PhotoViewAttacher.this.mSingleFlingListener.onFling(motionEvent, motionEvent2, f4, f5);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mLongClickListener != null && PhotoViewAttacher.this.getImageView().getY() == IGoodView.DEFAULT_TO_ALPHA && PhotoViewAttacher.this.getImageView().getX() == IGoodView.DEFAULT_TO_ALPHA) {
                    PhotoViewAttacher.this.mLongClickListener.onLongClick(PhotoViewAttacher.this.getImageView());
                }
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new DefaultOnDoubleTapListener(this));
        this.mBaseRotation = IGoodView.DEFAULT_TO_ALPHA;
        setZoomable(z3);
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4, boolean z3) {
        if (getImageView() != null) {
            setScale(f4, r0.getRight() / 2.0f, r0.getBottom() / 2.0f, z3);
        }
    }

    private RectF getDisplayRect(Matrix matrix) {
        Drawable drawable;
        ImageView imageView = getImageView();
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        this.mDisplayRect.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    @Override // com.xuexiang.xui.widget.imageview.photoview.IPhotoView
    public void setScale(float f4, float f5, float f6, boolean z3) {
        ImageView imageView = getImageView();
        if (imageView != null) {
            if (f4 < this.mMinScale || f4 > this.mMaxScale) {
                UILog.iTag(LOG_TAG, "Scale must be within the range of minScale and maxScale");
            } else if (z3) {
                imageView.post(new AnimatedZoomRunnable(getScale(), f4, f5, f6));
            } else {
                this.mSuppMatrix.setScale(f4, f4, f5, f6);
                checkAndDisplayMatrix();
            }
        }
    }
}
