package com.xuexiang.xui.widget.statelayout;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.xuexiang.xui.logs.UILog;

/* loaded from: classes.dex */
public class StatusLoader {
    public static final int STATUS_CUSTOM = 5;
    public static final int STATUS_EMPTY_DATA = 4;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_LOAD_FAILED = 3;
    public static final int STATUS_LOAD_SUCCESS = 2;
    private static volatile StatusLoader sDefault;
    private Adapter mAdapter;

    public interface Adapter {
        View getView(Holder holder, View view, int i4);
    }

    public static class Holder {
        private int curState;
        private Adapter mAdapter;
        private Context mContext;
        private View mCurStatusView;
        private Object mData;
        private View.OnClickListener mRetryListener;
        private SparseArray<View> mStatusViews;
        private ViewGroup mWrapper;

        private boolean validate() {
            if (this.mAdapter == null) {
                UILog.m7962e("StatusLoader.Adapter is not specified！");
            }
            if (this.mContext == null) {
                UILog.m7962e("Context is null！");
            }
            if (this.mWrapper == null) {
                UILog.m7962e("The mWrapper of loading status view is null！");
            }
            return (this.mAdapter == null || this.mContext == null || this.mWrapper == null) ? false : true;
        }

        public Context getContext() {
            return this.mContext;
        }

        public int getCurState() {
            return this.curState;
        }

        public <T> T getData() {
            try {
                return (T) this.mData;
            } catch (Exception e4) {
                UILog.m7964e(e4);
                return null;
            }
        }

        public View.OnClickListener getRetryListener() {
            return this.mRetryListener;
        }

        public ViewGroup getWrapper() {
            return this.mWrapper;
        }

        public void showCustom() {
            showLoadingStatus(5);
        }

        public void showEmpty() {
            showLoadingStatus(4);
        }

        public void showLoadFailed() {
            showLoadingStatus(3);
        }

        public void showLoadSuccess() {
            showLoadingStatus(2);
        }

        public void showLoading() {
            showLoadingStatus(1);
        }

        public void showLoadingStatus(int i4) {
            if (this.curState == i4 || !validate()) {
                return;
            }
            this.curState = i4;
            View view = this.mStatusViews.get(i4);
            if (view == null) {
                view = this.mCurStatusView;
            }
            try {
                View view2 = this.mAdapter.getView(this, view, i4);
                if (view2 == null) {
                    UILog.m7962e(this.mAdapter.getClass().getName() + ".getView returns null");
                    return;
                }
                if (view2 != this.mCurStatusView || this.mWrapper.indexOfChild(view2) < 0) {
                    View view3 = this.mCurStatusView;
                    if (view3 != null) {
                        this.mWrapper.removeView(view3);
                    }
                    view2.setElevation(Float.MAX_VALUE);
                    this.mWrapper.addView(view2);
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    }
                } else if (this.mWrapper.indexOfChild(view2) != this.mWrapper.getChildCount() - 1) {
                    view2.bringToFront();
                }
                this.mCurStatusView = view2;
                this.mStatusViews.put(i4, view2);
            } catch (Exception e4) {
                UILog.m7964e(e4);
            }
        }

        public Holder withData(Object obj) {
            this.mData = obj;
            return this;
        }

        public Holder withRetry(View.OnClickListener onClickListener) {
            this.mRetryListener = onClickListener;
            return this;
        }

        private Holder(Adapter adapter, Context context, ViewGroup viewGroup) {
            this.mStatusViews = new SparseArray<>(5);
            this.mAdapter = adapter;
            this.mContext = context;
            this.mWrapper = viewGroup;
        }
    }

    private StatusLoader() {
    }

    public static StatusLoader from(Adapter adapter) {
        StatusLoader statusLoader = new StatusLoader();
        statusLoader.mAdapter = adapter;
        return statusLoader;
    }

    public static StatusLoader getDefault() {
        if (sDefault == null) {
            synchronized (StatusLoader.class) {
                if (sDefault == null) {
                    sDefault = new StatusLoader();
                }
            }
        }
        return sDefault;
    }

    public static void initDefault(Adapter adapter) {
        getDefault().mAdapter = adapter;
    }

    public Holder cover(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            throw new RuntimeException("view has no parent to show StatusLoader as cover!");
        }
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        ((ViewGroup) parent).addView(frameLayout, view.getLayoutParams());
        return new Holder(this.mAdapter, view.getContext(), frameLayout);
    }

    public Holder wrap(Activity activity) {
        return new Holder(this.mAdapter, activity, (ViewGroup) activity.findViewById(R.id.content));
    }

    public Holder wrap(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
        if (view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            viewGroup.addView(frameLayout, iIndexOfChild);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return new Holder(this.mAdapter, view.getContext(), frameLayout);
    }
}
