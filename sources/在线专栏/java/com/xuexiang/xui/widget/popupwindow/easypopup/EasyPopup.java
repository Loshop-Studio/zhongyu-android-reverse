package com.xuexiang.xui.widget.popupwindow.easypopup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.core.widget.C0376j;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class EasyPopup implements PopupWindow.OnDismissListener {
    private static final float DEFAULT_DIM = 0.7f;
    protected boolean isBackgroundDim;
    private View mAnchorView;
    protected int mAnimationStyle;
    protected View mContentView;
    private Context mContext;
    protected ViewGroup mDimView;
    protected Transition mEnterTransition;
    protected Transition mExitTransition;
    private boolean mFocusAndOutsideEnable;
    protected int mHeight;
    private boolean mIsShow;
    protected int mLayoutId;
    private int mOffsetX;
    private int mOffsetY;
    private OnAttachedWindowListener mOnAttachedWindowListener;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private PopupWindow mPopupWindow;
    protected int mWidth;
    protected boolean mFocusable = true;
    protected boolean mOutsideTouchable = true;
    protected float mDimValue = DEFAULT_DIM;
    protected int mDimColor = IGoodView.DEFAULT_TEXT_COLOR;
    private int mVerticalGravity = 2;
    private int mHorizontalGravity = 1;
    private boolean isOnlyGetWH = true;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            EasyPopup easyPopup = EasyPopup.this;
            easyPopup.mWidth = easyPopup.getContentView().getWidth();
            EasyPopup easyPopup2 = EasyPopup.this;
            easyPopup2.mHeight = easyPopup2.getContentView().getHeight();
            if (EasyPopup.this.mOnAttachedWindowListener != null) {
                OnAttachedWindowListener onAttachedWindowListener = EasyPopup.this.mOnAttachedWindowListener;
                EasyPopup easyPopup3 = EasyPopup.this;
                onAttachedWindowListener.onAttachedWindow(easyPopup3.mWidth, easyPopup3.mHeight, easyPopup3);
            }
            if (EasyPopup.this.isOnlyGetWH) {
                EasyPopup.this.removeGlobalLayoutListener();
            } else {
                if (EasyPopup.this.mPopupWindow == null) {
                    return;
                }
                EasyPopup easyPopup4 = EasyPopup.this;
                easyPopup4.updateLocation(easyPopup4.mWidth, easyPopup4.mHeight, easyPopup4.mAnchorView, EasyPopup.this.mVerticalGravity, EasyPopup.this.mHorizontalGravity, EasyPopup.this.mOffsetX, EasyPopup.this.mOffsetY);
                EasyPopup.this.removeGlobalLayoutListener();
            }
        }
    };

    public interface OnAttachedWindowListener {
        void onAttachedWindow(int i4, int i5, EasyPopup easyPopup);
    }

    public EasyPopup(Context context) {
        this.mContext = context;
    }

    private void addGlobalLayoutListener(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
    }

    private void applyDim(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.mDimColor);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.mDimValue * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    private int calculateX(View view, int i4, int i5, int i6) {
        int width;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    width = view.getWidth();
                } else {
                    if (i4 != 4) {
                        return i6;
                    }
                    i5 -= view.getWidth();
                }
            }
            return i6 - i5;
        }
        width = (view.getWidth() / 2) - (i5 / 2);
        return i6 + width;
    }

    private int calculateY(View view, int i4, int i5, int i6) {
        int height;
        if (i4 != 0) {
            if (i4 == 1) {
                i5 += view.getHeight();
            } else if (i4 == 3) {
                height = view.getHeight();
            } else if (i4 != 4) {
                return i6;
            }
            return i6 - i5;
        }
        height = (view.getHeight() / 2) + (i5 / 2);
        return i6 - height;
    }

    private void clearBackgroundDim() {
        Activity activity;
        if (this.isBackgroundDim) {
            ViewGroup viewGroup = this.mDimView;
            if (viewGroup != null) {
                clearDim(viewGroup);
            } else {
                if (getContentView() == null || (activity = (Activity) getContentView().getContext()) == null) {
                    return;
                }
                clearDim(activity);
            }
        }
    }

    private void clearDim(Activity activity) {
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
    }

    private void handleBackgroundDim() {
        Activity activity;
        if (this.isBackgroundDim) {
            ViewGroup viewGroup = this.mDimView;
            if (viewGroup != null) {
                applyDim(viewGroup);
            } else {
                if (getContentView() == null || (activity = (Activity) getContentView().getContext()) == null) {
                    return;
                }
                applyDim(activity);
            }
        }
    }

    private void handleDismiss() {
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        this.mIsShow = false;
        removeGlobalLayoutListener();
        clearBackgroundDim();
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.mPopupWindow.dismiss();
        }
        onPopupWindowDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGlobalLayoutListener() {
        if (getContentView() != null) {
            getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocation(int i4, int i5, View view, int i6, int i7, int i8, int i9) {
        int iCalculateX = calculateX(view, i7, i4, i8);
        int iCalculateY = calculateY(view, i6, i5, i9);
        UILog.m7965i("updateLocation: x=" + i4 + ",y=" + i5);
        this.mPopupWindow.update(view, iCalculateX, iCalculateY, i4, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T createPopup() {
        if (this.mPopupWindow == null) {
            this.mPopupWindow = new PopupWindow();
        }
        onPopupWindowCreated(this.mPopupWindow);
        if (this.mContentView == null) {
            if (this.mLayoutId == 0) {
                throw new IllegalArgumentException("The content view is null");
            }
            this.mContentView = LayoutInflater.from(this.mContext).inflate(this.mLayoutId, (ViewGroup) null);
        }
        this.mPopupWindow.setContentView(this.mContentView);
        int i4 = this.mWidth;
        if (i4 != 0) {
            this.mPopupWindow.setWidth(i4);
        } else {
            this.mPopupWindow.setWidth(-2);
        }
        int i5 = this.mHeight;
        if (i5 != 0) {
            this.mPopupWindow.setHeight(i5);
        } else {
            this.mPopupWindow.setHeight(-2);
        }
        onPopupWindowViewCreated(this.mContentView);
        int i6 = this.mAnimationStyle;
        if (i6 != 0) {
            this.mPopupWindow.setAnimationStyle(i6);
        }
        if (this.mFocusAndOutsideEnable) {
            this.mPopupWindow.setFocusable(this.mFocusable);
            this.mPopupWindow.setOutsideTouchable(this.mOutsideTouchable);
            this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            this.mPopupWindow.setFocusable(true);
            this.mPopupWindow.setOutsideTouchable(false);
            this.mPopupWindow.setBackgroundDrawable(null);
            this.mPopupWindow.getContentView().setFocusable(true);
            this.mPopupWindow.getContentView().setFocusableInTouchMode(true);
            this.mPopupWindow.getContentView().setOnKeyListener(new View.OnKeyListener() { // from class: com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup.1
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i7, KeyEvent keyEvent) {
                    if (i7 != 4) {
                        return false;
                    }
                    EasyPopup.this.mPopupWindow.dismiss();
                    return true;
                }
            });
            this.mPopupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup.2
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
                
                    if (r0 < r1.mHeight) goto L11;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
                    /*
                        r4 = this;
                        float r5 = r6.getX()
                        int r5 = (int) r5
                        float r0 = r6.getY()
                        int r0 = (int) r0
                        int r1 = r6.getAction()
                        r2 = 1
                        if (r1 != 0) goto L20
                        if (r5 < 0) goto L1f
                        com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup r1 = com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup.this
                        int r3 = r1.mWidth
                        if (r5 >= r3) goto L1f
                        if (r0 < 0) goto L1f
                        int r5 = r1.mHeight
                        if (r0 < r5) goto L20
                    L1f:
                        return r2
                    L20:
                        int r5 = r6.getAction()
                        r6 = 4
                        if (r5 != r6) goto L28
                        goto L29
                    L28:
                        r2 = 0
                    L29:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup.ViewOnTouchListenerC22742.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
        }
        this.mPopupWindow.setOnDismissListener(this);
        if (Build.VERSION.SDK_INT >= 23) {
            Transition transition = this.mEnterTransition;
            if (transition != null) {
                this.mPopupWindow.setEnterTransition(transition);
            }
            Transition transition2 = this.mExitTransition;
            if (transition2 != null) {
                this.mPopupWindow.setExitTransition(transition2);
            }
        }
        return this;
    }

    public void dismiss() {
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.mIsShow = false;
        }
    }

    public View getContentView() {
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow != null) {
            return popupWindow.getContentView();
        }
        return null;
    }

    public Context getContext() {
        return this.mContext;
    }

    public PopupWindow getPopupWindow() {
        return this.mPopupWindow;
    }

    public <T extends View> T getView(int i4) {
        if (getContentView() != null) {
            return (T) getContentView().findViewById(i4);
        }
        return null;
    }

    public boolean isShow() {
        return this.mIsShow;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        handleDismiss();
    }

    protected void onPopupWindowCreated(PopupWindow popupWindow) {
    }

    protected void onPopupWindowDismiss() {
    }

    protected void onPopupWindowViewCreated(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setAnchorView(View view) {
        this.mAnchorView = view;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setAnimationStyle(int i4) {
        this.mAnimationStyle = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setBackgroundDimEnable(boolean z3) {
        this.isBackgroundDim = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setContentView(View view) {
        this.mContentView = view;
        this.mLayoutId = 0;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setDimColor(int i4) {
        this.mDimColor = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setDimValue(float f4) {
        this.mDimValue = f4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setDimView(ViewGroup viewGroup) {
        this.mDimView = viewGroup;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setEnterTransition(Transition transition) {
        this.mEnterTransition = transition;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setExitTransition(Transition transition) {
        this.mExitTransition = transition;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setFocusAndOutsideEnable(boolean z3) {
        this.mFocusAndOutsideEnable = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setFocusable(boolean z3) {
        this.mFocusable = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setHeight(int i4) {
        this.mHeight = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setHorizontalGravity(int i4) {
        this.mHorizontalGravity = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setOffsetX(int i4) {
        this.mOffsetX = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setOffsetY(int i4) {
        this.mOffsetY = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setOnAttachedWindowListener(OnAttachedWindowListener onAttachedWindowListener) {
        this.mOnAttachedWindowListener = onAttachedWindowListener;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setOutsideTouchable(boolean z3) {
        this.mOutsideTouchable = z3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setVerticalGravity(int i4) {
        this.mVerticalGravity = i4;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setWidth(int i4) {
        this.mWidth = i4;
        return this;
    }

    public void showAsDropDown() {
        View view = this.mAnchorView;
        if (view == null) {
            return;
        }
        showAsDropDown(view, this.mOffsetX, this.mOffsetY);
    }

    public void showAtAnchorView() {
        View view = this.mAnchorView;
        if (view == null) {
            return;
        }
        showAtAnchorView(view, this.mVerticalGravity, this.mHorizontalGravity);
    }

    public void showAtLocation(View view, int i4, int i5, int i6) {
        if (this.mPopupWindow != null) {
            handleBackgroundDim();
            this.mAnchorView = view;
            this.mOffsetX = i5;
            this.mOffsetY = i6;
            this.isOnlyGetWH = true;
            addGlobalLayoutListener(this.mPopupWindow.getContentView());
            this.mPopupWindow.showAtLocation(view, i4, i5, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setContentView(int i4) {
        this.mContentView = null;
        this.mLayoutId = i4;
        return this;
    }

    public void showAsDropDown(View view, int i4, int i5) {
        if (this.mPopupWindow != null) {
            this.isOnlyGetWH = true;
            handleBackgroundDim();
            this.mAnchorView = view;
            this.mOffsetX = i4;
            this.mOffsetY = i5;
            addGlobalLayoutListener(this.mPopupWindow.getContentView());
            this.mPopupWindow.showAsDropDown(view, i4, i5);
        }
    }

    public void showAtAnchorView(View view, int i4, int i5) {
        showAtAnchorView(view, i4, i5, 0, 0);
    }

    private void clearDim(ViewGroup viewGroup) {
        viewGroup.getOverlay().clear();
    }

    public void showAtAnchorView(View view, int i4, int i5, int i6, int i7) {
        if (this.mPopupWindow == null) {
            return;
        }
        this.mAnchorView = view;
        this.mOffsetX = i6;
        this.mOffsetY = i7;
        this.mVerticalGravity = i4;
        this.mHorizontalGravity = i5;
        this.isOnlyGetWH = false;
        handleBackgroundDim();
        View contentView = getContentView();
        addGlobalLayoutListener(contentView);
        contentView.measure(0, 0);
        int measuredWidth = contentView.getMeasuredWidth();
        int measuredHeight = contentView.getMeasuredHeight();
        int iCalculateX = calculateX(view, i5, measuredWidth, i6);
        int iCalculateY = calculateY(view, i4, measuredHeight, i7);
        UILog.m7965i("showAtAnchorView: w=" + measuredWidth + ",y=" + measuredHeight);
        C0376j.m2186c(this.mPopupWindow, view, iCalculateX, iCalculateY, 0);
        this.mIsShow = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setContentView(View view, int i4, int i5) {
        this.mContentView = view;
        this.mLayoutId = 0;
        this.mWidth = i4;
        this.mHeight = i5;
        return this;
    }

    private void applyDim(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.mDimColor);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.mDimValue * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends EasyPopup> T setContentView(int i4, int i5, int i6) {
        this.mContentView = null;
        this.mLayoutId = i4;
        this.mWidth = i5;
        this.mHeight = i6;
        return this;
    }

    public void showAsDropDown(View view) {
        if (this.mPopupWindow != null) {
            handleBackgroundDim();
            this.mAnchorView = view;
            this.isOnlyGetWH = true;
            addGlobalLayoutListener(this.mPopupWindow.getContentView());
            this.mPopupWindow.showAsDropDown(view);
        }
    }

    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (this.mPopupWindow != null) {
            handleBackgroundDim();
            this.mAnchorView = view;
            this.mOffsetX = i4;
            this.mOffsetY = i5;
            this.isOnlyGetWH = true;
            addGlobalLayoutListener(this.mPopupWindow.getContentView());
            C0376j.m2186c(this.mPopupWindow, view, i4, i5, i6);
        }
    }
}
