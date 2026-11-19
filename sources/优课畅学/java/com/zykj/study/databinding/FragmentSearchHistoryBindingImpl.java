package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.SearchViewModel;

/* loaded from: classes3.dex */
public class FragmentSearchHistoryBindingImpl extends FragmentSearchHistoryBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.tv_recent_search, 1);
        sparseIntArray.put(R$id.tv_clear, 2);
        sparseIntArray.put(R$id.view3, 3);
        sparseIntArray.put(R$id.statusView, 4);
        sparseIntArray.put(R$id.recycle_history, 5);
    }

    public FragmentSearchHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.FragmentSearchHistoryBinding
    public void setSearchViewModel(@Nullable SearchViewModel searchViewModel) {
        this.mSearchViewModel = searchViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (43 != i10) {
            return false;
        }
        setSearchViewModel((SearchViewModel) obj);
        return true;
    }

    private FragmentSearchHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (RecyclerView) objArr[5], (MultipleStatusView) objArr[4], (TextView) objArr[2], (TextView) objArr[1], (View) objArr[3]);
        this.mDirtyFlags = -1L;
        this.fragmentSearchHistory.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
