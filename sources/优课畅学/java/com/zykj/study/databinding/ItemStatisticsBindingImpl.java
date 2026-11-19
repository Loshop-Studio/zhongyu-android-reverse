package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.bean.teach.SuperviseGroupMemberProgress;

/* loaded from: classes3.dex */
public class ItemStatisticsBindingImpl extends ItemStatisticsBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    @NonNull
    private final TextView mboundView3;

    @NonNull
    private final TextView mboundView4;

    @NonNull
    private final TextView mboundView5;

    public ItemStatisticsBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c A[PHI: r2
      0x008c: PHI (r2v2 long) = (r2v1 long), (r2v9 long) binds: [B:27:0x0076, B:33:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.databinding.ItemStatisticsBindingImpl.executeBindings():void"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/databinding/ItemStatisticsBindingImpl.smali:182
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
        return false;
    }

    @Override // com.zykj.study.databinding.ItemStatisticsBinding
    public void setEntity(@Nullable SuperviseGroupMemberProgress superviseGroupMemberProgress) {
        this.mEntity = superviseGroupMemberProgress;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemStatisticsBinding
    public void setIsLeaf(boolean z10) {
        this.mIsLeaf = z10;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(27);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((SuperviseGroupMemberProgress) obj);
            return true;
        }
        if (27 != i10) {
            return false;
        }
        setIsLeaf(((Boolean) obj).booleanValue());
        return true;
    }

    private ItemStatisticsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[5];
        this.mboundView5 = textView5;
        textView5.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
