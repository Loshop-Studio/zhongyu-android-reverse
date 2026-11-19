package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p133e9.InterfaceC9110a;

/* loaded from: classes5.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: d */
    public MiniLoadingView f15822d;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC8096a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC8096a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m12535b(MiniLoadingDialog.this);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9110a m12535b(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f15822d;
        if (miniLoadingView != null) {
            miniLoadingView.m13112f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (z10) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC8096a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        MiniLoadingView miniLoadingView = this.f15822d;
        if (miniLoadingView != null) {
            miniLoadingView.m13111e();
        }
    }
}
