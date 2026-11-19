package com.xuexiang.xui.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import com.xuexiang.xui.widget.progress.loading.IMessageLoader;
import com.xuexiang.xui.widget.progress.loading.LoadingCancelListener;

/* loaded from: classes.dex */
public class LoadingDialog extends BaseDialog implements IMessageLoader {
    private LoadingCancelListener mLoadingCancelListener;
    private ARCLoadingView mLoadingView;
    private TextView mTvTipMessage;

    public LoadingDialog(Context context) {
        super(context, C2042R.layout.xui_dialog_loading);
        initView(getString(C2042R.string.xui_tip_loading_message));
    }

    private void initView(String str) {
        this.mLoadingView = (ARCLoadingView) findViewById(C2042R.id.arc_loading_view);
        this.mTvTipMessage = (TextView) findViewById(C2042R.id.tv_tip_message);
        updateMessage(str);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // androidx.appcompat.app.DialogC0104e, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.stop();
        }
        super.dismiss();
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public boolean isLoading() {
        return isShowing();
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    public void performShow() {
        super.performShow();
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.start();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void recycle() {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.recycle();
        }
    }

    @Override // android.app.Dialog, com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (z3) {
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.xuexiang.xui.widget.dialog.LoadingDialog.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (LoadingDialog.this.mLoadingCancelListener != null) {
                        LoadingDialog.this.mLoadingCancelListener.onCancelLoading();
                    }
                }
            });
        }
    }

    public LoadingDialog setIconScale(float f4) {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.setIconScale(f4);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setLoadingCancelListener(LoadingCancelListener loadingCancelListener) {
        this.mLoadingCancelListener = loadingCancelListener;
    }

    public LoadingDialog setLoadingIcon(Drawable drawable) {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.setLoadingIcon(drawable);
        }
        return this;
    }

    public LoadingDialog setLoadingSpeed(int i4) {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.setSpeedOfDegree(i4);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void updateMessage(String str) {
        if (this.mTvTipMessage != null) {
            if (TextUtils.isEmpty(str)) {
                this.mTvTipMessage.setText("");
                this.mTvTipMessage.setVisibility(8);
            } else {
                this.mTvTipMessage.setText(str);
                this.mTvTipMessage.setVisibility(0);
            }
        }
    }

    public LoadingDialog(Context context, String str) {
        super(context, C2042R.layout.xui_dialog_loading);
        initView(str);
    }

    public LoadingDialog setLoadingIcon(int i4) {
        return setLoadingIcon(getDrawable(i4));
    }

    public LoadingDialog(Context context, int i4) {
        super(context, i4, C2042R.layout.xui_dialog_loading);
        initView(getString(C2042R.string.xui_tip_loading_message));
    }

    public LoadingDialog(Context context, int i4, String str) {
        super(context, i4, C2042R.layout.xui_dialog_loading);
        initView(str);
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void updateMessage(int i4) {
        updateMessage(getString(i4));
    }
}
