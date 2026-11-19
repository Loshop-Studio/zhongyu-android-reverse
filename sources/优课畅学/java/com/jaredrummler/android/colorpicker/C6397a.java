package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;

/* renamed from: com.jaredrummler.android.colorpicker.a */
/* loaded from: classes4.dex */
public class C6397a extends BaseAdapter {

    /* renamed from: a */
    public final a f4202a;

    /* renamed from: b */
    public final int[] f4203b;

    /* renamed from: c */
    public int f4204c;

    /* renamed from: d */
    public int f4205d;

    /* renamed from: com.jaredrummler.android.colorpicker.a$a */
    public interface a {
        /* renamed from: a */
        void mo3943a(int i10);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.a$b */
    public final class b {

        /* renamed from: a */
        public View f4206a;

        /* renamed from: b */
        public ColorPanelView f4207b;

        /* renamed from: c */
        public ImageView f4208c;

        /* renamed from: d */
        public int f4209d;

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f4211a;

            public a(int i10) {
                this.f4211a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C6397a c6397a = C6397a.this;
                int i10 = c6397a.f4204c;
                int i11 = this.f4211a;
                if (i10 != i11) {
                    c6397a.f4204c = i11;
                    c6397a.notifyDataSetChanged();
                }
                C6397a c6397a2 = C6397a.this;
                c6397a2.f4202a.mo3943a(c6397a2.f4203b[this.f4211a]);
            }
        }

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$b, reason: collision with other inner class name */
        public class ViewOnLongClickListenerC10789b implements View.OnLongClickListener {
            public ViewOnLongClickListenerC10789b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                b.this.f4207b.m3923d();
                return true;
            }
        }

        public b(Context context) {
            View viewInflate = View.inflate(context, C6397a.this.f4205d == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            this.f4206a = viewInflate;
            this.f4207b = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            this.f4208c = (ImageView) this.f4206a.findViewById(R$id.cpv_color_image_view);
            this.f4209d = this.f4207b.getBorderColor();
            this.f4206a.setTag(this);
        }

        /* renamed from: a */
        public final void m3978a(int i10) {
            C6397a c6397a = C6397a.this;
            if (i10 != c6397a.f4204c || ColorUtils.calculateLuminance(c6397a.f4203b[i10]) < 0.65d) {
                this.f4208c.setColorFilter((ColorFilter) null);
            } else {
                this.f4208c.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        public final void m3979b(int i10) {
            this.f4207b.setOnClickListener(new a(i10));
            this.f4207b.setOnLongClickListener(new ViewOnLongClickListenerC10789b());
        }

        /* renamed from: c */
        public void m3980c(int i10) {
            int i11 = C6397a.this.f4203b[i10];
            int iAlpha = Color.alpha(i11);
            this.f4207b.setColor(i11);
            this.f4208c.setImageResource(C6397a.this.f4204c == i10 ? R$drawable.cpv_preset_checked : 0);
            if (iAlpha == 255) {
                m3978a(i10);
            } else if (iAlpha <= 165) {
                this.f4207b.setBorderColor(i11 | (-16777216));
                this.f4208c.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            } else {
                this.f4207b.setBorderColor(this.f4209d);
                this.f4208c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m3979b(i10);
        }
    }

    public C6397a(a aVar, int[] iArr, int i10, int i11) {
        this.f4202a = aVar;
        this.f4203b = iArr;
        this.f4204c = i10;
        this.f4205d = i11;
    }

    /* renamed from: a */
    public void m3977a() {
        this.f4204c = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4203b.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return Integer.valueOf(this.f4203b[i10]);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b(viewGroup.getContext());
            view2 = bVar.f4206a;
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        bVar.m3980c(i10);
        return view2;
    }
}
