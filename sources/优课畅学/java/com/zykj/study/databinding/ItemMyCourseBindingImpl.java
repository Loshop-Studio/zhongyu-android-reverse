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
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public class ItemMyCourseBindingImpl extends ItemMyCourseBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final RelativeLayout mboundView2;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(2, new String[]{"item_course_title", "item_course_status"}, new int[]{4, 5}, new int[]{R$layout.item_course_title, R$layout.item_course_status});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.container, 6);
    }

    public ItemMyCourseBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
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
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        MyCourseEntity myCourseEntity = this.mEntity;
        UserBean userBean = this.mUserInfo;
        DictViewModel dictViewModel = this.mDictViewModel;
        View.OnClickListener onClickListener = this.mClickListener;
        String string = null;
        String cover = ((j10 & 68) == 0 || myCourseEntity == null) ? null : myCourseEntity.getCover();
        long j11 = j10 & 72;
        if (j11 != 0) {
            z = userBean == null;
            if (j11 != 0) {
                j10 = z ? j10 | 256 : j10 | 128;
            }
        }
        long j12 = j10 & 80;
        long j13 = j10 & 96;
        String realName = ((j10 & 128) == 0 || userBean == null) ? null : userBean.getRealName();
        long j14 = 72 & j10;
        if (j14 != 0) {
            if (z) {
                realName = "";
            }
            string = this.tvTeacherName.getResources().getString(R$string.author, realName);
        }
        if ((j10 & 68) != 0) {
            this.itemCourseStatus.setEntity(myCourseEntity);
            this.itemCourseTitle.setEntity(myCourseEntity);
            BindingAdaptersKt.netUrl(this.mboundView1, cover);
        }
        if (j12 != 0) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j13 != 0) {
            this.rlContainer.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            TextViewBindingAdapter.setText(this.tvTeacherName, string);
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
            this.mDirtyFlags = 64L;
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

    @Override // com.zykj.study.databinding.ItemMyCourseBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMyCourseBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMyCourseBinding
    public void setEntity(@Nullable MyCourseEntity myCourseEntity) {
        this.mEntity = myCourseEntity;
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

    @Override // com.zykj.study.databinding.ItemMyCourseBinding
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
            setEntity((MyCourseEntity) obj);
            return true;
        }
        if (56 == i10) {
            setUserInfo((UserBean) obj);
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

    private ItemMyCourseBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ConstraintLayout) objArr[6], (ItemCourseStatusBinding) objArr[5], (ItemCourseTitleBinding) objArr[4], (RelativeLayout) objArr[0], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.itemCourseStatus);
        setContainedBinding(this.itemCourseTitle);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.mboundView2 = relativeLayout;
        relativeLayout.setTag(null);
        this.rlContainer.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
