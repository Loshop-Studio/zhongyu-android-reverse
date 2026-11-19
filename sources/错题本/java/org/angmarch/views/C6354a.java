package org.angmarch.views;

import android.widget.ListAdapter;
import java.util.List;
import p009a8.InterfaceC0028f;

/* renamed from: org.angmarch.views.a */
/* loaded from: classes4.dex */
public final class C6354a extends AbstractC6356c {

    /* renamed from: f */
    public final /* synthetic */ int f10385f;

    /* renamed from: g */
    public final Object f10386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6354a(Object obj, int i, int i8, InterfaceC0028f interfaceC0028f, PopUpTextAlignment popUpTextAlignment, int i9) {
        super(i, i8, interfaceC0028f, popUpTextAlignment);
        this.f10385f = i9;
        this.f10386g = obj;
    }

    @Override // org.angmarch.views.AbstractC6356c
    /* renamed from: a */
    public final Object mo6023a(int i) {
        switch (this.f10385f) {
            case 0:
                return ((List) this.f10386g).get(i);
            default:
                return ((ListAdapter) this.f10386g).getItem(i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        switch (this.f10385f) {
            case 0:
                size = ((List) this.f10386g).size();
                break;
            default:
                size = ((ListAdapter) this.f10386g).getCount();
                break;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.f10385f) {
            case 0:
                List list = (List) this.f10386g;
                return i >= this.f10392e ? list.get(i + 1) : list.get(i);
            default:
                ListAdapter listAdapter = (ListAdapter) this.f10386g;
                if (i >= this.f10392e) {
                    i++;
                }
                return listAdapter.getItem(i);
        }
    }
}
