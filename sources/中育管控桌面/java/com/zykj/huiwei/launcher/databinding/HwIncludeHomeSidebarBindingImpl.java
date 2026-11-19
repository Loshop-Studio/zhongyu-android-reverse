package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.p035ui.view.MenuItemView;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.proto.C6069g;
import com.zykj.huiwei.launcher.proto.C6075m;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.manage.R;
import com.zykj.policy.p037ui.PolicyCheckView;

/* loaded from: classes4.dex */
public class HwIncludeHomeSidebarBindingImpl extends HwIncludeHomeSidebarBinding {

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
        sparseIntArray.put(R.id.llMenu1, 13);
        sparseIntArray.put(R.id.llMenu2, 14);
        sparseIntArray.put(R.id.tvPolicy, 15);
    }

    public HwIncludeHomeSidebarBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private boolean onChangeMainViewModelDeviceId(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmStudentInfo(LiveData<C6069g> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmUnReadMessageCount(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmUnReadNoticeCount(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmUserCacheBean(LiveData<C6075m> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmVersionName(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwIncludeHomeSidebarBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBindingImpl.smali:721
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
            this.mDirtyFlags = 512L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 == 0) {
            return onChangeVmUnReadMessageCount((LiveData) obj, i7);
        }
        if (i6 == 1) {
            return onChangeVmStudentInfo((LiveData) obj, i7);
        }
        if (i6 == 2) {
            return onChangeMainViewModelDeviceId((MutableLiveData) obj, i7);
        }
        if (i6 == 3) {
            return onChangeVmUnReadNoticeCount((LiveData) obj, i7);
        }
        if (i6 == 4) {
            return onChangeVmVersionName((LiveData) obj, i7);
        }
        if (i6 != 5) {
            return false;
        }
        return onChangeVmUserCacheBean((LiveData) obj, i7);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeSidebarBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeSidebarBinding
    public void setMainViewModel(@Nullable MainViewModel mainViewModel) {
        this.mMainViewModel = mainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((HomeViewModel) obj);
            return true;
        }
        if (4 == i6) {
            setMainViewModel((MainViewModel) obj);
            return true;
        }
        if (2 != i6) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeSidebarBinding
    public void setVm(@Nullable HomeViewModel homeViewModel) {
        this.mVm = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwIncludeHomeSidebarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 6, (AppCompatImageView) objArr[1], (LinearLayout) objArr[13], (LinearLayout) objArr[14], (MenuItemView) objArr[8], (MenuItemView) objArr[7], (MenuItemView) objArr[12], (MenuItemView) objArr[11], (MenuItemView) objArr[10], (MenuItemView) objArr[6], (MenuItemView) objArr[9], (MenuItemView) objArr[5], (TextView) objArr[4], (NoPaddingTextView) objArr[2], (PolicyCheckView) objArr[15], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.ivAvatar.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.menuCheckUpdate.setTag(null);
        this.menuDeviceNo.setTag(null);
        this.menuExit.setTag(null);
        this.menuModifyGesture.setTag(null);
        this.menuModifyPassword.setTag(null);
        this.menuSchoolNotice.setTag(null);
        this.menuService.setTag(null);
        this.menuSystemMsg.setTag(null);
        this.tvClass.setTag(null);
        this.tvName.setTag(null);
        this.tvStudyNo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
