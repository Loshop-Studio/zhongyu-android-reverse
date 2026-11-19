package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$id;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.CourseViewViewModel;

/* loaded from: classes3.dex */
public class FragmentCourseViewCatalogBindingImpl extends FragmentCourseViewCatalogBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final TextView mboundView3;

    @NonNull
    private final AppCompatImageView mboundView4;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.multiple_status_view, 5);
        sparseIntArray.put(R$id.recycler, 6);
    }

    public FragmentCourseViewCatalogBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelCourseBeanLiveData(MutableLiveData<CourseBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelCurrentMemberProgressLiveData(MutableLiveData<GroupMemberProgress> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelSelectedCatalogBeanLiveData(MutableLiveData<CatalogBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentCourseViewCatalogBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl.smali:404
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
            this.mDirtyFlags = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeViewModelSelectedCatalogBeanLiveData((MutableLiveData) obj, i11);
        }
        if (i10 == 1) {
            return onChangeViewModelCourseBeanLiveData((MutableLiveData) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return onChangeViewModelCurrentMemberProgressLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentCourseViewCatalogBinding
    public void setOnClick(@Nullable View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(37);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentCourseViewCatalogBinding
    public void setOnClickManage(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickManage = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(38);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (38 == i10) {
            setOnClickManage((View.OnClickListener) obj);
            return true;
        }
        if (37 == i10) {
            setOnClick((View.OnClickListener) obj);
            return true;
        }
        if (59 != i10) {
            return false;
        }
        setViewModel((CourseViewViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentCourseViewCatalogBinding
    public void setViewModel(@Nullable CourseViewViewModel courseViewViewModel) {
        this.mViewModel = courseViewViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentCourseViewCatalogBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ConstraintLayout) objArr[0], (LinearLayout) objArr[2], (MultipleStatusView) objArr[5], (RecyclerView) objArr[6], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.container.setTag(null);
        this.imageView35.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[4];
        this.mboundView4 = appCompatImageView;
        appCompatImageView.setTag(null);
        this.textView33.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
