package com.xuexiang.xui.widget.statelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MultipleStatusView extends FrameLayout {
    private static final FrameLayout.LayoutParams DEFAULT_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1);
    private static final int NULL_RESOURCE_ID = -1;
    public static final int STATUS_CONTENT = 0;
    public static final int STATUS_EMPTY = 2;
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_NO_NETWORK = 4;
    private View mContentView;
    private int mContentViewResId;
    private View mEmptyView;
    private int mEmptyViewResId;
    private View mErrorView;
    private int mErrorViewResId;
    private LayoutInflater mInflater;
    private View mLoadingView;
    private int mLoadingViewResId;
    private View mNoNetworkView;
    private int mNoNetworkViewResId;
    private View.OnClickListener mOnRetryClickListener;
    private final List<Integer> mOtherIds;
    private int mViewStatus;

    public MultipleStatusView(Context context) {
        this(context, null);
    }

    private void clear(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        try {
            for (View view : viewArr) {
                if (view != null) {
                    removeView(view);
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private View inflateView(int i4) {
        return this.mInflater.inflate(i4, (ViewGroup) null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.MultipleStatusView, i4, 0);
        this.mEmptyViewResId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MultipleStatusView_msv_emptyView, this.mEmptyViewResId);
        this.mErrorViewResId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MultipleStatusView_msv_errorView, this.mErrorViewResId);
        this.mLoadingViewResId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MultipleStatusView_msv_loadingView, this.mLoadingViewResId);
        this.mNoNetworkViewResId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MultipleStatusView_msv_noNetworkView, this.mNoNetworkViewResId);
        this.mContentViewResId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MultipleStatusView_msv_contentView, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.mInflater = LayoutInflater.from(getContext());
    }

    private void showContentView() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setVisibility(this.mOtherIds.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    private void showViewById(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.setVisibility(childAt.getId() == i4 ? 0 : 8);
        }
    }

    public View getContentView() {
        return this.mContentView;
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    public View getErrorView() {
        return this.mErrorView;
    }

    public View getLoadingView() {
        return this.mLoadingView;
    }

    public View getNoNetworkView() {
        return this.mNoNetworkView;
    }

    public int getViewStatus() {
        return this.mViewStatus;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clear(this.mEmptyView, this.mLoadingView, this.mErrorView, this.mNoNetworkView);
        this.mOtherIds.clear();
        this.mOnRetryClickListener = null;
        this.mInflater = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        showContent();
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.mOnRetryClickListener = onClickListener;
    }

    public final void showContent() {
        int i4;
        this.mViewStatus = 0;
        if (this.mContentView == null && (i4 = this.mContentViewResId) != -1) {
            View viewInflate = this.mInflater.inflate(i4, (ViewGroup) null);
            this.mContentView = viewInflate;
            addView(viewInflate, 0, DEFAULT_LAYOUT_PARAMS);
        }
        showContentView();
    }

    public final void showEmpty() {
        showEmpty(this.mEmptyViewResId, DEFAULT_LAYOUT_PARAMS);
    }

    public final void showError() {
        showError(this.mErrorViewResId, DEFAULT_LAYOUT_PARAMS);
    }

    public final void showLoading() {
        showLoading(this.mLoadingViewResId, DEFAULT_LAYOUT_PARAMS);
    }

    public final void showNoNetwork() {
        showNoNetwork(this.mNoNetworkViewResId, DEFAULT_LAYOUT_PARAMS);
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.MultipleStatusViewStyle);
    }

    public final void showEmpty(int i4, ViewGroup.LayoutParams layoutParams) {
        showEmpty(inflateView(i4), layoutParams);
    }

    public final void showError(int i4, ViewGroup.LayoutParams layoutParams) {
        showError(inflateView(i4), layoutParams);
    }

    public final void showLoading(int i4, ViewGroup.LayoutParams layoutParams) {
        showLoading(inflateView(i4), layoutParams);
    }

    public final void showNoNetwork(int i4, ViewGroup.LayoutParams layoutParams) {
        showNoNetwork(inflateView(i4), layoutParams);
    }

    public MultipleStatusView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mEmptyViewResId = C2042R.layout.msv_layout_empty_view;
        this.mErrorViewResId = C2042R.layout.msv_layout_error_view;
        this.mLoadingViewResId = C2042R.layout.msv_layout_loading_view;
        this.mNoNetworkViewResId = C2042R.layout.msv_layout_no_network_view;
        this.mOtherIds = new ArrayList();
        initAttrs(context, attributeSet, i4);
    }

    public final void showEmpty(View view, ViewGroup.LayoutParams layoutParams) {
        Utils.checkNull(view, "Empty view is null!");
        this.mViewStatus = 2;
        if (this.mEmptyView == null) {
            this.mEmptyView = view;
            View.OnClickListener onClickListener = this.mOnRetryClickListener;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.mOtherIds.add(Integer.valueOf(this.mEmptyView.getId()));
            addView(this.mEmptyView, 0, layoutParams);
        }
        showViewById(this.mEmptyView.getId());
    }

    public final void showError(View view, ViewGroup.LayoutParams layoutParams) {
        Utils.checkNull(view, "Error view is null!");
        this.mViewStatus = 3;
        if (this.mErrorView == null) {
            this.mErrorView = view;
            View.OnClickListener onClickListener = this.mOnRetryClickListener;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.mOtherIds.add(Integer.valueOf(this.mErrorView.getId()));
            addView(this.mErrorView, 0, layoutParams);
        }
        showViewById(this.mErrorView.getId());
    }

    public final void showLoading(View view, ViewGroup.LayoutParams layoutParams) {
        Utils.checkNull(view, "Loading view is null!");
        this.mViewStatus = 1;
        if (this.mLoadingView == null) {
            this.mLoadingView = view;
            this.mOtherIds.add(Integer.valueOf(view.getId()));
            addView(this.mLoadingView, 0, layoutParams);
        }
        showViewById(this.mLoadingView.getId());
    }

    public final void showNoNetwork(View view, ViewGroup.LayoutParams layoutParams) {
        Utils.checkNull(view, "No network view is null!");
        this.mViewStatus = 4;
        if (this.mNoNetworkView == null) {
            this.mNoNetworkView = view;
            View.OnClickListener onClickListener = this.mOnRetryClickListener;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
            this.mOtherIds.add(Integer.valueOf(this.mNoNetworkView.getId()));
            addView(this.mNoNetworkView, 0, layoutParams);
        }
        showViewById(this.mNoNetworkView.getId());
    }
}
