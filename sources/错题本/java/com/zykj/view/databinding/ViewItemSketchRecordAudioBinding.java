package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewItemSketchRecordAudioBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivAudio;

    @NonNull
    public final AppCompatImageView ivRecord;

    @NonNull
    public final LinearLayoutCompat llCrop;

    @NonNull
    public final LinearLayoutCompat llDeleteDraft;

    @NonNull
    public final LinearLayoutCompat llOption;

    @NonNull
    public final LinearLayoutCompat llPreview;

    @NonNull
    public final LinearLayoutCompat llRecord;

    @NonNull
    public final LinearLayoutCompat llUpload;

    @NonNull
    public final TextView tvProgress;

    public ViewItemSketchRecordAudioBinding(Object obj, View view, int i, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, LinearLayoutCompat linearLayoutCompat5, LinearLayoutCompat linearLayoutCompat6, TextView textView) {
        super(obj, view, i);
        this.ivAudio = imageView;
        this.ivRecord = appCompatImageView;
        this.llCrop = linearLayoutCompat;
        this.llDeleteDraft = linearLayoutCompat2;
        this.llOption = linearLayoutCompat3;
        this.llPreview = linearLayoutCompat4;
        this.llRecord = linearLayoutCompat5;
        this.llUpload = linearLayoutCompat6;
        this.tvProgress = textView;
    }

    public static ViewItemSketchRecordAudioBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewItemSketchRecordAudioBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewItemSketchRecordAudioBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewItemSketchRecordAudioBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_item_sketch_record_audio);
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchRecordAudioBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewItemSketchRecordAudioBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_record_audio, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewItemSketchRecordAudioBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchRecordAudioBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewItemSketchRecordAudioBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_record_audio, null, false, obj);
    }
}
