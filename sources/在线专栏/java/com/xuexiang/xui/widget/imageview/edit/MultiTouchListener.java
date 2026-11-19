package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class MultiTouchListener implements View.OnTouchListener {
    private static final int INVALID_POINTER_ID = -1;
    private View deleteView;
    private final GestureDetector mGestureListener;
    private boolean mIsTextPinchZoomable;
    private OnGestureControl mOnGestureControl;
    private OnPhotoEditorListener mOnPhotoEditorListener;
    private float mPrevX;
    private float mPrevY;
    private ScaleGestureDetector mScaleGestureDetector;
    private OnMultiTouchListener onMultiTouchListener;
    private Rect outRect;
    private ImageView photoEditImageView;
    private boolean isTranslateEnabled = true;
    private int mActivePointerId = -1;
    private int[] location = new int[2];

    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (MultiTouchListener.this.mOnGestureControl != null) {
                MultiTouchListener.this.mOnGestureControl.onLongClick();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (MultiTouchListener.this.mOnGestureControl == null) {
                return true;
            }
            MultiTouchListener.this.mOnGestureControl.onClick();
            return true;
        }
    }

    interface OnGestureControl {
        void onClick();

        void onLongClick();
    }

    interface OnMultiTouchListener {
        void onEditTextClickListener(String str, int i4);

        void onRemoveViewListener(View view);
    }

    private class ScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private float mPivotX;
        private float mPivotY;
        private Vector2D mPrevSpanVector;

        private ScaleGestureListener() {
            this.mPrevSpanVector = new Vector2D();
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.SimpleOnScaleGestureListener, com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(View view, ScaleGestureDetector scaleGestureDetector) {
            TransformInfo transformInfo = new TransformInfo();
            transformInfo.deltaScale = scaleGestureDetector.getScaleFactor();
            transformInfo.deltaAngle = Vector2D.getAngle(this.mPrevSpanVector, scaleGestureDetector.getCurrentSpanVector());
            boolean z3 = MultiTouchListener.this.isTranslateEnabled;
            float focusY = IGoodView.DEFAULT_TO_ALPHA;
            transformInfo.deltaX = z3 ? scaleGestureDetector.getFocusX() - this.mPivotX : IGoodView.DEFAULT_TO_ALPHA;
            if (MultiTouchListener.this.isTranslateEnabled) {
                focusY = scaleGestureDetector.getFocusY() - this.mPivotY;
            }
            transformInfo.deltaY = focusY;
            transformInfo.pivotX = this.mPivotX;
            transformInfo.pivotY = this.mPivotY;
            transformInfo.minimumScale = 0.5f;
            transformInfo.maximumScale = 10.0f;
            MultiTouchListener.move(view, transformInfo);
            return !MultiTouchListener.this.mIsTextPinchZoomable;
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.SimpleOnScaleGestureListener, com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(View view, ScaleGestureDetector scaleGestureDetector) {
            this.mPivotX = scaleGestureDetector.getFocusX();
            this.mPivotY = scaleGestureDetector.getFocusY();
            this.mPrevSpanVector.set(scaleGestureDetector.getCurrentSpanVector());
            return MultiTouchListener.this.mIsTextPinchZoomable;
        }
    }

    private static class TransformInfo {
        float deltaAngle;
        float deltaScale;
        float deltaX;
        float deltaY;
        float maximumScale;
        float minimumScale;
        float pivotX;
        float pivotY;

        private TransformInfo() {
        }
    }

    MultiTouchListener(View view, RelativeLayout relativeLayout, ImageView imageView, boolean z3, OnPhotoEditorListener onPhotoEditorListener) {
        this.mIsTextPinchZoomable = z3;
        this.mScaleGestureDetector = new ScaleGestureDetector(new ScaleGestureListener());
        this.mGestureListener = new GestureDetector(new GestureListener());
        this.deleteView = view;
        this.photoEditImageView = imageView;
        this.mOnPhotoEditorListener = onPhotoEditorListener;
        if (view != null) {
            this.outRect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            this.outRect = new Rect(0, 0, 0, 0);
        }
    }

    private static float adjustAngle(float f4) {
        return f4 > 180.0f ? f4 - 360.0f : f4 < -180.0f ? f4 + 360.0f : f4;
    }

    private static void adjustTranslation(View view, float f4, float f5) {
        float[] fArr = {f4, f5};
        view.getMatrix().mapVectors(fArr);
        view.setTranslationX(view.getTranslationX() + fArr[0]);
        view.setTranslationY(view.getTranslationY() + fArr[1]);
    }

    private static void computeRenderOffset(View view, float f4, float f5) {
        if (view.getPivotX() == f4 && view.getPivotY() == f5) {
            return;
        }
        float[] fArr = {IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};
        view.getMatrix().mapPoints(fArr);
        view.setPivotX(f4);
        view.setPivotY(f5);
        float[] fArr2 = {IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};
        view.getMatrix().mapPoints(fArr2);
        float f6 = fArr2[0] - fArr[0];
        float f7 = fArr2[1] - fArr[1];
        view.setTranslationX(view.getTranslationX() - f6);
        view.setTranslationY(view.getTranslationY() - f7);
    }

    private void firePhotoEditorSDKListener(View view, boolean z3) {
        Object tag = view.getTag();
        OnPhotoEditorListener onPhotoEditorListener = this.mOnPhotoEditorListener;
        if (onPhotoEditorListener == null || tag == null || !(tag instanceof ViewType)) {
            return;
        }
        if (z3) {
            onPhotoEditorListener.onStartViewChangeListener((ViewType) view.getTag());
        } else {
            onPhotoEditorListener.onStopViewChangeListener((ViewType) view.getTag());
        }
    }

    private boolean isViewInBounds(View view, int i4, int i5) {
        view.getDrawingRect(this.outRect);
        view.getLocationOnScreen(this.location);
        Rect rect = this.outRect;
        int[] iArr = this.location;
        rect.offset(iArr[0], iArr[1]);
        return this.outRect.contains(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void move(View view, TransformInfo transformInfo) {
        computeRenderOffset(view, transformInfo.pivotX, transformInfo.pivotY);
        adjustTranslation(view, transformInfo.deltaX, transformInfo.deltaY);
        float fMax = Math.max(transformInfo.minimumScale, Math.min(transformInfo.maximumScale, view.getScaleX() * transformInfo.deltaScale));
        view.setScaleX(fMax);
        view.setScaleY(fMax);
        view.setRotation(adjustAngle(view.getRotation() + transformInfo.deltaAngle));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.mScaleGestureDetector.onTouchEvent(view, motionEvent);
        this.mGestureListener.onTouchEvent(motionEvent);
        if (!this.isTranslateEnabled) {
            return true;
        }
        int action = motionEvent.getAction();
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked() & action;
        if (actionMasked == 0) {
            this.mPrevX = motionEvent.getX();
            this.mPrevY = motionEvent.getY();
            motionEvent.getRawX();
            motionEvent.getRawY();
            this.mActivePointerId = motionEvent.getPointerId(0);
            View view2 = this.deleteView;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            view.bringToFront();
            firePhotoEditorSDKListener(view, true);
        } else if (actionMasked == 1) {
            this.mActivePointerId = -1;
            View view3 = this.deleteView;
            if (view3 != null && isViewInBounds(view3, rawX, rawY)) {
                OnMultiTouchListener onMultiTouchListener = this.onMultiTouchListener;
                if (onMultiTouchListener != null) {
                    onMultiTouchListener.onRemoveViewListener(view);
                }
            } else if (!isViewInBounds(this.photoEditImageView, rawX, rawY)) {
                view.animate().translationY(IGoodView.DEFAULT_TO_ALPHA).translationY(IGoodView.DEFAULT_TO_ALPHA);
            }
            View view4 = this.deleteView;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            firePhotoEditorSDKListener(view, false);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (iFindPointerIndex != -1) {
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                if (!this.mScaleGestureDetector.isInProgress()) {
                    adjustTranslation(view, x3 - this.mPrevX, y3 - this.mPrevY);
                }
            }
        } else if (actionMasked == 3) {
            this.mActivePointerId = -1;
        } else if (actionMasked == 6) {
            int i4 = (65280 & action) >> 8;
            if (motionEvent.getPointerId(i4) == this.mActivePointerId) {
                int i5 = i4 == 0 ? 1 : 0;
                this.mPrevX = motionEvent.getX(i5);
                this.mPrevY = motionEvent.getY(i5);
                this.mActivePointerId = motionEvent.getPointerId(i5);
            }
        }
        return true;
    }

    void setOnGestureControl(OnGestureControl onGestureControl) {
        this.mOnGestureControl = onGestureControl;
    }

    void setOnMultiTouchListener(OnMultiTouchListener onMultiTouchListener) {
        this.onMultiTouchListener = onMultiTouchListener;
    }
}
