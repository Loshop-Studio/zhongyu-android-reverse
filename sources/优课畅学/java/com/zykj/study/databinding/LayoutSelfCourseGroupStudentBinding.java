package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class LayoutSelfCourseGroupStudentBinding implements ViewBinding {

    @NonNull
    public final GridLayout courseGroupStudentBg;

    @NonNull
    private final GridLayout rootView;

    private LayoutSelfCourseGroupStudentBinding(@NonNull GridLayout gridLayout, @NonNull GridLayout gridLayout2) {
        this.rootView = gridLayout;
        this.courseGroupStudentBg = gridLayout2;
    }

    @NonNull
    public static LayoutSelfCourseGroupStudentBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        GridLayout gridLayout = (GridLayout) view;
        return new LayoutSelfCourseGroupStudentBinding(gridLayout, gridLayout);
    }

    @NonNull
    public static LayoutSelfCourseGroupStudentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSelfCourseGroupStudentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_self_course_group_student, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public GridLayout getRoot() {
        return this.rootView;
    }
}
