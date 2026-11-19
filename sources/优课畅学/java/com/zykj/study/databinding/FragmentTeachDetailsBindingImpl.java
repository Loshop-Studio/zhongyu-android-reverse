package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.viewmodels.TeachDetailsViewModel;

/* loaded from: classes3.dex */
public class FragmentTeachDetailsBindingImpl extends FragmentTeachDetailsBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{4}, new int[]{R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 5);
        sparseIntArray.put(R$id.multiple_status_view, 6);
        sparseIntArray.put(R$id.viewPager, 7);
    }

    public FragmentTeachDetailsBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelCurrentMemberProgressLiveData(MutableLiveData<GroupMemberProgress> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelIsMenuPopupShow(MutableLiveData<Boolean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelSelectFragmentIndex(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentTeachDetailsBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentTeachDetailsBindingImpl.smali:606
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.mboundView0.hasPendingBindings();
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
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeViewModelIsMenuPopupShow((MutableLiveData) obj, i11);
        }
        if (i10 == 1) {
            return onChangeViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewModelSelectFragmentIndex((MutableLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return onChangeViewModelCurrentMemberProgressLiveData((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((TeachDetailsViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentTeachDetailsBinding
    public void setViewModel(@Nullable TeachDetailsViewModel teachDetailsViewModel) {
        this.mViewModel = teachDetailsViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentTeachDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ConstraintLayout) objArr[0], (ImageView) objArr[2], (ImageView) objArr[3], (MultipleStatusView) objArr[6], (TitleBar) objArr[5], (TextView) objArr[1], (ViewPager2) objArr[7]);
        this.mDirtyFlags = -1L;
        this.fragmentTeachDetails.setTag(null);
        this.imageView16.setTag(null);
        this.imageView17.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[4];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        this.tvCourseProgress.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
