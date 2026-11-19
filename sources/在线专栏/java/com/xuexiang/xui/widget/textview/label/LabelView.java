package com.xuexiang.xui.widget.textview.label;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class LabelView extends AppCompatTextView {
    private static final AtomicInteger NEXT_GENERATED_ID = new AtomicInteger(1);
    private float mAnchorX;
    private float mAnchorY;
    private float mAngel;
    private Animation mAnimation;
    private int mLabelViewContainerID;
    private float mOffsetX;
    private float mOffsetY;

    public enum Gravity {
        LEFT_TOP,
        RIGHT_TOP
    }

    public LabelView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calcOffset(int i4, int i5, Gravity gravity, int i6, boolean z3) {
        int iDip2Px = dip2Px(i5);
        if (z3) {
            i6 = dip2Px(i6);
        }
        float f4 = (float) ((i4 - (iDip2Px * 2)) / 2.828d);
        if (gravity == Gravity.LEFT_TOP) {
            float f5 = -f4;
            this.mAnchorX = f5;
            this.mOffsetX = f5;
            this.mAngel = -45.0f;
        } else if (gravity == Gravity.RIGHT_TOP) {
            float f6 = i6 + f4;
            this.mOffsetX = f6 - i4;
            this.mAnchorX = f6;
            this.mAngel = 45.0f;
        }
        float f7 = (float) ((iDip2Px * 1.414d) + f4);
        this.mAnchorY = f7;
        this.mOffsetY = f7;
        clearAnimation();
        startAnimation(this.mAnimation);
    }

    private int dip2Px(float f4) {
        return (int) ((f4 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i4;
        int i5;
        do {
            atomicInteger = NEXT_GENERATED_ID;
            i4 = atomicInteger.get();
            i5 = i4 + 1;
            if (i5 > 16777215) {
                i5 = 1;
            }
        } while (!atomicInteger.compareAndSet(i4, i5));
        return i4;
    }

    private void init() {
        if (getLayoutParams() == null) {
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        this.mLabelViewContainerID = -1;
        setGravity(17);
        setTextColor(-1);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(2, 12.0f);
        setBackgroundColor(-16776961);
    }

    private boolean replaceLayout(View view) {
        if (getParent() != null || view == null || view.getParent() == null || this.mLabelViewContainerID != -1) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (view.getParent() instanceof FrameLayout) {
            ((FrameLayout) view.getParent()).addView(this);
            return true;
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            return true;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        this.mLabelViewContainerID = generateViewId();
        if (view.getParent() instanceof RelativeLayout) {
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (i4 != iIndexOfChild) {
                    View childAt = viewGroup.getChildAt(i4);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                    for (int i5 = 0; i5 < layoutParams.getRules().length; i5++) {
                        if (layoutParams.getRules()[i5] == view.getId()) {
                            layoutParams.getRules()[i5] = this.mLabelViewContainerID;
                        }
                    }
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
        viewGroup.removeView(view);
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        frameLayout.setLayoutParams(layoutParams2);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view);
        frameLayout.addView(this);
        frameLayout.setId(this.mLabelViewContainerID);
        viewGroup.addView(frameLayout, iIndexOfChild, layoutParams2);
        return true;
    }

    public void remove() {
        if (getParent() == null || this.mLabelViewContainerID == -1) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.getChildCount() != 2) {
            throw new AssertionError();
        }
        View childAt = viewGroup.getChildAt(0);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(viewGroup);
        if (viewGroup.getParent() instanceof RelativeLayout) {
            for (int i4 = 0; i4 < viewGroup2.getChildCount(); i4++) {
                if (i4 != iIndexOfChild) {
                    View childAt2 = viewGroup2.getChildAt(i4);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt2.getLayoutParams();
                    for (int i5 = 0; i5 < layoutParams.getRules().length; i5++) {
                        if (layoutParams.getRules()[i5] == this.mLabelViewContainerID) {
                            layoutParams.getRules()[i5] = childAt.getId();
                        }
                    }
                    childAt2.setLayoutParams(layoutParams);
                }
            }
        }
        childAt.setLayoutParams(viewGroup.getLayoutParams());
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup.removeView(childAt);
        viewGroup.removeView(this);
        viewGroup2.addView(childAt, iIndexOfChild);
        this.mLabelViewContainerID = -1;
    }

    public void setTargetView(final View view, int i4, final Gravity gravity) {
        if (replaceLayout(view)) {
            final int iDip2Px = dip2Px(i4);
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xuexiang.xui.widget.textview.label.LabelView.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LabelView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    LabelView labelView = LabelView.this;
                    labelView.calcOffset(labelView.getMeasuredWidth(), iDip2Px, gravity, view.getMeasuredWidth(), false);
                }
            });
        }
    }

    public void setTargetViewInBaseAdapter(View view, int i4, int i5, Gravity gravity) {
        if (replaceLayout(view)) {
            calcOffset(dip2Px(i4), i5, gravity, i4, true);
        }
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public LabelView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mAnimation = new Animation() { // from class: com.xuexiang.xui.widget.textview.label.LabelView.1
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f4, Transformation transformation) {
                Matrix matrix = transformation.getMatrix();
                matrix.postTranslate(LabelView.this.mOffsetX, LabelView.this.mOffsetY);
                matrix.postRotate(LabelView.this.mAngel, LabelView.this.mAnchorX, LabelView.this.mAnchorY);
            }
        };
        init();
        this.mAnimation.setFillBefore(true);
        this.mAnimation.setFillAfter(true);
        this.mAnimation.setFillEnabled(true);
    }
}
