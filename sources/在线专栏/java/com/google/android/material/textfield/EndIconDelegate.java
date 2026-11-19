package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class EndIconDelegate {
    Context context;
    CheckableImageButton endIconView;
    TextInputLayout textInputLayout;

    EndIconDelegate(TextInputLayout textInputLayout) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
    }

    abstract void initialize();

    boolean isBoxBackgroundModeSupported(int i4) {
        return true;
    }

    void onSuffixVisibilityChanged(boolean z3) {
    }

    boolean shouldTintIconOnError() {
        return false;
    }
}
