package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class DialogDateSearchBinding extends ViewDataBinding {

    @NonNull
    public final Button btDialogLeft;

    @NonNull
    public final Button btDialogRight;

    @NonNull
    public final MaterialCalendarView mcvEndDate;

    @NonNull
    public final MaterialCalendarView mcvStartDate;

    @NonNull
    public final RelativeLayout rlDateDialog;

    public DialogDateSearchBinding(Object obj, View view, int i10, Button button, Button button2, MaterialCalendarView materialCalendarView, MaterialCalendarView materialCalendarView2, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.btDialogLeft = button;
        this.btDialogRight = button2;
        this.mcvEndDate = materialCalendarView;
        this.mcvStartDate = materialCalendarView2;
        this.rlDateDialog = relativeLayout;
    }

    public static DialogDateSearchBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogDateSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogDateSearchBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogDateSearchBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_date_search);
    }

    @NonNull
    @Deprecated
    public static DialogDateSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogDateSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_date_search, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogDateSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogDateSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogDateSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_date_search, null, false, obj);
    }
}
