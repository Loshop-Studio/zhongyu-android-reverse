package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.CatalogViewModel;

/* loaded from: classes3.dex */
public class DialogCatalogBindingImpl extends DialogCatalogBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.tv_catalog_title, 3);
        sparseIntArray.put(R$id.tv_sure, 4);
        sparseIntArray.put(R$id.view, 5);
        sparseIntArray.put(R$id.textView16, 6);
        sparseIntArray.put(R$id.textView17, 7);
        sparseIntArray.put(R$id.recyclerView_subject, 8);
        sparseIntArray.put(R$id.textView18, 9);
        sparseIntArray.put(R$id.textView19, 10);
        sparseIntArray.put(R$id.recyclerView_period, 11);
        sparseIntArray.put(R$id.recyclerView_grade, 12);
    }

    public DialogCatalogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityPeriodId(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CatalogViewModel catalogViewModel = this.mEntity;
        long j11 = j10 & 11;
        boolean z10 = false;
        if (j11 != 0) {
            MutableLiveData mutableLiveDataM12030b = catalogViewModel != null ? catalogViewModel.m12030b() : null;
            updateLiveDataRegistration(0, mutableLiveDataM12030b);
            if (ViewDataBinding.safeUnbox(mutableLiveDataM12030b != null ? (Integer) mutableLiveDataM12030b.getValue() : null) != 0) {
                z10 = true;
            }
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.textView20, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.textView21, Boolean.valueOf(z10));
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
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeEntityPeriodId((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.DialogCatalogBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    @Override // com.zykj.study.databinding.DialogCatalogBinding
    public void setEntity(@Nullable CatalogViewModel catalogViewModel) {
        this.mEntity = catalogViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((CatalogViewModel) obj);
            return true;
        }
        if (5 != i10) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    private DialogCatalogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (NestedScrollView) objArr[0], (RecyclerView) objArr[12], (RecyclerView) objArr[11], (RecyclerView) objArr[8], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (View) objArr[5]);
        this.mDirtyFlags = -1L;
        this.nested.setTag(null);
        this.textView20.setTag(null);
        this.textView21.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
