package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.viewmodels.LoginViewModel;
import com.zykj.manage.R;
import com.zykj.policy.p037ui.PolicyCheckView;

/* loaded from: classes4.dex */
public class HwFragmentLoginBindingImpl extends HwFragmentLoginBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener etPasswordandroidTextAttrChanged;
    private InverseBindingListener etSchoolCodeandroidTextAttrChanged;
    private InverseBindingListener etUsernameandroidTextAttrChanged;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final ConstraintLayout mboundView1;

    @Nullable
    private final HwStateViewBinding mboundView11;
    private InverseBindingListener policyCheckViewandroidCheckedAttrChanged;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"hw_state_view"}, new int[]{8}, new int[]{R.layout.hw_state_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.f7365bg, 9);
        sparseIntArray.put(R.id.ivLogo, 10);
        sparseIntArray.put(R.id.tvLogin, 11);
        sparseIntArray.put(R.id.tvVersion, 12);
    }

    public HwFragmentLoginBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmIsPolicyChecked(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmPassword(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmSchoolCode(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmShowLogin(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmUserName(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwFragmentLoginBindingImpl.smali:734
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
            this.mDirtyFlags = 64L;
        }
        this.mboundView11.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmIsPolicyChecked((MutableLiveData) obj, i7);
        }
        if (i6 == 1) {
            return onChangeVmShowLogin((MutableLiveData) obj, i7);
        }
        if (i6 == 2) {
            return onChangeVmUserName((MutableLiveData) obj, i7);
        }
        if (i6 == 3) {
            return onChangeVmPassword((MutableLiveData) obj, i7);
        }
        if (i6 != 4) {
            return false;
        }
        return onChangeVmSchoolCode((MutableLiveData) obj, i7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 != i6) {
            return false;
        }
        setVm((LoginViewModel) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentLoginBinding
    public void setVm(@Nullable LoginViewModel loginViewModel) {
        this.mVm = loginViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwFragmentLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (View) objArr[9], (AppCompatEditText) objArr[4], (AppCompatEditText) objArr[2], (AppCompatEditText) objArr[3], (AppCompatImageView) objArr[10], (PolicyCheckView) objArr[5], (AppCompatTextView) objArr[11], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[12]);
        this.etPasswordandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM6124j;
                String textString = TextViewBindingAdapter.getTextString(HwFragmentLoginBindingImpl.this.etPassword);
                LoginViewModel loginViewModel = HwFragmentLoginBindingImpl.this.mVm;
                if (loginViewModel == null || (mutableLiveDataM6124j = loginViewModel.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_PASSWORD java.lang.String()) == null) {
                    return;
                }
                mutableLiveDataM6124j.setValue(textString);
            }
        };
        this.etSchoolCodeandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM6125k;
                String textString = TextViewBindingAdapter.getTextString(HwFragmentLoginBindingImpl.this.etSchoolCode);
                LoginViewModel loginViewModel = HwFragmentLoginBindingImpl.this.mVm;
                if (loginViewModel == null || (mutableLiveDataM6125k = loginViewModel.getSchoolCode()) == null) {
                    return;
                }
                mutableLiveDataM6125k.setValue(textString);
            }
        };
        this.etUsernameandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM6132r;
                String textString = TextViewBindingAdapter.getTextString(HwFragmentLoginBindingImpl.this.etUsername);
                LoginViewModel loginViewModel = HwFragmentLoginBindingImpl.this.mVm;
                if (loginViewModel == null || (mutableLiveDataM6132r = loginViewModel.getUserName()) == null) {
                    return;
                }
                mutableLiveDataM6132r.setValue(textString);
            }
        };
        this.policyCheckViewandroidCheckedAttrChanged = new InverseBindingListener() { // from class: com.zykj.huiwei.launcher.databinding.HwFragmentLoginBindingImpl.4
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM6135u;
                boolean zIsChecked = HwFragmentLoginBindingImpl.this.policyCheckView.isChecked();
                LoginViewModel loginViewModel = HwFragmentLoginBindingImpl.this.mVm;
                if (loginViewModel == null || (mutableLiveDataM6135u = loginViewModel.getIsPolicyChecked()) == null) {
                    return;
                }
                mutableLiveDataM6135u.setValue(Boolean.valueOf(zIsChecked));
            }
        };
        this.mDirtyFlags = -1L;
        this.etPassword.setTag(null);
        this.etSchoolCode.setTag(null);
        this.etUsername.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
        HwStateViewBinding hwStateViewBinding = (HwStateViewBinding) objArr[8];
        this.mboundView11 = hwStateViewBinding;
        setContainedBinding(hwStateViewBinding);
        this.policyCheckView.setTag(null);
        this.tvNet.setTag(null);
        this.tvUpdateTime.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
