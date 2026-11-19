package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes3.dex */
public abstract class ViewDialogTextEditBinding extends ViewDataBinding {

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final LimitEditText etInput;

    @NonNull
    public final LinearLayout llEdit;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    public final View viewSolid;

    public ViewDialogTextEditBinding(Object obj, View view, int i, Button button, Button button2, LimitEditText limitEditText, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2) {
        super(obj, view, i);
        this.btnCancel = button;
        this.btnConfirm = button2;
        this.etInput = limitEditText;
        this.llEdit = linearLayout;
        this.root = constraintLayout;
        this.viewSolid = view2;
    }

    public static ViewDialogTextEditBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewDialogTextEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewDialogTextEditBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewDialogTextEditBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_dialog_text_edit);
    }

    @NonNull
    @Deprecated
    public static ViewDialogTextEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewDialogTextEditBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_dialog_text_edit, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewDialogTextEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewDialogTextEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewDialogTextEditBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_dialog_text_edit, null, false, obj);
    }
}
