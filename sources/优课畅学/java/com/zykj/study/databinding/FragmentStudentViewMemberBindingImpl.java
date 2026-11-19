package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.StudentViewViewModel;

/* loaded from: classes3.dex */
public class FragmentStudentViewMemberBindingImpl extends FragmentStudentViewMemberBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener etSearchandroidTextAttrChanged;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.recycler_search, 5);
    }

    public FragmentStudentViewMemberBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeViewModelSearchKey(MutableLiveData<String> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        boolean zIsEmpty;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        StudentViewViewModel studentViewViewModel = this.mViewModel;
        long j11 = 7 & j10;
        boolean zIsEmpty2 = false;
        if (j11 != 0) {
            MutableLiveData mutableLiveDataM12271f = studentViewViewModel != null ? studentViewViewModel.m12271f() : null;
            updateLiveDataRegistration(0, mutableLiveDataM12271f);
            str = mutableLiveDataM12271f != null ? (String) mutableLiveDataM12271f.getValue() : null;
            if (str != null) {
                zIsEmpty2 = str.isEmpty();
                zIsEmpty = str.isEmpty();
            } else {
                zIsEmpty = false;
            }
            z11 = !zIsEmpty2;
            boolean z12 = zIsEmpty;
            z10 = zIsEmpty2;
            zIsEmpty2 = z12;
        } else {
            z10 = false;
            z11 = false;
            str = null;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.btnCreate, Boolean.valueOf(zIsEmpty2));
            TextViewBindingAdapter.setText(this.etSearch, str);
            BindingAdaptersKt.visibleOrGone(this.multipleStatusView, Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.recycler, Boolean.valueOf(z10));
        }
        if ((j10 & 4) != 0) {
            TextViewBindingAdapter.setTextWatcher(this.etSearch, null, null, null, this.etSearchandroidTextAttrChanged);
        }
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
        return onChangeViewModelSearchKey((MutableLiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((StudentViewViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentStudentViewMemberBinding
    public void setViewModel(@Nullable StudentViewViewModel studentViewViewModel) {
        this.mViewModel = studentViewViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentStudentViewMemberBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (RoundButton) objArr[2], (ClearEditText) objArr[1], (LinearLayout) objArr[0], (MultipleStatusView) objArr[4], (RecyclerView) objArr[3], (RecyclerView) objArr[5]);
        this.etSearchandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.study.databinding.FragmentStudentViewMemberBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM12271f;
                String textString = TextViewBindingAdapter.getTextString(FragmentStudentViewMemberBindingImpl.this.etSearch);
                StudentViewViewModel studentViewViewModel = FragmentStudentViewMemberBindingImpl.this.mViewModel;
                if (studentViewViewModel == null || (mutableLiveDataM12271f = studentViewViewModel.m12271f()) == null) {
                    return;
                }
                mutableLiveDataM12271f.setValue(textString);
            }
        };
        this.mDirtyFlags = -1L;
        this.btnCreate.setTag(null);
        this.etSearch.setTag(null);
        this.fragmentStudentViewMember.setTag(null);
        this.multipleStatusView.setTag(null);
        this.recycler.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
