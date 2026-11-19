package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;

/* loaded from: classes3.dex */
public class FragmentManagementSubscribeBindingImpl extends FragmentManagementSubscribeBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    @Nullable
    private final LayoutBindViewModelBinding mboundView01;

    @NonNull
    private final LinearLayoutCompat mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{6}, new int[]{R$layout.layout_bind_view_model});
        includedLayouts.setIncludes(1, new String[]{"layout_free_subscriber_list_empty", "layout_free_subscriber_list", "layout_self_course_subscriber_list", "layout_other_course_subscriber_list"}, new int[]{2, 3, 4, 5}, new int[]{R$layout.layout_free_subscriber_list_empty, R$layout.layout_free_subscriber_list, R$layout.layout_self_course_subscriber_list, R$layout.layout_other_course_subscriber_list});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.title, 7);
        sparseIntArray.put(R$id.subscribe_tab_list, 8);
        sparseIntArray.put(R$id.guideline4, 9);
    }

    public FragmentManagementSubscribeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private boolean onChangeFreeSubscriberList(LayoutFreeSubscriberListBinding layoutFreeSubscriberListBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFreeSubscriberListEmpty(LayoutFreeSubscriberListEmptyBinding layoutFreeSubscriberListEmptyBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeOtherCourseSubscriberList(LayoutOtherCourseSubscriberListBinding layoutOtherCourseSubscriberListBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeSelfCourseSubscriberList(LayoutSelfCourseSubscriberListBinding layoutSelfCourseSubscriberListBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
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
        ManagementSubscribeViewModel managementSubscribeViewModel = this.mViewModel;
        Boolean value = null;
        if ((228 & j10) != 0) {
            if ((j10 & 196) != 0) {
                toastLiveData = managementSubscribeViewModel != null ? managementSubscribeViewModel.getToastLiveData() : null;
                updateLiveDataRegistration(2, toastLiveData);
                if (toastLiveData != null) {
                    toastLiveData.getValue();
                }
            } else {
                toastLiveData = null;
            }
            if ((j10 & 224) != 0) {
                LiveData<?> liveDataIsDialogVisible = managementSubscribeViewModel != null ? managementSubscribeViewModel.isDialogVisible() : null;
                updateLiveDataRegistration(5, liveDataIsDialogVisible);
                if (liveDataIsDialogVisible != null) {
                    value = liveDataIsDialogVisible.getValue();
                }
            }
        } else {
            toastLiveData = null;
        }
        if ((224 & j10) != 0) {
            this.mboundView01.setIsDialogVisible(value);
        }
        if ((j10 & 196) != 0) {
            this.mboundView01.setToastLiveData(toastLiveData);
        }
        ViewDataBinding.executeBindingsOn(this.freeSubscriberListEmpty);
        ViewDataBinding.executeBindingsOn(this.freeSubscriberList);
        ViewDataBinding.executeBindingsOn(this.selfCourseSubscriberList);
        ViewDataBinding.executeBindingsOn(this.otherCourseSubscriberList);
        ViewDataBinding.executeBindingsOn(this.mboundView01);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.freeSubscriberListEmpty.hasPendingBindings() || this.freeSubscriberList.hasPendingBindings() || this.selfCourseSubscriberList.hasPendingBindings() || this.otherCourseSubscriberList.hasPendingBindings() || this.mboundView01.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
        }
        this.freeSubscriberListEmpty.invalidateAll();
        this.freeSubscriberList.invalidateAll();
        this.selfCourseSubscriberList.invalidateAll();
        this.otherCourseSubscriberList.invalidateAll();
        this.mboundView01.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeSelfCourseSubscriberList((LayoutSelfCourseSubscriberListBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeFreeSubscriberList((LayoutFreeSubscriberListBinding) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeFreeSubscriberListEmpty((LayoutFreeSubscriberListEmptyBinding) obj, i11);
        }
        if (i10 == 4) {
            return onChangeOtherCourseSubscriberList((LayoutOtherCourseSubscriberListBinding) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.freeSubscriberListEmpty.setLifecycleOwner(lifecycleOwner);
        this.freeSubscriberList.setLifecycleOwner(lifecycleOwner);
        this.selfCourseSubscriberList.setLifecycleOwner(lifecycleOwner);
        this.otherCourseSubscriberList.setLifecycleOwner(lifecycleOwner);
        this.mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((ManagementSubscribeViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentManagementSubscribeBinding
    public void setViewModel(@Nullable ManagementSubscribeViewModel managementSubscribeViewModel) {
        this.mViewModel = managementSubscribeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentManagementSubscribeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (LayoutFreeSubscriberListBinding) objArr[3], (LayoutFreeSubscriberListEmptyBinding) objArr[2], (Guideline) objArr[9], (LayoutOtherCourseSubscriberListBinding) objArr[5], (LayoutSelfCourseSubscriberListBinding) objArr[4], (RecyclerView) objArr[8], (TitleBar) objArr[7]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.freeSubscriberList);
        setContainedBinding(this.freeSubscriberListEmpty);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[6];
        this.mboundView01 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.mboundView1 = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        setContainedBinding(this.otherCourseSubscriberList);
        setContainedBinding(this.selfCourseSubscriberList);
        setRootTag(view);
        invalidateAll();
    }
}
