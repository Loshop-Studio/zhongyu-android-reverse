package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p064d3.C7287a;
import p252u2.AbstractC9537b;

/* loaded from: classes4.dex */
public class SimpleGuideBanner extends AbstractC9537b {

    /* renamed from: M */
    public InterfaceC6492c f5881M;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC6490a implements View.OnClickListener {
        public ViewOnClickListenerC6490a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f5881M != null) {
                SimpleGuideBanner.this.f5881M.mo5430a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC6491b implements View.OnClickListener {
        public ViewOnClickListenerC6491b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f5881M != null) {
                SimpleGuideBanner.this.f5881M.mo5430a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC6492c {
        /* renamed from: a */
        void mo5430a();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5503N();
    }

    /* renamed from: N */
    public void m5503N() {
        m15962w(true);
        m15961v(false);
    }

    @Override // p252u2.AbstractC9536a
    /* renamed from: r */
    public View mo5504r(int i10) {
        View viewInflate = View.inflate(this.f16699b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f5721iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f16703f.get(i10);
        textView.setVisibility(i10 == 0 ? 0 : 8);
        textView2.setVisibility(i10 == this.f16703f.size() + (-1) ? 0 : 8);
        C7287a.m11574b().mo11575a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC6490a());
        textView2.setOnClickListener(new ViewOnClickListenerC6491b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC6492c interfaceC6492c) {
        this.f5881M = interfaceC6492c;
    }
}
