package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel;
import com.zykj.manage.R;
import p078i4.AbstractC6538h;

/* loaded from: classes4.dex */
public class HwDialogChangeAvatarBindingImpl extends HwDialogChangeAvatarBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    @Nullable
    private final HwStateViewBinding mboundView11;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"hw_state_view"}, new int[]{5}, new int[]{R.layout.hw_state_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.rvAvatar, 6);
    }

    public HwDialogChangeAvatarBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j6;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ChangeAvatarViewModel changeAvatarViewModel = this.mVm;
        View.OnClickListener onClickListener = this.mOnClickListener;
        long j7 = 5 & j6;
        long j8 = 6 & j6;
        if ((j6 & 4) != 0) {
            AppCompatImageView appCompatImageView = this.ivClose;
            AbstractC6538h.m7318a(appCompatImageView, appCompatImageView.getResources().getDimension(R.dimen.pt7));
        }
        if (j8 != 0) {
            AbstractC6538h.m7324g(this.ivClose, onClickListener);
            AbstractC6538h.m7324g(this.tvModify, onClickListener);
            AbstractC6538h.m7324g(this.tvTitle, onClickListener);
        }
        if (j7 != 0) {
            this.mboundView11.setVm(changeAvatarViewModel);
        }
        ViewDataBinding.executeBindingsOn(this.mboundView11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.mboundView11.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        this.mboundView11.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogChangeAvatarBinding
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((ChangeAvatarViewModel) obj);
            return true;
        }
        if (6 != i6) {
            return false;
        }
        setOnClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogChangeAvatarBinding
    public void setVm(@Nullable ChangeAvatarViewModel changeAvatarViewModel) {
        this.mVm = changeAvatarViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwDialogChangeAvatarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[2], (RecyclerView) objArr[6], (TextView) objArr[4], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.ivClose.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        HwStateViewBinding hwStateViewBinding = (HwStateViewBinding) objArr[5];
        this.mboundView11 = hwStateViewBinding;
        setContainedBinding(hwStateViewBinding);
        this.tvModify.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
