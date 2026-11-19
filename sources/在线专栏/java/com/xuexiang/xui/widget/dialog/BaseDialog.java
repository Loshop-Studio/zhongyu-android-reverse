package com.xuexiang.xui.widget.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0104e;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.KeyboardUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.StatusBarUtils;
import com.xuexiang.xui.utils.WidgetUtils;

/* loaded from: classes.dex */
public class BaseDialog extends DialogC0104e {
    private View mContentView;
    private boolean mIsSyncSystemUiVisibility;

    public BaseDialog(Context context, int i4) {
        this(context, C2042R.style.XUIDialog_Custom, i4);
    }

    @Override // androidx.appcompat.app.DialogC0104e, android.app.Dialog
    public <T extends View> T findViewById(int i4) {
        return (T) this.mContentView.findViewById(i4);
    }

    public Drawable getDrawable(int i4) {
        return ResUtils.getDrawable(getContext(), i4);
    }

    public String getString(int i4) {
        return getContext().getResources().getString(i4);
    }

    public void init(int i4) {
        init(getLayoutInflater().inflate(i4, (ViewGroup) null));
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        KeyboardUtils.dispatchTouchEvent(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    protected void performShow() {
        super.show();
    }

    public BaseDialog setDialogSize(int i4, int i5) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = i4;
            attributes.height = i5;
            window.setAttributes(attributes);
        }
        return this;
    }

    public BaseDialog setIsSyncSystemUiVisibility(boolean z3) {
        this.mIsSyncSystemUiVisibility = z3;
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        showIfSync(this.mIsSyncSystemUiVisibility);
    }

    public void showIfSync(boolean z3) {
        if (!z3) {
            performShow();
        } else {
            if (StatusBarUtils.showWindow(WidgetUtils.findActivity(getContext()), getWindow(), new StatusBarUtils.IWindowShower() { // from class: com.xuexiang.xui.widget.dialog.BaseDialog.1
                @Override // com.xuexiang.xui.utils.StatusBarUtils.IWindowShower
                public void show(Window window) {
                    BaseDialog.this.performShow();
                }
            })) {
                return;
            }
            performShow();
        }
    }

    public BaseDialog(Context context, View view) {
        this(context, C2042R.style.XUIDialog_Custom, view);
    }

    public BaseDialog(Context context) {
        super(context, C2042R.style.XUIDialog_Custom);
    }

    private void init(View view) {
        setContentView(view);
        this.mContentView = view;
        setCanceledOnTouchOutside(true);
    }

    public BaseDialog(Context context, int i4, int i5) {
        super(context, i4);
        init(i5);
    }

    public BaseDialog(Context context, int i4, View view) {
        super(context, i4);
        init(view);
    }
}
