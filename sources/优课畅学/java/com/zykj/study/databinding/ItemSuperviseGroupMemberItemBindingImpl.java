package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.Converters;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar;
import com.zykj.study.R$color;
import com.zykj.study.R$id;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemSuperviseGroupMemberItemBindingImpl extends ItemSuperviseGroupMemberItemBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.progressBar2, 4);
    }

    public ItemSuperviseGroupMemberItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        String str;
        String userName;
        String str2;
        ConstraintLayout constraintLayout;
        int i10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsSelected;
        View.OnClickListener onClickListener = this.mOnclick;
        SuperviseGroupMember superviseGroupMember = this.mEntity;
        long j11 = j10 & 9;
        if (j11 != 0) {
            if (j11 != 0) {
                j10 |= z10 ? 32L : 16L;
            }
            if (z10) {
                constraintLayout = this.mboundView0;
                i10 = R$color.bg_card;
            } else {
                constraintLayout = this.mboundView0;
                i10 = R$color.white;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(constraintLayout, i10);
        } else {
            colorFromResource = 0;
        }
        long j12 = 10 & j10;
        long j13 = 12 & j10;
        String str3 = null;
        if (j13 != 0) {
            if (superviseGroupMember != null) {
                String avatar = superviseGroupMember.getAvatar();
                Integer progress = superviseGroupMember.getProgress();
                userName = superviseGroupMember.getUserName();
                str2 = avatar;
                str3 = progress;
            } else {
                str2 = null;
                userName = null;
            }
            str3 = str2;
            str = ((Object) str3) + "%";
        } else {
            str = null;
            userName = null;
        }
        if (j13 != 0) {
            AbstractC8354c.m13601d(this.imageView12, str3);
            TextViewBindingAdapter.setText(this.textView28, userName);
            TextViewBindingAdapter.setText(this.textView31, str);
        }
        if ((j10 & 9) != 0) {
            ViewBindingAdapter.setBackground(this.mboundView0, Converters.convertColorToDrawable(colorFromResource));
        }
        if (j12 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
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
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupMemberItemBinding
    public void setEntity(@Nullable SuperviseGroupMember superviseGroupMember) {
        this.mEntity = superviseGroupMember;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupMemberItemBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupMemberItemBinding
    public void setOnclick(@Nullable View.OnClickListener onClickListener) {
        this.mOnclick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(39);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected(((Boolean) obj).booleanValue());
            return true;
        }
        if (39 == i10) {
            setOnclick((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SuperviseGroupMember) obj);
        return true;
    }

    private ItemSuperviseGroupMemberItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (MaterialProgressBar) objArr[4], (TextView) objArr[2], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.imageView12.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.textView28.setTag(null);
        this.textView31.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
