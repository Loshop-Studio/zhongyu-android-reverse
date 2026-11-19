package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public class ItemMyTeachCourseBindingImpl extends ItemMyTeachCourseBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final RelativeLayout mboundView2;

    @NonNull
    private final RelativeLayout mboundView4;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(2, new String[]{"item_course_title"}, new int[]{6}, new int[]{R$layout.item_course_title});
        includedLayouts.setIncludes(4, new String[]{"item_course_status"}, new int[]{7}, new int[]{R$layout.item_course_status});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.container, 8);
    }

    public ItemMyTeachCourseBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    private boolean onChangeItemCourseStatus(ItemCourseStatusBinding itemCourseStatusBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeItemCourseTitle(ItemCourseTitleBinding itemCourseTitleBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        String str;
        String string;
        String str2;
        Integer students;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseDetailsBean courseDetailsBean = this.mEntity;
        DictViewModel dictViewModel = this.mDictViewModel;
        View.OnClickListener onClickListener = this.mClickListener;
        long j11 = 36 & j10;
        String str3 = null;
        if (j11 != 0) {
            if (courseDetailsBean != null) {
                String cover = courseDetailsBean.getCover();
                String userName = courseDetailsBean.getUserName();
                students = courseDetailsBean.getStudents();
                str2 = cover;
                str3 = userName;
            } else {
                str2 = null;
                students = null;
            }
            String string2 = this.tvTeacherName.getResources().getString(R$string.author, str3);
            string = this.tvMember.getResources().getString(R$string.studentNumber, students);
            String str4 = str2;
            str = string2;
            str3 = str4;
        } else {
            str = null;
            string = null;
        }
        long j12 = 40 & j10;
        long j13 = j10 & 48;
        if (j11 != 0) {
            this.itemCourseStatus.setEntity(courseDetailsBean);
            this.itemCourseTitle.setEntity(courseDetailsBean);
            BindingAdaptersKt.netUrl(this.mboundView1, str3);
            TextViewBindingAdapter.setText(this.tvMember, string);
            TextViewBindingAdapter.setText(this.tvTeacherName, str);
        }
        if (j12 != 0) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j13 != 0) {
            this.rlContainer.setOnClickListener(onClickListener);
        }
        ViewDataBinding.executeBindingsOn(this.itemCourseTitle);
        ViewDataBinding.executeBindingsOn(this.itemCourseStatus);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.itemCourseTitle.hasPendingBindings() || this.itemCourseStatus.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 32L;
        }
        this.itemCourseTitle.invalidateAll();
        this.itemCourseStatus.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeItemCourseStatus((ItemCourseStatusBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeItemCourseTitle((ItemCourseTitleBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.ItemMyTeachCourseBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMyTeachCourseBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMyTeachCourseBinding
    public void setEntity(@Nullable CourseDetailsBean courseDetailsBean) {
        this.mEntity = courseDetailsBean;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.itemCourseTitle.setLifecycleOwner(lifecycleOwner);
        this.itemCourseStatus.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((CourseDetailsBean) obj);
            return true;
        }
        if (11 == i10) {
            setDictViewModel((DictViewModel) obj);
            return true;
        }
        if (5 != i10) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    private ItemMyTeachCourseBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArr[8], (ItemCourseStatusBinding) objArr[7], (ItemCourseTitleBinding) objArr[6], (RelativeLayout) objArr[0], (TextView) objArr[5], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.itemCourseStatus);
        setContainedBinding(this.itemCourseTitle);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.mboundView2 = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[4];
        this.mboundView4 = relativeLayout2;
        relativeLayout2.setTag(null);
        this.rlContainer.setTag(null);
        this.tvMember.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
