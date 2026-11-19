package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.huiwei.launcher.bean.resp.NoticeBean;
import com.zykj.huiwei.launcher.viewmodels.NotificationViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public class HwFragmentNotificationDetailBindingImpl extends HwFragmentNotificationDetailBinding {

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
        sparseIntArray.put(R.id.title_bar, 4);
        sparseIntArray.put(R.id.web_view, 5);
        sparseIntArray.put(R.id.fl_withdraw_placeholder, 6);
    }

    public HwFragmentNotificationDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmCreateTime(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmCreatorName(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmNoticeDetail(LiveData<NoticeBean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.mDirtyFlags     // Catch: java.lang.Throwable -> L98
            r4 = 0
            r1.mDirtyFlags = r4     // Catch: java.lang.Throwable -> L98
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L98
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r0 = r1.mVm
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            if (r6 == 0) goto L76
            long r14 = r2 & r11
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L3d
            if (r0 == 0) goto L27
            androidx.lifecycle.LiveData r6 = r0.getNoticeDetail()
            goto L28
        L27:
            r6 = r13
        L28:
            r14 = 0
            r1.updateLiveDataRegistration(r14, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.getValue()
            com.zykj.huiwei.launcher.bean.resp.NoticeBean r6 = (com.zykj.huiwei.launcher.bean.resp.NoticeBean) r6
            goto L36
        L35:
            r6 = r13
        L36:
            if (r6 == 0) goto L3d
            java.lang.String r6 = r6.getTitle()
            goto L3e
        L3d:
            r6 = r13
        L3e:
            long r14 = r2 & r9
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L59
            if (r0 == 0) goto L4b
            androidx.lifecycle.MutableLiveData r14 = r0.getCreateTime()
            goto L4c
        L4b:
            r14 = r13
        L4c:
            r15 = 1
            r1.updateLiveDataRegistration(r15, r14)
            if (r14 == 0) goto L59
            java.lang.Object r14 = r14.getValue()
            java.lang.String r14 = (java.lang.String) r14
            goto L5a
        L59:
            r14 = r13
        L5a:
            long r15 = r2 & r7
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L78
            if (r0 == 0) goto L67
            androidx.lifecycle.MutableLiveData r0 = r0.getCreatorName()
            goto L68
        L67:
            r0 = r13
        L68:
            r15 = 2
            r1.updateLiveDataRegistration(r15, r0)
            if (r0 == 0) goto L78
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            goto L78
        L76:
            r6 = r13
            r14 = r6
        L78:
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L82
            android.widget.TextView r0 = r1.tvCreator
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r13)
        L82:
            long r7 = r2 & r9
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L8d
            android.widget.TextView r0 = r1.tvTime
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
        L8d:
            long r2 = r2 & r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L97
            android.widget.TextView r0 = r1.tvTitle
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L97:
            return
        L98:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L98
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwFragmentNotificationDetailBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwFragmentNotificationDetailBindingImpl.smali:410
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
            this.mDirtyFlags = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmNoticeDetail((LiveData) obj, i7);
        }
        if (i6 == 1) {
            return onChangeVmCreateTime((MutableLiveData) obj, i7);
        }
        if (i6 != 2) {
            return false;
        }
        return onChangeVmCreatorName((MutableLiveData) obj, i7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 != i6) {
            return false;
        }
        setVm((NotificationViewModel) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwFragmentNotificationDetailBinding
    public void setVm(@Nullable NotificationViewModel notificationViewModel) {
        this.mVm = notificationViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwFragmentNotificationDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (LinearLayoutCompat) objArr[6], (TitleBar) objArr[4], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1], (WebView) objArr[5]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.tvCreator.setTag(null);
        this.tvTime.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
