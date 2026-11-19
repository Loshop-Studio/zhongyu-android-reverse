package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kunminx.architecture.p031ui.callback.UnPeekLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.base.view.ToastView;

/* loaded from: classes4.dex */
public class HwStateViewBindingImpl extends HwStateViewBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LoadingDialogView mboundView0;

    @NonNull
    private final ToastView mboundView1;

    public HwStateViewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 2, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.mDirtyFlags     // Catch: java.lang.Throwable -> L63
            r2 = 0
            r13.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L63
            com.zykj.base.BaseViewModel r4 = r13.mVm
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            if (r5 == 0) goto L4d
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L31
            if (r4 == 0) goto L23
            com.kunminx.architecture.ui.callback.UnPeekLiveData r5 = r4.isDialogVisible()
            goto L24
        L23:
            r5 = r10
        L24:
            r11 = 0
            r13.updateLiveDataRegistration(r11, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L32
        L31:
            r5 = r10
        L32:
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L4a
            if (r4 == 0) goto L3e
            com.kunminx.architecture.ui.callback.UnPeekLiveData r10 = r4.getToastLiveData()
        L3e:
            r4 = 1
            r13.updateLiveDataRegistration(r4, r10)
            if (r10 == 0) goto L4a
            java.lang.Object r4 = r10.getValue()
            com.zykj.base.bean.toast.ToastMessage r4 = (com.zykj.base.bean.toast.ToastMessage) r4
        L4a:
            r4 = r10
            r10 = r5
            goto L4e
        L4d:
            r4 = r10
        L4e:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L58
            com.zykj.base.view.LoadingDialogView r5 = r13.mboundView0
            com.zykj.base.ext.BindingAdaptersKt.visibleOrGone(r5, r10)
        L58:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L62
            com.zykj.base.view.ToastView r0 = r13.mboundView1
            com.zykj.base.ext.BindingAdaptersKt.bindLiveData(r0, r4)
        L62:
            return
        L63:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L63
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwStateViewBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwStateViewBindingImpl.smali:244
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
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmIsDialogVisible((UnPeekLiveData) obj, i7);
        }
        if (i6 != 1) {
            return false;
        }
        return onChangeVmToastLiveData((UnPeekLiveData) obj, i7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 != i6) {
            return false;
        }
        setVm((BaseViewModel) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwStateViewBinding
    public void setVm(@Nullable BaseViewModel baseViewModel) {
        this.mVm = baseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwStateViewBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 2);
        this.mDirtyFlags = -1L;
        LoadingDialogView loadingDialogView = (LoadingDialogView) objArr[0];
        this.mboundView0 = loadingDialogView;
        loadingDialogView.setTag(null);
        ToastView toastView = (ToastView) objArr[1];
        this.mboundView1 = toastView;
        toastView.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
