package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p103o0.AbstractC4421b;
import p127u0.C4602a;

/* loaded from: classes2.dex */
public class SimpleGuideBanner extends AbstractC4421b {

    /* renamed from: L */
    public InterfaceC3541c f3221L;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC3539a implements View.OnClickListener {
        public ViewOnClickListenerC3539a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f3221L != null) {
                SimpleGuideBanner.this.f3221L.mo4116a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC3540b implements View.OnClickListener {
        public ViewOnClickListenerC3540b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f3221L != null) {
                SimpleGuideBanner.this.f3221L.mo4116a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC3541c {
        /* renamed from: a */
        void mo4116a();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4189K();
    }

    /* renamed from: K */
    public void m4189K() {
        m5545t(true);
        m5544s(false);
    }

    @Override // p103o0.AbstractC4420a
    /* renamed from: o */
    public View mo4190o(int i4) {
        View viewInflate = View.inflate(this.f4982b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f3064iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f4985e.get(i4);
        textView.setVisibility(i4 == 0 ? 0 : 8);
        textView2.setVisibility(i4 != this.f4985e.size() + (-1) ? 8 : 0);
        C4602a.m6344b().mo1504a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC3539a());
        textView2.setOnClickListener(new ViewOnClickListenerC3540b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC3541c interfaceC3541c) {
        this.f3221L = interfaceC3541c;
    }
}
