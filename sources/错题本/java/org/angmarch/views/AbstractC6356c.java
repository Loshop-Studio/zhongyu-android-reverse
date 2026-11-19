package org.angmarch.views;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import io.reactivex.internal.operators.observable.C5707c;
import p009a8.C0026d;
import p009a8.InterfaceC0028f;

/* renamed from: org.angmarch.views.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6356c extends BaseAdapter {

    /* renamed from: a */
    public final PopUpTextAlignment f10388a;

    /* renamed from: b */
    public final InterfaceC0028f f10389b;

    /* renamed from: c */
    public final int f10390c;

    /* renamed from: d */
    public final int f10391d;

    /* renamed from: e */
    public int f10392e;

    public AbstractC6356c(int i, int i8, InterfaceC0028f interfaceC0028f, PopUpTextAlignment popUpTextAlignment) {
        this.f10389b = interfaceC0028f;
        this.f10391d = i8;
        this.f10390c = i;
        this.f10388a = popUpTextAlignment;
    }

    /* renamed from: a */
    public abstract Object mo6023a(int i);

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = View.inflate(context, R$layout.spinner_list_item, null);
            textView = (TextView) view.findViewById(R$id.text_view_spinner);
            textView.setBackground(ContextCompat.getDrawable(context, this.f10391d));
            C0026d c0026d = new C0026d();
            c0026d.f67a = textView;
            view.setTag(c0026d);
        } else {
            textView = ((C0026d) view.getTag()).f67a;
        }
        Object item = getItem(i);
        ((C5707c) this.f10389b).getClass();
        textView.setText(new SpannableString(item.toString()));
        textView.setTextColor(this.f10390c);
        int i8 = AbstractC6355b.f10387a[this.f10388a.ordinal()];
        if (i8 == 1) {
            textView.setGravity(GravityCompat.START);
            return view;
        }
        if (i8 == 2) {
            textView.setGravity(GravityCompat.END);
            return view;
        }
        if (i8 != 3) {
            return view;
        }
        textView.setGravity(1);
        return view;
    }
}
