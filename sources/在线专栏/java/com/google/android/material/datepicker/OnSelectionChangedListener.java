package com.google.android.material.datepicker;

/* loaded from: classes.dex */
abstract class OnSelectionChangedListener<S> {
    OnSelectionChangedListener() {
    }

    void onIncompleteSelectionChanged() {
    }

    abstract void onSelectionChanged(S s3);
}
