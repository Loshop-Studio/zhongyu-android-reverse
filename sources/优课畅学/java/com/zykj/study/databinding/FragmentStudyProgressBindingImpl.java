package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.view.MultipleStatusView;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class FragmentStudyProgressBindingImpl extends FragmentStudyProgressBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"item_course_status_btn"}, new int[]{3}, new int[]{R$layout.item_course_status_btn});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.multiple_status_view, 4);
        sparseIntArray.put(R$id.content, 5);
        sparseIntArray.put(R$id.recycler_progress, 6);
    }

    public FragmentStudyProgressBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeCourseStatusBtn(ItemCourseStatusBtnBinding itemCourseStatusBtnBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        String string;
        String title;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseDetailsBean courseDetailsBean = this.mEntity;
        UserBean userBean = this.mUserInfo;
        long j11 = 10 & j10;
        String str = null;
        Integer progress = null;
        if (j11 != 0) {
            if (courseDetailsBean != null) {
                progress = courseDetailsBean.getProgress();
                title = courseDetailsBean.getTitle();
            } else {
                title = null;
            }
            z = courseDetailsBean != null;
            String str2 = title;
            string = this.mboundView2.getResources().getString(R$string.complete_progress, progress);
            str = str2;
        } else {
            string = null;
        }
        long j12 = j10 & 12;
        if (j11 != 0) {
            this.courseStatusBtn.setEntity(courseDetailsBean);
            TextViewBindingAdapter.setText(this.mboundView1, str);
            AbstractC8354c.m13617t(this.mboundView1, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.mboundView2, string);
            AbstractC8354c.m13617t(this.mboundView2, Boolean.valueOf(z));
        }
        if (j12 != 0) {
            this.courseStatusBtn.setUserInfo(userBean);
        }
        ViewDataBinding.executeBindingsOn(this.courseStatusBtn);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.courseStatusBtn.hasPendingBindings();
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
        this.courseStatusBtn.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeCourseStatusBtn((ItemCourseStatusBtnBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentStudyProgressBinding
    public void setEntity(@Nullable CourseDetailsBean courseDetailsBean) {
        this.mEntity = courseDetailsBean;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.courseStatusBtn.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.study.databinding.FragmentStudyProgressBinding
    public void setUserInfo(@Nullable UserBean userBean) {
        this.mUserInfo = userBean;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(56);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((CourseDetailsBean) obj);
            return true;
        }
        if (56 != i10) {
            return false;
        }
        setUserInfo((UserBean) obj);
        return true;
    }

    private FragmentStudyProgressBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LinearLayout) objArr[5], (ItemCourseStatusBtnBinding) objArr[3], (LinearLayout) objArr[0], (MultipleStatusView) objArr[4], (RecyclerView) objArr[6]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.courseStatusBtn);
        this.fragmentStudyProgress.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
