package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0454c;

/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class C0105f extends DialogInterfaceOnCancelListenerC0454c {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0454c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0104e(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0454c
    public void setupDialog(Dialog dialog, int i4) {
        if (!(dialog instanceof DialogC0104e)) {
            super.setupDialog(dialog, i4);
            return;
        }
        DialogC0104e dialogC0104e = (DialogC0104e) dialog;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0104e.supportRequestWindowFeature(1);
    }
}
