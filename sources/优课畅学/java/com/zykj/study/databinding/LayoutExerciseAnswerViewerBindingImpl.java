package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import p231r4.ViewOnClickListenerC9912a;

/* loaded from: classes3.dex */
public class LayoutExerciseAnswerViewerBindingImpl extends LayoutExerciseAnswerViewerBinding implements ViewOnClickListenerC9912a.a {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;

    @Nullable
    private final View.OnClickListener mCallback1;

    @Nullable
    private final View.OnClickListener mCallback2;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final NestedScrollView mboundView1;

    @NonNull
    private final RoundButton mboundView2;

    @NonNull
    private final RoundButton mboundView3;

    @NonNull
    private final RoundButton mboundView4;

    @NonNull
    private final RoundButton mboundView5;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"view_micro"}, new int[]{6}, new int[]{R$layout.view_micro});
        sViewsWithIds = null;
    }

    public LayoutExerciseAnswerViewerBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeAnswerMicro(ViewMicroBinding viewMicroBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEntityCurrentIndexLiveData(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // p231r4.ViewOnClickListenerC9912a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        ExerciseViewerViewModel exerciseViewerViewModel;
        if (i10 != 1) {
            if (i10 == 2 && (exerciseViewerViewModel = this.mEntity) != null) {
                exerciseViewerViewModel.m12013k();
                return;
            }
            return;
        }
        ExerciseViewerViewModel exerciseViewerViewModel2 = this.mEntity;
        if (exerciseViewerViewModel2 != null) {
            exerciseViewerViewModel2.m12014l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        boolean zM12016n;
        boolean z11;
        boolean zM12017o;
        boolean z12;
        boolean z13;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ExerciseViewerViewModel exerciseViewerViewModel = this.mEntity;
        long j11 = j10 & 14;
        if (j11 != 0) {
            MutableLiveData mutableLiveDataM12007e = exerciseViewerViewModel != null ? exerciseViewerViewModel.m12007e() : null;
            updateLiveDataRegistration(1, mutableLiveDataM12007e);
            z10 = (mutableLiveDataM12007e != null ? (Integer) mutableLiveDataM12007e.getValue() : null) != null;
            if (j11 != 0) {
                j10 |= z10 ? 2720L : 1360L;
            }
        } else {
            z10 = false;
        }
        if ((544 & j10) != 0) {
            zM12016n = exerciseViewerViewModel != null ? exerciseViewerViewModel.m12016n() : false;
            z11 = (32 & j10) != 0 ? !zM12016n : false;
        } else {
            zM12016n = false;
            z11 = false;
        }
        if ((2176 & j10) != 0) {
            zM12017o = exerciseViewerViewModel != null ? exerciseViewerViewModel.m12017o() : false;
            z12 = (128 & j10) != 0 ? !zM12017o : false;
        } else {
            zM12017o = false;
            z12 = false;
        }
        long j12 = 14 & j10;
        if (j12 != 0) {
            if (!z10) {
                z11 = false;
            }
            if (!z10) {
                z12 = false;
            }
            if (!z10) {
                zM12016n = false;
            }
            z13 = z10 ? zM12017o : false;
            z = zM12016n;
        } else {
            z13 = false;
            z11 = false;
            z12 = false;
        }
        if (j12 != 0) {
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z));
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.mboundView4, Boolean.valueOf(z12));
            BindingAdaptersKt.visibleOrGone(this.mboundView5, Boolean.valueOf(z13));
        }
        if ((j10 & 8) != 0) {
            this.mboundView3.setOnClickListener(this.mCallback1);
            this.mboundView4.setOnClickListener(this.mCallback2);
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
            this.mDirtyFlags = 8L;
        }
        this.answerMicro.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeAnswerMicro((ViewMicroBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeEntityCurrentIndexLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutExerciseAnswerViewerBinding
    public void setEntity(@Nullable ExerciseViewerViewModel exerciseViewerViewModel) {
        this.mEntity = exerciseViewerViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((ExerciseViewerViewModel) obj);
        return true;
    }

    private LayoutExerciseAnswerViewerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ViewMicroBinding) objArr[6]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerMicro);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[1];
        this.mboundView1 = nestedScrollView;
        nestedScrollView.setTag(null);
        RoundButton roundButton = (RoundButton) objArr[2];
        this.mboundView2 = roundButton;
        roundButton.setTag(null);
        RoundButton roundButton2 = (RoundButton) objArr[3];
        this.mboundView3 = roundButton2;
        roundButton2.setTag(null);
        RoundButton roundButton3 = (RoundButton) objArr[4];
        this.mboundView4 = roundButton3;
        roundButton3.setTag(null);
        RoundButton roundButton4 = (RoundButton) objArr[5];
        this.mboundView5 = roundButton4;
        roundButton4.setTag(null);
        setRootTag(view);
        this.mCallback1 = new ViewOnClickListenerC9912a(this, 1);
        this.mCallback2 = new ViewOnClickListenerC9912a(this, 2);
        invalidateAll();
    }
}
