package com.blankj.utilcode.util;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.ShadowUtils;

/* loaded from: classes3.dex */
public class ClickUtils {
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final float PRESSED_BG_ALPHA_DEFAULT_VALUE = 0.9f;
    private static final int PRESSED_BG_ALPHA_STYLE = 4;
    private static final float PRESSED_BG_DARK_DEFAULT_VALUE = 0.9f;
    private static final int PRESSED_BG_DARK_STYLE = 5;
    private static final float PRESSED_VIEW_ALPHA_DEFAULT_VALUE = 0.8f;
    private static final int PRESSED_VIEW_ALPHA_SRC_TAG = -3;
    private static final int PRESSED_VIEW_ALPHA_TAG = -2;
    private static final float PRESSED_VIEW_SCALE_DEFAULT_VALUE = -0.06f;
    private static final int PRESSED_VIEW_SCALE_TAG = -1;
    private static final long TIP_DURATION = 2000;
    private static int sClickCount;
    private static long sLastClickMillis;

    public interface Back2HomeFriendlyListener {
        public static final Back2HomeFriendlyListener DEFAULT = new Back2HomeFriendlyListener() { // from class: com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener.1
            @Override // com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener
            public void dismiss() {
                UtilsBridge.toastCancel();
            }

            @Override // com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener
            public void show(CharSequence charSequence, long j10) {
                UtilsBridge.toastShowShort(charSequence);
            }
        };

        void dismiss();

        void show(CharSequence charSequence, long j10);
    }

    public static class ClickDrawableWrapper extends ShadowUtils.DrawableWrapper {
        private BitmapDrawable mBitmapDrawable;
        private Paint mColorPaint;

