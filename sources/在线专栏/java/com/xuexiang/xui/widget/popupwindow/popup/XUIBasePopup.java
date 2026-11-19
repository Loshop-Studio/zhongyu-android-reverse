package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class XUIBasePopup {
    private Context mContext;
    private PopupWindow.OnDismissListener mDismissListener;
    private PopupWindow mPopupWindow;
    protected View mRootView;
    private RootView mRootViewWrapper;
    protected WindowManager mWindowManager;
    protected Drawable mBackground = null;
    protected Point mScreenSize = new Point();
    protected int mWindowHeight = 0;
    protected int mWindowWidth = 0;
    private boolean mNeedCacheSize = true;

    public XUIBasePopup(Context context) {
        this.mContext = context;
        PopupWindow popupWindow = new PopupWindow(context);
        this.mPopupWindow = popupWindow;
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 4) {
                    XUIBasePopup.this.mPopupWindow.dismiss();
                }
                return false;
            }
        });
        this.mWindowManager = (WindowManager) context.getSystemService("window");
    }

    private void measureWindowSize() {
        this.mRootView.measure(-2, -2);
        this.mWindowWidth = this.mRootView.getMeasuredWidth();
        this.mWindowHeight = this.mRootView.getMeasuredHeight();
    }

    private void preShow() {
        if (this.mRootViewWrapper == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        onPreShow();
        Drawable drawable = this.mBackground;
        if (drawable == null) {
            this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            this.mPopupWindow.setBackgroundDrawable(drawable);
        }
        this.mPopupWindow.setWidth(-2);
        this.mPopupWindow.setHeight(-2);
        this.mPopupWindow.setTouchable(true);
        this.mPopupWindow.setFocusable(true);
        this.mPopupWindow.setOutsideTouchable(true);
        this.mPopupWindow.setContentView(this.mRootViewWrapper);
    }

    public void dismiss() {
        this.mPopupWindow.dismiss();
    }

    public Context getContext() {
        return this.mContext;
    }

    public PopupWindow getPopupWindow() {
        return this.mPopupWindow;
    }

    public boolean isShowing() {
        PopupWindow popupWindow = this.mPopupWindow;
        return popupWindow != null && popupWindow.isShowing();
    }

    protected void onConfigurationChanged(Configuration configuration) {
    }

    protected void onDismiss() {
    }

    protected void onPreShow() {
    }

    protected abstract Point onShow(View view);

    public void setBackgroundDrawable(Drawable drawable) {
        this.mBackground = drawable;
    }

    public void setContentView(View view) {
        if (view == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        RootView rootView = new RootView(this.mContext);
        this.mRootViewWrapper = rootView;
        rootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.mRootView = view;
        this.mRootViewWrapper.addView(view);
        this.mPopupWindow.setContentView(this.mRootViewWrapper);
        this.mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                XUIBasePopup.this.onDismiss();
                if (XUIBasePopup.this.mDismissListener != null) {
                    XUIBasePopup.this.mDismissListener.onDismiss();
                }
            }
        });
    }

    public void setNeedCacheSize(boolean z3) {
        this.mNeedCacheSize = z3;
    }

    public XUIBasePopup setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mDismissListener = onDismissListener;
        return this;
    }

    public final void show(View view) {
        show(view, view);
    }

    public class RootView extends FrameLayout {
        public RootView(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            if (XUIBasePopup.this.mPopupWindow != null && XUIBasePopup.this.mPopupWindow.isShowing()) {
                XUIBasePopup.this.mPopupWindow.dismiss();
            }
            XUIBasePopup.this.onConfigurationChanged(configuration);
        }

        public RootView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public final void show(View view, View view2) {
        preShow();
        this.mWindowManager.getDefaultDisplay().getSize(this.mScreenSize);
        if (this.mWindowWidth == 0 || this.mWindowHeight == 0 || !this.mNeedCacheSize) {
            measureWindowSize();
        }
        Point pointOnShow = onShow(view2);
        this.mPopupWindow.showAtLocation(view, 0, pointOnShow.x, pointOnShow.y);
        view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view3) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view3) {
                if (XUIBasePopup.this.isShowing()) {
                    XUIBasePopup.this.dismiss();
                }
            }
        });
    }

    public void setContentView(int i4) {
        setContentView(((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(i4, (ViewGroup) null));
    }
}
