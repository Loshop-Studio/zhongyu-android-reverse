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
import androidx.core.view.ViewCompat;

/* renamed from: com.jaredrummler.android.colorpicker.a */
/* loaded from: classes5.dex */
public class C7379a extends BaseAdapter {

    /* renamed from: c */
    public final a f12016c;

    /* renamed from: d */
    public final int[] f12017d;

    /* renamed from: e */
    public int f12018e;

    /* renamed from: f */
    public int f12019f;

    /* renamed from: com.jaredrummler.android.colorpicker.a$a */
    public interface a {
        /* renamed from: a */
        void mo8860a(int i10);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.a$b */
    public final class b {

        /* renamed from: a */
        public View f12020a;

        /* renamed from: b */
        public ColorPanelView f12021b;

        /* renamed from: c */
        public ImageView f12022c;

        /* renamed from: d */
        public int f12023d;

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$a */
        public class a implements View.OnClickListener {

            /* renamed from: c */
            public final /* synthetic */ int f12025c;

            public a(int i10) {
                this.f12025c = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C7379a c7379a = C7379a.this;
                int i10 = c7379a.f12018e;
                int i11 = this.f12025c;
                if (i10 != i11) {
                    c7379a.f12018e = i11;
                    c7379a.notifyDataSetChanged();
                }
                C7379a c7379a2 = C7379a.this;
                c7379a2.f12016c.mo8860a(c7379a2.f12017d[this.f12025c]);
            }
        }

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$b, reason: collision with other inner class name */
        public class ViewOnLongClickListenerC12109b implements View.OnLongClickListener {
            public ViewOnLongClickListenerC12109b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                b.this.f12021b.m8840d();
                return true;
            }
        }

        public b(Context context) {
            View viewInflate = View.inflate(context, C7379a.this.f12019f == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            this.f12020a = viewInflate;
            this.f12021b = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            this.f12022c = (ImageView) this.f12020a.findViewById(R$id.cpv_color_image_view);
            this.f12023d = this.f12021b.getBorderColor();
            this.f12020a.setTag(this);
        }

        /* renamed from: a */
        public final void m8898a(int i10) {
            C7379a c7379a = C7379a.this;
            if (i10 != c7379a.f12018e || ColorUtils.calculateLuminance(c7379a.f12017d[i10]) < 0.65d) {
                this.f12022c.setColorFilter((ColorFilter) null);
            } else {
                this.f12022c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        public final void m8899b(int i10) {
            this.f12021b.setOnClickListener(new a(i10));
            this.f12021b.setOnLongClickListener(new ViewOnLongClickListenerC12109b());
        }

        /* renamed from: c */
        public void m8900c(int i10) {
            int i11 = C7379a.this.f12017d[i10];
            int iAlpha = Color.alpha(i11);
            this.f12021b.setColor(i11);
            this.f12022c.setImageResource(C7379a.this.f12018e == i10 ? R$drawable.cpv_preset_checked : 0);
            if (iAlpha == 255) {
                m8898a(i10);
            } else if (iAlpha <= 165) {
                this.f12021b.setBorderColor(i11 | ViewCompat.MEASURED_STATE_MASK);
                this.f12022c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            } else {
                this.f12021b.setBorderColor(this.f12023d);
                this.f12022c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m8899b(i10);
        }
    }

    public C7379a(a aVar, int[] iArr, int i10, int i11) {
        this.f12016c = aVar;
        this.f12017d = iArr;
        this.f12018e = i10;
        this.f12019f = i11;
    }

    /* renamed from: a */
    public void m8897a() {
        this.f12018e = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f12017d.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return Integer.valueOf(this.f12017d[i10]);
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
            view2 = bVar.f12020a;
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        bVar.m8900c(i10);
        return view2;
    }
}
