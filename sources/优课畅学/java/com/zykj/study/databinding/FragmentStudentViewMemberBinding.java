package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.StudentViewViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentStudentViewMemberBinding extends ViewDataBinding {

    @NonNull
    public final RoundButton btnCreate;

    @NonNull
    public final ClearEditText etSearch;

    @NonNull
    public final LinearLayout fragmentStudentViewMember;

    @Bindable
    protected StudentViewViewModel mViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    public final RecyclerView recyclerSearch;

    public FragmentStudentViewMemberBinding(Object obj, View view, int i10, RoundButton roundButton, ClearEditText clearEditText, LinearLayout linearLayout, MultipleStatusView multipleStatusView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.btnCreate = roundButton;
        this.etSearch = clearEditText;
        this.fragmentStudentViewMember = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.recycler = recyclerView;
        this.recyclerSearch = recyclerView2;
    }

    public static FragmentStudentViewMemberBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudentViewMemberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public StudentViewViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable StudentViewViewModel studentViewViewModel);

    @Deprecated
    public static FragmentStudentViewMemberBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudentViewMemberBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_student_view_member);
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewMemberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudentViewMemberBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view_member, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudentViewMemberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudentViewMemberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudentViewMemberBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_student_view_member, null, false, obj);
    }
}
