package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import p250m8.C10210a;

/* loaded from: classes5.dex */
public class SimpleGuideBanner extends BaseIndicatorBanner<Object, SimpleGuideBanner> {

    /* renamed from: N */
    public InterfaceC8061c f15471N;

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$a */
    public class ViewOnClickListenerC8059a implements View.OnClickListener {
        public ViewOnClickListenerC8059a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f15471N != null) {
                SimpleGuideBanner.this.f15471N.mo12277a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$b */
    public class ViewOnClickListenerC8060b implements View.OnClickListener {
        public ViewOnClickListenerC8060b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimpleGuideBanner.this.f15471N != null) {
                SimpleGuideBanner.this.f15471N.mo12277a();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner$c */
    public interface InterfaceC8061c {
        /* renamed from: a */
        void mo12277a();
    }

    public SimpleGuideBanner(Context context) {
        super(context);
        m12371M();
    }

    /* renamed from: M */
    public void m12371M() {
        m12396u(true);
        m12395t(false);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    /* renamed from: p */
    public View mo12372p(int i10) {
        View viewInflate = View.inflate(this.f15476d, R$layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.f15173iv);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_start);
        Object obj = this.f15479g.get(i10);
        textView.setVisibility(i10 == 0 ? 0 : 8);
        textView2.setVisibility(i10 == this.f15479g.size() + (-1) ? 0 : 8);
        C10210a.m21347b().mo21348a(imageView, obj);
        textView.setOnClickListener(new ViewOnClickListenerC8059a());
        textView2.setOnClickListener(new ViewOnClickListenerC8060b());
        return viewInflate;
    }

    public void setOnJumpClickListener(InterfaceC8061c interfaceC8061c) {
        this.f15471N = interfaceC8061c;
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12371M();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12371M();
    }
}
