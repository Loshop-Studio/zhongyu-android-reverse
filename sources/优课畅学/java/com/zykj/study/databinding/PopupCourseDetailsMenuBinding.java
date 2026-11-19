package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.xuexiang.xui.widget.XUIWrapContentListView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class PopupCourseDetailsMenuBinding implements ViewBinding {

    @NonNull
    public final XUIWrapContentListView listView;

    @NonNull
    private final XUIWrapContentListView rootView;

    private PopupCourseDetailsMenuBinding(@NonNull XUIWrapContentListView xUIWrapContentListView, @NonNull XUIWrapContentListView xUIWrapContentListView2) {
        this.rootView = xUIWrapContentListView;
        this.listView = xUIWrapContentListView2;
    }

    @NonNull
    public static PopupCourseDetailsMenuBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        XUIWrapContentListView xUIWrapContentListView = (XUIWrapContentListView) view;
        return new PopupCourseDetailsMenuBinding(xUIWrapContentListView, xUIWrapContentListView);
    }

    @NonNull
    public static PopupCourseDetailsMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PopupCourseDetailsMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.popup_course_details_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public XUIWrapContentListView getRoot() {
        return this.rootView;
    }
}
