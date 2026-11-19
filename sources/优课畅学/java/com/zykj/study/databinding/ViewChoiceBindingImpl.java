package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.study.R$id;
import com.zykj.study.R$string;
import com.zykj.study.view.MultipleChoiceView;

/* loaded from: classes3.dex */
public class ViewChoiceBindingImpl extends ViewChoiceBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_dismiss_or_show, 2);
        sparseIntArray.put(R$id.iv_label_icon, 3);
        sparseIntArray.put(R$id.view_top, 4);
        sparseIntArray.put(R$id.title_warn, 5);
        sparseIntArray.put(R$id.ll_choice, 6);
        sparseIntArray.put(R$id.recycler, 7);
    }

    public ViewChoiceBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        String string;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsTeacher;
        long j11 = j10 & 3;
        if (j11 != 0) {
            boolean z11 = z10;
            if (j11 != 0) {
                j10 |= z11 ? 8L : 4L;
            }
            string = this.tvChoiceLabel.getResources().getString(z11 ? R$string.student_first_to_answer : R$string.first_to_answer);
        } else {
            string = null;
        }
        if ((j10 & 3) != 0) {
            TextViewBindingAdapter.setText(this.tvChoiceLabel, string);
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
        return false;
    }

    @Override // com.zykj.study.databinding.ViewChoiceBinding
    public void setIsTeacher(boolean z10) {
        this.mIsTeacher = z10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (29 != i10) {
            return false;
        }
        setIsTeacher(((Boolean) obj).booleanValue());
        return true;
    }

    private ViewChoiceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (LinearLayout) objArr[6], (MultipleChoiceView) objArr[7], (TextView) objArr[5], (TextView) objArr[1], (View) objArr[4]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        this.tvChoiceLabel.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
