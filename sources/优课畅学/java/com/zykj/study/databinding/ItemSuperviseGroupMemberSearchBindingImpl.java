package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.SuperviseGroup;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemSuperviseGroupMemberSearchBindingImpl extends ItemSuperviseGroupMemberSearchBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.imageView15, 5);
        sparseIntArray.put(R$id.view5, 6);
    }

    public ItemSuperviseGroupMemberSearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        SuperviseGroup data;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mOnclick;
        SelectModel<SuperviseGroup> selectModel = this.mEntity;
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
            z10 = !zIsSelectModel;
            if (data != null) {
                name = data.getName();
            }
        } else {
            z10 = false;
        }
        if (j12 != 0) {
            AbstractC8354c.m13617t(this.imageView13, Boolean.valueOf(zIsSelectModel));
            AbstractC8354c.m13617t(this.imageView14, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.recycler, Boolean.valueOf(zIsSelectModel));
            TextViewBindingAdapter.setText(this.textView32, name);
        }
        if (j11 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
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

    @Override // com.zykj.study.databinding.ItemSuperviseGroupMemberSearchBinding
    public void setEntity(@Nullable SelectModel<SuperviseGroup> selectModel) {
        this.mEntity = selectModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupMemberSearchBinding
    public void setOnclick(@Nullable View.OnClickListener onClickListener) {
        this.mOnclick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(39);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (39 == i10) {
            setOnclick((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SelectModel) obj);
        return true;
    }

    private ItemSuperviseGroupMemberSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[1], (ImageView) objArr[5], (RecyclerView) objArr[4], (TextView) objArr[3], (View) objArr[6]);
        this.mDirtyFlags = -1L;
        this.imageView13.setTag(null);
        this.imageView14.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.recycler.setTag(null);
        this.textView32.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
