package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.policy.p064ui.PolicyCheckView;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.SettingViewModel;

/* loaded from: classes3.dex */
public class FragmentSettingBindingImpl extends FragmentSettingBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.super_switch_net, 7);
        sparseIntArray.put(R$id.super_switch_mode, 8);
        sparseIntArray.put(R$id.super_message, 9);
        sparseIntArray.put(R$id.super_feedback, 10);
        sparseIntArray.put(R$id.super_about, 11);
        sparseIntArray.put(R$id.policyCheckView, 12);
    }

    public FragmentSettingBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeSettingViewModelCacheSize(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeSettingViewModelVersionName(ObservableField<String> observableField, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            long r2 = r1.mDirtyFlags     // Catch: java.lang.Throwable -> Lb7
            r4 = 0
            r1.mDirtyFlags = r4     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = r1.mIsTeacher
            java.lang.String r6 = r1.mTinkerId
            com.zykj.study.viewmodels.SettingViewModel r7 = r1.mSettingViewModel
            boolean r8 = r1.mNeedShowPatch
            r9 = 68
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r10 = 72
            long r10 = r10 & r2
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r11 = 83
            long r11 = r11 & r2
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r12 = 82
            r14 = 81
            r16 = 0
            if (r11 == 0) goto L6c
            long r17 = r2 & r14
            int r11 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r11 == 0) goto L48
            if (r7 == 0) goto L38
            androidx.databinding.ObservableField r11 = r7.m12254a()
        L35:
            r17 = r4
            goto L3b
        L38:
            r11 = r16
            goto L35
        L3b:
            r4 = 0
            r1.updateRegistration(r4, r11)
            if (r11 == 0) goto L4a
            java.lang.Object r4 = r11.get()
            java.lang.String r4 = (java.lang.String) r4
            goto L4c
        L48:
            r17 = r4
        L4a:
            r4 = r16
        L4c:
            long r19 = r2 & r12
            int r5 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r5 == 0) goto L69
            if (r7 == 0) goto L59
            androidx.databinding.ObservableField r5 = r7.m12255b()
            goto L5b
        L59:
            r5 = r16
        L5b:
            r7 = 1
            r1.updateRegistration(r7, r5)
            if (r5 == 0) goto L69
            java.lang.Object r5 = r5.get()
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
        L69:
            r5 = r16
            goto L71
        L6c:
            r17 = r4
            r4 = r16
            r5 = r4
        L71:
            r19 = 96
            long r19 = r2 & r19
            int r7 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r9 == 0) goto L7e
            com.xuexiang.xui.widget.button.roundbutton.RoundButton r9 = r1.btExit
            com.zykj.base.ext.BindingAdaptersKt.visibleOrGone(r9, r0)
        L7e:
            long r14 = r14 & r2
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 == 0) goto L88
            com.xuexiang.xui.widget.textview.supertextview.SuperTextView r0 = r1.superCache
            p086e5.AbstractC8354c.m13604g(r0, r4)
        L88:
            long r2 = r2 & r12
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L92
            com.xuexiang.xui.widget.textview.supertextview.SuperTextView r0 = r1.superVersion
            p086e5.AbstractC8354c.m13604g(r0, r5)
        L92:
            if (r10 == 0) goto L99
            android.widget.TextView r0 = r1.textView5
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L99:
            if (r7 == 0) goto Lb6
            android.widget.TextView r0 = r1.textView5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            com.zykj.base.ext.BindingAdaptersKt.visibleOrGone(r0, r2)
            android.widget.TextView r0 = r1.tvAddHotfix
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            com.zykj.base.ext.BindingAdaptersKt.visibleOrGone(r0, r2)
            android.widget.TextView r0 = r1.tvClearHotfix
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            com.zykj.base.ext.BindingAdaptersKt.visibleOrGone(r0, r2)
        Lb6:
            return
        Lb7:
            r0 = move-exception
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentSettingBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentSettingBindingImpl.smali:446
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
            this.mDirtyFlags = 64L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeSettingViewModelCacheSize((ObservableField) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeSettingViewModelVersionName((ObservableField) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentSettingBinding
    public void setIsTeacher(@Nullable Boolean bool) {
        this.mIsTeacher = bool;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentSettingBinding
    public void setNeedShowPatch(boolean z10) {
        this.mNeedShowPatch = z10;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(35);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentSettingBinding
    public void setSettingViewModel(@Nullable SettingViewModel settingViewModel) {
        this.mSettingViewModel = settingViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(44);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentSettingBinding
    public void setTinkerId(@Nullable String str) {
        this.mTinkerId = str;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(49);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (29 == i10) {
            setIsTeacher((Boolean) obj);
            return true;
        }
        if (49 == i10) {
            setTinkerId((String) obj);
            return true;
        }
        if (44 == i10) {
            setSettingViewModel((SettingViewModel) obj);
            return true;
        }
        if (35 != i10) {
            return false;
        }
        setNeedShowPatch(((Boolean) obj).booleanValue());
        return true;
    }

    private FragmentSettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (RoundButton) objArr[3], (ConstraintLayout) objArr[0], (PolicyCheckView) objArr[12], (SuperTextView) objArr[11], (SuperTextView) objArr[2], (SuperTextView) objArr[10], (SuperTextView) objArr[9], (SuperTextView) objArr[8], (SuperTextView) objArr[7], (SuperTextView) objArr[1], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[5]);
        this.mDirtyFlags = -1L;
        this.btExit.setTag(null);
        this.fragmentSetting.setTag(null);
        this.superCache.setTag(null);
        this.superVersion.setTag(null);
        this.textView5.setTag(null);
        this.tvAddHotfix.setTag(null);
        this.tvClearHotfix.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
