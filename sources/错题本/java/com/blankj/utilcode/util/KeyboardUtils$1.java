package com.blankj.utilcode.util;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
class KeyboardUtils$1 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InputMethodManager inputMethodManager;
        if ((i == 1 || i == 3) && (inputMethodManager = (InputMethodManager) AbstractC3382c.m2303d().getSystemService("input_method")) != null) {
            inputMethodManager.toggleSoftInput(0, 0);
        }
    }
}
