package com.xuexiang.xui.utils;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.C0332a;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.taobao.accs.ErrorCode;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.widget.imageview.ImageLoader;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ViewUtils {
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(1);
    private static final int[] APPCOMPAT_CHECK_ATTRS = {C2042R.attr.colorPrimary};

    /* renamed from: com.xuexiang.xui.utils.ViewUtils$9 */
    static /* synthetic */ class C20639 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction = iArr;
            try {
                iArr[Direction.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction[Direction.TOP_TO_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction[Direction.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction[Direction.BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Direction {
        LEFT_TO_RIGHT,
        TOP_TO_BOTTOM,
        RIGHT_TO_LEFT,
        BOTTOM_TO_TOP
    }

    private static class ViewGroupHelper {
        private static final ThreadLocal<Matrix> MATRIX_THREAD_LOCAL = new ThreadLocal<>();
        private static final ThreadLocal<RectF> RECT_F_THREAD_LOCAL = new ThreadLocal<>();

        private ViewGroupHelper() {
        }

        static void offsetDescendantMatrix(ViewParent viewParent, View view, Matrix matrix) {
            Object parent = view.getParent();
            if ((parent instanceof View) && parent != viewParent) {
                offsetDescendantMatrix(viewParent, (View) parent, matrix);
                matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
            }
            matrix.preTranslate(view.getLeft(), view.getTop());
            if (view.getMatrix().isIdentity()) {
                return;
            }
            matrix.preConcat(view.getMatrix());
        }

        public static void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
            ThreadLocal<Matrix> threadLocal = MATRIX_THREAD_LOCAL;
            Matrix matrix = threadLocal.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal.set(matrix);
            } else {
                matrix.reset();
            }
            offsetDescendantMatrix(viewGroup, view, matrix);
            ThreadLocal<RectF> threadLocal2 = RECT_F_THREAD_LOCAL;
            RectF rectF = threadLocal2.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal2.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
        }
    }

    private ViewUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Rect calculateViewScreenLocation(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static void checkAppCompatTheme(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(APPCOMPAT_CHECK_ATTRS);
        boolean z3 = !typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (z3) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }

    public static void clearAllViewLongClick(View view) {
        if (view == null) {
            return;
        }
        if (!(view instanceof ViewGroup)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xuexiang.xui.utils.ViewUtils.8
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    return true;
                }
            });
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            clearAllViewLongClick(viewGroup.getChildAt(i4));
        }
    }

    public static void clearValueAnimator(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            animator.pause();
            animator.cancel();
        }
    }

    public static void clearViewLongClick(View view, int... iArr) {
        if (view == null || iArr == null || iArr.length == 0) {
            return;
        }
        for (int i4 : iArr) {
            View viewFindViewById = view.findViewById(i4);
            if (viewFindViewById != null) {
                viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xuexiang.xui.utils.ViewUtils.7
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        return true;
                    }
                });
            }
        }
    }

    public static void expendTouchArea(final View view, final int i4) {
        if (view != null) {
            final View view2 = (View) view.getParent();
            view2.post(new Runnable() { // from class: com.xuexiang.xui.utils.ViewUtils.6
                @Override // java.lang.Runnable
                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int i5 = rect.left;
                    int i6 = i4;
                    rect.left = i5 - i6;
                    rect.top -= i6;
                    rect.right += i6;
                    rect.bottom += i6;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    public static AlphaAnimation fadeIn(View view, int i4, Animation.AnimationListener animationListener) {
        return fadeIn(view, i4, animationListener, true);
    }

    public static AlphaAnimation fadeOut(View view, int i4, Animation.AnimationListener animationListener) {
        return fadeOut(view, i4, animationListener, true);
    }

    public static View findViewFromViewStub(View view, int i4, int i5) {
        if (view == null) {
            return null;
        }
        View viewFindViewById = view.findViewById(i5);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(i4);
        if (viewStub == null) {
            return null;
        }
        View viewInflate = viewStub.inflate();
        return viewInflate != null ? viewInflate.findViewById(i5) : viewInflate;
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static View getActivityRoot(Activity activity) {
        return ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
    }

    public static void getDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ViewGroupHelper.offsetDescendantRect(viewGroup, view, rect);
    }

    public static boolean getIsLastLineSpacingExtraError() {
        return false;
    }

    public static boolean isListViewAlreadyAtBottom(ListView listView) {
        View childAt;
        return (listView.getAdapter() == null || listView.getHeight() == 0 || listView.getLastVisiblePosition() != listView.getAdapter().getCount() - 1 || (childAt = listView.getChildAt(listView.getChildCount() - 1)) == null || childAt.getBottom() != listView.getHeight()) ? false : true;
    }

    public static void playBackgroundBlinkAnimation(View view, int i4) {
        if (view == null) {
            return;
        }
        playViewBackgroundAnimation(view, i4, new int[]{0, 255, 0}, ErrorCode.APP_NOT_BIND);
    }

    public static Animator playViewBackgroundAnimation(final View view, int i4, int[] iArr, int i5, final Runnable runnable) {
        int length = iArr.length - 1;
        ColorDrawable colorDrawable = new ColorDrawable(i4);
        final Drawable background = view.getBackground();
        setBackgroundKeepingPadding(view, colorDrawable);
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 < length) {
            i6++;
            arrayList.add(ObjectAnimator.ofInt(view.getBackground(), "alpha", iArr[i6], iArr[i6]));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(i5);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.utils.ViewUtils.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewUtils.setBackgroundKeepingPadding(view, background);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.playSequentially(arrayList);
        animatorSet.start();
        return animatorSet;
    }

    public static void requestApplyInsets(Window window) {
        window.getDecorView().requestApplyInsets();
    }

    public static void safeSetImageViewSelected(ImageView imageView, boolean z3) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        imageView.setSelected(z3);
        if (drawable.getIntrinsicWidth() == intrinsicWidth && drawable.getIntrinsicHeight() == intrinsicHeight) {
            return;
        }
        imageView.requestLayout();
    }

    @TargetApi(16)
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundColorKeepPadding(View view, int i4) {
        int[] iArr = {view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        view.setBackgroundColor(i4);
        view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static void setBackgroundKeepingPadding(View view, Drawable drawable) {
        int[] iArr = {view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        setBackground(view, drawable);
        view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static void setChecked(CompoundButton compoundButton, boolean z3) {
        if (compoundButton != null) {
            compoundButton.setChecked(z3);
        }
    }

    public static void setCheckedSilent(CompoundButton compoundButton, boolean z3, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(null);
            compoundButton.setChecked(z3);
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public static void setEnabled(View view, boolean z3) {
        if (view != null) {
            view.setEnabled(z3);
            if (view instanceof EditText) {
                view.setFocusable(z3);
                view.setFocusableInTouchMode(z3);
            }
        }
    }

    public static void setImageDrawable(ImageView imageView, Drawable drawable) {
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public static void setImageLevel(ImageView imageView, int i4) {
        if (imageView != null) {
            imageView.setImageLevel(i4);
        }
    }

    public static void setImageResource(ImageView imageView, int i4) {
        if (imageView != null) {
            imageView.setImageResource(i4);
        }
    }

    public static void setImageTint(ImageView imageView, ColorStateList colorStateList) {
        if (imageView != null) {
            imageView.setImageTintList(colorStateList);
        }
    }

    public static void setImageUri(ImageView imageView, Object obj) {
        if (imageView != null) {
            ImageLoader.get().loadImage(imageView, obj);
        }
    }

    public static ColorFilter setImageViewTintColor(ImageView imageView, int i4) {
        LightingColorFilter lightingColorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), i4);
        imageView.setColorFilter(lightingColorFilter);
        return lightingColorFilter;
    }

    public static void setOnCheckedChangeListener(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public static void setPadding(View view, int i4) {
        if (view != null) {
            view.setPadding(i4, i4, i4, i4);
        }
    }

    public static void setPaddingBottom(View view, int i4) {
        if (i4 != view.getPaddingBottom()) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
        }
    }

    public static void setPaddingEnd(View view, int i4) {
        if (i4 != view.getPaddingEnd()) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i4, view.getPaddingBottom());
        }
    }

    public static void setPaddingLeft(View view, int i4) {
        if (i4 != view.getPaddingLeft()) {
            view.setPadding(i4, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setPaddingRight(View view, int i4) {
        if (i4 != view.getPaddingRight()) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i4, view.getPaddingBottom());
        }
    }

    public static void setPaddingStart(View view, int i4) {
        if (i4 != view.getPaddingStart()) {
            view.setPaddingRelative(i4, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static void setPaddingTop(View view, int i4) {
        if (i4 != view.getPaddingTop()) {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void setText(TextView textView, String str) {
        if (textView != null) {
            textView.setText(str);
        }
    }

    public static void setToolbarLayoutTextFont(CollapsingToolbarLayout collapsingToolbarLayout) {
        setToolbarLayoutTextFont(collapsingToolbarLayout, XUI.getDefaultTypeface());
    }

    public static void setViewTextFont(View view, Typeface typeface) {
        if (view == null || typeface == null) {
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                setViewTextFont(viewGroup.getChildAt(i4), typeface);
            }
        }
    }

    public static void setViewsFont(Typeface typeface, View... viewArr) {
        if (typeface == null || viewArr == null || viewArr.length == 0) {
            return;
        }
        for (View view : viewArr) {
            setViewTextFont(view, typeface);
        }
    }

    public static void setVisibility(View view, boolean z3) {
        if (view != null) {
            view.setVisibility(z3 ? 0 : 8);
        }
    }

    public static TranslateAnimation slideIn(View view, int i4, Animation.AnimationListener animationListener, Direction direction) {
        return slideIn(view, i4, animationListener, true, direction);
    }

    public static TranslateAnimation slideOut(View view, int i4, Animation.AnimationListener animationListener, Direction direction) {
        return slideOut(view, i4, animationListener, true, direction);
    }

    public static void textColorId(TextView textView, int i4) {
        if (textView != null) {
            textView.setTextColor(C0332a.m1804b(textView.getContext(), i4));
        }
    }

    public static AlphaAnimation fadeIn(View view, int i4, Animation.AnimationListener animationListener, boolean z3) {
        if (view == null) {
            return null;
        }
        if (!z3) {
            view.setAlpha(1.0f);
            view.setVisibility(0);
            return null;
        }
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(i4);
        alphaAnimation.setFillAfter(true);
        if (animationListener != null) {
            alphaAnimation.setAnimationListener(animationListener);
        }
        view.startAnimation(alphaAnimation);
        return alphaAnimation;
    }

    public static AlphaAnimation fadeOut(final View view, int i4, final Animation.AnimationListener animationListener, boolean z3) {
        if (view == null) {
            return null;
        }
        if (!z3) {
            view.setVisibility(8);
            return null;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, IGoodView.DEFAULT_TO_ALPHA);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(i4);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.utils.ViewUtils.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationEnd(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationRepeat(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationStart(animation);
                }
            }
        });
        view.startAnimation(alphaAnimation);
        return alphaAnimation;
    }

    public static void setText(TextView textView, int i4) {
        if (textView != null) {
            textView.setText(i4);
        }
    }

    public static void setToolbarLayoutTextFont(CollapsingToolbarLayout collapsingToolbarLayout, Typeface typeface) {
        if (collapsingToolbarLayout == null || typeface == null) {
            return;
        }
        collapsingToolbarLayout.setExpandedTitleTypeface(typeface);
        collapsingToolbarLayout.setCollapsedTitleTypeface(typeface);
    }

    public static void setVisibility(View view, int i4) {
        if (view != null) {
            view.setVisibility(i4);
        }
    }

    public static TranslateAnimation slideIn(View view, int i4, Animation.AnimationListener animationListener, boolean z3, Direction direction) {
        TranslateAnimation translateAnimation = null;
        if (view == null) {
            return null;
        }
        if (!z3) {
            view.clearAnimation();
            view.setVisibility(0);
            return null;
        }
        int i5 = C20639.$SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction[direction.ordinal()];
        if (i5 == 1) {
            translateAnimation = new TranslateAnimation(1, -1.0f, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA);
        } else if (i5 == 2) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, -1.0f, 1, IGoodView.DEFAULT_TO_ALPHA);
        } else if (i5 == 3) {
            translateAnimation = new TranslateAnimation(1, 1.0f, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA);
        } else if (i5 == 4) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, 1.0f, 1, IGoodView.DEFAULT_TO_ALPHA);
        }
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(i4);
        translateAnimation.setFillAfter(true);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setVisibility(0);
        view.startAnimation(translateAnimation);
        return translateAnimation;
    }

    public static TranslateAnimation slideOut(final View view, int i4, final Animation.AnimationListener animationListener, boolean z3, Direction direction) {
        TranslateAnimation translateAnimation = null;
        if (view == null) {
            return null;
        }
        if (!z3) {
            view.clearAnimation();
            view.setVisibility(8);
            return null;
        }
        int i5 = C20639.$SwitchMap$com$xuexiang$xui$utils$ViewUtils$Direction[direction.ordinal()];
        if (i5 == 1) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, 1.0f, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA);
        } else if (i5 == 2) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, 1.0f);
        } else if (i5 == 3) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, -1.0f, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA);
        } else if (i5 == 4) {
            translateAnimation = new TranslateAnimation(1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, IGoodView.DEFAULT_TO_ALPHA, 1, -1.0f);
        }
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(i4);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.utils.ViewUtils.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationEnd(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationRepeat(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Animation.AnimationListener animationListener2 = animationListener;
                if (animationListener2 != null) {
                    animationListener2.onAnimationStart(animation);
                }
            }
        });
        view.startAnimation(translateAnimation);
        return translateAnimation;
    }

    public static void setBackgroundKeepingPadding(View view, int i4) {
        setBackgroundKeepingPadding(view, C0332a.m1806d(view.getContext(), i4));
    }

    public static void setViewsFont(View... viewArr) {
        setViewsFont(XUI.getDefaultTypeface(), viewArr);
    }

    @SuppressLint({"ResourceType"})
    public static View findViewFromViewStub(View view, int i4, int i5, int i6) {
        if (view == null) {
            return null;
        }
        View viewFindViewById = view.findViewById(i5);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(i4);
        if (viewStub == null) {
            return null;
        }
        if (viewStub.getLayoutResource() < 1 && i6 > 0) {
            viewStub.setLayoutResource(i6);
        }
        View viewInflate = viewStub.inflate();
        return viewInflate != null ? viewInflate.findViewById(i5) : viewInflate;
    }

    public static void playViewBackgroundAnimation(View view, int i4, int[] iArr, int i5) {
        playViewBackgroundAnimation(view, i4, iArr, i5, null);
    }

    public static void playViewBackgroundAnimation(final View view, int i4, int i5, long j4, int i6, int i7, final Runnable runnable) {
        final Drawable background = view.getBackground();
        setBackgroundColorKeepPadding(view, i4);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i4, i5);
        valueAnimator.setDuration(j4 / (i6 + 1));
        valueAnimator.setRepeatCount(i6);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.utils.ViewUtils.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewUtils.setBackgroundColorKeepPadding(view, ((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        if (i7 != 0) {
            view.setTag(i7, valueAnimator);
        }
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.utils.ViewUtils.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewUtils.setBackgroundKeepingPadding(view, background);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        valueAnimator.start();
    }

    public static void playViewBackgroundAnimation(View view, int i4, int i5, long j4) {
        playViewBackgroundAnimation(view, i4, i5, j4, 0, 0, null);
    }
}
