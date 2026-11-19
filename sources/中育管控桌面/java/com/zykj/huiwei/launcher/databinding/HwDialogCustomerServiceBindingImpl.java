package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.bean.resp.SchoolSettingResp;
import com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public class HwDialogCustomerServiceBindingImpl extends HwDialogCustomerServiceBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.llContent, 6);
    }

    public HwDialogCustomerServiceBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmSchoolSetting(MutableLiveData<SchoolSettingResp> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.mDirtyFlags     // Catch: java.lang.Throwable -> L75
            r2 = 0
            r12.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L75
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L75
            com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel r4 = r12.mVm
            android.view.View$OnClickListener r5 = r12.mOnClickListener
            r6 = 11
            long r6 = r6 & r0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r7 = 0
            if (r6 == 0) goto L39
            if (r4 == 0) goto L1b
            androidx.lifecycle.MutableLiveData r4 = r4.getSchoolSetting()
            goto L1c
        L1b:
            r4 = r7
        L1c:
            r8 = 0
            r12.updateLiveDataRegistration(r8, r4)
            if (r4 == 0) goto L29
            java.lang.Object r4 = r4.getValue()
            com.zykj.huiwei.launcher.bean.resp.SchoolSettingResp r4 = (com.zykj.huiwei.launcher.bean.resp.SchoolSettingResp) r4
            goto L2a
        L29:
            r4 = r7
        L2a:
            if (r4 == 0) goto L39
            java.lang.String r7 = r4.getWechat()
            java.lang.String r8 = r4.getEmailAddress()
            java.lang.String r4 = r4.getMobile()
            goto L3b
        L39:
            r4 = r7
            r8 = r4
        L3b:
            r9 = 12
            long r9 = r9 & r0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r10 = 8
            long r0 = r0 & r10
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L57
            androidx.appcompat.widget.AppCompatImageView r0 = r12.ivClose
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131167747(0x7f070a03, float:1.7949776E38)
            float r1 = r1.getDimension(r2)
            p078i4.AbstractC6538h.m7318a(r0, r1)
        L57:
            if (r9 == 0) goto L63
            androidx.appcompat.widget.AppCompatImageView r0 = r12.ivClose
            p078i4.AbstractC6538h.m7324g(r0, r5)
            android.widget.TextView r0 = r12.tvTitle
            p078i4.AbstractC6538h.m7324g(r0, r5)
        L63:
            if (r6 == 0) goto L74
            androidx.appcompat.widget.AppCompatTextView r0 = r12.tvCustomerChat
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.tvCustomerEmail
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            androidx.appcompat.widget.AppCompatTextView r0 = r12.tvCustomerMobile
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L74:
            return
        L75:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L75
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwDialogCustomerServiceBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwDialogCustomerServiceBindingImpl.smali:268
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
        if (i6 != 0) {
            return false;
        }
        return onChangeVmSchoolSetting((MutableLiveData) obj, i7);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogCustomerServiceBinding
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((CustomerServiceViewModel) obj);
            return true;
        }
        if (6 != i6) {
            return false;
        }
        setOnClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogCustomerServiceBinding
    public void setVm(@Nullable CustomerServiceViewModel customerServiceViewModel) {
        this.mVm = customerServiceViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwDialogCustomerServiceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (AppCompatImageView) objArr[2], (LinearLayout) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.ivClose.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        this.tvCustomerChat.setTag(null);
        this.tvCustomerEmail.setTag(null);
        this.tvCustomerMobile.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
