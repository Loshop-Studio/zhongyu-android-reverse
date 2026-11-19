package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: c */
    public Dialog f11441c = null;

    /* renamed from: d */
    public DialogInterface.OnCancelListener f11442d = null;

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11442d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f11441c == null) {
            setShowsDialog(false);
        }
        return this.f11441c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Preconditions.checkNotNull(fragmentManager, "FragmentManager cannot be null!");
        super.show(fragmentManager, str);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        Preconditions.checkNotNull(dialog, "Dialog cannot be null!");
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        errorDialogFragment.f11441c = dialog;
        dialog.setOnCancelListener(null);
        errorDialogFragment.f11441c.setOnDismissListener(null);
        if (onCancelListener != null) {
            errorDialogFragment.f11442d = onCancelListener;
        }
        return errorDialogFragment;
    }
}
