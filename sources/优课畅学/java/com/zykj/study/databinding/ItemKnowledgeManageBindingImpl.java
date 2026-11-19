package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;
import com.zykj.image.R$dimen;
import com.zykj.study.bean.course.CatalogManageData;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemKnowledgeManageBindingImpl extends ItemKnowledgeManageBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    @NonNull
    private final AppCompatTextView mboundView1;

    public ItemKnowledgeManageBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        float dimension;
        boolean zIsUnlock;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CatalogManageData catalogManageData = this.mData;
        long j11 = j10 & 3;
        boolean zIsRoot = false;
        String name = null;
        if (j11 != 0) {
            if (catalogManageData != null) {
                name = catalogManageData.getName();
                zIsRoot = catalogManageData.isRoot();
                zIsUnlock = catalogManageData.isUnlock();
            } else {
                zIsUnlock = false;
            }
            if (j11 != 0) {
                j10 |= zIsRoot ? 8L : 4L;
            }
            dimension = this.mboundView0.getResources().getDimension(zIsRoot ? R$dimen.view_10 : R$dimen.view_34);
            zIsRoot = zIsUnlock;
        } else {
            dimension = 0.0f;
        }
        if ((j10 & 3) != 0) {
            ViewBindingAdapter.setPaddingStart(this.mboundView0, dimension);
            TextViewBindingAdapter.setText(this.mboundView1, name);
            AbstractC8354c.m13605h(this.switchBtn, zIsRoot);
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

    @Override // com.zykj.study.databinding.ItemKnowledgeManageBinding
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

    private ItemKnowledgeManageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SwitchButton) objArr[2]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[1];
        this.mboundView1 = appCompatTextView;
        appCompatTextView.setTag(null);
        this.switchBtn.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
