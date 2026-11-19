package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.huiwei.launcher.p035ui.adapter.HomeworkAdapter;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public class HwFragmentHomeBindingImpl extends HwFragmentHomeBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView1;

    @Nullable
    private final HwStateViewBinding mboundView11;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"hw_include_home_sidebar"}, new int[]{6}, new int[]{R.layout.hw_include_home_sidebar});
        includedLayouts.setIncludes(1, new String[]{"hw_include_home_title", "hw_include_home_homework", "hw_include_home_app", "hw_state_view"}, new int[]{2, 3, 4, 5}, new int[]{R.layout.hw_include_home_title, R.layout.hw_include_home_homework, R.layout.hw_include_home_app, R.layout.hw_state_view});
        sViewsWithIds = null;
    }

    public HwFragmentHomeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeIncludeApp(HwIncludeHomeAppBinding hwIncludeHomeAppBinding, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeIncludeHomework(HwIncludeHomeHomeworkBinding hwIncludeHomeHomeworkBinding, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeIncludeSideBar(HwIncludeHomeSidebarBinding hwIncludeHomeSidebarBinding, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeIncludeTitle(HwIncludeHomeTitleBinding hwIncludeHomeTitleBinding, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j6;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        HomeViewModel homeViewModel = this.mVm;
        MainViewModel mainViewModel = this.mMainViewModel;
        View.OnClickListener onClickListener = this.mClickListener;
        long j7 = 272 & j6;
        long j8 = 288 & j6;
        if ((j6 & 320) != 0) {
            this.includeApp.setClickListener(onClickListener);
            this.includeHomework.setClickListener(onClickListener);
            this.includeSideBar.setClickListener(onClickListener);
            this.includeTitle.setClickListener(onClickListener);
        }
        if (j7 != 0) {
            this.includeApp.setVm(homeViewModel);
            this.includeHomework.setVm(homeViewModel);
            this.includeSideBar.setVm(homeViewModel);
            this.includeTitle.setVm(homeViewModel);
            this.mboundView11.setVm(homeViewModel);
        }
        if (j8 != 0) {
            this.includeSideBar.setMainViewModel(mainViewModel);
        }
        ViewDataBinding.executeBindingsOn(this.includeTitle);
        ViewDataBinding.executeBindingsOn(this.includeHomework);
        ViewDataBinding.executeBindingsOn(this.includeApp);
        ViewDataBinding.executeBindingsOn(this.mboundView11);
        ViewDataBinding.executeBindingsOn(this.includeSideBar);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.includeTitle.hasPendingBindings() || this.includeHomework.hasPendingBindings() || this.includeApp.hasPendingBindings() || this.mboundView11.hasPendingBindings() || this.includeSideBar.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
        }
        this.includeTitle.invalidateAll();
        this.includeHomework.invalidateAll();
        this.includeApp.invalidateAll();
        this.mboundView11.invalidateAll();
        this.includeSideBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeIncludeSideBar((HwIncludeHomeSidebarBinding) obj, i7);
        }
        if (i6 == 1) {
            return onChangeIncludeHomework((HwIncludeHomeHomeworkBinding) obj, i7);
        }
        if (i6 == 2) {
            return onChangeIncludeTitle((HwIncludeHomeTitleBinding) obj, i7);
        }
        if (i6 != 3) {
            return false;
        }
        return onChangeIncludeApp((HwIncludeHomeAppBinding) obj, i7);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentHomeBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentHomeBinding
    public void setHomeworkAdapter(@Nullable HomeworkAdapter homeworkAdapter) {
        this.mHomeworkAdapter = homeworkAdapter;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.includeTitle.setLifecycleOwner(lifecycleOwner);
        this.includeHomework.setLifecycleOwner(lifecycleOwner);
        this.includeApp.setLifecycleOwner(lifecycleOwner);
        this.mboundView11.setLifecycleOwner(lifecycleOwner);
        this.includeSideBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentHomeBinding
    public void setMainViewModel(@Nullable MainViewModel mainViewModel) {
        this.mMainViewModel = mainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((HomeViewModel) obj);
            return true;
        }
        if (4 == i6) {
            setMainViewModel((MainViewModel) obj);
            return true;
        }
        if (2 == i6) {
            setClickListener((View.OnClickListener) obj);
            return true;
        }
        if (3 != i6) {
            return false;
        }
        setHomeworkAdapter((HomeworkAdapter) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentHomeBinding
    public void setVm(@Nullable HomeViewModel homeViewModel) {
        this.mVm = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwFragmentHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (DrawerLayout) objArr[0], (HwIncludeHomeAppBinding) objArr[4], (HwIncludeHomeHomeworkBinding) objArr[3], (HwIncludeHomeSidebarBinding) objArr[6], (HwIncludeHomeTitleBinding) objArr[2]);
        this.mDirtyFlags = -1L;
        this.drawLayout.setTag(null);
        setContainedBinding(this.includeApp);
        setContainedBinding(this.includeHomework);
        setContainedBinding(this.includeSideBar);
        setContainedBinding(this.includeTitle);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
        HwStateViewBinding hwStateViewBinding = (HwStateViewBinding) objArr[5];
        this.mboundView11 = hwStateViewBinding;
        setContainedBinding(hwStateViewBinding);
        setRootTag(view);
        invalidateAll();
    }
}
