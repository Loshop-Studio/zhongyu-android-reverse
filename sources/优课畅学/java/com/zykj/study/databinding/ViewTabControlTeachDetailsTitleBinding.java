package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.xuexiang.xui.widget.tabbar.TabControlView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public final class ViewTabControlTeachDetailsTitleBinding implements ViewBinding {

    @NonNull
    public final TabControlView controlView;

    @NonNull
    private final TabControlView rootView;

    private ViewTabControlTeachDetailsTitleBinding(@NonNull TabControlView tabControlView, @NonNull TabControlView tabControlView2) {
        this.rootView = tabControlView;
        this.controlView = tabControlView2;
    }

    @NonNull
    public static ViewTabControlTeachDetailsTitleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TabControlView tabControlView = (TabControlView) view;
        return new ViewTabControlTeachDetailsTitleBinding(tabControlView, tabControlView);
    }

    @NonNull
    public static ViewTabControlTeachDetailsTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewTabControlTeachDetailsTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R$layout.view_tab_control_teach_details_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TabControlView getRoot() {
        return this.rootView;
    }
}
