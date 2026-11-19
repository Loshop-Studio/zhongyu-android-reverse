package com.zykj.evaluation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public class FragmentDatePickerBindingImpl extends FragmentDatePickerBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f8735k = null;

    /* renamed from: l */
    public static final SparseIntArray f8736l;

    /* renamed from: j */
    public long f8737j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8736l = sparseIntArray;
        sparseIntArray.put(R.id.dialog_bg, 1);
        sparseIntArray.put(R.id.mcv_start_date, 2);
        sparseIntArray.put(R.id.tv_start_time, 3);
        sparseIntArray.put(R.id.divider, 4);
        sparseIntArray.put(R.id.mcv_end_date, 5);
        sparseIntArray.put(R.id.tv_end_time, 6);
        sparseIntArray.put(R.id.tv_reset, 7);
        sparseIntArray.put(R.id.tv_confirm, 8);
    }

    public FragmentDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f8735k, f8736l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8737j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8737j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8737j = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public FragmentDatePickerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[1], (View) objArr[4], (MaterialCalendarView) objArr[5], (MaterialCalendarView) objArr[2], (RelativeLayout) objArr[0], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[3]);
        this.f8737j = -1L;
        this.f8730e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
