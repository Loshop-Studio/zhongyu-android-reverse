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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.study.R$id;
import com.zykj.study.bean.exercise.QuestionBean;

/* loaded from: classes3.dex */
public class ItemGroupStatisticBindingImpl extends ItemGroupStatisticBinding {

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
        sparseIntArray.put(R$id.textView43, 3);
        sparseIntArray.put(R$id.view6, 4);
        sparseIntArray.put(R$id.imageView19, 5);
    }

    public ItemGroupStatisticBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        Integer progress;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        int i10 = this.mIndex;
        View.OnClickListener onClickListener = this.mOnClick;
        QuestionBean questionBean = this.mBean;
        String str2 = null;
        if ((j10 & 9) != 0) {
            str = ("第" + String.valueOf(i10)) + "题";
        } else {
            str = null;
        }
        long j11 = j10 & 12;
        if (j11 != 0) {
            progress = questionBean != null ? questionBean.getProgress() : null;
            z10 = progress == null;
            if (j11 != 0) {
                j10 |= z10 ? 32L : 16L;
            }
        } else {
            progress = null;
            z10 = false;
        }
        long j12 = 12 & j10;
        if (j12 != 0) {
            str2 = String.valueOf(z10 ? 0 : progress.intValue()) + "%";
        }
        if ((10 & j10) != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if ((j10 & 9) != 0) {
            TextViewBindingAdapter.setText(this.textView42, str);
        }
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.textView44, str2);
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

    @Override // com.zykj.study.databinding.ItemGroupStatisticBinding
    public void setBean(@Nullable QuestionBean questionBean) {
        this.mBean = questionBean;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemGroupStatisticBinding
    public void setIndex(int i10) {
        this.mIndex = i10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(22);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemGroupStatisticBinding
    public void setOnClick(@Nullable View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(37);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (22 == i10) {
            setIndex(((Integer) obj).intValue());
            return true;
        }
        if (37 == i10) {
            setOnClick((View.OnClickListener) obj);
            return true;
        }
        if (4 != i10) {
            return false;
        }
        setBean((QuestionBean) obj);
        return true;
    }

    private ItemGroupStatisticBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[5], (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (View) objArr[4]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.textView42.setTag(null);
        this.textView44.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
