package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p033c2.C5230a;
import p239s1.AbstractC9969b;

/* loaded from: classes4.dex */
public class SimpleGuideBanner extends AbstractC9969b {

    /* renamed from: M */
    public InterfaceC6891c f7206M;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC6889a implements View.OnClickListener {
        public ViewOnClickListenerC6889a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f7206M != null) {
                SimpleGuideBanner.this.f7206M.mo6551a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC6890b implements View.OnClickListener {
        public ViewOnClickListenerC6890b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f7206M != null) {
                SimpleGuideBanner.this.f7206M.mo6551a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC6891c {
        /* renamed from: a */
        void mo6551a();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6624N();
    }

    /* renamed from: N */
    public void m6624N() {
        m18641w(true);
        m18640v(false);
    }

    @Override // p239s1.AbstractC9968a
    /* renamed from: r */
    public View mo6625r(int i10) {
        View viewInflate = View.inflate(this.f19966b, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f7040iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f19970f.get(i10);
        textView.setVisibility(i10 == 0 ? 0 : 8);
        textView2.setVisibility(i10 == this.f19970f.size() + (-1) ? 0 : 8);
        C5230a.m2134b().mo2135a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC6889a());
        textView2.setOnClickListener(new ViewOnClickListenerC6890b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC6891c interfaceC6891c) {
        this.f7206M = interfaceC6891c;
    }
}
