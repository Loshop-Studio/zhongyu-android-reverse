package com.xuexiang.xui.widget.imageview.photoview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class DefaultOnDoubleTapListener implements GestureDetector.OnDoubleTapListener {
    private PhotoViewAttacher photoViewAttacher;

    public DefaultOnDoubleTapListener(PhotoViewAttacher photoViewAttacher) {
        setPhotoViewAttacher(photoViewAttacher);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        PhotoViewAttacher photoViewAttacher = this.photoViewAttacher;
        if (photoViewAttacher == null) {
            return false;
        }
        try {
            float scale = photoViewAttacher.getScale();
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (scale < this.photoViewAttacher.getMediumScale()) {
                PhotoViewAttacher photoViewAttacher2 = this.photoViewAttacher;
                photoViewAttacher2.setScale(photoViewAttacher2.getMediumScale(), x3, y3, true);
            } else if (scale < this.photoViewAttacher.getMediumScale() || scale >= this.photoViewAttacher.getMaximumScale()) {
                PhotoViewAttacher photoViewAttacher3 = this.photoViewAttacher;
                photoViewAttacher3.setScale(photoViewAttacher3.getMinimumScale(), x3, y3, true);
            } else {
                PhotoViewAttacher photoViewAttacher4 = this.photoViewAttacher;
                photoViewAttacher4.setScale(photoViewAttacher4.getMaximumScale(), x3, y3, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF displayRect;
        PhotoViewAttacher photoViewAttacher = this.photoViewAttacher;
        if (photoViewAttacher == null) {
            return false;
        }
        ImageView imageView = photoViewAttacher.getImageView();
        if (this.photoViewAttacher.getOnPhotoTapListener() != null && (displayRect = this.photoViewAttacher.getDisplayRect()) != null) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (displayRect.contains(x3, y3)) {
                this.photoViewAttacher.getOnPhotoTapListener().onPhotoTap(imageView, (x3 - displayRect.left) / displayRect.width(), (y3 - displayRect.top) / displayRect.height());
                return true;
            }
            this.photoViewAttacher.getOnPhotoTapListener().onOutsidePhotoTap();
        }
        if (this.photoViewAttacher.getOnViewTapListener() != null) {
            this.photoViewAttacher.getOnViewTapListener().onViewTap(imageView, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    public void setPhotoViewAttacher(PhotoViewAttacher photoViewAttacher) {
        this.photoViewAttacher = photoViewAttacher;
    }
}
