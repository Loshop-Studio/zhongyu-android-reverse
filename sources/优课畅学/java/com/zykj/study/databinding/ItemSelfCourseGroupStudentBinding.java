package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class ItemSelfCourseGroupStudentBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final AppCompatTextView tvName;

    private ItemSelfCourseGroupStudentBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.tvName = appCompatTextView;
    }

    @NonNull
    public static ItemSelfCourseGroupStudentBinding bind(@NonNull View view) {
        int i10 = R$id.tv_name;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
        if (appCompatTextView != null) {
            return new ItemSelfCourseGroupStudentBinding((LinearLayoutCompat) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemSelfCourseGroupStudentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSelfCourseGroupStudentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.item_self_course_group_student, viewGroup, false);
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
