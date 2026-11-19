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
import com.zykj.study.R$id;
import com.zykj.study.data.SearchHistoryEntity;

/* loaded from: classes3.dex */
public class ItemHistorySearchBindingImpl extends ItemHistorySearchBinding {

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
        sparseIntArray.put(R$id.iv_time, 3);
    }

    public ItemHistorySearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mClickListener;
        View.OnClickListener onClickListener2 = this.mDeleteClickListener;
        SearchHistoryEntity searchHistoryEntity = this.mEntity;
        long j11 = 9 & j10;
        long j12 = 10 & j10;
        long j13 = j10 & 12;
        String searchKey = (j13 == 0 || searchHistoryEntity == null) ? null : searchHistoryEntity.getSearchKey();
        if (j12 != 0) {
            this.ivDelete.setOnClickListener(onClickListener2);
        }
        if (j11 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            TextViewBindingAdapter.setText(this.textView23, searchKey);
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
        return false;
    }

    @Override // com.zykj.study.databinding.ItemHistorySearchBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemHistorySearchBinding
    public void setDeleteClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mDeleteClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemHistorySearchBinding
    public void setEntity(@Nullable SearchHistoryEntity searchHistoryEntity) {
        this.mEntity = searchHistoryEntity;
        synchronized (this) {
            this.mDirtyFlags |= 4;
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
        if (9 == i10) {
            setDeleteClickListener((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SearchHistoryEntity) obj);
        return true;
    }

    private ItemHistorySearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.ivDelete.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.textView23.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
