package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0082o;
import p235l6.AbstractC10150d;

/* loaded from: classes5.dex */
public class TitleBar extends RelativeLayout implements View.OnClickListener {

    /* renamed from: c */
    public RelativeLayout f12659c;

    /* renamed from: d */
    public ImageView f12660d;

    /* renamed from: e */
    public ImageView f12661e;

    /* renamed from: f */
    public ImageView f12662f;

    /* renamed from: g */
    public MarqueeTextView f12663g;

    /* renamed from: h */
    public TextView f12664h;

    /* renamed from: i */
    public View f12665i;

    /* renamed from: j */
    public View f12666j;

    /* renamed from: k */
    public PictureSelectionConfig f12667k;

    /* renamed from: l */
    public View f12668l;

    /* renamed from: m */
    public RelativeLayout f12669m;

    /* renamed from: n */
    public C7513a f12670n;

    /* renamed from: com.luck.picture.lib.widget.TitleBar$a */
    public static class C7513a {
        /* renamed from: a */
        public abstract void mo9003a();

        /* renamed from: b */
        public void mo9004b(View view) {
        }

        /* renamed from: c */
        public void mo9005c() {
        }
    }

    public TitleBar(Context context) {
        super(context);
        m9647c();
    }

    /* renamed from: a */
    public void m9645a() {
    }

