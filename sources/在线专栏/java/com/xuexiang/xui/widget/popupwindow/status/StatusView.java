package com.xuexiang.xui.widget.popupwindow.status;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class StatusView extends FrameLayout {
    private static final int DISMISS_ON_COMPLETE_DELAY = 1000;
    private Runnable mAutoDismissOnComplete;
    private View mCompleteView;
    private Status mCurrentStatus;
    private View mCustomView;
    private View mErrorView;
    private Handler mHandler;
    private boolean mHideOnComplete;
    private View mLoadingView;
    private Animation mSlideIn;
    private Animation mSlideOut;

    public StatusView(Context context) {
        this(context, null);
    }

    private void enterAnimation(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        view.startAnimation(this.mSlideIn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exitAnimation(final View view) {
        if (view == null) {
            return;
        }
        view.startAnimation(this.mSlideOut);
        this.mSlideOut.setAnimationListener(new SimpleAnimListener() { // from class: com.xuexiang.xui.widget.popupwindow.status.StatusView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                StatusView.this.mCurrentStatus = Status.NONE;
                view.setVisibility(4);
                StatusView.this.mSlideOut.setAnimationListener(null);
                StatusView.this.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getCurrentView(Status status) {
        if (status == Status.NONE) {
            return null;
        }
        if (status == Status.COMPLETE) {
            return this.mCompleteView;
        }
        if (status == Status.ERROR) {
            return this.mErrorView;
        }
        if (status == Status.LOADING) {
            return this.mLoadingView;
        }
        if (status == Status.CUSTOM) {
            return this.mCustomView;
        }
        return null;
    }

    private void init(Context context, AttributeSet attributeSet, int i4, int i5, int i6, int i7, int i8) {
        this.mCurrentStatus = Status.NONE;
        this.mSlideIn = AnimationUtils.loadAnimation(context, C2042R.anim.sv_slide_in);
        this.mSlideOut = AnimationUtils.loadAnimation(context, C2042R.anim.sv_slide_out);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.mHandler = new Handler();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.StatusView, i4, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatusView_sv_complete, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatusView_sv_error, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatusView_sv_loading, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.StatusView_sv_custom, 0);
        this.mHideOnComplete = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.StatusView_sv_dismissOnComplete, this.mHideOnComplete);
        if (i5 == 0) {
            i5 = resourceId;
        }
        this.mCompleteView = layoutInflaterFrom.inflate(i5, (ViewGroup) null);
        if (i6 == 0) {
            i6 = resourceId2;
        }
        this.mErrorView = layoutInflaterFrom.inflate(i6, (ViewGroup) null);
        if (i7 == 0) {
            i7 = resourceId3;
        }
        this.mLoadingView = layoutInflaterFrom.inflate(i7, (ViewGroup) null);
        if (i8 == 0) {
            i8 = resourceId4;
        }
        this.mCustomView = layoutInflaterFrom.inflate(i8, (ViewGroup) null);
        this.mCompleteView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mLoadingView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mCustomView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.mCompleteView);
        addView(this.mErrorView);
        addView(this.mLoadingView);
        addView(this.mCustomView);
        this.mCompleteView.setVisibility(4);
        this.mErrorView.setVisibility(4);
        this.mLoadingView.setVisibility(4);
        this.mCustomView.setVisibility(4);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        init(context, attributeSet, i4, 0, 0, 0, 0);
    }

    private void switchAnimation(final View view, final View view2) {
        clearAnimation();
        view.setVisibility(0);
        view.startAnimation(this.mSlideOut);
        this.mSlideOut.setAnimationListener(new SimpleAnimListener() { // from class: com.xuexiang.xui.widget.popupwindow.status.StatusView.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                StatusView.this.mSlideOut.setAnimationListener(null);
                view.setVisibility(4);
                view2.setVisibility(0);
                view2.startAnimation(StatusView.this.mSlideIn);
            }
        });
    }

    public void dismiss() {
        setStatus(Status.NONE);
    }

    public View getCompleteView() {
        return this.mCompleteView;
    }

    public View getCustomView() {
        return this.mCustomView;
    }

    public View getErrorView() {
        return this.mErrorView;
    }

    public View getLoadingView() {
        return this.mLoadingView;
    }

    public Status getStatus() {
        return this.mCurrentStatus;
    }

    public View setCustomViewTitle(int i4, String str) {
        View viewFindViewById = this.mCustomView.findViewById(i4);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setText(str);
        }
        return viewFindViewById;
    }

    public StatusView setHideOnComplete(boolean z3) {
        this.mHideOnComplete = z3;
        return this;
    }

    public void setOnCompleteClickListener(View.OnClickListener onClickListener) {
        this.mCompleteView.setOnClickListener(onClickListener);
    }

    public void setOnCustomClickListener(View.OnClickListener onClickListener) {
        this.mCustomView.setOnClickListener(onClickListener);
    }

    public void setOnErrorClickListener(View.OnClickListener onClickListener) {
        this.mErrorView.setOnClickListener(onClickListener);
    }

    public void setOnLoadingClickListener(View.OnClickListener onClickListener) {
        this.mLoadingView.setOnClickListener(onClickListener);
    }

    public void setStatus(Status status) {
        setVisibility(0);
        Status status2 = this.mCurrentStatus;
        Status status3 = Status.NONE;
        if (status2 == status3) {
            this.mCurrentStatus = status;
            enterAnimation(getCurrentView(status));
        } else if (status != status3) {
            switchAnimation(getCurrentView(status2), getCurrentView(status));
            this.mCurrentStatus = status;
        } else {
            exitAnimation(getCurrentView(status2));
        }
        this.mHandler.removeCallbacksAndMessages(null);
        if (status == Status.COMPLETE && this.mHideOnComplete) {
            this.mHandler.postDelayed(this.mAutoDismissOnComplete, 1000L);
        }
    }

    public StatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.StatusViewStyle);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mHideOnComplete = true;
        this.mAutoDismissOnComplete = new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.status.StatusView.1
            @Override // java.lang.Runnable
            public void run() {
                StatusView statusView = StatusView.this;
                statusView.exitAnimation(statusView.getCurrentView(statusView.mCurrentStatus));
                StatusView.this.mHandler.removeCallbacks(StatusView.this.mAutoDismissOnComplete);
            }
        };
        initAttrs(context, attributeSet, i4);
    }

    public StatusView(Context context, int i4, int i5, int i6, int i7) {
        this(context, null, i4, i5, i6, i7);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i4, int i5, int i6, int i7) {
        this(context, attributeSet, C2042R.attr.StatusViewStyle, i4, i5, i6, i7);
    }

    public StatusView(Context context, AttributeSet attributeSet, int i4, int i5, int i6, int i7, int i8) {
        super(context, attributeSet, i4);
        this.mHideOnComplete = true;
        this.mAutoDismissOnComplete = new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.status.StatusView.1
            @Override // java.lang.Runnable
            public void run() {
                StatusView statusView = StatusView.this;
                statusView.exitAnimation(statusView.getCurrentView(statusView.mCurrentStatus));
                StatusView.this.mHandler.removeCallbacks(StatusView.this.mAutoDismissOnComplete);
            }
        };
        init(context, attributeSet, i4, i5, i6, i7, i8);
    }
}
