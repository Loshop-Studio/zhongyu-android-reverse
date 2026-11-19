package com.xuexiang.xui.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.progress.loading.IMessageLoader;
import com.xuexiang.xui.widget.progress.loading.LoadingCancelListener;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;

/* loaded from: classes.dex */
public class MiniLoadingDialog extends BaseDialog implements IMessageLoader {
    private LoadingCancelListener mLoadingCancelListener;
    private MiniLoadingView mLoadingView;
    private TextView mTvTipMessage;

    public MiniLoadingDialog(Context context) {
        super(context, C2042R.style.XUIDialog_Custom_MiniLoading, C2042R.layout.xui_dialog_loading_mini);
        initView(getString(C2042R.string.xui_tip_loading_message));
    }

    private void initView(String str) {
        this.mLoadingView = (MiniLoadingView) findViewById(C2042R.id.mini_loading_view);
        this.mTvTipMessage = (TextView) findViewById(C2042R.id.tv_tip_message);
        updateMessage(str);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // androidx.appcompat.app.DialogC0104e, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.mLoadingView;
        if (miniLoadingView != null) {
            miniLoadingView.stop();
        }
        super.dismiss();
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public boolean isLoading() {
        return isShowing();
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    protected void performShow() {
        super.performShow();
        MiniLoadingView miniLoadingView = this.mLoadingView;
        if (miniLoadingView != null) {
            miniLoadingView.start();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void recycle() {
    }

    @Override // android.app.Dialog, com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (z3) {
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.xuexiang.xui.widget.dialog.MiniLoadingDialog.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (MiniLoadingDialog.this.mLoadingCancelListener != null) {
                        MiniLoadingDialog.this.mLoadingCancelListener.onCancelLoading();
                    }
                }
            });
        }
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setLoadingCancelListener(LoadingCancelListener loadingCancelListener) {
        this.mLoadingCancelListener = loadingCancelListener;
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

    public MiniLoadingDialog(Context context, String str) {
        super(context, C2042R.style.XUIDialog_Custom_MiniLoading, C2042R.layout.xui_dialog_loading_mini);
        initView(str);
    }

    public MiniLoadingDialog(Context context, int i4) {
        super(context, i4, C2042R.layout.xui_dialog_loading_mini);
        initView(getString(C2042R.string.xui_tip_loading_message));
    }

    public MiniLoadingDialog(Context context, int i4, String str) {
        super(context, i4, C2042R.layout.xui_dialog_loading_mini);
        initView(str);
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void updateMessage(int i4) {
        updateMessage(getString(i4));
    }
}
