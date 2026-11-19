package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.MyCourseDetailsViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentMyCourseDetailsBinding extends ViewDataBinding {

    @NonNull
    public final LayoutMyCourseDetailsCatalogBinding courseCatalog;

    @NonNull
    public final LayoutMyCourseSynopsisBinding courseSynopsis;

    @NonNull
    public final ConstraintLayout fragmentMyCourseDetails;

    @NonNull
    public final Guideline guideline2;

    @Bindable
    protected MyCourseDetailsViewModel mDetailsEntity;

    @Bindable
    protected DictViewModel mDictViewModel;

    @NonNull
    public final TitleBar toolbar2;

    public FragmentMyCourseDetailsBinding(Object obj, View view, int i10, LayoutMyCourseDetailsCatalogBinding layoutMyCourseDetailsCatalogBinding, LayoutMyCourseSynopsisBinding layoutMyCourseSynopsisBinding, ConstraintLayout constraintLayout, Guideline guideline, TitleBar titleBar) {
        super(obj, view, i10);
        this.courseCatalog = layoutMyCourseDetailsCatalogBinding;
        this.courseSynopsis = layoutMyCourseSynopsisBinding;
        this.fragmentMyCourseDetails = constraintLayout;
        this.guideline2 = guideline;
        this.toolbar2 = titleBar;
    }

    public static FragmentMyCourseDetailsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMyCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MyCourseDetailsViewModel getDetailsEntity() {
        return this.mDetailsEntity;
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    public abstract void setDetailsEntity(@Nullable MyCourseDetailsViewModel myCourseDetailsViewModel);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    @Deprecated
    public static FragmentMyCourseDetailsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMyCourseDetailsBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_my_course_details);
    }

    @NonNull
    @Deprecated
    public static FragmentMyCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMyCourseDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my_course_details, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMyCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMyCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMyCourseDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my_course_details, null, false, obj);
    }
}