    /* renamed from: b */
    public void m9646b() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_title_bar, this);
    }

    /* renamed from: c */
    public void m9647c() {
        Context context;
        int i10;
        m9646b();
        setClickable(true);
        setFocusable(true);
        this.f12667k = PictureSelectionConfig.m9328c();
        this.f12668l = findViewById(R$id.top_status_bar);
        this.f12669m = (RelativeLayout) findViewById(R$id.rl_title_bar);
        this.f12660d = (ImageView) findViewById(R$id.ps_iv_left_back);
        this.f12659c = (RelativeLayout) findViewById(R$id.ps_rl_album_bg);
        this.f12662f = (ImageView) findViewById(R$id.ps_iv_delete);
        this.f12666j = findViewById(R$id.ps_rl_album_click);
        this.f12663g = (MarqueeTextView) findViewById(R$id.ps_tv_title);
        this.f12661e = (ImageView) findViewById(R$id.ps_iv_arrow);
        this.f12664h = (TextView) findViewById(R$id.ps_tv_cancel);
        this.f12665i = findViewById(R$id.title_bar_line);
        this.f12660d.setOnClickListener(this);
        this.f12664h.setOnClickListener(this);
        this.f12659c.setOnClickListener(this);
        this.f12669m.setOnClickListener(this);
        this.f12666j.setOnClickListener(this);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        m9645a();
        if (!TextUtils.isEmpty(this.f12667k.f12346h0)) {
            setTitle(this.f12667k.f12346h0);
            return;
        }
        if (this.f12667k.f12337c == AbstractC10150d.m21191b()) {
            context = getContext();
            i10 = R$string.ps_all_audio;
        } else {
            context = getContext();
            i10 = R$string.ps_camera_roll;
        }
        setTitle(context.getString(i10));
    }

    /* renamed from: d */
    public void mo9622d() {
        if (this.f12667k.f12320L) {
            this.f12668l.getLayoutParams().height = AbstractC0072e.m168h(getContext());
        }
        TitleBarStyle titleBarStyleM26628d = PictureSelectionConfig.f12295P0.m26628d();
        int iM9560i = titleBarStyleM26628d.m9560i();
        if (AbstractC0082o.m227b(iM9560i)) {
            this.f12669m.getLayoutParams().height = iM9560i;
        } else {
            this.f12669m.getLayoutParams().height = AbstractC0072e.m161a(getContext(), 48.0f);
        }
        if (this.f12665i != null) {
            if (titleBarStyleM26628d.m9571t()) {
                this.f12665i.setVisibility(0);
                if (AbstractC0082o.m228c(titleBarStyleM26628d.m9561j())) {
                    this.f12665i.setBackgroundColor(titleBarStyleM26628d.m9561j());
                }
            } else {
                this.f12665i.setVisibility(8);
            }
        }
        int iM9559h = titleBarStyleM26628d.m9559h();
        if (AbstractC0082o.m228c(iM9559h)) {
            setBackgroundColor(iM9559h);
        }
        int iM9568q = titleBarStyleM26628d.m9568q();
        if (AbstractC0082o.m228c(iM9568q)) {
            this.f12660d.setImageResource(iM9568q);
        }
        String strM9566o = titleBarStyleM26628d.m9566o();
        if (AbstractC0082o.m231f(strM9566o)) {
            this.f12663g.setText(strM9566o);
        }
        int iM9570s = titleBarStyleM26628d.m9570s();
        if (AbstractC0082o.m227b(iM9570s)) {
            this.f12663g.setTextSize(iM9570s);
        }
        int iM9569r = titleBarStyleM26628d.m9569r();
        if (AbstractC0082o.m228c(iM9569r)) {
            this.f12663g.setTextColor(iM9569r);
        }
        if (this.f12667k.f12370t0) {
            this.f12661e.setImageResource(R$drawable.ps_ic_trans_1px);
        } else {
            int iM9567p = titleBarStyleM26628d.m9567p();
            if (AbstractC0082o.m228c(iM9567p)) {
                this.f12661e.setImageResource(iM9567p);
            }
        }
        int iM9558g = titleBarStyleM26628d.m9558g();
        if (AbstractC0082o.m228c(iM9558g)) {
            this.f12659c.setBackgroundResource(iM9558g);
        }
        if (titleBarStyleM26628d.m9572u()) {
            this.f12664h.setVisibility(8);
        } else {
            this.f12664h.setVisibility(0);
            int iM9562k = titleBarStyleM26628d.m9562k();
            if (AbstractC0082o.m228c(iM9562k)) {
                this.f12664h.setBackgroundResource(iM9562k);
            }
            String strM9563l = titleBarStyleM26628d.m9563l();
            if (AbstractC0082o.m231f(strM9563l)) {
                this.f12664h.setText(strM9563l);
            }
            int iM9564m = titleBarStyleM26628d.m9564m();
            if (AbstractC0082o.m228c(iM9564m)) {
                this.f12664h.setTextColor(iM9564m);
            }
            int iM9565n = titleBarStyleM26628d.m9565n();
            if (AbstractC0082o.m227b(iM9565n)) {
                this.f12664h.setTextSize(iM9565n);
            }
        }
        int iM9555a = titleBarStyleM26628d.m9555a();
        if (AbstractC0082o.m228c(iM9555a)) {
            this.f12662f.setBackgroundResource(iM9555a);
        } else {
            this.f12662f.setBackgroundResource(R$drawable.ps_ic_delete);
        }
    }

    public ImageView getImageArrow() {
        return this.f12661e;
    }

    public ImageView getImageDelete() {
        return this.f12662f;
    }

    public View getTitleBarLine() {
        return this.f12665i;
    }

    public TextView getTitleCancelView() {
        return this.f12664h;
    }

    public String getTitleText() {
        return this.f12663g.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C7513a c7513a;
        int id2 = view.getId();
        if (id2 == R$id.ps_iv_left_back || id2 == R$id.ps_tv_cancel) {
            C7513a c7513a2 = this.f12670n;
            if (c7513a2 != null) {
                c7513a2.mo9003a();
                return;
            }
            return;
        }
        if (id2 == R$id.ps_rl_album_bg || id2 == R$id.ps_rl_album_click) {
            C7513a c7513a3 = this.f12670n;
            if (c7513a3 != null) {
                c7513a3.mo9004b(this);
                return;
            }
            return;
        }
        if (id2 != R$id.rl_title_bar || (c7513a = this.f12670n) == null) {
            return;
        }
        c7513a.mo9005c();
    }

    public void setOnTitleBarListener(C7513a c7513a) {
        this.f12670n = c7513a;
    }

    public void setTitle(String str) {
        this.f12663g.setText(str);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9647c();
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m9647c();
    }
}
