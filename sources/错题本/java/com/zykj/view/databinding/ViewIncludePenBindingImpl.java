package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import com.zykj.view.widget.radio.NormalColorRadioButton;

/* loaded from: classes3.dex */
public class ViewIncludePenBindingImpl extends ViewIncludePenBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    @NonNull
    private final NormalColorRadioButton mboundView1;

    @NonNull
    private final NormalColorRadioButton mboundView2;

    @NonNull
    private final NormalColorRadioButton mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.rg_pen_type, 4);
        sparseIntArray.put(C5280R.id.rb_pen_custom, 5);
        sparseIntArray.put(C5280R.id.rb_pen_line, 6);
        sparseIntArray.put(C5280R.id.rb_pen_dotted_line, 7);
        sparseIntArray.put(C5280R.id.rb_pen_highlighter, 8);
        sparseIntArray.put(C5280R.id.rb_pen_cursor, 9);
        sparseIntArray.put(C5280R.id.view_line, 10);
        sparseIntArray.put(C5280R.id.rg_pen_size, 11);
        sparseIntArray.put(C5280R.id.rb_pen_size_little, 12);
        sparseIntArray.put(C5280R.id.rb_pen_size_medium, 13);
        sparseIntArray.put(C5280R.id.rb_pen_size_big, 14);
        sparseIntArray.put(C5280R.id.view_line_2, 15);
        sparseIntArray.put(C5280R.id.rg_pen_color, 16);
        sparseIntArray.put(C5280R.id.rb_custom_color, 17);
    }

    public ViewIncludePenBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if ((j7 & 1) != 0) {
            ExtKt.setCustomColor(this.mboundView1, "#000000");
            ExtKt.setCustomColor(this.mboundView2, "#EEEEEE");
            ExtKt.setCustomColor(this.mboundView3, "#FF4931");
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
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewIncludePenBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomColorRadioButton) objArr[17], (RadioButton) objArr[9], (RadioButton) objArr[5], (RadioButton) objArr[7], (RadioButton) objArr[8], (RadioButton) objArr[6], (RadioButton) objArr[14], (RadioButton) objArr[12], (RadioButton) objArr[13], (RadioGroup) objArr[16], (RadioGroup) objArr[11], (RadioGroup) objArr[4], (View) objArr[10], (View) objArr[15]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        NormalColorRadioButton normalColorRadioButton = (NormalColorRadioButton) objArr[1];
        this.mboundView1 = normalColorRadioButton;
        normalColorRadioButton.setTag("#000000");
        NormalColorRadioButton normalColorRadioButton2 = (NormalColorRadioButton) objArr[2];
        this.mboundView2 = normalColorRadioButton2;
        normalColorRadioButton2.setTag("#EEEEEE");
        NormalColorRadioButton normalColorRadioButton3 = (NormalColorRadioButton) objArr[3];
        this.mboundView3 = normalColorRadioButton3;
        normalColorRadioButton3.setTag("#FF4931");
        setRootTag(view);
        invalidateAll();
    }
}
