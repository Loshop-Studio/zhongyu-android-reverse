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
/* loaded from: classes4.dex */
public class C6590a extends BaseAdapter {

    /* renamed from: a */
    public final a f5230a;

    /* renamed from: b */
    public final int[] f5231b;

    /* renamed from: c */
    public int f5232c;

    /* renamed from: d */
    public int f5233d;

    /* renamed from: com.jaredrummler.android.colorpicker.a$a */
    public interface a {
        /* renamed from: a */
        void mo4525a(int i9);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.a$b */
    public final class b {

        /* renamed from: a */
        public View f5234a;

        /* renamed from: b */
        public ColorPanelView f5235b;

        /* renamed from: c */
        public ImageView f5236c;

        /* renamed from: d */
        public int f5237d;

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f5239a;

            public a(int i9) {
                this.f5239a = i9;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C6590a c6590a = C6590a.this;
                int i9 = c6590a.f5232c;
                int i10 = this.f5239a;
                if (i9 != i10) {
                    c6590a.f5232c = i10;
                    c6590a.notifyDataSetChanged();
                }
                C6590a c6590a2 = C6590a.this;
                c6590a2.f5230a.mo4525a(c6590a2.f5231b[this.f5239a]);
            }
        }

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$b, reason: collision with other inner class name */
        public class ViewOnLongClickListenerC10054b implements View.OnLongClickListener {
            public ViewOnLongClickListenerC10054b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                b.this.f5235b.m4505d();
                return true;
            }
        }

        public b(Context context) {
            View viewInflate = View.inflate(context, C6590a.this.f5233d == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            this.f5234a = viewInflate;
            this.f5235b = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            this.f5236c = (ImageView) this.f5234a.findViewById(R$id.cpv_color_image_view);
            this.f5237d = this.f5235b.getBorderColor();
            this.f5234a.setTag(this);
        }

        /* renamed from: a */
        public final void m4560a(int i9) {
            C6590a c6590a = C6590a.this;
            if (i9 != c6590a.f5232c || ColorUtils.calculateLuminance(c6590a.f5231b[i9]) < 0.65d) {
                this.f5236c.setColorFilter((ColorFilter) null);
            } else {
                this.f5236c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        public final void m4561b(int i9) {
            this.f5235b.setOnClickListener(new a(i9));
            this.f5235b.setOnLongClickListener(new ViewOnLongClickListenerC10054b());
        }

        /* renamed from: c */
        public void m4562c(int i9) {
            int i10 = C6590a.this.f5231b[i9];
            int iAlpha = Color.alpha(i10);
            this.f5235b.setColor(i10);
            this.f5236c.setImageResource(C6590a.this.f5232c == i9 ? R$drawable.cpv_preset_checked : 0);
            if (iAlpha == 255) {
                m4560a(i9);
            } else if (iAlpha <= 165) {
                this.f5235b.setBorderColor(i10 | ViewCompat.MEASURED_STATE_MASK);
                this.f5236c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            } else {
                this.f5235b.setBorderColor(this.f5237d);
                this.f5236c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m4561b(i9);
        }
    }

    public C6590a(a aVar, int[] iArr, int i9, int i10) {
        this.f5230a = aVar;
        this.f5231b = iArr;
        this.f5232c = i9;
        this.f5233d = i10;
    }

    /* renamed from: a */
    public void m4559a() {
        this.f5232c = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5231b.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        return Integer.valueOf(this.f5231b[i9]);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        if (view == null) {
            bVar = new b(viewGroup.getContext());
            view2 = bVar.f5234a;
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        bVar.m4562c(i9);
        return view2;
    }
}
