package org.angmarch.views;

import android.content.Context;
import java.util.List;
import p182n9.InterfaceC8677d;

/* renamed from: org.angmarch.views.a */
/* loaded from: classes5.dex */
public class C8781a extends AbstractC8783c {

    /* renamed from: f */
    public final List f14903f;

    public C8781a(Context context, List list, int i10, int i11, InterfaceC8677d interfaceC8677d, PopUpTextAlignment popUpTextAlignment) {
        super(context, i10, i11, interfaceC8677d, popUpTextAlignment);
        this.f14903f = list;
    }

    @Override // org.angmarch.views.AbstractC8783c
    /* renamed from: a */
    public Object mo14672a(int i10) {
        return this.f14903f.get(i10);
    }

    @Override // org.angmarch.views.AbstractC8783c, android.widget.Adapter
    public int getCount() {
        return this.f14903f.size() - 1;
    }

    @Override // org.angmarch.views.AbstractC8783c, android.widget.Adapter
    public Object getItem(int i10) {
        return i10 >= this.f14909e ? this.f14903f.get(i10 + 1) : this.f14903f.get(i10);
    }
}
