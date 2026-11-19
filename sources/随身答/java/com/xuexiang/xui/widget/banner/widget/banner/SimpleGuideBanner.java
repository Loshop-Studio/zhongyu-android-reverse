package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p155k3.AbstractC8269b;
import p251t3.C9613a;

/* loaded from: classes4.dex */
public class SimpleGuideBanner extends AbstractC8269b {

    /* renamed from: L */
    public InterfaceC6811c f7136L;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC6809a implements View.OnClickListener {
        public ViewOnClickListenerC6809a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f7136L != null) {
                SimpleGuideBanner.this.f7136L.mo6526a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC6810b implements View.OnClickListener {
        public ViewOnClickListenerC6810b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f7136L != null) {
                SimpleGuideBanner.this.f7136L.mo6526a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC6811c {
        /* renamed from: a */
        void mo6526a();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6599K();
    }

    /* renamed from: K */
    public void m6599K() {
        m13358t(true);
        m13357s(false);
    }

    @Override // p155k3.AbstractC8268a
    /* renamed from: o */
    public View mo6600o(int i9) {
        View viewInflate = View.inflate(this.f14381b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f6978iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f14384e.get(i9);
        textView.setVisibility(i9 == 0 ? 0 : 8);
        textView2.setVisibility(i9 == this.f14384e.size() + (-1) ? 0 : 8);
        C9613a.m15905b().mo172a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC6809a());
        textView2.setOnClickListener(new ViewOnClickListenerC6810b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC6811c interfaceC6811c) {
        this.f7136L = interfaceC6811c;
    }
}
