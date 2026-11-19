package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public class FragmentExerciseTrainAnswerBindingImpl extends FragmentExerciseTrainAnswerBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_edit_answer_micro"}, new int[]{1}, new int[]{R$layout.view_edit_answer_micro});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.btn_submit, 2);
    }

    public FragmentExerciseTrainAnswerBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private boolean onChangeAnswerMicro(ViewEditAnswerMicroBinding viewEditAnswerMicroBinding, int i10) {
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
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        String str = this.mSnapshotUrl;
        if ((j10 & 6) != 0) {
            this.answerMicro.setSnapshotUrl(str);
        }
        ViewDataBinding.executeBindingsOn(this.answerMicro);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.answerMicro.hasPendingBindings();
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
        this.answerMicro.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeAnswerMicro((ViewEditAnswerMicroBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseTrainAnswerBinding
    public void setSnapshotUrl(@Nullable String str) {
        this.mSnapshotUrl = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(46);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (46 != i10) {
            return false;
        }
        setSnapshotUrl((String) obj);
        return true;
    }

    private FragmentExerciseTrainAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ViewEditAnswerMicroBinding) objArr[1], (RoundButton) objArr[2]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerMicro);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
