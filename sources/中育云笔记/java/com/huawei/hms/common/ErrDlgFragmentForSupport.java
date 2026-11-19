package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public class ErrDlgFragmentForSupport extends DialogFragment {

    /* renamed from: c */
    public Dialog f11439c = null;

    /* renamed from: d */
    public DialogInterface.OnCancelListener f11440d = null;

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11440d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f11439c == null) {
            setShowsDialog(false);
        }
        return this.f11439c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Preconditions.checkNotNull(fragmentManager, "FragmentManager cannot be null!");
        super.show(fragmentManager, str);
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        Preconditions.checkNotNull(dialog, "Dialog cannot be null!");
        ErrDlgFragmentForSupport errDlgFragmentForSupport = new ErrDlgFragmentForSupport();
        errDlgFragmentForSupport.f11439c = dialog;
        dialog.setOnCancelListener(null);
        errDlgFragmentForSupport.f11439c.setOnDismissListener(null);
        errDlgFragmentForSupport.f11440d = onCancelListener;
        return errDlgFragmentForSupport;
    }
}
