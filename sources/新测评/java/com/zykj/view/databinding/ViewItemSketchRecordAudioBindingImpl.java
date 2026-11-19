package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewItemSketchRecordAudioBindingImpl extends ViewItemSketchRecordAudioBinding {

    /* renamed from: l */
    public static final ViewDataBinding.IncludedLayouts f11555l = null;

    /* renamed from: m */
    public static final SparseIntArray f11556m;

    /* renamed from: j */
    public final LinearLayoutCompat f11557j;

    /* renamed from: k */
    public long f11558k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11556m = sparseIntArray;
        sparseIntArray.put(R$id.iv_record, 1);
        sparseIntArray.put(R$id.iv_audio, 2);
        sparseIntArray.put(R$id.ll_record, 3);
        sparseIntArray.put(R$id.tv_progress, 4);
        sparseIntArray.put(R$id.ll_crop, 5);
        sparseIntArray.put(R$id.ll_option, 6);
        sparseIntArray.put(R$id.ll_preview, 7);
        sparseIntArray.put(R$id.ll_upload, 8);
        sparseIntArray.put(R$id.ll_delete_draft, 9);
    }

    public ViewItemSketchRecordAudioBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, f11555l, f11556m));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11558k = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11558k != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11558k = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewItemSketchRecordAudioBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (AppCompatImageView) objArr[1], (LinearLayoutCompat) objArr[5], (LinearLayoutCompat) objArr[9], (LinearLayoutCompat) objArr[6], (LinearLayoutCompat) objArr[7], (LinearLayoutCompat) objArr[3], (LinearLayoutCompat) objArr[8], (TextView) objArr[4]);
        this.f11558k = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11557j = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
