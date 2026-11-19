package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.MyTeachCourseViewModel;

/* loaded from: classes3.dex */
public class FragmentTeacherBindingImpl extends FragmentTeacherBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{1}, new int[]{R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.btn_create, 2);
        sparseIntArray.put(R$id.sf_course, 3);
        sparseIntArray.put(R$id.ms_course, 4);
        sparseIntArray.put(R$id.rv_course, 5);
    }

    public FragmentTeacherBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEntityToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
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
            long r0 = r13.mDirtyFlags     // Catch: java.lang.Throwable -> L68
            r2 = 0
            r13.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L68
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L68
            com.zykj.study.viewmodels.MyTeachCourseViewModel r4 = r13.mEntity
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
            com.zykj.study.databinding.LayoutBindViewModelBinding r5 = r13.mboundView0
            r5.setIsDialogVisible(r10)
        L58:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L62
            com.zykj.study.databinding.LayoutBindViewModelBinding r0 = r13.mboundView0
            r0.setToastLiveData(r4)
        L62:
            com.zykj.study.databinding.LayoutBindViewModelBinding r0 = r13.mboundView0
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L68:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L68
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentTeacherBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentTeacherBindingImpl.smali:397
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
            this.mDirtyFlags = 8L;
        }
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeEntityIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeEntityToastLiveData((UnPeekLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentTeacherBinding
    public void setEntity(@Nullable MyTeachCourseViewModel myTeachCourseViewModel) {
        this.mEntity = myTeachCourseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((MyTeachCourseViewModel) obj);
        return true;
    }

    private FragmentTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (TextView) objArr[2], (RelativeLayout) objArr[0], (MultipleStatusView) objArr[4], (SwipeRecyclerView) objArr[5], (SwipeRefreshLayout) objArr[3]);
        this.mDirtyFlags = -1L;
        this.fragmentTeacher.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[1];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        setRootTag(view);
        invalidateAll();
    }
}
