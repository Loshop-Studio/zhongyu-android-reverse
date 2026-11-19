package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.StudyViewModel;

/* loaded from: classes3.dex */
public class FragmentStudyBindingImpl extends FragmentStudyBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{1}, new int[]{R$layout.layout_bind_view_model});
        sViewsWithIds = null;
    }

    public FragmentStudyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        UnPeekLiveData<ToastMessage> toastLiveData;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        StudyViewModel studyViewModel = this.mViewModel;
        Boolean value = null;
        if ((15 & j10) != 0) {
            if ((j10 & 13) != 0) {
                toastLiveData = studyViewModel != null ? studyViewModel.getToastLiveData() : null;
                updateLiveDataRegistration(0, toastLiveData);
                if (toastLiveData != null) {
                    toastLiveData.getValue();
                }
            } else {
                toastLiveData = null;
            }
            if ((j10 & 14) != 0) {
                LiveData<?> liveDataIsDialogVisible = studyViewModel != null ? studyViewModel.isDialogVisible() : null;
                updateLiveDataRegistration(1, liveDataIsDialogVisible);
                if (liveDataIsDialogVisible != null) {
                    value = liveDataIsDialogVisible.getValue();
                }
            }
        } else {
            toastLiveData = null;
        }
        if ((14 & j10) != 0) {
            this.mboundView0.setIsDialogVisible(value);
        }
        if ((j10 & 13) != 0) {
            this.mboundView0.setToastLiveData(toastLiveData);
        }
        ViewDataBinding.executeBindingsOn(this.mboundView0);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.mboundView0.hasPendingBindings();
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
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((StudyViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentStudyBinding
    public void setViewModel(@Nullable StudyViewModel studyViewModel) {
        this.mViewModel = studyViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentStudyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (LinearLayout) objArr[0]);
        this.mDirtyFlags = -1L;
        this.fragmentStudy.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[1];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        setRootTag(view);
        invalidateAll();
    }
}
