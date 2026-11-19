package com.xuexiang.xui.widget.textview.badge;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Random;

/* loaded from: classes.dex */
public class BadgeAnimator extends ValueAnimator {
    private BitmapFragment[][] mFragments;
    private WeakReference<BadgeView> mWeakBadge;

    private static class BitmapFragment {
        int color;
        int maxSize;
        Paint paint;
        Random random;
        float size;

        /* renamed from: x */
        float f9698x;

        /* renamed from: y */
        float f9699y;

        public BitmapFragment() {
            Paint paint = new Paint();
            this.paint = paint;
            paint.setAntiAlias(true);
            this.paint.setStyle(Paint.Style.FILL);
            this.random = new Random();
        }

        public void update(float f4, Canvas canvas) {
            this.paint.setColor(this.color);
            this.f9698x += this.random.nextInt(this.maxSize) * 0.1f * (this.random.nextFloat() - 0.5f);
            float fNextInt = this.f9699y + (this.random.nextInt(this.maxSize) * 0.1f * (this.random.nextFloat() - 0.5f));
            this.f9699y = fNextInt;
            float f5 = this.f9698x;
            float f6 = this.size;
            canvas.drawCircle(f5, fNextInt, f6 - (f4 * f6), this.paint);
        }
    }

    public BadgeAnimator(Bitmap bitmap, PointF pointF, BadgeView badgeView) {
        this.mWeakBadge = new WeakReference<>(badgeView);
        setFloatValues(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        setDuration(500L);
        this.mFragments = getFragments(bitmap, pointF);
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.textview.badge.BadgeAnimator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BadgeView badgeView2 = (BadgeView) BadgeAnimator.this.mWeakBadge.get();
                if (badgeView2 == null || !badgeView2.isShown()) {
                    BadgeAnimator.this.cancel();
                } else {
                    badgeView2.invalidate();
                }
            }
        });
        addListener(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.textview.badge.BadgeAnimator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BadgeView badgeView2 = (BadgeView) BadgeAnimator.this.mWeakBadge.get();
                if (badgeView2 != null) {
                    badgeView2.reset();
                }
            }
        });
    }

    private BitmapFragment[][] getFragments(Bitmap bitmap, PointF pointF) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fMin = Math.min(width, height) / 6.0f;
        float width2 = pointF.x - (bitmap.getWidth() / 2.0f);
        float height2 = pointF.y - (bitmap.getHeight() / 2.0f);
        BitmapFragment[][] bitmapFragmentArr = (BitmapFragment[][]) Array.newInstance((Class<?>) BitmapFragment.class, (int) (height / fMin), (int) (width / fMin));
        for (int i4 = 0; i4 < bitmapFragmentArr.length; i4++) {
            for (int i5 = 0; i5 < bitmapFragmentArr[i4].length; i5++) {
                BitmapFragment bitmapFragment = new BitmapFragment();
                float f4 = i5 * fMin;
                float f5 = i4 * fMin;
                bitmapFragment.color = bitmap.getPixel((int) f4, (int) f5);
                bitmapFragment.f9698x = f4 + width2;
                bitmapFragment.f9699y = f5 + height2;
                bitmapFragment.size = fMin;
                bitmapFragment.maxSize = Math.max(width, height);
                bitmapFragmentArr[i4][i5] = bitmapFragment;
            }
        }
        bitmap.recycle();
        return bitmapFragmentArr;
    }

    public void draw(Canvas canvas) {
        for (BitmapFragment[] bitmapFragmentArr : this.mFragments) {
            for (BitmapFragment bitmapFragment : bitmapFragmentArr) {
                bitmapFragment.update(Float.parseFloat(getAnimatedValue().toString()), canvas);
            }
        }
    }
}
