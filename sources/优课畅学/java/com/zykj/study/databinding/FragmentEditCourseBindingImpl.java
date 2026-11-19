package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.edittext.MultiLineEditText;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.EditCourseViewModel;

/* loaded from: classes3.dex */
public class FragmentEditCourseBindingImpl extends FragmentEditCourseBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private InverseBindingListener editTextandroidTextAttrChanged;
    private long mDirtyFlags;

    @Nullable
    private final LayoutBindViewModelBinding mboundView0;

    @NonNull
    private final TextView mboundView6;
    private InverseBindingListener rbCustomandroidCheckedAttrChanged;
    private InverseBindingListener rbSystemandroidCheckedAttrChanged;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(24);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_bind_view_model"}, new int[]{10}, new int[]{R$layout.layout_bind_view_model});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 11);
        sparseIntArray.put(R$id.textView6, 12);
        sparseIntArray.put(R$id.textView7, 13);
        sparseIntArray.put(R$id.radioGroup, 14);
        sparseIntArray.put(R$id.barrier, 15);
        sparseIntArray.put(R$id.textView8, 16);
        sparseIntArray.put(R$id.textView9, 17);
        sparseIntArray.put(R$id.textView10, 18);
        sparseIntArray.put(R$id.et_desc, 19);
        sparseIntArray.put(R$id.textView11, 20);
        sparseIntArray.put(R$id.textView12, 21);
        sparseIntArray.put(R$id.textView13, 22);
        sparseIntArray.put(R$id.textView14, 23);
    }

    public FragmentEditCourseBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEditCourseViewModelGradeId(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelIsPublic(MutableLiveData<Boolean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelIsSystemCover(ObservableBoolean observableBoolean, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelLocalCover(MutableLiveData<String> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelPeriodId(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelSubjectId(MutableLiveData<Integer> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelTitle(MutableLiveData<String> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeEditCourseViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.FragmentEditCourseBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/FragmentEditCourseBindingImpl.smali:1175
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
            this.mDirtyFlags = 2048L;
        }
        this.mboundView0.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return onChangeEditCourseViewModelLocalCover((MutableLiveData) obj, i11);
            case 1:
                return onChangeEditCourseViewModelIsSystemCover((ObservableBoolean) obj, i11);
            case 2:
                return onChangeEditCourseViewModelSubjectId((MutableLiveData) obj, i11);
            case 3:
                return onChangeEditCourseViewModelToastLiveData((UnPeekLiveData) obj, i11);
            case 4:
                return onChangeEditCourseViewModelIsPublic((MutableLiveData) obj, i11);
            case 5:
                return onChangeEditCourseViewModelGradeId((MutableLiveData) obj, i11);
            case 6:
                return onChangeEditCourseViewModelTitle((MutableLiveData) obj, i11);
            case 7:
                return onChangeEditCourseViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
            case 8:
                return onChangeEditCourseViewModelPeriodId((MutableLiveData) obj, i11);
            default:
                return false;
        }
    }

    @Override // com.zykj.study.databinding.FragmentEditCourseBinding
    public void setDictViewModel(@Nullable DictViewModel dictViewModel) {
        this.mDictViewModel = dictViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1024;
        }
        notifyPropertyChanged(11);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentEditCourseBinding
    public void setEditCourseViewModel(@Nullable EditCourseViewModel editCourseViewModel) {
        this.mEditCourseViewModel = editCourseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        notifyPropertyChanged(12);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.mboundView0.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (12 == i10) {
            setEditCourseViewModel((EditCourseViewModel) obj);
            return true;
        }
        if (11 != i10) {
            return false;
        }
        setDictViewModel((DictViewModel) obj);
        return true;
    }

    private FragmentEditCourseBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 9, (Barrier) objArr[15], (EditText) objArr[7], (MultiLineEditText) objArr[19], (LinearLayout) objArr[0], (ImageView) objArr[5], (RadioGroup) objArr[14], (RadioButton) objArr[2], (RadioButton) objArr[1], (RecyclerView) objArr[3], (RelativeLayout) objArr[4], (SuperTextView) objArr[8], (SuperTextView) objArr[9], (TextView) objArr[18], (TextView) objArr[20], (TextView) objArr[21], (TextView) objArr[22], (TextView) objArr[23], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[16], (TextView) objArr[17], (Toolbar) objArr[11]);
        this.editTextandroidTextAttrChanged = new InverseBindingListener() { // from class: com.zykj.study.databinding.FragmentEditCourseBindingImpl.1
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                MutableLiveData mutableLiveDataM12094l;
                String textString = TextViewBindingAdapter.getTextString(FragmentEditCourseBindingImpl.this.editText);
                EditCourseViewModel editCourseViewModel = FragmentEditCourseBindingImpl.this.mEditCourseViewModel;
                if (editCourseViewModel == null || (mutableLiveDataM12094l = editCourseViewModel.m12094l()) == null) {
                    return;
                }
                mutableLiveDataM12094l.setValue(textString);
            }
        };
        this.rbCustomandroidCheckedAttrChanged = new InverseBindingListener() { // from class: com.zykj.study.databinding.FragmentEditCourseBindingImpl.2
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                ObservableBoolean observableBooleanM12097o;
                boolean zIsChecked = FragmentEditCourseBindingImpl.this.rbCustom.isChecked();
                EditCourseViewModel editCourseViewModel = FragmentEditCourseBindingImpl.this.mEditCourseViewModel;
                if (editCourseViewModel == null || (observableBooleanM12097o = editCourseViewModel.m12097o()) == null) {
                    return;
                }
                observableBooleanM12097o.set(!zIsChecked);
            }
        };
        this.rbSystemandroidCheckedAttrChanged = new InverseBindingListener() { // from class: com.zykj.study.databinding.FragmentEditCourseBindingImpl.3
            @Override // androidx.databinding.InverseBindingListener
            public void onChange() {
                ObservableBoolean observableBooleanM12097o;
                boolean zIsChecked = FragmentEditCourseBindingImpl.this.rbSystem.isChecked();
                EditCourseViewModel editCourseViewModel = FragmentEditCourseBindingImpl.this.mEditCourseViewModel;
                if (editCourseViewModel == null || (observableBooleanM12097o = editCourseViewModel.m12097o()) == null) {
                    return;
                }
                observableBooleanM12097o.set(zIsChecked);
            }
        };
        this.mDirtyFlags = -1L;
        this.editText.setTag(null);
        this.fragmentEditCourse.setTag(null);
        this.ivCover.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[10];
        this.mboundView0 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        TextView textView = (TextView) objArr[6];
        this.mboundView6 = textView;
        textView.setTag(null);
        this.rbCustom.setTag(null);
        this.rbSystem.setTag(null);
        this.recycleViewSys.setTag(null);
        this.rlCustomCover.setTag(null);
        this.svCatalog.setTag(null);
        this.svPublic.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
