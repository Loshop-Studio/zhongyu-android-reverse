package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.widget.textview.autofit.C8298a;

/* loaded from: classes5.dex */
public class AutoFitTextView extends AppCompatTextView implements C8298a.d {

    /* renamed from: d */
    public C8298a f17282d;

    public AutoFitTextView(Context context) {
        this(context, null);
    }

    @Override // com.xuexiang.xui.widget.textview.autofit.C8298a.d
    /* renamed from: b */
    public void mo13525b(float f10, float f11) {
    }

    /* renamed from: c */
    public final void m13526c(AttributeSet attributeSet, int i10) {
        this.f17282d = C8298a.m13530f(this, attributeSet, i10).m13534b(this);
    }

    public C8298a getAutofitHelper() {
        return this.f17282d;
    }

    public float getMaxTextSize() {
        return this.f17282d.m13536j();
    }

    public float getMinTextSize() {
        return this.f17282d.m13537k();
    }

    public float getPrecision() {
        return this.f17282d.m13538l();
    }

    public void setEnableFit(boolean z10) {
        this.f17282d.m13540n(z10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        super.setLines(i10);
        C8298a c8298a = this.f17282d;
        if (c8298a != null) {
            c8298a.m13541o(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        super.setMaxLines(i10);
        C8298a c8298a = this.f17282d;
        if (c8298a != null) {
            c8298a.m13541o(i10);
        }
    }

    public void setMaxTextSize(float f10) {
        this.f17282d.m13542p(f10);
    }

    public void setMinTextSize(int i10) {
        this.f17282d.m13544r(2, i10);
    }

    public void setPrecision(float f10) {
        this.f17282d.m13545s(f10);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        C8298a c8298a = this.f17282d;
        if (c8298a != null) {
            c8298a.m13549w(i10, f10);
        }
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13526c(attributeSet, 0);
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13526c(attributeSet, i10);
    }
}
