package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.xuexiang.xui.widget.textview.ExpandableTextView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.viewmodels.DictViewModel;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class LayoutCourseSynopsisBindingImpl extends LayoutCourseSynopsisBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final RelativeLayout mboundView2;

    @NonNull
    private final TextView mboundView3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"item_course_status_btn"}, new int[]{8}, new int[]{R$layout.item_course_status_btn});
        includedLayouts.setIncludes(2, new String[]{"item_course_title"}, new int[]{7}, new int[]{R$layout.item_course_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.imageView5, 9);
        sparseIntArray.put(R$id.imageView6, 10);
        sparseIntArray.put(R$id.expand_text_view, 11);
        sparseIntArray.put(com.zykj.image.R$id.expandable_text, 12);
        sparseIntArray.put(com.zykj.image.R$id.expand_collapse, 13);
    }

    public LayoutCourseSynopsisBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
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
        long j11;
        boolean zIsLearning;
        String string;
        String strValueOf;
        String strValueOf2;
        String str;
        int learning;
        int likes;
        Integer progress;
        String cover;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseDetailsBean courseDetailsBean = this.mEntity;
        UserBean userBean = this.mUserInfo;
        DictViewModel dictViewModel = this.mDictViewModel;
        long j12 = j10 & 36;
        String string2 = null;
        if (j12 != 0) {
            if (courseDetailsBean != null) {
                learning = courseDetailsBean.getLearning();
                zIsLearning = courseDetailsBean.isLearning();
                progress = courseDetailsBean.getProgress();
                cover = courseDetailsBean.getCover();
                likes = courseDetailsBean.getLikes();
            } else {
                learning = 0;
                zIsLearning = false;
                likes = 0;
                progress = null;
                cover = null;
            }
            z = courseDetailsBean == null;
            if (j12 != 0) {
                j10 = z ? j10 | 128 : j10 | 64;
            }
            strValueOf2 = String.valueOf(learning);
            j11 = 0;
            string = this.mboundView3.getResources().getString(R$string.complete_progress, progress);
            strValueOf = String.valueOf(likes);
            str = cover;
        } else {
            j11 = 0;
            zIsLearning = false;
            string = null;
            strValueOf = null;
            strValueOf2 = null;
            str = null;
        }
        long j13 = j10 & 40;
        long j14 = j10 & 48;
        String userName = ((64 & j10) == j11 || courseDetailsBean == null) ? null : courseDetailsBean.getUserName();
        long j15 = j10 & 36;
        if (j15 != j11) {
            if (z) {
                userName = "";
            }
            string2 = this.tvTeacherName.getResources().getString(R$string.author, userName);
        }
        if (j15 != j11) {
            this.courseStatusBtn.setEntity(courseDetailsBean);
            this.itemCourseTitle.setEntity(courseDetailsBean);
            AbstractC8354c.m13603f(this.ivCover, str);
            TextViewBindingAdapter.setText(this.mboundView3, string);
            AbstractC8354c.m13617t(this.mboundView3, Boolean.valueOf(zIsLearning));
            TextViewBindingAdapter.setText(this.textView4, strValueOf2);
            TextViewBindingAdapter.setText(this.textView6, strValueOf);
            TextViewBindingAdapter.setText(this.tvTeacherName, string2);
        }
        if (j13 != j11) {
            this.courseStatusBtn.setUserInfo(userBean);
        }
        if (j14 != j11) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        ViewDataBinding.executeBindingsOn(this.itemCourseTitle);
        ViewDataBinding.executeBindingsOn(this.courseStatusBtn);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.itemCourseTitle.hasPendingBindings() || this.courseStatusBtn.hasPendingBindings();
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
        this.courseStatusBtn.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeCourseStatusBtn((ItemCourseStatusBtnBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeItemCourseTitle((ItemCourseTitleBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutCourseSynopsisBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.LayoutCourseSynopsisBinding
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
        this.courseStatusBtn.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.study.databinding.LayoutCourseSynopsisBinding
    public void setUserInfo(@Nullable UserBean userBean) {
        this.mUserInfo = userBean;
        synchronized (this) {
            this.mDirtyFlags |= 8;
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
        if (56 == i10) {
            setUserInfo((UserBean) obj);
            return true;
        }
        if (11 != i10) {
            return false;
        }
        setDictViewModel((DictViewModel) obj);
        return true;
    }

    private LayoutCourseSynopsisBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ItemCourseStatusBtnBinding) objArr[8], (ImageButton) objArr[13], (ExpandableTextView) objArr[11], (TextView) objArr[12], (ImageView) objArr[9], (ImageView) objArr[10], (ItemCourseTitleBinding) objArr[7], (ImageView) objArr[1], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[4]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.courseStatusBtn);
        setContainedBinding(this.itemCourseTitle);
        this.ivCover.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.mboundView2 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        this.textView4.setTag(null);
        this.textView6.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
