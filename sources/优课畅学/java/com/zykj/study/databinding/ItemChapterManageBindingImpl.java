package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CatalogManageData;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemChapterManageBindingImpl extends ItemChapterManageBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    @NonNull
    private final AppCompatTextView mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.linearLayout, 5);
    }

    public ItemChapterManageBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zIsLockable;
        boolean zIsUnlock;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CatalogManageData catalogManageData = this.mData;
        long j11 = j10 & 3;
        boolean zIsExpanded = false;
        String name = null;
        if (j11 != 0) {
            if (catalogManageData != null) {
                zIsExpanded = catalogManageData.isExpanded();
                name = catalogManageData.getName();
                zIsLockable = catalogManageData.isLockable();
                zIsUnlock = catalogManageData.isUnlock();
            } else {
                zIsLockable = false;
                zIsUnlock = false;
            }
            z10 = !zIsExpanded;
        } else {
            zIsLockable = false;
            zIsUnlock = false;
            z10 = false;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.ivExpanded, Boolean.valueOf(zIsExpanded));
            BindingAdaptersKt.visibleOrGone(this.ivUnexpanded, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.mboundView3, name);
            AbstractC8354c.m13605h(this.switchBtn, zIsUnlock);
            AbstractC8354c.m13599b(this.switchBtn, zIsLockable);
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemChapterManageBinding
    public void setData(@Nullable CatalogManageData catalogManageData) {
        this.mData = catalogManageData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (7 != i10) {
            return false;
        }
        setData((CatalogManageData) obj);
        return true;
    }

    private ItemChapterManageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[2], (LinearLayoutCompat) objArr[5], (SwitchButton) objArr[4]);
        this.mDirtyFlags = -1L;
        this.ivExpanded.setTag(null);
        this.ivUnexpanded.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[3];
        this.mboundView3 = appCompatTextView;
        appCompatTextView.setTag(null);
        this.switchBtn.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
