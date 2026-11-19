package org.angmarch.views;

import android.content.Context;
import android.widget.ListAdapter;
import p182n9.InterfaceC8677d;

/* renamed from: org.angmarch.views.b */
/* loaded from: classes5.dex */
public class C8782b extends AbstractC8783c {

    /* renamed from: f */
    public final ListAdapter f14904f;

    public C8782b(Context context, ListAdapter listAdapter, int i10, int i11, InterfaceC8677d interfaceC8677d, PopUpTextAlignment popUpTextAlignment) {
        super(context, i10, i11, interfaceC8677d, popUpTextAlignment);
        this.f14904f = listAdapter;
    }

    @Override // org.angmarch.views.AbstractC8783c
    /* renamed from: a */
    public Object mo14672a(int i10) {
        return this.f14904f.getItem(i10);
    }

    @Override // org.angmarch.views.AbstractC8783c, android.widget.Adapter
    public int getCount() {
        return this.f14904f.getCount() - 1;
    }

    @Override // org.angmarch.views.AbstractC8783c, android.widget.Adapter
    public Object getItem(int i10) {
        ListAdapter listAdapter = this.f14904f;
        if (i10 >= this.f14909e) {
            i10++;
        }
        return listAdapter.getItem(i10);
    }
}
