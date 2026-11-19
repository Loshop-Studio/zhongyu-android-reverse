package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class FragmentMyBindingImpl extends FragmentMyBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final ImageView mboundView2;

    @NonNull
    private final TextView mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.swipe, 6);
        sparseIntArray.put(R$id.ll_container, 7);
        sparseIntArray.put(R$id.tv_setting, 8);
        sparseIntArray.put(R$id.fragment_container_my, 9);
    }

    public FragmentMyBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private boolean onChangeUserBean(LiveData<UserBean> liveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        String str2;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        LiveData<UserBean> liveData = this.mUserBean;
        long j11 = j10 & 3;
        RoleType roleType = null;
        if (j11 != 0) {
            UserBean value = liveData != null ? liveData.getValue() : null;
            if (value != null) {
                String realName = value.getRealName();
                RoleType role = value.getRole();
                String avatar = value.getAvatar();
                str = realName;
                roleType = role;
                str2 = avatar;
            } else {
                str = null;
                str2 = null;
            }
            boolean z11 = roleType == RoleType.Student;
            z10 = roleType == RoleType.Teacher;
            z = z11;
        } else {
            str = null;
            str2 = null;
            z10 = false;
        }
        if (j11 != 0) {
            AbstractC8354c.m13601d(this.mboundView1, str2);
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(z));
            AbstractC8354c.m13602e(this.mboundView2, str2);
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.mboundView3, str);
            BindingAdaptersKt.visibleOrGone(this.tvMyProduct, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.tvTeacher, Boolean.valueOf(z10));
        }
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeUserBean((LiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentMyBinding
    public void setUserBean(@Nullable LiveData<UserBean> liveData) {
        updateLiveDataRegistration(0, liveData);
        this.mUserBean = liveData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(55);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (55 != i10) {
            return false;
        }
        setUserBean((LiveData) obj);
        return true;
    }

    private FragmentMyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (FragmentContainerView) objArr[9], (LinearLayout) objArr[0], (LinearLayout) objArr[7], (SwipeRefreshLayout) objArr[6], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[5]);
        this.mDirtyFlags = -1L;
        this.fragmentMy.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.mboundView2 = imageView2;
        imageView2.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        this.tvMyProduct.setTag(null);
        this.tvTeacher.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
