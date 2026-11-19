package com.zykj.huiwei.launcher.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.p035ui.view.BubbleProgressView;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public class HwDialogAppUpdateBindingImpl extends HwDialogAppUpdateBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final ConstraintLayout mboundView1;

    @Nullable
    private final HwStateViewBinding mboundView11;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(13);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"hw_state_view"}, new int[]{11}, new int[]{R.layout.hw_state_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.ivIcon, 12);
    }

    public HwDialogAppUpdateBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmCancel(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeVmConfirm(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeVmContent(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmIsShowCancel(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeVmIsShowClose(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeVmIsShowConfirm(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmIsShowContent(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmIsShowProgress(MutableLiveData<Boolean> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeVmProgress(MutableLiveData<Float> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmTitle(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmVersion(MutableLiveData<String> mutableLiveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0167  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwDialogAppUpdateBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBindingImpl.smali:1049
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
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        this.mboundView11.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        switch (i6) {
            case 0:
                return onChangeVmTitle((MutableLiveData) obj, i7);
            case 1:
                return onChangeVmIsShowConfirm((MutableLiveData) obj, i7);
            case 2:
                return onChangeVmIsShowContent((MutableLiveData) obj, i7);
            case 3:
                return onChangeVmVersion((MutableLiveData) obj, i7);
            case 4:
                return onChangeVmProgress((MutableLiveData) obj, i7);
            case 5:
                return onChangeVmContent((MutableLiveData) obj, i7);
            case 6:
                return onChangeVmCancel((MutableLiveData) obj, i7);
            case 7:
                return onChangeVmIsShowProgress((MutableLiveData) obj, i7);
            case 8:
                return onChangeVmConfirm((MutableLiveData) obj, i7);
            case 9:
                return onChangeVmIsShowClose((MutableLiveData) obj, i7);
            case 10:
                return onChangeVmIsShowCancel((MutableLiveData) obj, i7);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogAppUpdateBinding
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((AppUpdateViewModel) obj);
            return true;
        }
        if (6 != i6) {
            return false;
        }
        setOnClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogAppUpdateBinding
    public void setVm(@Nullable AppUpdateViewModel appUpdateViewModel) {
        this.mVm = appUpdateViewModel;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwDialogAppUpdateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 11, (BubbleProgressView) objArr[6], (View) objArr[7], (AppCompatImageView) objArr[3], (ImageView) objArr[12], (View) objArr[9], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[5], (TextView) objArr[2], (AppCompatTextView) objArr[4]);
        this.mDirtyFlags = -1L;
        this.bubbleProgress.setTag(null);
        this.divider.setTag(null);
        this.ivClose.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag(null);
        HwStateViewBinding hwStateViewBinding = (HwStateViewBinding) objArr[11];
        this.mboundView11 = hwStateViewBinding;
        setContainedBinding(hwStateViewBinding);
        this.spacer.setTag(null);
        this.tvCancel.setTag(null);
        this.tvConfirm.setTag(null);
        this.tvContent.setTag(null);
        this.tvTitle.setTag(null);
        this.tvVersion.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