        public ClickDrawableWrapper(Drawable drawable) {
            super(drawable);
            this.mBitmapDrawable = null;
            this.mColorPaint = null;
            if (drawable instanceof ColorDrawable) {
                Paint paint = new Paint(5);
                this.mColorPaint = paint;
                paint.setColor(((ColorDrawable) drawable).getColor());
            }
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.mBitmapDrawable == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                if (this.mColorPaint != null) {
                    canvas2.drawRect(getBounds(), this.mColorPaint);
                } else {
                    super.draw(canvas2);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), bitmapCreateBitmap);
                this.mBitmapDrawable = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
            }
            this.mBitmapDrawable.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            super.setAlpha(i10);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }
    }

    public static abstract class OnDebouncingClickListener implements View.OnClickListener {
        private static final Runnable ENABLE_AGAIN = new Runnable() { // from class: com.blankj.utilcode.util.ClickUtils.OnDebouncingClickListener.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = OnDebouncingClickListener.mEnabled = true;
            }
        };
        private static boolean mEnabled = true;
        private long mDuration;
        private boolean mIsGlobal;

        public OnDebouncingClickListener() {
            this(true, 1000L);
        }

        private static boolean isValid(@NonNull View view, long j10) {
            return UtilsBridge.isValid(view, j10);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!this.mIsGlobal) {
                if (isValid(view, this.mDuration)) {
                    onDebouncingClick(view);
                }
            } else if (mEnabled) {
                mEnabled = false;
                view.postDelayed(ENABLE_AGAIN, this.mDuration);
                onDebouncingClick(view);
            }
        }

        public abstract void onDebouncingClick(View view);

        public OnDebouncingClickListener(boolean z10) {
            this(z10, 1000L);
        }

        public OnDebouncingClickListener(long j10) {
            this(true, j10);
        }

        public OnDebouncingClickListener(boolean z10, long j10) {
            this.mIsGlobal = z10;
            this.mDuration = j10;
        }
    }

    public static abstract class OnMultiClickListener implements View.OnClickListener {
        private static final long INTERVAL_DEFAULT_VALUE = 666;
        private int mClickCount;
        private final long mClickInterval;
        private long mLastClickTime;
        private final int mTriggerClickCount;

        public OnMultiClickListener(int i10) {
            this(i10, INTERVAL_DEFAULT_VALUE);
        }

        public abstract void onBeforeTriggerClick(View view, int i10);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.mTriggerClickCount <= 1) {
                onTriggerClick(view);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.mLastClickTime < this.mClickInterval) {
                int i10 = this.mClickCount + 1;
                this.mClickCount = i10;
                int i11 = this.mTriggerClickCount;
                if (i10 == i11) {
                    onTriggerClick(view);
                } else if (i10 < i11) {
                    onBeforeTriggerClick(view, i10);
                } else {
                    this.mClickCount = 1;
                    onBeforeTriggerClick(view, 1);
                }
            } else {
                this.mClickCount = 1;
                onBeforeTriggerClick(view, 1);
            }
            this.mLastClickTime = jCurrentTimeMillis;
        }

        public abstract void onTriggerClick(View view);

        public OnMultiClickListener(int i10, long j10) {
            this.mTriggerClickCount = i10;
            this.mClickInterval = j10;
        }
    }

    public static class OnUtilsTouchListener implements View.OnTouchListener {

        public static class LazyHolder {
            private static final OnUtilsTouchListener INSTANCE = new OnUtilsTouchListener();

            private LazyHolder() {
            }
        }

        public static OnUtilsTouchListener getInstance() {
            return LazyHolder.INSTANCE;
        }

        private void processAlpha(View view, boolean z10) {
            Object tag = view.getTag(z10 ? -2 : -3);
            if (tag instanceof Float) {
                view.setAlpha(((Float) tag).floatValue());
            }
        }

        private void processScale(View view, boolean z10) {
            Object tag = view.getTag(-1);
            if (tag instanceof Float) {
                float fFloatValue = z10 ? 1.0f + ((Float) tag).floatValue() : 1.0f;
                view.animate().scaleX(fFloatValue).scaleY(fFloatValue).setDuration(200L).start();
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                processScale(view, true);
                processAlpha(view, true);
            } else if (action == 1 || action == 3) {
                processScale(view, false);
                processAlpha(view, false);
            }
            return false;
        }

        private OnUtilsTouchListener() {
        }
    }

    private ClickUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void applyDebouncing(View[] viewArr, boolean z10, @IntRange(from = 0) long j10, final View.OnClickListener onClickListener) {
        if (viewArr == null || viewArr.length == 0 || onClickListener == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(new OnDebouncingClickListener(z10, j10) { // from class: com.blankj.utilcode.util.ClickUtils.1
                    @Override // com.blankj.utilcode.util.ClickUtils.OnDebouncingClickListener
                    public void onDebouncingClick(View view2) {
                        onClickListener.onClick(view2);
                    }
                });
            }
        }
    }

    public static void applyGlobalDebouncing(View view, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, onClickListener);
    }

    public static void applyPressedBgAlpha(View view) {
        applyPressedBgAlpha(view, 0.9f);
    }

    public static void applyPressedBgDark(View view) {
        applyPressedBgDark(view, 0.9f);
    }

    private static void applyPressedBgStyle(View view, int i10, float f10) {
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        int i11 = -i10;
        Object tag = view.getTag(i11);
        if (tag instanceof Drawable) {
            ViewCompat.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable drawableCreateStyleDrawable = createStyleDrawable(background, i10, f10);
        ViewCompat.setBackground(view, drawableCreateStyleDrawable);
        view.setTag(i11, drawableCreateStyleDrawable);
    }

    public static void applyPressedViewAlpha(View... viewArr) {
        applyPressedViewAlpha(viewArr, (float[]) null);
    }

    public static void applyPressedViewScale(View... viewArr) {
        applyPressedViewScale(viewArr, (float[]) null);
    }

    public static void applySingleDebouncing(View view, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, onClickListener);
    }

    public static void back2HomeFriendly(CharSequence charSequence) {
        back2HomeFriendly(charSequence, TIP_DURATION, Back2HomeFriendlyListener.DEFAULT);
    }

    private static Drawable createAlphaDrawable(Drawable drawable, float f10) {
        ClickDrawableWrapper clickDrawableWrapper = new ClickDrawableWrapper(drawable);
        clickDrawableWrapper.setAlpha((int) (f10 * 255.0f));
        return clickDrawableWrapper;
    }

    private static Drawable createDarkDrawable(Drawable drawable, float f10) {
        ClickDrawableWrapper clickDrawableWrapper = new ClickDrawableWrapper(drawable);
        clickDrawableWrapper.setColorFilter(getDarkColorFilter(f10));
        return clickDrawableWrapper;
    }

    private static Drawable createStyleDrawable(Drawable drawable, int i10, float f10) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (drawable.getConstantState() == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.getConstantState().newDrawable().mutate();
        if (i10 == 4) {
            drawableMutate = createAlphaDrawable(drawableMutate, f10);
        } else if (i10 == 5) {
            drawableMutate = createDarkDrawable(drawableMutate, f10);
        }
        Drawable drawableCreateAlphaDrawable = createAlphaDrawable(drawable.getConstantState().newDrawable().mutate(), 0.5f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableMutate);
        stateListDrawable.addState(new int[]{-16842910}, drawableCreateAlphaDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    public static void expandClickArea(@NonNull View view, int i10) {
        expandClickArea(view, i10, i10, i10, i10);
    }

    private static ColorMatrixColorFilter getDarkColorFilter(float f10) {
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f}));
    }

    public static void applyGlobalDebouncing(View view, @IntRange(from = 0) long j10, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, j10, onClickListener);
    }

    public static void applyPressedBgAlpha(View view, float f10) {
        applyPressedBgStyle(view, 4, f10);
    }

    public static void applyPressedBgDark(View view, float f10) {
        applyPressedBgStyle(view, 5, f10);
    }

    public static void applyPressedViewAlpha(View[] viewArr, float[] fArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            if (fArr == null || i10 >= fArr.length) {
                applyPressedViewAlpha(viewArr[i10], 0.8f);
            } else {
                applyPressedViewAlpha(viewArr[i10], fArr[i10]);
            }
        }
    }

    public static void applyPressedViewScale(View[] viewArr, float[] fArr) {
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            if (fArr == null || i10 >= fArr.length) {
                applyPressedViewScale(viewArr[i10], PRESSED_VIEW_SCALE_DEFAULT_VALUE);
            } else {
                applyPressedViewScale(viewArr[i10], fArr[i10]);
            }
        }
    }

    public static void applySingleDebouncing(View view, @IntRange(from = 0) long j10, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, j10, onClickListener);
    }

    public static void back2HomeFriendly(@NonNull CharSequence charSequence, long j10, @NonNull Back2HomeFriendlyListener back2HomeFriendlyListener) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(jElapsedRealtime - sLastClickMillis) >= j10) {
            sClickCount = 1;
            back2HomeFriendlyListener.show(charSequence, j10);
            sLastClickMillis = jElapsedRealtime;
            return;
        }
        int i10 = sClickCount + 1;
        sClickCount = i10;
        if (i10 == 2) {
            UtilsBridge.startHomeActivity();
            back2HomeFriendlyListener.dismiss();
            sLastClickMillis = 0L;
        }
    }

    public static void expandClickArea(@NonNull final View view, final int i10, final int i11, final int i12, final int i13) {
        final View view2 = (View) view.getParent();
        if (view2 == null) {
            Log.e("ClickUtils", "expandClickArea must have parent view.");
        } else {
            view2.post(new Runnable() { // from class: com.blankj.utilcode.util.ClickUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i10;
                    rect.bottom += i13;
                    rect.left -= i11;
                    rect.right += i12;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    public static void applyGlobalDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(viewArr, 1000L, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applySingleDebouncing(viewArr, 1000L, onClickListener);
    }

    public static void applyGlobalDebouncing(View[] viewArr, @IntRange(from = 0) long j10, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, true, j10, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, @IntRange(from = 0) long j10, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, false, j10, onClickListener);
    }

    public static void applyPressedViewAlpha(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setTag(-2, Float.valueOf(f10));
        view.setTag(-3, Float.valueOf(view.getAlpha()));
        view.setClickable(true);
        view.setOnTouchListener(OnUtilsTouchListener.getInstance());
    }

    public static void applyPressedViewScale(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setTag(-1, Float.valueOf(f10));
        view.setClickable(true);
        view.setOnTouchListener(OnUtilsTouchListener.getInstance());
    }
}
