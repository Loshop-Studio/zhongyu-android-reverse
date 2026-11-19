package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.SearchViewModel;

/* loaded from: classes3.dex */
public class FragmentSearchBindingImpl extends FragmentSearchBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener etSearchandroidTextAttrChanged;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.tv_cancel, 2);
        sparseIntArray.put(R$id.fragment_container, 3);
    }

    public FragmentSearchBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private boolean onChangeSearchViewModelSearchField(MutableLiveData<String> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            r8.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            com.zykj.study.viewmodels.SearchViewModel r4 = r8.mSearchViewModel
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L19
            androidx.lifecycle.MutableLiveData r4 = r4.m12249f()
            goto L1a
        L19:
            r4 = r6
        L1a:
            r7 = 0
            r8.updateLiveDataRegistration(r7, r4)
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            goto L28
        L27:
            r4 = r6
        L28:
            if (r5 == 0) goto L2f
            com.xuexiang.xui.widget.edittext.ClearEditText r5 = r8.etSearch
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r5, r4)
        L2f:
            r4 = 4
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3d
            com.xuexiang.xui.widget.edittext.ClearEditText r0 = r8.etSearch
            androidx.databinding.InverseBindingListener r1 = r8.etSearchandroidTextAttrChanged
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r0, r6, r6, r6, r1)
        L3d:
            return
        L3e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentSearchBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentSearchBindingImpl.smali:240
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeSearchViewModelSearchField((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentSearchBinding
    public void setSearchViewModel(@Nullable SearchViewModel searchViewModel) {
        this.mSearchViewModel = searchViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(43);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (43 != i10) {
            return false;
        }
        setSearchViewModel((SearchViewModel) obj);
        return true;
    }

    private FragmentSearchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ClearEditText) objArr[1], (FrameLayout) objArr[3], (ConstraintLayout) objArr[0], (TextView) objArr[2]);
        this.etSearchandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.study.databinding.FragmentSearchBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM12249f;
                String textString = TextViewBindingAdapter.getTextString(FragmentSearchBindingImpl.this.etSearch);
                SearchViewModel searchViewModel = FragmentSearchBindingImpl.this.mSearchViewModel;
                if (searchViewModel == null || (mutableLiveDataM12249f = searchViewModel.m12249f()) == null) {
                    return;
                }
                mutableLiveDataM12249f.setValue(textString);
            }
        };
        this.mDirtyFlags = -1L;
        this.etSearch.setTag(null);
        this.fragmentSearch.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
