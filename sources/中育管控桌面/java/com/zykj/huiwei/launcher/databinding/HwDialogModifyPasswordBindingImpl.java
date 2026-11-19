package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.viewmodels.ModifyPasswordViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public class HwDialogModifyPasswordBindingImpl extends HwDialogModifyPasswordBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener etNewPass1androidTextAttrChanged;
    private InverseBindingListener etNewPassandroidTextAttrChanged;
    private InverseBindingListener etOldPassandroidTextAttrChanged;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final ConstraintLayout mboundView1;

    @Nullable
    private final HwStateViewBinding mboundView11;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"hw_state_view"}, new int[]{10}, new int[]{R.layout.hw_state_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvOldPassTitle, 11);
        sparseIntArray.put(R.id.tvNewPassTitle, 12);
        sparseIntArray.put(R.id.tvNewPassTitle1, 13);
    }

    public HwDialogModifyPasswordBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmDoubleNewPassTips(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmDoubleNewPasswordLiveData(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmIsBtnEnable(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmNewPassTips(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmNewPasswordLiveData(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmOldPasswordLiveData(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwDialogModifyPasswordBindingImpl.smali:792
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
            this.mDirtyFlags = 256L;
        }
        this.mboundView11.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmDoubleNewPassTips((MutableLiveData) obj, i7);
        }
        if (i6 == 1) {
            return onChangeVmIsBtnEnable((MutableLiveData) obj, i7);
        }
        if (i6 == 2) {
            return onChangeVmNewPasswordLiveData((MutableLiveData) obj, i7);
        }
        if (i6 == 3) {
            return onChangeVmDoubleNewPasswordLiveData((MutableLiveData) obj, i7);
        }
        if (i6 == 4) {
            return onChangeVmNewPassTips((MutableLiveData) obj, i7);
        }
        if (i6 != 5) {
            return false;
        }
        return onChangeVmOldPasswordLiveData((MutableLiveData) obj, i7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBinding
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((ModifyPasswordViewModel) obj);
            return true;
        }
        if (6 != i6) {
            return false;
        }
        setOnClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBinding
    public void setVm(@Nullable ModifyPasswordViewModel modifyPasswordViewModel) {
        this.mVm = modifyPasswordViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwDialogModifyPasswordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (AppCompatEditText) objArr[5], (AppCompatEditText) objArr[7], (AppCompatEditText) objArr[4], (AppCompatImageView) objArr[3], (TextView) objArr[9], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[11], (TextView) objArr[2]);
        this.etNewPassandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData newPasswordLiveData;
                String textString = TextViewBindingAdapter.getTextString(HwDialogModifyPasswordBindingImpl.this.etNewPass);
                ModifyPasswordViewModel modifyPasswordViewModel = HwDialogModifyPasswordBindingImpl.this.mVm;
                if (modifyPasswordViewModel == null || (newPasswordLiveData = modifyPasswordViewModel.getNewPasswordLiveData()) == null) {
                    return;
                }
                newPasswordLiveData.setValue(textString);
            }
        };
        this.etNewPass1androidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData doubleNewPasswordLiveData;
                String textString = TextViewBindingAdapter.getTextString(HwDialogModifyPasswordBindingImpl.this.etNewPass1);
                ModifyPasswordViewModel modifyPasswordViewModel = HwDialogModifyPasswordBindingImpl.this.mVm;
                if (modifyPasswordViewModel == null || (doubleNewPasswordLiveData = modifyPasswordViewModel.getDoubleNewPasswordLiveData()) == null) {
                    return;
                }
                doubleNewPasswordLiveData.setValue(textString);
            }
        };
        this.etOldPassandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwDialogModifyPasswordBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData oldPasswordLiveData;
                String textString = TextViewBindingAdapter.getTextString(HwDialogModifyPasswordBindingImpl.this.etOldPass);
                ModifyPasswordViewModel modifyPasswordViewModel = HwDialogModifyPasswordBindingImpl.this.mVm;
                if (modifyPasswordViewModel == null || (oldPasswordLiveData = modifyPasswordViewModel.getOldPasswordLiveData()) == null) {
                    return;
                }
                oldPasswordLiveData.setValue(textString);
            }
        };
        this.mDirtyFlags = -1L;
        this.etNewPass.setTag(null);
        this.etNewPass1.setTag(null);
        this.etOldPass.setTag(null);
        this.ivClose.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
        HwStateViewBinding hwStateViewBinding = (HwStateViewBinding) objArr[10];
        this.mboundView11 = hwStateViewBinding;
        setContainedBinding(hwStateViewBinding);
        this.tvModify.setTag(null);
        this.tvNewPassTips.setTag(null);
        this.tvNewPassTips1.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
