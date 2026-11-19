package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public class ViewItemSketchRecordAudioBindingImpl extends ViewItemSketchRecordAudioBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.iv_record, 1);
        sparseIntArray.put(C5280R.id.iv_audio, 2);
        sparseIntArray.put(C5280R.id.ll_record, 3);
        sparseIntArray.put(C5280R.id.tv_progress, 4);
        sparseIntArray.put(C5280R.id.ll_crop, 5);
        sparseIntArray.put(C5280R.id.ll_option, 6);
        sparseIntArray.put(C5280R.id.ll_preview, 7);
        sparseIntArray.put(C5280R.id.ll_upload, 8);
        sparseIntArray.put(C5280R.id.ll_delete_draft, 9);
    }

    public ViewItemSketchRecordAudioBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewItemSketchRecordAudioBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (AppCompatImageView) objArr[1], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[9], (LinearLayoutCompat) objArr[6], (LinearLayoutCompat) objArr[7], (LinearLayoutCompat) objArr[3], (LinearLayoutCompat) objArr[8], (TextView) objArr[4]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
