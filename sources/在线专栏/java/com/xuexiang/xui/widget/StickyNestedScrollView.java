package com.xuexiang.xui.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class StickyNestedScrollView extends NestedScrollView {
    private static final int DEFAULT_SHADOW_HEIGHT = 10;
    public static final String FLAG_HASTRANSPARENCY = "-hastransparency";
    public static final String FLAG_NONCONSTANT = "-nonconstant";
    public static final String STICKY_TAG = "sticky";
    private boolean clipToPaddingHasBeenSet;
    private boolean clippingToPadding;
    private View currentlyStickingView;
    private boolean hasNotDoneActionDown;
    private final Runnable invalidateRunnable;
    private List<OnViewStickyListener> mOnViewStickyListeners;
    private Drawable mShadowDrawable;
    private int mShadowHeight;
    private boolean redirectTouchesToStickyView;
    private int stickyViewLeftOffset;
    private float stickyViewTopOffset;
    private ArrayList<View> stickyViews;

    public interface OnViewStickyListener {
        void onSticky(View view);

        void onUnSticky(View view);
    }

    public StickyNestedScrollView(Context context) {
        this(context, null);
    }

    private boolean detainStickyView(View view) {
        if (!getStringTagForView(view).contains(STICKY_TAG)) {
            return false;
        }
        this.stickyViews.add(view);
        return true;
    }

    private void doTheStickyThing() {
        float fMin;
        Iterator<View> it = this.stickyViews.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            int topForViewRelativeOnlyChild = (getTopForViewRelativeOnlyChild(next) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop());
            if (topForViewRelativeOnlyChild <= 0) {
                if (view != null) {
                    if (topForViewRelativeOnlyChild > (getTopForViewRelativeOnlyChild(view) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) {
                    }
                }
                view = next;
            } else {
                if (view2 != null) {
                    if (topForViewRelativeOnlyChild < (getTopForViewRelativeOnlyChild(view2) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) {
                    }
                }
                view2 = next;
            }
        }
        if (view == null) {
            if (this.currentlyStickingView != null) {
                List<OnViewStickyListener> list = this.mOnViewStickyListeners;
                if (list != null) {
                    Iterator<OnViewStickyListener> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onUnSticky(this.currentlyStickingView);
                    }
                }
                stopStickingCurrentlyStickingView();
                return;
            }
            return;
        }
        if (view2 == null) {
            fMin = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            fMin = Math.min(0, ((getTopForViewRelativeOnlyChild(view2) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.stickyViewTopOffset = fMin;
        View view3 = this.currentlyStickingView;
        if (view != view3) {
            if (view3 != null) {
                List<OnViewStickyListener> list2 = this.mOnViewStickyListeners;
                if (list2 != null) {
                    Iterator<OnViewStickyListener> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onUnSticky(this.currentlyStickingView);
                    }
                }
                stopStickingCurrentlyStickingView();
            }
            this.stickyViewLeftOffset = getLeftForViewRelativeOnlyChild(view);
            startStickingView(view);
            List<OnViewStickyListener> list3 = this.mOnViewStickyListeners;
            if (list3 != null) {
                Iterator<OnViewStickyListener> it4 = list3.iterator();
                while (it4.hasNext()) {
                    it4.next().onSticky(this.currentlyStickingView);
                }
            }
        }
    }

    private void findStickyViews(View view) {
        if (detainStickyView(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            findStickyViews(viewGroup.getChildAt(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomForViewRelativeOnlyChild(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftForViewRelativeOnlyChild(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightForViewRelativeOnlyChild(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    private String getStringTagForView(View view) {
        return String.valueOf(view.getTag());
    }

    private int getTopForViewRelativeOnlyChild(View view) {
        int top = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    private void hideView(View view) {
        view.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
    }

    private void notifyHierarchyChanged() {
        if (this.currentlyStickingView != null) {
            stopStickingCurrentlyStickingView();
        }
        this.stickyViews.clear();
        findStickyViews(getChildAt(0));
        doTheStickyThing();
        invalidate();
    }

    private void showView(View view) {
        view.setAlpha(1.0f);
    }

    private void startStickingView(View view) {
        this.currentlyStickingView = view;
        if (view != null) {
            if (getStringTagForView(view).contains(FLAG_HASTRANSPARENCY)) {
                hideView(this.currentlyStickingView);
            }
            if (getStringTagForView(this.currentlyStickingView).contains(FLAG_NONCONSTANT)) {
                post(this.invalidateRunnable);
            }
        }
    }

    private void stopStickingCurrentlyStickingView() {
        if (getStringTagForView(this.currentlyStickingView).contains(FLAG_HASTRANSPARENCY)) {
            showView(this.currentlyStickingView);
        }
        this.currentlyStickingView = null;
        removeCallbacks(this.invalidateRunnable);
    }

    public void addOnViewStickyListener(OnViewStickyListener onViewStickyListener) {
        if (this.mOnViewStickyListeners == null) {
            this.mOnViewStickyListeners = new ArrayList();
        }
        this.mOnViewStickyListeners.add(onViewStickyListener);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        findStickyViews(view);
    }

    public void clearOnViewStickyListener() {
        List<OnViewStickyListener> list = this.mOnViewStickyListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.currentlyStickingView != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.stickyViewLeftOffset, getScrollY() + this.stickyViewTopOffset + (this.clippingToPadding ? getPaddingTop() : 0));
            canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, this.clippingToPadding ? -this.stickyViewTopOffset : IGoodView.DEFAULT_TO_ALPHA, getWidth() - this.stickyViewLeftOffset, this.currentlyStickingView.getHeight() + this.mShadowHeight + 1);
            if (this.mShadowDrawable != null) {
                this.mShadowDrawable.setBounds(0, this.currentlyStickingView.getHeight(), this.currentlyStickingView.getWidth(), this.currentlyStickingView.getHeight() + this.mShadowHeight);
                this.mShadowDrawable.draw(canvas);
            }
            canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, this.clippingToPadding ? -this.stickyViewTopOffset : IGoodView.DEFAULT_TO_ALPHA, getWidth(), this.currentlyStickingView.getHeight());
            if (getStringTagForView(this.currentlyStickingView).contains(FLAG_HASTRANSPARENCY)) {
                showView(this.currentlyStickingView);
                this.currentlyStickingView.draw(canvas);
                hideView(this.currentlyStickingView);
            } else {
                this.currentlyStickingView.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.redirectTouchesToStickyView = true;
        }
        if (this.redirectTouchesToStickyView) {
            boolean z3 = this.currentlyStickingView != null;
            this.redirectTouchesToStickyView = z3;
            if (z3) {
                this.redirectTouchesToStickyView = motionEvent.getY() <= ((float) this.currentlyStickingView.getHeight()) + this.stickyViewTopOffset && motionEvent.getX() >= ((float) getLeftForViewRelativeOnlyChild(this.currentlyStickingView)) && motionEvent.getX() <= ((float) getRightForViewRelativeOnlyChild(this.currentlyStickingView));
            }
        } else if (this.currentlyStickingView == null) {
            this.redirectTouchesToStickyView = false;
        }
        if (this.redirectTouchesToStickyView) {
            motionEvent.offsetLocation(IGoodView.DEFAULT_TO_ALPHA, ((getScrollY() + this.stickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.currentlyStickingView)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void notifyStickyAttributeChanged() {
        notifyHierarchyChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.invalidateRunnable);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (!this.clipToPaddingHasBeenSet) {
            this.clippingToPadding = true;
        }
        notifyHierarchyChanged();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        doTheStickyThing();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.redirectTouchesToStickyView) {
            motionEvent.offsetLocation(IGoodView.DEFAULT_TO_ALPHA, (getScrollY() + this.stickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.currentlyStickingView));
        }
        if (motionEvent.getAction() == 0) {
            this.hasNotDoneActionDown = false;
        }
        if (this.hasNotDoneActionDown) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            super.onTouchEvent(motionEventObtain);
            this.hasNotDoneActionDown = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.hasNotDoneActionDown = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnViewStickyListener(OnViewStickyListener onViewStickyListener) {
        List<OnViewStickyListener> list = this.mOnViewStickyListeners;
        if (list != null) {
            list.remove(onViewStickyListener);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        super.setClipToPadding(z3);
        this.clippingToPadding = z3;
        this.clipToPaddingHasBeenSet = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.mShadowDrawable = drawable;
    }

    public void setShadowHeight(int i4) {
        this.mShadowHeight = i4;
    }

    public void setup() {
        this.stickyViews = new ArrayList<>();
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollViewStyle);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.invalidateRunnable = new Runnable() { // from class: com.xuexiang.xui.widget.StickyNestedScrollView.1
            @Override // java.lang.Runnable
            public void run() {
                if (StickyNestedScrollView.this.currentlyStickingView != null) {
                    StickyNestedScrollView stickyNestedScrollView = StickyNestedScrollView.this;
                    int leftForViewRelativeOnlyChild = stickyNestedScrollView.getLeftForViewRelativeOnlyChild(stickyNestedScrollView.currentlyStickingView);
                    StickyNestedScrollView stickyNestedScrollView2 = StickyNestedScrollView.this;
                    int bottomForViewRelativeOnlyChild = stickyNestedScrollView2.getBottomForViewRelativeOnlyChild(stickyNestedScrollView2.currentlyStickingView);
                    StickyNestedScrollView stickyNestedScrollView3 = StickyNestedScrollView.this;
                    StickyNestedScrollView.this.invalidate(leftForViewRelativeOnlyChild, bottomForViewRelativeOnlyChild, stickyNestedScrollView3.getRightForViewRelativeOnlyChild(stickyNestedScrollView3.currentlyStickingView), (int) (StickyNestedScrollView.this.getScrollY() + StickyNestedScrollView.this.currentlyStickingView.getHeight() + StickyNestedScrollView.this.stickyViewTopOffset));
                }
                StickyNestedScrollView.this.postDelayed(this, 16L);
            }
        };
        this.mShadowHeight = 10;
        this.hasNotDoneActionDown = true;
        setup();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i4) {
        super.addView(view, i4);
        findStickyViews(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        findStickyViews(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, int i5) {
        super.addView(view, i4, i5);
        findStickyViews(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        findStickyViews(view);
    }
}
