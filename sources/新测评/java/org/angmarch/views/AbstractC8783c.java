package org.angmarch.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import p182n9.InterfaceC8677d;

/* renamed from: org.angmarch.views.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8783c extends BaseAdapter {

    /* renamed from: a */
    public final PopUpTextAlignment f14905a;

    /* renamed from: b */
    public final InterfaceC8677d f14906b;

    /* renamed from: c */
    public int f14907c;

    /* renamed from: d */
    public int f14908d;

    /* renamed from: e */
    public int f14909e;

    /* renamed from: org.angmarch.views.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14910a;

        static {
            int[] iArr = new int[PopUpTextAlignment.values().length];
            f14910a = iArr;
            try {
                iArr[PopUpTextAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14910a[PopUpTextAlignment.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14910a[PopUpTextAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.angmarch.views.c$b */
    public static class b {

        /* renamed from: a */
        public TextView f14911a;

        public b(TextView textView) {
            this.f14911a = textView;
        }
    }

    public AbstractC8783c(Context context, int i10, int i11, InterfaceC8677d interfaceC8677d, PopUpTextAlignment popUpTextAlignment) {
        this.f14906b = interfaceC8677d;
        this.f14908d = i11;
        this.f14907c = i10;
        this.f14905a = popUpTextAlignment;
    }

    /* renamed from: a */
    public abstract Object mo14672a(int i10);

    /* renamed from: b */
    public void m14673b(int i10) {
        this.f14909e = i10;
    }

    /* renamed from: c */
    public final void m14674c(TextView textView) {
        int i10 = a.f14910a[this.f14905a.ordinal()];
        if (i10 == 1) {
            textView.setGravity(GravityCompat.START);
        } else if (i10 == 2) {
            textView.setGravity(GravityCompat.END);
        } else {
            if (i10 != 3) {
                return;
            }
            textView.setGravity(1);
        }
    }

    @Override // android.widget.Adapter
    public abstract int getCount();

    @Override // android.widget.Adapter
    public abstract Object getItem(int i10);

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = View.inflate(context, R$layout.spinner_list_item, null);
            textView = (TextView) view.findViewById(R$id.text_view_spinner);
            textView.setBackground(ContextCompat.getDrawable(context, this.f14908d));
            view.setTag(new b(textView));
        } else {
            textView = ((b) view.getTag()).f14911a;
        }
        textView.setText(this.f14906b.mo14279a(getItem(i10)));
        textView.setTextColor(this.f14907c);
        m14674c(textView);
        return view;
    }
}
