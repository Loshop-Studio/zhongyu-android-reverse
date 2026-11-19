package com.xuexiang.xui.widget.picker.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.listener.OnDismissListener;
import com.xuexiang.xui.widget.picker.widget.utils.PickerViewAnimateUtils;

/* loaded from: classes.dex */
public class BasePickerView {
    protected View clickView;
    protected ViewGroup contentContainer;
    private Context context;
    private ViewGroup dialogView;
    private boolean dismissing;
    private Animation inAnim;
    private boolean isShowing;
    protected Dialog mDialog;
    protected PickerOptions mPickerOptions;
    private OnDismissListener onDismissListener;
    private Animation outAnim;
    private ViewGroup rootView;
    protected int animGravity = 80;
    private boolean isAnim = true;
    private View.OnKeyListener onKeyBackListener = new View.OnKeyListener() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.4
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (i4 != 4 || keyEvent.getAction() != 0 || !BasePickerView.this.isShowing()) {
                return false;
            }
            BasePickerView.this.dismiss();
            return true;
        }
    };
    private final View.OnTouchListener onCancelableTouchListener = new View.OnTouchListener() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.5
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            BasePickerView.this.dismiss();
            return false;
        }
    };

    public BasePickerView(Context context) {
        this.context = context;
    }

    private void dismissDialog() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private Animation getInAnimation() {
        return AnimationUtils.loadAnimation(this.context, PickerViewAnimateUtils.getAnimationResource(this.animGravity, true));
    }

    private Animation getOutAnimation() {
        return AnimationUtils.loadAnimation(this.context, PickerViewAnimateUtils.getAnimationResource(this.animGravity, false));
    }

    private int getWindowWidth(Window window) {
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    private void onAttached(View view) {
        this.mPickerOptions.decorView.addView(view);
        if (this.isAnim) {
            this.contentContainer.startAnimation(this.inAnim);
        }
    }

    private void setWindowMaxWidth(Window window) {
        int windowWidth = getWindowWidth(window);
        int iResolveDimension = ThemeUtils.resolveDimension(this.context, C2042R.attr.md_dialog_horizontal_margin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_md_dialog_horizontal_margin_phone));
        int iResolveDimension2 = ThemeUtils.resolveDimension(this.context, C2042R.attr.md_dialog_max_width);
        int i4 = windowWidth - (iResolveDimension * 2);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = Math.min(iResolveDimension2, i4);
        window.setAttributes(layoutParams);
    }

    private void showDialog() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.show();
        }
    }

    public void createDialog() {
        if (this.dialogView != null) {
            Dialog dialog = new Dialog(this.context, C2042R.style.XUIDialog_Custom);
            this.mDialog = dialog;
            dialog.setCancelable(this.mPickerOptions.cancelable);
            this.mDialog.setContentView(this.dialogView);
            Window window = this.mDialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(C2042R.style.picker_view_scale_anim);
                window.setGravity(17);
                setWindowMaxWidth(window);
            }
            this.mDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.6
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    if (BasePickerView.this.onDismissListener != null) {
                        BasePickerView.this.onDismissListener.onDismiss(BasePickerView.this);
                    }
                }
            });
        }
    }

    public void dismiss() {
        if (isDialog()) {
            dismissDialog();
            return;
        }
        if (this.dismissing) {
            return;
        }
        if (this.isAnim) {
            this.outAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    BasePickerView.this.dismissImmediately();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.contentContainer.startAnimation(this.outAnim);
        } else {
            dismissImmediately();
        }
        this.dismissing = true;
    }

    public void dismissImmediately() {
        this.mPickerOptions.decorView.post(new Runnable() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.3
            @Override // java.lang.Runnable
            public void run() {
                BasePickerView basePickerView = BasePickerView.this;
                basePickerView.mPickerOptions.decorView.removeView(basePickerView.rootView);
                BasePickerView.this.isShowing = false;
                BasePickerView.this.dismissing = false;
                if (BasePickerView.this.onDismissListener != null) {
                    BasePickerView.this.onDismissListener.onDismiss(BasePickerView.this);
                }
            }
        });
    }

    public View findViewById(int i4) {
        return this.contentContainer.findViewById(i4);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public ViewGroup getDialogContainerLayout() {
        return this.contentContainer;
    }

    protected void initAnim() {
        this.inAnim = getInAnimation();
        this.outAnim = getOutAnimation();
    }

    protected void initEvents() {
    }

    protected void initViews() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        if (isDialog()) {
            ViewGroup viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C2042R.layout.xui_layout_picker_view_base, (ViewGroup) null, false);
            this.dialogView = viewGroup;
            viewGroup.setBackgroundColor(0);
            ViewGroup viewGroup2 = (ViewGroup) this.dialogView.findViewById(C2042R.id.content_container);
            this.contentContainer = viewGroup2;
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            viewGroup2.setLayoutParams(layoutParams);
            createDialog();
            this.dialogView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.picker.widget.BasePickerView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BasePickerView.this.dismiss();
                }
            });
        } else {
            PickerOptions pickerOptions = this.mPickerOptions;
            if (pickerOptions.decorView == null) {
                pickerOptions.decorView = (ViewGroup) ((Activity) this.context).getWindow().getDecorView();
            }
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(C2042R.layout.xui_layout_picker_view_base, this.mPickerOptions.decorView, false);
            this.rootView = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i4 = this.mPickerOptions.backgroundId;
            if (i4 != -1) {
                this.rootView.setBackgroundColor(i4);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.rootView.findViewById(C2042R.id.content_container);
            this.contentContainer = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        setKeyBackCancelable(true);
    }

    public boolean isDialog() {
        return false;
    }

    public boolean isShowing() {
        if (isDialog()) {
            return false;
        }
        return this.rootView.getParent() != null || this.isShowing;
    }

    public void setDialogOutSideCancelable() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(this.mPickerOptions.cancelable);
        }
    }

    public void setKeyBackCancelable(boolean z3) {
        ViewGroup viewGroup = isDialog() ? this.dialogView : this.rootView;
        viewGroup.setFocusable(z3);
        viewGroup.setFocusableInTouchMode(z3);
        if (z3) {
            viewGroup.setOnKeyListener(this.onKeyBackListener);
        } else {
            viewGroup.setOnKeyListener(null);
        }
    }

    public BasePickerView setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
        return this;
    }

    protected BasePickerView setOutSideCancelable(boolean z3) {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(C2042R.id.outmost_container);
            if (z3) {
                viewFindViewById.setOnTouchListener(this.onCancelableTouchListener);
            } else {
                viewFindViewById.setOnTouchListener(null);
            }
        }
        return this;
    }

    public void show(View view, boolean z3) {
        this.clickView = view;
        this.isAnim = z3;
        show();
    }

    public void show(boolean z3) {
        this.isAnim = z3;
        show();
    }

    public void show(View view) {
        this.clickView = view;
        show();
    }

    public void show() {
        if (isDialog()) {
            showDialog();
        } else {
            if (isShowing()) {
                return;
            }
            this.isShowing = true;
            onAttached(this.rootView);
            this.rootView.requestFocus();
        }
    }
}
