package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentEditNewBindingImpl extends DialogueFragmentEditNewBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f10462g = null;

    /* renamed from: h */
    public static final SparseIntArray f10463h;

    /* renamed from: e */
    public final CardView f10464e;

    /* renamed from: f */
    public long f10465f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10463h = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.et_content, 3);
        sparseIntArray.put(R.id.cv_save, 4);
    }

    public DialogueFragmentEditNewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10462g, f10463h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10465f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10465f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10465f = 1L;
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

    public DialogueFragmentEditNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (EditText) objArr[3], (ImageView) objArr[2], (TextView) objArr[1]);
        this.f10465f = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f10464e = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
