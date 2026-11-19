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
import com.zykj.study.viewmodels.CourseDetailsViewModel;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentCourseDetailsBinding extends ViewDataBinding {

    @NonNull
    public final LayoutCourseDetailsCatalogBinding courseCatalog;

    @NonNull
    public final LayoutCourseSynopsisBinding courseSynopsis;

    @NonNull
    public final ConstraintLayout fragmentCourseDetails;

    @NonNull
    public final Guideline guideline2;

    @Bindable
    protected CourseDetailsViewModel mDetailsEntity;

    @Bindable
    protected DictViewModel mDictViewModel;

    @NonNull
    public final TitleBar toolbar2;

    public FragmentCourseDetailsBinding(Object obj, View view, int i10, LayoutCourseDetailsCatalogBinding layoutCourseDetailsCatalogBinding, LayoutCourseSynopsisBinding layoutCourseSynopsisBinding, ConstraintLayout constraintLayout, Guideline guideline, TitleBar titleBar) {
        super(obj, view, i10);
        this.courseCatalog = layoutCourseDetailsCatalogBinding;
        this.courseSynopsis = layoutCourseSynopsisBinding;
        this.fragmentCourseDetails = constraintLayout;
        this.guideline2 = guideline;
        this.toolbar2 = titleBar;
    }

    public static FragmentCourseDetailsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CourseDetailsViewModel getDetailsEntity() {
        return this.mDetailsEntity;
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    public abstract void setDetailsEntity(@Nullable CourseDetailsViewModel courseDetailsViewModel);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    @Deprecated
    public static FragmentCourseDetailsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseDetailsBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course_details);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_details, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_details, null, false, obj);
    }
}
