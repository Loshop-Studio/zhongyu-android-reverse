package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.xuexiang.xui.widget.textview.ExpandableTextView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class LayoutMyCourseSynopsisBindingImpl extends LayoutMyCourseSynopsisBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    @NonNull
    private final TextView mboundView5;

    @NonNull
    private final TextView mboundView6;

    @NonNull
    private final ImageView mboundView7;

    @NonNull
    private final ImageView mboundView8;

    @NonNull
    private final TextView mboundView9;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(18);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"item_course_title"}, new int[]{12}, new int[]{R$layout.item_course_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.imageView5, 13);
        sparseIntArray.put(R$id.expand_text_view, 14);
        sparseIntArray.put(com.zykj.image.R$id.expandable_text, 15);
        sparseIntArray.put(com.zykj.image.R$id.expand_collapse, 16);
        sparseIntArray.put(R$id.divider, 17);
    }

    public LayoutMyCourseSynopsisBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, sIncludes, sViewsWithIds));
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
        long j11;
        String strValueOf;
        CourseType status;
        String cover;
        String strValueOf2;
        boolean z10;
        boolean z11;
        boolean zIsPublic;
        long j12;
        int learning;
        int likes;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        MyCourseEntity myCourseEntity = this.mEntity;
        UserBean userBean = this.mUserInfo;
        DictViewModel dictViewModel = this.mDictViewModel;
        long j13 = 18 & j10;
        if (j13 != 0) {
            if (myCourseEntity != null) {
                learning = myCourseEntity.getLearning();
                status = myCourseEntity.getStatus();
                zIsPublic = myCourseEntity.isPublic();
                cover = myCourseEntity.getCover();
                likes = myCourseEntity.getLikes();
            } else {
                status = null;
                cover = null;
                learning = 0;
                zIsPublic = false;
                likes = 0;
            }
            strValueOf = String.valueOf(learning);
            j11 = 0;
            boolean z12 = status == CourseType.UNDERCARRIAGE;
            z = status == CourseType.GROUNDING;
            z11 = !zIsPublic;
            strValueOf2 = String.valueOf(likes);
            boolean z13 = z;
            z = z12;
            z10 = z13;
        } else {
            j11 = 0;
            strValueOf = null;
            status = null;
            cover = null;
            strValueOf2 = null;
            z10 = false;
            z11 = false;
            zIsPublic = false;
        }
        long j14 = j10 & 20;
        if (j14 != j11) {
            j12 = j10;
            string = this.tvTeacherName.getResources().getString(R$string.author, userBean != null ? userBean.getRealName() : null);
        } else {
            j12 = j10;
        }
        long j15 = j12 & 24;
        if (j13 != 0) {
            BindingAdaptersKt.visibleOrGone(this.btGrounding, Boolean.valueOf(z));
            BindingAdaptersKt.visibleOrGone(this.btUndercarriage, Boolean.valueOf(z10));
            this.itemCourseTitle.setEntity(myCourseEntity);
            AbstractC8354c.m13603f(this.ivCover, cover);
            TextViewBindingAdapter.setText(this.mboundView5, strValueOf2);
            AbstractC8354c.m13610m(this.mboundView6, status);
            BindingAdaptersKt.visibleOrGone(this.mboundView7, Boolean.valueOf(zIsPublic));
            BindingAdaptersKt.visibleOrGone(this.mboundView8, Boolean.valueOf(z11));
            AbstractC8354c.m13608k(this.mboundView9, zIsPublic);
            TextViewBindingAdapter.setText(this.textView4, strValueOf);
        }
        if (j15 != j11) {
            this.itemCourseTitle.setDictViewModel(dictViewModel);
        }
        if (j14 != j11) {
            TextViewBindingAdapter.setText(this.tvTeacherName, string);
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

    @Override // com.zykj.study.databinding.LayoutMyCourseSynopsisBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.LayoutMyCourseSynopsisBinding
    public void setEntity(@Nullable MyCourseEntity myCourseEntity) {
        this.mEntity = myCourseEntity;
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

    @Override // com.zykj.study.databinding.LayoutMyCourseSynopsisBinding
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
            setEntity((MyCourseEntity) obj);
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

    private LayoutMyCourseSynopsisBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (Button) objArr[11], (Button) objArr[10], (View) objArr[17], (ImageButton) objArr[16], (ExpandableTextView) objArr[14], (TextView) objArr[15], (ImageView) objArr[13], (ItemCourseTitleBinding) objArr[12], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.btGrounding.setTag(null);
        this.btUndercarriage.setTag(null);
        setContainedBinding(this.itemCourseTitle);
        this.ivCover.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.mboundView5 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.mboundView6 = textView2;
        textView2.setTag(null);
        ImageView imageView = (ImageView) objArr[7];
        this.mboundView7 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[8];
        this.mboundView8 = imageView2;
        imageView2.setTag(null);
        TextView textView3 = (TextView) objArr[9];
        this.mboundView9 = textView3;
        textView3.setTag(null);
        this.textView4.setTag(null);
        this.tvTeacherName.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
