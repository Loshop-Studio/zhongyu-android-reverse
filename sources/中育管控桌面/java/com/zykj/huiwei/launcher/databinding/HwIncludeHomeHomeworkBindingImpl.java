package com.zykj.huiwei.launcher.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.manage.R;
import p078i4.AbstractC6538h;

/* loaded from: classes4.dex */
public class HwIncludeHomeHomeworkBindingImpl extends HwIncludeHomeHomeworkBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    public HwIncludeHomeHomeworkBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 4, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmTodoItemsNum(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmTodoUrgeNum(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j6;
        LiveData liveDataM6087H;
        LiveData liveDataM6085F;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        HomeViewModel homeViewModel = this.mVm;
        View.OnClickListener onClickListener = this.mClickListener;
        long j7 = 23 & j6;
        if (j7 != 0) {
            if (homeViewModel != null) {
                liveDataM6085F = homeViewModel.getTodoItemsNum();
                liveDataM6087H = homeViewModel.getTodoUrgeNum();
            } else {
                liveDataM6087H = null;
                liveDataM6085F = null;
            }
            updateLiveDataRegistration(0, liveDataM6085F);
            updateLiveDataRegistration(1, liveDataM6087H);
            string = this.tvHomeWorkTitle.getResources().getString(R.string.hw_homework_todo, liveDataM6085F != null ? (String) liveDataM6085F.getValue() : null, liveDataM6087H != null ? (String) liveDataM6087H.getValue() : null);
        }
        long j8 = j6 & 24;
        if (j7 != 0) {
            TextViewBindingAdapter.setText(this.tvHomeWorkTitle, string);
        }
        if (j8 != 0) {
            AbstractC6538h.m7324g(this.tvShowAll, onClickListener);
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
            this.mDirtyFlags = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmTodoItemsNum((LiveData) obj, i7);
        }
        if (i6 != 1) {
            return false;
        }
        return onChangeVmTodoUrgeNum((LiveData) obj, i7);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeHomeworkBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((HomeViewModel) obj);
            return true;
        }
        if (2 != i6) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeHomeworkBinding
    public void setVm(@Nullable HomeViewModel homeViewModel) {
        this.mVm = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwIncludeHomeHomeworkBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 2, (View) objArr[0], (RecyclerView) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.homeWorkBg.setTag(null);
        this.rvHomeWork.setTag(null);
        this.tvHomeWorkTitle.setTag(null);
        this.tvShowAll.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
