package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.legacy.widget.Space;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public class ItemKnowledgeEditBindingImpl extends ItemKnowledgeEditBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_add, 3);
    }

    public ItemKnowledgeEditBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsChild;
        CatalogBean catalogBean = this.mEntity;
        long j11 = 5 & j10;
        long j12 = j10 & 6;
        String title = (j12 == 0 || catalogBean == null) ? null : catalogBean.getTitle();
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.tvTitle, title);
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.viewSpace, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.ItemKnowledgeEditBinding
    public void setEntity(@Nullable CatalogBean catalogBean) {
        this.mEntity = catalogBean;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemKnowledgeEditBinding
    public void setIsChild(boolean z10) {
        this.mIsChild = z10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(23);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (23 == i10) {
            setIsChild(((Boolean) obj).booleanValue());
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((CatalogBean) obj);
        return true;
    }

    private ItemKnowledgeEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (TextView) objArr[2], (Space) objArr[1]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        this.tvTitle.setTag(null);
        this.viewSpace.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
