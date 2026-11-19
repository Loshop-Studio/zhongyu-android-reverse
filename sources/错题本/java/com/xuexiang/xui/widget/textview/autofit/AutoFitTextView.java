package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import p157s3.C6556c;
import p157s3.InterfaceC6555b;

/* loaded from: classes3.dex */
public class AutoFitTextView extends AppCompatTextView implements InterfaceC6555b {

    /* renamed from: b */
    public final C6556c f5024b;

    public AutoFitTextView(Context context) {
        this(context, null);
    }

    public C6556c getAutofitHelper() {
        return this.f5024b;
    }

    public float getMaxTextSize() {
        return this.f5024b.f10951f;
    }

    public float getMinTextSize() {
        return this.f5024b.f10950e;
    }

    public float getPrecision() {
        return this.f5024b.f10952g;
    }

    public void setEnableFit(boolean z8) {
        this.f5024b.m6198d(z8);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        super.setLines(i);
        C6556c c6556c = this.f5024b;
        if (c6556c == null || c6556c.f10949d == i) {
            return;
        }
        c6556c.f10949d = i;
        c6556c.m6197a();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C6556c c6556c = this.f5024b;
        if (c6556c == null || c6556c.f10949d == i) {
            return;
        }
        c6556c.f10949d = i;
        c6556c.m6197a();
    }

    public void setMaxTextSize(float f) {
        C6556c c6556c = this.f5024b;
        Context context = c6556c.f10946a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(2, f, system.getDisplayMetrics());
        if (fApplyDimension != c6556c.f10951f) {
            c6556c.f10951f = fApplyDimension;
            c6556c.m6197a();
        }
    }

    public void setMinTextSize(int i) {
        this.f5024b.m6199e(i, 2);
    }

    public void setPrecision(float f) {
        C6556c c6556c = this.f5024b;
        if (c6556c.f10952g != f) {
            c6556c.f10952g = f;
            c6556c.m6197a();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C6556c c6556c = this.f5024b;
        if (c6556c == null || c6556c.f10954i) {
            return;
        }
        Context context = c6556c.f10946a.getContext();
        Resources system = Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f, system.getDisplayMetrics());
        if (c6556c.f10948c != fApplyDimension) {
            c6556c.f10948c = fApplyDimension;
        }
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6556c c6556cM6195b = C6556c.m6195b(this, attributeSet, 0);
        if (c6556cM6195b.f10955j == null) {
            c6556cM6195b.f10955j = new ArrayList();
        }
        c6556cM6195b.f10955j.add(this);
        this.f5024b = c6556cM6195b;
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6556c c6556cM6195b = C6556c.m6195b(this, attributeSet, i);
        if (c6556cM6195b.f10955j == null) {
            c6556cM6195b.f10955j = new ArrayList();
        }
        c6556cM6195b.f10955j.add(this);
        this.f5024b = c6556cM6195b;
    }
}
