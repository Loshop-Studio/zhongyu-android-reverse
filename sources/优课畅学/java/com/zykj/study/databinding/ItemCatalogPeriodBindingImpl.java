package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.PeriodEntity;

/* loaded from: classes3.dex */
public class ItemCatalogPeriodBindingImpl extends ItemCatalogPeriodBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final CheckBox mboundView0;

    public ItemCatalogPeriodBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        PeriodEntity data;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mClickListener;
        SelectModel<PeriodEntity> selectModel = this.mEntity;
        long j11 = 5 & j10;
        long j12 = j10 & 6;
        String name = null;
        boolean zIsSelectModel = false;
        if (j12 != 0) {
            if (selectModel != null) {
                zIsSelectModel = selectModel.isSelectModel();
                data = selectModel.getData();
            } else {
                data = null;
            }
            if (data != null) {
                name = data.getName();
            }
        }
        if (j11 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            CompoundButtonBindingAdapter.setChecked(this.mboundView0, zIsSelectModel);
            TextViewBindingAdapter.setText(this.mboundView0, name);
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemCatalogPeriodBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCatalogPeriodBinding
    public void setEntity(@Nullable SelectModel<PeriodEntity> selectModel) {
        this.mEntity = selectModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (5 == i10) {
            setClickListener((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SelectModel) obj);
        return true;
    }

    private ItemCatalogPeriodBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.mDirtyFlags = -1L;
        CheckBox checkBox = (CheckBox) objArr[0];
        this.mboundView0 = checkBox;
        checkBox.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
