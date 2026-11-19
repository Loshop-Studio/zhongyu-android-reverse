package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.edittext.MultiLineEditText;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.EditCourseViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentEditCourseBinding extends ViewDataBinding {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final EditText editText;

    @NonNull
    public final MultiLineEditText etDesc;

    @NonNull
    public final LinearLayout fragmentEditCourse;

    @NonNull
    public final ImageView ivCover;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected EditCourseViewModel mEditCourseViewModel;

    @NonNull
    public final RadioGroup radioGroup;

    @NonNull
    public final RadioButton rbCustom;

    @NonNull
    public final RadioButton rbSystem;

    @NonNull
    public final RecyclerView recycleViewSys;

    @NonNull
    public final RelativeLayout rlCustomCover;

    @NonNull
    public final SuperTextView svCatalog;

    @NonNull
    public final SuperTextView svPublic;

    @NonNull
    public final TextView textView10;

    @NonNull
    public final TextView textView11;

    @NonNull
    public final TextView textView12;

    @NonNull
    public final TextView textView13;

    @NonNull
    public final TextView textView14;

    @NonNull
    public final TextView textView6;

    @NonNull
    public final TextView textView7;

    @NonNull
    public final TextView textView8;

    @NonNull
    public final TextView textView9;

    @NonNull
    public final Toolbar toolbar;

    public FragmentEditCourseBinding(Object obj, View view, int i10, Barrier barrier, EditText editText, MultiLineEditText multiLineEditText, LinearLayout linearLayout, ImageView imageView, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2, RecyclerView recyclerView, RelativeLayout relativeLayout, SuperTextView superTextView, SuperTextView superTextView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, Toolbar toolbar) {
        super(obj, view, i10);
        this.barrier = barrier;
        this.editText = editText;
        this.etDesc = multiLineEditText;
        this.fragmentEditCourse = linearLayout;
        this.ivCover = imageView;
        this.radioGroup = radioGroup;
        this.rbCustom = radioButton;
        this.rbSystem = radioButton2;
        this.recycleViewSys = recyclerView;
        this.rlCustomCover = relativeLayout;
        this.svCatalog = superTextView;
        this.svPublic = superTextView2;
        this.textView10 = textView;
        this.textView11 = textView2;
        this.textView12 = textView3;
        this.textView13 = textView4;
        this.textView14 = textView5;
        this.textView6 = textView6;
        this.textView7 = textView7;
        this.textView8 = textView8;
        this.textView9 = textView9;
        this.toolbar = toolbar;
    }

    public static FragmentEditCourseBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentEditCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    @Nullable
    public EditCourseViewModel getEditCourseViewModel() {
        return this.mEditCourseViewModel;
    }

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEditCourseViewModel(@Nullable EditCourseViewModel editCourseViewModel);

    @Deprecated
    public static FragmentEditCourseBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentEditCourseBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_edit_course);
    }

    @NonNull
    @Deprecated
    public static FragmentEditCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentEditCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_edit_course, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentEditCourseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentEditCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentEditCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_edit_course, null, false, obj);
    }
}
