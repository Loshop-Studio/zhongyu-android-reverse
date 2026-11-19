package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueDialogDeleteBindingImpl extends DialogueDialogDeleteBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f10402g = null;

    /* renamed from: h */
    public static final SparseIntArray f10403h;

    /* renamed from: e */
    public final CardView f10404e;

    /* renamed from: f */
    public long f10405f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10403h = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.tv_content, 2);
        sparseIntArray.put(R.id.tv_cancel, 3);
        sparseIntArray.put(R.id.tv_ok, 4);
    }

    public DialogueDialogDeleteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10402g, f10403h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10405f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10405f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10405f = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueDialogDeleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[1]);
        this.f10405f = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f10404e = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
