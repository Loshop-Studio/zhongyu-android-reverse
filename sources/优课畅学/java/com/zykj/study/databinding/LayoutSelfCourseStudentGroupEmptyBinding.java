package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class LayoutSelfCourseStudentGroupEmptyBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView ivGroupNoStudent;

    @NonNull
    private final LinearLayoutCompat rootView;

    private LayoutSelfCourseStudentGroupEmptyBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.ivGroupNoStudent = appCompatImageView;
    }

    @NonNull
    public static LayoutSelfCourseStudentGroupEmptyBinding bind(@NonNull View view) {
        int i10 = R$id.iv_group_no_student;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            return new LayoutSelfCourseStudentGroupEmptyBinding((LinearLayoutCompat) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutSelfCourseStudentGroupEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSelfCourseStudentGroupEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_self_course_student_group_empty, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
