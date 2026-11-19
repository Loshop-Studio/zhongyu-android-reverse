package com.xuexiang.xui.widget.textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class ExpandableTextView extends LinearLayout implements View.OnClickListener {
    private static final float DEFAULT_ANIM_ALPHA_START = 0.7f;
    private static final int DEFAULT_ANIM_DURATION = 300;
    private static final int MAX_COLLAPSED_LINES = 8;
    private float mAnimAlphaStart;
    private boolean mAnimating;
    private int mAnimationDuration;
    protected ImageButton mButton;
    private Drawable mCollapseDrawable;
    private boolean mCollapsed;
    private int mCollapsedHeight;
    private SparseBooleanArray mCollapsedStatus;
    private Drawable mExpandDrawable;
    private OnExpandStateChangeListener mListener;
    private int mMarginBetweenTxtAndBottom;
    private int mMaxCollapsedLines;
    private int mPosition;
    private boolean mRelayout;
    private int mTextHeightWithMaxLines;
    protected TextView mTv;

    class ExpandCollapseAnimation extends Animation {
        private final int mEndHeight;
        private final int mStartHeight;
        private final View mTargetView;

        public ExpandCollapseAnimation(View view, int i4, int i5) {
            this.mTargetView = view;
            this.mStartHeight = i4;
            this.mEndHeight = i5;
            setDuration(ExpandableTextView.this.mAnimationDuration);
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f4, Transformation transformation) {
            int i4 = this.mEndHeight;
            int i5 = (int) (((i4 - r0) * f4) + this.mStartHeight);
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.mTv.setMaxHeight(i5 - expandableTextView.mMarginBetweenTxtAndBottom);
            if (Float.compare(ExpandableTextView.this.mAnimAlphaStart, 1.0f) != 0) {
                ExpandableTextView expandableTextView2 = ExpandableTextView.this;
                ExpandableTextView.applyAlphaAnimation(expandableTextView2.mTv, expandableTextView2.mAnimAlphaStart + (f4 * (1.0f - ExpandableTextView.this.mAnimAlphaStart)));
            }
            this.mTargetView.getLayoutParams().height = i5;
            this.mTargetView.requestLayout();
        }

        @Override // android.view.animation.Animation
        public void initialize(int i4, int i5, int i6, int i7) {
            super.initialize(i4, i5, i6, i7);
        }

        @Override // android.view.animation.Animation
        public boolean willChangeBounds() {
            return true;
        }
    }

    public interface OnExpandStateChangeListener {
        void onExpandStateChanged(TextView textView, boolean z3);
    }

    public ExpandableTextView(Context context) {
        super(context);
        this.mCollapsed = true;
        init(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    public static void applyAlphaAnimation(View view, float f4) {
        if (isPostHoneycomb()) {
            view.setAlpha(f4);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f4);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    private void findViews() {
        TextView textView = (TextView) findViewById(C2042R.id.expandable_text);
        this.mTv = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton = (ImageButton) findViewById(C2042R.id.expand_collapse);
        this.mButton = imageButton;
        imageButton.setImageDrawable(this.mCollapsed ? this.mExpandDrawable : this.mCollapseDrawable);
        this.mButton.setOnClickListener(this);
    }

    @TargetApi(21)
    private static Drawable getDrawable(Context context, int i4) {
        Resources resources = context.getResources();
        return isPostLolipop() ? resources.getDrawable(i4, context.getTheme()) : resources.getDrawable(i4);
    }

    private static int getRealTextViewHeight(TextView textView) {
        Layout layout = textView.getLayout();
        return (layout != null ? layout.getLineTop(textView.getLineCount()) : 0) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    private void init(AttributeSet attributeSet) {
        initAttr(attributeSet);
        setOrientation(1);
        setVisibility(8);
    }

    private void initAttr(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.ExpandableTextView);
        this.mMaxCollapsedLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ExpandableTextView_etv_maxCollapsedLines, 8);
        this.mAnimationDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.ExpandableTextView_etv_animDuration, 300);
        this.mAnimAlphaStart = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.ExpandableTextView_etv_animAlphaStart, DEFAULT_ANIM_ALPHA_START);
        this.mExpandDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.ExpandableTextView_etv_expandDrawable);
        this.mCollapseDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.ExpandableTextView_etv_collapseDrawable);
        if (this.mExpandDrawable == null) {
            this.mExpandDrawable = getDrawable(getContext(), C2042R.drawable.xui_ic_expand_more_black_12dp);
        }
        if (this.mCollapseDrawable == null) {
            this.mCollapseDrawable = getDrawable(getContext(), C2042R.drawable.xui_ic_expand_less_black_12dp);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static boolean isPostHoneycomb() {
        return true;
    }

    private static boolean isPostLolipop() {
        return true;
    }

    public CharSequence getText() {
        TextView textView = this.mTv;
        return textView == null ? "" : textView.getText();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.mButton.getVisibility() != 0) {
            return;
        }
        boolean z3 = !this.mCollapsed;
        this.mCollapsed = z3;
        this.mButton.setImageDrawable(z3 ? this.mExpandDrawable : this.mCollapseDrawable);
        SparseBooleanArray sparseBooleanArray = this.mCollapsedStatus;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(this.mPosition, this.mCollapsed);
        }
        this.mAnimating = true;
        ExpandCollapseAnimation expandCollapseAnimation = this.mCollapsed ? new ExpandCollapseAnimation(this, getHeight(), this.mCollapsedHeight) : new ExpandCollapseAnimation(this, getHeight(), (getHeight() + this.mTextHeightWithMaxLines) - this.mTv.getHeight());
        expandCollapseAnimation.setFillAfter(true);
        expandCollapseAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.textview.ExpandableTextView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ExpandableTextView.this.clearAnimation();
                ExpandableTextView.this.mAnimating = false;
                if (ExpandableTextView.this.mListener != null) {
                    ExpandableTextView.this.mListener.onExpandStateChanged(ExpandableTextView.this.mTv, !r0.mCollapsed);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ExpandableTextView expandableTextView = ExpandableTextView.this;
                ExpandableTextView.applyAlphaAnimation(expandableTextView.mTv, expandableTextView.mAnimAlphaStart);
            }
        });
        clearAnimation();
        startAnimation(expandCollapseAnimation);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        findViews();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mAnimating;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (!this.mRelayout || getVisibility() == 8) {
            super.onMeasure(i4, i5);
            return;
        }
        this.mRelayout = false;
        this.mButton.setVisibility(8);
        this.mTv.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i4, i5);
        if (this.mTv.getLineCount() <= this.mMaxCollapsedLines) {
            return;
        }
        this.mTextHeightWithMaxLines = getRealTextViewHeight(this.mTv);
        if (this.mCollapsed) {
            this.mTv.setMaxLines(this.mMaxCollapsedLines);
        }
        this.mButton.setVisibility(0);
        super.onMeasure(i4, i5);
        if (this.mCollapsed) {
            this.mTv.post(new Runnable() { // from class: com.xuexiang.xui.widget.textview.ExpandableTextView.2
                @Override // java.lang.Runnable
                public void run() {
                    ExpandableTextView expandableTextView = ExpandableTextView.this;
                    expandableTextView.mMarginBetweenTxtAndBottom = expandableTextView.getHeight() - ExpandableTextView.this.mTv.getHeight();
                }
            });
            this.mCollapsedHeight = getMeasuredHeight();
        }
    }

    public void setOnExpandStateChangeListener(OnExpandStateChangeListener onExpandStateChangeListener) {
        this.mListener = onExpandStateChangeListener;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
        }
        super.setOrientation(i4);
    }

    public void setText(CharSequence charSequence) {
        this.mRelayout = true;
        this.mTv.setText(charSequence);
        setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCollapsed = true;
        init(attributeSet);
    }

    public void setText(CharSequence charSequence, SparseBooleanArray sparseBooleanArray, int i4) {
        this.mCollapsedStatus = sparseBooleanArray;
        this.mPosition = i4;
        boolean z3 = sparseBooleanArray.get(i4, true);
        clearAnimation();
        this.mCollapsed = z3;
        this.mButton.setImageDrawable(z3 ? this.mExpandDrawable : this.mCollapseDrawable);
        setText(charSequence);
        getLayoutParams().height = -2;
        requestLayout();
    }

    @TargetApi(11)
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mCollapsed = true;
        init(attributeSet);
    }
}
