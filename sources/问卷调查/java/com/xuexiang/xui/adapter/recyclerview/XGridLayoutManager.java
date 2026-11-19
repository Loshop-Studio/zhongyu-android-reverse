package com.xuexiang.xui.adapter.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class XGridLayoutManager extends GridLayoutManager {

    /* renamed from: O */
    public boolean f5093O;

    public XGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5093O = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e */
    public boolean mo1784e() {
        return this.f5093O && super.mo1784e();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: f */
    public boolean mo1786f() {
        return this.f5093O && super.mo1786f();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w0 */
    public void mo1761w0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        try {
            super.mo1761w0(c0544r, c0549w);
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }
    }
}
