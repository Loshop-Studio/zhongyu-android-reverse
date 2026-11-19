package com.xuexiang.xui.widget.dialog.materialdialog;

import android.content.Context;
import android.view.View;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;

/* loaded from: classes.dex */
public abstract class CustomMaterialDialog {
    protected MaterialDialog mDialog;

    public CustomMaterialDialog(Context context) {
        this.mDialog = getDialogBuilder(context).build();
        initViews(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends CustomMaterialDialog> T dismiss() {
        MaterialDialog materialDialog = this.mDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
        return this;
    }

    public <T extends View> T findViewById(int i4) {
        return (T) this.mDialog.findViewById(i4);
    }

    public MaterialDialog getDialog() {
        return this.mDialog;
    }

    protected abstract MaterialDialog.Builder getDialogBuilder(Context context);

    protected abstract void initViews(Context context);

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends CustomMaterialDialog> T show() {
        MaterialDialog materialDialog = this.mDialog;
        if (materialDialog != null) {
            materialDialog.show();
        }
        return this;
    }
}
