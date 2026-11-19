package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.viewmodels.CourseDetailsViewModel;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public class FragmentCourseDetailsBindingImpl extends FragmentCourseDetailsBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_course_synopsis", "layout_course_details_catalog", "layout_bind_view_model"}, new int[]{1, 2, 3}, new int[]{R$layout.layout_course_synopsis, R$layout.layout_course_details_catalog, R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar2, 4);
        sparseIntArray.put(R$id.guideline2, 5);
    }

    public FragmentCourseDetailsBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeCourseCatalog(LayoutCourseDetailsCatalogBinding layoutCourseDetailsCatalogBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeCourseSynopsis(LayoutCourseSynopsisBinding layoutCourseSynopsisBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeDetailsEntityCourseDetailsLiveData(MutableLiveData<CourseDetailsBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeDetailsEntityIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeDetailsEntityToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeDetailsEntityUserBean(LiveData<UserBean> liveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentCourseDetailsBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentCourseDetailsBindingImpl.smali:641
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.courseSynopsis.hasPendingBindings() || this.courseCatalog.hasPendingBindings() || this.mboundView0.hasPendingBindings();
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
        this.courseSynopsis.invalidateAll();
        this.courseCatalog.invalidateAll();
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeDetailsEntityCourseDetailsLiveData((MutableLiveData) obj, i11);
        }
        if (i10 == 1) {
            return onChangeDetailsEntityUserBean((LiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeDetailsEntityToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeCourseSynopsis((LayoutCourseSynopsisBinding) obj, i11);
        }
        if (i10 == 4) {
            return onChangeCourseCatalog((LayoutCourseDetailsCatalogBinding) obj, i11);
        }
        if (i10 != 5) {
            return false;
        }
        return onChangeDetailsEntityIsDialogVisible((UnPeekLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentCourseDetailsBinding
    public void setDetailsEntity(@Nullable CourseDetailsViewModel courseDetailsViewModel) {
        this.mDetailsEntity = courseDetailsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(10);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentCourseDetailsBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.courseSynopsis.setLifecycleOwner(lifecycleOwner);
        this.courseCatalog.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (10 == i10) {
            setDetailsEntity((CourseDetailsViewModel) obj);
            return true;
        }
        if (11 != i10) {
            return false;
        }
        setDictViewModel((DictViewModel) obj);
        return true;
    }

    private FragmentCourseDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (LayoutCourseDetailsCatalogBinding) objArr[2], (LayoutCourseSynopsisBinding) objArr[1], (ConstraintLayout) objArr[0], (Guideline) objArr[5], (TitleBar) objArr[4]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.courseCatalog);
        setContainedBinding(this.courseSynopsis);
        this.fragmentCourseDetails.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[3];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        setRootTag(view);
        invalidateAll();
    }
}
