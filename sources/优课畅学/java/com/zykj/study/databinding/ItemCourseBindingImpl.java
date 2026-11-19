package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseSimpleBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public class ItemCourseBindingImpl extends ItemCourseBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final CardView mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"item_course_title"}, new int[]{6}, new int[]{R$layout.item_course_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.v_hint, 7);
        sparseIntArray.put(R$id.iv_like, 8);
        sparseIntArray.put(R$id.iv_study, 9);
    }

    public ItemCourseBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private boolean onChangeItemCourseTitle(ItemCourseTitleBinding itemCourseTitleBinding, int i10) {
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
        String str;
        String string;
        String strValueOf;
        String userName;
        int likes;
        String cover;
        int learning;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CourseSimpleBean courseSimpleBean = this.mEntity;
        DictViewModel dictViewModel = this.mDictViewModel;
        View.OnClickListener onClickListener = this.mClickListener;
        long j11 = 18 & j10;
        String str2 = null;
        if (j11 != 0) {
            if (courseSimpleBean != null) {
                learning = courseSimpleBean.getLearning();
                cover = courseSimpleBean.getCover();
                userName = courseSimpleBean.getUserName();
                likes = courseSimpleBean.getLikes();
            } else {
                userName = null;
                likes = 0;
                cover = null;
                learning = 0;
            }
            String strValueOf2 = String.valueOf(learning);
            string = this.tvTeacherName.getResources().getString(R$string.author, userName);
            strValueOf = String.valueOf(likes);
            String str3 = cover;
            str = strValueOf2;
            str2 = str3;
        } else {
            str = null;
            string = null;
            strValueOf = null;
        }
        long j12 = 20 & j10;
        long j13 = j10 & 24;
        if (j12 != 0) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j11 != 0) {
            this.itemCourseTitle.setEntity(courseSimpleBean);
            BindingAdaptersKt.netUrl(this.ivCover, str2);
            TextViewBindingAdapter.setText(this.tvLike, strValueOf);
            TextViewBindingAdapter.setText(this.tvStudyNumber, str);
            TextViewBindingAdapter.setText(this.tvTeacherName, string);
        }
        if (j13 != 0) {
            this.mboundView1.setOnClickListener(onClickListener);
        }
        ViewDataBinding.executeBindingsOn(this.itemCourseTitle);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.itemCourseTitle.hasPendingBindings();
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
        this.itemCourseTitle.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeItemCourseTitle((ItemCourseTitleBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.ItemCourseBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCourseBinding
    public void setEntity(@Nullable CourseSimpleBean courseSimpleBean) {
        this.mEntity = courseSimpleBean;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.itemCourseTitle.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((CourseSimpleBean) obj);
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

    private ItemCourseBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ItemCourseTitleBinding) objArr[6], (ImageView) objArr[2], (ImageView) objArr[8], (ImageView) objArr[9], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (View) objArr[7]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.itemCourseTitle);
        this.ivCover.setTag(null);
        CardView cardView = (CardView) objArr[0];
        this.mboundView0 = cardView;
        cardView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        this.tvLike.setTag(null);
        this.tvStudyNumber.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
