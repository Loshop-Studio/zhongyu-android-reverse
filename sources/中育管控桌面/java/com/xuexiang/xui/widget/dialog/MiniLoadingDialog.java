package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p141r2.InterfaceC7638a;

/* loaded from: classes3.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: c */
    public MiniLoadingView f4777c;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC5883a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC5883a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m4582d(MiniLoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC7638a m4582d(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo4579b() {
        super.mo4579b();
        MiniLoadingView miniLoadingView = this.f4777c;
        if (miniLoadingView != null) {
            miniLoadingView.m4912e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f4777c;
        if (miniLoadingView != null) {
            miniLoadingView.m4913f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z6) {
        super.setCancelable(z6);
        if (z6) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC5883a());
        }
    }
}
