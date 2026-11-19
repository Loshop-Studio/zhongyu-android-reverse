package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p048e2.C6267a;
import p168v1.AbstractC7790b;

/* loaded from: classes3.dex */
public class SimpleGuideBanner extends AbstractC7790b {

    /* renamed from: M */
    public InterfaceC5870c f4605M;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC5868a implements View.OnClickListener {
        public ViewOnClickListenerC5868a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f4605M != null) {
                SimpleGuideBanner.this.f4605M.mo4440a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC5869b implements View.OnClickListener {
        public ViewOnClickListenerC5869b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f4605M != null) {
                SimpleGuideBanner.this.f4605M.mo4440a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC5870c {
        /* renamed from: a */
        void mo4440a();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4513N();
    }

    /* renamed from: N */
    public void m4513N() {
        m9351w(true);
        m9350v(false);
    }

    @Override // p168v1.AbstractC7789a
    /* renamed from: r */
    public View mo4514r(int i6) {
        View viewInflate = View.inflate(this.f10309b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f4442iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f10313f.get(i6);
        textView.setVisibility(i6 == 0 ? 0 : 8);
        textView2.setVisibility(i6 == this.f10313f.size() + (-1) ? 0 : 8);
        C6267a.m6397b().mo6398a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC5868a());
        textView2.setOnClickListener(new ViewOnClickListenerC5869b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC5870c interfaceC5870c) {
        this.f4605M = interfaceC5870c;
    }
}
