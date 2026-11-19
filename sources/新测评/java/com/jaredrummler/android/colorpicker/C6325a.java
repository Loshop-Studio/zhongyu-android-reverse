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
/* loaded from: classes.dex */
public class C6325a extends BaseAdapter {

    /* renamed from: a */
    public final a f4639a;

    /* renamed from: b */
    public final int[] f4640b;

    /* renamed from: c */
    public int f4641c;

    /* renamed from: d */
    public int f4642d;

    /* renamed from: com.jaredrummler.android.colorpicker.a$a */
    public interface a {
        /* renamed from: a */
        void mo4331a(int i10);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.a$b */
    public final class b {

        /* renamed from: a */
        public View f4643a;

        /* renamed from: b */
        public ColorPanelView f4644b;

        /* renamed from: c */
        public ImageView f4645c;

        /* renamed from: d */
        public int f4646d;

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$a */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            public final /* synthetic */ int f4648a;

            public a(int i10) {
                this.f4648a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C6325a c6325a = C6325a.this;
                int i10 = c6325a.f4641c;
                int i11 = this.f4648a;
                if (i10 != i11) {
                    c6325a.f4641c = i11;
                    c6325a.notifyDataSetChanged();
                }
                C6325a c6325a2 = C6325a.this;
                c6325a2.f4639a.mo4331a(c6325a2.f4640b[this.f4648a]);
            }
        }

        /* renamed from: com.jaredrummler.android.colorpicker.a$b$b, reason: collision with other inner class name */
        public class ViewOnLongClickListenerC10132b implements View.OnLongClickListener {
            public ViewOnLongClickListenerC10132b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                b.this.f4644b.m4311d();
                return true;
            }
        }

        public b(Context context) {
            View viewInflate = View.inflate(context, C6325a.this.f4642d == 0 ? R$layout.cpv_color_item_square : R$layout.cpv_color_item_circle, null);
            this.f4643a = viewInflate;
            this.f4644b = (ColorPanelView) viewInflate.findViewById(R$id.cpv_color_panel_view);
            this.f4645c = (ImageView) this.f4643a.findViewById(R$id.cpv_color_image_view);
            this.f4646d = this.f4644b.getBorderColor();
            this.f4643a.setTag(this);
        }

        /* renamed from: a */
        public final void m4366a(int i10) {
            C6325a c6325a = C6325a.this;
            if (i10 != c6325a.f4641c || ColorUtils.calculateLuminance(c6325a.f4640b[i10]) < 0.65d) {
                this.f4645c.setColorFilter((ColorFilter) null);
            } else {
                this.f4645c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        public final void m4367b(int i10) {
            this.f4644b.setOnClickListener(new a(i10));
            this.f4644b.setOnLongClickListener(new ViewOnLongClickListenerC10132b());
        }

        /* renamed from: c */
        public void m4368c(int i10) {
            int i11 = C6325a.this.f4640b[i10];
            int iAlpha = Color.alpha(i11);
            this.f4644b.setColor(i11);
            this.f4645c.setImageResource(C6325a.this.f4641c == i10 ? R$drawable.cpv_preset_checked : 0);
            if (iAlpha == 255) {
                m4366a(i10);
            } else if (iAlpha <= 165) {
                this.f4644b.setBorderColor(i11 | ViewCompat.MEASURED_STATE_MASK);
                this.f4645c.setColorFilter(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.SRC_IN);
            } else {
                this.f4644b.setBorderColor(this.f4646d);
                this.f4645c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m4367b(i10);
        }
    }

    public C6325a(a aVar, int[] iArr, int i10, int i11) {
        this.f4639a = aVar;
        this.f4640b = iArr;
        this.f4641c = i10;
        this.f4642d = i11;
    }

    /* renamed from: a */
    public void m4365a() {
        this.f4641c = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4640b.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return Integer.valueOf(this.f4640b[i10]);
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
            view2 = bVar.f4643a;
        } else {
            view2 = view;
            bVar = (b) view.getTag();
        }
        bVar.m4368c(i10);
        return view2;
    }
}
